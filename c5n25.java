// Aaron Zeng 20120326
// Chapter 5 Exercise 25

import java.util.*;
import java.io.*;

public class c5n25
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter an odd integer from 1..19: " );
        int size = input.nextInt();

        for ( int i = ( size - 1 ) / 2; i >= 1; i-- )
        {
            for ( int j = 1; j <= i; j++ )
                System.out.print( ' ' );
            for ( int j = 1; j <= size - 2 * i; j++ )
                System.out.print( '*' );
            for ( int j = 1; j <= i; j++ )
                System.out.print( ' ' );
            System.out.println();
        }

        for ( int i = 0; i <= ( size - 1 ) / 2; i++ )
        {
            for ( int j = 1; j <= i; j++ )
                System.out.print( ' ' );
            for ( int j = 1; j <= size - 2 * i; j++ )
                System.out.print( '*' );
            for ( int j = 1; j <= i; j++ )
                System.out.print( ' ' );
            System.out.println();
        }
    }
}
