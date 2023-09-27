/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class Posttest1 { 
    public static void main(String[] args) {
        ArrayList<Penampungan_sawit> sawits = new ArrayList<>();
        sawits.add(new Penampungan_sawit("1ton", "2000"));
        sawits.add(new Penampungan_sawit("3ton", "2000"));
        sawits.add(new Penampungan_sawit("5ton", "2000"));
        sawits.add(new Penampungan_sawit("2ton", "2000"));
        sawits.add(new Penampungan_sawit("9ton", "2000"));

        for (Penampungan_sawit sawit : sawits) {
            System.out.println("Buah yang diterima: " + sawit.beratsawit + "\nHarga sawit perKg : " + sawit.hargasawit + "\n");
        }
    }
}
