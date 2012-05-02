// Aaron Zeng 20120428
// Chapter 07 Exercise 21
// FIXME

import java.util.*;
import java.io.*;

public class c7n21
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in ).useDelimiter(
            "(\\s*)\\D(\\s*)" );
        final int ROWS = 20, COLS = 20;
        int[][] floor = new int[ROWS][COLS];
        int x = 0, y = 0, cmd;
        int dir = 0; // NESW
        boolean pen = false;
        do
        {
            System.out.printf( "CMD (%d, %d, %d, %s): ", x, y, dir,
                pen ? "DOWN" : "UP" );
            cmd = input.nextInt();
            switch( cmd )
            {
                case 1:
                    pen = false;
                    break;
                case 2:
                    pen = true;
                    floor[x][y] = 1 ;
                    break;
                case 3:
                    dir = ( dir + 1 ) % 4;
                    break;
                case 4:
                    dir = ( dir + 3 ) % 4;
                    break;
                case 5:
                    int num = input.nextInt();
                    switch( dir )
                    {
                        case 0:
                            if ( pen )
                                for ( int j = x; x - j < num && j >= 0; j-- )
                                    floor[j][y] = 1;
                            x = x >= num ? x - num : 0;
                            break;
                        case 1:
                            if ( pen )
                                for ( int j = y; j - y < num && j < COLS; j++ )
                                    floor[x][j] = 1;
                            y = y + num < COLS ? y + num : COLS - 1;
                            break;
                        case 2:
                            if ( pen )
                                for ( int j = x; j - x < num && j < ROWS; j++ )
                                    floor[j][y] = 1;
                            x = x + num < ROWS ? x + num : ROWS - 1;
                            break;
                        case 3:
                            if ( pen )
                                for ( int j = y; y - j < num && j >= 0; j-- )
                                    floor[x][j] = 1;
                            y = y >= num ? y - num : 0;
                            break;
                    }
                    break;
                case 6:
                    for ( int i = 0; i < ROWS; i++ )
                    {
                        for ( int j = 0; j < COLS; j++ )
                            if ( i == x && j == y )
                                if ( dir == 0 )
                                    System.out.print( "^ " );
                                else if ( dir == 1 )
                                    System.out.print( "> " );
                                else if ( dir == 2 )
                                    System.out.print( "v " );
                                else
                                    System.out.print( "< " );
                            else if ( floor[i][j] == 1 )
                                System.out.print( "* " );
                            else
                                System.out.print( ". " );
                        System.out.println();
                    }
                    break;
                case 9:
                    break;
            }
        } while ( cmd != 9 );
    }
}
