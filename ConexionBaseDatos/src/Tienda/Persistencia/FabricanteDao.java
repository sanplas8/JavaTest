/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Persistencia;

import Tienda.Entidades.Fabricante;

/**
 *
 * @author Sanplas8
 */
public final class FabricanteDao extends DAO{
    public void ingresaFabricanteA_LaBase(Fabricante nuevoFabricante) throws Exception{
        try {
            if(nuevoFabricante == null){
                throw new Exception("Debe ingresar un fabricante");
            }
            String sql = "INSERT INTO fabricante (nombre) "
                    + "VALUES ('"+nuevoFabricante.getNombreFabricante()+"');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
