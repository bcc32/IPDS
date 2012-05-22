// Aaron Zeng 20120518
// Time

public class Time
{
    // data
    private int hour;   // 0..23
    private int minute; // 0..59
    private int second; // 0..59

    // constructors
    public Time()
    {
        setTime( 0, 0, 0 );
    }

    public Time( int hour )
    {
        setTime( hour, 0, 0 );
    }

    public Time( int hour, int minute )
    {
        setTime( hour, minute, 0 );
    }

    public Time( int hour, int minute, int second )
    {
        setTime( hour, minute, second );
    }

    public Time( Time time )
    {
        setTime( time.getHour(), time.getMinute(), time.getSecond() );
    }

    // get methods
    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public int getSecond()
    {
        return second;
    }

    // set methods
    public void setTime( int hour, int minute, int second )
    {
        setHour( hour );
        setMinute( minute );
        setSecond( second );
    }

    public void setHour( int hour )
    {
        this.hour = hour >= 0 && hour < 24 ? hour : 0;
    }

    public void setMinute( int minute )
    {
        this.minute = minute >= 0 && minute < 60 ? minute : 0;
    }

    public void setSecond( int second )
    {
        this.second = second >= 0 && second < 60 ? second : 0;
    }

    // calc methods
    public void tick()
    {
        second++;
        if ( second >= 60 )
        {
            second = 0;
            incrementMinute();
        }
    }

    public void incrementMinute()
    {
        minute++;
        if ( minute >= 60 )
        {
            minute = 0;
            incrementHour();
        }
    }

    public void incrementHour()
    {
        hour++;
        if ( hour >= 24 )
            hour = 0;
    }

    // "string" methods
    public String toString()
    {
        return String.format( "%02d:%02d:%02d",
            getHour(), getMinute(), getSecond() );
    }
}
