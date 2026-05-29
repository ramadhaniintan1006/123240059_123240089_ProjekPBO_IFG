/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Kursi {
    
    private int idKursi;

    private int idJadwal;

    private String nomorKursi;

    private String status;

    public Kursi(
            int idKursi,
            int idJadwal,
            String nomorKursi,
            String status
    ) {

        this.idKursi = idKursi;
        this.idJadwal = idJadwal;
        this.nomorKursi = nomorKursi;
        this.status = status;
    }

    public int getIdKursi() {
        return idKursi;
    }

    public int getIdJadwal() {
        return idJadwal;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    public String getStatus() {
        return status;
    }
}
