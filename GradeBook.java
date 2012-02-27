// Aaron Zeng 20120227
// Chapter 03 Exercise 11

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
}
