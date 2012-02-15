// Aaron Zeng 20120215
// Chapter 03 Exercise 13

import java.util.*;
import java.io.*;

public class InvoiceTest
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        // get data from user
        System.out.print( "Enter part number: " );
        String partNumber = input.nextLine();
        System.out.print( "Enter description: " );
        String description = input.nextLine();
        System.out.print( "Enter quantity: " );
        int quantity = input.nextInt();
        System.out.print( "Enter price per unit: $" );
        double price = input.nextDouble();

        Invoice invoice = new Invoice( partNumber, description, quantity,
            price );

        // display information
        System.out.println( "Part number: " + invoice.getPartNumber() );
        System.out.println( "Description: " + invoice.getDescription() );
        System.out.println( "Quantity: " + invoice.getQuantity() );
        System.out.println( "Price: $" + invoice.getPrice() );
        System.out.printf( "Invoice amount: $%.2f\n",
            invoice.getInvoiceAmount() );
    }
}
