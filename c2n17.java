// Aaron Zeng 20120206

import java.util.*;
import java.io.*;

public class c2n17
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.printf( "Sum is %d\n", a + b + c );
        System.out.printf( "Average is %d\n", ( a + b + c ) / 3 );
        System.out.printf( "Product is %d\n", a * b * c );

        int min = 0;
        if ( a < b )
            if ( a < c )
                min = a;
        if ( b < a )
            if ( b < c )
                min = b;
        if ( c < a )
            if ( c < b )
                min = c;
        System.out.printf( "Smallest is %d\n", min );

        int max = 0;
        if ( a > b )
            if ( a > c )
                max = a;
        if ( b > a )
            if ( b > c )
                max = b;
        if ( c > a )
            if ( c > b )
                max = c;
        System.out.printf( "Largest is %d\n", max );
    }
}
