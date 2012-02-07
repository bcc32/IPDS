// Aaron Zeng 20120206

import java.util.*;
import java.io.*;

public class c2n15
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter first integer: " );
        int a = input.nextInt();
        System.out.print( "Enter second integer: " );
        int b = input.nextInt();

        System.out.printf( "%d + %d = %d\n", a, b, a + b );
        System.out.printf( "%d - %d = %d\n", a, b, a - b );
        System.out.printf( "%d * %d = %d\n", a, b, a * b );
        System.out.printf( "%d / %d = %d\n", a, b, a / b );
    }
}
