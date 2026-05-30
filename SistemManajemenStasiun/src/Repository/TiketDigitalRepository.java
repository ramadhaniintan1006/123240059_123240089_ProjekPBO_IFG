/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.TiketDigital;
import Model.TiketKereta;
import sistemmanajemenstasiun.connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TiketDigitalRepository {

    private final connector connector;

    public TiketDigitalRepository() {
        this.connector = new connector();
    }

    public TiketDigital getTiketByKodeBooking(
            String kodeBooking
    ) {

        String sql =
                "SELECT * FROM pemesanan "
                + "WHERE kode_booking = ?";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(
                    1,
                    kodeBooking
            );

            ResultSet rs =
                    stmt.executeQuery();

            if (rs.next()) {

                return new TiketKereta(

                        rs.getInt(
                                "id_pemesanan"
                        ),

                        rs.getInt(
                                "id_user"
                        ),

                        rs.getInt(
                                "id_jadwal"
                        ),

                        rs.getInt(
                                "id_kursi"
                        ),

                        rs.getString(
                                "kode_booking"
                        ),

                        rs.getString(
                                "status"
                        ),

                        rs.getString(
                                "tanggal_pesan"
                        )
                );
            }

        } catch (Exception e) {

            System.out.println(
                    "Gagal ambil tiket : "
                    + e.getMessage()
            );
        }

        return null;
    }
}