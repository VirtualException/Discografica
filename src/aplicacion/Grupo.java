/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

/**
 *
 * @author alumnogreibd
 */
public class Grupo {
    String nombre_grupo;
    Trabajador manager;
    String anho_creacion;
    String anho_disolucion;
    
    public Grupo(String nombre_grupo, Trabajador manager, String anho_creacion, String anho_disolucion) {
        this.nombre_grupo = nombre_grupo;
        this.manager = manager;
        this.anho_creacion = anho_creacion;
        this.anho_disolucion = anho_disolucion;
    }

    public String getNombreGrupo() {
        return nombre_grupo;
    }

    public Trabajador getManager() {
        return manager;
    }

    public String getAnhoCreacion() {
        return anho_creacion;
    }

    public String getAnhoDisolucion() {
        return anho_disolucion;
    }
}

