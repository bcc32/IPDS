// Aaron Zeng 20120522
// IPDS review exercise 09

import java.util.*;
import java.io.*;

public class NameBirthdayTest
{
    public static void main( String[] args )
    {
        NameBirthday nb1 = new NameBirthday();
        System.out.printf( "Default: %s\n", nb1 );
        System.out.printf( "Name: %s\n", nb1.getName() );
        System.out.printf( "Birthday: %d\n", nb1.getBirthday() );
        NameBirthday nb2 = new NameBirthday();
        nb2.setName( "Jane Doe" );
        nb2.setBirthday( 99999999 );
        System.out.printf( "%s\n", nb2 );
    }
}
