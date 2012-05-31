// Aaron Zeng 20120525
// IPDS review exercise 20

import java.util.*;
import java.io.*;

public class r20
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter a four-digit number (-1 to quit): " );
        int num = input.nextInt();
        while ( num != -1 )
        {
            int d1 = num / 1000;
            int d2 = num % 1000 / 100;
            int d3 = num % 100 / 10;
            int d4 = num % 10;
            System.out.printf( "%4d: ascending is %b\n", num,
                d4 > d3 && d3 > d2 && d2 > d1 );
            System.out.print( "Enter a four-digit number (-1 to quit): " );
            num = input.nextInt();
        }
    }
}
