// Aaron Zeng 20120302
// Chapter 04 Exercise 06

import java.util.*;
import java.io.*;

public class c4n6
{
    public static void main( String[] args )
    {
    	int sum = 0, x = 1;
    	while ( x <= 10 )
    		sum += x++;
    	System.out.printf( "The sum of the integers 1..10 is: %s\n", sum );
    }
}
