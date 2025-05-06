/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseDatos;

import aplicacion.Album;
import aplicacion.Genero;
import aplicacion.Trabajador;
import aplicacion.DatosAdicionalesTrabajadores;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.List;

/**
 *
 * @author basesdatos
 */
public class FachadaBaseDatos {
    private aplicacion.FachadaAplicacion fa;
    private java.sql.Connection conexion;
    private DAOTrabajadores daotrabajadores;
    private DAOGeneros daogeneros;

    public FachadaBaseDatos (aplicacion.FachadaAplicacion fa){
        
        Properties configuracion = new Properties();
        this.fa=fa;
        FileInputStream arqConfiguracion;

        try {
            arqConfiguracion = new FileInputStream("baseDatos.properties");
            configuracion.load(arqConfiguracion);
            arqConfiguracion.close();

            Properties usuario = new Properties();
     

            String gestor = configuracion.getProperty("gestor");

            usuario.setProperty("user", configuracion.getProperty("usuario"));
            usuario.setProperty("password", configuracion.getProperty("clave"));
            
            System.out.println("jdbc:"+gestor+"://"+
                    configuracion.getProperty("servidor")+":"+
                    configuracion.getProperty("puerto")+"/"+
                    configuracion.getProperty("baseDatos"));
            
            System.out.println(usuario);
            
            this.conexion=java.sql.DriverManager.getConnection("jdbc:"+gestor+"://"+
                    configuracion.getProperty("servidor")+":"+
                    configuracion.getProperty("puerto")+"/"+
                    configuracion.getProperty("baseDatos"),
                    usuario);
            
            

            daotrabajadores = new DAOTrabajadores(conexion, fa);
            daogeneros = new DAOGeneros(conexion, fa);
            


        } catch (FileNotFoundException f){
            System.out.println(f.getMessage());
            fa.muestraExcepcion(f.getMessage());
        } catch (IOException i){
            System.out.println(i.getMessage());
            fa.muestraExcepcion(i.getMessage());
        } 
        catch (java.sql.SQLException e){
            System.out.println(e.getMessage());
            fa.muestraExcepcion(e.getMessage());
            System.out.println("ERROR");
            System.out.flush();
        }
        
        
        
    }
    

    public Trabajador validarTrabajador(String usuario, String password){
        return daotrabajadores.validarTrabajador(usuario, password);
    }
    public List<Trabajador> obtenerTrabajador(String pasaporte, String nombre){
        return daotrabajadores.obtenerTrabajador(pasaporte, nombre);
    }
    public List<Trabajador> obtenerManagers(){
        return daotrabajadores.obtenerManagers();
    }
    public void anadirTrabajador(String pasaporte, String nombre, String contacto, String email, String user, String password, String tipo, String afiliacion, String agencia, String nombrear, String grupo, String pasaporteM){
        List<Trabajador> trabajadores = daotrabajadores.obtenerTrabajador(pasaporte, nombre);
        if(trabajadores.isEmpty()){
            daotrabajadores.anadirNuevoTrabajador(pasaporte, nombre, contacto, email, user, password, tipo, afiliacion, agencia, nombrear, grupo, pasaporteM);
        }
        else{
            daotrabajadores.actualizarTrabajador(pasaporte, nombre, contacto, email, user, password, tipo, afiliacion, agencia, nombrear, grupo, pasaporteM);
        }
    }
    public void borrarTrabajador(String pasaporte, String nombre){
        daotrabajadores.borrarTrabajador(pasaporte, nombre);
    }
    public List<DatosAdicionalesTrabajadores> obtenerotdatos(String pasaporte){
        return daotrabajadores.obtenerotdatos(pasaporte);
    }
    
    
    
    public List<Genero> obtenerGenero(String nombre, String desc){
        return daogeneros.obtenerGenero(nombre);
    }
    public void borrarGenero(String nombre, String desc){
        daogeneros.borrarGenero(nombre, desc);
    }
    public void anadirGenero(String nombre, String desc){
        List<Genero> generos = daogeneros.obtenerGenero(nombre);
        if(generos.isEmpty()){
            daogeneros.anadirNuevoGenero(nombre, desc);
        }
        else{
            daogeneros.actualizarGenero(nombre, desc);
        }
    }
    
    
}