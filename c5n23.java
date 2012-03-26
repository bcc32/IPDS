// Aaron Zeng 20120326
// Chapter 05 Exercise 23

public class c5n23
{
    public static void main( String[] args )
    {
        int x = 0, y = 0, a = 0, b = 0, g = 0, i = 0, j = 0;

        System.out.print( "a: " );
        if ( ( !( x < 5 ) && !( y >= 7 ) ) == !( x < 5 || y >= 7 ) )
            System.out.println( "T" );

        System.out.print( "b: " );
        if ( ( !( a == b ) || !( g != 5 ) ) == !( a == b && g != 5 ) )
            System.out.println( "T" );

        System.out.print( "c: " );
        if ( !( ( x <= 8 ) && ( y > 4 ) ) == ( !( x <= 8 ) || !( y > 4 ) ) )
            System.out.println( "T" );

        System.out.print( "d: " );
        if ( !( ( i > 4 ) || ( j <= 6 ) ) == ( !( i > 4 ) && !( j <= 6 ) ) )
            System.out.println( "T" );
    }
}
