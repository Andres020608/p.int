/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginTest;

import java.awt.Color;


public class Login extends javax.swing.JFrame {
int xMouse, yMouse;

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        exittxt = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        nameEnterprise = new javax.swing.JLabel();
        AdminLabel = new javax.swing.JLabel();
        Admintxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        PasswordLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        passtxt = new javax.swing.JPasswordField();
        Entrybottom = new javax.swing.JPanel();
        entrartxtbtn = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        bg.setMinimumSize(new java.awt.Dimension(800, 500));
        bg.setName(""); // NOI18N
        bg.setPreferredSize(new java.awt.Dimension(800, 500));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 255, 255));

        exittxt.setBackground(new java.awt.Color(255, 255, 255));
        exittxt.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        exittxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exittxt.setText("X");
        exittxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exittxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exittxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exittxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exittxt, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exittxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 735, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 30));

        TitleLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        TitleLabel.setText("Inicio de Sesión");
        bg.add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 180, 30));

        nameEnterprise.setFont(new java.awt.Font("Freestyle Script", 0, 24)); // NOI18N
        nameEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameEnterprise.setText("JESSICA JOYERIA");
        bg.add(nameEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 170, 40));

        AdminLabel.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        AdminLabel.setText("ADMINISTRADOR");
        AdminLabel.setToolTipText("");
        bg.add(AdminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 330, -1));

        Admintxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Admintxt.setForeground(new java.awt.Color(204, 204, 204));
        Admintxt.setText("Ingrese el Administrador");
        Admintxt.setBorder(null);
        Admintxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AdmintxtMousePressed(evt);
            }
        });
        bg.add(Admintxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 330, -1));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 330, 10));

        PasswordLabel.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        PasswordLabel.setText("Contraseña");
        bg.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 330, -1));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 330, -1));

        passtxt.setForeground(new java.awt.Color(204, 204, 204));
        passtxt.setText("********");
        passtxt.setBorder(null);
        passtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passtxtMousePressed(evt);
            }
        });
        bg.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 330, -1));

        Entrybottom.setBackground(new java.awt.Color(0, 134, 190));
        Entrybottom.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Entrybottom.setName("ENTRAR"); // NOI18N

        entrartxtbtn.setBackground(new java.awt.Color(0, 134, 190));
        entrartxtbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrartxtbtn.setText("Entrar");
        entrartxtbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrartxtbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrartxtbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrartxtbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EntrybottomLayout = new javax.swing.GroupLayout(Entrybottom);
        Entrybottom.setLayout(EntrybottomLayout);
        EntrybottomLayout.setHorizontalGroup(
            EntrybottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrartxtbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        EntrybottomLayout.setVerticalGroup(
            EntrybottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrartxtbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(Entrybottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 30));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2024-10-23 at 8.35.36 PM.jpeg"))); // NOI18N
        bg.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdmintxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdmintxtMousePressed
        if(Admintxt.getText().equals("Ingrese el Administrador")){
        Admintxt.setText("");
        Admintxt.setForeground(Color.black);
        }
        if(String.valueOf(passtxt.getPassword()).isEmpty()){
        passtxt.setText("********");
        passtxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_AdmintxtMousePressed

    private void passtxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passtxtMousePressed
        if(String.valueOf(passtxt.getPassword()).equals("********")){
        passtxt.setText("");
        passtxt.setForeground(Color.black);
        }
        
        if(Admintxt.getText().isEmpty()){
        Admintxt.setText("Ingrese el Administrador");
        Admintxt.setForeground(Color.gray);
        }  
    }//GEN-LAST:event_passtxtMousePressed

    private void entrartxtbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrartxtbtnMouseEntered
       Entrybottom.setBackground(new Color (0,153,223));
    }//GEN-LAST:event_entrartxtbtnMouseEntered

    private void entrartxtbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrartxtbtnMouseExited
        Entrybottom.setBackground(new Color (0,134,190) );
    }//GEN-LAST:event_entrartxtbtnMouseExited

    private void entrartxtbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrartxtbtnMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Intento de Login con los datos: \nAdministrador: " +Admintxt.getText()+ "\nContraseña: "+ String.valueOf(passtxt.getPassword()) +"Login"+javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_entrartxtbtnMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exittxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittxtMousePressed
        System.exit(0);
    }//GEN-LAST:event_exittxtMousePressed

    private void exittxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittxtMouseEntered
        exitbtn.setBackground(Color.red);
        exittxt.setForeground(Color.black);
    }//GEN-LAST:event_exittxtMouseEntered

    private void exittxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittxtMouseExited
        exitbtn.setBackground(Color.white);
        exitbtn.setForeground(Color.black);
    }//GEN-LAST:event_exittxtMouseExited

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JTextField Admintxt;
    private javax.swing.JPanel Entrybottom;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel entrartxtbtn;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JLabel exittxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel icon;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel nameEnterprise;
    private javax.swing.JPasswordField passtxt;
    // End of variables declaration//GEN-END:variables
}
