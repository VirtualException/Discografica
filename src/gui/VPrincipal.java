/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import aplicacion.Trabajador;
import aplicacion.Genero;
/**
 *
 * @author alumnogreibd
 */
public class VPrincipal extends javax.swing.JFrame {

    aplicacion.FachadaAplicacion fa;
    JTable tablaTrabajadores;
    JTextField trabajadoresPasaporte;
    JTextField trabajadoresNombre;
    JButton botonBuscarTrabajadores;
    JButton botonBorrarTrabajadores;
    JButton botonEditarTrabajadores;
    JButton botonNuevoTrabajador;
    
    JTable tablaPremios;
    JTextField premiosNombre;
    JTextField premiosInstitucion;
    JButton botonBuscarPremios;
    JButton botonBorrarPremios;
    JButton botonEditarPremios;
    JButton botonNuevoPremio;
    
    JTable tablaGrupos;
    JTextField gruposNombre;
    JTextField gruposIntegrante;
    JButton botonBuscarGrupos;
    JButton botonBorrarGrupos;
    JButton botonEditarGrupos;
    JButton botonNuevoGrupo;
    
    JTable tablaAlbumes;
    JTextField albumesArtista;
    JTextField albumesGrupo;
    JButton botonBuscarAlbumes;
    JButton botonBorrarAlbumes;
    JButton botonEditarAlbumes;
    JButton botonNuevoAlbum;
    
    JTable tablaCanciones;
    JTextField cancionesNombre;
    JTextField cancionesFecha;
    JButton botonBuscarCanciones;
    JButton botonBorrarCanciones;
    JButton botonEditarCanciones;
    JButton botonNuevaCancion;
    
