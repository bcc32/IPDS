// Aaron Zeng 20120323
// Chapter 05 Exercise 13

import java.util.*;
import java.io.*;

public class c5n13
{
    public static void main( String[] args )
    {
        int product = 1;
        for ( int n = 1; n <= 5; n++ )
        {
            product *= n;
            System.out.printf( "%d\t%d\n", n, product );
        }
    }
}
