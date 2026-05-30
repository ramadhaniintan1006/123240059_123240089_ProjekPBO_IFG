/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tataa
 */

public abstract class TiketDigital extends Pemesanan {

    public TiketDigital(
            int idPemesanan,
            int idUser,
            int idJadwal,
            int idKursi,
            String kodeBooking,
            String status,
            String tanggalPesan
    ) {

        super(
                idPemesanan,
                idUser,
                idJadwal,
                idKursi,
                kodeBooking,
                status,
                tanggalPesan
        );
    }

    @Override
    public abstract String getInfo();
}