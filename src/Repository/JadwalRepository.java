/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import sistemmanajemenstasiun.connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Model.Jadwal;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author user
 */
public class JadwalRepository {
    private final connector connector;

    public JadwalRepository() {
        this.connector = new connector();
    }

    public boolean tambahJadwal(
            Jadwal jadwal
    ) {

        String sql =
                "INSERT INTO jadwal "
                + "(nama_kereta, asal, tujuan, "
                + "tanggal, jam_berangkat, "
                + "jam_tiba, harga) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(
                    1,
                    jadwal.getNamaKereta()
            );

            stmt.setString(
                    2,
                    jadwal.getAsal()
            );

            stmt.setString(
                    3,
                    jadwal.getTujuan()
            );

            stmt.setString(
                    4,
                    jadwal.getTanggal()
            );

            stmt.setString(
                    5,
                    jadwal.getJamBerangkat()
            );

            stmt.setString(
                    6,
                    jadwal.getJamTiba()
            );

            stmt.setDouble(
                    7,
                    jadwal.getHarga()
            );

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {

            System.out.println(
                    "Gagal tambah jadwal : "
                    + e.getMessage()
            );

            return false;
        }
    }
        
        public ArrayList<Jadwal> getAllJadwal() {

                ArrayList<Jadwal> list =
                        new ArrayList<>();

                String sql =
                        "SELECT * FROM jadwal";

                try {

                    Connection conn =
                            connector.getConnection();

                    PreparedStatement stmt =
                            conn.prepareStatement(sql);

                    ResultSet rs =
                            stmt.executeQuery();

                    while (rs.next()) {

                        Jadwal jadwal =
                                new Jadwal(
                                        rs.getInt("id_jadwal"),
                                        rs.getString("nama_kereta"),
                                        rs.getString("asal"),
                                        rs.getString("tujuan"),
                                        rs.getString("tanggal"),
                                        rs.getString("jam_berangkat"),
                                        rs.getString("jam_tiba"),
                                        rs.getDouble("harga")
                                );

                        list.add(jadwal);
                    }

                } catch (Exception e) {

                    System.out.println(
                            "Gagal ambil jadwal : "
                            + e.getMessage()
                    );
                }

                return list;
            }
        
        public ArrayList<Jadwal> cariJadwal(String keyword) {

            ArrayList<Jadwal> list =
                    new ArrayList<>();

            String sql =
                    "SELECT * FROM jadwal "
                    + "WHERE nama_kereta LIKE ? "
                    + "OR asal LIKE ? "
                    + "OR tujuan LIKE ?";

            try {

                Connection conn =
                        connector.getConnection();

                PreparedStatement stmt =
                        conn.prepareStatement(sql);

                String cari =
                        "%" + keyword + "%";

                stmt.setString(1, cari);
                stmt.setString(2, cari);
                stmt.setString(3, cari);

                ResultSet rs =
                        stmt.executeQuery();

                while (rs.next()) {

                    Jadwal jadwal =
                        new Jadwal(
                                rs.getInt("id_jadwal"),
                                rs.getString("nama_kereta"),
                                rs.getString("asal"),
                                rs.getString("tujuan"),
                                rs.getString("tanggal"),
                                rs.getString("jam_berangkat"),
                                rs.getString("jam_tiba"),
                                rs.getDouble("harga")
                        );

                    list.add(jadwal);
                }

            } catch (Exception e) {

                System.out.println(
                        "Gagal cari jadwal : "
                        + e.getMessage()
                );
            }

            return list;
        }
        
        public int getLastIdJadwal() {

            String sql =
                    "SELECT MAX(id_jadwal) AS id "
                    + "FROM jadwal";

            try {

                Connection conn =
                        connector.getConnection();

                PreparedStatement stmt =
                        conn.prepareStatement(sql);

                ResultSet rs =
                        stmt.executeQuery();

                if (rs.next()) {

                    return rs.getInt("id");
                }

            } catch (Exception e) {

                System.out.println(
                        "Gagal ambil id jadwal : "
                        + e.getMessage()
                );
            }

            return 0;
        }
        
  }

