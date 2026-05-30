/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tataa
 */
public class RiwayatPemesanan {

    private int idPemesanan;
    private String kodeBooking;
    private String status;
    private String tanggalPesan;

    public RiwayatPemesanan(
            int idPemesanan,
            String kodeBooking,
            String status,
            String tanggalPesan
    ) {

        this.idPemesanan = idPemesanan;
        this.kodeBooking = kodeBooking;
        this.status = status;
        this.tanggalPesan = tanggalPesan;
    }

    public int getIdPemesanan() {
        return idPemesanan;
    }

    public String getKodeBooking() {
        return kodeBooking;
    }

    public String getStatus() {
        return status;
    }

    public String getTanggalPesan() {
        return tanggalPesan;
    }

}
