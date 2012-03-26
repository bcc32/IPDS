// Aaron Zeng 20120326
// Chapter 5 Exercise 24

public class c5n24
{
    public static void main( String[] args )
    {
        for ( int i = 4; i >= 1; i-- )
        {
            for ( int j = 1; j <= i; j++ )
                System.out.print( ' ' );
            for ( int j = 1; j <= 9 - 2 * i; j++ )
                System.out.print( '*' );
            for ( int j = 1; j <= i; j++ )
                System.out.print( ' ' );
            System.out.println();
        }

        for ( int i = 0; i <= 4; i++ )
        {
            for ( int j = 1; j <= i; j++ )
                System.out.print( ' ' );
            for ( int j = 1; j <= 9 - 2 * i; j++ )
                System.out.print( '*' );
            for ( int j = 1; j <= i; j++ )
                System.out.print( ' ' );
            System.out.println();
        }
    }
}
