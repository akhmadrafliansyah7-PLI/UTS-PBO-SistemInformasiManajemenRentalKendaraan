/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemRentalKendaraan;

/**
 *
 * @author Lenovo GK
 */
import SistemRentalKendaraan.view.MenuView;
import SistemRentalKendaraan.controller.MenuController;

public class SistemRentalKendaraan {
    
    public static void main(String[] args){
        
        MenuView view = new MenuView();
        MenuController controller = new MenuController(view);
        
        controller.dataDummy();
        controller.jalankanProgram();
    }
}
