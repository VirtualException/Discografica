/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import aplicacion.Album;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaAlbumes extends AbstractTableModel{
    private java.util.List<Album> albumes;

    public ModeloTablaAlbumes(){
        this.albumes = new java.util.ArrayList<Album>();
    }

    public int getColumnCount (){
        return 3;
    }

    public int getRowCount(){
        return albumes.size();
    }

    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Album"; break;
            case 1: nombre= "Anho"; break;
            case 2: nombre= "Autor principal"; break;
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
            case 0: resultado= albumes.get(row).getNombre(); break;
            case 1: resultado= albumes.get(row).getAnhoLanzamiento(); break;
            case 2: resultado= albumes.get(row).getArtistaPrincipal();break;
        }
        return resultado;
    }

    public void setFilas(java.util.List<Album> albumes){
        this.albumes=albumes;
        fireTableDataChanged();
    }

    public Album obtenerAlbum(int i){
        return this.albumes.get(i);
    }
}
