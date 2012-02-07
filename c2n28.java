// Aaron Zeng 20120207

import java.util.*;
import java.io.*;

public class c2n28
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter radius: " );
        double r = input.nextDouble();

        System.out.printf( "Diameter: %f\n", 2 * r );
        System.out.printf( "Circumference: %f\n", 2 * Math.PI * r );
        System.out.printf( "Area: %f\n", Math.PI * r * r );
    }
}
