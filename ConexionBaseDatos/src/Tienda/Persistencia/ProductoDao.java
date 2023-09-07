/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Persistencia;

import Tienda.Entidades.Fabricante;
import Tienda.Entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Sanplas8
 */
public final class ProductoDao extends DAO {

    private Scanner leerValores;

    public ProductoDao() {
        new Scanner(System.in).useDelimiter("\n");
    }

    public void mostrarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM PRODUCTO;";
            conectarBase();
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("Codigo producto: " + resultado.getInt(1) + " | Nombre: " + resultado.getString(2) + " | Precio: $" + resultado.getInt(3) + " | Codigo Fabricante: " + resultado.getInt(4));
            }
            desconectarBase();
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void listaNombrePrecio() throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM PRODUCTO;";
            conectarBase();
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("Nombre: " + resultado.getString(1) + " | Precio: $" + resultado.getInt(2));
            }
            desconectarBase();
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void productosEntre120_202() throws Exception {
        try {
            String sql = "SELECT * FROM PRODUCTO WHERE precio BETWEEN 120 AND 202;";
            conectarBase();
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("Codigo producto: " + resultado.getInt(1) + " | Nombre: " + resultado.getString(2) + " | Precio: $" + resultado.getInt(3) + " | Codigo Fabricante: " + resultado.getInt(4));

            }
            desconectarBase();
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void listarPortatiles() throws Exception {
        try {
            String sql = "SELECT * FROM PRODUCTO WHERE nombre LIKE '%portatil%';";
            conectarBase();
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("Codigo producto: " + resultado.getInt(1) + " | Nombre: " + resultado.getString(2) + " | Precio: $" + resultado.getInt(3) + " | Codigo Fabricante: " + resultado.getInt(4));

            }
            desconectarBase();
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void listarMasBarato() throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM PRODUCTO ORDER BY precio LIMIT 1;";
            conectarBase();
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("Nombre: " + resultado.getString(1) + " | Precio: $" + resultado.getInt(2));
            }
            desconectarBase();
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void agregarProductoA_LaBase(Producto nuevoProducto) throws Exception {
        try {
            if (nuevoProducto == null) {
                throw new Exception("Debe ingresar un producto");
            }
            String sql = "INSERT INTO producto (nombre,precio,codigo_fabricante) "
                    + "VALUES ('" + nuevoProducto.getNombre() + "'," + nuevoProducto.getPrecio() + "," + nuevoProducto.getFabricante() + ");";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> importarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto;";
            consultarBase(sql);
            Producto nuevoProducto = null;
            ArrayList<Producto> listadoProductos = new ArrayList();
            while (resultado.next()) {
                nuevoProducto = new Producto();
                nuevoProducto.setCodigo(resultado.getInt(1));
                nuevoProducto.setNombre(resultado.getString(2));
                nuevoProducto.setPrecio(resultado.getDouble(3));
                nuevoProducto.setFabricante(resultado.getInt(4));
                listadoProductos.add(nuevoProducto);
            }
            desconectarBase();
            return listadoProductos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void mostrarPorId(int id) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo = " + id + ";";
            conectarBase();
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("Codigo producto: " + resultado.getInt(1) + " | Nombre: " + resultado.getString(2) + " | Precio: $" + resultado.getInt(3) + " | Codigo Fabricante: " + resultado.getInt(4));
            }
            desconectarBase();
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void modificarProducto(Producto nuevoProducto,int opcion,int opcion2) throws Exception {
        try {
            if(nuevoProducto == null){
                throw new Exception("Debe ingresar un producto");
            }
            String sql;
            switch(opcion2){
                case 1:
                    sql = "UPDATE producto SET nombre = '"+nuevoProducto.getNombre()+"' WHERE codigo = "+opcion+";";
                    insertarModificarEliminar(sql);
                    break;
                case 2:
                    sql = "UPDATE producto SET precio = '"+nuevoProducto.getPrecio()+"' WHERE codigo = "+opcion+";";
                    insertarModificarEliminar(sql);
                    break;
                case 3:
                    sql = "UPDATE producto SET codigo_fabricante = '"+nuevoProducto.getFabricante()+"' WHERE codigo = "+opcion+";";
                    insertarModificarEliminar(sql);
                    break;
            }
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

}
