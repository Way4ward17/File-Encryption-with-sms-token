/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecryptiondecryption;

import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.UIManager;
import mail.Javaconnect;
import mail.sendmail;

/**
 *
 * @author MH Habib
 */
public class EDcrypt extends javax.swing.JFrame {
Connection conn;
PreparedStatement pstmt;
ResultSet rs;

    /**
     * Creates new form EDcrypt
     */
    private static SecretKeySpec secretKey;
    private static byte[] key;
    public static void setKey(String myKey)
    {
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
    public EDcrypt() {
        super("Decrypt Message");
        initComponents();
        conn = Javaconnect.ConnecrDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        text3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        text4 = new javax.swing.JTextArea();
        msg2 = new javax.swing.JTextField();
        decrypt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        message1 = new javax.swing.JLabel();
        message2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Encryption and Decryption ");
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(null);

        text3.setColumns(20);
        text3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        text3.setLineWrap(true);
        text3.setRows(5);
        text3.setToolTipText("");
        text3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jScrollPane3.setViewportView(text3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(60, 40, 720, 190);

        text4.setColumns(20);
        text4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        text4.setRows(5);
        text4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jScrollPane4.setViewportView(text4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(60, 280, 720, 210);

        msg2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(msg2);
        msg2.setBounds(320, 240, 190, 30);

        decrypt.setBackground(new java.awt.Color(0, 51, 51));
        decrypt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        decrypt.setForeground(new java.awt.Color(255, 255, 255));
        decrypt.setText("Decrypt");
        decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptActionPerformed(evt);
            }
        });
        getContentPane().add(decrypt);
        decrypt.setBounds(520, 240, 150, 30);

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(810, 5, 30, 20);

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(780, 5, 30, 20);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 0));
        jLabel4.setText("Decryption Key");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 240, 210, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Message to Decrypt");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 0, 300, 30);

        message1.setForeground(new java.awt.Color(204, 0, 0));
        message1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(message1);
        message1.setBounds(80, 450, 300, 20);

        message2.setForeground(new java.awt.Color(204, 0, 0));
        message2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(message2);
        message2.setBounds(470, 450, 320, 20);

        setSize(new java.awt.Dimension(866, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED); 
    }//GEN-LAST:event_jLabel3MousePressed

    private void decryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptActionPerformed
        // TODO add your handling code here:
       
        try{
            String sql = "Select * from msg where dna = ? AND password= ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, text3.getText());
            pstmt.setString(2, msg2.getText());
            rs = pstmt.executeQuery();
            if(rs.next()){
                text4.setText(rs.getString("msg")); 
            }else{
                text4.setText("Invalid key or DNA Sequence");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
//        String secret;
//        String strToDecrypt;
//        try
//        {
//            secret=msg2.getText();
//            strToDecrypt=text3.getText();
//            setKey(secret);
//            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
//            cipher.init(Cipher.DECRYPT_MODE, secretKey);
//            text4.setText(new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt))));
//            //return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
//        }
//        catch (Exception e)
//        {
//            text4.setText("Invalid Encrypted Data \n or \n Invalid Encryption Key");
//        }
    }//GEN-LAST:event_decryptActionPerformed

    /**
     * @param args the command line arguments
     */
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
                 new EDcrypt().setVisible(true);
            }
        });
              
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decrypt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel message1;
    private javax.swing.JLabel message2;
    private javax.swing.JTextField msg2;
    private javax.swing.JTextArea text3;
    private javax.swing.JTextArea text4;
    // End of variables declaration//GEN-END:variables
}
