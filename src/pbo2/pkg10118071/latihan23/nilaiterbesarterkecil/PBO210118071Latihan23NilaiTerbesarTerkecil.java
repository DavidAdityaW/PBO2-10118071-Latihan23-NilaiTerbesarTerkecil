/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan23.nilaiterbesarterkecil;
// package scanner
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menentukan
 *                     nilai terbesar dan terkecil  
 * 
 */
public class PBO210118071Latihan23NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        String petugas;
        int mhs, max, min;
        
        System.out.println("===Program Nilai Terbesar dan Terkecil Nilai Mahasiswa===");
        System.out.print("Masukkan nama petugas \t\t\t: ");
        petugas = input.next();
        System.out.print("Masukkan banyaknya nilai mahasiswa \t: ");
        mhs = input.nextInt();

        int mahasiswa[] = new int[mhs];

        for (int i = 1; i <= mhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + i + " = ");
            int nilai = input.nextInt();
            mahasiswa[i - 1] = nilai;
        }

        System.out.println("");
        max = mahasiswa[0];
        min = mahasiswa[0];
        
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (int i = 1; i <= mhs; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + i + " = " + mahasiswa[i - 1]);

            if (mahasiswa[i - 1] > max) {
                max = mahasiswa[i - 1];
            } else if (mahasiswa[i - 1] < min) {
                min = mahasiswa[i - 1];
            }
        }
        
        System.out.println("");
        System.out.println("Nilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);
        System.out.println("");
        System.out.println("Petugas : " + petugas);
    }
    
}
