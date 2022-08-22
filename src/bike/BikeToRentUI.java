/**
 * This class provides users to add bike to rent through GUI. 
 * 
 * Created by Suraj Shrestha on 22nd July 2017
 * 22nd July 2017
 */

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.util.ArrayList;


/**
 * swing and awt has been imported to this class to create GUI.
 */

public class BikeToRentUI implements ActionListener
{
    private JFrame frame;
    private JLabel lblAddBikeToRent, lblBikeId, lblDescription, lblCompany, lblDailyRate;
    private JTextField txtBikeId, txtDescription, txtCompany, txtDailyRate;
    private JButton btnClear, btnConfirm;
    
    /**
     * Class Constructor creating frame and specifying position of different text fields, buttons and labels
     */
    public BikeToRentUI()
    {
        frame = new JFrame ("Everest Motors: Add Rent Bike");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(null);
        
        lblAddBikeToRent = new JLabel("Add Bike To Rent");
        lblAddBikeToRent.setFont(new Font("Times New Roman", Font.PLAIN, 50));
        lblAddBikeToRent.setForeground(Color.blue);
        lblAddBikeToRent.setBounds(160,10,400,80);
        contentPane.add(lblAddBikeToRent);
        
        lblBikeId = new JLabel("Bike Id");
        lblBikeId.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblBikeId.setBounds(50,70,200,60);
        contentPane.add(lblBikeId);
        
        txtBikeId = new JTextField();
        txtBikeId.setBounds(160,90,130,30);
        txtBikeId.setEditable(false);
        contentPane.add(txtBikeId);
        txtBikeId.setText(Integer.toString(BikeRentalUI.count));
        
        lblDescription = new JLabel("Description");
        lblDescription.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblDescription.setBounds(50,110,200,60);
        contentPane.add(lblDescription);
        
        txtDescription = new JTextField();
        txtDescription.setBounds(160,130,130,30);
        contentPane.add(txtDescription);
        
        lblCompany = new JLabel("Company");
        lblCompany.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblCompany.setBounds(330,110,200,60);
        contentPane.add(lblCompany);
        
        txtCompany = new JTextField();
        txtCompany.setBounds(430,130,130,30);
        contentPane.add(txtCompany);
        
        lblDailyRate = new JLabel("Daily Rate");
        lblDailyRate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblDailyRate.setBounds(50,150,200,60);
        contentPane.add(lblDailyRate);
        
        txtDailyRate = new JTextField();
        txtDailyRate.setBounds(160,170,130,30);
        contentPane.add(txtDailyRate);
        
        btnClear = new JButton("Clear");
        btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnClear.setBounds(330,210,110,30);
        contentPane.add(btnClear);
        btnClear.addActionListener(this);
        
        btnConfirm = new JButton("Confirm");
        btnConfirm.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnConfirm.setBounds(450,210,110,30);
        contentPane.add(btnConfirm);
        btnConfirm.addActionListener(this);
        
        frame.setSize(810,390);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
    /**
     * method for handeling different action performed
     * used for functioning the buttons in GUI.
     */
    public void actionPerformed(ActionEvent ae)
    {
        try{
            if(ae.getSource() == btnConfirm){
                String bikeId = txtBikeId.getText();
                String description = txtDescription.getText();
                String company = txtCompany.getText();
                String dailyRate = txtDailyRate.getText();
                int intDailyRate = Integer.parseInt(dailyRate);
                if(!description.equals("") && !company.equals("") && !dailyRate.equals("")){
                    BikeToRent rentBike = new BikeToRent(description, company, intDailyRate);// BikeToRent method from class BikeToRent to rent bike 
                    
                    BikeRentalUI.list.add(rentBike);//Storing details of the bike rented to list in class BikeRentalUI
                    JOptionPane.showMessageDialog(frame,"Information Message\nThe bike has been added for renting","Info",JOptionPane.INFORMATION_MESSAGE);
                    BikeRentalUI.count += 1;
                    txtBikeId.setText(Integer.toString(BikeRentalUI.count));
                    txtDescription.setText("");
                    txtCompany.setText("");
                    txtDailyRate.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Error Message\nPlease do not leave field blank!!","Error",JOptionPane.ERROR_MESSAGE);
                    }
            }
            else{
                txtDescription.setText("");
                txtCompany.setText("");
                txtDailyRate.setText("");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(frame,"Error Message\nPlease enter valid  number!!","Error",JOptionPane.ERROR_MESSAGE);   
        }
    }
 }
        
  
