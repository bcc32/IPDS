// Aaron Zeng 20120511
// Chapter 07 Exercise 25

import java.util.*;
import java.io.*;

public class c7n25a
{
    static boolean[][] board;
    static boolean[][] queen;

    public static void main( String[] args )
    {
        board = new boolean[8][8];
        queen = new boolean[8][8];

        boolean fail = false;

        for ( int i = 0; i < 8 && !fail; i++ )
        {
            fail = true;
            for ( int j = 0; j < 8; j++ )
                if ( !board[i][j] )
                {
                    move( i, j );
                    queen[i][j] = true;
                    fail = false;
                }
        }
        for ( int i = 0; i < 8; i++ )
        {
            for ( int j = 0; j < 8; j++ )
                System.out.print( queen[i][j] ? '*' : '.' );
            System.out.println();
        }
    }

    public static void move( int foo, int bar )
    {
        for ( int i = 0; i < 8; i++ )
            board[i][bar] = true;
        for ( int j = 0; j < 8; j++ )
            board[foo][j] = true;
        for ( int i = 1; foo + i < 8 && bar + i < 8; i++ )
            board[foo + i][bar + i] = true;
        for ( int i = 1; foo - i >= 0 && bar + i < 8; i++ )
            board[foo - i][bar + i] = true;
        for ( int i = 1; foo - i >= 0 && bar - i >= 0; i++ )
            board[foo - i][bar - i] = true;
        for ( int i = 1; foo + i >= 0 && bar - i >= 0; i++ )
            board[foo + i][bar - i] = true;
    }
}
