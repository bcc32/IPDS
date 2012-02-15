// Aaron Zeng 20120214

import java.util.*;
import java.io.*;

public class TimerTest
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter hour: " );
        int hour = input.nextInt();
        System.out.print( "Enter minute: " );
        int minute = input.nextInt();
        System.out.print( "Enter second: " );
        int second = input.nextInt();

        Timer time = new Timer( hour, minute, second );
        System.out.println( time );
    }
}
