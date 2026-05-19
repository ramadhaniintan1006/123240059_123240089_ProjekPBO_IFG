/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Jadwal {
    private int idJadwal;

    private String namaKereta;
    private String asal;
    private String tujuan;

    private String tanggal;
    private String jamBerangkat;
    private String jamTiba;

    private double harga;

    public Jadwal(
            int idJadwal,
            String namaKereta,
            String asal,
            String tujuan,
            String tanggal,
            String jamBerangkat,
            String jamTiba,
            double harga
    ) {

        this.idJadwal = idJadwal;
        this.namaKereta = namaKereta;
        this.asal = asal;
        this.tujuan = tujuan;
        this.tanggal = tanggal;
        this.jamBerangkat = jamBerangkat;
        this.jamTiba = jamTiba;
        this.harga = harga;
    }

    public int getIdJadwal() {
        return idJadwal;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public String getAsal() {
        return asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getJamBerangkat() {
        return jamBerangkat;
    }

    public String getJamTiba() {
        return jamTiba;
    }

    public double getHarga() {
        return harga;
    }
}
