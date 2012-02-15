// Aaron Zeng 20120214

public class Timer
{
    // instance variables
    private int hour, minute, second;

    // constructor
    public Timer( int hr, int mn, int sc )
    {
        setHour( hr );
        setMinute( mn );
        setSecond( sc );
    }

    // set methods
    public void setHour( int hr )
    {
        hour = hr;
    }

    public void setMinute( int mn )
    {
        minute = mn;
    }

    public void setSecond( int sc )
    {
        second = sc;
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

    // toString
    public String toString()
    {
        return String.format( "%d:%02d:%02d", hour, minute, second );
    }
}
