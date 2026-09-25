/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemRentalKendaraan.model;

import SistemRentalKendaraan.model.Kendaraan;
/**
 *
 * @author Lenovo GK
 */
public class Mobil extends Kendaraan{
    
    private int jumlahRoda;
    
    public Mobil(String noPlat, String merk, String warna, int jumlahRoda, double hargaPerHari){
        super(noPlat, merk, warna, hargaPerHari);
        this.jumlahRoda = jumlahRoda;
    }
    @Override
    public void tampilkanData(){
        super.tampilkanData();
   
System.out.println("Jenis Kendaraan : Mobil");

System.out.println("Jumlah Roda : " + jumlahRoda);
    }
}
