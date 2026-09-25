/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemRentalKendaraan.model;

/**
 *
 * @author Lenovo GK
 */
public class Kendaraan {
    
    private String noPlat;
    private String merk;
    private String warna;
    private double hargaPerHari;
    
    public Kendaraan(String noPlat, String merk, String warna, double hargaPerHari){
        this.noPlat = noPlat;
        this.merk = merk;
        this.warna = warna;
        this.hargaPerHari = hargaPerHari;
    }
    public String getNoPlat(){
        return noPlat;
    }
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public double getHargaPerHari(){
        return hargaPerHari;
    }
    public void setHargaPerHari(double hargaPerHari) {
        this.hargaPerHari = hargaPerHari;
    }
    public void tampilkanData(){
        System.out.println("No Plat : " + noPlat);
   
System.out.println("Merk : " + merk);

System.out.println("Warna : " + warna);
    }
}
