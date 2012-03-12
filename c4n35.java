// Aaron Zeng 20120312
// Chapter 04 Exercise 35

import java.util.*;
import java.io.*;

public class c4n35
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter three side lengths: " );
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if ( a + b > c && b + c > a && c + a > b )
            System.out.println( "Triangle can be formed." );
        else
            System.out.println( "Triangle cannot be formed." );
    }
}
