package com.mycompany.monopoly_mundo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        balanceJ1 = new javax.swing.JLabel();
        casillaJ1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPropiedadesJ1 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        balanceJ2 = new javax.swing.JLabel();
        casillaJ2 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPropiedadesJ2 = new javax.swing.JList<>();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        labelJ1 = new javax.swing.JLabel();
        labelJ2 = new javax.swing.JLabel();
        botonTurno = new javax.swing.JButton();
        labelDado1 = new javax.swing.JLabel();
        labelDado2 = new javax.swing.JLabel();
        turnoJugadorCentro = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dado2Texto = new javax.swing.JLabel();
        dado1Texto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monopoly - Ciudades del Mundo");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 160));

        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Titulo.png"))); // NOI18N
        Titulo.setText("jLabel1");
        Titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Titulo.setMaximumSize(new java.awt.Dimension(840, 160));
        Titulo.setMinimumSize(new java.awt.Dimension(840, 160));
        Titulo.setPreferredSize(new java.awt.Dimension(840, 160));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setMaximumSize(new java.awt.Dimension(180, 440));
        jPanel2.setMinimumSize(new java.awt.Dimension(180, 440));
        jPanel2.setPreferredSize(new java.awt.Dimension(180, 440));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(0, 0, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.setMaximumSize(new java.awt.Dimension(180, 60));

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("JUGADOR 1");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(203, 231, 203));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.setPreferredSize(new java.awt.Dimension(180, 385));
        jPanel8.setRequestFocusEnabled(false);

        balanceJ1.setForeground(new java.awt.Color(0, 0, 0));
        balanceJ1.setText("Balance: 100M €                          ");
        jPanel8.add(balanceJ1);

        casillaJ1.setForeground(new java.awt.Color(0, 0, 0));
        casillaJ1.setText(" Casilla: Salida - 0                         ");
        jPanel8.add(casillaJ1);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText(" Propiedades:                                ");
        jPanel8.add(jLabel1);

        jScrollPane1.setBorder(null);

        listaPropiedadesJ1.setBackground(new java.awt.Color(203, 231, 203));
        listaPropiedadesJ1.setBorder(null);
        listaPropiedadesJ1.setForeground(new java.awt.Color(0, 0, 0));
        listaPropiedadesJ1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "No tienes propiedades todavía" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaPropiedadesJ1);

        jPanel8.add(jScrollPane1);

        jPanel2.add(jPanel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setMaximumSize(new java.awt.Dimension(180, 440));
        jPanel3.setMinimumSize(new java.awt.Dimension(180, 440));
        jPanel3.setPreferredSize(new java.awt.Dimension(180, 440));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(0, 153, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.setMaximumSize(new java.awt.Dimension(180, 60));
        jPanel5.setMinimumSize(new java.awt.Dimension(180, 60));
        jPanel5.setPreferredSize(new java.awt.Dimension(180, 60));

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JUGADOR 2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(203, 231, 203));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        balanceJ2.setBackground(new java.awt.Color(0, 0, 0));
        balanceJ2.setForeground(new java.awt.Color(0, 0, 0));
        balanceJ2.setText("Balance: 100M €                          ");
        jPanel6.add(balanceJ2);

        casillaJ2.setForeground(new java.awt.Color(0, 0, 0));
        casillaJ2.setText(" Casilla: Salida - 0                         ");
        jPanel6.add(casillaJ2);

        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setText(" Propiedades:                                ");
        jPanel6.add(jLabel67);

        jScrollPane2.setBorder(null);

        listaPropiedadesJ2.setBackground(new java.awt.Color(203, 231, 203));
        listaPropiedadesJ2.setBorder(null);
        listaPropiedadesJ2.setForeground(new java.awt.Color(0, 0, 0));
        listaPropiedadesJ2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "No tienes propiedades todavía" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaPropiedadesJ2);

        jPanel6.add(jScrollPane2);

        jPanel3.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_END);

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(440, 440));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(440, 440));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero.png"))); // NOI18N
        jLayeredPane1.add(jLabel4);
        jLabel4.setBounds(0, 0, 440, 440);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ferrocarriles");
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel6);
        jLabel6.setBounds(391, 228, 40, 10);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Pretoria");
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel8);
        jLabel8.setBounds(6, 240, 40, 11);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Taipei");
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel9);
        jLabel9.setBounds(137, 0, 30, 13);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Atenas");
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel10);
        jLabel10.setBounds(350, 0, 35, 13);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Belgrado");
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel11);
        jLabel11.setBounds(5, 307, 50, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Barcelona");
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel12);
        jLabel12.setBounds(311, 0, 40, 11);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Tokio");
        jLayeredPane1.setLayer(jLabel14, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel14);
        jLabel14.setBounds(245, 0, 30, 13);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Montreal");
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel13);
        jLabel13.setBounds(8, 60, 40, 11);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("New York");
        jLayeredPane1.setLayer(jLabel15, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel15);
        jLabel15.setBounds(275, 428, 40, 11);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Toronto");
        jLayeredPane1.setLayer(jLabel16, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel16);
        jLabel16.setBounds(400, 167, 40, 11);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Riga");
        jLayeredPane1.setLayer(jLabel17, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel17);
        jLabel17.setBounds(13, 131, 20, 13);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Shanghái");
        jLayeredPane1.setLayer(jLabel18, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel18);
        jLabel18.setBounds(399, 310, 40, 11);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Pekín");
        jLayeredPane1.setLayer(jLabel19, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel19);
        jLabel19.setBounds(175, 428, 40, 11);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Impuesto");
        jLayeredPane1.setLayer(jLabel20, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel20);
        jLabel20.setBounds(5, 95, 40, 10);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Cruceros");
        jLayeredPane1.setLayer(jLabel21, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel21);
        jLabel21.setBounds(207, 0, 40, 10);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Satélites");
        jLayeredPane1.setLayer(jLabel22, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel22);
        jLabel22.setBounds(207, 429, 40, 10);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Aerolíneas");
        jLayeredPane1.setLayer(jLabel23, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel23);
        jLabel23.setBounds(10, 201, 40, 10);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Sídney");
        jLayeredPane1.setLayer(jLabel24, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel24);
        jLabel24.setBounds(352, 428, 40, 11);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Impuesto");
        jLayeredPane1.setLayer(jLabel25, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel25);
        jLabel25.setBounds(170, 0, 40, 10);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Energía");
        jLayeredPane1.setLayer(jLabel26, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel26);
        jLabel26.setBounds(100, 428, 40, 11);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Londres");
        jLayeredPane1.setLayer(jLabel27, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel27);
        jLabel27.setBounds(242, 428, 40, 11);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 7)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Hong Kong");
        jLayeredPane1.setLayer(jLabel28, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel28);
        jLabel28.setBounds(132, 429, 40, 10);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Roma");
        jLayeredPane1.setLayer(jLabel29, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel29);
        jLabel29.setBounds(403, 238, 30, 14);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("París");
        jLayeredPane1.setLayer(jLabel30, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel30);
        jLabel30.setBounds(13, 346, 30, 14);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Vancouver");
        jLayeredPane1.setLayer(jLabel31, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel31);
        jLabel31.setBounds(397, 346, 40, 11);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Kyiv");
        jLayeredPane1.setLayer(jLabel32, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel32);
        jLabel32.setBounds(405, 131, 20, 13);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Electricidad");
        jLayeredPane1.setLayer(jLabel33, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel33);
        jLabel33.setBounds(398, 94, 42, 11);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Gdynia");
        jLayeredPane1.setLayer(jLabel34, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel34);
        jLabel34.setBounds(62, 0, 37, 13);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("40M €");
        jLayeredPane1.setLayer(jLabel35, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel35);
        jLabel35.setBounds(10, 83, 30, 10);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("6M €");
        jLayeredPane1.setLayer(jLabel37, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel37);
        jLabel37.setBounds(67, 35, 20, 10);

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("12M €");
        jLayeredPane1.setLayer(jLabel38, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel38);
        jLabel38.setBounds(351, 35, 30, 10);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("6M €");
        jLayeredPane1.setLayer(jLabel39, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel39);
        jLabel39.setBounds(140, 35, 20, 10);

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("10M €");
        jLayeredPane1.setLayer(jLabel40, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel40);
        jLabel40.setBounds(243, 35, 30, 10);

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("10M €");
        jLayeredPane1.setLayer(jLabel41, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel41);
        jLabel41.setBounds(314, 35, 25, 10);

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("15M €");
        jLayeredPane1.setLayer(jLabel42, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel42);
        jLabel42.setBounds(102, 383, 30, 10);

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("20M €");
        jLayeredPane1.setLayer(jLabel36, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel36);
        jLabel36.setBounds(210, 382, 30, 10);

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("20M €");
        jLayeredPane1.setLayer(jLabel43, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel43);
        jLabel43.setBounds(210, 48, 30, 10);

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("20M €");
        jLayeredPane1.setLayer(jLabel44, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel44);
        jLabel44.setBounds(40, 215, 30, 10);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("50M €");
        jLayeredPane1.setLayer(jLabel45, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel45);
        jLabel45.setBounds(174, 48, 30, 10);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("50M €");
        jLayeredPane1.setLayer(jLabel46, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel46);
        jLabel46.setBounds(10, 118, 30, 10);

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("14M €");
        jLayeredPane1.setLayer(jLabel47, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel47);
        jLabel47.setBounds(403, 83, 30, 10);

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("18M €");
        jLayeredPane1.setLayer(jLabel48, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel48);
        jLabel48.setBounds(403, 334, 30, 10);

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("15M €");
        jLayeredPane1.setLayer(jLabel49, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel49);
        jLabel49.setBounds(403, 119, 30, 10);

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("14M €");
        jLayeredPane1.setLayer(jLabel50, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel50);
        jLabel50.setBounds(403, 155, 30, 10);

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("16M €");
        jLayeredPane1.setLayer(jLabel51, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel51);
        jLabel51.setBounds(403, 190, 30, 10);

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("18M €");
        jLayeredPane1.setLayer(jLabel52, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel52);
        jLabel52.setBounds(403, 262, 30, 10);

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("20M €");
        jLayeredPane1.setLayer(jLabel53, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel53);
        jLabel53.setBounds(363, 215, 30, 10);

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("20M €");
        jLayeredPane1.setLayer(jLabel54, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel54);
        jLabel54.setBounds(403, 370, 30, 10);

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("22M €");
        jLayeredPane1.setLayer(jLabel55, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel55);
        jLabel55.setBounds(352, 395, 30, 10);

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("22M €");
        jLayeredPane1.setLayer(jLabel56, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel56);
        jLabel56.setBounds(280, 395, 30, 10);

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("24M €");
        jLayeredPane1.setLayer(jLabel57, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel57);
        jLabel57.setBounds(245, 395, 30, 10);

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("26M €");
        jLayeredPane1.setLayer(jLabel58, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel58);
        jLabel58.setBounds(173, 395, 30, 10);

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("26M €");
        jLayeredPane1.setLayer(jLabel59, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel59);
        jLabel59.setBounds(138, 395, 30, 10);

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("28M €");
        jLayeredPane1.setLayer(jLabel60, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel60);
        jLabel60.setBounds(65, 395, 30, 10);

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setText("30M €");
        jLayeredPane1.setLayer(jLabel61, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel61);
        jLabel61.setBounds(10, 370, 30, 10);

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setText("30M €");
        jLayeredPane1.setLayer(jLabel62, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel62);
        jLabel62.setBounds(10, 335, 30, 10);

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("32M €");
        jLayeredPane1.setLayer(jLabel63, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel63);
        jLabel63.setBounds(10, 263, 30, 10);

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("35M €");
        jLayeredPane1.setLayer(jLabel64, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel64);
        jLabel64.setBounds(10, 155, 30, 10);

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("Estambul");
        jLayeredPane1.setLayer(jLabel65, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel65);
        jLabel65.setBounds(400, 60, 40, 11);

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setText("Jerusalén");
        jLayeredPane1.setLayer(jLabel66, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jLabel66);
        jLabel66.setBounds(60, 428, 40, 11);

        labelJ1.setForeground(new java.awt.Color(0, 0, 204));
        labelJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/J1.png"))); // NOI18N
        labelJ1.setFocusable(false);
        jLayeredPane1.setLayer(labelJ1, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.add(labelJ1);
        labelJ1.setBounds(40, 5, 20, 20);

        labelJ2.setForeground(new java.awt.Color(0, 153, 0));
        labelJ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/J2.png"))); // NOI18N
        jLayeredPane1.setLayer(labelJ2, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.add(labelJ2);
        labelJ2.setBounds(40, 20, 30, 20);

        botonTurno.setBackground(new java.awt.Color(242, 210, 183));
        botonTurno.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        botonTurno.setForeground(new java.awt.Color(102, 51, 0));
        botonTurno.setText("Tirar dados");
        botonTurno.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 51, 0), null));
        botonTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTurnoActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(botonTurno, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.add(botonTurno);
        botonTurno.setBounds(210, 70, 100, 23);

        labelDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dado3.png"))); // NOI18N
        jLayeredPane1.setLayer(labelDado1, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.add(labelDado1);
        labelDado1.setBounds(225, 100, 30, 30);

        labelDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dado3.png"))); // NOI18N
        labelDado2.setText("AAA");
        jLayeredPane1.setLayer(labelDado2, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.add(labelDado2);
        labelDado2.setBounds(265, 100, 30, 30);

        turnoJugadorCentro.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        turnoJugadorCentro.setForeground(new java.awt.Color(0, 0, 255));
        turnoJugadorCentro.setText("Jugador 1");
        jLayeredPane1.setLayer(turnoJugadorCentro, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.add(turnoJugadorCentro);
        turnoJugadorCentro.setBounds(100, 340, 120, 30);

        jLabel5.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Es el turno de");
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.add(jLabel5);
        jLabel5.setBounds(80, 320, 160, 20);

        jLabel7.setBackground(new java.awt.Color(255, 204, 153));
        jLabel7.setForeground(new java.awt.Color(255, 204, 102));
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0), 4));
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.add(jLabel7);
        jLabel7.setBounds(70, 310, 169, 65);

        dado2Texto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dado2Texto.setForeground(new java.awt.Color(0, 0, 0));
        dado2Texto.setText("3");
        jLayeredPane1.setLayer(dado2Texto, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.add(dado2Texto);
        dado2Texto.setBounds(300, 106, 10, 25);
        dado2Texto.getAccessibleContext().setAccessibleDescription("");

        dado1Texto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dado1Texto.setForeground(new java.awt.Color(0, 0, 0));
        dado1Texto.setText("3");
        jLayeredPane1.setLayer(dado1Texto, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.add(dado1Texto);
        dado1Texto.setBounds(210, 106, 10, 25);

        getContentPane().add(jLayeredPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTurnoActionPerformed
        
        try {
            // Variables: turnos, continuar la partida y dados
            double turnos = partida.getTurnos();
            boolean continuar = true;
            ImageIcon iconoTrofeo = new ImageIcon(getClass().getResource("/IconoTrofeo.png"));
            int dado1 = (int) (Math.random() * 6 + 1);
            int dado2 = (int) (Math.random() * 6 + 1);
            int valorDados = dado1 + dado2;
            String rutaArchivo = "resultados.txt";
            File archivo = new File(rutaArchivo);
            boolean archivoExiste = archivo.exists();
            
            // Cambiar el aspecto de los dados
            // Dado1
            String dado1Archivo = "Dado" + dado1 + ".png";
            ImageIcon iconoDado1 = new ImageIcon(getClass().getResource("/" + dado1Archivo));
            labelDado1.setIcon(iconoDado1);
            dado1Texto.setText(dado1 + "");
            
            // Dado2
            String dado2Archivo = "Dado" + dado2 + ".png";
            ImageIcon iconoDado2 = new ImageIcon(getClass().getResource("/" + dado2Archivo));
            labelDado2.setIcon(iconoDado2);
            dado2Texto.setText(dado2 + "");

            if (turnos % 2 == 0) {
                // Aquí debería de reposicionarse labelJ1
                // Ejecutar el turno
                continuar = partida.turno(partida.getJugador(0), valorDados);
                // Si el turno ha devuelto false, significa que algún jugador no ha podido pagar y se ha declarado la bancarrota
                // Por lo tanto, se muestra el mensaje de victoria:
                if (continuar == false) {
                    JOptionPane.showMessageDialog(null, "¡El jugador 2 es el ganador!", "Fin de la partida", JOptionPane.OK_OPTION, iconoTrofeo);
                    
                    // Escribir el texto sobre el ganador en un documento de texto.
                    String textoEscribir = "Ganador: Jugador 2 | Balance final del ganador: " + partida.jugadores[1].getDinero() + "M €.";
                    FileWriter fw = new FileWriter(archivo, archivoExiste);
                    BufferedWriter bw = new BufferedWriter(fw);
                    fw.write(textoEscribir);
                    bw.close();
                    System.exit(0);
                }
                // Cambiar el texto que muestra de quién es el turno
                turnoJugadorCentro.setText("Jugador 2");
                turnoJugadorCentro.setForeground(new java.awt.Color(0, 153, 51));
            } else {
                // Aquí debería de reposicionarse labelJ2
                // Ejecutar el turno
                continuar = partida.turno(partida.getJugador(1), valorDados);
                // Si el turno ha devuelto false, significa que algún jugador no ha podido pagar y se ha declarado la bancarrota
                // Por lo tanto, se muestra el mensaje de victoria:
                if (continuar == false) {
                    JOptionPane.showMessageDialog(null, "¡El jugador 1 es el ganador!", "Fin de la partida", JOptionPane.OK_OPTION, iconoTrofeo);
                    
                    // Escribir el texto sobre el ganador en un documento de texto.
                    String textoEscribir = "Ganador: Jugador 1 | Balance final del ganador: " + partida.jugadores[0].getDinero() + "M €.";
                    FileWriter fw = new FileWriter(archivo, archivoExiste);
                    BufferedWriter bw = new BufferedWriter(fw);
                    fw.write(textoEscribir);
                    bw.close();
                    System.exit(0);
                }
                // Cambiar el texto que muestra de quién es el turno
                turnoJugadorCentro.setText("Jugador 1");
                turnoJugadorCentro.setForeground(new java.awt.Color(0, 0, 255));
            }
            
            // Actualizar propiedades de los jugadores comprobando si cada uno tiene alguna
            
            // Lista del jugador 1
            if (partida.jugadores[0].propiedades.size() > 0) {
                DefaultListModel listModel1 = new DefaultListModel();
                
                for (int i = 0; i < partida.jugadores[0].propiedades.size(); i++) {
                    listModel1.addElement(partida.jugadores[0].propiedades.get(i).getNombre());
                }
                listaPropiedadesJ1.setModel(listModel1);
            }
            
            // Lista del jugador 2
            if (partida.jugadores[1].propiedades.size() > 0) {
                DefaultListModel listModel2 = new DefaultListModel();
                
                for (int i = 0; i < partida.jugadores[1].propiedades.size(); i++) {
                    listModel2.addElement(partida.jugadores[1].propiedades.get(i).getNombre());
                }
                listaPropiedadesJ2.setModel(listModel2);
            }
            

            // Actualizar el dinero que se muestra a final de turno y la casilla en la que se encuantra cada jugador
            balanceJ1.setText("Balance: " + partida.jugadores[0].getDinero() + "M €");
            casillaJ1.setText("Casilla actual: " + partida.jugadores[0].getPosicion() + " (" + partida.getCasilla(partida.jugadores[0].getPosicion()).getNombre() + ")");
            balanceJ2.setText("Balance: " + partida.jugadores[1].getDinero() + "M €");
            casillaJ2.setText("Casilla actual: " + partida.jugadores[1].getPosicion()+ " (" + partida.getCasilla(partida.jugadores[1].getPosicion()).getNombre() + ")");
        
        } catch (Exception e) {
            // Cubrir una excepción en caso de que ocurra
            e.printStackTrace();
        }
    }//GEN-LAST:event_botonTurnoActionPerformed

    public static void main(String args[]) {
        /* Look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });

    }

    Partida partida = new Partida();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel balanceJ1;
    private javax.swing.JLabel balanceJ2;
    private javax.swing.JButton botonTurno;
    private javax.swing.JLabel casillaJ1;
    private javax.swing.JLabel casillaJ2;
    private javax.swing.JLabel dado1Texto;
    private javax.swing.JLabel dado2Texto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDado1;
    private javax.swing.JLabel labelDado2;
    private javax.swing.JLabel labelJ1;
    private javax.swing.JLabel labelJ2;
    private javax.swing.JList<String> listaPropiedadesJ1;
    private javax.swing.JList<String> listaPropiedadesJ2;
    private javax.swing.JLabel turnoJugadorCentro;
    // End of variables declaration//GEN-END:variables
}
