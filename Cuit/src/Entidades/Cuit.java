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
public class Cuit {

    private String nombre;
    private long dni;
    private String sexo;
    private int diferencial;
    private int verificador;
    

    public Cuit() {

    }

    public Cuit(String nombre, long dni, String sexo, int diferencial, int verificador) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;

        if (sexo.equalsIgnoreCase("h")) {
            this.diferencial = 20;
        } else if (sexo.equalsIgnoreCase("m")) {
            this.diferencial = 27;
        }

        this.verificador = verificador;
    }

    public int getDiferencial() {
        return diferencial;
    }

    public void setDiferencial(int diferencial) {
        this.diferencial = diferencial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getVerificador() {
        return verificador;
    }

    public void setVerificador(int verificador) {
        this.verificador = verificador;
    }
}
    
