// Aaron Zeng 20120416
// Chapter 06 Exercise 34 (modified)

public class c6n34
{
    public static void main( String[] args )
    {
        System.out.println( "dec\toct\thex\tbin\t" );
        for ( int i = 0; i < 256; i++ )
        {
            printDec( i );
            printHex( i );
            printOct( i );
            printBin( i );
            System.out.println();
        }
    }

    public static void printDec( int n )
    {
        System.out.print( n + "\t" );
    }

    public static void printOct( int n )
    {
        // stuff here
        System.out.print( "\t" );
    }

    public static void printHex( int n )
    {
        System.out.print( Integer.toString( n, 16 ).toUpperCase() + "\t" );
    }

    public static void printHexDigit( int num )
    {
        if ( num < 10 )
            System.out.print( num );
        else
            switch( num )
            {
                case 10:
                    System.out.print( 'A' );
                    break;
                case 11:
                    System.out.print( 'B' );
                    break;
                case 12:
                    System.out.print( 'C' );
                    break;
                case 13:
                    System.out.print( 'D' );
                    break;
                case 14:
                    System.out.print( 'E' );
                    break;
                case 15:
                    System.out.print( 'F' );
                    break;
                default: // Houston, we have a problem...
                    System.err.println( "WHAT IS THIS MADNESS????" );
                    assert( false );
                    break;
            }
    }

    public static void printBin( int n )
    {
        System.out.print( Integer.toString( n, 2 ) + "\t" );
    }
}
