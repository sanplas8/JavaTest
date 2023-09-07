/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import Entidades.Pelicula;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class PeliculaServicio {
    private Scanner leerValores;
    private ArrayList<Pelicula> peliculas;

    public PeliculaServicio() {
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
        this.peliculas = new ArrayList();
    }
    
    public Pelicula crearPelicula() {
        System.out.println("Ingrese el titulo de la pelicula: ");
        String titulo = leerValores.next();
        System.out.println("Ingrese el director de la pelicula: ");
        String director = leerValores.next();
        System.out.println("Ingrese la duracion de la pelicula");
        System.out.println("Horas: ");
        int horas = leerValores.nextInt();
        while(horas < 0 || horas > 24){
            System.out.println("Dato ingresado incorrecto \n"+
                    "Intente nuevamente: ");
            horas = leerValores.nextInt();
        }
        System.out.println("Minutos: ");
        int minutos = leerValores.nextInt();
        while(minutos < 0 || minutos > 60){
            System.out.println("Dato ingresado incorrecto \n"+
                    "Intente nuevamente: ");
            minutos = leerValores.nextInt();
        }
        System.out.println("Segundos: ");
        int segundos = leerValores.nextInt();
        while(segundos < 0 || segundos > 60){
            System.out.println("Dato ingresado incorrecto \n"+
                    "Intente nuevamente: ");
            segundos = leerValores.nextInt();
        }
        Duration duracion = Duration.ofHours(horas).plusMinutes(minutos).plusSeconds(segundos);
        return new Pelicula(titulo, director, duracion);
    }
    
    public void agregarPelicula(){
        System.out.println("-----Renovacion cartelera cine-----");
        String respuesta = "";
        do {
            peliculas.add(crearPelicula());
            System.out.println("Desea agregar mas peliculas? (si/no)");
            respuesta = leerValores.next();
            while (!(respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("no"))) {
                System.out.println("Respuesta incorrecta \n"
                        + "Intente nuevamente: ");
                respuesta = leerValores.next();
            }
        } while (respuesta.equalsIgnoreCase("si"));
    }
    
    public void mostrarPeliculas(){
        System.out.println("-----Catalogo de peliculas-----");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }
    
    public void mostrarPelisMay1hs(){
        System.out.println("-----Catalogo de peliculas mayor a 1hs de duracion-----");
        for (Pelicula pelicula : peliculas) {
            if(pelicula.getHoras() > 1 || (pelicula.getHoras() == 1 && pelicula.getMinutos() > 0) || (pelicula.getHoras() == 1 && pelicula.getSegundos() > 0)){
                System.out.println(pelicula.toString());
            }
        }
    }
    
    public void ordenarMayorDuracion(){
        System.out.println("-----Peliculas ordenadas de menor a mayor duracion-----");
        peliculas.sort(Pelicula.compararDuracionMayor);
        mostrarPeliculas();
    }
    
    public void ordenarMenorDuracion(){
        System.out.println("-----Peliculas ordenadas de mayor a menor duracion-----");
        peliculas.sort(Pelicula.compararDuracionMenor);
        mostrarPeliculas();
    }
    
    public void ordenarTitulo(){
        System.out.println("-----Peliculas ordenadas alfabeticamente segun titulo-----");
        peliculas.sort(Pelicula.compararTitulo);
        mostrarPeliculas();
    }
    
    public void ordenarDirector(){
        System.out.println("-----Peliculas ordenadas alfabeticamente segun director-----");
        peliculas.sort(Pelicula.compararDirector);
        mostrarPeliculas();
    }
}
