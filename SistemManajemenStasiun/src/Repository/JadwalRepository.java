/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import sistemmanajemenstasiun.connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Model.Jadwal;


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
}
