/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import aplicacion.Genero;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaGeneros extends AbstractTableModel{
    private java.util.List<Genero> generos;

    public ModeloTablaGeneros(){
        this.generos = new java.util.ArrayList<Genero>();
    }

    public int getColumnCount (){
        return 2;
    }

    public int getRowCount(){
        return generos.size();
    }

    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Genero"; break;
            case 1: nombre= "Descripcion"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= java.lang.String.class; break;
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
            case 0: resultado= generos.get(row).getNombre(); break;
            case 1: resultado= generos.get(row).getDescripcion(); break;
        }
        return resultado;
    }

    public void setFilas(java.util.List<Genero> generos){
        this.generos=generos;
        fireTableDataChanged();
    }

    public Genero obtenerGenero(int i){
        return this.generos.get(i);
    }
}
