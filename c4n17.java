// Aaron Zeng 20120305
// Chapter 04 Exercise 17
// FIXME: prompts for gallons even after -1 is entered for miles

// import java.util.Scanner
import java.util.*;
import java.io.*;

public class c4n17
{
    public static void main( String[] args )
    {
        // create new scanner and define, initalize variables
        Scanner input = new Scanner( System.in );
        int miles, gallons, tMiles = 0, tGallons = 0;

        // prompt user for data
        System.out.print( "Miles driven (-1 to quit): " );
        // accept data
        miles = input.nextInt();
        // prompt for data
        System.out.print( "Gallons consumed: " );
        // accept data
        gallons = input.nextInt();

        // loop until the user enters -1 for miles
        while ( miles != -1 )
        {
            // add miles and gallons to the totals
            tMiles += miles;
            tGallons += gallons;

            // print out information
            System.out.println( "Miles per gallon, this tankful: "  +
                (double)miles / gallons ); // calculates this average MPG
            System.out.println( "Miles per gallon thus far: " +
                (double)tMiles / tGallons ); // calculates overall average MPG

            //prompt for and accept new data
            System.out.print( "Miles driven (-1 to quit): " );
            miles = input.nextInt();
            System.out.print( "Gallons consumed: " );
            gallons = input.nextInt();
        }
    }
}
