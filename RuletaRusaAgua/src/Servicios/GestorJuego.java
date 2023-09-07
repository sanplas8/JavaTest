/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class GestorJuego {

    private Scanner leerValores;
    private ArrayList<Jugador> listadoJugadores;

    public GestorJuego() {
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
        this.listadoJugadores = new ArrayList<>();
    }

    public Jugador crearJugador() {
        Jugador jugador = new Jugador();
        System.out.println("Ingrese los datos del jugador");
        System.out.print("ID: ");
        jugador.setID(leerValores.next());
        System.out.print("Nombre: ");
        jugador.setNombre(leerValores.next()+" "+jugador.getID());
        return jugador;
    }

    public void agregarJugador() {
        listadoJugadores.add(crearJugador());
    }
    
    

    public RevolverDeAgua crearRevolver() {
        RevolverDeAgua revolver = new RevolverDeAgua();
        revolver.llenarRevolver();
        return revolver;
    }

    public ArrayList<Jugador> getListadoJugadores() {
        return listadoJugadores;
    }

    public void setListadoJugadores(ArrayList<Jugador> listadoJugadores) {
        this.listadoJugadores = listadoJugadores;
    }

    public void arrancarJuego() {
        System.out.println("-----Iniciando juego-----");
        System.out.println("Ingrese la cantidad de jugadores");
        int cantidad = leerValores.nextInt();
        if (cantidad > 6) {
            for (int i = 0; i < 6; i++) {
                agregarJugador();
                
            }
        } else {
            for (int i = 0; i < cantidad; i++) {
                agregarJugador();
                
            }
        }
        
        
        Juego nuevoJuego = new Juego();
        nuevoJuego.llenarJuego(listadoJugadores, crearRevolver());
        
        
        nuevoJuego.ronda();
        
        }
}
