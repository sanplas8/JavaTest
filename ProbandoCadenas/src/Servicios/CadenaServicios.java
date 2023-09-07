/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class CadenaServicios {

    private Scanner leerValores = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        System.out.println("Ingrese por favor una frase: ");
        return new Cadena(leerValores.next());
    }

    public int mostrarVocales(Cadena frase) {
        int cantVocales = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            switch ((frase.getFrase().substring(i, i + 1)).toUpperCase()) {
                case "A":
                    cantVocales++;
                    break;
                case "E":
                    cantVocales++;
                    break;
                case "I":
                    cantVocales++;
                    break;
                case "O":
                    cantVocales++;
                    break;
                case "U":
                    cantVocales++;
                    break;
            }
        }
        return cantVocales;
    }

    public void invertirFrase(Cadena frase) {
        System.out.print("La frase ingresada de forma invertida es: ");
        for (int i = 0; i < frase.getLongitud(); i++) {
            System.out.print(frase.getFrase().substring(frase.getLongitud() - 1 - i, frase.getLongitud() - i));
        }
        System.out.println("");
    }

    public int vecesRepetido(Cadena frase) {
        System.out.println("Ingrese una letra para ver si se encuentra dentro de la frase y cuantas veces");
        String letra = leerValores.next();
        int repiteLetra = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            while (frase.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                repiteLetra++;
                break;
            }
        }
        System.out.println("La letra ingresada se repite la cantidad de "+repiteLetra+" veces.");
        return repiteLetra;
    }

    public void comparaLongitud(Cadena frase) {
        System.out.println("Ingrese una nueva frase y compare su longitud con la frase original: ");
        String nuevaFrase = leerValores.next();

        if (frase.getFrase().length() > nuevaFrase.length()) {
            System.out.println("Las frase original es mas larga que la recien introducida por "+(frase.getFrase().length()-nuevaFrase.length())+" caracteres.");
        } else {
            System.out.println("Las frase original es mas corta que la recien introducida por "+(nuevaFrase.length()-frase.getFrase().length())+" caracteres.");
        }
    }

    public void unirFrases(Cadena frase) {
        System.out.println("Ingrese una nueva Frase: ");
        String nuevaFrase = leerValores.next();
        System.out.println("La union de ambas frases da por resultado : \n"
                + '"' + frase.getFrase() + " " + nuevaFrase + '"');
    }

    public String reemplazar(Cadena frase) {
        System.out.println("Ingrese un caracter especial: ");
        String caracter = leerValores.next();
        String palabraCodificada = "";
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
                palabraCodificada = palabraCodificada.concat(caracter);
            } else {
                palabraCodificada = palabraCodificada.concat(frase.getFrase().substring(i, i + 1));
            }

        }
        System.out.println("Su nueva frase codificada es "+palabraCodificada);
        return palabraCodificada;
    }
    
    public boolean contiene(Cadena frase){
        System.out.println("La frase originalmente ingresada con tiene la letra....?(Ingrese una letra: )");
        String letra = leerValores.next();
        int contiene = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if(frase.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)){
                contiene ++;
                System.out.println("Verdadero");
                break;
            }else if(contiene==0 && i == (frase.getLongitud()-1)){
                System.out.println("Falso");
            }
            
        }
        return (contiene>0);
    }
}
