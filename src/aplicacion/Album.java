/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumnogreibd
 */
public class Album {
    private int id_album;
    private String nombre;
    private String anho_lanzamiento;
    private String artista_principal; // nombre del grupo o artista que haya participado en el mayor número de canciones del álbum
    private List<Cancion> canciones;

    public Album(int id_album, String nombre, String anho_lanzamiento, String artista_principal) {
        this.id_album = id_album;
        this.nombre = nombre;
        this.anho_lanzamiento = anho_lanzamiento;
        this.artista_principal = artista_principal;
        this.canciones = new ArrayList<>();
    }


   public int getIdAlbum(){
       return this.id_album;
   }
   
   public String getNombre(){
       return this.nombre;
   }

   public String getAnhoLanzamiento(){
       return this.anho_lanzamiento;
   }
   
   public String getArtistaPrincipal(){
       return this.artista_principal;
   }
}
