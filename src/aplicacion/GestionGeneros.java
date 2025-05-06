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
public class GestionGeneros {
     
    FachadaGui fgui;
    FachadaBaseDatos fbd;
    
   
    public GestionGeneros(FachadaGui fgui, FachadaBaseDatos fbd){
     this.fgui=fgui;
     this.fbd=fbd;
    }  
    
    
    public List<Genero> obtenerGenero(String nombre, String desc){
        return fbd.obtenerGenero(nombre, desc);
    }
    public void anadirGenero(String nombre, String desc){
        fbd.anadirGenero(nombre, desc);
    }
    public void borrarGenero(String nombre, String desc) {
        fbd.borrarGenero(nombre, desc);
    }

}
