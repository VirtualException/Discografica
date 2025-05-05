/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

/**
 *
 * @author alumnogreibd
 */
public class Premio {
    private String nombre;
    private String institucion;

   public Premio (String nombre, String institucion){
    this.nombre = nombre;
    this.institucion = institucion;
   }

   public String getNombre(){
       return this.nombre;
   }

   public String getInstitucion(){
       return this.institucion;
   }
}
