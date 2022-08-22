/**
 * This class provides users to rent a bike through GUI.
 * 
 * Created by Suraj Shrestha on 22nd July 2017
 * 22nd July 2017
 */

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

/**
 * swing and awt has been imported to this class to create GUI.
 */
public class RentBikeUI implements ActionListener
{
   private JFrame frame;
   private JLabel lblRentBike, lblBikeId, lblDescription, lblCompany, lblCustomerName, lblContact, lblEmail, lblHireDate, lblNoOfDays, lblDailyRate, lblTotalAmount;
   private JTextField txtBikeId, txtDescription, txtCompany, txtCustomerName, txtContact, txtEmail, txtHireDate, txtNoOfDays, txtDailyRate, txtTotalAmount;
   private JButton btnCheck, btnCalculateRent, btnClear, btnConfirm;
   private JTextArea txtInfo;
   
   /**
   * Class Constructor creating frame and specifying position of different text fields, buttons and labels
   */
   public RentBikeUI()
   {
       frame = new JFrame ("Everest Motors: Rent Bike");
       Container contentPane = frame.getContentPane();
       contentPane.setLayout(null);
        
       lblRentBike = new JLabel("Rent Bike");
       lblRentBike.setFont(new Font("Times New Roman", Font.PLAIN, 50));
       lblRentBike.setForeground(Color.blue);
       lblRentBike.setBounds(240,10,400,80);
       contentPane.add(lblRentBike);
       
       lblBikeId = new JLabel("Bike Id");
       lblBikeId.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       lblBikeId.setBounds(45,70,200,60);
       contentPane.add(lblBikeId);
        
       txtBikeId = new JTextField();
       txtBikeId.setBounds(160,90,130,30);
       contentPane.add(txtBikeId);
        
       lblDescription = new JLabel("Description");
       lblDescription.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       lblDescription.setBounds(45,110,200,60);
       contentPane.add(lblDescription);
        
       txtDescription = new JTextField();
       txtDescription.setBounds(160,130,130,30);
       contentPane.add(txtDescription);
       txtDescription.setEditable(false);
        
       lblCompany = new JLabel("Company");
       lblCompany.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       lblCompany.setBounds(330,110,200,60);
       contentPane.add(lblCompany);
        
       txtCompany = new JTextField();
       txtCompany.setBounds(430,130,130,30);
       contentPane.add(txtCompany);
       txtCompany.setEditable(false);
        
       lblCustomerName = new JLabel("Customer Name");
       lblCustomerName.setFont(new Font("Times New Roman", Font.PLAIN, 17));
       lblCustomerName.setBounds(45,150,150,60);
       contentPane.add(lblCustomerName);
        
       txtCustomerName = new JTextField();
       txtCustomerName.setBounds(160,170,130,30);
       contentPane.add(txtCustomerName);
       txtCustomerName.setEditable(false);
        
       lblContact = new JLabel("Contact");
       lblContact.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       lblContact.setBounds(45,190,100,60);
       contentPane.add(lblContact);
        
       txtContact = new JTextField();
       txtContact.setBounds(160,210,130,30);
       contentPane.add(txtContact);
       txtContact.setEditable(false);
        
       lblEmail = new JLabel("Email");
       lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       lblEmail.setBounds(330,190,100,60);
       contentPane.add(lblEmail);
        
       txtEmail = new JTextField();
       txtEmail.setBounds(430,210,130,30);
       contentPane.add(txtEmail);
       txtEmail.setEditable(false);
        
       lblHireDate = new JLabel("Hire Date");
       lblHireDate.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       lblHireDate.setBounds(45,230,200,60);
       contentPane.add(lblHireDate);
        
       txtHireDate = new JTextField();
       txtHireDate.setBounds(160,250,130,30);
       contentPane.add(txtHireDate);
       txtHireDate.setEditable(false);
        
       lblNoOfDays = new JLabel("No of Days");
       lblNoOfDays.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       lblNoOfDays.setBounds(330,230,200,60);
       contentPane.add(lblNoOfDays);
        
       txtNoOfDays = new JTextField();
       txtNoOfDays.setBounds(430,250,130,30);
       contentPane.add(txtNoOfDays);
       txtNoOfDays.setEditable(false);
        
       lblDailyRate = new JLabel("Daily Rate");
       lblDailyRate.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       lblDailyRate.setBounds(45,270,200,60);
       contentPane.add(lblDailyRate);
        
       txtDailyRate = new JTextField();
       txtDailyRate.setBounds(160,290,130,30);
       contentPane.add(txtDailyRate);
       txtDailyRate.setEditable(false);
        
       lblTotalAmount = new JLabel("Total Amount");
       lblTotalAmount.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       lblTotalAmount.setBounds(45,310,200,60);
       contentPane.add(lblTotalAmount);
        
       txtTotalAmount = new JTextField();
       txtTotalAmount.setBounds(160,330,130,30);
       contentPane.add(txtTotalAmount);
       txtTotalAmount.setEditable(false);
        
       btnCheck = new JButton("Check");
       btnCheck.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       btnCheck.setBounds(330,340,110,30);
       contentPane.add(btnCheck);
       btnCheck.addActionListener(this);
        
       btnCalculateRent = new JButton("Calculate Rent");
       btnCalculateRent.setFont(new Font("Times New Roman", Font.PLAIN, 14));
       btnCalculateRent.setBounds(450,340,120,30);
       contentPane.add(btnCalculateRent);
       btnCalculateRent.addActionListener(this);
       btnCalculateRent.setEnabled(false);
       
       btnClear = new JButton("Clear");
       btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       btnClear.setBounds(330,380,110,30);
       contentPane.add(btnClear);
       btnClear.addActionListener(this);
        
       btnConfirm = new JButton("Confirm");
       btnConfirm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       btnConfirm.setBounds(450,380,120,30);
       contentPane.add(btnConfirm);
       btnConfirm.addActionListener(this);
       btnConfirm.setEnabled(false);
       
       txtInfo = new JTextArea(5, 40);;
       txtInfo.setBounds(50,420,550,40);
       contentPane.add(txtInfo);
       txtInfo.setVisible(false);
       txtInfo.setEditable(false);
        
       frame.setSize(650,600);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
    /**
     * method for handling different action performed
     * used for functioning the buttons in GUI.
     */
   public void actionPerformed(ActionEvent ae)
   {
        try{
            if(ae.getSource() == btnCheck){
                int index = Integer.parseInt(txtBikeId.getText());
                BikeToRent rentBike  = (BikeToRent)BikeRentalUI.list.get(index-1);
                if(index>0 && index<= BikeRentalUI.list.size()){
                    if(rentBike.getBikeLoanStatus() == false){
                        JOptionPane.showMessageDialog(frame,"Info Message\nThe bike is available!!","Info",JOptionPane.INFORMATION_MESSAGE);
                        txtDescription.setText(rentBike.getDescription());
                        txtCompany.setText(rentBike.getManufacturer());
                        txtDailyRate.setText(Double.toString(rentBike.getDailyRate()));
                        txtNoOfDays.setEditable(true);
                        btnCalculateRent.setEnabled(true);
                        
                        txtInfo.setVisible(true);
                        frame.setSize(650,590);
                        txtInfo.setText("Enter number of days To calculate Total Amount");
                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"Info Message\nSorry the bike in not available!!","Info",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            else if(ae.getSource() == btnCalculateRent){
                String numberOfDays = txtNoOfDays.getText();
                int intNumberOfDays = Integer.parseInt(numberOfDays);
                String dailyRate = txtDailyRate.getText();
                double intDailyRate = Double.parseDouble(dailyRate);
                txtCustomerName.setEditable(true);
                txtHireDate.setEditable(true);
                txtContact.setEditable(true);
                txtEmail.setEditable(true);
                btnConfirm.setEnabled(true);
                txtInfo.setVisible(false);
                frame.setSize(650,600);
                if(!numberOfDays.equals("") && numberOfDays != null){
                    double totalAmount = intDailyRate * intNumberOfDays;
                    txtTotalAmount.setText(Double.toString(totalAmount));
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Error Message\nPlease do not leave No of Days blank!!","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else if(ae.getSource() == btnConfirm){
                String customerName = txtCustomerName.getText();
                String contact = txtContact.getText();
                String email = txtEmail.getText();
                String bikeHireDate = txtHireDate.getText();
                int numberOfDays = Integer.parseInt(txtNoOfDays.getText());
                if(!customerName.equals("") && !contact.equals("") && !email.equals("") && !bikeHireDate.equals("")){
                    int index = Integer.parseInt(txtBikeId.getText());
                    BikeToRent rentBike  = (BikeToRent)BikeRentalUI.list.get(index-1);
                    rentBike.rentBikeOut(customerName,contact,email, bikeHireDate,numberOfDays);
                    JOptionPane.showMessageDialog(frame,"Info Message\nBike has been rent out","Info",JOptionPane.INFORMATION_MESSAGE);
                    
                    txtBikeId.setText("");
                    txtDescription.setText("");
                    txtCompany.setText("");
                    txtCustomerName.setText("");
                    txtContact.setText("");
                    txtEmail.setText("");
                    txtHireDate.setText("");
                    txtDailyRate.setText("");
                    txtNoOfDays.setText("");
                    txtTotalAmount.setText("");
                    txtCustomerName.setEditable(false);
                    txtHireDate.setEditable(false);
                    txtContact.setEditable(false);
                    txtEmail.setEditable(false);
                    txtNoOfDays.setEditable(false);
                    btnConfirm.setEnabled(false);
                    btnCalculateRent.setEnabled(false);
                } 
                else{
                    JOptionPane.showMessageDialog(frame,"Error Message\nPlease do not leave field blank!!","Error",JOptionPane.ERROR_MESSAGE);
                }   
            }
            else{
                
                txtBikeId.setText("");
                txtDescription.setText("");
                txtCustomerName.setText("");
                txtCompany.setText("");
                txtContact.setText("");
                txtEmail.setText("");
                txtHireDate.setText("");
                txtDailyRate.setText("");
                txtNoOfDays.setText("");
                txtTotalAmount.setText("");
                txtInfo.setVisible(false);
                frame.setSize(650,600);
                btnConfirm.setEnabled(false);
                btnCalculateRent.setEnabled(false);
                txtCustomerName.setEditable(false);
                txtHireDate.setEditable(false);
                txtContact.setEditable(false);
                txtEmail.setEditable(false);
                txtNoOfDays.setEditable(false);
            }
        }   
        catch(Exception e){
            JOptionPane.showMessageDialog(frame,"Error Message\nPlease enter valid  number!!","Error",JOptionPane.ERROR_MESSAGE);
            
        }
    }
}