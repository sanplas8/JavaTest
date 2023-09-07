/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author toto_
 */
public class Cine {
    private Peliculas pelicula;
    private Sala sala;    
    private ArrayList<Espectadores> listaEspectadores;
    private double precioEntrada;

    

    public Cine() {
        this.precioEntrada = 1600;
    }

    public Cine(Peliculas pelicula, Sala sala, ArrayList<Espectadores> listaEspectadores, double precioEntrada) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.listaEspectadores = listaEspectadores;
        this.precioEntrada = precioEntrada;
    }

    public Cine(Peliculas pelicula, Sala sala, ArrayList<Espectadores> listaEspectadores) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.listaEspectadores = listaEspectadores;
    }
    
    public ArrayList<Espectadores> getListaEspectadores() {
        return listaEspectadores;
    }

    public void setListaEspectadores(ArrayList<Espectadores> listaEspectadores) {
        this.listaEspectadores = listaEspectadores;
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }    

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine: " + 
                pelicula + 
                sala + 
                precioEntrada+
                listaEspectadores;
    }
    
    
}
