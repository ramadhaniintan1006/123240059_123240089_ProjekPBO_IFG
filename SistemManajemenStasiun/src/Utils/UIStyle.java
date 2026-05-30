/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

/**
 *
 * @author tataa
 */

public class UIStyle {

    // WARNA APLIKASI
    public static final Color PRIMARY =
            new Color(30, 58, 95);

    public static final Color SUCCESS =
            new Color(34, 197, 94);

    public static final Color WARNING =
            new Color(245, 158, 11);

    public static final Color DANGER =
            new Color(239, 68, 68);

    public static final Color INFO =
            new Color(59, 130, 246);

    public static final Color BG =
            new Color(245, 247, 250);

    // FRAME
    public static void styleFrame(JFrame frame) {

    frame.setLocationRelativeTo(null);

    frame.setResizable(false);

    frame.getContentPane().setBackground(BG);

    frame.pack();
}

    // JUDUL BESAR
    public static void styleTitle(JLabel label) {

        label.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        20
                )
        );

        label.setForeground(PRIMARY);
    }

    // LABEL BIASA
    public static void styleLabel(JLabel label) {

        label.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        14
                )
        );
    }

    // TEXTFIELD
    public static void styleTextField(
            JTextField txt
    ) {

        txt.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        14
                )
        );
    }

    // COMBOBOX
    public static void styleComboBox(
            JComboBox combo
    ) {

        combo.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        14
                )
        );
    }

    // TOMBOL UMUM
    public static void styleButton(
            JButton btn
    ) {

        btn.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        13
                )
        );

        btn.setForeground(Color.WHITE);

        btn.setFocusPainted(false);
    }

    // TAMBAH
    public static void styleTambahButton(
            JButton btn
    ) {

        styleButton(btn);

        btn.setBackground(SUCCESS);
    }

    // UPDATE
    public static void styleUpdateButton(
            JButton btn
    ) {

        styleButton(btn);

        btn.setBackground(INFO);
    }

    // DELETE
    public static void styleDeleteButton(
            JButton btn
    ) {

        styleButton(btn);

        btn.setBackground(DANGER);
    }

    // MENU NAVIGASI
    public static void styleMenuButton(
            JButton btn
    ) {

        styleButton(btn);

        btn.setBackground(PRIMARY);
    }

    // TABEL
    public static void styleTable(
            JTable table
    ) {

        table.setRowHeight(28);

        table.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        13
                )
        );

        table.getTableHeader().setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        14
                )
        );
    }
    
    public static void stylePasswordField(
        JPasswordField txt
    ) {

    txt.setFont(
        new Font(
                "Segoe UI",
                Font.PLAIN,
                14
        )
    );
    }
}
