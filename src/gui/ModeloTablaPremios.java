/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import aplicacion.Premiacion;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaPremios extends AbstractTableModel{
    
    private java.util.List<Premiacion> premiaciones;

    public ModeloTablaPremios(){
        this.premiaciones = new java.util.ArrayList<Premiacion>();
    }

    public int getColumnCount (){
        return 4;
    }

    public int getRowCount(){
        return premiaciones.size();
    }

    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Premio"; break;
            case 1: nombre= "Institucion"; break;
            case 2: nombre= "Cancion/Album"; break;
            case 3: nombre= "Fecha"; break;
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
            case 3: clase= java.time.LocalDate.class; break;
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
            case 0: 
                resultado= premiaciones.get(row).getPremio().getNombre(); 
                break;
            case 1: 
                resultado= premiaciones.get(row).getPremio().getInstitucion(); 
                break;
            case 2: 
                if(premiaciones.get(row).getCancion()!=null){
                    resultado= premiaciones.get(row).getCancion().getTitulo();
                }
                else if(premiaciones.get(row).getAlbum()!=null){
                    resultado= premiaciones.get(row).getAlbum().getNombre();
                }
                break;
            case 3: resultado= premiaciones.get(row).getFechaPremiacion();
        }
        return resultado;
    }

    public void setFilas(java.util.List<Premiacion> premiaciones){
        this.premiaciones=premiaciones;
        fireTableDataChanged();
    }

    public Premiacion obtenerPremiacion(int i){
        return this.premiaciones.get(i);
    }
}
