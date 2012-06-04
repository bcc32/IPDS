// Aaron Zeng 20120604
// Avapma

public class Appointment
{
    private String appointmentTitle;
    private Date appointmentDate;

    public Appointment()
    {
        appointmentTitle = "Appointment";
        appointmentDate = new Date();
    }

    public Appointment( String title, Date date )
    {
        appointmentTitle = title;
        appointmentDate = new Date( date );
    }

    public void setTitle( String title )
    {
        appointmentTitle = title;
    }

    public void setDate( int day, int month, int year )
    {
        appointmentDate.setDay( day );
        appointmentDate.setMonth( month );
        appointmentDate.setYear( year );
    }

    public String getTitle()
    {
        return appointmentTitle;
    }

    public Date getDate()
    {
        return appointmentDate;
    }

    public int getDay()
    {
        return appointmentDate.getDay();
    }

    public int getMonth()
    {
        return appointmentDate.getMonth();
    }

    public int getYear()
    {
        return appointmentDate.getYear();
    }
}
