/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author toto_
 */
public class Ahorcado {
    private char [] palabra;
    private int cantLetrasEncontradas;
    private int cantIntentos;
    private char [] resultParcial;
    private char [] letrasIngresadas;
    

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int cantIntentos, char[] resultParcial, char[] letrasIngresadas) {
        this.palabra = palabra;
        this.cantIntentos = cantIntentos;
        this.resultParcial = resultParcial;
    }

    

    public Ahorcado(char[] palabra, int cantIntentos) {
        this.palabra = palabra;
        this.cantIntentos = cantIntentos;
    }
   
    public Ahorcado(char[] palabra, int cantLetrasEncontradas, int cantIntentos) {
        this.palabra = palabra;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.cantIntentos = cantIntentos;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantIntentos() {
        return cantIntentos;
    }

    public void setCantIntentos(int cantIntentos) {
        this.cantIntentos = cantIntentos;
    }
    
    public char [] getResultParcial() {
        return resultParcial;
    }

    public void setResultParcial(char [] resultParcial) {
        this.resultParcial = resultParcial;
    }

    public char[] getLetrasIngresadas() {
        return letrasIngresadas;
    }

    public void setLetrasIngresadas(char[] letrasIngresadas) {
        this.letrasIngresadas = letrasIngresadas;
    }
    
    
    
}    

  