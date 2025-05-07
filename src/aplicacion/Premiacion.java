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
public class Premiacion {
    Premio premio;
    String cancion; //estara a null si se ha premiado a un album
    String album;     //estara a null si se ha premiado a una cancion
    LocalDate fecha_premiacion;
    
    public Premiacion(Premio premio, String cancion, String album, LocalDate fecha_premiacion) {
        this.premio = premio;
        this.cancion = cancion;
        this.album = album;
        this.fecha_premiacion = fecha_premiacion;
    }

    public Premio getPremio() {
        return premio;
    }

    public String getCancion() {
        return cancion;
    }

    public String getAlbum() {
        return album;
    }

    public LocalDate getFechaPremiacion() {
        return fecha_premiacion;
    }
}
