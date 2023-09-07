/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Servicio;

import Tienda.Entidades.Fabricante;
import Tienda.Persistencia.FabricanteDao;
import java.util.Scanner;

/**
 *
 * @author Sanplas8
 */
public class FabricanteServicio {
    private FabricanteDao daoFabricante;
    private Scanner leerValores; 

    public FabricanteServicio() {
        this.daoFabricante = new FabricanteDao();
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Fabricante nuevoFabricante(){
        System.out.println("----- Crear nuevo Fabricante -----");
        System.out.print("Ingrese nombre del fabricante: ");
        String nombreFabricante = leerValores.next();
        return new Fabricante(nombreFabricante);
    }
    
    public void AgregarFabricanteA_Base() throws Exception{
        daoFabricante.ingresaFabricanteA_LaBase(nuevoFabricante());
    }
}
