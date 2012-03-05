// Aaron Zeng 20120227
// Chapter 03 Exercise 11

import java.util.*;

public class GradeBook
{
    private String courseName, instructorName;

    // constructor
    public GradeBook( String cname, String iname )
    {
        courseName = cname;
        instructorName = iname;
    }

    // set method(s)
    public void setCourseName( String name )
    {
        courseName = name;
    }

    public void setInstructorName( String name )
    {
        instructorName = name;
    }

    // get method(s)
    public String getCourseName()
    {
        return courseName;
    }

    public String getInstructorName()
    {
        return instructorName;
    }

    public void displayMessage()
    {
        System.out.printf( "Welcome to the grade book for %s!\n", 
            getCourseName() );
        System.out.printf( "This course is presented by: %s\n",
            getInstructorName() );
    }

    public void determineClassAverage()
    {
        Scanner input = new Scanner( System.in );

        int total = 0, gradeCounter = 0, grade;
        double average;

        for ( System.out.print( "Enter grade (-1 to quit): " ),
            grade = input.nextInt(); grade != -1; System.out.print(
            "Enter grade (-1 to quit): " ), grade = input.nextInt() )
        {
            total += grade;
            gradeCounter++;
        }

        average = (double)total / gradeCounter;

        System.out.printf( "\nTotal of all 10 grades is %d\n", total );
        System.out.printf( "Class average is %f\n", average );
    }
}
