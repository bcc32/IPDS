// Aaron Zeng 20120412
// Chatper 06 Exercise 36

import java.util.*;
import java.io.*;

public class c6n36
{
    public static void main( String[] args )
    {
        while ( true ) // bad style
            question();
    }

    public static void question()
    {
        Scanner input = new Scanner( System.in );
        Random rand = new Random();
        int answer, x = 1 + rand.nextInt( 9 ), y = 1 + rand.nextInt( 9 );
        do
        {
            System.out.printf( "How much is %d times %d? ", x, y );
            answer = input.nextInt();
            if ( answer != x * y )
                incorrectResponse();
        } while ( answer != x * y );
        correctResponse();
    }

    public static void correctResponse()
    {
        Random rand = new Random();
        int choice = rand.nextInt( 4 );
        switch ( choice )
        {
            case 0:
                System.out.println( "Very good!" );
                break;
            case 1:
                System.out.println( "Excellent!" );
                break;
            case 2:
                System.out.println( "Nice work!" );
                break;
            case 3:
                System.out.println( "Keep up the good work!" );
                break;
        }
    }

    public static void incorrectResponse()
    {
        Random rand = new Random();
        int choice = rand.nextInt( 4 );
        switch ( choice )
        {
            case 0:
                System.out.println( "No.  Please try again." );
                break;
            case 1:
                System.out.println( "Wrong.  Please try once more." );
                break;
            case 2:
                System.out.println( "Don't give up!" );
                break;
            case 3:
                System.out.println( "No.  Keep trying." );
                break;
        }
    }
}
