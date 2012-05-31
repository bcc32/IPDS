// Aaron Zeng 20120531
// IPDS review Exercise 35

public class r35
{
    public static void main( String[] args )
    {
        for ( int i = 0; i < 255; i++ )
        {
            System.out.printf( "%d\t", i );
            printHexNumber( i );
            System.out.println();
        }
    }

    public static void printHexNumber( int num )
    {
        int d1 = num / 16;
        int d2 = num % 16;
        printHexDigit( d1 );
        printHexDigit( d2 );
    }

    public static void printHexDigit( int dig )
    {
        if ( dig < 10 )
            System.out.print( dig );
        else
            switch( dig )
            {
                case 10:
                    System.out.print( 'a' );
                    break;
                case 11:
                    System.out.print( 'b' );
                    break;
                case 12:
                    System.out.print( 'c' );
                    break;
                case 13:
                    System.out.print( 'd' );
                    break;
                case 14:
                    System.out.print( 'e' );
                    break;
                case 15:
                    System.out.print( 'f' );
                    break;
            }
    }
}
