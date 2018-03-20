/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabungan;

import java.util.Scanner;
public class Tabungan {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int tabungan;
        int bulan;
        int minggu;
        int jumlahBulanan = 0;
        int jumlah2 = 0;
        Scanner scan = new Scanner(System.in);
        
        for (bulan = 1; bulan <= 4; bulan++) {
            for (minggu = 1; minggu <= 4; minggu++) {
                System.out.println("Kue arep nabung piro?");
                tabungan = scan.nextInt();
                System.out.println("kue minggu iki nabung "+tabungan+" loh yo");
                jumlahBulanan = jumlahBulanan + tabungan;
            }
            System.out.println("tabunganmu ulan iki wes " +jumlahBulanan);
            }
            jumlah2 = jumlah2+jumlahBulanan;
        System.out.println("tabunganmu taun iki wes " +jumlah2+ " traktiran lah mat.");
        }
                        
    }