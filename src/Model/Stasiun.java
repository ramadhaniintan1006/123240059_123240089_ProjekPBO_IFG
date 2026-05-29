/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Stasiun {
    private int idStasiun;

    private String namaStasiun;

    private String kota;

    public Stasiun(
            int idStasiun,
            String namaStasiun,
            String kota
    ) {

        this.idStasiun = idStasiun;
        this.namaStasiun = namaStasiun;
        this.kota = kota;
    }

    public int getIdStasiun() {
        return idStasiun;
    }

    public String getNamaStasiun() {
        return namaStasiun;
    }

    public String getKota() {
        return kota;
    }
}
