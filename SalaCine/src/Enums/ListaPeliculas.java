/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author toto_
 */
public enum ListaPeliculas {
    PELICULA1("Jurassic Park","Steven Spealberg",13,127),PELICULA2("Rocky Balboa","John G. Avildsen",16,119),
    PELICULA3("Harry Potter y la piedra filosofal","Chris Columbus",0,152),PELICULA4("Buenos Muchachos","Martin Scorsese",18,146),
    PELICULA5("0 en conducta","Adam Rifkin",18,95);
    
    private String titulo;
    private String director;
    private int edadMinima;
    private int duracion;

    private ListaPeliculas(String titulo, String director, int edadMinima, int duracion) {
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo+ 
                "Director: " + director + ", Apto a partir de: " + edadMinima + " anios, Duracion: " + duracion;
    }
    
    
}
