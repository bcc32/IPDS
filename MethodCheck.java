// Aaron Zeng 20120409

import java.util.*;
import java.io.*;

public class MethodCheck
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        System.out.print( "Please enter a number: " );
        int num1 = input.nextInt();
        System.out.print( "Please enter another number: " );
        int num2 = input.nextInt();
        double avg = average( num1, num2 );
        System.out.println( "The average is " + avg );
    }

    // public double average( int n1, int n2 )
    public static double average( int n1, int n2 )
    {
        return ( n1 + n2 ) / 2.0;
    }
}
