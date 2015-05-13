package Interfaces;

import Agentes.AgPlaneador;
import static Comportamientos.CExtraer.emocion3;
import ObjeAux.OpusPrimaria;
import ObjeAux.consultas_arreglos;
import jade.gui.GuiEvent;
import java.util.ArrayList;

public class guiRecomendarKM extends javax.swing.JFrame implements ObjeAux.Actions {
    AgPlaneador Agnt;
    OpusPrimaria opusKMCH = new OpusPrimaria();
    OpusPrimaria opusKMDB = new OpusPrimaria();
    OpusPrimaria opusXMCH= new OpusPrimaria();
    OpusPrimaria opusXMDB = new OpusPrimaria();
    OpusPrimaria opusEMCH = new OpusPrimaria();
    OpusPrimaria opusEMDB = new OpusPrimaria();

    public guiRecomendarKM(AgPlaneador a) {
        Agnt = a;
        initComponents();
        recomendarFinalKM();
        lblEmocion2.setText((String) guiARecomendar.jcboE.getSelectedItem());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textTXKMCH = new javax.swing.JTextField();
        textTYKMCH = new javax.swing.JTextField();
        textTZKMCH = new javax.swing.JTextField();
        textDXKMCH = new javax.swing.JTextField();
        textDYKMCH = new javax.swing.JTextField();
        textDZKMCH = new javax.swing.JTextField();
        textOXKMCH = new javax.swing.JTextField();
        textOYKMCH = new javax.swing.JTextField();
        textOZKMCH = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaInstrumentosKM = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaEscalasKM = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaAcordesKM = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        textTXKMDB = new javax.swing.JTextField();
        textTYKMDB = new javax.swing.JTextField();
        textTZKMDB = new javax.swing.JTextField();
        textDXKMDB = new javax.swing.JTextField();
        textDYKMDB = new javax.swing.JTextField();
        textDZKMDB = new javax.swing.JTextField();
        textOXKMDB = new javax.swing.JTextField();
        textOYKMDB = new javax.swing.JTextField();
        textOZKMDB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        textTXKMCH1 = new javax.swing.JTextField();
        textTYKMCH1 = new javax.swing.JTextField();
        textTZKMCH1 = new javax.swing.JTextField();
        textDXKMCH1 = new javax.swing.JTextField();
        textDYKMCH1 = new javax.swing.JTextField();
        textDZKMCH1 = new javax.swing.JTextField();
        textOXKMCH1 = new javax.swing.JTextField();
        textOYKMCH1 = new javax.swing.JTextField();
        textOZKMCH1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaInstrumentosEM = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        areaEscalasEM = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        areaAcordesEM = new javax.swing.JTextArea();
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
        textTXKMDB1 = new javax.swing.JTextField();
        textTYKMDB1 = new javax.swing.JTextField();
        textTZKMDB1 = new javax.swing.JTextField();
        textDXKMDB1 = new javax.swing.JTextField();
        textDYKMDB1 = new javax.swing.JTextField();
        textDZKMDB1 = new javax.swing.JTextField();
        textOXKMDB1 = new javax.swing.JTextField();
        textOYKMDB1 = new javax.swing.JTextField();
        textOZKMDB1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        textTXKMCH2 = new javax.swing.JTextField();
        textTYKMCH2 = new javax.swing.JTextField();
        textTZKMCH2 = new javax.swing.JTextField();
        textDXKMCH2 = new javax.swing.JTextField();
        textDYKMCH2 = new javax.swing.JTextField();
        textDZKMCH2 = new javax.swing.JTextField();
        textOXKMCH2 = new javax.swing.JTextField();
        textOYKMCH2 = new javax.swing.JTextField();
        textOZKMCH2 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        areaInstrumentosXM = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        areaEscalasXM = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        areaAcordesXM = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        textTXKMDB2 = new javax.swing.JTextField();
        textTYKMDB2 = new javax.swing.JTextField();
        textTZKMDB2 = new javax.swing.JTextField();
        textDXKMDB2 = new javax.swing.JTextField();
        textDYKMDB2 = new javax.swing.JTextField();
        textDZKMDB2 = new javax.swing.JTextField();
        textOXKMDB2 = new javax.swing.JTextField();
        textOYKMDB2 = new javax.swing.JTextField();
        textOZKMDB2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblEmocion2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("EM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel3.setText("kMeans");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Calinsky-Harabaz");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel6.setText("Davies-Bouldin");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel3.add(textTXKMCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 100, -1));
        jPanel3.add(textTYKMCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 90, -1));
        jPanel3.add(textTZKMCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 90, -1));
        jPanel3.add(textDXKMCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 90, -1));
        jPanel3.add(textDYKMCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 80, -1));
        jPanel3.add(textDZKMCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 80, -1));
        jPanel3.add(textOXKMCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 90, -1));
        jPanel3.add(textOYKMCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 90, -1));
        jPanel3.add(textOZKMCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 90, -1));

        areaInstrumentosKM.setColumns(20);
        areaInstrumentosKM.setRows(5);
        jScrollPane1.setViewportView(areaInstrumentosKM);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 120, 100));

        areaEscalasKM.setColumns(20);
        areaEscalasKM.setRows(5);
        jScrollPane2.setViewportView(areaEscalasKM);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 110, 100));

        areaAcordesKM.setColumns(20);
        areaAcordesKM.setRows(5);
        jScrollPane3.setViewportView(areaAcordesKM);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 120, 100));

        jLabel7.setText("Acordes");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, -1, -1));

        jLabel8.setText("Tempo X");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel9.setText("Tempo Y");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel10.setText("Tempo Z");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel11.setText("Duración X");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel12.setText("Duración Y");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel13.setText("Duración Z");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jLabel14.setText("Octava X");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel15.setText("Octava Y");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        jLabel16.setText("Octava Z");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        jLabel17.setText("Instrumentos");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, -1, -1));

        jLabel18.setText("Escalas");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, -1));
        jPanel3.add(textTXKMDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, -1));
        jPanel3.add(textTYKMDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 90, -1));
        jPanel3.add(textTZKMDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 90, -1));
        jPanel3.add(textDXKMDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 90, -1));
        jPanel3.add(textDYKMDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 80, -1));
        jPanel3.add(textDZKMDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 80, -1));
        jPanel3.add(textOXKMDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 90, -1));
        jPanel3.add(textOYKMDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 90, -1));
        jPanel3.add(textOZKMDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 90, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1180, 160));

        jLabel4.setText("xMeans");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Calinsky-Harabaz");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel20.setText("Davies-Bouldin");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel4.add(textTXKMCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));
        jPanel4.add(textTYKMCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 90, -1));
        jPanel4.add(textTZKMCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 90, -1));
        jPanel4.add(textDXKMCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 90, -1));
        jPanel4.add(textDYKMCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 80, -1));
        jPanel4.add(textDZKMCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 80, -1));
        jPanel4.add(textOXKMCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 90, -1));
        jPanel4.add(textOYKMCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 90, -1));
        jPanel4.add(textOZKMCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 90, -1));

        areaInstrumentosEM.setColumns(20);
        areaInstrumentosEM.setRows(5);
        jScrollPane4.setViewportView(areaInstrumentosEM);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 120, 100));

        areaEscalasEM.setColumns(20);
        areaEscalasEM.setRows(5);
        jScrollPane5.setViewportView(areaEscalasEM);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 110, 100));

        areaAcordesEM.setColumns(20);
        areaAcordesEM.setRows(5);
        jScrollPane6.setViewportView(areaAcordesEM);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 120, 100));

        jLabel21.setText("Acordes");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, -1, -1));

        jLabel22.setText("Tempo X");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel23.setText("Tempo Y");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel24.setText("Tempo Z");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel25.setText("Duración X");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel26.setText("Duración Y");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel27.setText("Duración Z");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jLabel28.setText("Octava X");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel29.setText("Octava Y");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        jLabel30.setText("Octava Z");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        jLabel31.setText("Instrumentos");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, -1, -1));

        jLabel32.setText("Escalas");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, -1));
        jPanel4.add(textTXKMDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, -1));
        jPanel4.add(textTYKMDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 90, -1));
        jPanel4.add(textTZKMDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 90, -1));
        jPanel4.add(textDXKMDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 90, -1));
        jPanel4.add(textDYKMDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 80, -1));
        jPanel4.add(textDZKMDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 80, -1));
        jPanel4.add(textOXKMDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 90, -1));
        jPanel4.add(textOYKMDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 90, -1));
        jPanel4.add(textOZKMDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 90, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 1180, 160));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setText("Calinsky-Harabaz");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel34.setText("Davies-Bouldin");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel5.add(textTXKMCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));
        jPanel5.add(textTYKMCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 90, -1));
        jPanel5.add(textTZKMCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 90, -1));
        jPanel5.add(textDXKMCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 90, -1));
        jPanel5.add(textDYKMCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 80, -1));
        jPanel5.add(textDZKMCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 80, -1));
        jPanel5.add(textOXKMCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 90, -1));
        jPanel5.add(textOYKMCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 90, -1));
        jPanel5.add(textOZKMCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 90, -1));

        areaInstrumentosXM.setColumns(20);
        areaInstrumentosXM.setRows(5);
        jScrollPane7.setViewportView(areaInstrumentosXM);

        jPanel5.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 120, 100));

        areaEscalasXM.setColumns(20);
        areaEscalasXM.setRows(5);
        jScrollPane8.setViewportView(areaEscalasXM);

        jPanel5.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 110, 100));

        areaAcordesXM.setColumns(20);
        areaAcordesXM.setRows(5);
        jScrollPane9.setViewportView(areaAcordesXM);

        jPanel5.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 120, 100));

        jLabel35.setText("Acordes");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, -1, -1));

        jLabel36.setText("Tempo X");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel37.setText("Tempo Y");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel38.setText("Tempo Z");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel39.setText("Duración X");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel40.setText("Duración Y");
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel41.setText("Duración Z");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jLabel42.setText("Octava X");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel43.setText("Octava Y");
        jPanel5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        jLabel44.setText("Octava Z");
        jPanel5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        jLabel45.setText("Instrumentos");
        jPanel5.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, -1, -1));

        jLabel46.setText("Escalas");
        jPanel5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, -1));
        jPanel5.add(textTXKMDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, -1));
        jPanel5.add(textTYKMDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 90, -1));
        jPanel5.add(textTZKMDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 90, -1));
        jPanel5.add(textDXKMDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 90, -1));
        jPanel5.add(textDYKMDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 80, -1));
        jPanel5.add(textDZKMDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 80, -1));
        jPanel5.add(textOXKMDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 90, -1));
        jPanel5.add(textOYKMDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 90, -1));
        jPanel5.add(textOZKMDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 90, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 1180, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1200, 600));

        jLabel2.setText("Recomendación Final por Agrupador");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 640, -1, -1));

        lblEmocion2.setForeground(new java.awt.Color(153, 0, 0));
        lblEmocion2.setText("jLabel47");
        getContentPane().add(lblEmocion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jMenu1.setText("Acciones");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void recomendarFinalKM() {

        consultas_arreglos cons = new consultas_arreglos();

        double vTXCH = Double.parseDouble(guiAEvaluarIndice.valorTXCH.getText());
        double aTXCH = Math.rint(vTXCH * 100) / 100;
        vTXCH = aTXCH;

        double vTYCH = Double.parseDouble(guiAEvaluarIndice.valorTYCH.getText());
        double aTYCH = Math.rint(vTYCH * 100) / 100;
        vTYCH = aTYCH;

        double vTZCH = Double.parseDouble(guiAEvaluarIndice.valorTZCH.getText());
        double aTZCH = Math.rint(vTZCH * 100) / 100;
        vTZCH = aTZCH;

        double vTXDB = Double.parseDouble(guiAEvaluarIndice.valorTXDB.getText());
        double aTXDB = Math.rint(vTXDB * 100) / 100;
        vTXDB = aTXDB;

        double vTYDB = Double.parseDouble(guiAEvaluarIndice.valorTYDB.getText());
        double aTYDB = Math.rint(vTYDB * 100) / 100;
        vTYDB = aTYDB;

        double vTZDB = Double.parseDouble(guiAEvaluarIndice.valorTZDB.getText());
        double aTZDB = Math.rint(vTZDB * 100) / 100;
        vTZDB = aTZDB;

        // DURACION
        double vDXCH = Double.parseDouble(guiAEvaluarIndice.valorDXCH.getText());
        double aDXCH = Math.rint(vDXCH * 1000) / 1000;
        vDXCH = aDXCH;

        double vDYCH = Double.parseDouble(guiAEvaluarIndice.valorDYCH.getText());
        double aDYCH = Math.rint(vDYCH * 1000) / 1000;
        vDYCH = aDYCH;

        double vDZCH = Double.parseDouble(guiAEvaluarIndice.valorDZCH.getText());
        double aDZCH = Math.rint(vDZCH * 1000) / 1000;
        vDZCH = aDZCH;

        double vDXDB = Double.parseDouble(guiAEvaluarIndice.valorDXDB.getText());
        double aDXDB = Math.rint(vDXDB * 1000) / 1000;
        vDXDB = aDXDB;

        double vDYDB = Double.parseDouble(guiAEvaluarIndice.valorDYDB.getText());
        double aDYDB = Math.rint(vDYDB * 1000) / 1000;
        vDYDB = aDYDB;

        double vDZDB = Double.parseDouble(guiAEvaluarIndice.valorDZDB.getText());
        double aDZDB = Math.rint(vDZDB * 1000) / 1000;
        vDZDB = aDZDB;

        // OCTAVAS
        double vOXCH = Double.parseDouble(guiAEvaluarIndice.valorOXCH.getText());
        double aOXCH = Math.rint(vOXCH * 100) / 100;
        vOXCH = aOXCH;
        
        double vOYCH = Double.parseDouble(guiAEvaluarIndice.valorOYCH.getText());
        double aOYCH = Math.rint(vOYCH * 100) / 100;
        vOYCH = aOYCH;

        double vOZCH = Double.parseDouble(guiAEvaluarIndice.valorOZCH.getText());
        double aOZCH = Math.rint(vOZCH * 100) / 100;
        vOZCH = aOZCH;

        double vOXDB = Double.parseDouble(guiAEvaluarIndice.valorOXDB.getText());
        double aOXDB = Math.rint(vOXDB * 100) / 100;
        vOXDB = aOXDB;

        double vOYDB = Double.parseDouble(guiAEvaluarIndice.valorOYDB.getText());
        double aOYDB = Math.rint(vOYDB * 100) / 100;
        vOYDB = aOYDB;

        double vOZDB = Double.parseDouble(guiAEvaluarIndice.valorOZDB.getText());
        double aOZDB = Math.rint(vOZDB * 100) / 100;
        vOZDB = aOZDB;

        textTXKMCH.setText(String.valueOf(vTXCH));
        textTYKMCH.setText(String.valueOf(vTYCH));
        textTZKMCH.setText(String.valueOf(vTZCH));
        textTXKMDB.setText(String.valueOf(vTXDB));
        textTYKMDB.setText(String.valueOf(vTYDB));
        textTZKMDB.setText(String.valueOf(vTZDB));

        textDXKMCH.setText(String.valueOf(vDXCH));
        textDYKMCH.setText(String.valueOf(vDYCH));
        textDZKMCH.setText(String.valueOf(vDZCH));
        textDXKMDB.setText(String.valueOf(vDXDB));
        textDYKMDB.setText(String.valueOf(vDYDB));
        textDZKMDB.setText(String.valueOf(vDZDB));

        textOXKMCH.setText(String.valueOf(vOXCH));
        textOYKMCH.setText(String.valueOf(vOYCH));
        textOZKMCH.setText(String.valueOf(vOZCH));
        textOXKMDB.setText(String.valueOf(vOXDB));
        textOYKMDB.setText(String.valueOf(vOYDB));
        textOZKMDB.setText(String.valueOf(vOZDB));

        ///////////////////////////////////// x means ///////////////////
        double vTXCH1 = Double.parseDouble(guiAEvaluarIndice.valorTXCH1.getText());
        double aTXCH1 = Math.rint(vTXCH1 * 100) / 100;
        vTXCH1 = aTXCH1;

        double vTYCH1 = Double.parseDouble(guiAEvaluarIndice.valorTYCH1.getText());
        double aTYCH1 = Math.rint(vTYCH1 * 100) / 100;
        vTYCH1 = aTYCH1;

        double vTZCH1 = Double.parseDouble(guiAEvaluarIndice.valorTZCH1.getText());
        double aTZCH1 = Math.rint(vTZCH1 * 100) / 100;
        vTZCH1 = aTZCH1;

        double vTXDB1 = Double.parseDouble(guiAEvaluarIndice.valorTXDB1.getText());
        double aTXDB1 = Math.rint(vTXDB1 * 100) / 100;
        vTXDB1 = aTXDB1;

        double vTYDB1 = Double.parseDouble(guiAEvaluarIndice.valorTYDB1.getText());
        double aTYDB1 = Math.rint(vTYDB1 * 100) / 100;
        vTYDB1 = aTYDB1;

        double vTZDB1 = Double.parseDouble(guiAEvaluarIndice.valorTZDB1.getText());
        double aTZDB1 = Math.rint(vTZDB1 * 100) / 100;
        vTZDB1 = aTZDB1;

        // DURACION
        double vDXCH1 = Double.parseDouble(guiAEvaluarIndice.valorDXCH1.getText());
        double aDXCH1 = Math.rint(vDXCH1 * 1000) / 1000;
        vDXCH1 = aDXCH1;

        double vDYCH1 = Double.parseDouble(guiAEvaluarIndice.valorDYCH1.getText());
        double aDYCH1 = Math.rint(vDYCH1 * 1000) / 1000;
        vDYCH1 = aDYCH1;

        double vDZCH1 = Double.parseDouble(guiAEvaluarIndice.valorDZCH1.getText());
        double aDZCH1 = Math.rint(vDZCH1 * 1000) / 1000;
        vDZCH1 = aDZCH1;

        double vDXDB1 = Double.parseDouble(guiAEvaluarIndice.valorDXDB1.getText());
        double aDXDB1 = Math.rint(vDXDB1 * 1000) / 1000;
        vDXDB1 = aDXDB1;

        double vDYDB1 = Double.parseDouble(guiAEvaluarIndice.valorDYDB1.getText());
        double aDYDB1 = Math.rint(vDYDB1 * 1000) / 1000;
        vDYDB1 = aDYDB1;

        double vDZDB1 = Double.parseDouble(guiAEvaluarIndice.valorDZDB1.getText());
        double aDZDB1 = Math.rint(vDZDB1 * 1000) / 1000;
        vDZDB1 = aDZDB1;

        // OCTAVAS
        double vOXCH1 = Double.parseDouble(guiAEvaluarIndice.valorOXCH1.getText());
        double aOXCH1 = Math.rint(vOXCH1 * 100) / 100;
        vOXCH1 = aOXCH1;

        double vOYCH1 = Double.parseDouble(guiAEvaluarIndice.valorOYCH1.getText());
        double aOYCH1 = Math.rint(vOYCH1 * 100) / 100;
        vOYCH1 = aOYCH1;

        double vOZCH1 = Double.parseDouble(guiAEvaluarIndice.valorOZCH1.getText());
        double aOZCH1 = Math.rint(vOZCH1 * 100) / 100;
        vOZCH1 = aOZCH1;

        double vOXDB1 = Double.parseDouble(guiAEvaluarIndice.valorOXDB1.getText());
        double aOXDB1 = Math.rint(vOXDB1 * 100) / 100;
        vOXDB1 = aOXDB1;

        double vOYDB1 = Double.parseDouble(guiAEvaluarIndice.valorOYDB1.getText());
        double aOYDB1 = Math.rint(vOYDB1 * 100) / 100;
        vOYDB1 = aOYDB1;

        double vOZDB1 = Double.parseDouble(guiAEvaluarIndice.valorOZDB1.getText());
        double aOZDB1 = Math.rint(vOZDB1 * 100) / 100;
        vOZDB1 = aOZDB1;

        textTXKMCH2.setText(String.valueOf(vTXCH1));
        textTYKMCH2.setText(String.valueOf(vTYCH1));
        textTZKMCH2.setText(String.valueOf(vTZCH1));
        textTXKMDB2.setText(String.valueOf(vTXDB1));
        textTYKMDB2.setText(String.valueOf(vTYDB1));
        textTZKMDB2.setText(String.valueOf(vTZDB1));

        textDXKMCH2.setText(String.valueOf(vDXCH1));
        textDYKMCH2.setText(String.valueOf(vDYCH1));
        textDZKMCH2.setText(String.valueOf(vDZCH1));
        textDXKMDB2.setText(String.valueOf(vDXDB1));
        textDYKMDB2.setText(String.valueOf(vDYDB1));
        textDZKMDB2.setText(String.valueOf(vDZDB1));

        textOXKMCH2.setText(String.valueOf(vOXCH1));
        textOYKMCH2.setText(String.valueOf(vOYCH1));
        textOZKMCH2.setText(String.valueOf(vOZCH1));
        textOXKMDB2.setText(String.valueOf(vOXDB1));
        textOYKMDB2.setText(String.valueOf(vOYDB1));
        textOZKMDB2.setText(String.valueOf(vOZDB1));

        ///////////////////////////////////// em ///////////////////
        double vTXCH2 = Double.parseDouble(guiAEvaluarIndice.valorTXCH2.getText());
        double aTXCH2 = Math.rint(vTXCH2 * 100) / 100;
        vTXCH2 = aTXCH2;

        double vTYCH2 = Double.parseDouble(guiAEvaluarIndice.valorTYCH2.getText());
        double aTYCH2 = Math.rint(vTYCH2 * 100) / 100;
        vTYCH2 = aTYCH2;

        double vTZCH2 = Double.parseDouble(guiAEvaluarIndice.valorTZCH2.getText());
        double aTZCH2 = Math.rint(vTZCH2 * 100) / 100;
        vTZCH2 = aTZCH2;

        double vTXDB2 = Double.parseDouble(guiAEvaluarIndice.valorTXDB2.getText());
        double aTXDB2 = Math.rint(vTXDB2 * 100) / 100;
        vTXDB2 = aTXDB2;

        double vTYDB2 = Double.parseDouble(guiAEvaluarIndice.valorTYDB2.getText());
        double aTYDB2 = Math.rint(vTYDB2 * 100) / 100;
        vTYDB2 = aTYDB2;

        double vTZDB2 = Double.parseDouble(guiAEvaluarIndice.valorTZDB2.getText());
        double aTZDB2 = Math.rint(vTZDB2 * 100) / 100;
        vTZDB2 = aTZDB2;

        // DURACION
        double vDXCH2 = Double.parseDouble(guiAEvaluarIndice.valorDXCH2.getText());
        double aDXCH2 = Math.rint(vDXCH2 * 1000) / 1000;
        vDXCH2 = aDXCH2;

        double vDYCH2 = Double.parseDouble(guiAEvaluarIndice.valorDYCH2.getText());
        double aDYCH2 = Math.rint(vDYCH2 * 1000) / 1000;
        vDYCH2 = aDYCH2;

        double vDZCH2 = Double.parseDouble(guiAEvaluarIndice.valorDZCH2.getText());
        double aDZCH2 = Math.rint(vDZCH2 * 1000) / 1000;
        vDZCH2 = aDZCH2;

        double vDXDB2 = Double.parseDouble(guiAEvaluarIndice.valorDXDB2.getText());
        double aDXDB2 = Math.rint(vDXDB2 * 1000) / 1000;
        vDXDB2 = aDXDB2;

        double vDYDB2 = Double.parseDouble(guiAEvaluarIndice.valorDYDB2.getText());
        double aDYDB2 = Math.rint(vDYDB2 * 1000) / 1000;
        vDYDB2 = aDYDB2;

        double vDZDB2 = Double.parseDouble(guiAEvaluarIndice.valorDZDB2.getText());
        double aDZDB2 = Math.rint(vDZDB2 * 1000) / 1000;
        vDZDB2 = aDZDB2;

        // OCTAVAS
        double vOXCH2 = Double.parseDouble(guiAEvaluarIndice.valorOXCH2.getText());
        double aOXCH2 = Math.rint(vOXCH2 * 100) / 100;
        vOXCH2 = aOXCH2;

        double vOYCH2 = Double.parseDouble(guiAEvaluarIndice.valorOYCH2.getText());
        double aOYCH2 = Math.rint(vOYCH2 * 100) / 100;
        vOYCH2 = aOYCH2;

        double vOZCH2 = Double.parseDouble(guiAEvaluarIndice.valorOZCH2.getText());
        double aOZCH2 = Math.rint(vOZCH2 * 100) / 100;
        vOZCH2 = aOZCH2;

        double vOXDB2 = Double.parseDouble(guiAEvaluarIndice.valorOXDB2.getText());
        double aOXDB2 = Math.rint(vOXDB2 * 100) / 100;
        vOXDB2 = aOXDB2;

        double vOYDB2 = Double.parseDouble(guiAEvaluarIndice.valorOYDB2.getText());
        double aOYDB2 = Math.rint(vOYDB2 * 100) / 100;
        vOYDB2 = aOYDB2;

        double vOZDB2 = Double.parseDouble(guiAEvaluarIndice.valorOZDB2.getText());
        double aOZDB2 = Math.rint(vOZDB2 * 100) / 100;
        vOZDB2 = aOZDB2;

        textTXKMCH1.setText(String.valueOf(vTXCH2));
        textTYKMCH1.setText(String.valueOf(vTYCH2));
        textTZKMCH1.setText(String.valueOf(vTZCH2));
        textTXKMDB1.setText(String.valueOf(vTXDB2));
        textTYKMDB1.setText(String.valueOf(vTYDB2));
        textTZKMDB1.setText(String.valueOf(vTZDB2));

        textDXKMCH1.setText(String.valueOf(vDXCH2));
        textDYKMCH1.setText(String.valueOf(vDYCH2));
        textDZKMCH1.setText(String.valueOf(vDZCH2));
        textDXKMDB1.setText(String.valueOf(vDXDB2));
        textDYKMDB1.setText(String.valueOf(vDYDB2));
        textDZKMDB1.setText(String.valueOf(vDZDB2));

        textOXKMCH1.setText(String.valueOf(vOXCH2));
        textOYKMCH1.setText(String.valueOf(vOYCH2));
        textOZKMCH1.setText(String.valueOf(vOZCH2));
        textOXKMDB1.setText(String.valueOf(vOXDB2));
        textOYKMDB1.setText(String.valueOf(vOYDB2));
        textOZKMDB1.setText(String.valueOf(vOZDB2));

        /////// INSTRUMENTOS //////
        ArrayList<String> instrumentos = cons.getInstCount(emocion3);      
        for(int i = 0; i < instrumentos.size(); i+=2) {
            areaInstrumentosKM.append(instrumentos.get(i) + " " + instrumentos.get(i + 1) + "\n");    
            areaInstrumentosXM.append(instrumentos.get(i) + " " + instrumentos.get(i + 1) + "\n");    
            areaInstrumentosEM.append(instrumentos.get(i) + " " + instrumentos.get(i + 1) + "\n");    
        }

        /////// ESCALAS //////
        ArrayList<String> escalas = cons.getScaleCount(emocion3);
        for(int i = 0; i < escalas.size(); i+=2) {
            areaEscalasKM.append(escalas.get(i) + " " + escalas.get(i + 1) + "\n");    
            areaEscalasXM.append(escalas.get(i) + " " + escalas.get(i + 1) + "\n");    
            areaEscalasEM.append(escalas.get(i) + " " + escalas.get(i + 1) + "\n");    
        }

//////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////// ACORDES //////
        ArrayList<String> acordes = cons.getChordCount(emocion3);

        for(int i = 0; i < acordes.size(); i+=2) {
            areaAcordesKM.append(acordes.get(i) + " " + acordes.get(i + 1) + "\n");    
            areaAcordesXM.append(acordes.get(i) + " " + acordes.get(i + 1) + "\n");    
            areaAcordesEM.append(acordes.get(i) + " " + acordes.get(i + 1) + "\n");    
        }
        
        ///Opus KMeans CH
        opusKMCH.set((int)vTXCH, (int)vTYCH, (int)vTZCH, vDXCH, vDYCH, vDZCH, (int)vOXCH, (int)vOYCH, (int)vOZCH, cons.getBestInst(emocion3), cons.getBestScale(emocion3), cons.getBestChord(emocion3), "Caliski - Harabasz", "KMeans");
        ///Opus KMeans DB
        opusKMDB.set((int)vTXDB, (int)vTYDB, (int)vTZDB, vDXDB, vDYDB, vDZDB, (int)vOXDB, (int)vOYDB, (int)vOZDB, cons.getBestInst(emocion3), cons.getBestScale(emocion3), cons.getBestChord(emocion3), "Davis - Bouldin", "KMeans");

        ///Opus XMeans CH
        opusXMCH.set((int)vTXCH1, (int)vTYCH1, (int)vTZCH1, vDXCH1, vDYCH1, vDZCH1, (int)vOXCH1, (int)vOYCH1, (int)vOZCH1, cons.getBestInst(emocion3), cons.getBestScale(emocion3), cons.getBestChord(emocion3), "Caliski - Harabasz", "XMeans");
        ///Opus XMeans DB
        opusXMDB.set((int)vTXDB1, (int)vTYDB1, (int)vTZDB1, vDXDB1, vDYDB1, vDZDB1, (int)vOXDB1, (int)vOYDB1, (int)vOZDB1, cons.getBestInst(emocion3), cons.getBestScale(emocion3), cons.getBestChord(emocion3), "Davis - Bouldin", "XMeans");
        
        ///Opus KMeans CH
        opusEMCH.set((int)vTXCH2, (int)vTYCH2, (int)vTZCH2, vDXCH2, vDYCH2, vDZCH2, (int)vOXCH2, (int)vOYCH2, (int)vOZCH2, cons.getBestInst(emocion3), cons.getBestScale(emocion3), cons.getBestChord(emocion3), "Caliski - Harabasz", "EM");
        ///Opus KMeans DB
        opusEMDB.set((int)vTXDB2, (int)vTYDB2, (int)vTZDB2, vDXDB2, vDYDB2, vDZDB2, (int)vOXDB2, (int)vOYDB2, (int)vOZDB2, cons.getBestInst(emocion3), cons.getBestScale(emocion3), cons.getBestChord(emocion3), "Davis - Bouldin", "EM");        
        
        /***Envío de opus***/
        OpusPrimaria[] o = {opusKMCH, opusKMDB, opusXMCH, opusXMDB, opusEMCH, opusEMDB};
        GuiEvent evt = new GuiEvent(this, OPUS);
        evt.addParameter(o);
        Agnt.postGuiEvent(evt);
        
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(guiRecomendarKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiRecomendarKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiRecomendarKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiRecomendarKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaAcordesEM;
    private javax.swing.JTextArea areaAcordesKM;
    private javax.swing.JTextArea areaAcordesXM;
    private javax.swing.JTextArea areaEscalasEM;
    private javax.swing.JTextArea areaEscalasKM;
    private javax.swing.JTextArea areaEscalasXM;
    private javax.swing.JTextArea areaInstrumentosEM;
    private javax.swing.JTextArea areaInstrumentosKM;
    private javax.swing.JTextArea areaInstrumentosXM;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblEmocion2;
    private javax.swing.JTextField textDXKMCH;
    private javax.swing.JTextField textDXKMCH1;
    private javax.swing.JTextField textDXKMCH2;
    private javax.swing.JTextField textDXKMDB;
    private javax.swing.JTextField textDXKMDB1;
    private javax.swing.JTextField textDXKMDB2;
    private javax.swing.JTextField textDYKMCH;
    private javax.swing.JTextField textDYKMCH1;
    private javax.swing.JTextField textDYKMCH2;
    private javax.swing.JTextField textDYKMDB;
    private javax.swing.JTextField textDYKMDB1;
    private javax.swing.JTextField textDYKMDB2;
    private javax.swing.JTextField textDZKMCH;
    private javax.swing.JTextField textDZKMCH1;
    private javax.swing.JTextField textDZKMCH2;
    private javax.swing.JTextField textDZKMDB;
    private javax.swing.JTextField textDZKMDB1;
    private javax.swing.JTextField textDZKMDB2;
    private javax.swing.JTextField textOXKMCH;
    private javax.swing.JTextField textOXKMCH1;
    private javax.swing.JTextField textOXKMCH2;
    private javax.swing.JTextField textOXKMDB;
    private javax.swing.JTextField textOXKMDB1;
    private javax.swing.JTextField textOXKMDB2;
    private javax.swing.JTextField textOYKMCH;
    private javax.swing.JTextField textOYKMCH1;
    private javax.swing.JTextField textOYKMCH2;
    private javax.swing.JTextField textOYKMDB;
    private javax.swing.JTextField textOYKMDB1;
    private javax.swing.JTextField textOYKMDB2;
    private javax.swing.JTextField textOZKMCH;
    private javax.swing.JTextField textOZKMCH1;
    private javax.swing.JTextField textOZKMCH2;
    private javax.swing.JTextField textOZKMDB;
    private javax.swing.JTextField textOZKMDB1;
    private javax.swing.JTextField textOZKMDB2;
    private javax.swing.JTextField textTXKMCH;
    private javax.swing.JTextField textTXKMCH1;
    private javax.swing.JTextField textTXKMCH2;
    private javax.swing.JTextField textTXKMDB;
    private javax.swing.JTextField textTXKMDB1;
    private javax.swing.JTextField textTXKMDB2;
    private javax.swing.JTextField textTYKMCH;
    private javax.swing.JTextField textTYKMCH1;
    private javax.swing.JTextField textTYKMCH2;
    private javax.swing.JTextField textTYKMDB;
    private javax.swing.JTextField textTYKMDB1;
    private javax.swing.JTextField textTYKMDB2;
    private javax.swing.JTextField textTZKMCH;
    private javax.swing.JTextField textTZKMCH1;
    private javax.swing.JTextField textTZKMCH2;
    private javax.swing.JTextField textTZKMDB;
    private javax.swing.JTextField textTZKMDB1;
    private javax.swing.JTextField textTZKMDB2;
    // End of variables declaration//GEN-END:variables
}
