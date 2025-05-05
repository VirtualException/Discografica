/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import aplicacion.Cancion;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaCanciones extends AbstractTableModel{
    
    private java.util.List<Cancion> canciones;

    public ModeloTablaCanciones(){
        this.canciones = new java.util.ArrayList<Cancion>();
    }

    public int getColumnCount (){
        return 3;
    }

    public int getRowCount(){
        return canciones .size();
    }

    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Cancion"; break;
            case 1: nombre= "ISWC"; break;
            case 2: nombre= "Fecha"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= java.lang.String.class; break;
            case 2: clase= java.time.LocalDate.class; break;
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col){
        return false;
    }

    public Object getValueAt(int row, int col){
        Object resultado=null;

        switch (col){
            case 0: resultado= canciones.get(row).getTitulo(); break;
            case 1: resultado= canciones.get(row).getIswc(); break;
            case 2: resultado= canciones.get(row).getFechaLanzamiento();break;
        }
        return resultado;
    }

    public void setFilas(java.util.List<Cancion> canciones){
        this.canciones=canciones;
        fireTableDataChanged();
    }

    public Cancion obtenerCancion(int i){
        return this.canciones.get(i);
    }

    
}
