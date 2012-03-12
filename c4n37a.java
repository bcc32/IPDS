// Aaron Zeng 20120312
// Chapter 04 Exercise 37a

import java.util.*;
import java.io.*;

public class c4n37a
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter number: " );
        int n = input.nextInt();

        System.out.printf( "%d! = %d\n", n, factorial( n ) );
    }

    public static int factorial( int n )
    {
        int p = 1, i = 1;

        while ( i < n )
            p *= ++i;

        return p;
    }
}
