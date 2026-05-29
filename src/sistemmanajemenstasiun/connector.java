/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemmanajemenstasiun;

import java.sql.*;

/**
 *
 * @author user
 */
public class connector {
    //menyiapkan alamat & kunsi 
    String jdbc_driver = "com.mysql.cj.jdbc.Driver";//ini kendaraannnya (driver)
    String nama_db = "manajemen_stasiun";//nama database
    String url_db = "jdbc:mysql://localhost:3306/" + nama_db;//alamat lengkapnya
    String username_db = "root";//default username xampp
    String password_db = "";//default kosong
    
    //objek inti untuk menjaga jalur 
    Connection conn;
    
    public connector(){
        try{
            System.out.println("Mencoba connect ke : " + url_db);
            
            Class.forName(jdbc_driver);//mendaftarkan driver
            conn = DriverManager.getConnection(url_db,username_db,password_db);
            System.out.println("Connection Success !!");
            
        }catch(ClassNotFoundException | SQLException exception){
            System.out.println("Connection failed: "+exception.getLocalizedMessage());
        }
    }
    
    // METHOD GET CONNECTION
    public Connection getConnection(){
        return conn;
    }
}
