// Aaron Zeng 20120410
// Array operations test

import java.util.*;
import java.io.*;

public class ArrayerTest
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        Arrayer arr = new Arrayer( 1000 );
        arr.randArr();
        arr.printArr();
        System.out.printf( "Minimum: %d\n", arr.min() );
        System.out.printf( "Maximum: %d\n", arr.max() );
        System.out.printf( "Sum: %d\n", arr.sum() );
        System.out.println( "Average: " + arr.average() );
    }
}
