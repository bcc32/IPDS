// Aaron Zeng 20120312
// Chapter 04 Exercise 37c

import java.util.*;
import java.io.*;

public class c4n37c
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        double e = 0.0;

        System.out.print( "Enter number of terms: " );
        int n = input.nextInt();
        System.out.print( "Enter exponent: " );
        int x = input.nextInt();
        int i = 0;

        while ( i < n )
        {
            e += (double)power( x, i ) / factorial( i );
            i++;
        }

        System.out.printf( "e^%d is approximately %f\n", x, e );
    }

    public static int factorial( int n )
    {
        int p = 1, i = 1;

        while ( i < n )
            p *= ++i;

        return p;
    }

    public static int power( int a, int b )
    {
        int p = 1, i = 1;

        while ( i <= b )
        {
            p *= a;
            i++;
        }

        return p;
    }
}
