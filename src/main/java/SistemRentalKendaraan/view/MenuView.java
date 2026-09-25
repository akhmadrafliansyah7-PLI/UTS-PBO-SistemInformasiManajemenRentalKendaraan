/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemRentalKendaraan.view;

/**
 *
 * @author Lenovo GK
 */
import java.util.Scanner;

public class MenuView {
    
    private Scanner input = new Scanner(System.in);
    
    public void tampilkanMenu(){

System.out.println("\n=================================");
            System.out.println("Sistem Pencucian Kendaraan");
System.out.println("=================================");
            System.out.println("1. Tambah Data Rental");
            System.out.println("2. Tampilkan Data Rental");
            System.out.println("3. Tampilkan Harga Rental");
            System.out.println("4. Ubah Data Rental");
            System.out.println("5. Hapus Data Rental");
            System.out.println("6. Keluar");
            
System.out.println("=================================");
            System.out.print("Pilih menu: ");
    }   
    public int inputMenu(){
        while (!input.hasNextInt()){
                System.out.println("input harus berupa angka!");
                input.next();
                System.out.print("Pilih menu: ");
            }
        
            int pilihan = input.nextInt();
            input.nextLine();
            return pilihan;
    }
}
