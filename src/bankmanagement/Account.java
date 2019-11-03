
package bankmanagement;


import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Account extends JFrame {
      Connection con;
      ResultSet rs;
       PreparedStatement pst;

    public Account() throws Exception {
        con= JavaConnect.Connect();
        setSize(1000,600);
         initComponents();
         setLocationRelativeTo(null);
    }
    
     private void initComponents() {
         
        buttonGroup1 = new ButtonGroup();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jComboBox1 = new JComboBox<>();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jComboBox2 = new JComboBox<>();
        jTextField6 = new JTextField();
        jTextField7 = new JTextField();
        jTextField8 = new JTextField();
        jTextField9 = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        randomPin();
         randomMICR();
         randomAcc();
        buttonGroup1.add(jRadioButton1);
         buttonGroup1.add(jRadioButton2);
          jRadioButton1.setActionCommand("Male");
           jRadioButton2.setActionCommand("Female");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         setIconImages(null);
         setLayout(null);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagement/ibank.png"))); // NOI18N
        jLabel1.setText("");
        jLabel1.setBounds(20, 10, 250, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Account No.");
        jLabel2.setBounds(150,120,100,30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("MICR NO.");
 jLabel3.setBounds(150,170,100,30);
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Pin");
jLabel4.setBounds(150,220,100,30);
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Account Type");
jLabel5.setBounds(150,270,100,30);
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Gender");
jLabel6.setBounds(150,320,100,30);
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Address");
jLabel7.setBounds(150,370,100,30);
        jTextField1.setEditable(false);
       jTextField1.setBounds(300,120,150,30);

        jTextField2.setEditable(false);
      jTextField2.setBounds(300,170,150,30);

        jTextField3.setEditable(false);
         jTextField3.setBounds(300,220,150,30);
         jTextField4.setBounds(700,120,150,30);
          jTextField5.setBounds(700,170,150,30);
           jTextField6.setBounds(700,270,150,30);
          jTextField7.setBounds(700,320,150,30);
 jTextField8.setBounds(700,370,150,30);
 jTextField9.setBounds(300,370,150,30);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Male");
 jRadioButton1.setBounds(300,270,60,30);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("Female");
 jRadioButton2.setBounds(370,270,100,30);
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Saving", "Current" }));
 jComboBox1.setBounds(300,320,150,30);
      
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Name");
jLabel9.setBounds(550,120,100,30);
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Date of Birth");
jLabel10.setBounds(550,170,100,30);
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nationality");
jLabel11.setBounds(550,220,100,30);
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Mobile No.");
jLabel12.setBounds(550,270,100,30);
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Balance");
jLabel13.setBounds(550,320,100,30);
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("PAN No.");
jLabel14.setBounds(550,370,100,30);
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Hindu", "Muslim", "Christain", "Other" }));
jComboBox2.setBounds(700,220,150,30);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Create");
         jButton1.setBounds(250,470,100,30);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBounds(450,470,100,30);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Clear");
        jButton3.setBounds(650,470,100,30);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
add( jLabel1);
        add( jLabel2);
          add( jLabel3); 
          add( jLabel4); 
          add( jLabel5); 
          add( jLabel6); 
          add( jLabel7); 
          add( jLabel9);
          add( jLabel10);
            add( jLabel11); 
            add( jLabel12);  
            add( jLabel13); 
            add( jLabel14);
              add( jTextField1);
              add( jTextField2);
              add( jTextField3);
              add( jTextField4);
              add( jTextField6);
              add( jTextField7);
              add( jTextField5);
              add( jTextField8);
              add( jTextField9); 
              add( jRadioButton1);
              add( jRadioButton2);
              add( jComboBox1); 
              add( jComboBox2);
              add( jButton1);
               add( jButton2);
               add( jButton3);
     }
     public void randomAcc()
{
    Random rd= new Random();
    jTextField1.setText(""+rd.nextInt(10000+1));
}
public void randomMICR()
{
    Random rd= new Random();
    jTextField2.setText(""+rd.nextInt(1000+1));
}
public void randomPin()
{
    Random rd= new Random();
    jTextField3.setText(""+rd.nextInt(1000+1));
}
     public void Bal() throws Exception{
    String sql="insert into Balance(Name,AccountNo,Bal) values(?,?,?)";
    pst=con.prepareStatement(sql);
    pst.setString(2,jTextField4.getText());
    pst.setString(1,jTextField1.getText());
    pst.setString(3,jTextField7.getText());
    pst.executeUpdate();
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
          try {
              setVisible(false);
              MyPage ob= new MyPage();
             ob.setVisible(true);
          } catch (Exception ex) {
              Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
          }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
           jTextField4.setText(" ");
          jTextField5.setText(" ");
           jTextField6.setText(" ");
            jTextField7.setText(" ");
            jTextField8.setText(" ");
            jTextField9.setText(" ");
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String sql="insert into Account values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
           pst= con.prepareStatement(sql);
           pst.setString(1,jTextField1.getText());
           pst.setString(2,jTextField2.getText());
           pst.setString(3,jTextField3.getText());
           pst.setString(4,(String)jComboBox1.getSelectedItem());
          
         pst.setString(5,buttonGroup1.getSelection().getActionCommand());
            pst.setString(6,jTextField9.getText());
             pst.setString(7,jTextField4.getText());
              pst.setString(8,jTextField5.getText());
              pst.setString(9,(String)jComboBox2.getSelectedItem());
              pst.setString(10,jTextField6.getText());
           pst.setInt(11,Integer.parseInt(jTextField7.getText()));
           pst.setString(12,jTextField8.getText());
          int c = pst.executeUpdate();
          if(c==0){
             JOptionPane.showMessageDialog(null, "Please fill up all details"); 
          }
          else{
           JOptionPane.showMessageDialog(null, "Successful\n you created  Account\n ");
           Bal();
          }
           
          
        }catch(Exception e){}
    }                                        

      private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
      
    public static void main(String args[]) {

          try {
          //    new Account().setVisible(true);
          } catch (Exception ex) {
              Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
}
