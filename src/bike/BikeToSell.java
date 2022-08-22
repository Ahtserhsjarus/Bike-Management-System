/**
 * Child Class of Class Bike.
 * Class for selling bikes 
 * and keeping track of customer details related to bike sold.
 * 
 * Created by Suraj Shrestha on 18th July 2017
 * 18th July 2017
 */

public class BikeToSell extends Bike
{
    /**
     * sellingDate Stirng dataype, 
     * price, taxAmount and totalAmount interger datatype 
     * and  sellingStatus boolean datatype to keep track of bike to be sell.
    */
    private int price;
    private double taxAmount;
    private double totalAmount;
    private String sellingDate;
    private boolean sellingStatus;
    
    /**
     * Class constructor specifying number of objects to create.
     * 
     * Initilazing Description, manufacturer and taxAmount through constructor's parameter  
     * and also initialising sellingDate, taxAmonunt, totalAmount to empty String and sellingStatus to false.
     */
    public BikeToSell(String description, String manufacturer, int price, double taxAmount, double totalAmount)
    {
        super(description,manufacturer);
        this.price = price;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount ;
        sellingDate = "";
        sellingStatus = false;
    }
    
    /**
     * returns price(cost of the bike) 
    */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * returns TaxAmount(tax of the bike) 
    */
    public double getTaxAmount() 
    {
        return taxAmount;
    }
    
    /**
    * returns TotalCost(total cost to sell/buy bike) 
    */
    public double getTotalAmount()
    {
        return totalAmount;
    }
    
    /**
    * returns sellingDate(date on which the bike is sold) 
    */
    public String getSellingDate() 
    {
        return sellingDate;
    }
    
    /**
    * returns SellingStatus(check if sold or not) 
    */
    public boolean getSellingStatus() 
    {
        return sellingStatus;
    }
    
    /**
    * method to sell the bike storing details of the customer 
    */
    public void sellBike(String customerName, String contactNumber, String email, String sellingDate)
    {
        if (sellingStatus == false){
            setCustomerName(customerName);
            setContactNumber(contactNumber);
            setEmail(email);
            this.sellingDate = sellingDate;
            this.totalAmount = price + price * taxAmount/100;
            this.sellingStatus = true;
        }
        else{
            System.out.println("Bike has already been sold");
        }
    }   
}
