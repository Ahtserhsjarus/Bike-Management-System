/**
 *This class provides users to add bike to sell through GUI.
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

/**
 * swing and awt has been imported to this class to create GUI.
 */
public class BikeToSellUI implements ActionListener
{
    private JFrame frame;
    private JLabel lblAddBikeToSell, lblBikeId, lblDescription, lblCompany, lblPrice, lblTaxRate;
    private JTextField txtBikeId, txtDescription, txtCompany, txtPrice, txtTaxRate;
    private JButton btnClear, btnConfirm;
    
    /**
     * Class Constructor creating frame and specifying position of different text fields, buttons and labels
     */
    public BikeToSellUI()
    {
        frame = new JFrame ("Everest Motors: Add Sell Bike");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(null);
        
        lblAddBikeToSell = new JLabel("Add Bike To Sell");
        lblAddBikeToSell.setFont(new Font("Times New Roman", Font.PLAIN, 50));
        lblAddBikeToSell.setForeground(Color.blue);
        lblAddBikeToSell.setBounds(160,10,400,80);
        contentPane.add(lblAddBikeToSell);
        
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
        lblDescription.setBounds(45,110,200,60);
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
        
        lblPrice = new JLabel("Price");
        lblPrice.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblPrice.setBounds(50,150,200,60);
        contentPane.add(lblPrice);
        
        txtPrice = new JTextField();
        txtPrice.setBounds(160,170,130,30);
        contentPane.add(txtPrice);
        
        lblTaxRate = new JLabel("Tax Rate(%)");
        lblTaxRate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblTaxRate.setBounds(50,190,200,60);
        contentPane.add(lblTaxRate);
        
        txtTaxRate = new JTextField();
        txtTaxRate.setBounds(160,210,130,30);
        contentPane.add(txtTaxRate);
        
        btnClear = new JButton("Clear");
        btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnClear.setBounds(330,250,110,30);
        contentPane.add(btnClear);
        btnClear.addActionListener(this);
        
        btnConfirm = new JButton("Confirm");
        btnConfirm.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnConfirm.setBounds(450,250,110,30);
        contentPane.add(btnConfirm);
        btnConfirm.addActionListener(this);
        
        frame.setSize(800,400);
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
                String price = txtPrice.getText();
                String taxrate = txtTaxRate.getText();
                int intPrice = Integer.parseInt(price);
                int intTaxRate = Integer.parseInt(taxrate);
                int totalAmount = intPrice + intPrice * intTaxRate/100;
                if(!description.equals("") && !company.equals("") && !price.equals("") && !taxrate.equals("")){
                    BikeToSell sellBike = new BikeToSell(description, company, intPrice, intTaxRate, totalAmount);// BikeToSell method from class BikeToSell to sell bike 
                    BikeRentalUI.list.add(sellBike);//Storing details of the bike sold to list in class BikeRentalUI
                    JOptionPane.showMessageDialog(frame,"Information Message\nThe bike has been added for selling","Info",JOptionPane.INFORMATION_MESSAGE);
                    BikeRentalUI.count += 1;
                    txtBikeId.setText(Integer.toString(BikeRentalUI.count));
                    txtDescription.setText("");
                    txtCompany.setText("");
                    txtPrice.setText("");
                    txtTaxRate.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Error Message\nPlease do not leave field blank!!","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                txtDescription.setText("");
                txtCompany.setText("");
                txtPrice.setText("");
                txtTaxRate.setText("");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(frame,"Error Message\nPlease enter valid  number!!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
