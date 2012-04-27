// Aaron Zeng 20120427
// Chapter 07 Exercise 15

import java.util.*;
import java.io.*;

public class c7n15
{
    public static void main( String[] args )
    {
        int[] arr;
        if ( args.length > 0 )
            arr = new int[Integer.parseInt( args[0] )];
        else
            arr = new int[10];
        System.out.printf( "%s%8s\n", "Index", "Value" );
        for ( int counter = 0; counter < arr.length; counter++ )
            System.out.printf( "%5d%8d\n", counter, arr[counter] );
    }
}
