// Aaron Zeng 20120324
// Chapter 05 Exercise 14

public class Interest
{
    public static void main( String[] args )
    {
        double amount;
        double principal = 1000.0;

        for ( int rate = 5; rate <= 10; rate++ )
        {
            System.out.printf( "Rate: %d%%\n", rate );
            System.out.printf( "%s%20s\n", "Year", "Amount on deposit" );

            for ( int year = 1; year <= 10; year++ )
            {
                amount = principal * Math.pow( 1.0 + (double)rate / 100, year );
                System.out.printf( "%4d%,20.2f\n", year, amount );
            }

            System.out.println(); // separate different rates
        }
    }
}