    JTable tablaGeneros;
    JTextField generosNombre;
    JButton botonBuscarGeneros;
    JButton botonBorrarGeneros;
    JButton botonEditarGeneros;
    JButton botonNuevoGenero;
    /**
     * Creates new form VPrincipal
     */
    public VPrincipal(aplicacion.FachadaAplicacion fa) {
        initComponents();
        this.fa=fa;
        
        this.tablaTrabajadores = new JTable();
        this.tablaTrabajadores.setModel(new ModeloTablaTrabajadores());
        this.trabajadoresPasaporte = new JTextField(15);
        this.trabajadoresNombre = new JTextField(15);
        this.botonBuscarTrabajadores = new JButton();
        this.botonBuscarTrabajadores.setIcon(new ImageIcon(getClass().getResource("/gui/iloveimg-resized(2)/buscar.png")));
        this.botonBorrarTrabajadores = new JButton("Borrar");
        this.botonEditarTrabajadores = new JButton("Editar");
        this.botonNuevoTrabajador = new JButton("Nuevo");
        
        this.tablaPremios = new JTable();
        this.tablaPremios.setModel(new ModeloTablaPremios());
        this.premiosNombre = new JTextField(15);
        this.premiosInstitucion = new JTextField(15);
        this.botonBuscarPremios = new JButton();
        this.botonBuscarPremios.setIcon(new ImageIcon(getClass().getResource("/gui/iloveimg-resized(2)/buscar.png")));
        this.botonBorrarPremios = new JButton("Borrar");
        this.botonEditarPremios = new JButton("Editar");
        this.botonNuevoPremio = new JButton("Nuevo");
        
        this.tablaGrupos = new JTable();
        this.tablaGrupos.setModel(new ModeloTablaGrupos());
        this.gruposNombre = new JTextField(15);
        this.gruposIntegrante = new JTextField(15);
        this.botonBuscarGrupos = new JButton();
        this.botonBuscarGrupos.setIcon(new ImageIcon(getClass().getResource("/gui/iloveimg-resized(2)/buscar.png")));
        this.botonBorrarGrupos = new JButton("Borrar");
        this.botonEditarGrupos = new JButton("Editar");
        this.botonNuevoGrupo = new JButton("Nuevo");
        
        this.tablaAlbumes = new JTable();
        this.tablaAlbumes.setModel(new ModeloTablaAlbumes());
        this.albumesArtista = new JTextField(15);
        this.albumesGrupo= new JTextField(15);
        this.botonBuscarAlbumes = new JButton();
        this.botonBuscarAlbumes.setIcon(new ImageIcon(getClass().getResource("/gui/iloveimg-resized(2)/buscar.png")));
        this.botonBorrarAlbumes = new JButton("Borrar");
        this.botonEditarAlbumes = new JButton("Editar");
        this.botonNuevoAlbum = new JButton("Nuevo");
        
        this.tablaCanciones = new JTable();
        this.tablaCanciones.setModel(new ModeloTablaCanciones());
        this.cancionesNombre = new JTextField(15);
        this.cancionesFecha= new JTextField(15);
        this.botonBuscarCanciones = new JButton();
        this.botonBuscarCanciones.setIcon(new ImageIcon(getClass().getResource("/gui/iloveimg-resized(2)/buscar.png")));
        this.botonBorrarCanciones = new JButton("Borrar");
        this.botonEditarCanciones = new JButton("Editar");
        this.botonNuevaCancion = new JButton("Nuevo");
        
        this.tablaGeneros = new JTable();
        this.tablaGeneros.setModel(new ModeloTablaGeneros());
        this.generosNombre = new JTextField(15);
        this.botonBuscarGeneros = new JButton();
        this.botonBuscarGeneros.setIcon(new ImageIcon(getClass().getResource("/gui/iloveimg-resized(2)/buscar.png")));
        this.botonBorrarGeneros = new JButton("Borrar");
        this.botonEditarGeneros = new JButton("Editar");
        this.botonNuevoGenero = new JButton("Nuevo");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonTrabajadores = new javax.swing.JButton();
        botonPremios = new javax.swing.JButton();
        botonGrupos = new javax.swing.JButton();
        botonAlbumes = new javax.swing.JButton();
        botonCanciones = new javax.swing.JButton();
        botonGeneros = new javax.swing.JButton();
        decor11 = new javax.swing.JPanel();
        decor1 = new javax.swing.JButton();
        decor22 = new javax.swing.JPanel();
        decor2 = new javax.swing.JButton();
        decor33 = new javax.swing.JPanel();
        decor3 = new javax.swing.JButton();
        decor44 = new javax.swing.JPanel();
        decor4 = new javax.swing.JButton();
        decor55 = new javax.swing.JPanel();
        decor5 = new javax.swing.JButton();
        decor66 = new javax.swing.JPanel();
        decor6 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botonTrabajadores.setBackground(new java.awt.Color(197, 197, 197));
        botonTrabajadores.setFont(new java.awt.Font("DejaVu Sans", 2, 24)); // NOI18N
        botonTrabajadores.setText("Trabajadores");
        botonTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTrabajadoresActionPerformed(evt);
            }
        });

        botonPremios.setBackground(new java.awt.Color(197, 197, 197));
        botonPremios.setFont(new java.awt.Font("DejaVu Sans", 2, 24)); // NOI18N
        botonPremios.setText("Premios");
        botonPremios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPremiosActionPerformed(evt);
            }
        });

        botonGrupos.setBackground(new java.awt.Color(197, 197, 197));
        botonGrupos.setFont(new java.awt.Font("DejaVu Sans", 2, 24)); // NOI18N
        botonGrupos.setText("Grupos");
        botonGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGruposActionPerformed(evt);
            }
        });

        botonAlbumes.setBackground(new java.awt.Color(197, 197, 197));
        botonAlbumes.setFont(new java.awt.Font("DejaVu Sans", 2, 24)); // NOI18N
        botonAlbumes.setText("Álbumes");
        botonAlbumes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlbumesActionPerformed(evt);
            }
        });

        botonCanciones.setBackground(new java.awt.Color(197, 197, 197));
        botonCanciones.setFont(new java.awt.Font("DejaVu Sans", 2, 24)); // NOI18N
        botonCanciones.setText("Canciones");
        botonCanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancionesActionPerformed(evt);
            }
        });

        botonGeneros.setBackground(new java.awt.Color(197, 197, 197));
        botonGeneros.setFont(new java.awt.Font("DejaVu Sans", 2, 24)); // NOI18N
        botonGeneros.setText("Géneros");
        botonGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerosActionPerformed(evt);
            }
        });

        decor11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        decor1.setBackground(new java.awt.Color(215, 215, 215));
        decor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iloveimg-resized(2)/trabajador.png"))); // NOI18N

        javax.swing.GroupLayout decor11Layout = new javax.swing.GroupLayout(decor11);
        decor11.setLayout(decor11Layout);
        decor11Layout.setHorizontalGroup(
            decor11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decor11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(decor1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        decor11Layout.setVerticalGroup(
            decor11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decor11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(decor1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        decor22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        decor2.setBackground(new java.awt.Color(215, 215, 215));
        decor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iloveimg-resized(2)/premio.png"))); // NOI18N

        javax.swing.GroupLayout decor22Layout = new javax.swing.GroupLayout(decor22);
        decor22.setLayout(decor22Layout);
        decor22Layout.setHorizontalGroup(
            decor22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decor22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(decor2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        decor22Layout.setVerticalGroup(
            decor22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decor22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(decor2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        decor33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        decor3.setBackground(new java.awt.Color(215, 215, 215));
        decor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iloveimg-resized(2)/grupo.png"))); // NOI18N

        javax.swing.GroupLayout decor33Layout = new javax.swing.GroupLayout(decor33);
        decor33.setLayout(decor33Layout);
        decor33Layout.setHorizontalGroup(
            decor33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decor33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(decor3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        decor33Layout.setVerticalGroup(
            decor33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decor33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(decor3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );

        decor44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        decor4.setBackground(new java.awt.Color(215, 215, 215));
        decor4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iloveimg-resized(2)/album.png"))); // NOI18N

        javax.swing.GroupLayout decor44Layout = new javax.swing.GroupLayout(decor44);
        decor44.setLayout(decor44Layout);
        decor44Layout.setHorizontalGroup(
            decor44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decor44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(decor4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        decor44Layout.setVerticalGroup(
            decor44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decor44Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(decor4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        decor55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        decor5.setBackground(new java.awt.Color(215, 215, 215));
        decor5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iloveimg-resized(2)/cancion.png"))); // NOI18N

        javax.swing.GroupLayout decor55Layout = new javax.swing.GroupLayout(decor55);
        decor55.setLayout(decor55Layout);
        decor55Layout.setHorizontalGroup(
            decor55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decor55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(decor5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        decor55Layout.setVerticalGroup(
            decor55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decor55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(decor5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        decor66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        decor6.setBackground(new java.awt.Color(215, 215, 215));
        decor6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iloveimg-resized(2)/musica.png"))); // NOI18N

        javax.swing.GroupLayout decor66Layout = new javax.swing.GroupLayout(decor66);
        decor66.setLayout(decor66Layout);
        decor66Layout.setHorizontalGroup(
            decor66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decor66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(decor6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        decor66Layout.setVerticalGroup(
            decor66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decor66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(decor6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 914, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(decor44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decor33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decor11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decor22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(decor66, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decor55, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonPremios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonTrabajadores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonGrupos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonGeneros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCanciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAlbumes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDesktopPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(decor11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(botonTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(decor22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(botonPremios, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(botonGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(decor33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(decor44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(botonAlbumes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(decor55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(botonCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(decor66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(botonGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPremiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPremiosActionPerformed
        this.botonTrabajadores.setBackground(new Color(197,197,197));
        this.botonPremios.setBackground(Color.gray);
        this.botonGrupos.setBackground(new Color(197,197,197));
        this.botonAlbumes.setBackground(new Color(197,197,197));
        this.botonCanciones.setBackground(new Color(197,197,197));
        this.botonGeneros.setBackground(new Color(197,197,197));
        
        JInternalFrame[] ventanas = this.jDesktopPane1.getAllFrames();
        if (ventanas != null){
            for (JInternalFrame ventana : ventanas){
                ventana.dispose();
            }
        }
        
        final JInternalFrame ventanaCentral = new JInternalFrame(("Premios"),false,false,false,false);
        try {
            ventanaCentral.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace(); // Al menos imprimir para detectar problemas
        }
        
        Container contenido = ventanaCentral.getContentPane();
        contenido.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        contenido.add(new JScrollPane(this.tablaPremios), gbc);
        
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weighty = 0.0;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.fill = GridBagConstraints.NONE;
        contenido.add(new JLabel("Premio: "), gbc);
        
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        contenido.add(this.premiosNombre, gbc);
        
        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
        contenido.add(this.botonBuscarPremios,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        contenido.add(new JLabel("Institucion: "), gbc);
        
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        contenido.add(this.premiosInstitucion, gbc);
        
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
        contenido.add(this.botonBorrarPremios,gbc);
        
        gbc.gridx = 2;
        contenido.add(this.botonEditarPremios,gbc);
        
        gbc.gridx = 3;
        gbc.anchor = GridBagConstraints.EAST;
        contenido.add(this.botonNuevoPremio,gbc);
        
        this.jDesktopPane1.add(ventanaCentral);
        ventanaCentral.setVisible(true);
    }//GEN-LAST:event_botonPremiosActionPerformed

    private void botonGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGruposActionPerformed
        this.botonTrabajadores.setBackground(new Color(197,197,197));
        this.botonPremios.setBackground(new Color(197,197,197));
        this.botonGrupos.setBackground(Color.gray);
        this.botonAlbumes.setBackground(new Color(197,197,197));
        this.botonCanciones.setBackground(new Color(197,197,197));
        this.botonGeneros.setBackground(new Color(197,197,197));
        
        JInternalFrame[] ventanas = this.jDesktopPane1.getAllFrames();
        if (ventanas != null){
            for (JInternalFrame ventana : ventanas){
                ventana.dispose();
            }
        }
        
        final JInternalFrame ventanaCentral = new JInternalFrame(("Grupos"),false,false,false,false);
        try {
            ventanaCentral.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace(); // Al menos imprimir para detectar problemas
        }
        
        Container contenido = ventanaCentral.getContentPane();
        contenido.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        contenido.add(new JScrollPane(this.tablaGrupos), gbc);
        
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weighty = 0.0;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.fill = GridBagConstraints.NONE;
        contenido.add(new JLabel("Grupo: "), gbc);
        
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        contenido.add(this.gruposNombre, gbc);
        
        gbc.gridx = 2;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
        contenido.add(this.botonBuscarGrupos,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        contenido.add(new JLabel("Integrante: "), gbc);
        
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        contenido.add(this.gruposIntegrante, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
        contenido.add(this.botonBorrarGrupos,gbc);
        
        gbc.gridx = 1;
        contenido.add(this.botonEditarGrupos,gbc);
        
        gbc.gridx = 2;
        gbc.anchor = GridBagConstraints.EAST;
        contenido.add(this.botonNuevoGrupo,gbc);
        
        this.jDesktopPane1.add(ventanaCentral);
        ventanaCentral.setVisible(true);
    }//GEN-LAST:event_botonGruposActionPerformed

    private void botonGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerosActionPerformed
        this.botonTrabajadores.setBackground(new Color(197,197,197));
        this.botonPremios.setBackground(new Color(197,197,197));
        this.botonGrupos.setBackground(new Color(197,197,197));
        this.botonAlbumes.setBackground(new Color(197,197,197));
        this.botonCanciones.setBackground(new Color(197,197,197));
        this.botonGeneros.setBackground(Color.gray);
        
        JInternalFrame[] ventanas = this.jDesktopPane1.getAllFrames();
        if (ventanas != null){
            for (JInternalFrame ventana : ventanas){
                ventana.dispose();
            }
        }
        
        final JInternalFrame ventanaCentral = new JInternalFrame(("Generos"),false,false,false,false);
        try {
            ventanaCentral.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace(); // Al menos imprimir para detectar problemas
        }
        
        Container contenido = ventanaCentral.getContentPane();
        contenido.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        contenido.add(new JScrollPane(this.tablaGeneros), gbc);
        
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weighty = 0.0;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.fill = GridBagConstraints.NONE;
        contenido.add(new JLabel("Genero: "), gbc);
        
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        contenido.add(this.generosNombre, gbc);
        
        gbc.gridx = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
        contenido.add(this.botonBuscarGeneros,gbc);
        this.botonBuscarGeneros.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String nombre = generosNombre.getText();
            System.out.println("buscarGenero");
            buscarGenero(nombre);
        }
        });
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0.0;
        contenido.add(this.botonBorrarGeneros,gbc);
        this.botonBorrarGeneros.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            borrarGenero();
        }
        });
        
        gbc.gridx = 1;
        contenido.add(this.botonEditarGeneros,gbc);
        this.botonEditarGeneros.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            editarGenero();
        }
        });
        
        gbc.gridx = 2;
        gbc.anchor = GridBagConstraints.EAST;
        contenido.add(this.botonNuevoGenero,gbc);
        this.botonNuevoGenero.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            nuevoGenero();
        }
        });
        
        this.jDesktopPane1.add(ventanaCentral);
        ventanaCentral.setVisible(true);
    }//GEN-LAST:event_botonGenerosActionPerformed

    private void botonTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTrabajadoresActionPerformed
        this.botonTrabajadores.setBackground(Color.gray);
        this.botonPremios.setBackground(new Color(197,197,197));
        this.botonGrupos.setBackground(new Color(197,197,197));
        this.botonAlbumes.setBackground(new Color(197,197,197));
        this.botonCanciones.setBackground(new Color(197,197,197));
        this.botonGeneros.setBackground(new Color(197,197,197));
        
        JInternalFrame[] ventanas = this.jDesktopPane1.getAllFrames();
        if (ventanas != null){
            for (JInternalFrame ventana : ventanas){
                ventana.dispose();
            }
        }
        
        final JInternalFrame ventanaCentral = new JInternalFrame(("Trabajadores"),false,false,false,false);
        try {
            ventanaCentral.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace(); // Al menos imprimir para detectar problemas
        }
        
        Container contenido = ventanaCentral.getContentPane();
        contenido.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        contenido.add(new JScrollPane(this.tablaTrabajadores), gbc);
        
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weighty = 0.0;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.fill = GridBagConstraints.NONE;
        contenido.add(new JLabel("Pasaporte: "), gbc);
        
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        contenido.add(this.trabajadoresPasaporte, gbc);
        this.tablaTrabajadores.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) { 
                int filaSeleccionada = tablaTrabajadores.getSelectedRow();
                if (filaSeleccionada != -1) {
            
                   String pasaporte = tablaTrabajadores.getValueAt(filaSeleccionada, 0).toString(); 
                   String nombre = tablaTrabajadores.getValueAt(filaSeleccionada, 2).toString();    
                   trabajadoresPasaporte.setText(pasaporte);
                   trabajadoresNombre.setText(nombre);
                }
            }
        });
        gbc.gridx = 2;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
        contenido.add(this.botonBuscarTrabajadores,gbc);
        this.botonBuscarTrabajadores.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String pasaporte = trabajadoresPasaporte.getText();
            String nombre = trabajadoresNombre.getText();
            buscarTrabajador(pasaporte, nombre);
        }
        });
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        contenido.add(new JLabel("Nombre: "), gbc);
        
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        contenido.add(this.trabajadoresNombre, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
        contenido.add(this.botonBorrarTrabajadores,gbc);
        this.botonBorrarTrabajadores.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            borrarTrabajador();
        }
        });
        gbc.gridx = 1;
        contenido.add(this.botonEditarTrabajadores,gbc);
        this.botonEditarTrabajadores.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            editarTrabajador();
        }
        });
        gbc.gridx = 2;
        gbc.anchor = GridBagConstraints.EAST;
        contenido.add(this.botonNuevoTrabajador,gbc);
        this.botonNuevoTrabajador.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            nuevoTrabajador();
        }
        });
        this.jDesktopPane1.add(ventanaCentral);
        ventanaCentral.setVisible(true);
    }//GEN-LAST:event_botonTrabajadoresActionPerformed

    private void botonAlbumesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlbumesActionPerformed
        this.botonTrabajadores.setBackground(new Color(197,197,197));
        this.botonPremios.setBackground(new Color(197,197,197));
        this.botonGrupos.setBackground(new Color(197,197,197));
        this.botonAlbumes.setBackground(Color.gray);
        this.botonCanciones.setBackground(new Color(197,197,197));
        this.botonGeneros.setBackground(new Color(197,197,197));
        
        JInternalFrame[] ventanas = this.jDesktopPane1.getAllFrames();
        if (ventanas != null){
            for (JInternalFrame ventana : ventanas){
                ventana.dispose();
            }
        }
        
        PanelAlbumes panel = new PanelAlbumes(this.fa);

    this.jDesktopPane1.add(panel);
    panel.setVisible(true);
    }//GEN-LAST:event_botonAlbumesActionPerformed

    private void botonCancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancionesActionPerformed
        this.botonTrabajadores.setBackground(new Color(197,197,197));
        this.botonPremios.setBackground(new Color(197,197,197));
        this.botonGrupos.setBackground(new Color(197,197,197));
        this.botonAlbumes.setBackground(new Color(197,197,197));
        this.botonCanciones.setBackground(Color.gray);
        this.botonGeneros.setBackground(new Color(197,197,197));
        
        JInternalFrame[] ventanas = this.jDesktopPane1.getAllFrames();
        if (ventanas != null){
            for (JInternalFrame ventana : ventanas){
                ventana.dispose();
            }
        }
        
        final JInternalFrame ventanaCentral = new JInternalFrame(("Canciones"),false,false,false,false);
        try {
            ventanaCentral.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace(); // Al menos imprimir para detectar problemas
        }
        
        Container contenido = ventanaCentral.getContentPane();
        contenido.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        contenido.add(new JScrollPane(this.tablaCanciones), gbc);
        
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weighty = 0.0;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.fill = GridBagConstraints.NONE;
        contenido.add(new JLabel("Cancion: "), gbc);
        
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        contenido.add(this.cancionesNombre, gbc);
        
        gbc.gridx = 2;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
        contenido.add(this.botonBuscarCanciones,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        contenido.add(new JLabel("Fecha: "), gbc);
        
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        contenido.add(this.cancionesFecha, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
        contenido.add(this.botonBorrarCanciones,gbc);
        
        gbc.gridx = 1;
        contenido.add(this.botonEditarCanciones,gbc);
        
        gbc.gridx = 2;
        gbc.anchor = GridBagConstraints.EAST;
        contenido.add(this.botonNuevaCancion,gbc);
        
        this.jDesktopPane1.add(ventanaCentral);
        ventanaCentral.setVisible(true);
    }//GEN-LAST:event_botonCancionesActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlbumes;
    private javax.swing.JButton botonCanciones;
    private javax.swing.JButton botonGeneros;
    private javax.swing.JButton botonGrupos;
    private javax.swing.JButton botonPremios;
    private javax.swing.JButton botonTrabajadores;
    private javax.swing.JButton decor1;
    private javax.swing.JPanel decor11;
    private javax.swing.JButton decor2;
    private javax.swing.JPanel decor22;
    private javax.swing.JButton decor3;
    private javax.swing.JPanel decor33;
    private javax.swing.JButton decor4;
    private javax.swing.JPanel decor44;
    private javax.swing.JButton decor5;
    private javax.swing.JPanel decor55;
    private javax.swing.JButton decor6;
    private javax.swing.JPanel decor66;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
private void buscarTrabajador(String pasaporte, String nombre) {
    ModeloTablaTrabajadores m;
        m=(ModeloTablaTrabajadores) tablaTrabajadores.getModel();
        m.setFilas(fa.obtenerTrabajador(pasaporte, nombre));
        if (m.getRowCount() > 0) {
            tablaTrabajadores.setRowSelectionInterval(0, 0);
            trabajadoresPasaporte.setText(m.obtenerTrabajador(tablaTrabajadores.getSelectedRow()).getPasaporte());
            trabajadoresNombre.setText(m.obtenerTrabajador(tablaTrabajadores.getSelectedRow()).getNombre());
            botonBorrarTrabajadores.setEnabled(true);
            botonEditarTrabajadores.setEnabled(true);
            
        }
        else {
            botonBorrarTrabajadores.setEnabled(false);
            botonEditarTrabajadores.setEnabled(false);
        }
}
private void nuevoTrabajador() {
    VGestionTrabajador vt = new VGestionTrabajador(this, true, this.fa);
    vt.setVisible(true);
}
private void borrarTrabajador(){
    String pasaporte = trabajadoresPasaporte.getText();
    String nombre = trabajadoresNombre.getText();
    fa.borrarTrabajador(pasaporte, nombre);
}
private void editarTrabajador(){
    String pasaporte = trabajadoresPasaporte.getText();
    String nombre = trabajadoresNombre.getText();
    List<Trabajador> listatrabajador = fa.obtenerTrabajador(pasaporte, nombre);
    for (Trabajador t: listatrabajador){
        VGestionTrabajador vt = new VGestionTrabajador(this, true, this.fa, t);
        vt.setVisible(true);
    }
}

/* género */
private void buscarGenero(String nombre) {
    ModeloTablaGeneros m;
        m=(ModeloTablaGeneros) tablaGeneros.getModel();
        m.setFilas(fa.obtenerGenero(nombre, ""));
        if (m.getRowCount() > 0) {
            tablaGeneros.setRowSelectionInterval(0, 0);
            generosNombre.setText(m.obtenerGenero(tablaGeneros.getSelectedRow()).getNombre());
            //generosNombre.setText(m.obtenerGenero(tablaGeneros.getSelectedRow()).getDescripcion());
            botonBorrarGeneros.setEnabled(true);
            botonEditarGeneros.setEnabled(true);   
        }
        else {
            botonBorrarGeneros.setEnabled(false);
            botonEditarGeneros.setEnabled(false);
        }
}
private void nuevoGenero() {
    VGestionGenero vt = new VGestionGenero(this, true, this.fa);
    vt.setVisible(true);
}
private void borrarGenero(){
    String nombre = generosNombre.getText();
    System.out.println("VPrincipal borrarGenero: " + nombre);
    fa.borrarGenero(nombre, "");
}
private void editarGenero(){
    String nombre = generosNombre.getText();
    List<Genero> listageneros = fa.obtenerGenero(nombre, "");
    for (Genero t: listageneros){
        VGestionGenero vt = new VGestionGenero(this, true, this.fa, t);
        vt.setVisible(true);
    }
}



}