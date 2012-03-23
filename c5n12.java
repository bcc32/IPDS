// Aaron Zeng 20120323
// Chapter 05 Exercise 12

import java.util.*;
import java.io.*;

public class c5n12
{
    public static void main( String[] args )
    {
        int product = 1;
        for ( int num = 1; num <= 15; num += 2 )
            product *= num;
        System.out.printf( "The product of the odd integers 1..15 is: %d\n",
            product );
    }
}
