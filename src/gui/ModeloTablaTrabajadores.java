/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import aplicacion.TipoTrabajador;
import aplicacion.Trabajador;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaTrabajadores extends AbstractTableModel{
    
    private java.util.List<Trabajador> trabajadores;

    public ModeloTablaTrabajadores(){
        this.trabajadores = new java.util.ArrayList<Trabajador>();
    }

    public int getColumnCount (){
        return 3;
    }

    public int getRowCount(){
        return trabajadores.size();
    }

    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Pasaporte"; break;
            case 1: nombre= "Tipo"; break;
            case 2: nombre="Nombre"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= TipoTrabajador.class; break;
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
            case 0: resultado= trabajadores.get(row).getPasaporte(); break;
            case 1: resultado= trabajadores.get(row).getTipoTrabajador(); break;
            case 2: resultado= trabajadores.get(row).getNombre();break;
        }
        return resultado;
    }

    public void setFilas(java.util.List<Trabajador> trabajadores){
        this.trabajadores=trabajadores;
        fireTableDataChanged();
    }

    public Trabajador obtenerTrabajador(int i){
        return this.trabajadores.get(i);
    }

}
