/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import sistemmanajemenstasiun.connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Model.Stasiun;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class StasiunRepository {
    private final connector connector;

    public StasiunRepository() {

        this.connector = new connector();
    }

    // =========================
    // CREATE
    // =========================
    public boolean tambahStasiun(
            Stasiun stasiun
    ) {

        String sql =
                "INSERT INTO stasiun "
                + "(nama_stasiun, kota) "
                + "VALUES (?, ?)";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(
                    1,
                    stasiun.getNamaStasiun()
            );

            stmt.setString(
                    2,
                    stasiun.getKota()
            );

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {

            System.out.println(
                    "Gagal tambah stasiun : "
                    + e.getMessage()
            );

            return false;
        }
    }

    // =========================
    // READ
    // =========================
    public ArrayList<Stasiun> getAllStasiun() {

        ArrayList<Stasiun> list =
                new ArrayList<>();

        String sql =
                "SELECT * FROM stasiun";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            ResultSet rs =
                    stmt.executeQuery();

            while (rs.next()) {

                Stasiun stasiun =
                        new Stasiun(
                                rs.getInt("id_stasiun"),
                                rs.getString("nama_stasiun"),
                                rs.getString("kota")
                        );

                list.add(stasiun);
            }

        } catch (Exception e) {

            System.out.println(
                    "Gagal ambil data : "
                    + e.getMessage()
            );
        }

        return list;
    }

    // =========================
    // UPDATE
    // =========================
    public boolean updateStasiun(
            Stasiun stasiun
    ) {

        String sql =
                "UPDATE stasiun "
                + "SET nama_stasiun = ?, "
                + "kota = ? "
                + "WHERE id_stasiun = ?";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(
                    1,
                    stasiun.getNamaStasiun()
            );

            stmt.setString(
                    2,
                    stasiun.getKota()
            );

            stmt.setInt(
                    3,
                    stasiun.getIdStasiun()
            );

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {

            System.out.println(
                    "Gagal update stasiun : "
                    + e.getMessage()
            );

            return false;
        }
    }

    // =========================
    // DELETE
    // =========================
    public boolean deleteStasiun(
            int idStasiun
    ) {

        String sql =
                "DELETE FROM stasiun "
                + "WHERE id_stasiun = ?";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setInt(1, idStasiun);

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {

            System.out.println(
                    "Gagal hapus stasiun : "
                    + e.getMessage()
            );

            return false;
        }
    }
}
