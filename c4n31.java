// Aaron Zeng 20120309
// Chapter 04 Exercise 31

import java.util.*;
import java.io.*;

public class c4n31
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        int mult = 1, x = 0;

        System.out.print( "Enter a binary number: " );
        int n = input.nextInt();
        while ( n >= 1 )
        {
            x += n % 10 * mult;
            n /= 10;
            mult *= 2;
        }

        System.out.println( x );
    }
}