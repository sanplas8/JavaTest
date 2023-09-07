/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicios.PaisesServicio;

/**
 *
 * @author toto_
 */
public class StockPelis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisesServicio paiServ = new PaisesServicio();
        paiServ.agregarYMostrarPais();
        paiServ.OrdenarAlfabeticamente();
        paiServ.EliminarPais();
    }
    
}
