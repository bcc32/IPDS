// Aaron Zeng 20120214

import java.util.*;
import java.io.*;

public class TimerTest
{
    public static void main( String[] args )
    {
        /*
        Timer time = new Timer();
        time.setHour( 8 );
        time.setMinute( 41 );
        time.setSecond( 20 );

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        System.out.printf( "The time is %d:%d:%d\n", hour, minute, second );
        */

        Timer time = new Timer( 8, 41, 20 );
        System.out.println( time );
    }
}
