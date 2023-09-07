/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Cafetera;
import Servicios.CafeteraServicios;

/**
 *
 * @author toto_
 */
public class Cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicios cafeteraServ = new CafeteraServicios();
        
        Cafetera cafe1 = cafeteraServ.crearCafetera();
        
        
        cafeteraServ.llenarCafetera(cafe1);
        
        cafeteraServ.servirTaza(cafe1);
        
        
        cafeteraServ.agregarCafe(cafe1);
    }
    
}
