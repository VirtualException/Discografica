package aplicacion;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author basesdatos
 */
public class Trabajador {
    private String pasaporte;
    private String nombre;
    private String telefonocontacto;
    private String email;
    private String user;
    private String password;
    private TipoTrabajador tipo;

   public Trabajador (String pasaporte, String nombre, String telefonocontacto, String email, String user, String password, String tipo){
    this.pasaporte=pasaporte;
    this.nombre=nombre;
    this.telefonocontacto=telefonocontacto;
    this.email=email;
    this.user=user;
    this.password=password;
    this.tipo=TipoTrabajador.valueOf(tipo);
   }

   public String getPasaporte(){

       return this.pasaporte;
   }

   public String getNombre(){

       return this.nombre;
   }

   public String getTelefono(){

       return this.telefonocontacto;
   }

   public String getEmail(){

       return this.email;
   }
   public String getUser(){

       return this.user;
   }
   public String getPassword(){

       return this.password;
   }
   public TipoTrabajador getTipoTrabajador(){
       return this.tipo;
   }

}
