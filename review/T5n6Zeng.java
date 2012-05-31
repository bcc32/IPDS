// Aaron Zeng 20120529
// IPDS review Exercise 26

public class T5n6Zeng
{
    public static void main( String[] args )
    {
        System.out.println( "(a)" );
        for ( int i = 12; i >= 2; i -= 2 )
        {
            for ( int j = 0; j < i; j++ )
                System.out.print( "*" );
            System.out.println();
        }

        System.out.println();

        System.out.println( "(b)" );
        for ( int i = 0; i <= 10; i += 2 )
        {
            for ( int j = 0; j < i; j++ )
                System.out.print( "." );
            for ( int j = 0; j < 12 - i; j++ )
                System.out.print( "*" );
            System.out.println();
        }

        System.out.println();

        System.out.println( "(c)" );
        for ( int i = 5; i >= 0; i-- )
        {
            for ( int j = 0; j < i; j++ )
                System.out.print( "." );
            for ( int j = 0; j < 6 - i; j++ )
                System.out.print( "*" );
            System.out.println();
        }
    }
}
