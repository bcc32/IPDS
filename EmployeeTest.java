// Aaron Zeng 20120215
// Chapter 03 Exercise 14

import java.util.*;
import java.io.*;

public class EmployeeTest
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        // get data for first employee
        System.out.print( "Enter first name of first employee: " );
        String firstName1 = input.nextLine();
        System.out.print( "Enter last name of first employee: " );
        String lastName1 = input.nextLine();
        System.out.print( "Enter salary of first employee: $" );
        double salary1 = input.nextDouble();
        input.nextLine(); // Scanner.nextDouble doesn't reach end-of-line
        System.out.println(); // separate groups of data
        Employee employee1 = new Employee( firstName1, lastName1, salary1 );

        // get data for second employee
        System.out.print( "Enter first name of second employee: " );
        String firstName2 = input.nextLine();
        System.out.print( "Enter last name of second employee: " );
        String lastName2 = input.nextLine();
        System.out.print( "Enter salary of second employee: $" );
        double salary2 = input.nextDouble();
        Employee employee2 = new Employee( firstName2, lastName2, salary2 );

        // display yearly salaries
        System.out.println(); // separate input from output (prettier)
        System.out.println( "Yearly salaries:" );
        System.out.printf( "%s %s: $%.2f\n", employee1.getFirstName(),
            employee1.getLastName(), employee1.getYearlySalary() );
        System.out.printf( "%s %s: $%.2f\n", employee2.getFirstName(),
            employee2.getLastName(), employee2.getYearlySalary() );
        System.out.println();

        // 10% raise each
        employee1.setSalary( 1.10 * employee1.getSalary() );
        employee2.setSalary( 1.10 * employee2.getSalary() );

        // display yearly salaries after raise
        System.out.println( "After a 10% raise each:" );
        System.out.printf( "%s %s: $%.2f\n", employee1.getFirstName(),
            employee1.getLastName(), employee1.getYearlySalary() );
        System.out.printf( "%s %s: $%.2f\n", employee2.getFirstName(),
            employee2.getLastName(), employee2.getYearlySalary() );
    }
}
