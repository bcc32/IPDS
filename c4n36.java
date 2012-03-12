// Aaron Zeng 20120312
// Chapter 04 Exercise 36

import java.util.*;
import java.io.*;

public class c4n36
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter three side lengths: " );
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ( a * a + b * b == c * c || b * b + c * c == a * a ||
            c * c + a * a == b * b )
            System.out.println( "Forms a right triangle." );
        else
            System.out.println( "Does not form a right triangle." );
    }
}