package gui;

import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import ecryptiondecryption.EDcrypt;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import mail.sendmail;

/**
 *
 * @author Arlene
 */
public class Main extends javax.swing.JFrame
{   
    public Main(boolean usedTheApplication)
    { super("Main Menu");
        initComponents();
       
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
//        addWindowListener( new WindowAdapter()
//        {
//            public void windowClosing(WindowEvent e)
//            {
//                JFrame frame = (JFrame)e.getSource();
//                Toolkit.getDefaultToolkit().beep();
//                int result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit the application?", "Exit Application", JOptionPane.YES_NO_OPTION);
//
//                if (result == JOptionPane.YES_OPTION)
//                {
////                    if(usedTheApplication)
////                    {
////                        new ThankYouDialog(new javax.swing.JFrame(),true).setVisible(rootPaneCheckingEnabled);
////                    }
////             
//                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                }
//                    
//            }
//        });
//    }

   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        encryptButton = new javax.swing.JButton();
        decryptButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        decryptButton1 = new javax.swing.JButton();
        decryptButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        heading.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("Send Encrypted & Decrypted Files");

        jLabel1.setFont(new java.awt.Font("Harrington", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("I want to");

        encryptButton.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        encryptButton.setText("Encrypt My Files");
        encryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptButtonActionPerformed(evt);
            }
        });

        decryptButton.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        decryptButton.setText("Decrypt My Files");
        decryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("© 2019");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        decryptButton1.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        decryptButton1.setText("Send Mail");
        decryptButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButton1ActionPerformed(evt);
            }
        });

        decryptButton2.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        decryptButton2.setText("Decrypt My Message");
        decryptButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 79, Short.MAX_VALUE)
                                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(decryptButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(decryptButton2)
                                    .addComponent(decryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(encryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(encryptButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decryptButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decryptButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(decryptButton1)
                .addGap(63, 63, 63)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encryptButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_encryptButtonActionPerformed
    {//GEN-HEADEREND:event_encryptButtonActionPerformed
        FileChooser fileChooser = new FileChooser("ENCRYPT");
        fileChooser.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_encryptButtonActionPerformed

    private void decryptButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_decryptButtonActionPerformed
    {//GEN-HEADEREND:event_decryptButtonActionPerformed
        FileChooser fileChooser = new FileChooser("DECRYPT");
        fileChooser.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_decryptButtonActionPerformed

    private void decryptButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptButton1ActionPerformed
        // TODO add your handling code here:
      
        sendmail send = new sendmail();
        send.setVisible(true);
        
    }//GEN-LAST:event_decryptButton1ActionPerformed

    private void decryptButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptButton2ActionPerformed
        // TODO add your handling code here:
        EDcrypt crypt = new EDcrypt();
        crypt.setVisible(true);
    }//GEN-LAST:event_decryptButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
       
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
                new Main(true).setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decryptButton;
    private javax.swing.JButton decryptButton1;
    private javax.swing.JButton decryptButton2;
    private javax.swing.JButton encryptButton;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
