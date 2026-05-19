/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import sistemmanajemenstasiun.connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.Kereta;

/**
 *
 * @author user
 */
public class KeretaRepository {
    private final connector connector;

    public KeretaRepository() {
        this.connector = new connector();
    }

    public boolean tambahKereta(Kereta kereta) {

        String sql =
                "INSERT INTO kereta "
                + "(nama_kereta, kelas, kapasitas) "
                + "VALUES (?, ?, ?)";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(
                    1,
                    kereta.getNamaKereta()
            );

            stmt.setString(
                    2,
                    kereta.getKelas()
            );

            stmt.setInt(
                    3,
                    kereta.getKapasitas()
            );

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {

            System.out.println(
                    "Gagal tambah kereta : "
                    + e.getMessage()
            );

            return false;
        }
    }
    
    public ArrayList<Kereta> getAllKereta() {

        ArrayList<Kereta> listKereta =
                new ArrayList<>();

        String sql = "SELECT * FROM kereta";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            ResultSet rs =
                    stmt.executeQuery();

            while (rs.next()) {

                Kereta kereta =
                        new Kereta(
                                rs.getInt("id_kereta"),
                                rs.getString("nama_kereta"),
                                rs.getString("kelas"),
                                rs.getInt("kapasitas")
                        );

                listKereta.add(kereta);
            }

        } catch (Exception e) {

            System.out.println(
                    "Gagal ambil data : "
                    + e.getMessage()
            );
        }

        return listKereta;
    }
    
    public boolean updateKereta(Kereta kereta) {

        String sql =
                "UPDATE kereta "
                + "SET nama_kereta = ?, "
                + "kelas = ?, "
                + "kapasitas = ? "
                + "WHERE id_kereta = ?";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(
                    1,
                    kereta.getNamaKereta()
            );

            stmt.setString(
                    2,
                    kereta.getKelas()
            );

            stmt.setInt(
                    3,
                    kereta.getKapasitas()
            );

            stmt.setInt(
                    4,
                    kereta.getIdKereta()
            );

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {

            System.out.println(
                    "Gagal update : "
                    + e.getMessage()
            );

            return false;
        }
    }
    
    public boolean deleteKereta(int idKereta) {

        String sql =
                "DELETE FROM kereta "
                + "WHERE id_kereta = ?";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setInt(1, idKereta);

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {

            System.out.println(
                    "Gagal delete : "
                    + e.getMessage()
            );

            return false;
        }
    }
    
}
