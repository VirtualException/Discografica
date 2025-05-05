package gui;

import aplicacion.Album;
import java.util.List;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAlbumes extends JInternalFrame {
    private aplicacion.FachadaAplicacion fa;
    private JTable tablaAlbumes;
    private JTextField albumesArtista;
    private JTextField albumesGrupo;
    private JButton botonBuscarAlbumes;
    private JButton botonBorrarAlbumes;
    private JButton botonEditarAlbumes;
    private JButton botonNuevoAlbum;

    public PanelAlbumes(aplicacion.FachadaAplicacion fa) {
       
        super("Álbumes", false, false, false, false);
         this.fa = fa;
        try {
            this.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        tablaAlbumes = new JTable(new ModeloTablaAlbumes());
        albumesArtista = new JTextField(15);
        albumesGrupo = new JTextField(15);
        botonBuscarAlbumes = new JButton(new ImageIcon(getClass().getResource("/gui/iloveimg-resized(2)/buscar.png")));
        botonBorrarAlbumes = new JButton("Borrar");
        botonEditarAlbumes = new JButton("Editar");
        botonNuevoAlbum = new JButton("Nuevo");
        
        

        Container contenido = getContentPane();
        contenido.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        contenido.add(new JScrollPane(tablaAlbumes), gbc);

        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weighty = 0.0;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.fill = GridBagConstraints.NONE;
        contenido.add(new JLabel("Artista: "), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        contenido.add(albumesArtista, gbc);

        gbc.gridx = 2;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
        contenido.add(botonBuscarAlbumes, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        contenido.add(new JLabel("Grupo: "), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        contenido.add(albumesGrupo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        contenido.add(botonBorrarAlbumes, gbc);

        gbc.gridx = 1;
        contenido.add(botonEditarAlbumes, gbc);

        gbc.gridx = 2;
        gbc.anchor = GridBagConstraints.EAST;
        contenido.add(botonNuevoAlbum, gbc);
    }

    
    
    
}