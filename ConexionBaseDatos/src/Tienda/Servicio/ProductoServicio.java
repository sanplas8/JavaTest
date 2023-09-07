/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Servicio;

import Tienda.Entidades.Producto;
import Tienda.Persistencia.ProductoDao;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sanplas8
 */
public final class ProductoServicio {
    private ProductoDao daoProducto;
    private Scanner leerValores;
    private ArrayList<Producto> listadoProductos;
    public ProductoServicio() {
        this.daoProducto = new ProductoDao();
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
        this.listadoProductos = new ArrayList();
    }
    
    public void mostrarProductos() throws Exception{
        daoProducto.mostrarProductos();
    }
    
    public void nombrePrecio() throws Exception{
        daoProducto.listaNombrePrecio();
    }
    
    public void productosEntre12_202() throws Exception{
        daoProducto.productosEntre120_202();
    }
    
    public void mostrarPortatiles() throws Exception{
        daoProducto.listarPortatiles();
    }
    
    public void masBarato() throws Exception{
        daoProducto.listarMasBarato();
    }
    
    public Producto crearProducto(){
        System.out.println("---- Ingresando Producto ----");
        System.out.print("Indique nombre del producto: ");
        String nombre = leerValores.next();
        System.out.print("Indique precio del producto: ");
        double precio = leerValores.nextDouble();
        System.out.print("Ingrese codigo de fabricante (del 1 al 10): ");
        int codigoFabricante;
        do{
            codigoFabricante = leerValores.nextInt();
            if(codigoFabricante <= 0 || codigoFabricante >10){
                System.out.print("Codigo de fabricante erroneo, intente nuevamente: ");
            }
        }while(codigoFabricante <= 0 || codigoFabricante >10);
        return new Producto(nombre, precio, codigoFabricante);
    }
    
    public void agregarProdA_Base() throws Exception{
        daoProducto.agregarProductoA_LaBase(crearProducto());
    }
    
    public void modificarProducto() throws Exception{
        listadoProductos = (ArrayList<Producto>)daoProducto.importarProductos();
        System.out.println("----- Listado Productos ---- ");
        daoProducto.mostrarProductos();
        System.out.print("Seleccione el producto que desea modifcar indicando su codigo: ");
        int opcion1 = leerValores.nextInt();
        System.out.println("Usted modificara el producto....");
        daoProducto.mostrarPorId(opcion1);
        System.out.print("Indique el campo que desea eliminar \n"
        +"1- Nombre \n"
        +"2- Precio \n"
        +"3- Fabricante \n"
        +"Respuesta: ");
        int opcion2 = leerValores.nextInt();
        switch (opcion2) {
                case 1:
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nuevoNombre = leerValores.next();
                    listadoProductos.get((opcion2-1)).setNombre(nuevoNombre);
                    break;
                case 2:
                    System.out.print("Ingrese el nuevo precio: ");
                    double nuevoPrecio = leerValores.nextDouble();
                    listadoProductos.get((opcion2-1)).setPrecio(nuevoPrecio);
                    break;
                case 3:
                    System.out.print("Ingrese el nuevo fabricante: ");  
                    int nuevoFabricante = leerValores.nextInt();
                    listadoProductos.get((opcion2-1)).setFabricante(nuevoFabricante);
                    break;
            }
        daoProducto.modificarProducto(listadoProductos.get((opcion2-1)),opcion1,opcion2);
    }
}
