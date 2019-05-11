
import javax.swing.JOptionPane;

public class SignFrame extends javax.swing.JFrame {

    public SignFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSignIn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textUserName = new javax.swing.JTextField();
        buttonLogIn = new javax.swing.JButton();
        textUserPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelSignIn.setBorder(javax.swing.BorderFactory.createTitledBorder("Kullanıcı Girişi"));

        jLabel1.setText("Kullanıcı Adı:");

        jLabel2.setText("Kullanıcı Şifresi:");

        buttonLogIn.setText("Giriş");
        buttonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogInActionPerformed(evt);
            }
        });

        textUserPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textUserPasswordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelSignInLayout = new javax.swing.GroupLayout(panelSignIn);
        panelSignIn.setLayout(panelSignInLayout);
        panelSignInLayout.setHorizontalGroup(
            panelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignInLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSignInLayout.createSequentialGroup()
                        .addGroup(panelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(panelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSignInLayout.createSequentialGroup()
                                .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textUserPassword)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSignInLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelSignInLayout.setVerticalGroup(
            panelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignInLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogInActionPerformed
         SignIn g = new SignIn();
        
        boolean durum = g.Sign(textUserName.getText(), textUserPassword.getText());
        if (durum) {
            FrontFrame ff = new FrontFrame();
            ff.setVisible(true);
            dispose();
        }else{
            if (textUserName.getText().equals("") || textUserPassword.getText().equals("")) {
                
            }else{
                JOptionPane.showMessageDialog(this, "Kullanici Adi veya Parola hatalı.");
            }
        }
    }//GEN-LAST:event_buttonLogInActionPerformed

    private void textUserPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUserPasswordKeyReleased
        if (evt.getKeyCode() == 10) {
            SignIn g = new SignIn();

            boolean durum = g.Sign(textUserName.getText(), textUserPassword.getText());
            if (durum) {
                FrontFrame ns = new FrontFrame();
                ns.setVisible(true);
                dispose();
            }else{
                if (textUserName.getText().equals("") || textUserPassword.getText().equals("")) {

                }else{
                    JOptionPane.showMessageDialog(this, "Kullanici Adi veya Parola hatalı.");
                }
            }
        }
    }//GEN-LAST:event_textUserPasswordKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelSignIn;
    private javax.swing.JTextField textUserName;
    private javax.swing.JPasswordField textUserPassword;
    // End of variables declaration//GEN-END:variables
}
