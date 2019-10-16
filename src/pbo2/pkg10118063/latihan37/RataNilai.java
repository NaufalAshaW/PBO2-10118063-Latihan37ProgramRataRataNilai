/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan37;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class RataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();  
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        mahasiswa.setJmlMhs(scanner.nextInt());
        
        for(int i = 1; i <= mahasiswa.getJmlMhs(); i++){
            System.out.print("Nilai Mahasiswa ke-" + i +" : ");
            mahasiswa.setNilai(scanner.nextDouble());
        }
        
        System.out.println("\nMaka, Rata-rata Nilainya adalah " +
                mahasiswa.hitungRata());
        
        System.out.println("Developed by : Naufal Asha");
    }
    
}
