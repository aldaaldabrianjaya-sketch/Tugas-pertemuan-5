/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALDA
 */
import java.util.Scanner;
public class latihan1 {
    
public static void main(String[]args ) {
    Scanner input = new Scanner (System.in);
    float kehadiran,nilai_tugas, nilai_akhir; 
    
    System.out.println ("Masukan persentase Kehadiran:");
    kehadiran = input.nextFloat();
    
    System.out.print("Masukkan Nilai Tugas/Ujian: ");
    nilai_tugas = input.nextFloat();
    
    nilai_akhir = (kehadiran * 0.3f) + (nilai_tugas * 0.7f);
    
    if(nilai_akhir >=80){
        System.out.println("A");
    } else if (nilai_akhir > 70 && nilai_akhir < 80){//
        System.out.println("B");
    } else if (nilai_akhir >= 60 && nilai_akhir <= 70){
        System.out.println("C");
    }else if (nilai_akhir >= 55 && nilai_akhir <60){
        System.out.println("D");
    }else if (nilai_akhir >=50 && nilai_akhir <55) {
        System.out.println("E");
        
    }   
    
}
    
}
