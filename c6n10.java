// Aaron Zeng 20120411
// Chapter 06 Exercise 11

import java.util.*;
import java.io.*;

public class c6n10
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter some numbers: " );
        while ( input.hasNextDouble() )
        {
            double x = input.nextDouble();
            System.out.println( "Rounded to nearest integer: " +
                roundToInteger( x ) );
            System.out.println( "Rounded to nearest tenth: " +
                roundToTenths( x ) );
            System.out.println( "Rounded to nearest hundredth: " +
                roundToHundredths( x ) );
            System.out.println( "Rounded to nearest thousandth: " +
                roundToThousandths( x ) );
        }
    }

    private static double roundToInteger( double number )
    {
        return Math.floor( number );
    }

    private static double roundToTenths( double number )
    {
        return Math.floor( number * 10 + 0.5 ) / 10;
    }

    private static double roundToHundredths( double number )
    {
        return Math.floor( number * 100 + 0.5 ) / 100;
    }

    private static double roundToThousandths( double number )
    {
        return Math.floor( number * 1000 + 0.5 ) / 1000;
    }
}
