// Aaron Zeng 20120518
// TimeTest

public class TimeTest
{
    public static void main( String[] args )
    {
        Time time1 = new Time( 15, 20, 0 );
        System.out.printf( "The hour is %d\n", time1.getHour() );
        System.out.printf( "The minute is %d\n", time1.getMinute() );
        System.out.printf( "The second is %d\n", time1.getSecond() );

        Time time2 = new Time( time1 );
        System.out.printf( "The time is %s\n", time1 );
    }
}
