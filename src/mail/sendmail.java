/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import static ecryptiondecryption.EDcrypt.setKey;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Way4ward
 */

public class sendmail extends javax.swing.JFrame {
String filePath;
    File f;
    
   
Connection conn;
PreparedStatement pstmt;
ResultSet rs;


 private static SecretKeySpec secretKey;
 String DNASequence = "";
 private static byte[] key;
 public static void setKey(String myKey){
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
   
    
    public sendmail() {
        super("Send Message");
        initComponents();
         conn = Javaconnect.ConnecrDB();
        Random();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kButton3 = new keeptoo.KButton();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        msg1 = new javax.swing.JTextArea();
        subject = new javax.swing.JTextField();
        to = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        filenamer = new javax.swing.JTextField();
        phonenumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kButton4 = new keeptoo.KButton();
        filekey = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        phonenumber1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(616, 490));
        setResizable(false);
        getContentPane().setLayout(null);

        kButton3.setText("Send Mail");
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton3);
        kButton3.setBounds(500, 420, 80, 30);

        kButton1.setText("Attach");
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton1);
        kButton1.setBounds(500, 380, 80, 30);

        kButton2.setText("Home");
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton2);
        kButton2.setBounds(30, 280, 67, 26);

        msg1.setColumns(20);
        msg1.setRows(5);
        msg1.setText("The message itself");
        jScrollPane1.setViewportView(msg1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 180, 370, 190);

        subject.setText("The Subject");
        getContentPane().add(subject);
        subject.setBounds(120, 140, 370, 29);

        to.setText("supersondultimate@gmail.com");
        to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toActionPerformed(evt);
            }
        });
        getContentPane().add(to);
        to.setBounds(120, 10, 370, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("File Key");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 390, 70, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Your Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 110, 70, 15);

        password.setEnabled(false);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(120, 420, 190, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Message");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 190, 70, 15);

        filenamer.setEditable(false);
        filenamer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filenamerActionPerformed(evt);
            }
        });
        getContentPane().add(filenamer);
        filenamer.setBounds(280, 380, 210, 29);

        phonenumber.setText("09091458969");
        phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberActionPerformed(evt);
            }
        });
        getContentPane().add(phonenumber);
        phonenumber.setBounds(140, 60, 350, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("To");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 20, 70, 15);

        kButton4.setText("Refresh Key");
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton4);
        kButton4.setBounds(330, 420, 120, 30);

        filekey.setEditable(false);
        filekey.setEnabled(false);
        filekey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filekeyActionPerformed(evt);
            }
        });
        getContentPane().add(filekey);
        filekey.setBounds(120, 380, 160, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Msg Key");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 430, 70, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Subject:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 150, 70, 15);

        phonenumber1.setText("David");
        phonenumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumber1ActionPerformed(evt);
            }
        });
        getContentPane().add(phonenumber1);
        phonenumber1.setBounds(120, 100, 370, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Rec. Phone No.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 60, 110, 15);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        try{
                   
               
                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);
                f = chooser.getSelectedFile();
                filePath = f.getAbsolutePath();     
                filenamer.setText(f.getName());
                System.out.println(filePath);
        }catch(Exception e){
            System.out.println("No file selected");
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toActionPerformed

    }//GEN-LAST:event_toActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
            dispose();
    }//GEN-LAST:event_kButton2ActionPerformed

    private void sendMessage(String rec, String message) throws MalformedURLException, IOException{
      //  URL myUrl = new URL("https://www.smsmobile24.com/index.php?option=com_spc&comm=spc_api&username=Encrypt_File&password=ponmile23&sender=Encrypt_File&recipient="+rec+"&message="+"Sender pin is "+password.getText()+"&");
        
      URL a = new URL("https://www.smsmobile24.com/index.php?option=com_spc&comm=spc_api&username=Encrypt_File&password=ponmile23&sender=DNASequence&recipient="+rec+"&message="+URLEncoder.encode(message, "UTF-8")+"");
        
        URLConnection connect = a.openConnection();
        try(InputStream is = connect.getInputStream()){}
    }
