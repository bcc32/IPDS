// Aaron Zeng 20120326
// Chapter 05 Exercise 21

public class c5n21
{
    public static void main( String[] args )
    {
        int num = 1;
        System.out.println( "#\tside1\tside2\thypotenuse" );
        for ( int hypotenuse = 1; hypotenuse <= 500; hypotenuse++ )
        for ( int side2 = 1; side2 < hypotenuse; side2++ )
        for ( int side1 = 1; side1 < side2; side1++ )
            if ( hypotenuse * hypotenuse == side2 * side2 + side1 * side1 )
                System.out.printf( "%d\t%d\t%d\t%d\n", num++, side1, side2,
                    hypotenuse );
    }
}
