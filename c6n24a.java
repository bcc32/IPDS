// Aaron Zeng 20120412
// Chapter 06 Exercise 24 with more efficient factor searching

public class c6n24a
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
                System.out.printf( "%d: ", num );
                displayFactors( num );
                System.out.println();
            }
    }

    public static void displayFactors( int num )
    {
		System.out.print( "1" );
		for ( int factor = 2; factor <= num / 2; factor++ )
            if ( num % factor == 0 )
                System.out.printf( ", %d", factor );
    }

    public static boolean isPerfect( int num )
    {
		if ( num <= 1 ) // special case 1
			return false;
        int sum = 1; // 1 is always a factor
        for ( int factor = 2; factor * factor <= num; factor++ )
            if ( num % factor == 0 )
				if ( factor * factor < num )
					sum += factor + num / factor;
				else // square root only counts once
					sum += factor;
        return sum == num;
    }
}
