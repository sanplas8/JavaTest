/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.HashSet;

/**
 *
 * @author toto_
 */
public class Sala {
    private String [][] sala;

    public Sala() {
        this.sala = new String [8][6];
    }

    public Sala(String[][] sala) {
        this.sala = sala;
    }
    

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public void mostrarSala(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(sala[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    
}
