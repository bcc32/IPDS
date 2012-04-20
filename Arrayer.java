// Aaron Zeng 20120420
// Array operations

public class Arrayer
{
    private int [] arr;

    public Arrayer( int size )
    {
        arr = new int[size];
    }

    public void setVal( int loc, int val )
    {
        arr[loc] = val;
    }

    public int getVal( int loc )
    {
        return arr[loc];
    }

    public void printArr()
    {
        System.out.print( "[" + arr[0] );
        for ( int i = 1; i < arr.length; i++ )
        {
            if ( i % 10 == 0 )
                System.out.println();
            System.out.print( ", " + arr[i] );
        }
        System.out.println( "]" );
    }

    public int min()
    {
        int minimum = arr[0];
        for ( int i = 1; i < arr.length; i++ )
            if ( arr[i] < minimum )
                minimum = arr[i];
        return minimum;
    }

    public int max()
    {
        int maximum = arr[0];
        for ( int i = 1; i < arr.length; i++ )
            if ( arr[i] > maximum )
                maximum = arr[i];
        return maximum;
    }
}
