
/**
 * This class provides users to sell a bike through GUI. 
 * 
 * Created by Suraj Shrestha on 22nd July 2017
 * 22nd July 2017
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

/**
 * swing and awt has been imported to this class to create GUI.
 */
public class SellBikeUI implements ActionListener
{
    private JFrame frame;
    private JLabel lblSellBike, lblBikeId, lblDescription, lblCompany, lblCustomerName, lblContact, lblEmail, lblSellDate, lblTaxRate, lblPrice, lblTotalAmount;
    private JTextField txtBikeId, txtDescription, txtCompany, txtCustomerName, txtContact, txtEmail, txtSellDate, txtTaxRate, txtPrice, txtTotalAmount;
    private JButton btnCheck, btnClear, btnConfirm;
    
     /**
     * Class Constructor creating frame 
     */
    public SellBikeUI()
    {
        frame = new JFrame ("Sell Bike");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(null);
        
        lblSellBike = new JLabel("Sell Bike");
        lblSellBike.setFont(new Font("Times New Roman", Font.PLAIN, 50));
        lblSellBike.setForeground(Color.blue);
        lblSellBike.setBounds(240,10,400,80);
        contentPane.add(lblSellBike);
        
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
        
        lblSellDate = new JLabel("Sell Date");
        lblSellDate.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblSellDate.setBounds(45,230,200,60);
        contentPane.add(lblSellDate);
        
        txtSellDate = new JTextField();
        txtSellDate.setBounds(160,250,130,30);
        contentPane.add(txtSellDate);
        txtSellDate.setEditable(false);
        
        lblTaxRate = new JLabel("Tax Rate(%)");
        lblTaxRate.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblTaxRate.setBounds(330,230,200,60);
        contentPane.add(lblTaxRate);
        
        txtTaxRate = new JTextField();
        txtTaxRate.setBounds(430,250,130,30);
        contentPane.add(txtTaxRate);
        txtTaxRate.setEditable(false);
        
        lblPrice = new JLabel("Price");
        lblPrice.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblPrice.setBounds(45,270,200,60);
        contentPane.add(lblPrice);
        
        txtPrice = new JTextField();
        txtPrice.setBounds(160,290,130,30);
        contentPane.add(txtPrice);
        txtPrice.setEditable(false);
        
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
        
        btnClear = new JButton("Clear");
        btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        btnClear.setBounds(330,380,110,30);
        contentPane.add(btnClear);
        btnClear.addActionListener(this);
        
        btnConfirm = new JButton("Confirm");
        btnConfirm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        btnConfirm.setBounds(450,380,110,30);
        contentPane.add(btnConfirm);
        btnConfirm.addActionListener(this);
        btnConfirm.setEnabled(false);
        
        frame.setSize(650,550);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
    /**
     * method for handling different action performed by user in GUI
     */
    public void actionPerformed(ActionEvent ae)
    {
        try{
            if(ae.getSource() == btnCheck){
                int index = Integer.parseInt(txtBikeId.getText());
                BikeToSell sellBike  = (BikeToSell)BikeRentalUI.list.get(index-1);
                if(index>0 && index<= BikeRentalUI.list.size()){
                    if(sellBike.getSellingStatus() == false){
                        JOptionPane.showMessageDialog(frame,"Info Message\nThe bike is available!!","Info",JOptionPane.INFORMATION_MESSAGE);
                        txtDescription.setText(sellBike.getDescription());
                        txtCompany.setText(sellBike.getManufacturer());
                        txtPrice.setText(Double.toString(sellBike.getPrice()));
                        txtTaxRate.setText(Double.toString(sellBike.getTaxAmount()));
                        double price = sellBike.getPrice();
                        double tax = sellBike.getTaxAmount();
                        double totalAmount = price + (tax/100)*price;
                  
                        txtTotalAmount.setText(Double.toString(totalAmount));
                        btnConfirm.setEnabled(true);
                        txtCustomerName.setEditable(true);
                        txtContact.setEditable(true);
                        txtEmail.setEditable(true);
                        txtSellDate.setEditable(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"Info Message\nSorry the bike in not available!!","Info",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                else{
                        JOptionPane.showMessageDialog(frame,"Info Message\nPlease enter valid number!!","Error",JOptionPane.ERROR_MESSAGE);
                    }
            }
            else if(ae.getSource() == btnConfirm){
                 String customerName = txtCustomerName.getText();
                 String contact = txtContact.getText();
                 String email = txtEmail.getText();
                 String sellingDate = txtSellDate.getText();
                 if(!customerName.equals("") && !contact.equals("") && !email.equals("") && !sellingDate.equals("")){
                    int index = Integer.parseInt(txtBikeId.getText());
                    BikeToSell sellBike  = (BikeToSell)BikeRentalUI.list.get(index-1);
                    sellBike.sellBike(customerName,contact,email, sellingDate);
                    JOptionPane.showMessageDialog(frame,"Info Message\nBike has been sold","Info",JOptionPane.INFORMATION_MESSAGE);
                    
                    btnConfirm.setEnabled(false);
                    txtCustomerName.setEditable(false);
                    txtContact.setEditable(false);
                    txtEmail.setEditable(false);
                    txtSellDate.setEditable(false);
                    txtBikeId.setText("");
                    txtDescription.setText("");
                    txtCustomerName.setText("");
                    txtContact.setText("");
                    txtEmail.setText("");
                    txtSellDate.setText("");
                    txtTaxRate.setText("");
                    txtTotalAmount.setText("");
                    txtPrice.setText("");
                    txtCompany.setText("");
                } 
                else{
                    JOptionPane.showMessageDialog(frame,"Error Message\nPlease do not leave field blank!!","Error",JOptionPane.ERROR_MESSAGE);
                }   
            }
            else{
                btnConfirm.setEnabled(false);
                txtBikeId.setText("");
                txtDescription.setText("");
                txtCustomerName.setText("");
                txtContact.setText("");
                txtEmail.setText("");
                txtSellDate.setText("");
                txtTaxRate.setText("");
                txtTotalAmount.setText("");
                txtPrice.setText("");
                txtCompany.setText("");
            }
        }   
        catch(Exception e){
            JOptionPane.showMessageDialog(frame,"Error Message\nPlease enter valid  number!!","Error",JOptionPane.ERROR_MESSAGE);
            
        }
    }
}
