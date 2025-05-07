/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacion;
import gui.FachadaGui;
import baseDatos.FachadaBaseDatos;
import java.util.List;
import java.time.LocalDate;
/**
 *
 * @author basesdatos
 */
public class GestionPremio {
     
    FachadaGui fgui;
    FachadaBaseDatos fbd;
    
   
    public GestionPremio(FachadaGui fgui, FachadaBaseDatos fbd){
     this.fgui=fgui;
     this.fbd=fbd;
    }  
    
        
    public List<Premiacion> obtenerPremio(String nombre, String institucion){
        return fbd.obtenerPremio(nombre, institucion);
    }
    public void anadirPremio(String nombre, String institucion, LocalDate fecha, int tipoPremio, String nombrealbcan){
        fbd.anadirPremio(nombre, institucion, fecha, tipoPremio, nombrealbcan);
    }
    public void borrarPremio(String nombre, String institucion){
        fbd.borrarPremio(nombre, institucion);
    }
}
