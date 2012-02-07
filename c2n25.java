// Aaron Zeng 20120207

import java.util.*;
import java.io.*;

public class c2n25
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter an integer: " );
        int n = input.nextInt();

        if ( n % 2 == 0 )
            System.out.println( "Even." );
        if ( n % 2 != 0 )
            System.out.println( "Odd." );
    }
}
