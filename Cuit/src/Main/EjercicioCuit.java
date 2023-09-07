/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Cuit;
import Servicios.CuitServicio;

/**
 *
 * @author toto_
 */
public class EjercicioCuit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuitServicio nuevoServ = new CuitServicio();
        Cuit nuevo1 = nuevoServ.crearCuit();
        nuevoServ.mostrarCuit(nuevo1);
    }
    
}
