/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Kursi;
import sistemmanajemenstasiun.connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class KursiRepository {
     private final connector connector;

    public KursiRepository() {

        this.connector = new connector();
    }

    // =====================
    // TAMBAH KURSI
    // =====================

    public boolean tambahKursi(
            int idJadwal,
            String nomorKursi
    ) {

        String sql =
                "INSERT INTO kursi "
                + "(id_jadwal, nomor_kursi, status) "
                + "VALUES (?, ?, 'Tersedia')";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setInt(
                    1,
                    idJadwal
            );

            stmt.setString(
                    2,
                    nomorKursi
            );

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {

            System.out.println(
                    "Gagal tambah kursi : "
                    + e.getMessage()
            );

            return false;
        }
    }

    // =====================
    // GET KURSI BERDASARKAN JADWAL
    // =====================

    public ArrayList<Kursi> getKursiByJadwal(
            int idJadwal
    ) {

        ArrayList<Kursi> list =
                new ArrayList<>();

        String sql =
                "SELECT * FROM kursi "
                + "WHERE id_jadwal = ?";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setInt(
                    1,
                    idJadwal
            );

            ResultSet rs =
                    stmt.executeQuery();

            while (rs.next()) {

                Kursi kursi =
                        new Kursi(
                                rs.getInt("id_kursi"),
                                rs.getInt("id_jadwal"),
                                rs.getString("nomor_kursi"),
                                rs.getString("status")
                        );

                list.add(kursi);
            }

        } catch (Exception e) {

            System.out.println(
                    "Gagal ambil kursi : "
                    + e.getMessage()
            );
        }

        return list;
    }

    // =====================
    // UPDATE STATUS
    // =====================

    public boolean updateStatus(
            int idKursi,
            String status
    ) {

        System.out.println(
            "Update kursi : "
            + idKursi
            + " -> "
            + status
    );

    String sql =
            "UPDATE kursi "
            + "SET status = ? "
            + "WHERE id_kursi = ?";

    try {

        Connection conn =
                connector.getConnection();

        PreparedStatement stmt =
                conn.prepareStatement(sql);

        stmt.setString(
                1,
                status
        );

        stmt.setInt(
                2,
                idKursi
        );

        int hasil =
                stmt.executeUpdate();

        System.out.println(
                "Baris terupdate: "
                + hasil
        );

        return hasil > 0;

    } catch (Exception e) {

        System.out.println(
                "Gagal update kursi : "
                + e.getMessage()
        );

        return false;
    }
    }
    
    public Kursi getKursiByNomor(
        int idJadwal,
        String nomorKursi
        ) {

            String sql =
                    "SELECT * FROM kursi "
                    + "WHERE id_jadwal = ? "
                    + "AND nomor_kursi = ?";

            try {

                Connection conn =
                        connector.getConnection();

                PreparedStatement stmt =
                        conn.prepareStatement(sql);

                stmt.setInt(
                        1,
                        idJadwal
                );

                stmt.setString(
                        2,
                        nomorKursi
                );

                ResultSet rs =
                        stmt.executeQuery();

                if (rs.next()) {

                    return new Kursi(
                            rs.getInt("id_kursi"),
                            rs.getInt("id_jadwal"),
                            rs.getString("nomor_kursi"),
                            rs.getString("status")
                    );
                }

            } catch (Exception e) {

                System.out.println(
                        "Gagal cari kursi : "
                        + e.getMessage()
                );
            }

            return null;
        }
    
}
