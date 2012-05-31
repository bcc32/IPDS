// Aaron Zeng 20120531
// IPDS review Exercise 42

import java.util.*;
import java.io.*;

public class Avapma2d
{
    int[][] array;
    final int ROWS = 4;
    final int COLS = 6;

    public Avapma2d()
    {
        array = new int[ROWS][COLS];
    }

    public void zeroJ()
    {
        for ( int i = 0; i < ROWS; i++ )
            for ( int j = 0; j < COLS; j++ )
                array[i][j] = 0;
    }

    public void printJ()
    {
        for ( int i = 0; i < COLS; i++ )
            System.out.printf( "\t%d", i );
        System.out.println();
        for ( int i = 0; i < ROWS; i++ )
        {
            System.out.print( i );
            for ( int j = 0; j < COLS; j++ )
                System.out.printf( "\t%d", array[i][j] );
            System.out.println();
        }
    }

    public void randJ()
    {
        Random rand = new Random();
        for ( int i = 0; i < ROWS; i++ )
            for ( int j = 0; j < COLS; j++ )
                array[i][j] = 300 + rand.nextInt( 400 );
    }

    public int sumJ()
    {
        int sum = 0;
        for ( int[] arr : array )
            for ( int num : arr )
                sum += num;
        return sum;
    }

    public double averageJ()
    {
        return (double)sumJ() / ( ROWS * COLS );
    }
}
