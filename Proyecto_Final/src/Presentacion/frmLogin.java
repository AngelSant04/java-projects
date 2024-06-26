/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Accesodatos.clsUsuarioDAO;
import Entidades.clsUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class frmLogin extends javax.swing.JFrame {    
    
    public frmLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pswPasword = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(370, 200));
        setUndecorated(true);
        getContentPane().setLayout(null);

        pswPasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswPaswordActionPerformed(evt);
            }
        });
        getContentPane().add(pswPasword);
        pswPasword.setBounds(118, 132, 240, 26);

        btnIniciarSesion.setBackground(new java.awt.Color(102, 153, 255));
        btnIniciarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setFocusable(false);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion);
        btnIniciarSesion.setBounds(140, 170, 111, 25);

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEMA DE GESTION DE CITAS MEDICAS");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 46, 347, 22);

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 0, 0));
        btnCerrar.setText("X");
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar);
        btnCerrar.setBounds(324, 7, 43, 28);

        jLabel2.setBackground(new java.awt.Color(102, 153, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 65, 22);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(120, 90, 240, 26);

        jLabel3.setBackground(new java.awt.Color(102, 153, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 130, 94, 22);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 380, 200);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        ArrayList<clsUsuario> lista;
        clsUsuarioDAO objDAO = new clsUsuarioDAO();
        int band = 0;
        
        try {
            lista = objDAO.listado();
            for (clsUsuario obj : lista) {      //Recorres la lista
                if(obj.getIdUsuario().equals(txtUsuario.getText()) && obj.getPasword().equals(pswPasword.getText())){
                    if(obj.getCargo().equals("Administrador") || obj.getCargo().equals("Administradora")){
                        frm_Principal_Administracion ventana = new frm_Principal_Administracion();
        
                        ventana.setVisible(true);
                    }else{
                        if (obj.getCargo().equals("Recepcionista")) {
                            frm_Principal_Recepcion ventana = new frm_Principal_Recepcion();
        
                            ventana.setVisible(true);
                        }
                    }
                    band = 1;
                }
            }
            if(band == 0) {
                JOptionPane.showMessageDialog(rootPane, "USUARIO NO REGISTRADO", "ERROR", JOptionPane.ERROR_MESSAGE, null);                
            }else this.dispose();       //Cierra la ventana         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }          
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void pswPaswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswPaswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswPaswordActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pswPasword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
