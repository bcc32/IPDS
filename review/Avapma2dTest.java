// Aaron Zeng 20120531
// IPDS review Exercise 42

public class Avapma2dTest
{
    public static void main( String[] args )
    {
        Avapma2d avp = new Avapma2d();
        avp.zeroJ();
        avp.printJ();
        avp.randJ();
        System.out.printf( "Sum: %d\n", avp.sumJ() );
        System.out.printf( "Average: %f\n", avp.averageJ() );
        avp.printJ();
    }
}
