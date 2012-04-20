// Aaron Zeng 20120410
// Array operations test

import java.util.*;
import java.io.*;

public class ArrayerTest
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        Arrayer arr = new Arrayer( 10 );
        System.out.print( "Enter ten integers: " );
        for ( int i = 0; i < 10; i++ )
            arr.setVal(i, input.nextInt() );
        arr.printArr();
        System.out.println( arr.min() );
        System.out.println( arr.max() );
    }
}
