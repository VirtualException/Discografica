/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;
import java.time.LocalDate;
/**
 *
 * @author alumnogreibd
 */
public class Cancion {
    String iswc;
    Album album;
    String titulo;
    LocalDate fecha_lanzamiento;
    
    public Cancion(String iswc, Album album, String titulo, LocalDate fecha_lanzamiento) {
        this.iswc = iswc;
        this.album = album;
        this.titulo = titulo;
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public String getIswc() {
        return iswc;
    }

    public Album getAlbum() {
        return album;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getFechaLanzamiento() {
        return fecha_lanzamiento;
    }
}
