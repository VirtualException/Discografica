/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacion;
import gui.FachadaGui;
import baseDatos.FachadaBaseDatos;
import java.util.List;
/**
 *
 * @author basesdatos
 */
public class GestionTrabajadores {
     
    FachadaGui fgui;
    FachadaBaseDatos fbd;
    
   
    public GestionTrabajadores(FachadaGui fgui, FachadaBaseDatos fbd){
     this.fgui=fgui;
     this.fbd=fbd;
    }  
    
    
    public Boolean comprobarAutentificacion(String usuario, String password){
      Trabajador t;

      t=fbd.validarTrabajador(usuario,password);
      if (t!=null){
          return t.getTipoTrabajador()==TipoTrabajador.Manager;
      } else return false;
    }
    public List<Trabajador> obtenerTrabajador(String pasaporte, String nombre){
        return fbd.obtenerTrabajador(pasaporte, nombre);
    }
    public List<Trabajador> obtenerManagers(){
        return fbd.obtenerManagers();
    }
    public void anadirTrabajador(String pasaporte, String nombre, String contacto, String email, String user, String password, String tipo, String afiliacion, String agencia, String nombrear, String grupo, String pasaporteM){
        fbd.anadirTrabajador(pasaporte, nombre, contacto, email, user, password, tipo, afiliacion, agencia, nombrear, grupo, pasaporteM);
    }
    public void borrarTrabajador(String pasaporte, String nombre){
        fbd.borrarTrabajador(pasaporte, nombre);
    }
    public List<DatosAdicionalesTrabajadores> obtenerotdatos(String pasaporte){
        return fbd.obtenerotdatos(pasaporte);
    }
}
