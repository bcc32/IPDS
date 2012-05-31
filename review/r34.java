// Aaron Zeng 20120531
// IPDS review Exercise 34

import java.util.*;
import java.io.*;

public class r34
{
    public static void main( String[] args )
    {
        Random rand = new Random();
        System.out.printf( "(a): %d\n", rand.nextInt( 5 ) );
        System.out.printf( "(b): %d\n", -3 + rand.nextInt( 4 ) );
        System.out.printf( "(c): %d\n", 1 + rand.nextInt( 7 ) );
        System.out.printf( "(d): %d\n", 7 + 4 * rand.nextInt( 5 ) );
    }
}
