/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.RiwayatPemesanan;
import sistemmanajemenstasiun.connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

/**
 *
 * @author tataa
 */

public class RiwayatPemesananRepository {

    private final connector connector;

    public RiwayatPemesananRepository() {

        this.connector = new connector();
    }

    public ArrayList<RiwayatPemesanan> getRiwayatByUser(
            int idUser
    ) {

        ArrayList<RiwayatPemesanan> list =
                new ArrayList<>();

        String sql =
                "SELECT * FROM pemesanan "
                + "WHERE id_user = ?";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setInt(
                    1,
                    idUser
            );

            ResultSet rs =
                    stmt.executeQuery();

            while (rs.next()) {

                RiwayatPemesanan riwayat =
                        new RiwayatPemesanan(
                                rs.getInt("id_pemesanan"),
                                rs.getString("kode_booking"),
                                rs.getString("status"),
                                rs.getString("tanggal_pesan")
                        );

                list.add(riwayat);
            }

        } catch (Exception e) {

            System.out.println(
                    "Gagal ambil riwayat : "
                    + e.getMessage()
            );
        }

        return list;
    }
}

