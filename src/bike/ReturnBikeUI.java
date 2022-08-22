
/**
 * This class provides users make bike avilable if bike is rented. 
 * 
 * Created by Suraj Shrestha on 23rd July 2017
 * 23rd July 2017
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
public class ReturnBikeUI implements ActionListener
{
   private JFrame frame;
   private JLabel lblReturnRentBike, lblBikeId;
   private JTextField txtBikeId;
   private JButton btnClear, btnConfirm;
    
   /**
   * Class Constructor creating frame and specifying position of different text fields, buttons and labels
   */
   public ReturnBikeUI()
   {
       frame = new JFrame ("Return Rent Bike");
       Container contentPane = frame.getContentPane();
       contentPane.setLayout(null);
        
       lblReturnRentBike = new JLabel("Return Rent Bike");
       lblReturnRentBike.setFont(new Font("Times New Roman", Font.PLAIN, 50));
       lblReturnRentBike.setForeground(Color.blue);
       lblReturnRentBike.setBounds(100,10,400,80);
       contentPane.add(lblReturnRentBike);
       
       lblBikeId = new JLabel("Bike Id");
       lblBikeId.setFont(new Font("Times New Roman", Font.PLAIN, 20));
       lblBikeId.setBounds(50,70,200,60);
       contentPane.add(lblBikeId);
        
       txtBikeId = new JTextField();
       txtBikeId.setBounds(160,90,200,30);
       contentPane.add(txtBikeId);
    
       btnClear = new JButton("Clear");
       btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       btnClear.setBounds(160,150,100,30);
       contentPane.add(btnClear);
       btnClear.addActionListener(this);
        
       btnConfirm = new JButton("Confirm");
       btnConfirm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       btnConfirm.setBounds(270,150,100,30);
       contentPane.add(btnConfirm);
       btnConfirm.addActionListener(this);
        
       frame.setSize(550,350);
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
                String id = txtBikeId.getText(); 
                 int intId = Integer.parseInt(id);
                if ( id!= null || !id.equals("")){
                    int index = Integer.parseInt(txtBikeId.getText());
                    BikeToRent rentBike  = (BikeToRent)BikeRentalUI.list.get(index-1);
                    if(rentBike.getBikeLoanStatus() == false){
                        JOptionPane.showMessageDialog(frame,"Error Message\nBike is already available!!","Info",JOptionPane.INFORMATION_MESSAGE); 
                    }
                    else{
                        rentBike.makeBikeAvailable();//method makeBikeAvailable to return rented bike
                        JOptionPane.showMessageDialog(frame,"Error Message\nBike is now available!!","Info",JOptionPane.INFORMATION_MESSAGE); 
                    } 
                    txtBikeId.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Error Message\nPlease do not leave field blank!!","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            else{
                txtBikeId.setText("");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(frame,"Error Message\nThere is no bike registered with this Id ","Error",JOptionPane.ERROR_MESSAGE);
        }
   }
}