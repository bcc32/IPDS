// Aaron Zeng 20120307
// Chapter 04 Exercise 24

import java.util.*;
import java.io.*;

public class Analysis
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        int passes = 0, failures = 0, studentCounter = 1, result;

        while ( studentCounter <= 10 )
        {
            System.out.print( "Enter result (1 = pass, 2 = fail): " );
            result = input.nextInt();
            while ( result != 1 && result != 2 )
            {
                System.out.println( "Invalid.  Try again." );
                System.out.print( "Enter result (1 = pass, 2 = fail): " );
                result = input.nextInt();
            }

            if ( result == 1 )
                passes++;
            else
                failures++;

            studentCounter++;
        }

        System.out.printf( "Passed: %d\nFailed: %d\n", passes, failures );

        if ( passes > 8 )
            System.out.println( "Bonus to instructor!" );
    }
}