private void insert(String sender, String receiver, String password, String dna, String msg){
      try{
       String sql = "INSERT INTO msg (sender , receiver , password,DNA,msg) VALUES (?,?,?,?,?)";
       pstmt = conn.prepareStatement(sql);
       pstmt.setString(1, sender);
       pstmt.setString(2, receiver);
       pstmt.setString(3, password);
       pstmt.setString(4, dna);
       pstmt.setString(5, msg);
        pstmt.execute();
        System.out.println("Saved");
      }catch(Exception e){
        System.out.println(e);
      }
    }
    
    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
    try {
        // TODO add your handling code here:
         String strToEncrypt=msg1.getText();
           String  secret= password.getText();
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
           String encrypMessgae = Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
           // System.out.println(encrypMessgae);
       String baba=  "";
     
            int getLength = msg1.getText().length();
            for(int i = 1; i<=getLength; i ++){
                int a = (int)(Math.random() * 4 + 1);
                //System.out.println(a);
                if(a == 1){
                   baba = "A"; 
                   DNASequence = DNASequence + baba;
                }else if(a == 2){
                   baba = "T"; 
                   DNASequence = DNASequence + baba;
            }else if(a == 3){
                   baba = "C"; 
                   DNASequence = DNASequence + baba;
            }else if(a == 4){
                   baba = "G"; 
                   DNASequence = DNASequence + baba;
            }
                   //DNASequence = DNASequence + baba;
            }
            
            System.out.println(DNASequence);
            if(filenamer.getText().isEmpty()){

            SendMail1(DNASequence);
       
            }  else{
                  SendMail(DNASequence);
                }
            
      
     
    } catch (NoSuchAlgorithmException ex) {
        Logger.getLogger(sendmail.class.getName()).log(Level.SEVERE, null, ex);
    } catch (NoSuchPaddingException ex) {
        Logger.getLogger(sendmail.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InvalidKeyException ex) {
        Logger.getLogger(sendmail.class.getName()).log(Level.SEVERE, null, ex);
    } catch (UnsupportedEncodingException ex) {
        Logger.getLogger(sendmail.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalBlockSizeException ex) {
        Logger.getLogger(sendmail.class.getName()).log(Level.SEVERE, null, ex);
    } catch (BadPaddingException ex) {
        Logger.getLogger(sendmail.class.getName()).log(Level.SEVERE, null, ex);
    } catch (MessagingException ex) {
        Logger.getLogger(sendmail.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }//GEN-LAST:event_kButton3ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void filenamerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filenamerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filenamerActionPerformed

    private void phonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumberActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
       Random();
    }//GEN-LAST:event_kButton4ActionPerformed

    private void filekeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filekeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filekeyActionPerformed

    private void phonenumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumber1ActionPerformed
private void Random(){
     String DNA = "DNA";
     Random rd1 = new Random();
     String baba = (""+rd1.nextInt(9999999 + 1));
     password.setText(DNA+baba);
}
    
    /**
     * @param args the command line arguments
     */
    
     private void SendMail1(String Msg) throws AddressException, MessagingException{
         String From = "encryptionf86@gmail.com";
        Properties props = System.getProperties();
  
     props.put("mail.smtp.host", "smtp.gmail.com");
     props.put("mail.smtp.socketFactory.port","465");
     props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
     props.put("mail.smtp.auth","true");
     props.put("mail.smtp.port","465");
     
     Session session = Session.getDefaultInstance(props,
             new javax.mail.Authenticator() {
             protected PasswordAuthentication getPasswordAuthentication(){
               return new PasswordAuthentication("encryptionf86@gmail.com","ponmile23");  
             }   
             }
             );
     try{
         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress(From));
         message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to.getText()));
         message.setSubject(subject.getText());
         message.setText(Msg);
         
         JOptionPane.showMessageDialog(null, "Message Sent");
          insert(phonenumber1.getText(), to.getText(),password.getText(), DNASequence, msg1.getText());
            if(filekey.getText().isEmpty()){
               sendMessage(phonenumber.getText(),"The DNA Message  key from "+phonenumber1.getText()+" is "+password.getText());         
            }else{
            sendMessage(phonenumber.getText(),"The DNA Message  key from "+phonenumber1.getText()+" is "+password.getText()+" and File Key is:"+filekey.getText());
            }
      
     } catch(Exception e){
        
        Logger.getLogger(sendmail.class.getName()).log(Level.SEVERE, null, e);
    }
   
    }
        
    
    
     private void SendMail(String msg) throws AddressException, MessagingException{
        String From = "encryptionf86@gmail.com";
        Properties props = System.getProperties();
  
     props.put("mail.smtp.host", "smtp.gmail.com");
     props.put("mail.smtp.socketFactory.port","465");
     props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
     props.put("mail.smtp.auth","true");
     props.put("mail.smtp.port","465");
     
     Session session = Session.getDefaultInstance(props,
             new javax.mail.Authenticator() {
             protected PasswordAuthentication getPasswordAuthentication(){
               return new PasswordAuthentication("encryptionf86@gmail.com","ponmile23");  
             }   
             }
             );
     try{
         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress(From));
         message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to.getText()));
         message.setSubject(subject.getText());
         
         MimeBodyPart messageBodyPart = new MimeBodyPart();
         messageBodyPart.setText(msg);
         Multipart multipart = new MimeMultipart();
         multipart.addBodyPart(messageBodyPart);
         messageBodyPart = new MimeBodyPart();
         DataSource source  = new FileDataSource(filePath);
         messageBodyPart.setDataHandler(new DataHandler(source));
         messageBodyPart.setFileName(f.getName());
         multipart.addBodyPart(messageBodyPart);
         message.setContent(multipart);
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Message Sent");
            insert(phonenumber1.getText(), to.getText(),password.getText(), DNASequence, msg1.getText());
            if(filekey.getText().isEmpty()){
               sendMessage(phonenumber.getText(),"The DNA Message  key from "+phonenumber1.getText()+" is "+password.getText());         
            }else{
            sendMessage(phonenumber.getText(),"The DNA Message  key from "+phonenumber1.getText()+" is "+password.getText()+" and File Key is:"+filekey.getText());
            }
            }catch(HeadlessException | MessagingException e){
         System.out.println(e);
     } catch (IOException ex) {
        Logger.getLogger(sendmail.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    }
    //CAGCAGTCGGACTACTGT
    // DNA3627578
   
    public static void main(String args[]) {
       UIManager.put("Synthetica.window.decoration", Boolean.FALSE);
        try
        {
        UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
        }
        catch (Exception e)
        {
        e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sendmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField filekey;
    private javax.swing.JTextField filenamer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KButton kButton4;
    private javax.swing.JTextArea msg1;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phonenumber;
    private javax.swing.JTextField phonenumber1;
    private javax.swing.JTextField subject;
    private javax.swing.JTextField to;
    // End of variables declaration//GEN-END:variables
}
