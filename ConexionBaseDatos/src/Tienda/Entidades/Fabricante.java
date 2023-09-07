/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Entidades;

/**
 *
 * @author Sanplas8
 */
public class Fabricante {
    private int codigo;
    private String nombreFabricante;

    public Fabricante() {
    }

    public Fabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }
    
    

    public Fabricante(int codigo, String nombreFabricante) {
        this.codigo = codigo;
        this.nombreFabricante = nombreFabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }
    
    
}
