// Aaron Zeng 20120208

import java.util.*;
import java.io.*;

public class c2n17
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        int min, max;

        System.out.print( "Enter first integer: " );
        int a = input.nextInt();
        min = a;
        max = a;

        System.out.print( "Enter second integer: " );
        int b = input.nextInt();
        if ( b < min )
            min = b;
        if ( b > max )
            max = b;

        System.out.print( "Enter third integer: " );
        int c = input.nextInt();
        if ( c < min )
            min = c;
        if ( c > max )
            max = c;

        System.out.printf( "Sum is %d\n", a + b + c );
        System.out.printf( "Average is %d\n", ( a + b + c ) / 3 );
        System.out.printf( "Product is %d\n", a * b * c );
        System.out.printf( "Smallest is %d\n", min );
        System.out.printf( "Largest is %d\n", max );
    }
}
