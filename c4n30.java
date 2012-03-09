// Aaron Zeng 20120309
// Chapter 04 Exercise 30

import java.util.*;
import java.io.*;

public class c4n30
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter a five-digit number: " );
        int n = input.nextInt();
        while ( n < 10000 || n > 99999 )
        {
            System.out.println( "Invalid.  Try again." );
            System.out.print( "Enter a five-digit number: " );
            n = input.nextInt();
        }

        if ( n / 10000 == n % 10 && n / 1000 % 10 == n / 10 % 10 )
            System.out.println( "Palindrome." );
        else
            System.out.println( "Not a palindrome." );
    }
}
