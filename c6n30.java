// Aaron Zeng 20120412
// Chapter 06 Exercise 30

import java.util.*;
import java.io.*;

public class c6n30
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        Random rand = new Random();
        int random = 1 + rand.nextInt( 1000 );
        String playAgain;
        do
        {
            System.out.println( "Guess a number between 1 and 1000." );
            int x;
            do
            {
                System.out.print( "Guess: " );
                x = input.nextInt();
                if ( x < random )
                    System.out.println( "Too low.  Try again. " );
                else if ( x > random )
                    System.out.println( "Too high.  Try again." );
                else
                    System.out.println(
                        "Congratulations.  You guessed the number!" );
            } while ( x != random );
            System.out.print( "Play again (y/n)? " );
            playAgain = input.next();
        }
        while ( playAgain.equals( "y" ) || playAgain.equals( "Y" ) );
    }
}
