// Aaron Zeng 20120227
// Chapter 03 Exercise 11

import java.util.*;
import java.io.*;

public class GradeBookTest
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter course name: " );
        String courseName = input.nextLine();

        System.out.print( "Enter instructor name: " );
        String instructorName = input.nextLine();

        GradeBook book = new GradeBook( courseName, instructorName );

        book.displayMessage();
    }
}
