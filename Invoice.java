// Aaron Zeng 20120215
// Chapter 03 Exercise 13

public class Invoice
{
    // instance variables
    String partNumber, description;
    int quantity;
    double price;

    // constructor
    public Invoice( String pn, String desc, int quan, double pr )
    {
        partNumber = pn;
        description = desc;
        quantity = quan;
        price = pr;
    }

    // set methods
    public void setPartNumber( String pn )
    {
        partNumber = pn;
    }

    public void setDescription( String desc )
    {
        description = desc;
    }

    public void setQuantity( int quan )
    {
        quantity = quan;
    }

    public void setPrice( double pr )
    {
        price = pr;
    }

    // get methods
    public String getPartNumber()
    {
        return partNumber;
    }

    public String getDescription()
    {
        return description;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getPrice()
    {
        return price;
    }

    // calculates the invoice amount
    public double getInvoiceAmount()
    {
        if ( quantity < 0 )
            quantity = 0;
        if ( price < 0 )
            price = 0.0;
        return quantity * price;
    }
}
