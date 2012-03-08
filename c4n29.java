// Aaron Zeng 20120308
// Chapter 04 Exercise 29

import java.util.*;
import java.io.*;

public class c4n29
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter size of square: " );
        int size = input.nextInt();

        int hCounter = 1, wCounter = 1;

        while ( hCounter <= size )
        {
            if ( hCounter == 1 || hCounter == size )
                while ( wCounter <= size )
                {
                    System.out.print( "*" );
                    wCounter++;
                }
            else
            {
                System.out.print( "*" );
                while ( wCounter <= size - 2 )
                {
                    System.out.print( " " );
                    wCounter++;
                }
                System.out.print( "*" );
            }
            System.out.println();
            wCounter = 1;
            hCounter++;
        }
    }
}
