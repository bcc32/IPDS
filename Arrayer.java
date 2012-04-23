// Aaron Zeng 20120420
// Array operations

import java.util.*;
import java.io.*;

public class Arrayer
{
    private int [] arr;

    public Arrayer( int size )
    {
        arr = new int[size];
    }

    public void setVal( int loc, int val )
    {
        arr[loc] = val;
    }

    public int getVal( int loc )
    {
        return arr[loc];
    }

    public void printArr()
    {
        for ( int i = 0; i < arr.length; i++ )
        {
            System.out.print( arr[i] + "\t" );
            if ( i % 10 == 9 )
                System.out.println();
        }
    }

    public int min()
    {
        int minimum = arr[0];
        for ( int i = 1; i < arr.length; i++ )
            if ( arr[i] < minimum )
                minimum = arr[i];
        return minimum;
    }

    public int max()
    {
        int maximum = arr[0];
        for ( int i = 1; i < arr.length; i++ )
            if ( arr[i] > maximum )
                maximum = arr[i];
        return maximum;
    }

    public void randArr()
    {
        Random rand = new Random();
        for ( int i = 0; i < arr.length; i++ )
            arr[i] = rand.nextInt( 900 ) + 100;
    }

    public int sum()
    {
        int s = 0;
        for ( int i = 0; i < arr.length; i++ )
            s += arr[i];
        return s;
    }

    public double average()
    {
        return (double)sum() / arr.length;
    }
}
