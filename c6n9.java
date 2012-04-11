// Aaron Zeng 20120410
// Chapter 06 Exercise 09

import java.util.*;
import java.io.*;

public class c6n9
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter some numbers: " );
        while ( input.hasNextDouble() )
        {
            double x = input.nextDouble();
            System.out.printf( "Original number: %f\n", x );
            System.out.printf( "Rounded: %d\n", (int)Math.floor( x + 0.5 ) );
        }
    }
}
