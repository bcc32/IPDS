// Aaron Zeng 20120412
// Chapter 06 Exercise 25 with Eratosthenes' Sieve

public class c6n25a
{
    public static void main( String[] args )
    {
        boolean[] prime = new boolean[10000];
        for ( int i = 1; i < 10000; i++ )
            prime[i] = true;
        for ( int i = 2; i <= 5000; i++ )
        {
            if ( prime[i] )
                for ( int j = 2; i * j < 10000; j++ )
                    prime[i * j] = false;
        }
        for ( int i = 1; i < 10000; i++ )
            if ( prime[i] )
                System.out.println( i );
    }
}
