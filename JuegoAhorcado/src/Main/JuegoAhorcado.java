/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Ahorcado;
import Servicios.AhorcadoServicio;

/**
 *
 * @author toto_
 */
public class JuegoAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoServicio ahorServ = new AhorcadoServicio();
        Ahorcado nuevoAhorcado1 = ahorServ.crearJuego();
        
        ahorServ.juego(nuevoAhorcado1);
        System.out.print("");
    }
    
}
