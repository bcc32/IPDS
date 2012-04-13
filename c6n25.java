// Aaron Zeng 20120412
// Chapter 06 Exercise 25

public class c6n25
{
    public static void main( String[] args )
    {
        for ( int num = 1; num < 10000; num++ )
            if ( isPrime( num ) )
                System.out.println( num );
    }

    public static boolean isPrime( int num )
    {
        for ( int factor = 2; factor * factor <= num; factor++ )
            if ( num % factor == 0 )
                return false;
        return true;
    }
}
