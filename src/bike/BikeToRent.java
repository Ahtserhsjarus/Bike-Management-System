
/**
 * child class of Class Bike.
 * Class for renting and returning bikes 
 * and keeping track of customer details related to bike renting.
 * 
 * Created by Suraj Shrestha on 18th July 2017
 * 18th July 2017
 */
public class BikeToRent extends Bike 
{
    /**
     * bikeHireDate Stirng dataype, 
     * numberOfDays, dailyRate and totalRentalCost interger datatype 
     * and  bikeLoanStatus boolean datatype to keep track of bike to be rented.
    */
    private  String bikeHireDate;
    private  int numberOfDays;
    private  double dailyRate; 
    private  double totalRentalCost;
    private  boolean bikeLoanStatus;
    
    /**
     * Class constructor specifying number of objects to create.
     * 
     * Initilazing Description, manufacturer and dailyRate through constructor's parameter  
     * and also initialising bikeHireDate, numberOfDays, totalRentalCost to empty String and bikeLoanStatus to false.
     */
    public BikeToRent(String description,String manufacturer,int dailyRate)
    {
        super(description,manufacturer);
        this.dailyRate = dailyRate;
        bikeHireDate = "";
        numberOfDays = 0;
        totalRentalCost = 0;
        bikeLoanStatus = false;
    }
    
     /**
     * returns Description(date on which the bike is hired) 
    */
    public String getBikeHireDate()
    {
        return bikeHireDate;
    }
    
     /**
     * returns DailyRate(cost per one day) 
    */
    public double getDailyRate()
    {
        return dailyRate;
    }
    
     /**
     * returns number of days for which the bike has been hired 
    */
    public int getNumberOfDays()
    {
        return numberOfDays;
    }
    
     /**
     * returns totalRentalCost(total amount of bike for hiring ) 
    */
    public double getTotalRentalCost()
    {
        return totalRentalCost;
    }
  
    /**
     * returns BikeLoanStatus(check if the bike is available) 
    */
    public boolean getBikeLoanStatus()
    {
        return bikeLoanStatus;
    }
    
    /**
     * bike renting method by checking required information of customer.
    */
    public void rentBikeOut(String customerName,String contactNumber, String email, String bikeHireDate, int numberOfdays)
    {
     if (bikeLoanStatus == true){
        System.out.println("Sorry!! the has already been Hired!!");
        System.out.println("Date of hire = "+bikeHireDate);
        System.out.println("Number of days = "+ numberOfDays);
        }
     else{
         setCustomerName(customerName);
         setContactNumber(contactNumber);
         setEmail(email);
         this.bikeHireDate = bikeHireDate;
         this.numberOfDays = numberOfdays;
         this.bikeLoanStatus = true;
         double rate = dailyRate;
         this.totalRentalCost = rate * numberOfDays;
        }   
    } 
    
    /**
     * make bike available to company after the bike is returned by customer
    */
    public void makeBikeAvailable()
    {
        if(this.bikeLoanStatus == false){
            System.out.println("The bike is already available!!");  
        }
        else{
            setCustomerName("");
            setContactNumber(""); 
            setEmail("");
            numberOfDays = 0;
            bikeHireDate = "";
            bikeLoanStatus = false;
        }
    }
}
