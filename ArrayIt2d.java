// Aaron Zeng 20120514
// In-class test review for ch. 07

import java.util.*;
import java.io.*;

public class ArrayIt2d
{
    private final int LEN = 10;
    private int[][] arr;

    public ArrayIt2d()
    {
        arr = new int[LEN][LEN];
    }

    public void arrayPrint()
    {
        for ( int[] subarr : arr )
        {
            for ( int num : subarr )
                System.out.printf( "%d\t", num );
            System.out.println();
        }
    }

    public void doubleIndex()
    {
        for ( int i = 0; i < LEN; i++ )
            for ( int j = 0; j < LEN; j++ )
                arr[i][j] = 10 * i + j; // digits are ij
    }

    public int arraySum()
    {
        int sum = 0;
        for ( int[] subarr : arr )
            for ( int num : subarr )
                sum += num;
        return sum;
    }

    public double arrayAverage()
    {
        return (double)arraySum() / LEN;
    }

    public void random199()
    {
        Random rand = new Random();
        for ( int i = 0; i < LEN; i++ )
            for ( int j = 0; j < LEN; j++ )
                arr[i][j] = rand.nextInt( 100 ) + 100;
    }
}
