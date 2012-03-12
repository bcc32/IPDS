// Aaron Zeng 20120312
// Chapter 04 Exercise 37b

import java.util.*;
import java.io.*;

public class c4n37b
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        double e = 0.0;

        System.out.print( "Enter number of terms: " );
        int n = input.nextInt();
        int i = 0;

        while ( i < n )
            e += 1.0 / factorial( i++ );

        System.out.printf( "e is approximately %f\n", e );
    }

    public static int factorial( int n )
    {
        int p = 1, i = 1;

        while ( i < n )
            p *= ++i;

        return p;
    }
}
