/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tataa
 */
public class Statistik {


    private int totalTiket;
    private int totalUser;
    private double totalPendapatan;

    public Statistik(
            int totalTiket,
            int totalUser,
            double totalPendapatan
    ) {

        this.totalTiket = totalTiket;
        this.totalUser = totalUser;
        this.totalPendapatan = totalPendapatan;
    }

    public int getTotalTiket() {
        return totalTiket;
    }

    public int getTotalUser() {
        return totalUser;
    }

    public double getTotalPendapatan() {
        return totalPendapatan;
    }

}
