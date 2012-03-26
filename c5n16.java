// Aaron Zeng 20120326
// Chapter 05 Exercise 16

import java.util.*;
import java.io.*;

public class c5n16
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter five numbers: " );
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        for ( int i = 0; i < a; i++ )
            System.out.print( '*' );
        System.out.println();

        for ( int i = 0; i < b; i++ )
            System.out.print( '*' );
        System.out.println();

        for ( int i = 0; i < c; i++ )
            System.out.print( '*' );
        System.out.println();

        for ( int i = 0; i < d; i++ )
            System.out.print( '*' );
        System.out.println();

        for ( int i = 0; i < e; i++ )
            System.out.print( '*' );
        System.out.println();
    }
}
