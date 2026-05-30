/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Statistik;
import sistemmanajemenstasiun.connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author tataa
 */

public class StatistikRepository {

    private final connector connector;

    public StatistikRepository() {

        this.connector = new connector();
    }

    public Statistik getStatistik() {

        int totalTiket = 0;
        int totalUser = 0;
        double totalPendapatan = 0;

        try {

            Connection conn =
                    connector.getConnection();

            String sqlTiket =
                    "SELECT COUNT(*) total "
                    + "FROM pemesanan";

            PreparedStatement stmtTiket =
                    conn.prepareStatement(
                            sqlTiket
                    );

            ResultSet rsTiket =
                    stmtTiket.executeQuery();

            if(rsTiket.next()){

                totalTiket =
                        rsTiket.getInt(
                                "total"
                        );
            }

            String sqlUser =
                    "SELECT COUNT(*) total "
                    + "FROM user";

            PreparedStatement stmtUser =
                    conn.prepareStatement(
                            sqlUser
                    );

            ResultSet rsUser =
                    stmtUser.executeQuery();

            if(rsUser.next()){

                totalUser =
                        rsUser.getInt(
                                "total"
                        );
            }

            totalPendapatan =
                    totalTiket * 50000;

        } catch(Exception e){

            System.out.println(
                    e.getMessage()
            );
        }

        return new Statistik(
                totalTiket,
                totalUser,
                totalPendapatan
        );
    }

}
