// Aaron Zeng 20120206

import java.util.*;
import java.io.*;

public class c2n16
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter first integer: " );
        int a = input.nextInt();
        System.out.print( "Enter second integer: " );
        int b = input.nextInt();

        if ( a < b )
            System.out.printf( "%d is larger.\n", b );
        if ( a == b )
            System.out.println( "These numbers are equal." );
        if ( a > b )
            System.out.printf( "%d is larger.\n", a );
    }
}
