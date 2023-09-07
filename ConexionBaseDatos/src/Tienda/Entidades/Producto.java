/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Entidades;

/**
 *
 * @author Sanplas8
 */
public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int fabricante;

    public Producto() {
    }

    public Producto(String nombre, double precio, int fabricante) {
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fabricante;
    }

    
    public Producto(int codigo, String nombre, double precio, int fabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getFabricante() {
        return fabricante;
    }

    public void setFabricante(int fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + " | Nombre: " + nombre + " | Precio: $" + precio + " | Codigo fabricnte: " + fabricante ;
    }

   
    
    
}
