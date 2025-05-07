/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacion;

import java.util.List;
import java.time.LocalDate;

/**
 *
 * @author basesdatos
 */
public class FachadaAplicacion {
    gui.FachadaGui fgui;
    baseDatos.FachadaBaseDatos fbd;
    GestionTrabajadores ct;
    GestionGeneros cg;
    GestionPremio cp;
    
    
    
    
 public FachadaAplicacion(){
   fgui=new gui.FachadaGui(this);
   fbd= new baseDatos.FachadaBaseDatos(this);
   ct= new GestionTrabajadores(fgui, fbd);
   cg = new GestionGeneros(fgui, fbd);
   cp = new GestionPremio(fgui, fbd);
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
    
    public List<Premiacion> obtenerPremio(String nombre, String institucion){
        return cp.obtenerPremio(nombre, institucion);
    }
    public void anadirPremio(String nombre, String institucion, LocalDate fecha, int tipoPremio, String nombrealbcan){
        cp.anadirPremio(nombre, institucion, fecha, tipoPremio, nombrealbcan);
    }
    public void borrarPremio(String nombre, String institucion){
        cp.borrarPremio(nombre, institucion);
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