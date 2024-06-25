package com.perpus.view.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.perpus.model.Koneksi;
import com.perpus.view.main.MenuUtama;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FormLogin extends javax.swing.JFrame {

    private Connection conn;
    
    public FormLogin() {
        initComponents();
        conn = Koneksi.getConnection();
        
        setLayoutForm();
    }
    
    private void setLayoutForm(){
        setIconImage(new ImageIcon(getClass().getResource("/com/perpus/icon/LogoAppPerpus.png")).getImage());
        
        txtUsername.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txtPassword.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        
        txtUsername.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, 
                new FlatSVGIcon("com/perpus/icon/username.svg", 0.80f));
        txtPassword.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, 
                new FlatSVGIcon("com/perpus/icon/password.svg", 0.80f));
        
        txtPassword.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true;showCapsLock:true");
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, ""
                + "Masukkan username");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, ""
                + "Masukkan password");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        welcome1 = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        welcome.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        welcome.setForeground(new java.awt.Color(102, 102, 102));
        welcome.setText("Selamat Datang");

        welcome1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        welcome1.setForeground(new java.awt.Color(102, 102, 102));
        welcome1.setText("Hallo,");

        username1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        username1.setForeground(new java.awt.Color(102, 102, 102));
        username1.setText("Username");

        password.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.setText("Password");

        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SISTEM INFORMASI PERPUSTAKAAN");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Politeknik Statistika STIS");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perpus/icon/stis_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username1)
                    .addComponent(password)
                    .addComponent(welcome)
                    .addComponent(welcome1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsername)
                    .addComponent(txtPassword)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(welcome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcome)
                .addGap(22, 22, 22)
                .addComponent(username1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        prosesLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            prosesLogin();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    public static void main(String args[]) {
        FlatLaf.registerCustomDefaultsSource("com.perpus.theme");
        FlatLightLaf.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel username1;
    private javax.swing.JLabel welcome;
    private javax.swing.JLabel welcome1;
    // End of variables declaration//GEN-END:variables
    
    private boolean validasiInput(){
        boolean valid = false;
        if(txtUsername.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Username tidak boleh kosong");
        }else if(txtPassword.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Password tidak boleh kosong");
        }else{
            valid = true;
        }
        return valid;
    }
    
    private Map<String, String> checkLogin(String username, String password){
        Map<String, String> result = new HashMap<>();
        
        if(conn != null){
            try {
               String sql = "SELECT * FROM user WHERE Username=? AND Password=?"; 
               PreparedStatement st = conn.prepareStatement(sql);
               st.setString(1, username);
               st.setString(2, password);

               ResultSet rs = st.executeQuery();
               if(rs.next()){
                   result.put("ID_User", rs.getString("ID_User"));
                   result.put("Nama_User", rs.getString("Nama_User"));
                   result.put("Level", rs.getString("Level"));
                   return result;
               }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    
    private void prosesLogin(){
        if(validasiInput()){
            String username = txtUsername.getText();
            String password = new String(txtPassword.getPassword());

            Map<String, String> loginResult = checkLogin(username,password);

            if(loginResult != null){
                String userID       = loginResult.get("ID_User");
                String namaUser     = loginResult.get("Nama_User");
                String levelUser    = loginResult.get("Level");
                
                MenuUtama mn = new MenuUtama(userID, namaUser, levelUser);
                mn.setVisible(true);
                mn.revalidate();

                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Username dan Password Salah",
                        "Pesan",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    
}
