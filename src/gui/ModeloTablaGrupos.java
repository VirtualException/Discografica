/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import aplicacion.Grupo;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaGrupos extends AbstractTableModel{
    
    private java.util.List<Grupo> grupos;

    public ModeloTablaGrupos(){
        this.grupos = new java.util.ArrayList<Grupo>();
    }

    public int getColumnCount (){
        return 3;
    }

    public int getRowCount(){
        return grupos.size();
    }

    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Grupo"; break;
            case 1: nombre= "Creacion"; break;
            case 2: nombre= "Disolucion"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= java.lang.String.class; break;
            case 2: clase= java.lang.String.class; break;
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
            case 0: resultado= grupos.get(row).getNombreGrupo(); break;
            case 1: resultado= grupos.get(row).getAnhoCreacion(); break;
            case 2: resultado= grupos.get(row).getAnhoDisolucion();break;
        }
        return resultado;
    }

    public void setFilas(java.util.List<Grupo> grupos){
        this.grupos=grupos;
        fireTableDataChanged();
    }

    public Grupo obtenerGrupo(int i){
        return this.grupos.get(i);
    }
    
}
