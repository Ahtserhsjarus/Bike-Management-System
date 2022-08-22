
/**
 * This is a parent class of BikeToRent and BikeTosell 
 * This class got attributes related to bike and customer.
 * There are different method for accessing and mutating the attributes.
 * It has a private method for displaying details about the bike and customer. 
 * 
 * Created by Suraj Shrestha on 18th July 2017
 * 18th July 2017
 */
public class Bike
{
    /**
     * description and manufacturer are String datatype to keep track of bike's details.
     * CustomerName, contactNumber and email are String datatype to keep  track of customer's details.
    */
    private String description;
    private String manufacturer;
    private String customerName;
    private String contactNumber;
    private String email;
    
    /**
     * Class constructor specifying number of objects to create.
     * 
     * Initilazing Description, manufacturer through constructor's parameter  
     * and also initialising customerName, contactNumber and email to empty String.
     */
    
    public Bike(String description, String manufacturer)
    {
        this.description = description;
        this.manufacturer = manufacturer;
        customerName = "";
        contactNumber = "";
        email = "";
    }
    
    /**
     * returns Description(short specification of bike) 
    */
    public String getDescription() 
    {
        return description;
    }
    
    /**
     * returns Manufacturer(company of bike) 
    */
    public String getManufacturer() 
    {
        return manufacturer;
    }
    
    /**
     * returns customer's name 
    */
    public String getCustomerName() 
    {
        return customerName;
    }
    
    /**
     * returns contact number of customer 
    */
    public String getContactNumber() 
    {
        return contactNumber;
    }
    
    /**
     * returns email of customer 
    */
    public String getEmail() 
    {
        return email;
    }

    /**
     * sets new value to customer name 
    */
    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }
    
    /**
     * sets new value to customer's contact
    */
    public void setContactNumber(String contactNumber) 
    {
        this.contactNumber = contactNumber;
    }
    
    /**
     * sets new value to customer's email 
    */
    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    /**
     * displays bike details and customer name 
    */
    public void display()
    {
        System.out.println("Bike Description = "  + description);
        System.out.println("Manufacturer = " + manufacturer);
        
        if(customerName != "" && contactNumber !="" && email !=""){
            System.out.println("Customer's Name = " + customerName);
            System.out.println("Contact Name = " + contactNumber);
            System.out.println("E-mail = " + email);
          }
    }
}
