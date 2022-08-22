/**
 * This class handels all the GUI involved in this program.
 * It contains a static array list for storing all the data related to renting and selling bike. 
 * 
 * Created by Suraj Shrestha on 21th July 2017
 * 21th July 2017
 */

import java.awt.Container;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.util.ArrayList;


/**
 * swing and awt has been imported to this class to create GUI.
 */
public class BikeRentalUI implements ActionListener
{
    private JFrame frame;
    private JLabel lblBikeCompany;
    private JButton btnAddBikeToRent, btnAddBikeToSell, btnRentBike,btnSellBike, btnReturnBike, btnDisplay;
    public static ArrayList<Bike> list;
    public static int count = 1;
    
    
    /**
     * main method to run the program.
     */
    public static void main(String[] args){
        BikeRentalUI bike = new BikeRentalUI();
    } 
    
    /**
     * Class Constructor creating frame 
     */
    public BikeRentalUI()     
    {
        list = new ArrayList<Bike>();
        frame = new JFrame ("Bike Company");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(null);
        
        lblBikeCompany = new JLabel("Bike Company");
        lblBikeCompany.setFont(new Font("Times New Roman", Font.PLAIN, 50));
        lblBikeCompany.setForeground(Color.blue);
        lblBikeCompany.setBounds(220,10,400,80);
        contentPane.add(lblBikeCompany);
        
        btnAddBikeToRent = new JButton("Add Bike To Rent");
        btnAddBikeToRent.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        btnAddBikeToRent.setBounds(30,100,300,60);
        contentPane.add(btnAddBikeToRent);
        btnAddBikeToRent.addActionListener(this);
        
        btnAddBikeToSell = new JButton("Add Bike To Sell");
        btnAddBikeToSell.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        btnAddBikeToSell.setBounds(360,100,300,60);
        contentPane.add(btnAddBikeToSell);
        btnAddBikeToSell.addActionListener(this);
        
        btnRentBike = new JButton("Rent Bike");
        btnRentBike.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        btnRentBike.setBounds(30,180,300,60);
        contentPane.add(btnRentBike);
        btnRentBike.addActionListener(this);
        
        btnSellBike = new JButton("Sell Bike");
        btnSellBike.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        btnSellBike.setBounds(360,180,300,60);
        contentPane.add(btnSellBike);
        btnSellBike.addActionListener(this);
        
        btnReturnBike = new JButton("Return");
        btnReturnBike.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        btnReturnBike.setBounds(30,260,300,60);
        contentPane.add(btnReturnBike);
        btnReturnBike.addActionListener(this);
        
        btnDisplay = new JButton("Display");
        btnDisplay.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        btnDisplay.setBounds(360,260,300,60);
        contentPane.add(btnDisplay);
        btnDisplay.addActionListener(this);
        
        frame.setSize(720,420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * method for handling different action performed
     * used for functioning the buttons in GUI.
     */
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == btnAddBikeToRent){
            count = list.size() + 1;
            
            BikeToRentUI rentBike = new BikeToRentUI();
        }
        else if(ae.getSource() == btnRentBike){
            count = list.size() + 1;
            
            RentBikeUI rentBike = new RentBikeUI();
        }
        else if(ae.getSource() == btnReturnBike){
            count = list.size() + 1;
            
            ReturnBikeUI returnBike = new ReturnBikeUI();
        }
        else if(ae.getSource() == btnAddBikeToSell){
            count = list.size() + 1;
            
            BikeToSellUI sellBike = new BikeToSellUI();
        }
        else if(ae.getSource() == btnSellBike){
            count = list.size() + 1;
            
            SellBikeUI sellBike = new SellBikeUI();
        }
        else{
            this.display();
        }
    }
        
    /**
     * method to display details of bike and customer
     */
    private void display()
    {
        for (Bike val : list) {
            if (val instanceof BikeToRent) {
                 BikeToRent rent = (BikeToRent) val;
                 System.out.println("\n---Everest Motors : BIKE TO RENT---");
                 System.out.println("Name: " + rent.getDescription() +"\nCompany: " + rent.getManufacturer() +"\nDaily Rate: " + rent.getDailyRate() +"\n" + "Loan Status: " + rent.getBikeLoanStatus());
                 System.out.println("*******************************");
                
                 if (rent.getBikeLoanStatus() == true){
                    System.out.println("-------Customer Details--------");
                    System.out.println("Customer Name: " + rent.getCustomerName() + "\nContact: "+ rent.getContactNumber() + "\nEmail: " + rent.getEmail() + "\nRented for:" + rent.getNumberOfDays()+" days" + "\nTotal Cost: "+ rent.getTotalRentalCost());
                    System.out.println("*******************************");  
                }
            } 
            else if (val instanceof BikeToSell) {
                BikeToSell sell = (BikeToSell) val;
                System.out.println("\n---Everest Motors : BIKE TO SELL---");
                System.out.println("Name: " + sell.getDescription() + "\nCompany: "+ sell.getManufacturer() + "\nPrice: " + sell.getPrice() +"\nTax Rate: "+ sell.getTaxAmount() +"\nSelling Status: " + sell.getSellingStatus()+ "\nTotal Amount :"+sell.getTotalAmount());
                System.out.println("*******************************");
                if (sell.getSellingStatus() == true){
                    System.out.println("-------Customer Details--------");
                    System.out.println("Customer Name: " + sell.getCustomerName() + "\nContact: "+ sell.getContactNumber() + "\nEmail: " + sell.getEmail() +"\nSellingDate: " + sell.getSellingDate());
                    System.out.println("*******************************");  
                }
            }
        }
    }
}
