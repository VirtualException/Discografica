/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseDatos;
import aplicacion.Genero;
import aplicacion.DatosAdicionalesTrabajadores;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author basesdatos
 */
public class DAOGeneros extends AbstractDAO {

   public DAOGeneros (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

   public List<Genero> obtenerGenero(String nombre) {
       System.out.println("DAO obtenerGenero");
        List<Genero> resultado =new ArrayList<>();
        Connection con;
        Genero generoactual;
        PreparedStatement stmGenero=null;
        ResultSet rsGenero;
        con=this.getConexion();
        String consulta = "select nombre, descripcion "+
                                        "from genero ";
        if(!nombre.isEmpty()){
            consulta = consulta + "where nombre like '%" + nombre +"%'" ;
        }
        try{
            stmGenero = con.prepareStatement(consulta);
            rsGenero = stmGenero.executeQuery();
            while(rsGenero.next()){
                generoactual = new Genero(rsGenero.getString("nombre"), rsGenero.getString("descripcion"));
                        resultado.add(generoactual);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
            try{stmGenero.close();} catch(SQLException e){System.out.println("Error al cerrar los cursores");}
        }
        
        return resultado;
    }
    public void borrarGenero(String nombre, String desc){
        System.out.println("DAO borrarGenero: " + nombre);
        List<Genero> listageneros = obtenerGenero(nombre);
        Connection con;
        Genero generoactual;
        PreparedStatement stmGenero=null;
        ResultSet rsGenero;
        con=this.getConexion();
        
        try{
           stmGenero = con.prepareStatement("delete from genero where nombre = ?");
           stmGenero.setString(1, nombre);
           stmGenero.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try {
                stmGenero.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar los cursores");
            }
        }
        
    }
    public void anadirNuevoGenero(String nombre, String desc){
        List<Genero> resultado =new ArrayList<>();
        Connection con;
        Genero generoactual;
        PreparedStatement stmGenero=null;
        ResultSet rsGenero;
        con=this.getConexion();
        
        try{
           stmGenero = con.prepareStatement("insert into genero (nombre, descripcion)" + "values(?,?)");
           stmGenero.setString(1, nombre);
           stmGenero.setString(2, desc);
           stmGenero.executeUpdate();
           stmGenero.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try {
                stmGenero.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar los cursores");
            }
        }
    }    
    public void actualizarGenero(String nombre, String desc){
        Connection con;
        PreparedStatement stmGenero = null;

        con = this.getConexion();

        try {
        
            stmGenero = con.prepareStatement("UPDATE genero SET descripcion = ? WHERE nombre = ?");
        stmGenero.setString(1, desc);
        stmGenero.setString(2, nombre);
        stmGenero.executeUpdate();
        stmGenero.close();

        
    } catch (SQLException e) {
        System.out.println("Error actualizando genero: " + e.getMessage());
        this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
    } finally {
        try {
            if (stmGenero != null) stmGenero.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar el statement");
        }
    }
    }
    
}
