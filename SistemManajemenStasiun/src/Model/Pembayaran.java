/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tataa
 */
public class Pembayaran {

    private String kodeBooking;
    private double totalBayar;
    private String metodePembayaran;
    private String status;

    public Pembayaran(
            String kodeBooking,
            double totalBayar,
            String metodePembayaran,
            String status
    ) {

        this.kodeBooking = kodeBooking;
        this.totalBayar = totalBayar;
        this.metodePembayaran = metodePembayaran;
        this.status = status;
    }

    public String getKodeBooking() {
        return kodeBooking;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public String getStatus() {
        return status;
    }
}
    
