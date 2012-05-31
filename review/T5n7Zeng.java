// Aaron Zeng 20120529
// IPDS review Exercise 27

public class T5n7Zeng
{
    public static void main( String[] args )
    {
        for ( int i = 0; i <= 3; i++ )
        {
            for ( int j = 0; j < i; j++ )
                System.out.print( "." );
            for ( int j = 0; j < 8 - 2 * i; j++ )
                System.out.print( "*" );
            System.out.println();
        }

        for ( int i = 3; i >= 0; i-- )
        {
            for ( int j = 0; j < i; j++ )
                System.out.print( "." );
            for ( int j = 0; j < 8 - 2 * i; j++ )
                System.out.print( "*" );
            System.out.println();
        }
    }
}
