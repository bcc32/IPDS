// Aaron Zeng 20120321
// Chapter 05 Exercise 11

import java.util.*;
import java.io.*;

public class c5n11
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter number of inputs: " );
        int numInput = input.nextInt();

        System.out.print( "Enter first number: " );
        int min = input.nextInt();

        // one of the integers has already been input; thus, counter = 2
        for ( int counter = 2; counter <= numInput; counter++ )
        {
            System.out.printf( "Enter number #%d: ", counter );
            int x = input.nextInt();
            if ( x < min )
                min = x;
        }

        System.out.printf( "The smallest is: %d\n", min );
    }
}
