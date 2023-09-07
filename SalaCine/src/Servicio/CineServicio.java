/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Cine;
import Entidades.Espectadores;
import Entidades.Peliculas;
import Entidades.Sala;
import Enums.ListaPeliculas;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class CineServicio {

    private Scanner leerValores;
    private ArrayList<Espectadores> filaEspectadores;
    private String [][] sala;
    private Cine nuevoCine;

    public CineServicio() {
        this.leerValores = new Scanner(System.in).useDelimiter("\n");
        this.filaEspectadores = new ArrayList();
        this.sala = sala;
        this.nuevoCine = nuevoCine;
    }

    public Peliculas crearPelicula() {
        Peliculas nuevaPelicula = new Peliculas();
        System.out.println("-----Ingrese la pelicula que se va a proyectar-----");
        int respuesta;
        do {
            System.out.print("1- Jurassic Park \n"
                    + "2- Rocky \n"
                    + "3- Harry Potter y la piedra filosofal \n"
                    + "4- Buenos Muchachos \n"
                    + "5- 0 en conducta \n"
                    + "\n"
                    + "Respuesta: ");
            respuesta = leerValores.nextInt();
            leerValores.nextLine();
            switch (respuesta) {
                case 1:
                    nuevaPelicula.setTitulo(ListaPeliculas.PELICULA1.getTitulo());
                    nuevaPelicula.setDirector(ListaPeliculas.PELICULA1.getDirector());
                    nuevaPelicula.setEdadMinima(ListaPeliculas.PELICULA1.getEdadMinima());
                    Duration duracion1 = Duration.ofMinutes((int) (ListaPeliculas.PELICULA1.getDuracion()));
                    nuevaPelicula.setDuracion(duracion1);
                    break;
                case 2:
                    nuevaPelicula.setTitulo(ListaPeliculas.PELICULA2.getTitulo());
                    nuevaPelicula.setDirector(ListaPeliculas.PELICULA2.getDirector());
                    nuevaPelicula.setEdadMinima(ListaPeliculas.PELICULA2.getEdadMinima());
                    Duration duracion2 = Duration.ofMinutes((int) (ListaPeliculas.PELICULA2.getDuracion()));
                    nuevaPelicula.setDuracion(duracion2);
                    break;
                case 3:
                    nuevaPelicula.setTitulo(ListaPeliculas.PELICULA3.getTitulo());
                    nuevaPelicula.setDirector(ListaPeliculas.PELICULA3.getDirector());
                    nuevaPelicula.setEdadMinima(ListaPeliculas.PELICULA3.getEdadMinima());
                    Duration duracion3 = Duration.ofMinutes((int) (ListaPeliculas.PELICULA3.getDuracion()));
                    nuevaPelicula.setDuracion(duracion3);
                    break;
                case 4:
                    nuevaPelicula.setTitulo(ListaPeliculas.PELICULA4.getTitulo());
                    nuevaPelicula.setDirector(ListaPeliculas.PELICULA4.getDirector());
                    nuevaPelicula.setEdadMinima(ListaPeliculas.PELICULA4.getEdadMinima());
                    Duration duracion4 = Duration.ofMinutes((int) (ListaPeliculas.PELICULA4.getDuracion()));
                    nuevaPelicula.setDuracion(duracion4);
                    break;
                case 5:
                    nuevaPelicula.setTitulo(ListaPeliculas.PELICULA5.getTitulo());
                    nuevaPelicula.setDirector(ListaPeliculas.PELICULA5.getDirector());
                    nuevaPelicula.setEdadMinima(ListaPeliculas.PELICULA5.getEdadMinima());
                    Duration duracion5 = Duration.ofMinutes((int) (ListaPeliculas.PELICULA5.getDuracion()));
                    nuevaPelicula.setDuracion(duracion5);
                    break;
                default:
                    System.out.println("Respuesta incorrecta, intente nuevamente");
            }
        } while (respuesta < 0 || respuesta > 5);
        return nuevaPelicula;
    }

    public void crearEspectadores() {

        int cantidad = (int) (Math.random() * 200) + 1;

        for (int i = 0; i < cantidad; i++) {
            String nombre = "Espectador" + (i + 1);
            int edad = (int) (Math.random() * 66) + 10;
            double dinero = (Math.random() * 5000) + 500;
            Espectadores nuevoEspectador = new Espectadores(nombre, edad, dinero);
            filaEspectadores.add(nuevoEspectador);
        }

        System.out.println("------La cantidad de espectadores sera de: " + cantidad + "------");
    }

    public Sala crearSala() {
        String[][] nuevaSala = new String[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                switch (j) {
                    case (0):
                        nuevaSala[i][j] = (8 - i) + "A ";
                        break;
                    case (1):
                        nuevaSala[i][j] = (8 - i) + "B ";
                        break;
                    case (2):
                        nuevaSala[i][j] = (8 - i) + "C ";
                        break;
                    case (3):
                        nuevaSala[i][j] = (8 - i) + "D ";
                        break;
                    case (4):
                        nuevaSala[i][j] = (8 - i) + "E ";
                        break;
                    case (5):
                        nuevaSala[i][j] = (8 - i) + "F ";

                }
            }
        }
        System.out.println("-----Se creo la sala de 8 filas X 6 columnas");
        sala = nuevaSala;
        return new Sala(nuevaSala);
    }

    public Cine crearCine() {
        Cine cine1 = new Cine();
        cine1.setPelicula(crearPelicula());
        System.out.println("Se proyectara \n"
                + cine1.getPelicula());
        cine1.setSala(crearSala());
        cine1.getSala().mostrarSala();
        crearEspectadores();
        cine1.setListaEspectadores(filaEspectadores);
        cine1.setPrecioEntrada(cine1.getPrecioEntrada());
        nuevoCine = cine1;
        return cine1;
    }

    public void ubicarEspectadores() {
        System.out.println("-----Boleteria-----");
        boolean puedeEntrar = false;
        boolean desocupado = false;
        int cont = 0;

        for (Espectadores aux : filaEspectadores) {
            if (aux.getDinero() > nuevoCine.getPrecioEntrada() && aux.getEdad() > nuevoCine.getPelicula().getEdadMinima() && cont < 48) {
                puedeEntrar = true;
                System.out.println(aux.getNombre() + " Puede ingresar a la sala");
            } else {
                switch(cont){
                    case 48:
                        System.out.println("Disculpe, la sala esta llena");
                        puedeEntrar = false;
                        break;
                    default:
                        System.out.println("Disculpe, no puede ingresar porq no tiene dinero suficiente o su edad no es apta para ver la pelicula");
                        puedeEntrar = false;
                }
            }

            if (puedeEntrar) {
                do {
                    int fila = (int) (Math.random() * 8);
                    int columna = (int) (Math.random() * 6);
                    if (sala[fila][columna].endsWith(" ")) {
                        sala[fila][columna] = sala[fila][columna].substring(0, 2) + "X";
                        System.out.println("Su ubicacion sera: " + sala[fila][columna].substring(0, 2));
                        desocupado = true;
                        cont ++;
                    } else {
                       // System.out.println("Asiento ocupado \n"
                         //       + "-----Reubicando-----");
                        desocupado = false;
                    }
                } while (!desocupado);
            }
        }
    }

    public void iniciarFuncion() {
        System.out.println("-----Nueva Funcion----");
        crearCine();
        ubicarEspectadores();
        System.out.println(" \n"+
                "Los asientos ocupados son \n"+
                "----------------------------");
        nuevoCine.getSala().mostrarSala();
    }
}
