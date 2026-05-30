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
 * @author tataa
 */
public class KelolaPemesananRepository {

    private final connector connector;

    public KelolaPemesananRepository() {
        this.connector = new connector();
    }

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

            while(rs.next()){

                list.add(

                        new Pemesanan(

                                rs.getInt("id_pemesanan"),
                                rs.getInt("id_user"),
                                rs.getInt("id_jadwal"),
                                rs.getInt("id_kursi"),
                                rs.getString("kode_booking"),
                                rs.getString("status"),
                                rs.getString("tanggal_pesan")
                        )
                );
            }

        } catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }

        return list;
    }

    public boolean batalkanPemesanan(
            int idPemesanan
    ) {

        String sql =
                "UPDATE pemesanan "
                + "SET status='Dibatalkan' "
                + "WHERE id_pemesanan=?";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setInt(
                    1,
                    idPemesanan
            );

            return stmt.executeUpdate() > 0;

        } catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }

        return false;
    }

    public boolean validasiPemesanan(
            int idPemesanan
    ) {

        String sql =
                "UPDATE pemesanan "
                + "SET status='Selesai' "
                + "WHERE id_pemesanan=?";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setInt(
                    1,
                    idPemesanan
            );

            return stmt.executeUpdate() > 0;

        } catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }

        return false;
    }

}
