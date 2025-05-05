package aplicacion;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author basesdatos
 */
public class DatosAdicionalesTrabajadores {
    private Integer ip;
    private String nombreartista;
    private String grupo;
    private String manager;
    private String agencia;
    private String afiliacion;

   public DatosAdicionalesTrabajadores (Integer ip, String nombreartista, String grupo, String manager, String agencia, String afiliacion){
    this.ip= ip;
    this.nombreartista=nombreartista;
    this.grupo=grupo;
    this.manager=manager;
    this.agencia=agencia;
    this.afiliacion=afiliacion;
   }

   public Integer getIP(){

       return this.ip;
   }

   public String getNombreArt(){

       return this.nombreartista;
   }

   public String getGrupo(){

       return this.grupo;
   }

   public String getAgencia(){

       return this.agencia;
   }
   public String getAfiliacion(){

       return this.afiliacion;
   }
   public String getManager(){

       return this.manager;
   }

}
