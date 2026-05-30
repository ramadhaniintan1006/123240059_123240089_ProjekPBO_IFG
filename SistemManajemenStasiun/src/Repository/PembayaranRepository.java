/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Pembayaran;

/**
 *
 * @author tataa
 */

public class PembayaranRepository {

    public Pembayaran getPembayaran(
            String kodeBooking
    ) {

        return new Pembayaran(
                kodeBooking,
                350000,
                "Transfer Bank",
                "Lunas"
        );
    }

}
