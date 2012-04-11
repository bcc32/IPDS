// Aaron Zeng 20120410
// Chapter 06 Exercise 03

public class c6n3
{
    public static void main( String[] args )
    {
        // Math.abs( x )
        System.out.printf( "23.7 = %f\n", Math.abs( 23.7 ) );
        System.out.printf( "0.0 = %f\n", Math.abs( 0.0 ) );
        System.out.printf( "23.7 = %f\n", Math.abs( -23.7 ) );

        // Math.ceil( x )
        System.out.printf( "10.0 = %f\n", Math.ceil( 9.2 ) );
        System.out.printf( "-9.0 = %f\n", Math.ceil( -9.8 ) );

        // Math.cos( x )
        System.out.printf( "1.0 = %f\n", Math.cos( 0.0 ) );

        // Math.exp( x )
        System.out.printf( "2.71828 = %f\n", Math.exp( 1.0 ) );
        System.out.printf( "7.38906 = %f\n", Math.exp( 2.0 ) );

        // Math.floor( x )
        System.out.printf( "9.0 = %f\n", Math.floor( 9.2 ) );
        System.out.printf( "-10.0 = %f\n", Math.floor( -9.8 ) );

        // Math.log( x )
        System.out.printf( "1.0 = %f\n", Math.log( Math.E ) );
        System.out.printf( "2.0 = %f\n", Math.log( Math.E * Math.E ) );

        // Math.max( x, y )
        System.out.printf( "12.7 = %f\n", Math.max( 2.3, 12.7 ) );
        System.out.printf( "-2.3 = %f\n", Math.max( -2.3, -12.7 ) );

        // Math.min( x, y )
        System.out.printf( "2.3 = %f\n", Math.min( 2.3, 12.7 ) );
        System.out.printf( "-12.7 = %f\n", Math.min( -2.3, -12.7 ) );

        // Math.pow( x, y );
        System.out.printf( "128.0 = %f\n", Math.pow( 2.0, 7.0 ) );
        System.out.printf( "3.0 = %f\n", Math.pow( 9.0, 0.5 ) );

        // Math.sin( x )
        System.out.printf( "0.0 = %f\n", Math.sin( 0.0 ) );

        // Math.sqrt( x )
        System.out.printf( "30.0 = %f\n", Math.sqrt( 900.0 ) );

        // Math.tan( x )
        System.out.printf( "0.0 = %f\n", Math.tan( 0.0 ) );
    }
}
