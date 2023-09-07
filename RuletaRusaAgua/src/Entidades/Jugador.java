/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author toto_
 */
public class Jugador {
    private String id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(String id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public void disparo(RevolverDeAgua r){
        System.out.println("-----Apunte y dispare-----");
        if(r.mojar()){
            mojado = true;
            System.out.println("Estas muerto");
        }else{
            System.out.println("Zafaste tenes una vida mas");
            r.siguienteChorro();
        }
        
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
    
    
}
