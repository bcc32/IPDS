// Aaron Zeng 20120427
// Chapter 07 Exercise 12

import java.util.*;
import java.io.*;

public class c7n12
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter five numbers: " );
        int[] arr = new int[5];
        for ( int i = 0; i < 5; i++ )
        {
            arr[i] = input.nextInt();
            display( arr, i );
        }
    }

    public static void display( int[] arr, int last )
    {
        for ( int i = 0; i <= last; i++ )
            if ( !duplicate( arr, i ) )
                System.out.printf( "%d\t", arr[i] );
        System.out.println();
    }

    public static boolean duplicate( int[] arr, int i )
    {
        for ( int j = 0; j < i; j++ )
            if ( arr[i] == arr[j] )
                return true;
        return false;
    }
}
