// Aaron Zeng 20120326
// Chapter 05 Exercise 21

public class c5n21
{
    public static void main( String[] args )
    {
        System.out.println( "side1\tside2\thypotenuse" );
        for ( int hypotenuse = 1; hypotenuse <= 500; hypotenuse++ )
            for ( int side2 = 1; side2 < hypotenuse; side2++ )
                for ( int side1 = 1; side1 < side2; side1++ )
                    if ( hypotenuse * hypotenuse == side2 * side2 +
                        side1 * side1 )
                        System.out.printf( "%d\t%d\t%d\n", side1, side2,
                            hypotenuse );
    }
}
