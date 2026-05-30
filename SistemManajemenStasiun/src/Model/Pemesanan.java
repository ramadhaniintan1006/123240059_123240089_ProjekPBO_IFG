/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Pemesanan {
    private int idPemesanan;

    private int idUser;

    private int idJadwal;

    private int idKursi;

    private String kodeBooking;

    private String status;

    private String tanggalPesan;

    public Pemesanan(
            int idPemesanan,
            int idUser,
            int idJadwal,
            int idKursi,
            String kodeBooking,
            String status,
            String tanggalPesan
    ) {

        this.idPemesanan = idPemesanan;
        this.idUser = idUser;
        this.idJadwal = idJadwal;
        this.idKursi = idKursi;
        this.kodeBooking = kodeBooking;
        this.status = status;
        this.tanggalPesan = tanggalPesan;
    }

    public int getIdPemesanan() {
        return idPemesanan;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getIdJadwal() {
        return idJadwal;
    }

    public int getIdKursi() {
        return idKursi;
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
    
    public String getInfo() {

    return "Kode Booking : "
            + kodeBooking;
    }
}
