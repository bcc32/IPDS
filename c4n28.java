// Aaron Zeng 20120308
// Chapter 04 Exercise 28

import java.util.*;
import java.io.*;

public class c4n28
{
    public static void main( String[] args )
    {
        // initialize
        int x = 5, y = 8;

        // part a
        if ( y == 8 )
            if ( x == 5 )
                System.out.println( "@@@@@" );
            else
                System.out.println( "#####" );
        System.out.println( "$$$$$" );
        System.out.println( "&&&&&" );

        // part b
        if ( y == 8 )
            if ( x == 5 )
                System.out.println( "@@@@@" );
            else
            {
                System.out.println( "#####" );
                System.out.println( "$$$$$" );
                System.out.println( "&&&&&" );
            }

        // part c
        if ( y == 8 )
            if ( x == 5 )
                System.out.println( "@@@@@" );
            else
            {
                System.out.println( "#####" );
                System.out.println( "$$$$$" );
                System.out.println( "&&&&&" );
            }

        // part d
        y = 7; // conditions are changed
        if ( y == 8 )
        {
            if ( x == 5 )
                System.out.println( "@@@@@" );
        }
        else
        {
            System.out.println( "#####" );
            System.out.println( "$$$$$" );
            System.out.println( "&&&&&" );
        }
    }
}
