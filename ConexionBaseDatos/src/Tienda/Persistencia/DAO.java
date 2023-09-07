/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sanplas8
 */
public abstract class DAO {
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASSWORD = "totiniW0827%%";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    protected void conectarBase() throws ClassNotFoundException, SQLException{
        try{
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        }catch (ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }
    
    protected void desconectarBase() throws Exception{
        try{
            if (resultado != null){
                resultado.close();
            }
            if (sentencia != null){
                sentencia.close();
            }
            if (conexion != null){
                conexion.close();
            }
        }catch(Exception e){
            throw e;
        }
    }
    protected void insertarModificarEliminar(String consultaSql) throws SQLException, ClassNotFoundException, Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(consultaSql);
        } catch (SQLException | ClassNotFoundException ex) {
            //conexion.rollback();
            
            throw ex;
        }finally{
            desconectarBase();
        }
    }
    
    protected void consultarBase(String consultaSql) throws Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(consultaSql);
        } catch (Exception ex) {
            throw ex;
        }
    } 
}
