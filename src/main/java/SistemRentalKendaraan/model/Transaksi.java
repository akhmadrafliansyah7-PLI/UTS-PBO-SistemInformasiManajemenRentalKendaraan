/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemRentalKendaraan.model;

import SistemRentalKendaraan.model.Pelanggan;
import SistemRentalKendaraan.model.Kendaraan;
/**
 *
 * @author Lenovo GK
 */
public class Transaksi {
    
    private String idTransaksi;
    private int lamaSewa;
    private Pelanggan pelanggan;
    private Kendaraan kendaraan;
    
    public Transaksi(String idTransaksi, int lamaSewa, Pelanggan pelanggan, Kendaraan kendaraan){
        this.idTransaksi = idTransaksi;
        this.lamaSewa = lamaSewa;
        this.pelanggan = pelanggan;
        this.kendaraan = kendaraan;
    }
    
    public String getIdTransaksi(){
        return idTransaksi;
    }
    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }
     public int lamaSewa(){
        return lamaSewa;
    }
    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }
    public Pelanggan getPelanggan(){
        return pelanggan;
    }
    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }
    public Kendaraan getKendaraan(){
        return kendaraan;
    }
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }
    public void tampilkanData(){
        
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("ID Pelanggan : " + pelanggan.getIdPelanggan());
        System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        System.out.println("Nomor Telepon : " + pelanggan.getNoTelepon());
        kendaraan.tampilkanData();
        System.out.println("Lama Sewa (/hari) : " + lamaSewa + " hari");
        System.out.println("Total Harga: Rp " + kendaraan.getHargaPerHari() * lamaSewa);
    }
}
