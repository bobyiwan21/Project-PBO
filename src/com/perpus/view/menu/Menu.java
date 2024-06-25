package com.perpus.view.menu;

import com.perpus.controller.EventMenuSelected;
import com.perpus.view.main.MenuUtama;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Menu extends javax.swing.JPanel {

    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event){
        this.event = event;
        listMenu.addEventMenuSelected(event);
    }
    
    public Menu() {
        initComponents();
        jPanel1.setOpaque(false);
        listMenu.setOpaque(false);
    }
    
    public void getLevelUser(String levelUser) {
        if(levelUser != null && levelUser.equals("Admin")){
            listMenu.addItem(new ModelMenu("dashboard_white", "Dashboard", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("", "Master", ModelMenu.MenuType.TITLE));
            listMenu.addItem(new ModelMenu("anggota_white", "Anggota", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("kategori_white", "Kategori", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("penerbit_white", "Penerbit", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("book_white", "Buku", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("petugas_white", "Petugas", ModelMenu.MenuType.MENU));
            //listMenu1.addItem(new ModelMenu("", " ", ModelMenu.MenuType.EMPTY));
            listMenu.addItem(new ModelMenu("", " ", ModelMenu.MenuType.TITLE));

            listMenu.addItem(new ModelMenu("", "Transaksi", ModelMenu.MenuType.TITLE));
            listMenu.addItem(new ModelMenu("peminjaman_white", "Peminjaman", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("pengembalian_white", "Pengembalian", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("", " ", ModelMenu.MenuType.TITLE));

            listMenu.addItem(new ModelMenu("", "Laporan", ModelMenu.MenuType.TITLE));
            listMenu.addItem(new ModelMenu("peminjaman_white", "Peminjaman", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("anggota_white", "Anggota", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("book_white", "Buku", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("", "", ModelMenu.MenuType.EMPTY));
        }else{
            listMenu.addItem(new ModelMenu("dashboard_white", "Dashboard", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("", "Transaksi", ModelMenu.MenuType.TITLE));
            listMenu.addItem(new ModelMenu("peminjaman_white", "Peminjaman", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("pengembalian_white", "Pengembalian", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("", " ", ModelMenu.MenuType.TITLE));

            listMenu.addItem(new ModelMenu("", "Laporan", ModelMenu.MenuType.TITLE));
            listMenu.addItem(new ModelMenu("peminjaman_white", "Peminjaman", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("anggota_white", "Anggota", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("book_white", "Buku", ModelMenu.MenuType.MENU));
            listMenu.addItem(new ModelMenu("", "", ModelMenu.MenuType.EMPTY));
        }
    }

    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#009999"), 0, getHeight(), Color.decode("#000046"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        listMenu = new com.perpus.view.menu.ListMenu<>();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title.setText("Simpus STIS");

        logo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        logo.setForeground(new java.awt.Color(102, 102, 102));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perpus/icon/LogoAppPerpus.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(logo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sistem Informasi Perpustakaan vBoby");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(listMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private com.perpus.view.menu.ListMenu<String> listMenu;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
