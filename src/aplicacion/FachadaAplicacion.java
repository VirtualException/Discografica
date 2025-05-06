/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacion;

import java.util.List;


/**
 *
 * @author basesdatos
 */
public class FachadaAplicacion {
    gui.FachadaGui fgui;
    baseDatos.FachadaBaseDatos fbd;
    GestionTrabajadores ct;
    GestionGeneros cg;
    
    
    
    
 public FachadaAplicacion(){
   fgui=new gui.FachadaGui(this);
   fbd= new baseDatos.FachadaBaseDatos(this);
   ct= new GestionTrabajadores(fgui, fbd);
   cg = new GestionGeneros(fgui, fbd);
   
 }

 public static void main(String args[]) {
     FachadaAplicacion fa;
     
     fa= new FachadaAplicacion();
     fa.iniciaInterfazUsuario();
 }
 
 public void iniciaInterfazUsuario(){
     fgui.iniciaVista();
 }

 public void muestraExcepcion(String e){
     fgui.muestraExcepcion(e);
 }
 
public Boolean comprobarAutentificacion(String usuario, String password){
  return ct.comprobarAutentificacion(usuario,password);
}
    public List<Trabajador> obtenerTrabajador(String pasaporte, String nombre){
        return ct.obtenerTrabajador(pasaporte, nombre);
    }
    public List<Trabajador> obtenerManagers(){
        return ct.obtenerManagers();
    }
    public void anadirTrabajador(String pasaporte, String nombre, String contacto, String email, String user, String password, String tipo, String afiliacion, String agencia, String nombrear, String grupo, String pasaporteM){
        ct.anadirTrabajador(pasaporte, nombre, contacto, email, user, password, tipo, afiliacion, agencia, nombrear, grupo, pasaporteM);
    }
    public void borrarTrabajador(String pasaporte, String nombre){
        ct.borrarTrabajador(pasaporte, nombre);
    }
    public List<DatosAdicionalesTrabajadores> obtenerotdatos(String pasaporte){
        return ct.obtenerotdatos(pasaporte);
    }
    
    
    
    public List<Genero> obtenerGenero(String nombre, String desc){
        return cg.obtenerGenero(nombre, desc);
    }
    public void anadirGenero(String nombre, String desc){
        cg.anadirGenero(nombre, desc);
    }
    public void borrarGenero(String nombre, String desc){
        cg.borrarGenero(nombre, desc);
    }
}