/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class CafeteraServicios {

    Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
    private int opcion;
    private String respuesta;

    public Cafetera crearCafetera() {
        System.out.println("Toda cafetera viene seteada de fabrica con una capacidad de 2lts");
        return new Cafetera(2000, 0);
    }

    public void llenarCafetera(Cafetera unidad) {
        System.out.println("Su cafetera se encuentra vacia, desea llenarla en su capacidad maxima?(si/no)");
        respuesta = leerValores.next();
        if(respuesta.equalsIgnoreCase("si")){
            unidad.setCantidadActual(unidad.getCapacidadMaxima());
        System.out.println("Su cafetera ahora esta llena con 2lts de cafe");
        }else{
            System.out.println("Su cafetera permanecera vacia");
        }
        
    }
    
    public void vaciarCafetera(Cafetera unidad){
        System.out.println("*****Vaciando cafetera*****");
        unidad.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera unidad){
        System.out.println("Ingrese la cantidad en ml de cafe que quiere agregar a la cafetera");
        int relleno = leerValores.nextInt();
        
        while(unidad.getCantidadActual()+relleno > unidad.getCapacidadMaxima()){
            System.out.println("La cantidad ingresada supera la capacidad maxima, intente con una cantidad menor o igual a "+(unidad.getCapacidadMaxima()-unidad.getCantidadActual())+"ml");
            relleno = leerValores.nextInt();
        }
        
        unidad.setCantidadActual(unidad.getCantidadActual()+relleno);
        
        System.out.println("Excelente, ahora su cafetera tiene una cantidad de "+unidad.getCantidadActual()+"ml de cafe");
    }

    public void servirTaza(Cafetera unidad) {
        
        
        System.out.println(" -----Servir cafe----- \n"
                + "Ingrese por favor el tamanio de cafe que quiere tomar: \n"
                + "1- Chico (100ml) \n"
                + "2- Mediano (150ml) \n"
                + "3- Grande (200ml)");
        opcion = leerValores.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("******Sirviendo taza*******");
                if (unidad.getCantidadActual() >= 100) {
                    System.out.println("Disfrute de su cafe");
                    unidad.setCantidadActual(unidad.getCantidadActual() - 100);
                } else if (unidad.getCantidadActual() >= 1 && unidad.getCantidadActual() < 100) {
                    System.out.println("No hay suficiente cafe para llenar la taza. La misma sera llenada con " + unidad.getCantidadActual());
                    unidad.setCantidadActual(0);
                } else {
                    System.out.println("La cafetera esta vacia. Por favor solicite que la rellenen");
                }
                break;
            case 2:
                System.out.println("******Sirviendo taza*******");
                if (unidad.getCantidadActual() >= 150) {
                    System.out.println("Disfrute de su cafe");
                    unidad.setCantidadActual(unidad.getCantidadActual() - 150);
                } else if (unidad.getCantidadActual() >= 1 && unidad.getCantidadActual() < 150) {
                    System.out.println("No hay suficiente cafe para llenar la taza. La misma sera llenada con " + unidad.getCantidadActual());
                    unidad.setCantidadActual(0);
                } else {
                    System.out.println("La cafetera esta vacia. Por favor solicite que la rellenen");
                }
                break;
            case 3:
                System.out.println("******Sirviendo taza*******");
                if (unidad.getCantidadActual() >= 200) {
                    System.out.println("Disfrute de su cafe");
                    unidad.setCantidadActual(unidad.getCantidadActual() - 200);
                } else if (unidad.getCantidadActual() >= 1 && unidad.getCantidadActual() < 200) {
                    System.out.println("No hay suficiente cafe para llenar la taza. La misma sera llenada con " + unidad.getCantidadActual());
                    unidad.setCantidadActual(0);
                } else {
                    System.out.println("La cafetera esta vacia. Por favor solicite que la rellenen");
                }
                break;
            default:
                System.out.println("Opcion elegida inexistente, intente nuevamente");
                do {
                    System.out.println(" -----Servir cafe----- \n"
                            + "Ingrese por favor el tamanio de cafe que quiere tomar: \n"
                            + "1- Chico (100ml) \n"
                            + "2- Mediano (150ml) \n"
                            + "3- Grande (200ml");
                    opcion = leerValores.nextInt();
                } while (opcion < 1 && opcion > 3);
                System.out.println("Muchas Gracias \n"+
                        "==================================== \n"+
                        "==================================== \n");
        }

    }
}
