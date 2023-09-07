/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author toto_
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public Juego() {

    }

    public void llenarJuego(ArrayList<Jugador> j, RevolverDeAgua r) {
        jugadores = j;
        revolver = r;
    }

    public void ronda() {
        System.out.println("-----Iniciando ronda-----");
        boolean band = true;
        do {
            for (Jugador aux : jugadores) {
                System.out.println(revolver.toString());
                System.out.println("Jugador " + aux.getNombre() + " es tu turno");
                aux.disparo(revolver);

                if (aux.isMojado()) {
                    System.out.println("-----Juego terminado----- \n"
                            + "Perdio el jugador: " + aux.getNombre());
                    band = false;
                    break;
                } else {
                    System.out.println("Siguiente jugador------>");
                }

            }
        } while (band);
    }
}
