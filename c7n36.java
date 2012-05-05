// Aaron Zeng 20120504
// Chapter 07 Exercise 36

import java.util.*;
import java.io.*;

public class c7n36
{
    static int[] mem;
    static int acc, idx, foo, bar;
    static final int LEN = 100;

    static final int READ = 10;
    static final int WRITE = 11;

    static final int LOAD = 20;
    static final int STORE = 21;

    static final int ADD = 30;
    static final int SUBTRACT = 31;
    static final int DIVIDE = 32;
    static final int MULTIPLY = 33;

    static final int BRANCH = 40;
    static final int BRANCHNEG = 41;
    static final int BRANCHZERO = 42;
    static final int HALT = 43;

    static Scanner input;

    public static void main( String[] args )
    {
        input = new Scanner( System.in ).
            useDelimiter( "(\\s*)[^-0-9](\\s*)" );
        displayIntro();
        mem = new int[LEN];
        acc = 0;
        inputMem();
        displayDoneLoading();
        exec();
    }

    public static void displayIntro()
    {
        System.out.println( "*** Welcome to Simpletron! ***" );
        System.out.println( "Please enter your program one instruction   ***" );
        System.out.println( "(or data word) at a time.  I will display   ***" );
        System.out.println( "the location number and a question mark (?) ***" );
        System.out.println( "You then type the word for that location.   ***" );
        System.out.println( "Type -99999 to stop entering your program.  ***" );
    }

    public static void displayDoneLoading()
    {
        System.out.println( "*** Program loading completed ***" );
        System.out.println( "*** Program execution begins ***" );
    }

    public static void displayHalt()
    {
        System.out.println( "*** Simpletron Execution terminated ***" );
    }

    public static void dump()
    {
        System.out.println( "REGISTERS:" );
        System.out.printf( "%-20s%+05d\n", "acc", acc );
        System.out.printf( "%-20s   %02d\n", "idx", idx );
        System.out.printf( "%-20s%+05d\n", "mem[idx]", mem[idx] );
        System.out.printf( "%-20s   %02d\n", "operator", foo );
        System.out.printf( "%-20s   %02d\n", "operand", bar );
        System.out.println();
        System.out.println( "MEMORY:" );
        System.out.printf( "%8d%6d%6d%6d%6d%6d%6d%6d%6d%6d\n", 0, 1, 2, 3, 4, 5,
            6, 7, 8, 9 );
        for ( int i = 0; i < LEN; i += 10 )
        {
            System.out.printf( "%-3d", i );
            System.out.printf( "%+05d ", mem[i] );
            System.out.printf( "%+05d ", mem[i + 1] );
            System.out.printf( "%+05d ", mem[i + 2] );
            System.out.printf( "%+05d ", mem[i + 3] );
            System.out.printf( "%+05d ", mem[i + 4] );
            System.out.printf( "%+05d ", mem[i + 5] );
            System.out.printf( "%+05d ", mem[i + 6] );
            System.out.printf( "%+05d ", mem[i + 7] );
            System.out.printf( "%+05d ", mem[i + 8] );
            System.out.printf( "%+05d\n", mem[i + 9] );
        }
    }

    public static void inputMem()
    {
        for ( int idx = 0; idx < LEN; idx++ )
        {
            System.out.printf( "%02d ? ", idx );
            try
            {
                int n = input.nextInt();
                if ( n == -99999 )
                    break;
                else
                    mem[idx] = n;
            }
            catch ( NoSuchElementException e )
            {
                break;
            }
        }
    }

    public static void die()
    {
        System.err.printf( "*** SIMPLETRON DIES AT LINE %02d ***\n", idx );
        System.exit( 1 );
    }

    public static void errorZeroDivision()
    {
        System.err.println( "*** ERROR: DIVISION BY ZERO ***" );
        dump();
        die();
    }

    public static boolean overflow()
    {
        return ( acc > 9999 ) || ( acc < -9999 );
    }

    public static void errorOverflow()
    {
        System.err.println( "*** ERROR: OVERFLOW ***" );
        dump();
        die();
    }

    public static void exec()
    {
        idx = 0;
        while ( idx < LEN )
        {
            boolean incr = true;
            foo = mem[idx] / 100;
            bar = mem[idx] % 100;
            switch ( foo )
            {
                case READ:
                    System.out.printf( "Enter value for location %02d: ", bar );
                    mem[bar] = input.nextInt();
                    break;
                case WRITE:
                    System.out.printf( "%02d: %+05d\n", bar, mem[bar] );
                    break;
                case LOAD:
                    acc = mem[bar];
                    break;
                case STORE:
                    mem[bar] = acc;
                    break;
                case ADD:
                    acc += mem[bar];
                    if ( overflow() )
                        errorOverflow();
                    break;
                case SUBTRACT:
                    acc -= mem[bar];
                    if ( overflow() )
                        errorOverflow();
                    break;
                case DIVIDE:
                    // NB: ONLY DOES INTEGER DIVISION
                    if ( mem[bar] != 0 )
                        acc /= mem[bar];
                    else
                        errorZeroDivision();
                    break;
                case MULTIPLY:
                    acc *= mem[bar];
                    if ( overflow() )
                        errorOverflow();
                    break;
                case BRANCH:
                    idx = bar;
                    incr = false;
                    break;
                case BRANCHNEG:
                    if ( acc < 0 )
                    {
                        idx = bar;
                        incr = false;
                    }
                    break;
                case BRANCHZERO:
                    if ( acc == 0 )
                    {
                        idx = bar;
                        incr = false;
                    }
                    break;
                case HALT:
                    displayHalt();
                    dump();
                    System.exit( 0 );
                    break;
            }
            if ( incr )
                idx++;
        }
    }
}
