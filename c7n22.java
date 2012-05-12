// Aaron Zeng 20120504
// Chapter 07 Exercise 22

import java.util.*;
import java.io.*;

public class c7n22
{
    static int row, col;
    static int[][] board, acc;
    static int[] ver = { -1, -2, -2, -1, 1, 2, 2, 1 };
    static int[] hor = { 2, 1, -1, -2, -2, -1, 1, 2 };

    public static void main( String[] args )
    {
        row = 1;
        col = 2;
        board = new int[8][8];
        acc = new int[8][8];
        int num;

        for ( num = 1; num <= 64; num++ )
        {
            calcAcc();
            int min = 0;
            for ( int move = 1; move < 8; move++ )
                if ( !valid( row, col, min ) ||
                    valid( row, col, move ) &&
                    acc[row + ver[move]][col + hor[move]] <
                    acc[row + ver[min]][col + hor[min]] )
                    min = move;
            if ( valid( row, col, min ) )
            {
                row += ver[min];
                col += hor[min];
                board[row][col] = num;
            }
            else
                break;
        }
        display();
        System.out.printf( "Reached: %d\n", --num );
    }

    public static void calcAcc()
    {
        for ( int r = 0; r < 8; r++ )
            for ( int c = 0; c < 8; c++ )
            {
                acc[r][c] = 0;
                for ( int move = 0; move < 8; move++ )
                    if ( valid( r, c, move ) )
                        acc[r][c]++;
            }
    }

    public static boolean valid( int r, int c, int move )
    {
        return r + ver[move] >= 0 && r + ver[move] < 8 &&
            c + hor[move] >= 0 && c + hor[move] < 8 &&
            board[r + ver[move]][c + hor[move]] == 0;
    }

    public static void display()
    {
        System.out.println( "---------------------------------");
        for ( int r = 0; r < 8; r++ )
        {
            for ( int c = 0; c < 8; c++ )
                System.out.printf( "|%3d", board[r][c] );
            System.out.println( "|" );
            System.out.println( "---------------------------------");
        }
    }
}
