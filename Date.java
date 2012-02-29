// Aaron Zeng 20120215
// Chapter 03 Exercise 15

public class Date
{
    // instance variables
    private int month, day, year;

    // constructor
    public Date( int m, int d, int y )
    {
        setMonth( m );
        setDay( d );
        setYear( y );
    }

    // set methods
    public void setMonth( int m )
    {
        month = m;
    }

    public void setDay( int d )
    {
        day = d;
    }

    public void setYear( int y )
    {
        year = y;
    }

    // get methods
    public int getMonth()
    {
        return month;
    }

    public int getDay()
    {
        return day;
    }

    public int getYear()
    {
        return year;
    }

    // display the date in the format MM/dd/yyyy
    public void displayDate()
    {
        System.out.printf( "%d/%d/%d\n", month, day, year );
    }
}
