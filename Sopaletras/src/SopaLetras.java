/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Extra_Guia5;
import java.util.Scanner;
/**
 *
 * @author toto_
 */
public class SopaLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerPalabras = new Scanner(System.in);
        char [][] tablero = new char [20][20];
        System.out.println("       -----CONSTRUYENDO UNA SOPA DE LETRAS----- \n"+
                           "       ========================================= \n"+
                           "Por favor ingrese 5 palabras de entre 3 y 5 caracteres");
        String [] palabra = new String[5];
        
        
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Ingrese por favor la "+(i+1)+" palabra");
            palabra[i] = leerPalabras.nextLine().toUpperCase();
            while(palabra[i].length() < 3 || palabra[i].length() > 5){
                System.out.println("La palabra ingresada es mas larga que el rango esperado, intente nuevamente");
                palabra[i] = leerPalabras.nextLine().toUpperCase();
            }
        }
        
        for(int i = 0 ; i < 5 ; i++){
            String palabraAUbicar = palabra[i];
            int filaRandom = (int)(Math.random()*20);
            int columnaRandom = (int) (Math.random()*(20 - palabraAUbicar.length()));
            for(int j = 0 ; j < palabraAUbicar.length() ; j++){
                tablero[filaRandom][columnaRandom+j] = palabraAUbicar.charAt(j);
            }
            
        }
        
        for(int i = 0 ; i < 20 ; i++){
            for(int j = 0 ; j < 20 ; j++){
                while(tablero[i][j] == '\u0000'){
                    tablero[i][j] = (char) (Math.random()*10+'0');
                }
            }
        }
        System.out.println("\n"+
                "================================= \n"+
                "Aqui esta su sopa de letras, imprima y diviertase \n");
        for(int i = 0 ; i < 20 ; i++){
            for(int j = 0 ; j < 20 ; j++){
                    System.out.print(tablero[i][j]+" ");
                }
            System.out.println("");
        }
    }
}    

