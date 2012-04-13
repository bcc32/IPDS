// Aaron Zeng 20120412
// Chapter 06 Exercise 24

public class c6n24
{
    public static void main( String[] args )
    {
        displayPerfect();
    }

    public static void displayPerfect()
    {
        for ( int num = 1; num <= 1000; num++ )
            if ( isPerfect( num ) )
            {
                System.out.printf( "%d:", num );
                displayFactors( num );
                System.out.println();
            }
    }

    public static void displayFactors( int num )
    {
        for ( int factor = 1; factor < num; factor++ )
            if ( num % factor == 0 )
                System.out.printf( " %d", factor );
    }

    public static boolean isPerfect( int num )
    {
        int sum = 0;
        for ( int factor = 1; factor < num; factor++ )
            if ( num % factor == 0 )
                sum += factor;
        return sum == num;
    }
}
