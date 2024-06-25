package com.perpus.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                // Menggunakan SQLite
                String url = "jdbc:sqlite:E:/BOBY IWAN/STIS/STIS S.4/PBO/Tugas Akhir_PBO/AppPerpus/db_perpustakaan.db";
                
                // Register driver SQLite
                Class.forName("org.sqlite.JDBC");
                
                // Membuat koneksi
                conn = DriverManager.getConnection(url);
                
                System.out.println("Koneksi ke SQLite berhasil.");
                
            } catch (ClassNotFoundException | SQLException e) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, e);
                System.err.println("Koneksi ke SQLite tidak berhasil: " + e.getMessage());
            }
        }
        return conn;
    }
}
