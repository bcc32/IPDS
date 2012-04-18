// Aaron Zeng 20120416
// Chapter 06 Exercise 34 (modified)

public class c6n34
{
    public static void main( String[] args )
    {
        System.out.println( "dec\thex\toct\tbin\t" );
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
        for ( int d = pow8( n ); d >= 1; d /= 8 )
        {
            System.out.print( n / d );
            n %= d;
        }
        System.out.print( "\t" );
    }

    public static int pow8( int n )
    {
        int pow = 0, pow8 = 1;
        while ( n / pow8 >= 8 )
        {
            pow++;
            pow8 *= 8;
        }
        return pow8;
    }

    public static void printHex( int n )
    {
        for ( int d = pow16( n ); d >= 1; d /= 16 )
        {
            printHexDigit( n / d );
            n %= d;
        }
        System.out.print( "\t" );
    }

    public static int pow16( int n )
    {
        int pow = 0, pow16 = 1;
        while ( n / pow16 >= 16 )
        {
            pow++;
            pow16 *= 16;
        }
        return pow16;
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
        for ( int d = pow2( n ); d >= 1; d /= 2 )
        {
            System.out.print( n / d );
            n %= d;
        }
        System.out.print( "\t" );
    }

    public static int pow2( int n )
    {
        int pow = 0, pow2 = 1;
        while ( n / pow2 >= 2 )
        {
            pow++;
            pow2 *= 2;
        }
        return pow2;
    }
}
