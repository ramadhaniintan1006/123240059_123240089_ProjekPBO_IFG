/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Kereta {
    private int idKereta;
    private String namaKereta;
    private String kelas;
    private int kapasitas;

    public Kereta(
            int idKereta,
            String namaKereta,
            String kelas,
            int kapasitas
    ) {

        this.idKereta = idKereta;
        this.namaKereta = namaKereta;
        this.kelas = kelas;
        this.kapasitas = kapasitas;
    }

    public int getIdKereta() {
        return idKereta;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public String getKelas() {
        return kelas;
    }

    public int getKapasitas() {
        return kapasitas;
    }
}
