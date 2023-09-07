/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.Duration;

/**
 *
 * @author toto_
 */
public class Peliculas {
    private String titulo;
    private String director;
    private int edadMinima;
    private Duration duracion;

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, int edadMinima, Duration duracion) {
        this.titulo = titulo;
        this.director = director;
        this.edadMinima = edadMinima;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }
    
    public int getHoras() {
        return (int) duracion.toHours();
    }

    public int getMinutos() {
        return (int) (duracion.toMinutes() % 60);
    }

    public int getSegundos() {
        return (int) (duracion.getSeconds() % 60);
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo+ 
                ", Director: " + director + ", Apto a partir de: " + edadMinima + " anios, Duracion: " + duracion;
    }
    
    
    
}
