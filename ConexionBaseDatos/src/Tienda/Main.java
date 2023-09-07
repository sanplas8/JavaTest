/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tienda;

import Tienda.Persistencia.ProductoDao;
import Tienda.Servicio.FabricanteServicio;
import Tienda.Servicio.ProductoServicio;
import java.util.Scanner;

/**
 *
 * @author Sanplas8
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ProductoServicio pS = new ProductoServicio();
        FabricanteServicio fS = new FabricanteServicio();
        Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
        String opc = "";

        do {
            System.out.print("----- MENU ----- \n"
                    + "1- Lista el nombre de todos los productos que hay en la tabla producto. \n"
                    + "2- Lista los nombres y los precios de todos los productos de la tabla producto. \n"
                    + "3- Listar aquellos productos que su precio esté entre 120 y 202. \n"
                    + "4- Buscar y listar todos los Portátiles de la tabla producto. \n"
                    + "5- Listar el nombre y el precio del producto más barato. \n"
                    + "6- Ingresar un producto a la base de datos. \n"
                    + "7- Ingresar un fabricante a la base de datos \n"
                    + "8- Editar un producto con datos a elección. \n"
                    + "9- Salir \n"
                    + "Ingrese opcion: ");
            opc = leerValores.next();
            switch(opc){
                case "1":
                    pS.mostrarProductos();
                    break;
                case "2":
                    pS.nombrePrecio();
                    break;
                case "3":
                    pS.productosEntre12_202();
                    break;
                case "4":
                    pS.mostrarPortatiles();
                    break;
                case "5":
                    pS.masBarato();
                    break;
                case "6":
                    pS.agregarProdA_Base();
                    break;
                case "7":
                    fS.AgregarFabricanteA_Base();
                    break;
                case "8":
                    pS.modificarProducto();
                    break;
                case "9":
                    System.out.println("Gracias por utilziar el sistema de consultas");
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta, intente nuevamente....");
            }
        }while(!opc.equalsIgnoreCase("9"));
    }
    
    }
