// Aaron Zeng 20120215
// Chapter 03 Exercise 15

import java.util.*;
import java.io.*;

public class DateTest
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        // get data from user
        System.out.print( "Enter month (1-12): " );
        int month = input.nextInt();
        System.out.print( "Enter day: " );
        int day = input.nextInt();
        System.out.print( "Enter year: " );
        int year = input.nextInt();

        Date date = new Date( month, day, year );

        // display information
        System.out.print( "The date is: " );
        date.displayDate();
    }
}
