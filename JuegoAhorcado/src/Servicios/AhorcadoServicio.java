/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class AhorcadoServicio {

    private Scanner leerValores = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        System.out.println("-----JUEGO DEL AHORCADO----- \n");
        System.out.println("Ingrese una palabra y la cantidad de intentos para adivinarla");
        System.out.print("Palabra: ");
        String palabra = leerValores.next();
        System.out.println(" \n"
                + " \n"
                + " \n"
                + " \n"
                + " \n"
                + " \n"
                + " \n"
                + " \n"
                + " \n"
                + " \n"
                + " \n"
                + " \n"
                + " \n");
        char[] palabraVector = palabra.toCharArray();
        char[] resultParcial = new char[palabraVector.length];
        char[] letrasIngresadas = new char[palabraVector.length];
        System.out.print("Intentos: ");
        int intentos = leerValores.nextInt();
        while (intentos < palabra.length()) {
            System.out.println("La cantidad de intetntos debe ser mayor o igual a " + palabra.length());
            intentos = leerValores.nextInt();
        }
        return new Ahorcado(palabraVector, intentos, resultParcial, letrasIngresadas);
    }

    public void longitud(Ahorcado nuevo) {
        System.out.println("La longitud de la palabra a buscar es: " + nuevo.getPalabra().length);
    }

    public int buscar(Ahorcado nuevo) {
        System.out.print("Ingrese una letra: ");
        char letra = leerValores.next().charAt(0);
        boolean yaSeEncuentra = false;
        for (int i = 0; i < nuevo.getResultParcial().length; i++) {
            if (nuevo.getResultParcial()[i] == letra) {
                yaSeEncuentra = true;
                break;
            }
        }

        while (yaSeEncuentra) {
            System.out.print("La letra ingresada ya fue validada. Intente con otra: ");
            letra = leerValores.next().charAt(0);
            for (int i = 0; i < nuevo.getResultParcial().length; i++) {
                if (nuevo.getResultParcial()[i] == letra) {
                    yaSeEncuentra = true;
                    break;
                } else {
                    yaSeEncuentra = false;
                }
            }
        }
    

    longitud(nuevo);
    int cont = 0;
    char[] resultParcial = nuevo.getResultParcial();
    char[] letrasIngresadas = nuevo.getLetrasIngresadas();

    for (int i = 0;

    i< nuevo.getPalabra ()
    .length; i

    
        ++) {
            
                if (nuevo.getPalabra()[i] == letra) {
            resultParcial[i] = letra;
            cont++;
        }
    }

    nuevo.setResultParcial (resultParcial);

    if (cont

    
        > 0) {
            System.out.println("La letra se encuentra dentro de la palabra");
    }

    
        else {
            System.out.println("La letra no se encuentra dentro de la palabra");
    }

    System.out.print (
    "La palabra buscada parcial es: ' ");

    for (int i = 0;

    i< nuevo.getResultParcial ()
    .length; i

    
        ++) {
            while (nuevo.getResultParcial()[i] == '\u0000') {
            System.out.print("_ ");
            break;
        }
        System.out.print(nuevo.getResultParcial()[i]);
    }

    System.out.print (

    " '");
    System.out.println (
    "");
    return cont ;
}

public boolean encontradas(Ahorcado nuevo){
        int cont = buscar(nuevo);
        if(cont > 0){
            nuevo.setCantLetrasEncontradas(nuevo.getCantLetrasEncontradas()+cont);
        }
        System.out.println("Numero de letras (encontradas,faltantes): ("+nuevo.getCantLetrasEncontradas()+","+(nuevo.getPalabra().length-nuevo.getCantLetrasEncontradas())+")");
        return (cont > 0);
    }
    
    
    public int intentos(Ahorcado nuevo){
        if(encontradas(nuevo)== false){
            nuevo.setCantIntentos(nuevo.getCantIntentos()-1);
        }
        return nuevo.getCantIntentos();
    }
    
    public void juego(Ahorcado nuevo){
        
        do{
            intentos(nuevo);
            
                System.out.println("Le quedan "+nuevo.getCantIntentos()+" intentos");
                
            
            
        }while (nuevo.getCantIntentos() > 0 && nuevo.getCantLetrasEncontradas()!= nuevo.getPalabra().length);
        
        if(nuevo.getCantIntentos() == 0){
            System.out.println("Se te acabaron los intentos. Reinicia el juego");
        }else if(nuevo.getCantIntentos() > 0 && nuevo.getCantLetrasEncontradas()== nuevo.getPalabra().length){
            System.out.println("Muy bien !!!GANASTE!!!");
        }
        
        
    }

}
