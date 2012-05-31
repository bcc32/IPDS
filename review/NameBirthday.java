// Aaron Zeng 20120522
// IPDS review exercise 08

import java.util.*;
import java.io.*;

public class NameBirthday
{
    String name;
    int birthday;

    public NameBirthday()
    {
        name = "John Smith";
        birthday = 20000101;
    }

    public String getName()
    {
        return name;
    }

    public int getBirthday()
    {
        return birthday;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public void setBirthday( int birthday )
    {
        this.birthday = birthday;
    }

    public String toString()
    {
        return String.format( "%s's birthday is %d.", name, birthday );
    }
}
