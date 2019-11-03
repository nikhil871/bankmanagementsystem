
package bankmanagement;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class ProgressBar extends JFrame implements Runnable {

  Connection con;
  ResultSet rs;
  PreparedStatement pst;
  int s=0;
  Thread th;
  
    public ProgressBar() throws Exception {
      con= JavaConnect.Connect();
        setSize(500, 500);
        initComponents();
        setLocationRelativeTo(null);
       th=new Thread((Runnable)this);
       
    }
    public void setUpLoading(){
        setVisible(false);
        th.start();
    }
  @Override
    public void run() {
       try{ for(int i=0;i<=200;i++)
        {
            s=s+1;
            int m=jProgressBar1.getMaximum();
            int v= jProgressBar1.getValue();
            if(v<m){
                jProgressBar1.setValue(jProgressBar1.getValue()+1);
            }
            else{
                i=201;
                setVisible(false);
               MyPage ob = new MyPage();
               ob.setVisible(true);
                
            }
            th.sleep(50);
        }
       }catch(Exception e){}
    }
         private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagement/ibank.png"))); // NOI18N
        jLabel1.setText("");
         jLabel1.setBounds(20,10,250,80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Redirecting...");
   jLabel2.setBounds(175,190,150,30);
     jProgressBar1.setBounds(150,150,200,30);
     add(jLabel1);
     add(jLabel2);
     add(jProgressBar1);
    }
       private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;   
     public static void main(String args[]) {
      try {
        //  new ProgressBar().setVisible(true);
      } catch (Exception ex) {
          Logger.getLogger(ProgressBar.class.getName()).log(Level.SEVERE, null, ex);
      }
     }
}