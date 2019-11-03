/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagement;


import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import javax.swing.UIManager;

public class Authentication extends javax.swing.JFrame {

     Connection con;
  ResultSet rs;
  PreparedStatement pst;
    public Authentication() throws Exception{
         con= JavaConnect.Connect();
         setSize(550, 500);
         initComponents();
         setLocationRelativeTo(null);
    }
 private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
     setLayout(null);
       jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagement/ibank.png"))); // NOI18N
        jLabel1.setText("");
        jLabel1.setBounds(20, 10, 250, 80);
jTextField1.setBounds(300, 120, 150, 30);
jTextField2.setBounds(300, 220, 150, 30);
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Employee ID");
jLabel2.setBounds(100, 120, 150, 30);
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Password");
jLabel4.setBounds(100, 220, 150, 30);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("New Employee");
        jButton1.setBounds(100, 350, 150, 30);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Login");
        jButton2.setBounds(300, 350, 100, 30);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add( jLabel1);
        add( jLabel2);
         add( jLabel4);
        add( jButton2); 
        add( jButton1);
        add( jTextField1);
        add( jTextField2);
        
 }
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String sql="select * from Employee where EmployeeID=? and Password=?";
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1,jTextField1.getText());
            pst.setString(2,jTextField2.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                setVisible(false);
               ProgressBar ob=new ProgressBar();
               ob.setUpLoading();
               ob.setVisible(true);
                rs.close();
                pst.close();
                System.out.println("progress Bar");
            }
            else{
                JOptionPane.showMessageDialog(null,"Incorrect credential");
            }
        }
        catch(Exception e){}
        finally{
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){
        }
        }
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         try {
             setVisible(false);
             Employee ob= new Employee();
             ob.setVisible(true);
         } catch (Exception ex) {
             Logger.getLogger(Authentication.class.getName()).log(Level.SEVERE, null, ex);
         }
    }                                        
 public static void main(String args[]) throws Exception {
     new Authentication().setVisible(true);
  //   UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
 }
 private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
}