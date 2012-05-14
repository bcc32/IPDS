// Aaron Zeng 20120511
// Chapter 07 Exercise 25

import java.util.*;
import java.io.*;

public class c7n25b
{
    static boolean[][] queen;

    public static void main( String[] args )
    {
        queen = new boolean[8][8];
        boolean done = false;

        for ( int q1 = 0; q1 < 8; q1++ )
            for ( int q2 = 0; q2 < 8 && !done; q2++ )
            {
                if ( conf( 0, q1, 1, q2 ) )
                    continue;
                for ( int q3 = 0; q3 < 8 && !done; q3++ )
                {
                    if ( conf( 0, q1, 2, q3 ) || conf( 1, q2, 2, q3 ) )
                        continue;
                    for ( int q4 = 0; q4 < 8 && !done; q4++ )
                    {
                        if ( conf( 0, q1, 3, q4 ) || conf( 1, q2, 3, q4 ) ||
                            conf( 2, q3, 3, q4 ) )
                            continue;
                        for ( int q5 = 0; q5 < 8 && !done; q5++ )
                        {
                            if ( conf( 0, q1, 4, q5 ) || conf( 1, q2, 4, q5 ) ||
                                conf( 2, q3, 4, q5 ) || conf( 3, q4, 4, q5 ) )
                                continue;
                            for ( int q6 = 0; q6 < 8 && !done; q6++ )
                            {
                                if ( conf( 0, q1, 5, q6 ) ||
                                    conf( 1, q2, 5, q6 ) ||
                                    conf( 2, q3, 5, q6 ) ||
                                    conf( 3, q4, 5, q6 ) ||
                                    conf( 4, q5, 5, q6 ) )
                                    continue;
                                for ( int q7 = 0; q7 < 8 && !done; q7++ )
                                {
                                    if ( conf( 0, q1, 6, q7 ) ||
                                        conf( 1, q2, 6, q7 ) ||
                                        conf( 2, q3, 6, q7 ) ||
                                        conf( 3, q4, 6, q7 ) ||
                                        conf( 4, q5, 6, q7 ) ||
                                        conf( 5, q6, 6, q7 ) )
                                        continue;
                                    for ( int q8 = 0; q8 < 8; q8++ )
                                        if ( !conf( 0, q1, 7, q8 ) &&
                                            !conf( 1, q2, 7, q8 ) &&
                                            !conf( 2, q3, 7, q8 ) &&
                                            !conf( 3, q4, 7, q8 ) &&
                                            !conf( 4, q5, 7, q8 ) &&
                                            !conf( 5, q6, 7, q8 ) &&
                                            !conf( 6, q7, 7, q8 ) )
                                        {
                                            queen[0][q1] = true;
                                            queen[1][q2] = true;
                                            queen[2][q3] = true;
                                            queen[3][q4] = true;
                                            queen[4][q5] = true;
                                            queen[5][q6] = true;
                                            queen[6][q7] = true;
                                            queen[7][q8] = true;
                                            done = true;
                                            break;
                                        }
                                }
                            }
                        }
                    }
                }
            }
        for ( int i = 0; i < 8; i++ )
        {
            for ( int j = 0; j < 8; j++ )
                System.out.print( queen[i][j] ? '*' : '.' );
            System.out.println();
        }
    }

    public static boolean conf( int x1, int y1, int x2, int y2 )
    {
        return ( x1 - x2 == y1 - y2 ) || ( x1 - x2 == y1 - y2 ) ||
            ( x1 == x2 ) || ( y1 == y2 );
    }
}
