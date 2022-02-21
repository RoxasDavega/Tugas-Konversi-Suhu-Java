/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

import java.util.Scanner;

/**
 *
 * @author user
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("PROGRAM KONVERSI SUHU AIR");
        System.out.println("Input Data\n-----");
        Scanner input = new Scanner(System.in);
        float suhu = input.nextFloat();
        Konversi konversi = new Konversi(suhu);
        
        while(true){
            System.out.println("\nOpsi\n---");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            
            System.out.print("Pilih : ");
            int pilihan = input.nextInt();
            if(pilihan == 1){
              System.out.println("Suhu dalam Celcius : "+konversi.celcius);
              System.out.println("Dalam Fahrenheit : "+konversi.convertFahrenheit());
              System.out.println("Dalam Reamur : "+konversi.convertReamur());
              System.out.println("Dalam Kelvin : "+konversi.convertKelvin());   
              System.out.println(konversi.kondisiAir());
            }else if(pilihan == 2){
               
                System.out.print("Suhu dalam Celcius : ");
                float Celcius = input.nextFloat();
                konversi = new Konversi(Celcius);
            }else if(pilihan == 3){
                 System.exit(0);
                 break;
            }else{
                System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
            }
        }
    }

}


