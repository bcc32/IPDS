// Aaron Zeng 20120324
// Chapter 05 Exercise 15

public class c5n15
{
    public static void main( String[] args )
    {
        // pattern (a)
        for ( int i = 1; i <= 10; i++ )
        {
            for ( int j = 1; j <= i; j++ )
                System.out.print( '*' );
            System.out.println();
        }
        System.out.println();

        // pattern (b)
        for ( int i = 1; i <= 10; i++ )
        {
            for ( int j = 0; i + j <= 10; j++ )
                System.out.print( '*' );
            System.out.println();
        }
        System.out.println();

        // pattern (c)
        for ( int i = 1; i <= 10; i++ )
        {
            for ( int j = 1; j <= 10; j++ )
                System.out.print( j < i ? ' ' : '*' );
            System.out.println();
        }
        System.out.println();

        // pattern (d)
        for ( int i = 1; i <= 10; i++ )
        {
            for ( int j = 1; j <= 10; j++ )
                System.out.print( i + j <= 10 ? ' ' : '*' );
            System.out.println();
        }
    }
}
