// Aaron Zeng 20120514
// In-class test review for ch. 07

import java.util.*;
import java.io.*;

public class ArrayIt
{
    private final int LEN = 100;
    private int[] arr;

    public ArrayIt()
    {
        arr = new int[LEN];
    }

    public void arrayPrint()
    {
        for ( int i = 0; i < LEN; i++ )
            System.out.printf( i % 10 == 9 ? "%d\n" : "%d\t" , arr[i] );
    }

    public void doubleIndex()
    {
        for ( int i = 0; i < LEN; i++ )
            arr[i] = i * 2;
    }

    public int arraySum()
    {
        int sum = 0;
        for ( int num : arr )
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
            arr[i] = rand.nextInt( 100 ) + 100;
    }
}
