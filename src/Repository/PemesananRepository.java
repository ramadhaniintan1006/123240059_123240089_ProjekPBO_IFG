/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Pemesanan;
import sistemmanajemenstasiun.connector;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;


/**
 *
 * @author user
 */
public class PemesananRepository {
    private final connector connector;

    public PemesananRepository() {

        this.connector = new connector();
    }

    // =====================
    // READ
    // =====================
    public ArrayList<Pemesanan> getAllPemesanan() {

        ArrayList<Pemesanan> list =
                new ArrayList<>();

        String sql =
                "SELECT * FROM pemesanan";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            ResultSet rs =
                    stmt.executeQuery();

            while (rs.next()) {

                Pemesanan pemesanan =
                        new Pemesanan(
                                rs.getInt("id_pemesanan"),
                                rs.getInt("id_user"),
                                rs.getInt("id_jadwal"),
                                rs.getInt("id_kursi"),
                                rs.getString("kode_booking"),
                                rs.getString("status"),
                                rs.getString("tanggal_pesan")
                        );

                list.add(pemesanan);
            }

        } catch (Exception e) {

            System.out.println(
                    "Gagal ambil data : "
                    + e.getMessage()
            );
        }

        return list;
    }

    // =====================
    // UPDATE STATUS
    // =====================
    public boolean updateStatus(
            int idPemesanan,
            String status
    ) {

        String sql =
                "UPDATE pemesanan "
                + "SET status = ? "
                + "WHERE id_pemesanan = ?";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1, status);

            stmt.setInt(2, idPemesanan);

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {

            System.out.println(
                    "Gagal update status : "
                    + e.getMessage()
            );

            return false;
        }
    }

    // =====================
    // DELETE
    // =====================
    public boolean deletePemesanan(
            int idPemesanan
    ) {

        String sql =
                "DELETE FROM pemesanan "
                + "WHERE id_pemesanan = ?";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setInt(1, idPemesanan);

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {

            System.out.println(
                    "Gagal hapus pemesanan : "
                    + e.getMessage()
            );

            return false;
        }
    }
    
        // =====================
    // CREATE
    // =====================
    public boolean tambahPemesanan(
            Pemesanan pemesanan
    ) {

        String sql =
                "INSERT INTO pemesanan "
                + "(id_user, id_jadwal, id_kursi, kode_booking, status) "
                + "VALUES (?, ?, ?, ?, ?)";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setInt(
                    1,
                    pemesanan.getIdUser()
            );

            stmt.setInt(
                    2,
                    pemesanan.getIdJadwal()
            );

            stmt.setInt(
                    3,
                    pemesanan.getIdKursi()
            );

            stmt.setString(
                    4,
                    pemesanan.getKodeBooking()
            );

            stmt.setString(
                    5,
                    pemesanan.getStatus()
            );

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {

            System.out.println(
                    "Gagal tambah pemesanan : "
                    + e.getMessage()
            );

            return false;
        }
    }
    
    
}
