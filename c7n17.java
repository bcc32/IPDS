// Aaron Zeng 20120427
// Chapter 07 Exercise 17

import java.util.*;
import java.io.*;

public class c7n17
{
    public static void main( String[] args )
    {
        int[] arr = new int[13];
        Random rand = new Random();
        for ( int i = 0; i < 36000; i++ )
            arr[rand.nextInt( 6 ) + rand.nextInt( 6 ) + 2]++;
        System.out.println( "Roll\tTimes" );
        for ( int i = 2; i <= 12; i++ )
            System.out.printf( "%d\t%d\n", i, arr[i] );
    }
}
