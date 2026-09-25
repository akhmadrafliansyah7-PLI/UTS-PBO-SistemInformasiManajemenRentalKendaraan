/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemRentalKendaraan.controller;

import java.util.ArrayList;
import java.util.Scanner;
import SistemRentalKendaraan.model.Kendaraan;
import SistemRentalKendaraan.model.Mobil;
import SistemRentalKendaraan.model.Motor;
import SistemRentalKendaraan.model.Pelanggan;
import SistemRentalKendaraan.model.Transaksi;
import SistemRentalKendaraan.view.MenuView;
/**
 *
 * @author Lenovo GK
 */
public class MenuController {
    
    private ArrayList<Transaksi> daftarTransaksi;
    private MenuView view;
    private Scanner input = new Scanner(System.in);
    
    public MenuController(MenuView view){
        this.view = view;
        this.daftarTransaksi = new ArrayList<>();
    }
    public void dataDummy(){
        Pelanggan pelanggan = new Pelanggan(
            "PL001",
            "Rapli",
            "089690744311"
        );
        
        Kendaraan kendaraan = new Mobil(
            "KT0897",
            "Honda",
            "Putih",
            4,
            300000
        );
        
        Transaksi transaksi = new Transaksi(
            "TL001",
            5,
            pelanggan,
            kendaraan
        );
        
daftarTransaksi.add(transaksi);
    }
    public void jalankanProgram(){
        
        int pilihan;
        
        do{
            view.tampilkanMenu();
            pilihan = view.inputMenu();
            
            switch (pilihan){
                case 1:
                    tambahData();
                    break;
                    
                case 2:
                    tampilkanData();
                    break;
                
                case 3:
                    tampilkanHarga();
                    break;
                    
                case 4:
                    ubahData();
                    break;
                    
                case 5:
                    hapusData();
                    break;
                    
                case 6:
System.out.println("Program Selesai");
                    break;
                    
                default:
                    
System.out.println("Pilihan Menu Tidak Tersedia");
                
            }
        }while (pilihan !=6);
    }
public void tambahData(){
        
    System.out.println("\n=== Tambah Data Rental ===");

    String idTransaksi;

    while (true){
        System.out.print("ID Transaksi : ");
        idTransaksi = input.nextLine();

        if (idTransaksi.isEmpty()){
            System.out.println("ID Transaksi Tidak Boleh Kosong!");
            continue;
        }
        boolean sudahAda = false;

        for (Transaksi transaksi : daftarTransaksi){
            if (transaksi.getIdTransaksi().equalsIgnoreCase(idTransaksi)) {
                sudahAda = true;
                break;
            }
        }

        if (sudahAda){
            System.out.println("ID Transaksi sudah digunakan!");
        } else {
            break;
        }
    }

    System.out.print("ID Pelanggan: ");
    String idPelanggan = input.nextLine();

    String nama;
    while (true){
        System.out.print("Nama Pelanggan: ");
        nama = input.nextLine();

        if (nama.isEmpty()){
            System.out.println("Nama Pelanggan Tidak Boleh Kosong!");
        } else {
            break;
        }
    }

    String noTelepon;
    while (true){
        System.out.print("Nomor Telepon: ");
        noTelepon = input.nextLine();

        if (noTelepon.isEmpty()){
            System.out.println("Nomor Telepon Tidak Boleh Kosong!");
        } else {
            break;
        }
    }

    System.out.print("Nomor Plat: ");
    String noPlat = input.nextLine();

    System.out.print("Merk Kendaraan: ");
    String merk = input.nextLine();

    System.out.print("Warna Kendaraan: ");
    String warna = input.nextLine();
    
    System.out.print("Lama Sewa (/hari): ");
    
    while (!input.hasNextInt()){
        System.out.println("Input Harus Berupa Angka");
        input.nextLine();
        System.out.print("Lama Sewa (/hari): ");
    }
    int lamaSewa = input.nextInt();
    input.nextLine();
    
    System.out.println("\nJenis Kendaraan: ");
    System.out.println("1. Mobil");
    System.out.println("2. Motor");

    int detailKendaraan;
    Kendaraan kendaraan = null;

    while (true){

        System.out.println("pilih: ");

        if (!input.hasNextInt()){
            System.out.println("Input Harus Berupa Angka");
            input.nextLine();
            continue;
        }
        detailKendaraan = input.nextInt();
        input.nextLine();

        if (detailKendaraan == 1){
            int jumlahRoda;

            while (true){
                System.out.print("Jumlah Roda: ");

                if (input.hasNextInt()){
                    jumlahRoda = input.nextInt();
                    input.nextLine();
                    break;
                }else{
                    System.out.println("Jumlah pintu harus berupa angka");
                    input.nextLine();
                }
            }
            kendaraan = new Mobil(noPlat, merk, warna, jumlahRoda, 300000);
            break;

        }else if (detailKendaraan == 2){
            int cc;

            while (true){
                System.out.print("cc : ");

                if (input.hasNextInt()){
                    cc = input.nextInt();
                    input.nextLine();
                    break;
                }else{
                    System.out.println("cc harus berupa angka");
                    input.nextLine();
                }
            }
            kendaraan = new Motor(noPlat, merk, warna, cc, 100000);
            break;
        
        }else{
            System.out.println("Pilihan Layanan Tidak Valid! pilih 1-2.");
        }
    }
    Pelanggan pelanggan = new Pelanggan(idPelanggan, nama, noTelepon);
    Transaksi transaksi = new Transaksi(idTransaksi, lamaSewa, pelanggan, kendaraan);

    daftarTransaksi.add(transaksi);

    System.out.println("\nData Pencucian Berhasil Ditambahkan!");
}
public void tampilkanData(){

    if(daftarTransaksi.isEmpty()){
        System.out.println("Belum Ada Data Pencucian");
        return;
    }
    System.out.println("\n=== Data Rental Kendaraan ===");
    for (Transaksi transaksi : daftarTransaksi){
        transaksi.tampilkanData();

System.out.println("---------------------------------");
        
    }
}
public void tampilkanHarga(){
    
    System.out.println("\n=== Data Rental Kendaraan ===");
    System.out.println("1. Mobil: Rp 300000/hari");
    System.out.println("2. Motor: Rp 100000/hari");
    System.out.println("---------------------------------");
}
public void ubahData(){

    System.out.println("\n=== Ubah Data Pencucian ===");

    System.out.println("Masukan ID Transaksi: ");
    String idTransaksi = input.nextLine();

    for (Transaksi transaksi : daftarTransaksi){

        if(transaksi.getIdTransaksi().equals(idTransaksi)) {

                        System.out.print("Nama Pelanggan Baru: ");
                        String nama = input.nextLine();

                        System.out.print("Nomor Telepon Baru: ");
                        String noTelepon = input.nextLine();

transaksi.getPelanggan().setNama(nama);
transaksi.getPelanggan().setNoTelepon(noTelepon);

                        System.out.print("noPlat Baru: ");
                        String noPlat = input.nextLine();

                        System.out.print("Merk Kendaraan Baru: ");
                        String merk = input.nextLine();

                        System.out.print("warna Kendaraan Baru: ");
                        String warna = input.nextLine();
                        
                        System.out.print("Lama Sewa (/hari) Baru: ");
    
                        while (!input.hasNextInt()){
                            System.out.println("Input Harus Berupa Angka");
                            input.nextLine();
                            System.out.print("Lama Sewa (/hari) Baru: ");
                        }
                        int lamaSewa = input.nextInt();
                        input.nextLine();

                        System.out.println("\nJenis Kendaraan Baru: ");
                        System.out.println("1. Mobil");
                        System.out.println("2. Motor");

                        int detailKendaraanBaru;
                        Kendaraan kendaraanBaru = null;

                        while (true){

                            System.out.println("pilih: ");

                            if (!input.hasNextInt()){
                                System.out.println("Input Harus Berupa Angka");
                                input.nextLine();
                                continue;
                            }
                            detailKendaraanBaru = input.nextInt();
                            input.nextLine();


                        if(detailKendaraanBaru == 1){
                            int jumlahRoda;

                            while (true){
                                System.out.print("Jumlah Roda: ");

                                if (input.hasNextInt()){
                                    jumlahRoda = input.nextInt();
                                    input.nextLine();
                                    break;
                                }else{
                                 System.out.println("Jumlah pintu harus berupa angka");
                                input.nextLine();
                                }
                            }
                            kendaraanBaru = new Mobil(noPlat, merk, warna, jumlahRoda, 300000);
                            break;
                        }else if
                          (detailKendaraanBaru == 2){
                            int cc;

                            while (true){
                                System.out.print("cc : ");

                                if (input.hasNextInt()){
                                    cc = input.nextInt();
                                    input.nextLine();
                                    break;
                                }else{
                                    System.out.println("cc harus berupa angka");
                                    input.nextLine();
                                }
                            }
                            kendaraanBaru = new Motor(noPlat, merk, warna, cc, 100000);
                            break;
                        }else{
                            System.out.println("Jenis Kendaraan Tidak Valid");
                            return;
                        }
                    }
transaksi.setKendaraan(kendaraanBaru);
transaksi.getKendaraan().setNoPlat(noPlat);
transaksi.getKendaraan().setMerk(merk);
transaksi.getKendaraan().setWarna(warna);

                    System.out.print("\nData Berhasil Diubah");
                    return;
                }
            }
            System.out.println("ID Transaksi Tidak Ditemukan.");
        }

public void hapusData(){

    System.out.println("\n=== Hapus Data Rental ===");

    System.out.println("Masukan ID Transaksi");
    String idTransaksi = input.nextLine();

    for (int i = 0; i < daftarTransaksi.size(); i++) {

        if (daftarTransaksi.get(i).getIdTransaksi().equals(idTransaksi)) {

            daftarTransaksi.remove(i);

            System.out.println("\nData Berhasil Dihapus");
            return;
        }
    }

    System.out.println("ID Transaksi Tidak Ditemukan.");
}
}
