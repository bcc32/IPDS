// Aaron Zeng 20120203

import java.util.*;

public class c2f7a
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        double number1, number2, sum;

        System.out.print( "Enter first number: " );
        number1 = input.nextDouble();

        System.out.print( "Enter second number: " );
        number2 = input.nextDouble();

        sum = number1 + number2;
        System.out.printf( "The sum is %f\n", sum );
    }
}
