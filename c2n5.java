// Aaron Zeng 20120203

import java.util.*;

public class c2n5
{
    public static void main( String[] args )
    {
        // a) State that a program will calculate the product of three integers.
        // calculates the product of three integers

        // b) Create a Scanner that reads values from the standard input.
        Scanner input = new Scanner( System.in );
        // c) Declare the variables x, y, z, and result to be of type int.
        int x, y, z, result;

        // d) Prompt the user to enter the first integer.
        System.out.print( "Enter first integer: " );
        // e) Read the first integer and store it in the variable x.
        x = input.nextInt();

        // f) Prompt the user to enter the second integer.
        System.out.print( "Enter second integer: " );
        // g) Read the second integer and store it in the variable y.
        y = input.nextInt();

        // h) Prompt the user to enter the third integer.
        System.out.print( "Enter third integer: " );
        // i) Read the third integer and store it in the variable z.
        z = input.nextInt();

        // j) Compute the product of the three integers and store in result.
        result = x * y * z;

        // k) Display the message "Product is " followed by the value of result.
        System.out.printf( "Product is %d\n", result );
    }
}
