package Interfaces;

import Agentes.AgPlaneador;
import jade.gui.GuiEvent;

public class guiAFusionar extends javax.swing.JFrame implements ObjeAux.Actions {

    public static AgPlaneador Agnt;
    
    public guiAFusionar(AgPlaneador a) {
        initComponents();
        Agnt = a;
        lblEmocion.setText((String) guiARecomendar.jcboE.getSelectedItem());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextGCTZ = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextALTZ = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextGCTY = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextGCTX = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextFusionTZ = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextALTY = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextALTX = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextFusionTX = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextFusionTY = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextFusionTXF = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextFusionTYF = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextFusionTZF = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextFusionTZFI = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextFusionTXFI = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextFusionTYFI = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextFusionTZFPP = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextFusionTXFPP = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextFusionTYFPP = new javax.swing.JTextArea();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextNCNITX = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextNCNITY = new javax.swing.JTextArea();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextNCNITZ = new javax.swing.JTextArea();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextFusionTXFNCI = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextFusionTZFNCI = new javax.swing.JTextArea();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextFusionTYFNCI = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTXFIndiceCH = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTYFIndiceCH = new javax.swing.JTextField();
        jTZFIndiceCH = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTXFIndiceDB = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTYFIndiceDB = new javax.swing.JTextField();
        jTZFIndiceDB = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTXFIndiceCHPA = new javax.swing.JTextField();
        jTXFIndiceDBPA = new javax.swing.JTextField();
        jTYFIndiceCHPA = new javax.swing.JTextField();
        jTYFIndiceDBPA = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTZFIndiceCHPA = new javax.swing.JTextField();
        jTZFIndiceDBPA = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jScrollPane76 = new javax.swing.JScrollPane();
        jTextGCTZX = new javax.swing.JTextArea();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jScrollPane77 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jScrollPane78 = new javax.swing.JScrollPane();
        jTextALTZX = new javax.swing.JTextArea();
        jLabel84 = new javax.swing.JLabel();
        jScrollPane79 = new javax.swing.JScrollPane();
        jTextGCTYX = new javax.swing.JTextArea();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane80 = new javax.swing.JScrollPane();
        jTextGCTXX = new javax.swing.JTextArea();
        jScrollPane81 = new javax.swing.JScrollPane();
        jTextFusionTZX = new javax.swing.JTextArea();
        jScrollPane82 = new javax.swing.JScrollPane();
        jTextALTYX = new javax.swing.JTextArea();
        jLabel86 = new javax.swing.JLabel();
        jScrollPane83 = new javax.swing.JScrollPane();
        jTextALTXX = new javax.swing.JTextArea();
        jScrollPane84 = new javax.swing.JScrollPane();
        jTextFusionTXX = new javax.swing.JTextArea();
        jScrollPane85 = new javax.swing.JScrollPane();
        jTextFusionTYX = new javax.swing.JTextArea();
        jLabel87 = new javax.swing.JLabel();
        jScrollPane86 = new javax.swing.JScrollPane();
        jTextFusionTXFX = new javax.swing.JTextArea();
        jScrollPane87 = new javax.swing.JScrollPane();
        jTextFusionTYFX = new javax.swing.JTextArea();
        jScrollPane88 = new javax.swing.JScrollPane();
        jTextFusionTZFX = new javax.swing.JTextArea();
        jScrollPane89 = new javax.swing.JScrollPane();
        jTextFusionTZFIX = new javax.swing.JTextArea();
        jScrollPane90 = new javax.swing.JScrollPane();
        jTextFusionTXFIX = new javax.swing.JTextArea();
        jScrollPane91 = new javax.swing.JScrollPane();
        jTextFusionTYFIX = new javax.swing.JTextArea();
        jLabel88 = new javax.swing.JLabel();
        jScrollPane92 = new javax.swing.JScrollPane();
        jTextFusionTZFPPX = new javax.swing.JTextArea();
        jScrollPane93 = new javax.swing.JScrollPane();
        jTextFusionTXFPPX = new javax.swing.JTextArea();
        jScrollPane94 = new javax.swing.JScrollPane();
        jTextFusionTYFPPX = new javax.swing.JTextArea();
        jScrollPane95 = new javax.swing.JScrollPane();
        jTextNCNITXX = new javax.swing.JTextArea();
        jLabel89 = new javax.swing.JLabel();
        jScrollPane96 = new javax.swing.JScrollPane();
        jTextNCNITYX = new javax.swing.JTextArea();
        jScrollPane97 = new javax.swing.JScrollPane();
        jTextNCNITZX = new javax.swing.JTextArea();
        jScrollPane98 = new javax.swing.JScrollPane();
        jTextFusionTXFNCIX = new javax.swing.JTextArea();
        jLabel90 = new javax.swing.JLabel();
        jScrollPane99 = new javax.swing.JScrollPane();
        jTextFusionTZFNCIX = new javax.swing.JTextArea();
        jScrollPane100 = new javax.swing.JScrollPane();
        jTextFusionTYFNCIX = new javax.swing.JTextArea();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jTXFIndiceCHX = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jTYFIndiceCHX = new javax.swing.JTextField();
        jTZFIndiceCHX = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jTXFIndiceDBX = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jTYFIndiceDBX = new javax.swing.JTextField();
        jTZFIndiceDBX = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jTXFIndiceCHPAX = new javax.swing.JTextField();
        jTXFIndiceDBPAX = new javax.swing.JTextField();
        jTYFIndiceCHPAX = new javax.swing.JTextField();
        jTYFIndiceDBPAX = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jTZFIndiceCHPAX = new javax.swing.JTextField();
        jTZFIndiceDBPAX = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        jScrollPane154 = new javax.swing.JScrollPane();
        jTextGCTZEM = new javax.swing.JTextArea();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jScrollPane155 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jScrollPane156 = new javax.swing.JScrollPane();
        jTextALTZEM = new javax.swing.JTextArea();
        jLabel159 = new javax.swing.JLabel();
        jScrollPane157 = new javax.swing.JScrollPane();
        jTextGCTYEM = new javax.swing.JTextArea();
        jLabel160 = new javax.swing.JLabel();
        jScrollPane158 = new javax.swing.JScrollPane();
        jTextGCTXEM = new javax.swing.JTextArea();
        jScrollPane159 = new javax.swing.JScrollPane();
        jTextFusionTZEM = new javax.swing.JTextArea();
        jScrollPane160 = new javax.swing.JScrollPane();
        jTextALTYEM = new javax.swing.JTextArea();
        jLabel161 = new javax.swing.JLabel();
        jScrollPane161 = new javax.swing.JScrollPane();
        jTextALTXEM = new javax.swing.JTextArea();
        jScrollPane162 = new javax.swing.JScrollPane();
        jTextFusionTXEM = new javax.swing.JTextArea();
        jScrollPane163 = new javax.swing.JScrollPane();
        jTextFusionTYEM = new javax.swing.JTextArea();
        jLabel162 = new javax.swing.JLabel();
        jScrollPane164 = new javax.swing.JScrollPane();
        jTextFusionTXFEM = new javax.swing.JTextArea();
        jScrollPane165 = new javax.swing.JScrollPane();
        jTextFusionTYFEM = new javax.swing.JTextArea();
        jScrollPane166 = new javax.swing.JScrollPane();
        jTextFusionTZFEM = new javax.swing.JTextArea();
        jScrollPane167 = new javax.swing.JScrollPane();
        jTextFusionTZFIEM = new javax.swing.JTextArea();
        jScrollPane168 = new javax.swing.JScrollPane();
        jTextFusionTXFIEM = new javax.swing.JTextArea();
        jScrollPane169 = new javax.swing.JScrollPane();
        jTextFusionTYFIEM = new javax.swing.JTextArea();
        jLabel163 = new javax.swing.JLabel();
        jScrollPane170 = new javax.swing.JScrollPane();
        jTextFusionTZFPPEM = new javax.swing.JTextArea();
        jScrollPane171 = new javax.swing.JScrollPane();
        jTextFusionTXFPPEM = new javax.swing.JTextArea();
        jScrollPane172 = new javax.swing.JScrollPane();
        jTextFusionTYFPPEM = new javax.swing.JTextArea();
        jScrollPane173 = new javax.swing.JScrollPane();
        jTextNCNITXEM = new javax.swing.JTextArea();
        jLabel164 = new javax.swing.JLabel();
        jScrollPane174 = new javax.swing.JScrollPane();
        jTextNCNITYEM = new javax.swing.JTextArea();
        jScrollPane175 = new javax.swing.JScrollPane();
        jTextNCNITZEM = new javax.swing.JTextArea();
        jScrollPane176 = new javax.swing.JScrollPane();
        jTextFusionTXFNCIEM = new javax.swing.JTextArea();
        jLabel165 = new javax.swing.JLabel();
        jScrollPane177 = new javax.swing.JScrollPane();
        jTextFusionTZFNCIEM = new javax.swing.JTextArea();
        jScrollPane178 = new javax.swing.JScrollPane();
        jTextFusionTYFNCIEM = new javax.swing.JTextArea();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jTXFIndiceCHEM = new javax.swing.JTextField();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jTYFIndiceCHEM = new javax.swing.JTextField();
        jTZFIndiceCHEM = new javax.swing.JTextField();
        jLabel170 = new javax.swing.JLabel();
        jTXFIndiceDBEM = new javax.swing.JTextField();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jTYFIndiceDBEM = new javax.swing.JTextField();
        jTZFIndiceDBEM = new javax.swing.JTextField();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jTXFIndiceCHPAEM = new javax.swing.JTextField();
        jTXFIndiceDBPAEM = new javax.swing.JTextField();
        jTYFIndiceCHPAEM = new javax.swing.JTextField();
        jTYFIndiceDBPAEM = new javax.swing.JTextField();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jTZFIndiceCHPAEM = new javax.swing.JTextField();
        jTZFIndiceDBPAEM = new javax.swing.JTextField();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTextNCNIDX = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTextNCNIDY = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        jTextNCNIDZ = new javax.swing.JTextArea();
        jScrollPane30 = new javax.swing.JScrollPane();
        jTextGCDZ = new javax.swing.JTextArea();
        jScrollPane31 = new javax.swing.JScrollPane();
        jTextGCDY = new javax.swing.JTextArea();
        jScrollPane32 = new javax.swing.JScrollPane();
        jTextGCDX = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        jTextALDX = new javax.swing.JTextArea();
        jScrollPane34 = new javax.swing.JScrollPane();
        jTextALDY = new javax.swing.JTextArea();
        jScrollPane35 = new javax.swing.JScrollPane();
        jTextALDZ = new javax.swing.JTextArea();
        jScrollPane36 = new javax.swing.JScrollPane();
        jTextFusionDZ = new javax.swing.JTextArea();
        jScrollPane37 = new javax.swing.JScrollPane();
        jTextFusionDY = new javax.swing.JTextArea();
        jScrollPane38 = new javax.swing.JScrollPane();
        jTextFusionDX = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane39 = new javax.swing.JScrollPane();
        jTextFusionDXFI = new javax.swing.JTextArea();
        jScrollPane40 = new javax.swing.JScrollPane();
        jTextFusionDYFI = new javax.swing.JTextArea();
        jScrollPane41 = new javax.swing.JScrollPane();
        jTextFusionDZFI = new javax.swing.JTextArea();
        jScrollPane42 = new javax.swing.JScrollPane();
        jTextFusionDZF = new javax.swing.JTextArea();
        jScrollPane43 = new javax.swing.JScrollPane();
        jTextFusionDYF = new javax.swing.JTextArea();
        jScrollPane44 = new javax.swing.JScrollPane();
        jTextFusionDXF = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane45 = new javax.swing.JScrollPane();
        jTextFusionDZFPP = new javax.swing.JTextArea();
        jScrollPane46 = new javax.swing.JScrollPane();
        jTextFusionDYFPP = new javax.swing.JTextArea();
        jScrollPane47 = new javax.swing.JScrollPane();
        jTextFusionDXFPP = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane48 = new javax.swing.JScrollPane();
        jTextFusionDXFNCI = new javax.swing.JTextArea();
        jScrollPane49 = new javax.swing.JScrollPane();
        jTextFusionDYFNCI = new javax.swing.JTextArea();
        jScrollPane50 = new javax.swing.JScrollPane();
        jTextFusionDZFNCI = new javax.swing.JTextArea();
        jDZFIndiceDBPA = new javax.swing.JTextField();
        jDZFIndiceDB = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jDYFIndiceDBPA = new javax.swing.JTextField();
        jDYFIndiceDB = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jDYFIndiceCH = new javax.swing.JTextField();
        jDXFIndiceDBPA = new javax.swing.JTextField();
        jDXFIndiceDB = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jDXFIndiceCH = new javax.swing.JTextField();
        jDXFIndiceCHPA = new javax.swing.JTextField();
        jDYFIndiceCHPA = new javax.swing.JTextField();
        jDZFIndiceCH = new javax.swing.JTextField();
        jDZFIndiceCHPA = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jScrollPane101 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jScrollPane102 = new javax.swing.JScrollPane();
        jTextNCNIDXX = new javax.swing.JTextArea();
        jLabel108 = new javax.swing.JLabel();
        jScrollPane103 = new javax.swing.JScrollPane();
        jTextNCNIDYX = new javax.swing.JTextArea();
        jLabel109 = new javax.swing.JLabel();
        jScrollPane104 = new javax.swing.JScrollPane();
        jTextNCNIDZX = new javax.swing.JTextArea();
        jScrollPane105 = new javax.swing.JScrollPane();
        jTextGCDZX = new javax.swing.JTextArea();
        jScrollPane106 = new javax.swing.JScrollPane();
        jTextGCDYX = new javax.swing.JTextArea();
        jScrollPane107 = new javax.swing.JScrollPane();
        jTextGCDXX = new javax.swing.JTextArea();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jScrollPane108 = new javax.swing.JScrollPane();
        jTextALDXX = new javax.swing.JTextArea();
        jScrollPane109 = new javax.swing.JScrollPane();
        jTextALDYX = new javax.swing.JTextArea();
        jScrollPane110 = new javax.swing.JScrollPane();
        jTextALDZX = new javax.swing.JTextArea();
        jScrollPane111 = new javax.swing.JScrollPane();
        jTextFusionDZX = new javax.swing.JTextArea();
        jScrollPane115 = new javax.swing.JScrollPane();
        jTextFusionDYX = new javax.swing.JTextArea();
        jScrollPane116 = new javax.swing.JScrollPane();
        jTextFusionDXX = new javax.swing.JTextArea();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jScrollPane117 = new javax.swing.JScrollPane();
        jTextFusionDXFIX = new javax.swing.JTextArea();
        jScrollPane118 = new javax.swing.JScrollPane();
        jTextFusionDYFIX = new javax.swing.JTextArea();
        jScrollPane119 = new javax.swing.JScrollPane();
        jTextFusionDZFIX = new javax.swing.JTextArea();
        jScrollPane120 = new javax.swing.JScrollPane();
        jTextFusionDZFX = new javax.swing.JTextArea();
        jScrollPane121 = new javax.swing.JScrollPane();
        jTextFusionDYFX = new javax.swing.JTextArea();
        jScrollPane122 = new javax.swing.JScrollPane();
        jTextFusionDXFX = new javax.swing.JTextArea();
        jLabel114 = new javax.swing.JLabel();
        jScrollPane123 = new javax.swing.JScrollPane();
        jTextFusionDZFPPX = new javax.swing.JTextArea();
        jScrollPane124 = new javax.swing.JScrollPane();
        jTextFusionDYFPPX = new javax.swing.JTextArea();
        jScrollPane125 = new javax.swing.JScrollPane();
        jTextFusionDXFPPX = new javax.swing.JTextArea();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jScrollPane126 = new javax.swing.JScrollPane();
        jTextFusionDXFNCIX = new javax.swing.JTextArea();
        jScrollPane127 = new javax.swing.JScrollPane();
        jTextFusionDYFNCIX = new javax.swing.JTextArea();
        jScrollPane128 = new javax.swing.JScrollPane();
        jTextFusionDZFNCIX = new javax.swing.JTextArea();
        jDZFIndiceDBPAX = new javax.swing.JTextField();
        jDZFIndiceDBX = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jDYFIndiceDBPAX = new javax.swing.JTextField();
        jDYFIndiceDBX = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jDYFIndiceCHX = new javax.swing.JTextField();
        jDXFIndiceDBPAX = new javax.swing.JTextField();
        jDXFIndiceDBX = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jDXFIndiceCHX = new javax.swing.JTextField();
        jDXFIndiceCHPAX = new javax.swing.JTextField();
        jDYFIndiceCHPAX = new javax.swing.JTextField();
        jDZFIndiceCHX = new javax.swing.JTextField();
        jDZFIndiceCHPAX = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jScrollPane179 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jScrollPane180 = new javax.swing.JScrollPane();
        jTextNCNIDXEM = new javax.swing.JTextArea();
        jLabel183 = new javax.swing.JLabel();
        jScrollPane181 = new javax.swing.JScrollPane();
        jTextNCNIDYEM = new javax.swing.JTextArea();
        jLabel184 = new javax.swing.JLabel();
        jScrollPane182 = new javax.swing.JScrollPane();
        jTextNCNIDZEM = new javax.swing.JTextArea();
        jScrollPane183 = new javax.swing.JScrollPane();
        jTextGCDZEM = new javax.swing.JTextArea();
        jScrollPane184 = new javax.swing.JScrollPane();
        jTextGCDYEM = new javax.swing.JTextArea();
        jScrollPane185 = new javax.swing.JScrollPane();
        jTextGCDXEM = new javax.swing.JTextArea();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jScrollPane186 = new javax.swing.JScrollPane();
        jTextALDXEM = new javax.swing.JTextArea();
        jScrollPane187 = new javax.swing.JScrollPane();
        jTextALDYEM = new javax.swing.JTextArea();
        jScrollPane188 = new javax.swing.JScrollPane();
        jTextALDZEM = new javax.swing.JTextArea();
        jScrollPane189 = new javax.swing.JScrollPane();
        jTextFusionDZEM = new javax.swing.JTextArea();
        jScrollPane190 = new javax.swing.JScrollPane();
        jTextFusionDYEM = new javax.swing.JTextArea();
        jScrollPane191 = new javax.swing.JScrollPane();
        jTextFusionDXEM = new javax.swing.JTextArea();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jScrollPane192 = new javax.swing.JScrollPane();
        jTextFusionDXFIEM = new javax.swing.JTextArea();
        jScrollPane193 = new javax.swing.JScrollPane();
        jTextFusionDYFIEM = new javax.swing.JTextArea();
        jScrollPane194 = new javax.swing.JScrollPane();
        jTextFusionDZFIEM = new javax.swing.JTextArea();
        jScrollPane195 = new javax.swing.JScrollPane();
        jTextFusionDZFEM = new javax.swing.JTextArea();
        jScrollPane196 = new javax.swing.JScrollPane();
        jTextFusionDYFEM = new javax.swing.JTextArea();
        jScrollPane197 = new javax.swing.JScrollPane();
        jTextFusionDXFEM = new javax.swing.JTextArea();
        jLabel189 = new javax.swing.JLabel();
        jScrollPane198 = new javax.swing.JScrollPane();
        jTextFusionDZFPPEM = new javax.swing.JTextArea();
        jScrollPane199 = new javax.swing.JScrollPane();
        jTextFusionDYFPPEM = new javax.swing.JTextArea();
        jScrollPane200 = new javax.swing.JScrollPane();
        jTextFusionDXFPPEM = new javax.swing.JTextArea();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jScrollPane201 = new javax.swing.JScrollPane();
        jTextFusionDXFNCIEM = new javax.swing.JTextArea();
        jScrollPane202 = new javax.swing.JScrollPane();
        jTextFusionDYFNCIEM = new javax.swing.JTextArea();
        jScrollPane203 = new javax.swing.JScrollPane();
        jTextFusionDZFNCIEM = new javax.swing.JTextArea();
        jDZFIndiceDBPAEM = new javax.swing.JTextField();
        jDZFIndiceDBEM = new javax.swing.JTextField();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jDYFIndiceDBPAEM = new javax.swing.JTextField();
        jDYFIndiceDBEM = new javax.swing.JTextField();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jDYFIndiceCHEM = new javax.swing.JTextField();
        jDXFIndiceDBPAEM = new javax.swing.JTextField();
        jDXFIndiceDBEM = new javax.swing.JTextField();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jDXFIndiceCHEM = new javax.swing.JTextField();
        jDXFIndiceCHPAEM = new javax.swing.JTextField();
        jDYFIndiceCHPAEM = new javax.swing.JTextField();
        jDZFIndiceCHEM = new javax.swing.JTextField();
        jDZFIndiceCHPAEM = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane51 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane52 = new javax.swing.JScrollPane();
        jTextNCNIOX = new javax.swing.JTextArea();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane53 = new javax.swing.JScrollPane();
        jTextNCNIOY = new javax.swing.JTextArea();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane54 = new javax.swing.JScrollPane();
        jTextNCNIOZ = new javax.swing.JTextArea();
        jScrollPane55 = new javax.swing.JScrollPane();
        jTextGCOZ = new javax.swing.JTextArea();
        jScrollPane56 = new javax.swing.JScrollPane();
        jTextGCOY = new javax.swing.JTextArea();
        jScrollPane57 = new javax.swing.JScrollPane();
        jTextGCOX = new javax.swing.JTextArea();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane58 = new javax.swing.JScrollPane();
        jTextALOX = new javax.swing.JTextArea();
        jScrollPane59 = new javax.swing.JScrollPane();
        jTextALOY = new javax.swing.JTextArea();
        jScrollPane60 = new javax.swing.JScrollPane();
        jTextALOZ = new javax.swing.JTextArea();
        jScrollPane61 = new javax.swing.JScrollPane();
        jTextFusionOZ = new javax.swing.JTextArea();
        jScrollPane62 = new javax.swing.JScrollPane();
        jTextFusionOY = new javax.swing.JTextArea();
        jScrollPane63 = new javax.swing.JScrollPane();
        jTextFusionOX = new javax.swing.JTextArea();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane64 = new javax.swing.JScrollPane();
        jTextFusionOXFI = new javax.swing.JTextArea();
        jScrollPane65 = new javax.swing.JScrollPane();
        jTextFusionOYFI = new javax.swing.JTextArea();
        jScrollPane66 = new javax.swing.JScrollPane();
        jTextFusionOZFI = new javax.swing.JTextArea();
        jScrollPane67 = new javax.swing.JScrollPane();
        jTextFusionOZF = new javax.swing.JTextArea();
        jScrollPane68 = new javax.swing.JScrollPane();
        jTextFusionOYF = new javax.swing.JTextArea();
        jScrollPane69 = new javax.swing.JScrollPane();
        jTextFusionOXF = new javax.swing.JTextArea();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane70 = new javax.swing.JScrollPane();
        jTextFusionOZFPP = new javax.swing.JTextArea();
        jScrollPane71 = new javax.swing.JScrollPane();
        jTextFusionOYFPP = new javax.swing.JTextArea();
        jScrollPane72 = new javax.swing.JScrollPane();
        jTextFusionOXFPP = new javax.swing.JTextArea();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane73 = new javax.swing.JScrollPane();
        jTextFusionOXFNCI = new javax.swing.JTextArea();
        jScrollPane74 = new javax.swing.JScrollPane();
        jTextFusionOYFNCI = new javax.swing.JTextArea();
        jScrollPane75 = new javax.swing.JScrollPane();
        jTextFusionOZFNCI = new javax.swing.JTextArea();
        jOZFIndiceDBPA = new javax.swing.JTextField();
        jOZFIndiceDB = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jOYFIndiceDBPA = new javax.swing.JTextField();
        jOYFIndiceDB = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jOYFIndiceCH = new javax.swing.JTextField();
        jOXFIndiceDBPA = new javax.swing.JTextField();
        jOXFIndiceDB = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jOXFIndiceCH = new javax.swing.JTextField();
        jOXFIndiceCHPA = new javax.swing.JTextField();
        jOYFIndiceCHPA = new javax.swing.JTextField();
        jOZFIndiceCH = new javax.swing.JTextField();
        jOZFIndiceCHPA = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jScrollPane129 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jScrollPane130 = new javax.swing.JScrollPane();
        jTextNCNIOXX = new javax.swing.JTextArea();
        jLabel133 = new javax.swing.JLabel();
        jScrollPane131 = new javax.swing.JScrollPane();
        jTextNCNIOYX = new javax.swing.JTextArea();
        jLabel134 = new javax.swing.JLabel();
        jScrollPane132 = new javax.swing.JScrollPane();
        jTextNCNIOZX = new javax.swing.JTextArea();
        jScrollPane133 = new javax.swing.JScrollPane();
        jTextGCOZX = new javax.swing.JTextArea();
        jScrollPane134 = new javax.swing.JScrollPane();
        jTextGCOYX = new javax.swing.JTextArea();
        jScrollPane135 = new javax.swing.JScrollPane();
        jTextGCOXX = new javax.swing.JTextArea();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jScrollPane136 = new javax.swing.JScrollPane();
        jTextALOXX = new javax.swing.JTextArea();
        jScrollPane137 = new javax.swing.JScrollPane();
        jTextALOYX = new javax.swing.JTextArea();
        jScrollPane138 = new javax.swing.JScrollPane();
        jTextALOZX = new javax.swing.JTextArea();
        jScrollPane139 = new javax.swing.JScrollPane();
        jTextFusionOZX = new javax.swing.JTextArea();
        jScrollPane140 = new javax.swing.JScrollPane();
        jTextFusionOYX = new javax.swing.JTextArea();
        jScrollPane141 = new javax.swing.JScrollPane();
        jTextFusionOXX = new javax.swing.JTextArea();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jScrollPane142 = new javax.swing.JScrollPane();
        jTextFusionOXFIX = new javax.swing.JTextArea();
        jScrollPane143 = new javax.swing.JScrollPane();
        jTextFusionOYFIX = new javax.swing.JTextArea();
        jScrollPane144 = new javax.swing.JScrollPane();
        jTextFusionOZFIX = new javax.swing.JTextArea();
        jScrollPane145 = new javax.swing.JScrollPane();
        jTextFusionOZFX = new javax.swing.JTextArea();
        jScrollPane146 = new javax.swing.JScrollPane();
        jTextFusionOYFX = new javax.swing.JTextArea();
        jScrollPane147 = new javax.swing.JScrollPane();
        jTextFusionOXFX = new javax.swing.JTextArea();
        jLabel139 = new javax.swing.JLabel();
        jScrollPane148 = new javax.swing.JScrollPane();
        jTextFusionOZFPPX = new javax.swing.JTextArea();
        jScrollPane149 = new javax.swing.JScrollPane();
        jTextFusionOYFPPX = new javax.swing.JTextArea();
        jScrollPane150 = new javax.swing.JScrollPane();
        jTextFusionOXFPPX = new javax.swing.JTextArea();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jScrollPane151 = new javax.swing.JScrollPane();
        jTextFusionOXFNCIX = new javax.swing.JTextArea();
        jScrollPane152 = new javax.swing.JScrollPane();
        jTextFusionOYFNCIX = new javax.swing.JTextArea();
        jScrollPane153 = new javax.swing.JScrollPane();
        jTextFusionOZFNCIX = new javax.swing.JTextArea();
        jOZFIndiceDBPAX = new javax.swing.JTextField();
        jOZFIndiceDBX = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jOYFIndiceDBPAX = new javax.swing.JTextField();
        jOYFIndiceDBX = new javax.swing.JTextField();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jOYFIndiceCHX = new javax.swing.JTextField();
        jOXFIndiceDBPAX = new javax.swing.JTextField();
        jOXFIndiceDBX = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jOXFIndiceCHX = new javax.swing.JTextField();
        jOXFIndiceCHPAX = new javax.swing.JTextField();
        jOYFIndiceCHPAX = new javax.swing.JTextField();
        jOZFIndiceCHX = new javax.swing.JTextField();
        jOZFIndiceCHPAX = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jScrollPane204 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jScrollPane205 = new javax.swing.JScrollPane();
        jTextNCNIOXEM = new javax.swing.JTextArea();
        jLabel208 = new javax.swing.JLabel();
        jScrollPane206 = new javax.swing.JScrollPane();
        jTextNCNIOYEM = new javax.swing.JTextArea();
        jLabel209 = new javax.swing.JLabel();
        jScrollPane207 = new javax.swing.JScrollPane();
        jTextNCNIOZEM = new javax.swing.JTextArea();
        jScrollPane208 = new javax.swing.JScrollPane();
        jTextGCOZEM = new javax.swing.JTextArea();
        jScrollPane209 = new javax.swing.JScrollPane();
        jTextGCOYEM = new javax.swing.JTextArea();
        jScrollPane210 = new javax.swing.JScrollPane();
        jTextGCOXEM = new javax.swing.JTextArea();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jScrollPane211 = new javax.swing.JScrollPane();
        jTextALOXEM = new javax.swing.JTextArea();
        jScrollPane212 = new javax.swing.JScrollPane();
        jTextALOYEM = new javax.swing.JTextArea();
        jScrollPane213 = new javax.swing.JScrollPane();
        jTextALOZEM = new javax.swing.JTextArea();
        jScrollPane214 = new javax.swing.JScrollPane();
        jTextFusionOZEM = new javax.swing.JTextArea();
        jScrollPane215 = new javax.swing.JScrollPane();
        jTextFusionOYEM = new javax.swing.JTextArea();
        jScrollPane216 = new javax.swing.JScrollPane();
        jTextFusionOXEM = new javax.swing.JTextArea();
        jLabel212 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        jScrollPane217 = new javax.swing.JScrollPane();
        jTextFusionOXFIEM = new javax.swing.JTextArea();
        jScrollPane218 = new javax.swing.JScrollPane();
        jTextFusionOYFIEM = new javax.swing.JTextArea();
        jScrollPane219 = new javax.swing.JScrollPane();
        jTextFusionOZFIEM = new javax.swing.JTextArea();
        jScrollPane220 = new javax.swing.JScrollPane();
        jTextFusionOZFEM = new javax.swing.JTextArea();
        jScrollPane221 = new javax.swing.JScrollPane();
        jTextFusionOYFEM = new javax.swing.JTextArea();
        jScrollPane222 = new javax.swing.JScrollPane();
        jTextFusionOXFEM = new javax.swing.JTextArea();
        jLabel214 = new javax.swing.JLabel();
        jScrollPane223 = new javax.swing.JScrollPane();
        jTextFusionOZFPPEM = new javax.swing.JTextArea();
        jScrollPane224 = new javax.swing.JScrollPane();
        jTextFusionOYFPPEM = new javax.swing.JTextArea();
        jScrollPane225 = new javax.swing.JScrollPane();
        jTextFusionOXFPPEM = new javax.swing.JTextArea();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jScrollPane226 = new javax.swing.JScrollPane();
        jTextFusionOXFNCIEM = new javax.swing.JTextArea();
        jScrollPane227 = new javax.swing.JScrollPane();
        jTextFusionOYFNCIEM = new javax.swing.JTextArea();
        jScrollPane228 = new javax.swing.JScrollPane();
        jTextFusionOZFNCIEM = new javax.swing.JTextArea();
        jOZFIndiceDBPAEM = new javax.swing.JTextField();
        jOZFIndiceDBEM = new javax.swing.JTextField();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jOYFIndiceDBPAEM = new javax.swing.JTextField();
        jOYFIndiceDBEM = new javax.swing.JTextField();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jOYFIndiceCHEM = new javax.swing.JTextField();
        jOXFIndiceDBPAEM = new javax.swing.JTextField();
        jOXFIndiceDBEM = new javax.swing.JTextField();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jOXFIndiceCHEM = new javax.swing.JTextField();
        jOXFIndiceCHPAEM = new javax.swing.JTextField();
        jOYFIndiceCHPAEM = new javax.swing.JTextField();
        jOZFIndiceCHEM = new javax.swing.JTextField();
        jOZFIndiceCHPAEM = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane112 = new javax.swing.JScrollPane();
        areaInstrumentosKMF = new javax.swing.JTextArea();
        jLabel76 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane113 = new javax.swing.JScrollPane();
        areaEscalasKMF = new javax.swing.JTextArea();
        jLabel77 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane114 = new javax.swing.JScrollPane();
        areaAcordesKMF = new javax.swing.JTextArea();
        jLabel78 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblEmocion = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Clases Tempo. Valores expresados en beats por minuto");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jTextGCTZ.setColumns(20);
        jTextGCTZ.setRows(5);
        jScrollPane1.setViewportView(jTextGCTZ);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 130, 100));

        jLabel2.setText("Cardinalidad");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        jLabel3.setText("Tempo en Z");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"60", "65", "70", "80", "95", "110", "120", "145", "180", "220"},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Adagio", "Adagieto", "Andante", "Andantino", "Moderato", "Allrgreto", "Allegro", "Vivace", "Presto", "Prestissimo"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 860, 40));

        jLabel4.setText("Referencia");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jLabel5.setText("Tempo en X");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jTextALTZ.setColumns(20);
        jTextALTZ.setRows(5);
        jScrollPane3.setViewportView(jTextALTZ);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 130, 100));

        jLabel6.setText("Tempo en Y");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jTextGCTY.setColumns(20);
        jTextGCTY.setRows(5);
        jScrollPane4.setViewportView(jTextGCTY);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 130, 110));

        jLabel7.setText("Instancias x Cluster");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jTextGCTX.setColumns(20);
        jTextGCTX.setRows(5);
        jScrollPane5.setViewportView(jTextGCTX);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 130, 110));

        jTextFusionTZ.setColumns(20);
        jTextFusionTZ.setRows(5);
        jScrollPane6.setViewportView(jTextFusionTZ);

        jPanel5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 170, 100));

        jTextALTY.setColumns(20);
        jTextALTY.setRows(5);
        jScrollPane7.setViewportView(jTextALTY);

        jPanel5.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 130, 110));

        jLabel8.setText("Asignaciones");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jTextALTX.setColumns(20);
        jTextALTX.setRows(5);
        jScrollPane8.setViewportView(jTextALTX);

        jPanel5.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 130, 110));

        jTextFusionTX.setColumns(20);
        jTextFusionTX.setRows(5);
        jScrollPane9.setViewportView(jTextFusionTX);

        jPanel5.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 170, 110));

        jTextFusionTY.setColumns(20);
        jTextFusionTY.setRows(5);
        jScrollPane10.setViewportView(jTextFusionTY);

        jPanel5.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 170, 110));

        jLabel9.setText("Fusiones entre cluster");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jTextFusionTXF.setColumns(20);
        jTextFusionTXF.setRows(5);
        jScrollPane11.setViewportView(jTextFusionTXF);

        jPanel5.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 160, 110));

        jTextFusionTYF.setColumns(20);
        jTextFusionTYF.setRows(5);
        jScrollPane12.setViewportView(jTextFusionTYF);

        jPanel5.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 160, 110));

        jTextFusionTZF.setColumns(20);
        jTextFusionTZF.setRows(5);
        jScrollPane13.setViewportView(jTextFusionTZF);

        jPanel5.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 160, 100));

        jTextFusionTZFI.setColumns(20);
        jTextFusionTZFI.setRows(5);
        jScrollPane14.setViewportView(jTextFusionTZFI);

        jPanel5.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 130, 100));

        jTextFusionTXFI.setColumns(20);
        jTextFusionTXFI.setRows(5);
        jScrollPane15.setViewportView(jTextFusionTXFI);

        jPanel5.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 130, 110));

        jTextFusionTYFI.setColumns(20);
        jTextFusionTYFI.setRows(5);
        jScrollPane16.setViewportView(jTextFusionTYFI);

        jPanel5.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 130, 110));

        jLabel11.setText("Prom Aritmetico Centroide");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, -1, -1));

        jTextFusionTZFPP.setColumns(20);
        jTextFusionTZFPP.setRows(5);
        jScrollPane17.setViewportView(jTextFusionTZFPP);

        jPanel5.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 420, 170, 100));

        jTextFusionTXFPP.setColumns(20);
        jTextFusionTXFPP.setRows(5);
        jScrollPane18.setViewportView(jTextFusionTXFPP);

        jPanel5.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 140, 170, 110));

        jTextFusionTYFPP.setColumns(20);
        jTextFusionTYFPP.setRows(5);
        jScrollPane19.setViewportView(jTextFusionTYFPP);

        jPanel5.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 280, 170, 110));

        jTextNCNITX.setColumns(20);
        jTextNCNITX.setRows(5);
        jScrollPane21.setViewportView(jTextNCNITX);

        jPanel5.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, 110));

        jLabel14.setText("Grupo de Cumulos");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jTextNCNITY.setColumns(20);
        jTextNCNITY.setRows(5);
        jScrollPane22.setViewportView(jTextNCNITY);

        jPanel5.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, 110));

        jTextNCNITZ.setColumns(20);
        jTextNCNITZ.setRows(5);
        jScrollPane23.setViewportView(jTextNCNITZ);

        jPanel5.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 140, 100));

        jTextFusionTXFNCI.setColumns(20);
        jTextFusionTXFNCI.setRows(5);
        jScrollPane24.setViewportView(jTextFusionTXFNCI);

        jPanel5.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 140, 150, 110));

        jLabel15.setText("Prom Ponderado Centroide");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, -1, -1));

        jTextFusionTZFNCI.setColumns(20);
        jTextFusionTZFNCI.setRows(5);
        jScrollPane25.setViewportView(jTextFusionTZFNCI);

        jPanel5.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 420, 150, 100));

        jTextFusionTYFNCI.setColumns(20);
        jTextFusionTYFNCI.setRows(5);
        jScrollPane26.setViewportView(jTextFusionTYFNCI);

        jPanel5.add(jScrollPane26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 280, 150, 110));

        jLabel16.setText("Índice HB PP");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 420, -1, -1));

        jLabel17.setText("Instancias Fusionadas");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 120, -1, -1));
        jPanel5.add(jTXFIndiceCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 160, 100, -1));

        jLabel18.setText("Índice DB PP");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 470, -1, -1));

        jLabel19.setText("Índice HB PP");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 280, -1, -1));
        jPanel5.add(jTYFIndiceCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 300, 100, -1));
        jPanel5.add(jTZFIndiceCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 440, 100, -1));

        jLabel20.setText("Índice HB PA");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 420, -1, -1));
        jPanel5.add(jTXFIndiceDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 210, 100, -1));

        jLabel21.setText("Índice DB PA");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 470, -1, -1));

        jLabel22.setText("Índice DB PP");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 340, -1, -1));
        jPanel5.add(jTYFIndiceDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 360, 100, -1));
        jPanel5.add(jTZFIndiceDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 490, 100, -1));

        jLabel23.setText("Índice HB PP");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 140, -1, -1));

        jLabel24.setText("Índice DB PP");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 190, -1, -1));
        jPanel5.add(jTXFIndiceCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 160, 100, -1));
        jPanel5.add(jTXFIndiceDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 210, 100, -1));
        jPanel5.add(jTYFIndiceCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 300, 100, -1));
        jPanel5.add(jTYFIndiceDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 360, 100, -1));

        jLabel25.setText("Índice HB PA");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 140, -1, -1));

        jLabel26.setText("Índice DB PA");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 190, -1, -1));
        jPanel5.add(jTZFIndiceCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 440, 100, -1));
        jPanel5.add(jTZFIndiceDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 490, 100, -1));

        jLabel27.setText("Índice HB PA");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 280, -1, -1));

        jLabel28.setText("Índice DB PA");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 340, -1, -1));

        jTabbedPane2.addTab("kMeans", jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 102, 0));

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setText("Clases Tempo. Valores expresados en beats por minuto");
        jPanel16.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jTextGCTZX.setColumns(20);
        jTextGCTZX.setRows(5);
        jScrollPane76.setViewportView(jTextGCTZX);

        jPanel16.add(jScrollPane76, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 130, 70));

        jLabel80.setText("Cardinalidad");
        jPanel16.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        jLabel81.setText("Tempo en Z");
        jPanel16.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"60", "65", "70", "80", "95", "110", "120", "145", "180", "220"},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Adagio", "Adagieto", "Andante", "Andantino", "Moderato", "Allrgreto", "Allegro", "Vivace", "Presto", "Prestissimo"
            }
        ));
        jScrollPane77.setViewportView(jTable4);

        jPanel16.add(jScrollPane77, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 860, 40));

        jLabel82.setText("Referencia");
        jPanel16.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jLabel83.setText("Tempo en X");
        jPanel16.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jTextALTZX.setColumns(20);
        jTextALTZX.setRows(5);
        jScrollPane78.setViewportView(jTextALTZX);

        jPanel16.add(jScrollPane78, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 130, 70));

        jLabel84.setText("Tempo en Y");
        jPanel16.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jTextGCTYX.setColumns(20);
        jTextGCTYX.setRows(5);
        jScrollPane79.setViewportView(jTextGCTYX);

        jPanel16.add(jScrollPane79, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 130, 110));

        jLabel85.setText("Instancias x Cluster");
        jPanel16.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jTextGCTXX.setColumns(20);
        jTextGCTXX.setRows(5);
        jScrollPane80.setViewportView(jTextGCTXX);

        jPanel16.add(jScrollPane80, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 130, 110));

        jTextFusionTZX.setColumns(20);
        jTextFusionTZX.setRows(5);
        jScrollPane81.setViewportView(jTextFusionTZX);

        jPanel16.add(jScrollPane81, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 170, 70));

        jTextALTYX.setColumns(20);
        jTextALTYX.setRows(5);
        jScrollPane82.setViewportView(jTextALTYX);

        jPanel16.add(jScrollPane82, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 130, 110));

        jLabel86.setText("Asignaciones");
        jPanel16.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jTextALTXX.setColumns(20);
        jTextALTXX.setRows(5);
        jScrollPane83.setViewportView(jTextALTXX);

        jPanel16.add(jScrollPane83, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 130, 110));

        jTextFusionTXX.setColumns(20);
        jTextFusionTXX.setRows(5);
        jScrollPane84.setViewportView(jTextFusionTXX);

        jPanel16.add(jScrollPane84, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 170, 110));

        jTextFusionTYX.setColumns(20);
        jTextFusionTYX.setRows(5);
        jScrollPane85.setViewportView(jTextFusionTYX);

        jPanel16.add(jScrollPane85, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 170, 110));

        jLabel87.setText("Fusiones entre cluster");
        jPanel16.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jTextFusionTXFX.setColumns(20);
        jTextFusionTXFX.setRows(5);
        jScrollPane86.setViewportView(jTextFusionTXFX);

        jPanel16.add(jScrollPane86, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 160, 110));

        jTextFusionTYFX.setColumns(20);
        jTextFusionTYFX.setRows(5);
        jScrollPane87.setViewportView(jTextFusionTYFX);

        jPanel16.add(jScrollPane87, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 160, 110));

        jTextFusionTZFX.setColumns(20);
        jTextFusionTZFX.setRows(5);
        jScrollPane88.setViewportView(jTextFusionTZFX);

        jPanel16.add(jScrollPane88, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 160, 70));

        jTextFusionTZFIX.setColumns(20);
        jTextFusionTZFIX.setRows(5);
        jScrollPane89.setViewportView(jTextFusionTZFIX);

        jPanel16.add(jScrollPane89, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 130, 70));

        jTextFusionTXFIX.setColumns(20);
        jTextFusionTXFIX.setRows(5);
        jScrollPane90.setViewportView(jTextFusionTXFIX);

        jPanel16.add(jScrollPane90, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 130, 110));

        jTextFusionTYFIX.setColumns(20);
        jTextFusionTYFIX.setRows(5);
        jScrollPane91.setViewportView(jTextFusionTYFIX);

        jPanel16.add(jScrollPane91, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 130, 110));

        jLabel88.setText("Prom Aritmetico Centroide");
        jPanel16.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, -1, -1));

        jTextFusionTZFPPX.setColumns(20);
        jTextFusionTZFPPX.setRows(5);
        jScrollPane92.setViewportView(jTextFusionTZFPPX);

        jPanel16.add(jScrollPane92, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 420, 170, 70));

        jTextFusionTXFPPX.setColumns(20);
        jTextFusionTXFPPX.setRows(5);
        jScrollPane93.setViewportView(jTextFusionTXFPPX);

        jPanel16.add(jScrollPane93, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 140, 170, 110));

        jTextFusionTYFPPX.setColumns(20);
        jTextFusionTYFPPX.setRows(5);
        jScrollPane94.setViewportView(jTextFusionTYFPPX);

        jPanel16.add(jScrollPane94, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 280, 170, 110));

        jTextNCNITXX.setColumns(20);
        jTextNCNITXX.setRows(5);
        jScrollPane95.setViewportView(jTextNCNITXX);

        jPanel16.add(jScrollPane95, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, 110));

        jLabel89.setText("Grupo de Cumulos");
        jPanel16.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jTextNCNITYX.setColumns(20);
        jTextNCNITYX.setRows(5);
        jScrollPane96.setViewportView(jTextNCNITYX);

        jPanel16.add(jScrollPane96, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, 110));

        jTextNCNITZX.setColumns(20);
        jTextNCNITZX.setRows(5);
        jScrollPane97.setViewportView(jTextNCNITZX);

        jPanel16.add(jScrollPane97, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 140, 70));

        jTextFusionTXFNCIX.setColumns(20);
        jTextFusionTXFNCIX.setRows(5);
        jScrollPane98.setViewportView(jTextFusionTXFNCIX);

        jPanel16.add(jScrollPane98, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 140, 150, 110));

        jLabel90.setText("Prom Ponderado Centroide");
        jPanel16.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, -1, -1));

        jTextFusionTZFNCIX.setColumns(20);
        jTextFusionTZFNCIX.setRows(5);
        jScrollPane99.setViewportView(jTextFusionTZFNCIX);

        jPanel16.add(jScrollPane99, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 420, 150, 70));

        jTextFusionTYFNCIX.setColumns(20);
        jTextFusionTYFNCIX.setRows(5);
        jScrollPane100.setViewportView(jTextFusionTYFNCIX);

        jPanel16.add(jScrollPane100, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 280, 150, 110));

        jLabel91.setText("Índice HB PP");
        jPanel16.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 410, -1, -1));

        jLabel92.setText("Instancias Fusionadas");
        jPanel16.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 120, -1, -1));
        jPanel16.add(jTXFIndiceCHX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 160, 100, -1));

        jLabel93.setText("Índice DB PP");
        jPanel16.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 450, -1, -1));

        jLabel94.setText("Índice HB PP");
        jPanel16.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 280, -1, -1));
        jPanel16.add(jTYFIndiceCHX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 300, 100, -1));
        jPanel16.add(jTZFIndiceCHX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 420, 100, -1));

        jLabel95.setText("Índice HB PA");
        jPanel16.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 410, -1, -1));
        jPanel16.add(jTXFIndiceDBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 210, 100, -1));

        jLabel96.setText("Índice DB PA");
        jPanel16.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 450, -1, -1));

        jLabel97.setText("Índice DB PP");
        jPanel16.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 340, -1, -1));
        jPanel16.add(jTYFIndiceDBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 360, 100, -1));
        jPanel16.add(jTZFIndiceDBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 470, 100, -1));

        jLabel98.setText("Índice HB PP");
        jPanel16.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 140, -1, -1));

        jLabel99.setText("Índice DB PP");
        jPanel16.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 190, -1, -1));
        jPanel16.add(jTXFIndiceCHPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 160, 100, -1));
        jPanel16.add(jTXFIndiceDBPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 210, 100, -1));
        jPanel16.add(jTYFIndiceCHPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 300, 100, -1));
        jPanel16.add(jTYFIndiceDBPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 360, 100, -1));

        jLabel100.setText("Índice HB PA");
        jPanel16.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 140, -1, -1));

        jLabel101.setText("Índice DB PA");
        jPanel16.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 190, -1, -1));
        jPanel16.add(jTZFIndiceCHPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 420, 100, -1));
        jPanel16.add(jTZFIndiceDBPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 470, 100, -1));

        jLabel102.setText("Índice HB PA");
        jPanel16.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 280, -1, -1));

        jLabel103.setText("Índice DB PA");
        jPanel16.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 340, -1, -1));

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1498, Short.MAX_VALUE)
            .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel6Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1498, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 524, Short.MAX_VALUE)
            .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel6Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 524, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("xMeans", jPanel6);

        jPanel24.setBackground(new java.awt.Color(204, 204, 204));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel154.setText("Clases Tempo. Valores expresados en beats por minuto");
        jPanel24.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jTextGCTZEM.setColumns(20);
        jTextGCTZEM.setRows(5);
        jScrollPane154.setViewportView(jTextGCTZEM);

        jPanel24.add(jScrollPane154, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 130, 70));

        jLabel155.setText("Cardinalidad");
        jPanel24.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        jLabel156.setText("Tempo en Z");
        jPanel24.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"60", "65", "70", "80", "95", "110", "120", "145", "180", "220"},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Adagio", "Adagieto", "Andante", "Andantino", "Moderato", "Allrgreto", "Allegro", "Vivace", "Presto", "Prestissimo"
            }
        ));
        jScrollPane155.setViewportView(jTable7);

        jPanel24.add(jScrollPane155, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 860, 40));

        jLabel157.setText("Referencia");
        jPanel24.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jLabel158.setText("Tempo en X");
        jPanel24.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jTextALTZEM.setColumns(20);
        jTextALTZEM.setRows(5);
        jScrollPane156.setViewportView(jTextALTZEM);

        jPanel24.add(jScrollPane156, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 130, 70));

        jLabel159.setText("Tempo en Y");
        jPanel24.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jTextGCTYEM.setColumns(20);
        jTextGCTYEM.setRows(5);
        jScrollPane157.setViewportView(jTextGCTYEM);

        jPanel24.add(jScrollPane157, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 130, 110));

        jLabel160.setText("Instancias x Cluster");
        jPanel24.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jTextGCTXEM.setColumns(20);
        jTextGCTXEM.setRows(5);
        jScrollPane158.setViewportView(jTextGCTXEM);

        jPanel24.add(jScrollPane158, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 130, 110));

        jTextFusionTZEM.setColumns(20);
        jTextFusionTZEM.setRows(5);
        jScrollPane159.setViewportView(jTextFusionTZEM);

        jPanel24.add(jScrollPane159, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 170, 70));

        jTextALTYEM.setColumns(20);
        jTextALTYEM.setRows(5);
        jScrollPane160.setViewportView(jTextALTYEM);

        jPanel24.add(jScrollPane160, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 130, 110));

        jLabel161.setText("Asignaciones");
        jPanel24.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jTextALTXEM.setColumns(20);
        jTextALTXEM.setRows(5);
        jScrollPane161.setViewportView(jTextALTXEM);

        jPanel24.add(jScrollPane161, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 130, 110));

        jTextFusionTXEM.setColumns(20);
        jTextFusionTXEM.setRows(5);
        jScrollPane162.setViewportView(jTextFusionTXEM);

        jPanel24.add(jScrollPane162, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 170, 110));

        jTextFusionTYEM.setColumns(20);
        jTextFusionTYEM.setRows(5);
        jScrollPane163.setViewportView(jTextFusionTYEM);

        jPanel24.add(jScrollPane163, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 170, 110));

        jLabel162.setText("Fusiones entre cluster");
        jPanel24.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jTextFusionTXFEM.setColumns(20);
        jTextFusionTXFEM.setRows(5);
        jScrollPane164.setViewportView(jTextFusionTXFEM);

        jPanel24.add(jScrollPane164, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 160, 110));

        jTextFusionTYFEM.setColumns(20);
        jTextFusionTYFEM.setRows(5);
        jScrollPane165.setViewportView(jTextFusionTYFEM);

        jPanel24.add(jScrollPane165, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 160, 110));

        jTextFusionTZFEM.setColumns(20);
        jTextFusionTZFEM.setRows(5);
        jScrollPane166.setViewportView(jTextFusionTZFEM);

        jPanel24.add(jScrollPane166, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 160, 70));

        jTextFusionTZFIEM.setColumns(20);
        jTextFusionTZFIEM.setRows(5);
        jScrollPane167.setViewportView(jTextFusionTZFIEM);

        jPanel24.add(jScrollPane167, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 130, 70));

        jTextFusionTXFIEM.setColumns(20);
        jTextFusionTXFIEM.setRows(5);
        jScrollPane168.setViewportView(jTextFusionTXFIEM);

        jPanel24.add(jScrollPane168, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 130, 110));

        jTextFusionTYFIEM.setColumns(20);
        jTextFusionTYFIEM.setRows(5);
        jScrollPane169.setViewportView(jTextFusionTYFIEM);

        jPanel24.add(jScrollPane169, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 130, 110));

        jLabel163.setText("Prom Aritmetico Centroide");
        jPanel24.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, -1, -1));

        jTextFusionTZFPPEM.setColumns(20);
        jTextFusionTZFPPEM.setRows(5);
        jScrollPane170.setViewportView(jTextFusionTZFPPEM);

        jPanel24.add(jScrollPane170, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 420, 170, 70));

        jTextFusionTXFPPEM.setColumns(20);
        jTextFusionTXFPPEM.setRows(5);
        jScrollPane171.setViewportView(jTextFusionTXFPPEM);

        jPanel24.add(jScrollPane171, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 140, 170, 110));

        jTextFusionTYFPPEM.setColumns(20);
        jTextFusionTYFPPEM.setRows(5);
        jScrollPane172.setViewportView(jTextFusionTYFPPEM);

        jPanel24.add(jScrollPane172, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 280, 170, 110));

        jTextNCNITXEM.setColumns(20);
        jTextNCNITXEM.setRows(5);
        jScrollPane173.setViewportView(jTextNCNITXEM);

        jPanel24.add(jScrollPane173, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, 110));

        jLabel164.setText("Grupo de Cumulos");
        jPanel24.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jTextNCNITYEM.setColumns(20);
        jTextNCNITYEM.setRows(5);
        jScrollPane174.setViewportView(jTextNCNITYEM);

        jPanel24.add(jScrollPane174, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, 110));

        jTextNCNITZEM.setColumns(20);
        jTextNCNITZEM.setRows(5);
        jScrollPane175.setViewportView(jTextNCNITZEM);

        jPanel24.add(jScrollPane175, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 140, 70));

        jTextFusionTXFNCIEM.setColumns(20);
        jTextFusionTXFNCIEM.setRows(5);
        jScrollPane176.setViewportView(jTextFusionTXFNCIEM);

        jPanel24.add(jScrollPane176, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 140, 150, 110));

        jLabel165.setText("Prom Ponderado Centroide");
        jPanel24.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, -1, -1));

        jTextFusionTZFNCIEM.setColumns(20);
        jTextFusionTZFNCIEM.setRows(5);
        jScrollPane177.setViewportView(jTextFusionTZFNCIEM);

        jPanel24.add(jScrollPane177, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 420, 150, 70));

        jTextFusionTYFNCIEM.setColumns(20);
        jTextFusionTYFNCIEM.setRows(5);
        jScrollPane178.setViewportView(jTextFusionTYFNCIEM);

        jPanel24.add(jScrollPane178, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 280, 150, 110));

        jLabel166.setText("Índice HB PP");
        jPanel24.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 410, -1, -1));

        jLabel167.setText("Instancias Fusionadas");
        jPanel24.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 120, -1, -1));
        jPanel24.add(jTXFIndiceCHEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 160, 100, -1));

        jLabel168.setText("Índice DB PP");
        jPanel24.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 450, -1, -1));

        jLabel169.setText("Índice HB PP");
        jPanel24.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 280, -1, -1));
        jPanel24.add(jTYFIndiceCHEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 300, 100, -1));
        jPanel24.add(jTZFIndiceCHEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 420, 100, -1));

        jLabel170.setText("Índice HB PA");
        jPanel24.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 410, -1, -1));
        jPanel24.add(jTXFIndiceDBEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 210, 100, -1));

        jLabel171.setText("Índice DB PA");
        jPanel24.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 450, -1, -1));

        jLabel172.setText("Índice DB PP");
        jPanel24.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 340, -1, -1));
        jPanel24.add(jTYFIndiceDBEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 360, 100, -1));
        jPanel24.add(jTZFIndiceDBEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 470, 100, -1));

        jLabel173.setText("Índice HB PP");
        jPanel24.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 140, -1, -1));

        jLabel174.setText("Índice DB PP");
        jPanel24.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 190, -1, -1));
        jPanel24.add(jTXFIndiceCHPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 160, 100, -1));
        jPanel24.add(jTXFIndiceDBPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 210, 100, -1));
        jPanel24.add(jTYFIndiceCHPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 300, 100, -1));
        jPanel24.add(jTYFIndiceDBPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 360, 100, -1));

        jLabel175.setText("Índice HB PA");
        jPanel24.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 140, -1, -1));

        jLabel176.setText("Índice DB PA");
        jPanel24.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 190, -1, -1));
        jPanel24.add(jTZFIndiceCHPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 420, 100, -1));
        jPanel24.add(jTZFIndiceDBPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 470, 100, -1));

        jLabel177.setText("Índice HB PA");
        jPanel24.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 280, -1, -1));

        jLabel178.setText("Índice DB PA");
        jPanel24.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 340, -1, -1));

        org.jdesktop.layout.GroupLayout jPanel23Layout = new org.jdesktop.layout.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1498, Short.MAX_VALUE)
            .add(jPanel23Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel23Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1498, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 524, Short.MAX_VALUE)
            .add(jPanel23Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel23Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 524, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("EM", jPanel23);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 570));

        jTabbedPane1.addTab("Tempos", jPanel1);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Referencia");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 6, -1, -1));

        jLabel13.setText("Clases Duración. Valores expresados en duración de Notas");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 28, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1/1", "1/2", "1/4", "1/8", "1/16"}
            },
            new String [] {
                "1", "0.5", "0.25", "0.125", "0.0625"
            }
        ));
        jScrollPane20.setViewportView(jTable2);

        jPanel7.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 50, 860, 40));

        jLabel10.setText("Duracion en X");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 96, -1, -1));

        jLabel29.setText("Instancias x Cluster");
        jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 116, -1, -1));

        jTextNCNIDX.setColumns(20);
        jTextNCNIDX.setRows(5);
        jScrollPane27.setViewportView(jTextNCNIDX);

        jPanel7.add(jScrollPane27, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 136, 140, 110));

        jLabel30.setText("Duracion en Y");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jTextNCNIDY.setColumns(20);
        jTextNCNIDY.setRows(5);
        jScrollPane28.setViewportView(jTextNCNIDY);

        jPanel7.add(jScrollPane28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, 110));

        jLabel31.setText("Duracion en Z");
        jPanel7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jTextNCNIDZ.setColumns(20);
        jTextNCNIDZ.setRows(5);
        jScrollPane29.setViewportView(jTextNCNIDZ);

        jPanel7.add(jScrollPane29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 140, 100));

        jTextGCDZ.setColumns(20);
        jTextGCDZ.setRows(5);
        jScrollPane30.setViewportView(jTextGCDZ);

        jPanel7.add(jScrollPane30, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 130, 100));

        jTextGCDY.setColumns(20);
        jTextGCDY.setRows(5);
        jScrollPane31.setViewportView(jTextGCDY);

        jPanel7.add(jScrollPane31, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 130, 110));

        jTextGCDX.setColumns(20);
        jTextGCDX.setRows(5);
        jScrollPane32.setViewportView(jTextGCDX);

        jPanel7.add(jScrollPane32, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 136, 130, 110));

        jLabel32.setText("Grupo de Cumulos");
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 116, -1, -1));

        jLabel33.setText("Asignaciones");
        jPanel7.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 116, -1, -1));

        jTextALDX.setColumns(20);
        jTextALDX.setRows(5);
        jScrollPane33.setViewportView(jTextALDX);

        jPanel7.add(jScrollPane33, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 136, 130, 110));

        jTextALDY.setColumns(20);
        jTextALDY.setRows(5);
        jScrollPane34.setViewportView(jTextALDY);

        jPanel7.add(jScrollPane34, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 130, 110));

        jTextALDZ.setColumns(20);
        jTextALDZ.setRows(5);
        jScrollPane35.setViewportView(jTextALDZ);

        jPanel7.add(jScrollPane35, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 130, 100));

        jTextFusionDZ.setColumns(20);
        jTextFusionDZ.setRows(5);
        jScrollPane36.setViewportView(jTextFusionDZ);

        jPanel7.add(jScrollPane36, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 170, 100));

        jTextFusionDY.setColumns(20);
        jTextFusionDY.setRows(5);
        jScrollPane37.setViewportView(jTextFusionDY);

        jPanel7.add(jScrollPane37, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 170, 110));

        jTextFusionDX.setColumns(20);
        jTextFusionDX.setRows(5);
        jScrollPane38.setViewportView(jTextFusionDX);

        jPanel7.add(jScrollPane38, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 136, 170, 110));

        jLabel34.setText("Fusiones entre cluster");
        jPanel7.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 116, -1, -1));

        jLabel35.setText("Cardinalidad");
        jPanel7.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 116, -1, -1));

        jTextFusionDXFI.setColumns(20);
        jTextFusionDXFI.setRows(5);
        jScrollPane39.setViewportView(jTextFusionDXFI);

        jPanel7.add(jScrollPane39, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 136, 130, 110));

        jTextFusionDYFI.setColumns(20);
        jTextFusionDYFI.setRows(5);
        jScrollPane40.setViewportView(jTextFusionDYFI);

        jPanel7.add(jScrollPane40, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 130, 110));

        jTextFusionDZFI.setColumns(20);
        jTextFusionDZFI.setRows(5);
        jScrollPane41.setViewportView(jTextFusionDZFI);

        jPanel7.add(jScrollPane41, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 130, 100));

        jTextFusionDZF.setColumns(20);
        jTextFusionDZF.setRows(5);
        jScrollPane42.setViewportView(jTextFusionDZF);

        jPanel7.add(jScrollPane42, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 160, 100));

        jTextFusionDYF.setColumns(20);
        jTextFusionDYF.setRows(5);
        jScrollPane43.setViewportView(jTextFusionDYF);

        jPanel7.add(jScrollPane43, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 160, 110));

        jTextFusionDXF.setColumns(20);
        jTextFusionDXF.setRows(5);
        jScrollPane44.setViewportView(jTextFusionDXF);

        jPanel7.add(jScrollPane44, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 136, 160, 110));

        jLabel36.setText("Prom Aritmetico Centroide");
        jPanel7.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 116, -1, -1));

        jTextFusionDZFPP.setColumns(20);
        jTextFusionDZFPP.setRows(5);
        jScrollPane45.setViewportView(jTextFusionDZFPP);

        jPanel7.add(jScrollPane45, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 400, 170, 100));

        jTextFusionDYFPP.setColumns(20);
        jTextFusionDYFPP.setRows(5);
        jScrollPane46.setViewportView(jTextFusionDYFPP);

        jPanel7.add(jScrollPane46, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, 170, 110));

        jTextFusionDXFPP.setColumns(20);
        jTextFusionDXFPP.setRows(5);
        jScrollPane47.setViewportView(jTextFusionDXFPP);

        jPanel7.add(jScrollPane47, new org.netbeans.lib.awtextra.AbsoluteConstraints(936, 136, 170, 110));

        jLabel37.setText("Prom Ponderado Centroide");
        jPanel7.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 116, -1, -1));

        jLabel38.setText("Instancias Fusionadas");
        jPanel7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1126, 116, -1, -1));

        jTextFusionDXFNCI.setColumns(20);
        jTextFusionDXFNCI.setRows(5);
        jScrollPane48.setViewportView(jTextFusionDXFNCI);

        jPanel7.add(jScrollPane48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1116, 136, 150, 110));

        jTextFusionDYFNCI.setColumns(20);
        jTextFusionDYFNCI.setRows(5);
        jScrollPane49.setViewportView(jTextFusionDYFNCI);

        jPanel7.add(jScrollPane49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 270, 150, 110));

        jTextFusionDZFNCI.setColumns(20);
        jTextFusionDZFNCI.setRows(5);
        jScrollPane50.setViewportView(jTextFusionDZFNCI);

        jPanel7.add(jScrollPane50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 400, 150, 100));
        jPanel7.add(jDZFIndiceDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 470, 100, -1));
        jPanel7.add(jDZFIndiceDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 470, 100, -1));

        jLabel39.setText("Índice DB PA");
        jPanel7.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 450, -1, -1));

        jLabel40.setText("Índice DB PP");
        jPanel7.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 450, -1, -1));

        jLabel41.setText("Índice HB PA");
        jPanel7.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 400, -1, -1));

        jLabel42.setText("Índice HB PP");
        jPanel7.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 400, -1, -1));
        jPanel7.add(jDYFIndiceDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 350, 100, -1));
        jPanel7.add(jDYFIndiceDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 350, 100, -1));

        jLabel43.setText("Índice DB PA");
        jPanel7.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 330, -1, -1));

        jLabel44.setText("Índice DB PP");
        jPanel7.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 330, -1, -1));

        jLabel45.setText("Índice HB PA");
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 270, -1, -1));

        jLabel46.setText("Índice HB PP");
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 270, -1, -1));
        jPanel7.add(jDYFIndiceCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 290, 100, -1));
        jPanel7.add(jDXFIndiceDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 220, 100, -1));
        jPanel7.add(jDXFIndiceDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 220, 100, -1));

        jLabel47.setText("Índice DB PA");
        jPanel7.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 200, -1, -1));

        jLabel48.setText("Índice DB PP");
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 200, -1, -1));

        jLabel49.setText("Índice HB PA");
        jPanel7.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 140, -1, -1));

        jLabel50.setText("Índice HB PP");
        jPanel7.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 140, -1, -1));
        jPanel7.add(jDXFIndiceCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 160, 100, -1));
        jPanel7.add(jDXFIndiceCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 160, 100, -1));
        jPanel7.add(jDYFIndiceCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 300, 100, -1));
        jPanel7.add(jDZFIndiceCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 420, 100, -1));
        jPanel7.add(jDZFIndiceCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 420, 100, -1));

        jTabbedPane3.addTab("kMeans", jPanel7);

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel104.setText("Referencia");
        jPanel17.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 6, -1, -1));

        jLabel105.setText("Clases Duración. Valores expresados en duración de Notas");
        jPanel17.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 28, -1, -1));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1/1", "1/2", "1/4", "1/8", "1/16"}
            },
            new String [] {
                "1", "0.5", "0.25", "0.125", "0.0625"
            }
        ));
        jScrollPane101.setViewportView(jTable5);

        jPanel17.add(jScrollPane101, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 50, 860, 40));

        jLabel106.setText("Duracion en X");
        jPanel17.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 96, -1, -1));

        jLabel107.setText("Instancias x Cluster");
        jPanel17.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 116, -1, -1));

        jTextNCNIDXX.setColumns(20);
        jTextNCNIDXX.setRows(5);
        jScrollPane102.setViewportView(jTextNCNIDXX);

        jPanel17.add(jScrollPane102, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 136, 140, 110));

        jLabel108.setText("Duracion en Y");
        jPanel17.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jTextNCNIDYX.setColumns(20);
        jTextNCNIDYX.setRows(5);
        jScrollPane103.setViewportView(jTextNCNIDYX);

        jPanel17.add(jScrollPane103, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, 110));

        jLabel109.setText("Duracion en Z");
        jPanel17.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jTextNCNIDZX.setColumns(20);
        jTextNCNIDZX.setRows(5);
        jScrollPane104.setViewportView(jTextNCNIDZX);

        jPanel17.add(jScrollPane104, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 140, 100));

        jTextGCDZX.setColumns(20);
        jTextGCDZX.setRows(5);
        jScrollPane105.setViewportView(jTextGCDZX);

        jPanel17.add(jScrollPane105, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 130, 100));

        jTextGCDYX.setColumns(20);
        jTextGCDYX.setRows(5);
        jScrollPane106.setViewportView(jTextGCDYX);

        jPanel17.add(jScrollPane106, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 130, 110));

        jTextGCDXX.setColumns(20);
        jTextGCDXX.setRows(5);
        jScrollPane107.setViewportView(jTextGCDXX);

        jPanel17.add(jScrollPane107, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 136, 130, 110));

        jLabel110.setText("Grupo de Cumulos");
        jPanel17.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 116, -1, -1));

        jLabel111.setText("Asignaciones");
        jPanel17.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 116, -1, -1));

        jTextALDXX.setColumns(20);
        jTextALDXX.setRows(5);
        jScrollPane108.setViewportView(jTextALDXX);

        jPanel17.add(jScrollPane108, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 136, 130, 110));

        jTextALDYX.setColumns(20);
        jTextALDYX.setRows(5);
        jScrollPane109.setViewportView(jTextALDYX);

        jPanel17.add(jScrollPane109, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 130, 110));

        jTextALDZX.setColumns(20);
        jTextALDZX.setRows(5);
        jScrollPane110.setViewportView(jTextALDZX);

        jPanel17.add(jScrollPane110, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 130, 100));

        jTextFusionDZX.setColumns(20);
        jTextFusionDZX.setRows(5);
        jScrollPane111.setViewportView(jTextFusionDZX);

        jPanel17.add(jScrollPane111, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 170, 100));

        jTextFusionDYX.setColumns(20);
        jTextFusionDYX.setRows(5);
        jScrollPane115.setViewportView(jTextFusionDYX);

        jPanel17.add(jScrollPane115, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 170, 110));

        jTextFusionDXX.setColumns(20);
        jTextFusionDXX.setRows(5);
        jScrollPane116.setViewportView(jTextFusionDXX);

        jPanel17.add(jScrollPane116, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 136, 170, 110));

        jLabel112.setText("Fusiones entre cluster");
        jPanel17.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 116, -1, -1));

        jLabel113.setText("Cardinalidad");
        jPanel17.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 116, -1, -1));

        jTextFusionDXFIX.setColumns(20);
        jTextFusionDXFIX.setRows(5);
        jScrollPane117.setViewportView(jTextFusionDXFIX);

        jPanel17.add(jScrollPane117, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 136, 130, 110));

        jTextFusionDYFIX.setColumns(20);
        jTextFusionDYFIX.setRows(5);
        jScrollPane118.setViewportView(jTextFusionDYFIX);

        jPanel17.add(jScrollPane118, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 130, 110));

        jTextFusionDZFIX.setColumns(20);
        jTextFusionDZFIX.setRows(5);
        jScrollPane119.setViewportView(jTextFusionDZFIX);

        jPanel17.add(jScrollPane119, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 130, 100));

        jTextFusionDZFX.setColumns(20);
        jTextFusionDZFX.setRows(5);
        jScrollPane120.setViewportView(jTextFusionDZFX);

        jPanel17.add(jScrollPane120, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 160, 100));

        jTextFusionDYFX.setColumns(20);
        jTextFusionDYFX.setRows(5);
        jScrollPane121.setViewportView(jTextFusionDYFX);

        jPanel17.add(jScrollPane121, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 160, 110));

        jTextFusionDXFX.setColumns(20);
        jTextFusionDXFX.setRows(5);
        jScrollPane122.setViewportView(jTextFusionDXFX);

        jPanel17.add(jScrollPane122, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 136, 160, 110));

        jLabel114.setText("Prom Aritmetico Centroide");
        jPanel17.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 116, -1, -1));

        jTextFusionDZFPPX.setColumns(20);
        jTextFusionDZFPPX.setRows(5);
        jScrollPane123.setViewportView(jTextFusionDZFPPX);

        jPanel17.add(jScrollPane123, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 400, 170, 100));

        jTextFusionDYFPPX.setColumns(20);
        jTextFusionDYFPPX.setRows(5);
        jScrollPane124.setViewportView(jTextFusionDYFPPX);

        jPanel17.add(jScrollPane124, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, 170, 110));

        jTextFusionDXFPPX.setColumns(20);
        jTextFusionDXFPPX.setRows(5);
        jScrollPane125.setViewportView(jTextFusionDXFPPX);

        jPanel17.add(jScrollPane125, new org.netbeans.lib.awtextra.AbsoluteConstraints(936, 136, 170, 110));

        jLabel115.setText("Prom Ponderado Centroide");
        jPanel17.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 116, -1, -1));

        jLabel116.setText("Instancias Fusionadas");
        jPanel17.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(1126, 116, -1, -1));

        jTextFusionDXFNCIX.setColumns(20);
        jTextFusionDXFNCIX.setRows(5);
        jScrollPane126.setViewportView(jTextFusionDXFNCIX);

        jPanel17.add(jScrollPane126, new org.netbeans.lib.awtextra.AbsoluteConstraints(1116, 136, 150, 110));

        jTextFusionDYFNCIX.setColumns(20);
        jTextFusionDYFNCIX.setRows(5);
        jScrollPane127.setViewportView(jTextFusionDYFNCIX);

        jPanel17.add(jScrollPane127, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 270, 150, 110));

        jTextFusionDZFNCIX.setColumns(20);
        jTextFusionDZFNCIX.setRows(5);
        jScrollPane128.setViewportView(jTextFusionDZFNCIX);

        jPanel17.add(jScrollPane128, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 400, 150, 100));
        jPanel17.add(jDZFIndiceDBPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 470, 100, -1));
        jPanel17.add(jDZFIndiceDBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 470, 100, -1));

        jLabel117.setText("Índice DB PA");
        jPanel17.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 450, -1, -1));

        jLabel118.setText("Índice DB PP");
        jPanel17.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 450, -1, -1));

        jLabel119.setText("Índice HB PA");
        jPanel17.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 400, -1, -1));

        jLabel120.setText("Índice HB PP");
        jPanel17.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 400, -1, -1));
        jPanel17.add(jDYFIndiceDBPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 350, 100, -1));
        jPanel17.add(jDYFIndiceDBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 350, 100, -1));

        jLabel121.setText("Índice DB PA");
        jPanel17.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 330, -1, -1));

        jLabel122.setText("Índice DB PP");
        jPanel17.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 330, -1, -1));

        jLabel123.setText("Índice HB PA");
        jPanel17.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 270, -1, -1));

        jLabel124.setText("Índice HB PP");
        jPanel17.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 270, -1, -1));
        jPanel17.add(jDYFIndiceCHX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 290, 100, -1));
        jPanel17.add(jDXFIndiceDBPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 220, 100, -1));
        jPanel17.add(jDXFIndiceDBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 220, 100, -1));

        jLabel125.setText("Índice DB PA");
        jPanel17.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 200, -1, -1));

        jLabel126.setText("Índice DB PP");
        jPanel17.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 200, -1, -1));

        jLabel127.setText("Índice HB PA");
        jPanel17.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 140, -1, -1));

        jLabel128.setText("Índice HB PP");
        jPanel17.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 140, -1, -1));
        jPanel17.add(jDXFIndiceCHX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 160, 100, -1));
        jPanel17.add(jDXFIndiceCHPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 160, 100, -1));
        jPanel17.add(jDYFIndiceCHPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 300, 100, -1));
        jPanel17.add(jDZFIndiceCHX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 420, 100, -1));
        jPanel17.add(jDZFIndiceCHPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 420, 100, -1));

        org.jdesktop.layout.GroupLayout jPanel8Layout = new org.jdesktop.layout.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel8Layout.createSequentialGroup()
                .add(19, 19, 19)
                .add(jPanel17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1498, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 587, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("xMeans", jPanel8);

        jPanel25.setBackground(new java.awt.Color(102, 102, 102));

        jPanel26.setBackground(new java.awt.Color(204, 204, 204));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel179.setText("Referencia");
        jPanel26.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 6, -1, -1));

        jLabel180.setText("Clases Duración. Valores expresados en duración de Notas");
        jPanel26.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 28, -1, -1));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1/1", "1/2", "1/4", "1/8", "1/16"}
            },
            new String [] {
                "1", "0.5", "0.25", "0.125", "0.0625"
            }
        ));
        jScrollPane179.setViewportView(jTable8);

        jPanel26.add(jScrollPane179, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 50, 860, 40));

        jLabel181.setText("Duracion en X");
        jPanel26.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 96, -1, -1));

        jLabel182.setText("Instancias x Cluster");
        jPanel26.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 116, -1, -1));

        jTextNCNIDXEM.setColumns(20);
        jTextNCNIDXEM.setRows(5);
        jScrollPane180.setViewportView(jTextNCNIDXEM);

        jPanel26.add(jScrollPane180, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 136, 140, 110));

        jLabel183.setText("Duracion en Y");
        jPanel26.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jTextNCNIDYEM.setColumns(20);
        jTextNCNIDYEM.setRows(5);
        jScrollPane181.setViewportView(jTextNCNIDYEM);

        jPanel26.add(jScrollPane181, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, 110));

        jLabel184.setText("Duracion en Z");
        jPanel26.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jTextNCNIDZEM.setColumns(20);
        jTextNCNIDZEM.setRows(5);
        jScrollPane182.setViewportView(jTextNCNIDZEM);

        jPanel26.add(jScrollPane182, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 140, 100));

        jTextGCDZEM.setColumns(20);
        jTextGCDZEM.setRows(5);
        jScrollPane183.setViewportView(jTextGCDZEM);

        jPanel26.add(jScrollPane183, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 130, 100));

        jTextGCDYEM.setColumns(20);
        jTextGCDYEM.setRows(5);
        jScrollPane184.setViewportView(jTextGCDYEM);

        jPanel26.add(jScrollPane184, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 130, 110));

        jTextGCDXEM.setColumns(20);
        jTextGCDXEM.setRows(5);
        jScrollPane185.setViewportView(jTextGCDXEM);

        jPanel26.add(jScrollPane185, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 136, 130, 110));

        jLabel185.setText("Grupo de Cumulos");
        jPanel26.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 116, -1, -1));

        jLabel186.setText("Asignaciones");
        jPanel26.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 116, -1, -1));

        jTextALDXEM.setColumns(20);
        jTextALDXEM.setRows(5);
        jScrollPane186.setViewportView(jTextALDXEM);

        jPanel26.add(jScrollPane186, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 136, 130, 110));

        jTextALDYEM.setColumns(20);
        jTextALDYEM.setRows(5);
        jScrollPane187.setViewportView(jTextALDYEM);

        jPanel26.add(jScrollPane187, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 130, 110));

        jTextALDZEM.setColumns(20);
        jTextALDZEM.setRows(5);
        jScrollPane188.setViewportView(jTextALDZEM);

        jPanel26.add(jScrollPane188, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 130, 100));

        jTextFusionDZEM.setColumns(20);
        jTextFusionDZEM.setRows(5);
        jScrollPane189.setViewportView(jTextFusionDZEM);

        jPanel26.add(jScrollPane189, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 170, 100));

        jTextFusionDYEM.setColumns(20);
        jTextFusionDYEM.setRows(5);
        jScrollPane190.setViewportView(jTextFusionDYEM);

        jPanel26.add(jScrollPane190, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 170, 110));

        jTextFusionDXEM.setColumns(20);
        jTextFusionDXEM.setRows(5);
        jScrollPane191.setViewportView(jTextFusionDXEM);

        jPanel26.add(jScrollPane191, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 136, 170, 110));

        jLabel187.setText("Fusiones entre cluster");
        jPanel26.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 116, -1, -1));

        jLabel188.setText("Cardinalidad");
        jPanel26.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 116, -1, -1));

        jTextFusionDXFIEM.setColumns(20);
        jTextFusionDXFIEM.setRows(5);
        jScrollPane192.setViewportView(jTextFusionDXFIEM);

        jPanel26.add(jScrollPane192, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 136, 130, 110));

        jTextFusionDYFIEM.setColumns(20);
        jTextFusionDYFIEM.setRows(5);
        jScrollPane193.setViewportView(jTextFusionDYFIEM);

        jPanel26.add(jScrollPane193, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 130, 110));

        jTextFusionDZFIEM.setColumns(20);
        jTextFusionDZFIEM.setRows(5);
        jScrollPane194.setViewportView(jTextFusionDZFIEM);

        jPanel26.add(jScrollPane194, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 130, 100));

        jTextFusionDZFEM.setColumns(20);
        jTextFusionDZFEM.setRows(5);
        jScrollPane195.setViewportView(jTextFusionDZFEM);

        jPanel26.add(jScrollPane195, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 160, 100));

        jTextFusionDYFEM.setColumns(20);
        jTextFusionDYFEM.setRows(5);
        jScrollPane196.setViewportView(jTextFusionDYFEM);

        jPanel26.add(jScrollPane196, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 160, 110));

        jTextFusionDXFEM.setColumns(20);
        jTextFusionDXFEM.setRows(5);
        jScrollPane197.setViewportView(jTextFusionDXFEM);

        jPanel26.add(jScrollPane197, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 136, 160, 110));

        jLabel189.setText("Prom Aritmetico Centroide");
        jPanel26.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 116, -1, -1));

        jTextFusionDZFPPEM.setColumns(20);
        jTextFusionDZFPPEM.setRows(5);
        jScrollPane198.setViewportView(jTextFusionDZFPPEM);

        jPanel26.add(jScrollPane198, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 400, 170, 100));

        jTextFusionDYFPPEM.setColumns(20);
        jTextFusionDYFPPEM.setRows(5);
        jScrollPane199.setViewportView(jTextFusionDYFPPEM);

        jPanel26.add(jScrollPane199, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, 170, 110));

        jTextFusionDXFPPEM.setColumns(20);
        jTextFusionDXFPPEM.setRows(5);
        jScrollPane200.setViewportView(jTextFusionDXFPPEM);

        jPanel26.add(jScrollPane200, new org.netbeans.lib.awtextra.AbsoluteConstraints(936, 136, 170, 110));

        jLabel190.setText("Prom Ponderado Centroide");
        jPanel26.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 116, -1, -1));

        jLabel191.setText("Instancias Fusionadas");
        jPanel26.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(1126, 116, -1, -1));

        jTextFusionDXFNCIEM.setColumns(20);
        jTextFusionDXFNCIEM.setRows(5);
        jScrollPane201.setViewportView(jTextFusionDXFNCIEM);

        jPanel26.add(jScrollPane201, new org.netbeans.lib.awtextra.AbsoluteConstraints(1116, 136, 150, 110));

        jTextFusionDYFNCIEM.setColumns(20);
        jTextFusionDYFNCIEM.setRows(5);
        jScrollPane202.setViewportView(jTextFusionDYFNCIEM);

        jPanel26.add(jScrollPane202, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 270, 150, 110));

        jTextFusionDZFNCIEM.setColumns(20);
        jTextFusionDZFNCIEM.setRows(5);
        jScrollPane203.setViewportView(jTextFusionDZFNCIEM);

        jPanel26.add(jScrollPane203, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 400, 150, 100));
        jPanel26.add(jDZFIndiceDBPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 470, 100, -1));
        jPanel26.add(jDZFIndiceDBEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 470, 100, -1));

        jLabel192.setText("Índice DB PA");
        jPanel26.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 450, -1, -1));

        jLabel193.setText("Índice DB PP");
        jPanel26.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 450, -1, -1));

        jLabel194.setText("Índice HB PA");
        jPanel26.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 400, -1, -1));

        jLabel195.setText("Índice HB PP");
        jPanel26.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 400, -1, -1));
        jPanel26.add(jDYFIndiceDBPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 350, 100, -1));
        jPanel26.add(jDYFIndiceDBEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 350, 100, -1));

        jLabel196.setText("Índice DB PA");
        jPanel26.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 330, -1, -1));

        jLabel197.setText("Índice DB PP");
        jPanel26.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 330, -1, -1));

        jLabel198.setText("Índice HB PA");
        jPanel26.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 270, -1, -1));

        jLabel199.setText("Índice HB PP");
        jPanel26.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 270, -1, -1));
        jPanel26.add(jDYFIndiceCHEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 290, 100, -1));
        jPanel26.add(jDXFIndiceDBPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 220, 100, -1));
        jPanel26.add(jDXFIndiceDBEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 220, 100, -1));

        jLabel200.setText("Índice DB PA");
        jPanel26.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 200, -1, -1));

        jLabel201.setText("Índice DB PP");
        jPanel26.add(jLabel201, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 200, -1, -1));

        jLabel202.setText("Índice HB PA");
        jPanel26.add(jLabel202, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 140, -1, -1));

        jLabel203.setText("Índice HB PP");
        jPanel26.add(jLabel203, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 140, -1, -1));
        jPanel26.add(jDXFIndiceCHEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 160, 100, -1));
        jPanel26.add(jDXFIndiceCHPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 160, 100, -1));
        jPanel26.add(jDYFIndiceCHPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 290, 100, -1));
        jPanel26.add(jDZFIndiceCHEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 420, 100, -1));
        jPanel26.add(jDZFIndiceCHPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 420, 100, -1));

        org.jdesktop.layout.GroupLayout jPanel25Layout = new org.jdesktop.layout.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel25Layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jPanel26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1498, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 587, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("EM", jPanel25);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPane3))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jTabbedPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Duracion", jPanel3);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setText("Referencia");
        jPanel9.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 6, -1, -1));

        jLabel52.setText("Clases Duración. Valores expresados en duración de Notas");
        jPanel9.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 28, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1/1", "1/2", "1/4", "1/8", "1/16"}
            },
            new String [] {
                "1", "0.5", "0.25", "0.125", "0.0625"
            }
        ));
        jScrollPane51.setViewportView(jTable3);

        jPanel9.add(jScrollPane51, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 50, 860, 40));

        jLabel53.setText("Octava en X");
        jPanel9.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 96, -1, -1));

        jLabel54.setText("Instancias x Cluster");
        jPanel9.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 116, -1, -1));

        jTextNCNIOX.setColumns(20);
        jTextNCNIOX.setRows(5);
        jScrollPane52.setViewportView(jTextNCNIOX);

        jPanel9.add(jScrollPane52, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 136, 140, 110));

        jLabel55.setText("Octava en Y");
        jPanel9.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jTextNCNIOY.setColumns(20);
        jTextNCNIOY.setRows(5);
        jScrollPane53.setViewportView(jTextNCNIOY);

        jPanel9.add(jScrollPane53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, 100));

        jLabel56.setText("Octava en Z");
        jPanel9.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jTextNCNIOZ.setColumns(20);
        jTextNCNIOZ.setRows(5);
        jScrollPane54.setViewportView(jTextNCNIOZ);

        jPanel9.add(jScrollPane54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 140, 100));

        jTextGCOZ.setColumns(20);
        jTextGCOZ.setRows(5);
        jScrollPane55.setViewportView(jTextGCOZ);

        jPanel9.add(jScrollPane55, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 130, 100));

        jTextGCOY.setColumns(20);
        jTextGCOY.setRows(5);
        jScrollPane56.setViewportView(jTextGCOY);

        jPanel9.add(jScrollPane56, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 130, 100));

        jTextGCOX.setColumns(20);
        jTextGCOX.setRows(5);
        jScrollPane57.setViewportView(jTextGCOX);

        jPanel9.add(jScrollPane57, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 136, 130, 110));

        jLabel57.setText("Grupo de Cumulos");
        jPanel9.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 116, -1, -1));

        jLabel58.setText("Asignaciones");
        jPanel9.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 116, -1, -1));

        jTextALOX.setColumns(20);
        jTextALOX.setRows(5);
        jScrollPane58.setViewportView(jTextALOX);

        jPanel9.add(jScrollPane58, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 136, 130, 110));

        jTextALOY.setColumns(20);
        jTextALOY.setRows(5);
        jScrollPane59.setViewportView(jTextALOY);

        jPanel9.add(jScrollPane59, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 130, 100));

        jTextALOZ.setColumns(20);
        jTextALOZ.setRows(5);
        jScrollPane60.setViewportView(jTextALOZ);

        jPanel9.add(jScrollPane60, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 130, 100));

        jTextFusionOZ.setColumns(20);
        jTextFusionOZ.setRows(5);
        jScrollPane61.setViewportView(jTextFusionOZ);

        jPanel9.add(jScrollPane61, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 170, 100));

        jTextFusionOY.setColumns(20);
        jTextFusionOY.setRows(5);
        jScrollPane62.setViewportView(jTextFusionOY);

        jPanel9.add(jScrollPane62, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 170, 100));

        jTextFusionOX.setColumns(20);
        jTextFusionOX.setRows(5);
        jScrollPane63.setViewportView(jTextFusionOX);

        jPanel9.add(jScrollPane63, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 136, 170, 110));

        jLabel59.setText("Fusiones entre cluster");
        jPanel9.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 116, -1, -1));

        jLabel60.setText("Cardinalidad");
        jPanel9.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 116, -1, -1));

        jTextFusionOXFI.setColumns(20);
        jTextFusionOXFI.setRows(5);
        jScrollPane64.setViewportView(jTextFusionOXFI);

        jPanel9.add(jScrollPane64, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 136, 130, 110));

        jTextFusionOYFI.setColumns(20);
        jTextFusionOYFI.setRows(5);
        jScrollPane65.setViewportView(jTextFusionOYFI);

        jPanel9.add(jScrollPane65, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 130, 100));

        jTextFusionOZFI.setColumns(20);
        jTextFusionOZFI.setRows(5);
        jScrollPane66.setViewportView(jTextFusionOZFI);

        jPanel9.add(jScrollPane66, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 130, 100));

        jTextFusionOZF.setColumns(20);
        jTextFusionOZF.setRows(5);
        jScrollPane67.setViewportView(jTextFusionOZF);

        jPanel9.add(jScrollPane67, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 160, 100));

        jTextFusionOYF.setColumns(20);
        jTextFusionOYF.setRows(5);
        jScrollPane68.setViewportView(jTextFusionOYF);

        jPanel9.add(jScrollPane68, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 160, 100));

        jTextFusionOXF.setColumns(20);
        jTextFusionOXF.setRows(5);
        jScrollPane69.setViewportView(jTextFusionOXF);

        jPanel9.add(jScrollPane69, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 136, 160, 110));

        jLabel61.setText("Prom Aritmetico Centroide");
        jPanel9.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 116, -1, -1));

        jTextFusionOZFPP.setColumns(20);
        jTextFusionOZFPP.setRows(5);
        jScrollPane70.setViewportView(jTextFusionOZFPP);

        jPanel9.add(jScrollPane70, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 390, 170, 100));

        jTextFusionOYFPP.setColumns(20);
        jTextFusionOYFPP.setRows(5);
        jScrollPane71.setViewportView(jTextFusionOYFPP);

        jPanel9.add(jScrollPane71, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, 170, 100));

        jTextFusionOXFPP.setColumns(20);
        jTextFusionOXFPP.setRows(5);
        jScrollPane72.setViewportView(jTextFusionOXFPP);

        jPanel9.add(jScrollPane72, new org.netbeans.lib.awtextra.AbsoluteConstraints(936, 136, 170, 110));

        jLabel62.setText("Prom Ponderado Centroide");
        jPanel9.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 116, -1, -1));

        jLabel63.setText("Instancias Fusionadas");
        jPanel9.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(1126, 116, -1, -1));

        jTextFusionOXFNCI.setColumns(20);
        jTextFusionOXFNCI.setRows(5);
        jScrollPane73.setViewportView(jTextFusionOXFNCI);

        jPanel9.add(jScrollPane73, new org.netbeans.lib.awtextra.AbsoluteConstraints(1116, 136, 150, 110));

        jTextFusionOYFNCI.setColumns(20);
        jTextFusionOYFNCI.setRows(5);
        jScrollPane74.setViewportView(jTextFusionOYFNCI);

        jPanel9.add(jScrollPane74, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 270, 150, 100));

        jTextFusionOZFNCI.setColumns(20);
        jTextFusionOZFNCI.setRows(5);
        jScrollPane75.setViewportView(jTextFusionOZFNCI);

        jPanel9.add(jScrollPane75, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 390, 150, 100));
        jPanel9.add(jOZFIndiceDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 460, 100, -1));
        jPanel9.add(jOZFIndiceDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 460, 100, -1));

        jLabel64.setText("Índice DB PA");
        jPanel9.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 440, -1, -1));

        jLabel65.setText("Índice DB PP");
        jPanel9.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 440, -1, -1));

        jLabel66.setText("Índice HB PA");
        jPanel9.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 390, -1, -1));

        jLabel67.setText("Índice HB PP");
        jPanel9.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 390, -1, -1));
        jPanel9.add(jOYFIndiceDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 350, 100, -1));
        jPanel9.add(jOYFIndiceDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 350, 100, -1));

        jLabel68.setText("Índice DB PA");
        jPanel9.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 330, -1, -1));

        jLabel69.setText("Índice DB PP");
        jPanel9.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 330, -1, -1));

        jLabel70.setText("Índice HB PA");
        jPanel9.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 270, -1, -1));

        jLabel71.setText("Índice HB PP");
        jPanel9.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 270, -1, -1));
        jPanel9.add(jOYFIndiceCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 290, 100, -1));
        jPanel9.add(jOXFIndiceDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 220, 100, -1));
        jPanel9.add(jOXFIndiceDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 220, 100, -1));

        jLabel72.setText("Índice DB PA");
        jPanel9.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 200, -1, -1));

        jLabel73.setText("Índice DB PP");
        jPanel9.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 200, -1, -1));

        jLabel74.setText("Índice HB PA");
        jPanel9.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 140, -1, -1));

        jLabel75.setText("Índice HB PP");
        jPanel9.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 140, -1, -1));
        jPanel9.add(jOXFIndiceCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 160, 100, -1));
        jPanel9.add(jOXFIndiceCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 160, 100, -1));
        jPanel9.add(jOYFIndiceCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 290, 100, -1));
        jPanel9.add(jOZFIndiceCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 410, 100, -1));
        jPanel9.add(jOZFIndiceCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 410, 100, -1));

        jTabbedPane4.addTab("kMeans", jPanel9);

        jPanel10.setBackground(new java.awt.Color(51, 153, 255));

        jPanel22.setBackground(new java.awt.Color(204, 204, 204));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel129.setText("Referencia");
        jPanel22.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 6, -1, -1));

        jLabel130.setText("Clases Duración. Valores expresados en duración de Notas");
        jPanel22.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 28, -1, -1));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1/1", "1/2", "1/4", "1/8", "1/16"}
            },
            new String [] {
                "1", "0.5", "0.25", "0.125", "0.0625"
            }
        ));
        jScrollPane129.setViewportView(jTable6);

        jPanel22.add(jScrollPane129, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 50, 860, 40));

        jLabel131.setText("Octava en X");
        jPanel22.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 96, -1, -1));

        jLabel132.setText("Instancias x Cluster");
        jPanel22.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 116, -1, -1));

        jTextNCNIOXX.setColumns(20);
        jTextNCNIOXX.setRows(5);
        jScrollPane130.setViewportView(jTextNCNIOXX);

        jPanel22.add(jScrollPane130, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 136, 140, 110));

        jLabel133.setText("Octava en Y");
        jPanel22.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jTextNCNIOYX.setColumns(20);
        jTextNCNIOYX.setRows(5);
        jScrollPane131.setViewportView(jTextNCNIOYX);

        jPanel22.add(jScrollPane131, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, 100));

        jLabel134.setText("Octava en Z");
        jPanel22.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jTextNCNIOZX.setColumns(20);
        jTextNCNIOZX.setRows(5);
        jScrollPane132.setViewportView(jTextNCNIOZX);

        jPanel22.add(jScrollPane132, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 140, 100));

        jTextGCOZX.setColumns(20);
        jTextGCOZX.setRows(5);
        jScrollPane133.setViewportView(jTextGCOZX);

        jPanel22.add(jScrollPane133, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 130, 100));

        jTextGCOYX.setColumns(20);
        jTextGCOYX.setRows(5);
        jScrollPane134.setViewportView(jTextGCOYX);

        jPanel22.add(jScrollPane134, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 130, 100));

        jTextGCOXX.setColumns(20);
        jTextGCOXX.setRows(5);
        jScrollPane135.setViewportView(jTextGCOXX);

        jPanel22.add(jScrollPane135, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 136, 130, 110));

        jLabel135.setText("Grupo de Cumulos");
        jPanel22.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 116, -1, -1));

        jLabel136.setText("Asignaciones");
        jPanel22.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 116, -1, -1));

        jTextALOXX.setColumns(20);
        jTextALOXX.setRows(5);
        jScrollPane136.setViewportView(jTextALOXX);

        jPanel22.add(jScrollPane136, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 136, 130, 110));

        jTextALOYX.setColumns(20);
        jTextALOYX.setRows(5);
        jScrollPane137.setViewportView(jTextALOYX);

        jPanel22.add(jScrollPane137, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 130, 100));

        jTextALOZX.setColumns(20);
        jTextALOZX.setRows(5);
        jScrollPane138.setViewportView(jTextALOZX);

        jPanel22.add(jScrollPane138, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 130, 100));

        jTextFusionOZX.setColumns(20);
        jTextFusionOZX.setRows(5);
        jScrollPane139.setViewportView(jTextFusionOZX);

        jPanel22.add(jScrollPane139, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 170, 100));

        jTextFusionOYX.setColumns(20);
        jTextFusionOYX.setRows(5);
        jScrollPane140.setViewportView(jTextFusionOYX);

        jPanel22.add(jScrollPane140, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 170, 100));

        jTextFusionOXX.setColumns(20);
        jTextFusionOXX.setRows(5);
        jScrollPane141.setViewportView(jTextFusionOXX);

        jPanel22.add(jScrollPane141, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 136, 170, 110));

        jLabel137.setText("Fusiones entre cluster");
        jPanel22.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 116, -1, -1));

        jLabel138.setText("Cardinalidad");
        jPanel22.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 116, -1, -1));

        jTextFusionOXFIX.setColumns(20);
        jTextFusionOXFIX.setRows(5);
        jScrollPane142.setViewportView(jTextFusionOXFIX);

        jPanel22.add(jScrollPane142, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 136, 130, 110));

        jTextFusionOYFIX.setColumns(20);
        jTextFusionOYFIX.setRows(5);
        jScrollPane143.setViewportView(jTextFusionOYFIX);

        jPanel22.add(jScrollPane143, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 130, 100));

        jTextFusionOZFIX.setColumns(20);
        jTextFusionOZFIX.setRows(5);
        jScrollPane144.setViewportView(jTextFusionOZFIX);

        jPanel22.add(jScrollPane144, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 130, 100));

        jTextFusionOZFX.setColumns(20);
        jTextFusionOZFX.setRows(5);
        jScrollPane145.setViewportView(jTextFusionOZFX);

        jPanel22.add(jScrollPane145, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 160, 100));

        jTextFusionOYFX.setColumns(20);
        jTextFusionOYFX.setRows(5);
        jScrollPane146.setViewportView(jTextFusionOYFX);

        jPanel22.add(jScrollPane146, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 160, 100));

        jTextFusionOXFX.setColumns(20);
        jTextFusionOXFX.setRows(5);
        jScrollPane147.setViewportView(jTextFusionOXFX);

        jPanel22.add(jScrollPane147, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 136, 160, 110));

        jLabel139.setText("Prom Aritmetico Centroide");
        jPanel22.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 116, -1, -1));

        jTextFusionOZFPPX.setColumns(20);
        jTextFusionOZFPPX.setRows(5);
        jScrollPane148.setViewportView(jTextFusionOZFPPX);

        jPanel22.add(jScrollPane148, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 390, 170, 100));

        jTextFusionOYFPPX.setColumns(20);
        jTextFusionOYFPPX.setRows(5);
        jScrollPane149.setViewportView(jTextFusionOYFPPX);

        jPanel22.add(jScrollPane149, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, 170, 100));

        jTextFusionOXFPPX.setColumns(20);
        jTextFusionOXFPPX.setRows(5);
        jScrollPane150.setViewportView(jTextFusionOXFPPX);

        jPanel22.add(jScrollPane150, new org.netbeans.lib.awtextra.AbsoluteConstraints(936, 136, 170, 110));

        jLabel140.setText("Prom Ponderado Centroide");
        jPanel22.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 116, -1, -1));

        jLabel141.setText("Instancias Fusionadas");
        jPanel22.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(1126, 116, -1, -1));

        jTextFusionOXFNCIX.setColumns(20);
        jTextFusionOXFNCIX.setRows(5);
        jScrollPane151.setViewportView(jTextFusionOXFNCIX);

        jPanel22.add(jScrollPane151, new org.netbeans.lib.awtextra.AbsoluteConstraints(1116, 136, 150, 110));

        jTextFusionOYFNCIX.setColumns(20);
        jTextFusionOYFNCIX.setRows(5);
        jScrollPane152.setViewportView(jTextFusionOYFNCIX);

        jPanel22.add(jScrollPane152, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 270, 150, 100));

        jTextFusionOZFNCIX.setColumns(20);
        jTextFusionOZFNCIX.setRows(5);
        jScrollPane153.setViewportView(jTextFusionOZFNCIX);

        jPanel22.add(jScrollPane153, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 390, 150, 100));
        jPanel22.add(jOZFIndiceDBPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 460, 100, -1));
        jPanel22.add(jOZFIndiceDBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 460, 100, -1));

        jLabel142.setText("Índice DB PA");
        jPanel22.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 440, -1, -1));

        jLabel143.setText("Índice DB PP");
        jPanel22.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 440, -1, -1));

        jLabel144.setText("Índice HB PA");
        jPanel22.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 390, -1, -1));

        jLabel145.setText("Índice HB PP");
        jPanel22.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 390, -1, -1));
        jPanel22.add(jOYFIndiceDBPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 340, 100, -1));
        jPanel22.add(jOYFIndiceDBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 340, 100, -1));

        jLabel146.setText("Índice DB PA");
        jPanel22.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 320, -1, -1));

        jLabel147.setText("Índice DB PP");
        jPanel22.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 320, -1, -1));

        jLabel148.setText("Índice HB PA");
        jPanel22.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 270, -1, -1));

        jLabel149.setText("Índice HB PP");
        jPanel22.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 270, -1, -1));
        jPanel22.add(jOYFIndiceCHX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 290, 100, -1));
        jPanel22.add(jOXFIndiceDBPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 210, 100, -1));
        jPanel22.add(jOXFIndiceDBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 210, 100, -1));

        jLabel150.setText("Índice DB PA");
        jPanel22.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 190, -1, -1));

        jLabel151.setText("Índice DB PP");
        jPanel22.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 190, -1, -1));

        jLabel152.setText("Índice HB PA");
        jPanel22.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 140, -1, -1));

        jLabel153.setText("Índice HB PP");
        jPanel22.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 140, -1, -1));
        jPanel22.add(jOXFIndiceCHX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 160, 100, -1));
        jPanel22.add(jOXFIndiceCHPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 160, 100, -1));
        jPanel22.add(jOYFIndiceCHPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 290, 100, -1));
        jPanel22.add(jOZFIndiceCHX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 410, 100, -1));
        jPanel22.add(jOZFIndiceCHPAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 410, 100, -1));

        org.jdesktop.layout.GroupLayout jPanel10Layout = new org.jdesktop.layout.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1577, Short.MAX_VALUE)
            .add(jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel10Layout.createSequentialGroup()
                    .add(0, 39, Short.MAX_VALUE)
                    .add(jPanel22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1498, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 40, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 587, Short.MAX_VALUE)
            .add(jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel10Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 587, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("xMeans", jPanel10);

        jPanel28.setBackground(new java.awt.Color(204, 204, 204));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel204.setText("Referencia");
        jPanel28.add(jLabel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 6, -1, -1));

        jLabel205.setText("Clases Duración. Valores expresados en duración de Notas");
        jPanel28.add(jLabel205, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 28, -1, -1));

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1/1", "1/2", "1/4", "1/8", "1/16"}
            },
            new String [] {
                "1", "0.5", "0.25", "0.125", "0.0625"
            }
        ));
        jScrollPane204.setViewportView(jTable9);

        jPanel28.add(jScrollPane204, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 50, 860, 40));

        jLabel206.setText("Octava en X");
        jPanel28.add(jLabel206, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 96, -1, -1));

        jLabel207.setText("Instancias x Cluster");
        jPanel28.add(jLabel207, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 116, -1, -1));

        jTextNCNIOXEM.setColumns(20);
        jTextNCNIOXEM.setRows(5);
        jScrollPane205.setViewportView(jTextNCNIOXEM);

        jPanel28.add(jScrollPane205, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 136, 140, 110));

        jLabel208.setText("Octava en Y");
        jPanel28.add(jLabel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jTextNCNIOYEM.setColumns(20);
        jTextNCNIOYEM.setRows(5);
        jScrollPane206.setViewportView(jTextNCNIOYEM);

        jPanel28.add(jScrollPane206, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, 100));

        jLabel209.setText("Octava en Z");
        jPanel28.add(jLabel209, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jTextNCNIOZEM.setColumns(20);
        jTextNCNIOZEM.setRows(5);
        jScrollPane207.setViewportView(jTextNCNIOZEM);

        jPanel28.add(jScrollPane207, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 140, 100));

        jTextGCOZEM.setColumns(20);
        jTextGCOZEM.setRows(5);
        jScrollPane208.setViewportView(jTextGCOZEM);

        jPanel28.add(jScrollPane208, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 130, 100));

        jTextGCOYEM.setColumns(20);
        jTextGCOYEM.setRows(5);
        jScrollPane209.setViewportView(jTextGCOYEM);

        jPanel28.add(jScrollPane209, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 130, 100));

        jTextGCOXEM.setColumns(20);
        jTextGCOXEM.setRows(5);
        jScrollPane210.setViewportView(jTextGCOXEM);

        jPanel28.add(jScrollPane210, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 136, 130, 110));

        jLabel210.setText("Grupo de Cumulos");
        jPanel28.add(jLabel210, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 116, -1, -1));

        jLabel211.setText("Asignaciones");
        jPanel28.add(jLabel211, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 116, -1, -1));

        jTextALOXEM.setColumns(20);
        jTextALOXEM.setRows(5);
        jScrollPane211.setViewportView(jTextALOXEM);

        jPanel28.add(jScrollPane211, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 136, 130, 110));

        jTextALOYEM.setColumns(20);
        jTextALOYEM.setRows(5);
        jScrollPane212.setViewportView(jTextALOYEM);

        jPanel28.add(jScrollPane212, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 130, 100));

        jTextALOZEM.setColumns(20);
        jTextALOZEM.setRows(5);
        jScrollPane213.setViewportView(jTextALOZEM);

        jPanel28.add(jScrollPane213, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 130, 100));

        jTextFusionOZEM.setColumns(20);
        jTextFusionOZEM.setRows(5);
        jScrollPane214.setViewportView(jTextFusionOZEM);

        jPanel28.add(jScrollPane214, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 170, 100));

        jTextFusionOYEM.setColumns(20);
        jTextFusionOYEM.setRows(5);
        jScrollPane215.setViewportView(jTextFusionOYEM);

        jPanel28.add(jScrollPane215, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 170, 100));

        jTextFusionOXEM.setColumns(20);
        jTextFusionOXEM.setRows(5);
        jScrollPane216.setViewportView(jTextFusionOXEM);

        jPanel28.add(jScrollPane216, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 136, 170, 110));

        jLabel212.setText("Fusiones entre cluster");
        jPanel28.add(jLabel212, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 116, -1, -1));

        jLabel213.setText("Cardinalidad");
        jPanel28.add(jLabel213, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 116, -1, -1));

        jTextFusionOXFIEM.setColumns(20);
        jTextFusionOXFIEM.setRows(5);
        jScrollPane217.setViewportView(jTextFusionOXFIEM);

        jPanel28.add(jScrollPane217, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 136, 130, 110));

        jTextFusionOYFIEM.setColumns(20);
        jTextFusionOYFIEM.setRows(5);
        jScrollPane218.setViewportView(jTextFusionOYFIEM);

        jPanel28.add(jScrollPane218, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 130, 100));

        jTextFusionOZFIEM.setColumns(20);
        jTextFusionOZFIEM.setRows(5);
        jScrollPane219.setViewportView(jTextFusionOZFIEM);

        jPanel28.add(jScrollPane219, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 130, 100));

        jTextFusionOZFEM.setColumns(20);
        jTextFusionOZFEM.setRows(5);
        jScrollPane220.setViewportView(jTextFusionOZFEM);

        jPanel28.add(jScrollPane220, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 160, 100));

        jTextFusionOYFEM.setColumns(20);
        jTextFusionOYFEM.setRows(5);
        jScrollPane221.setViewportView(jTextFusionOYFEM);

        jPanel28.add(jScrollPane221, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 160, 100));

        jTextFusionOXFEM.setColumns(20);
        jTextFusionOXFEM.setRows(5);
        jScrollPane222.setViewportView(jTextFusionOXFEM);

        jPanel28.add(jScrollPane222, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 136, 160, 110));

        jLabel214.setText("Prom Aritmetico Centroide");
        jPanel28.add(jLabel214, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 116, -1, -1));

        jTextFusionOZFPPEM.setColumns(20);
        jTextFusionOZFPPEM.setRows(5);
        jScrollPane223.setViewportView(jTextFusionOZFPPEM);

        jPanel28.add(jScrollPane223, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 390, 170, 100));

        jTextFusionOYFPPEM.setColumns(20);
        jTextFusionOYFPPEM.setRows(5);
        jScrollPane224.setViewportView(jTextFusionOYFPPEM);

        jPanel28.add(jScrollPane224, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, 170, 100));

        jTextFusionOXFPPEM.setColumns(20);
        jTextFusionOXFPPEM.setRows(5);
        jScrollPane225.setViewportView(jTextFusionOXFPPEM);

        jPanel28.add(jScrollPane225, new org.netbeans.lib.awtextra.AbsoluteConstraints(936, 136, 170, 110));

        jLabel215.setText("Prom Ponderado Centroide");
        jPanel28.add(jLabel215, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 116, -1, -1));

        jLabel216.setText("Instancias Fusionadas");
        jPanel28.add(jLabel216, new org.netbeans.lib.awtextra.AbsoluteConstraints(1126, 116, -1, -1));

        jTextFusionOXFNCIEM.setColumns(20);
        jTextFusionOXFNCIEM.setRows(5);
        jScrollPane226.setViewportView(jTextFusionOXFNCIEM);

        jPanel28.add(jScrollPane226, new org.netbeans.lib.awtextra.AbsoluteConstraints(1116, 136, 150, 110));

        jTextFusionOYFNCIEM.setColumns(20);
        jTextFusionOYFNCIEM.setRows(5);
        jScrollPane227.setViewportView(jTextFusionOYFNCIEM);

        jPanel28.add(jScrollPane227, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 270, 150, 100));

        jTextFusionOZFNCIEM.setColumns(20);
        jTextFusionOZFNCIEM.setRows(5);
        jScrollPane228.setViewportView(jTextFusionOZFNCIEM);

        jPanel28.add(jScrollPane228, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 390, 150, 100));
        jPanel28.add(jOZFIndiceDBPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 460, 100, -1));
        jPanel28.add(jOZFIndiceDBEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 460, 100, -1));

        jLabel217.setText("Índice DB PA");
        jPanel28.add(jLabel217, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 440, -1, -1));

        jLabel218.setText("Índice DB PP");
        jPanel28.add(jLabel218, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 440, -1, -1));

        jLabel219.setText("Índice HB PA");
        jPanel28.add(jLabel219, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 390, -1, -1));

        jLabel220.setText("Índice HB PP");
        jPanel28.add(jLabel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 390, -1, -1));
        jPanel28.add(jOYFIndiceDBPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 340, 100, -1));
        jPanel28.add(jOYFIndiceDBEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 340, 100, -1));

        jLabel221.setText("Índice DB PA");
        jPanel28.add(jLabel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 320, -1, -1));

        jLabel222.setText("Índice DB PP");
        jPanel28.add(jLabel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 320, -1, -1));

        jLabel223.setText("Índice HB PA");
        jPanel28.add(jLabel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 270, -1, -1));

        jLabel224.setText("Índice HB PP");
        jPanel28.add(jLabel224, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 270, -1, -1));
        jPanel28.add(jOYFIndiceCHEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 290, 100, -1));
        jPanel28.add(jOXFIndiceDBPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 210, 100, -1));
        jPanel28.add(jOXFIndiceDBEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 210, 100, -1));

        jLabel225.setText("Índice DB PA");
        jPanel28.add(jLabel225, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 190, -1, -1));

        jLabel226.setText("Índice DB PP");
        jPanel28.add(jLabel226, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 190, -1, -1));

        jLabel227.setText("Índice HB PA");
        jPanel28.add(jLabel227, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 140, -1, -1));

        jLabel228.setText("Índice HB PP");
        jPanel28.add(jLabel228, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 140, -1, -1));
        jPanel28.add(jOXFIndiceCHEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 160, 100, -1));
        jPanel28.add(jOXFIndiceCHPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 160, 100, -1));
        jPanel28.add(jOYFIndiceCHPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 290, 100, -1));
        jPanel28.add(jOZFIndiceCHEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 410, 100, -1));
        jPanel28.add(jOZFIndiceCHPAEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 410, 100, -1));

        org.jdesktop.layout.GroupLayout jPanel27Layout = new org.jdesktop.layout.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1577, Short.MAX_VALUE)
            .add(jPanel27Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel27Layout.createSequentialGroup()
                    .add(0, 39, Short.MAX_VALUE)
                    .add(jPanel28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1498, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 40, Short.MAX_VALUE)))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 587, Short.MAX_VALUE)
            .add(jPanel27Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel27Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 587, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("EM", jPanel27);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPane4)
                .add(70, 70, 70))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .add(jTabbedPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Octavas", jPanel4);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInstrumentosKMF.setColumns(20);
        areaInstrumentosKMF.setRows(5);
        jScrollPane112.setViewportView(areaInstrumentosKMF);

        jPanel14.add(jScrollPane112, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 53, 300, 310));

        jLabel76.setText("Instrumentos");
        jPanel14.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jTabbedPane7.addTab("kMeans", jPanel14);

        org.jdesktop.layout.GroupLayout jPanel15Layout = new org.jdesktop.layout.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 759, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 444, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("xMeans", jPanel15);

        jPanel11.add(jTabbedPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 780, 490));

        jTabbedPane1.addTab("Instrumentos", jPanel11);

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaEscalasKMF.setColumns(20);
        areaEscalasKMF.setRows(5);
        jScrollPane113.setViewportView(areaEscalasKMF);

        jPanel18.add(jScrollPane113, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 53, 300, 310));

        jLabel77.setText("Escalas");
        jPanel18.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jTabbedPane8.addTab("kMeans", jPanel18);

        org.jdesktop.layout.GroupLayout jPanel19Layout = new org.jdesktop.layout.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 759, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 444, Short.MAX_VALUE)
        );

        jTabbedPane8.addTab("xMeans", jPanel19);

        jPanel12.add(jTabbedPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 780, 490));

        jTabbedPane1.addTab("Escalas", jPanel12);

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaAcordesKMF.setColumns(20);
        areaAcordesKMF.setRows(5);
        jScrollPane114.setViewportView(areaAcordesKMF);

        jPanel20.add(jScrollPane114, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 53, 300, 310));

        jLabel78.setText("Acordes");
        jPanel20.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jTabbedPane9.addTab("kMeans", jPanel20);

        org.jdesktop.layout.GroupLayout jPanel21Layout = new org.jdesktop.layout.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 759, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 444, Short.MAX_VALUE)
        );

        jTabbedPane9.addTab("xMeans", jPanel21);

        jPanel13.add(jTabbedPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 780, 490));

        jTabbedPane1.addTab("Acordes", jPanel13);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 580));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 610, -1, -1));

        jButton2.setText("Evaluar Indice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 610, -1, -1));

        lblEmocion.setForeground(new java.awt.Color(153, 0, 51));
        lblEmocion.setText("jLabel229");
        getContentPane().add(lblEmocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jMenu1.setText("Acciones");

        jMenuItem1.setText("Recomendar");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GuiEvent ev = new GuiEvent(this, EVALUATE);
        Agnt.postGuiEvent(ev);
//        guiAEvaluarIndice fus = new guiAEvaluarIndice();
//        fus.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(guiAFusionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiAFusionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiAFusionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiAFusionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //  new guiAFusionar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea areaAcordesKMF;
    public static javax.swing.JTextArea areaEscalasKMF;
    public static javax.swing.JTextArea areaInstrumentosKMF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JTextField jDXFIndiceCH;
    public static javax.swing.JTextField jDXFIndiceCHEM;
    public static javax.swing.JTextField jDXFIndiceCHPA;
    public static javax.swing.JTextField jDXFIndiceCHPAEM;
    public static javax.swing.JTextField jDXFIndiceCHPAX;
    public static javax.swing.JTextField jDXFIndiceCHX;
    public static javax.swing.JTextField jDXFIndiceDB;
    public static javax.swing.JTextField jDXFIndiceDBEM;
    public static javax.swing.JTextField jDXFIndiceDBPA;
    public static javax.swing.JTextField jDXFIndiceDBPAEM;
    public static javax.swing.JTextField jDXFIndiceDBPAX;
    public static javax.swing.JTextField jDXFIndiceDBX;
    public static javax.swing.JTextField jDYFIndiceCH;
    public static javax.swing.JTextField jDYFIndiceCHEM;
    public static javax.swing.JTextField jDYFIndiceCHPA;
    public static javax.swing.JTextField jDYFIndiceCHPAEM;
    public static javax.swing.JTextField jDYFIndiceCHPAX;
    public static javax.swing.JTextField jDYFIndiceCHX;
    public static javax.swing.JTextField jDYFIndiceDB;
    public static javax.swing.JTextField jDYFIndiceDBEM;
    public static javax.swing.JTextField jDYFIndiceDBPA;
    public static javax.swing.JTextField jDYFIndiceDBPAEM;
    public static javax.swing.JTextField jDYFIndiceDBPAX;
    public static javax.swing.JTextField jDYFIndiceDBX;
    public static javax.swing.JTextField jDZFIndiceCH;
    public static javax.swing.JTextField jDZFIndiceCHEM;
    public static javax.swing.JTextField jDZFIndiceCHPA;
    public static javax.swing.JTextField jDZFIndiceCHPAEM;
    public static javax.swing.JTextField jDZFIndiceCHPAX;
    public static javax.swing.JTextField jDZFIndiceCHX;
    public static javax.swing.JTextField jDZFIndiceDB;
    public static javax.swing.JTextField jDZFIndiceDBEM;
    public static javax.swing.JTextField jDZFIndiceDBPA;
    public static javax.swing.JTextField jDZFIndiceDBPAEM;
    public static javax.swing.JTextField jDZFIndiceDBPAX;
    public static javax.swing.JTextField jDZFIndiceDBX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
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
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JTextField jOXFIndiceCH;
    public static javax.swing.JTextField jOXFIndiceCHEM;
    public static javax.swing.JTextField jOXFIndiceCHPA;
    public static javax.swing.JTextField jOXFIndiceCHPAEM;
    public static javax.swing.JTextField jOXFIndiceCHPAX;
    public static javax.swing.JTextField jOXFIndiceCHX;
    public static javax.swing.JTextField jOXFIndiceDB;
    public static javax.swing.JTextField jOXFIndiceDBEM;
    public static javax.swing.JTextField jOXFIndiceDBPA;
    public static javax.swing.JTextField jOXFIndiceDBPAEM;
    public static javax.swing.JTextField jOXFIndiceDBPAX;
    public static javax.swing.JTextField jOXFIndiceDBX;
    public static javax.swing.JTextField jOYFIndiceCH;
    public static javax.swing.JTextField jOYFIndiceCHEM;
    public static javax.swing.JTextField jOYFIndiceCHPA;
    public static javax.swing.JTextField jOYFIndiceCHPAEM;
    public static javax.swing.JTextField jOYFIndiceCHPAX;
    public static javax.swing.JTextField jOYFIndiceCHX;
    public static javax.swing.JTextField jOYFIndiceDB;
    public static javax.swing.JTextField jOYFIndiceDBEM;
    public static javax.swing.JTextField jOYFIndiceDBPA;
    public static javax.swing.JTextField jOYFIndiceDBPAEM;
    public static javax.swing.JTextField jOYFIndiceDBPAX;
    public static javax.swing.JTextField jOYFIndiceDBX;
    public static javax.swing.JTextField jOZFIndiceCH;
    public static javax.swing.JTextField jOZFIndiceCHEM;
    public static javax.swing.JTextField jOZFIndiceCHPA;
    public static javax.swing.JTextField jOZFIndiceCHPAEM;
    public static javax.swing.JTextField jOZFIndiceCHPAX;
    public static javax.swing.JTextField jOZFIndiceCHX;
    public static javax.swing.JTextField jOZFIndiceDB;
    public static javax.swing.JTextField jOZFIndiceDBEM;
    public static javax.swing.JTextField jOZFIndiceDBPA;
    public static javax.swing.JTextField jOZFIndiceDBPAEM;
    public static javax.swing.JTextField jOZFIndiceDBPAX;
    public static javax.swing.JTextField jOZFIndiceDBX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane100;
    private javax.swing.JScrollPane jScrollPane101;
    private javax.swing.JScrollPane jScrollPane102;
    private javax.swing.JScrollPane jScrollPane103;
    private javax.swing.JScrollPane jScrollPane104;
    private javax.swing.JScrollPane jScrollPane105;
    private javax.swing.JScrollPane jScrollPane106;
    private javax.swing.JScrollPane jScrollPane107;
    private javax.swing.JScrollPane jScrollPane108;
    private javax.swing.JScrollPane jScrollPane109;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane110;
    private javax.swing.JScrollPane jScrollPane111;
    private javax.swing.JScrollPane jScrollPane112;
    private javax.swing.JScrollPane jScrollPane113;
    private javax.swing.JScrollPane jScrollPane114;
    private javax.swing.JScrollPane jScrollPane115;
    private javax.swing.JScrollPane jScrollPane116;
    private javax.swing.JScrollPane jScrollPane117;
    private javax.swing.JScrollPane jScrollPane118;
    private javax.swing.JScrollPane jScrollPane119;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane120;
    private javax.swing.JScrollPane jScrollPane121;
    private javax.swing.JScrollPane jScrollPane122;
    private javax.swing.JScrollPane jScrollPane123;
    private javax.swing.JScrollPane jScrollPane124;
    private javax.swing.JScrollPane jScrollPane125;
    private javax.swing.JScrollPane jScrollPane126;
    private javax.swing.JScrollPane jScrollPane127;
    private javax.swing.JScrollPane jScrollPane128;
    private javax.swing.JScrollPane jScrollPane129;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane130;
    private javax.swing.JScrollPane jScrollPane131;
    private javax.swing.JScrollPane jScrollPane132;
    private javax.swing.JScrollPane jScrollPane133;
    private javax.swing.JScrollPane jScrollPane134;
    private javax.swing.JScrollPane jScrollPane135;
    private javax.swing.JScrollPane jScrollPane136;
    private javax.swing.JScrollPane jScrollPane137;
    private javax.swing.JScrollPane jScrollPane138;
    private javax.swing.JScrollPane jScrollPane139;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane140;
    private javax.swing.JScrollPane jScrollPane141;
    private javax.swing.JScrollPane jScrollPane142;
    private javax.swing.JScrollPane jScrollPane143;
    private javax.swing.JScrollPane jScrollPane144;
    private javax.swing.JScrollPane jScrollPane145;
    private javax.swing.JScrollPane jScrollPane146;
    private javax.swing.JScrollPane jScrollPane147;
    private javax.swing.JScrollPane jScrollPane148;
    private javax.swing.JScrollPane jScrollPane149;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane150;
    private javax.swing.JScrollPane jScrollPane151;
    private javax.swing.JScrollPane jScrollPane152;
    private javax.swing.JScrollPane jScrollPane153;
    private javax.swing.JScrollPane jScrollPane154;
    private javax.swing.JScrollPane jScrollPane155;
    private javax.swing.JScrollPane jScrollPane156;
    private javax.swing.JScrollPane jScrollPane157;
    private javax.swing.JScrollPane jScrollPane158;
    private javax.swing.JScrollPane jScrollPane159;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane160;
    private javax.swing.JScrollPane jScrollPane161;
    private javax.swing.JScrollPane jScrollPane162;
    private javax.swing.JScrollPane jScrollPane163;
    private javax.swing.JScrollPane jScrollPane164;
    private javax.swing.JScrollPane jScrollPane165;
    private javax.swing.JScrollPane jScrollPane166;
    private javax.swing.JScrollPane jScrollPane167;
    private javax.swing.JScrollPane jScrollPane168;
    private javax.swing.JScrollPane jScrollPane169;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane170;
    private javax.swing.JScrollPane jScrollPane171;
    private javax.swing.JScrollPane jScrollPane172;
    private javax.swing.JScrollPane jScrollPane173;
    private javax.swing.JScrollPane jScrollPane174;
    private javax.swing.JScrollPane jScrollPane175;
    private javax.swing.JScrollPane jScrollPane176;
    private javax.swing.JScrollPane jScrollPane177;
    private javax.swing.JScrollPane jScrollPane178;
    private javax.swing.JScrollPane jScrollPane179;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane180;
    private javax.swing.JScrollPane jScrollPane181;
    private javax.swing.JScrollPane jScrollPane182;
    private javax.swing.JScrollPane jScrollPane183;
    private javax.swing.JScrollPane jScrollPane184;
    private javax.swing.JScrollPane jScrollPane185;
    private javax.swing.JScrollPane jScrollPane186;
    private javax.swing.JScrollPane jScrollPane187;
    private javax.swing.JScrollPane jScrollPane188;
    private javax.swing.JScrollPane jScrollPane189;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane190;
    private javax.swing.JScrollPane jScrollPane191;
    private javax.swing.JScrollPane jScrollPane192;
    private javax.swing.JScrollPane jScrollPane193;
    private javax.swing.JScrollPane jScrollPane194;
    private javax.swing.JScrollPane jScrollPane195;
    private javax.swing.JScrollPane jScrollPane196;
    private javax.swing.JScrollPane jScrollPane197;
    private javax.swing.JScrollPane jScrollPane198;
    private javax.swing.JScrollPane jScrollPane199;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane200;
    private javax.swing.JScrollPane jScrollPane201;
    private javax.swing.JScrollPane jScrollPane202;
    private javax.swing.JScrollPane jScrollPane203;
    private javax.swing.JScrollPane jScrollPane204;
    private javax.swing.JScrollPane jScrollPane205;
    private javax.swing.JScrollPane jScrollPane206;
    private javax.swing.JScrollPane jScrollPane207;
    private javax.swing.JScrollPane jScrollPane208;
    private javax.swing.JScrollPane jScrollPane209;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane210;
    private javax.swing.JScrollPane jScrollPane211;
    private javax.swing.JScrollPane jScrollPane212;
    private javax.swing.JScrollPane jScrollPane213;
    private javax.swing.JScrollPane jScrollPane214;
    private javax.swing.JScrollPane jScrollPane215;
    private javax.swing.JScrollPane jScrollPane216;
    private javax.swing.JScrollPane jScrollPane217;
    private javax.swing.JScrollPane jScrollPane218;
    private javax.swing.JScrollPane jScrollPane219;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane220;
    private javax.swing.JScrollPane jScrollPane221;
    private javax.swing.JScrollPane jScrollPane222;
    private javax.swing.JScrollPane jScrollPane223;
    private javax.swing.JScrollPane jScrollPane224;
    private javax.swing.JScrollPane jScrollPane225;
    private javax.swing.JScrollPane jScrollPane226;
    private javax.swing.JScrollPane jScrollPane227;
    private javax.swing.JScrollPane jScrollPane228;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane54;
    private javax.swing.JScrollPane jScrollPane55;
    private javax.swing.JScrollPane jScrollPane56;
    private javax.swing.JScrollPane jScrollPane57;
    private javax.swing.JScrollPane jScrollPane58;
    private javax.swing.JScrollPane jScrollPane59;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane60;
    private javax.swing.JScrollPane jScrollPane61;
    private javax.swing.JScrollPane jScrollPane62;
    private javax.swing.JScrollPane jScrollPane63;
    private javax.swing.JScrollPane jScrollPane64;
    private javax.swing.JScrollPane jScrollPane65;
    private javax.swing.JScrollPane jScrollPane66;
    private javax.swing.JScrollPane jScrollPane67;
    private javax.swing.JScrollPane jScrollPane68;
    private javax.swing.JScrollPane jScrollPane69;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane70;
    private javax.swing.JScrollPane jScrollPane71;
    private javax.swing.JScrollPane jScrollPane72;
    private javax.swing.JScrollPane jScrollPane73;
    private javax.swing.JScrollPane jScrollPane74;
    private javax.swing.JScrollPane jScrollPane75;
    private javax.swing.JScrollPane jScrollPane76;
    private javax.swing.JScrollPane jScrollPane77;
    private javax.swing.JScrollPane jScrollPane78;
    private javax.swing.JScrollPane jScrollPane79;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane80;
    private javax.swing.JScrollPane jScrollPane81;
    private javax.swing.JScrollPane jScrollPane82;
    private javax.swing.JScrollPane jScrollPane83;
    private javax.swing.JScrollPane jScrollPane84;
    private javax.swing.JScrollPane jScrollPane85;
    private javax.swing.JScrollPane jScrollPane86;
    private javax.swing.JScrollPane jScrollPane87;
    private javax.swing.JScrollPane jScrollPane88;
    private javax.swing.JScrollPane jScrollPane89;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPane90;
    private javax.swing.JScrollPane jScrollPane91;
    private javax.swing.JScrollPane jScrollPane92;
    private javax.swing.JScrollPane jScrollPane93;
    private javax.swing.JScrollPane jScrollPane94;
    private javax.swing.JScrollPane jScrollPane95;
    private javax.swing.JScrollPane jScrollPane96;
    private javax.swing.JScrollPane jScrollPane97;
    private javax.swing.JScrollPane jScrollPane98;
    private javax.swing.JScrollPane jScrollPane99;
    public static javax.swing.JTextField jTXFIndiceCH;
    public static javax.swing.JTextField jTXFIndiceCHEM;
    public static javax.swing.JTextField jTXFIndiceCHPA;
    public static javax.swing.JTextField jTXFIndiceCHPAEM;
    public static javax.swing.JTextField jTXFIndiceCHPAX;
    public static javax.swing.JTextField jTXFIndiceCHX;
    public static javax.swing.JTextField jTXFIndiceDB;
    public static javax.swing.JTextField jTXFIndiceDBEM;
    public static javax.swing.JTextField jTXFIndiceDBPA;
    public static javax.swing.JTextField jTXFIndiceDBPAEM;
    public static javax.swing.JTextField jTXFIndiceDBPAX;
    public static javax.swing.JTextField jTXFIndiceDBX;
    public static javax.swing.JTextField jTYFIndiceCH;
    public static javax.swing.JTextField jTYFIndiceCHEM;
    public static javax.swing.JTextField jTYFIndiceCHPA;
    public static javax.swing.JTextField jTYFIndiceCHPAEM;
    public static javax.swing.JTextField jTYFIndiceCHPAX;
    public static javax.swing.JTextField jTYFIndiceCHX;
    public static javax.swing.JTextField jTYFIndiceDB;
    public static javax.swing.JTextField jTYFIndiceDBEM;
    public static javax.swing.JTextField jTYFIndiceDBPA;
    public static javax.swing.JTextField jTYFIndiceDBPAEM;
    public static javax.swing.JTextField jTYFIndiceDBPAX;
    public static javax.swing.JTextField jTYFIndiceDBX;
    public static javax.swing.JTextField jTZFIndiceCH;
    public static javax.swing.JTextField jTZFIndiceCHEM;
    public static javax.swing.JTextField jTZFIndiceCHPA;
    public static javax.swing.JTextField jTZFIndiceCHPAEM;
    public static javax.swing.JTextField jTZFIndiceCHPAX;
    public static javax.swing.JTextField jTZFIndiceCHX;
    public static javax.swing.JTextField jTZFIndiceDB;
    public static javax.swing.JTextField jTZFIndiceDBEM;
    public static javax.swing.JTextField jTZFIndiceDBPA;
    public static javax.swing.JTextField jTZFIndiceDBPAEM;
    public static javax.swing.JTextField jTZFIndiceDBPAX;
    public static javax.swing.JTextField jTZFIndiceDBX;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    public static javax.swing.JTextArea jTextALDX;
    public static javax.swing.JTextArea jTextALDXEM;
    public static javax.swing.JTextArea jTextALDXX;
    public static javax.swing.JTextArea jTextALDY;
    public static javax.swing.JTextArea jTextALDYEM;
    public static javax.swing.JTextArea jTextALDYX;
    public static javax.swing.JTextArea jTextALDZ;
    public static javax.swing.JTextArea jTextALDZEM;
    public static javax.swing.JTextArea jTextALDZX;
    public static javax.swing.JTextArea jTextALOX;
    public static javax.swing.JTextArea jTextALOXEM;
    public static javax.swing.JTextArea jTextALOXX;
    public static javax.swing.JTextArea jTextALOY;
    public static javax.swing.JTextArea jTextALOYEM;
    public static javax.swing.JTextArea jTextALOYX;
    public static javax.swing.JTextArea jTextALOZ;
    public static javax.swing.JTextArea jTextALOZEM;
    public static javax.swing.JTextArea jTextALOZX;
    public static javax.swing.JTextArea jTextALTX;
    public static javax.swing.JTextArea jTextALTXEM;
    public static javax.swing.JTextArea jTextALTXX;
    public static javax.swing.JTextArea jTextALTY;
    public static javax.swing.JTextArea jTextALTYEM;
    public static javax.swing.JTextArea jTextALTYX;
    public static javax.swing.JTextArea jTextALTZ;
    public static javax.swing.JTextArea jTextALTZEM;
    public static javax.swing.JTextArea jTextALTZX;
    public static javax.swing.JTextArea jTextFusionDX;
    public static javax.swing.JTextArea jTextFusionDXEM;
    public static javax.swing.JTextArea jTextFusionDXF;
    public static javax.swing.JTextArea jTextFusionDXFEM;
    public static javax.swing.JTextArea jTextFusionDXFI;
    public static javax.swing.JTextArea jTextFusionDXFIEM;
    public static javax.swing.JTextArea jTextFusionDXFIX;
    public static javax.swing.JTextArea jTextFusionDXFNCI;
    public static javax.swing.JTextArea jTextFusionDXFNCIEM;
    public static javax.swing.JTextArea jTextFusionDXFNCIX;
    public static javax.swing.JTextArea jTextFusionDXFPP;
    public static javax.swing.JTextArea jTextFusionDXFPPEM;
    public static javax.swing.JTextArea jTextFusionDXFPPX;
    public static javax.swing.JTextArea jTextFusionDXFX;
    public static javax.swing.JTextArea jTextFusionDXX;
    public static javax.swing.JTextArea jTextFusionDY;
    public static javax.swing.JTextArea jTextFusionDYEM;
    public static javax.swing.JTextArea jTextFusionDYF;
    public static javax.swing.JTextArea jTextFusionDYFEM;
    public static javax.swing.JTextArea jTextFusionDYFI;
    public static javax.swing.JTextArea jTextFusionDYFIEM;
    public static javax.swing.JTextArea jTextFusionDYFIX;
    public static javax.swing.JTextArea jTextFusionDYFNCI;
    public static javax.swing.JTextArea jTextFusionDYFNCIEM;
    public static javax.swing.JTextArea jTextFusionDYFNCIX;
    public static javax.swing.JTextArea jTextFusionDYFPP;
    public static javax.swing.JTextArea jTextFusionDYFPPEM;
    public static javax.swing.JTextArea jTextFusionDYFPPX;
    public static javax.swing.JTextArea jTextFusionDYFX;
    public static javax.swing.JTextArea jTextFusionDYX;
    public static javax.swing.JTextArea jTextFusionDZ;
    public static javax.swing.JTextArea jTextFusionDZEM;
    public static javax.swing.JTextArea jTextFusionDZF;
    public static javax.swing.JTextArea jTextFusionDZFEM;
    public static javax.swing.JTextArea jTextFusionDZFI;
    public static javax.swing.JTextArea jTextFusionDZFIEM;
    public static javax.swing.JTextArea jTextFusionDZFIX;
    public static javax.swing.JTextArea jTextFusionDZFNCI;
    public static javax.swing.JTextArea jTextFusionDZFNCIEM;
    public static javax.swing.JTextArea jTextFusionDZFNCIX;
    public static javax.swing.JTextArea jTextFusionDZFPP;
    public static javax.swing.JTextArea jTextFusionDZFPPEM;
    public static javax.swing.JTextArea jTextFusionDZFPPX;
    public static javax.swing.JTextArea jTextFusionDZFX;
    public static javax.swing.JTextArea jTextFusionDZX;
    public static javax.swing.JTextArea jTextFusionOX;
    public static javax.swing.JTextArea jTextFusionOXEM;
    public static javax.swing.JTextArea jTextFusionOXF;
    public static javax.swing.JTextArea jTextFusionOXFEM;
    public static javax.swing.JTextArea jTextFusionOXFI;
    public static javax.swing.JTextArea jTextFusionOXFIEM;
    public static javax.swing.JTextArea jTextFusionOXFIX;
    public static javax.swing.JTextArea jTextFusionOXFNCI;
    public static javax.swing.JTextArea jTextFusionOXFNCIEM;
    public static javax.swing.JTextArea jTextFusionOXFNCIX;
    public static javax.swing.JTextArea jTextFusionOXFPP;
    public static javax.swing.JTextArea jTextFusionOXFPPEM;
    public static javax.swing.JTextArea jTextFusionOXFPPX;
    public static javax.swing.JTextArea jTextFusionOXFX;
    public static javax.swing.JTextArea jTextFusionOXX;
    public static javax.swing.JTextArea jTextFusionOY;
    public static javax.swing.JTextArea jTextFusionOYEM;
    public static javax.swing.JTextArea jTextFusionOYF;
    public static javax.swing.JTextArea jTextFusionOYFEM;
    public static javax.swing.JTextArea jTextFusionOYFI;
    public static javax.swing.JTextArea jTextFusionOYFIEM;
    public static javax.swing.JTextArea jTextFusionOYFIX;
    public static javax.swing.JTextArea jTextFusionOYFNCI;
    public static javax.swing.JTextArea jTextFusionOYFNCIEM;
    public static javax.swing.JTextArea jTextFusionOYFNCIX;
    public static javax.swing.JTextArea jTextFusionOYFPP;
    public static javax.swing.JTextArea jTextFusionOYFPPEM;
    public static javax.swing.JTextArea jTextFusionOYFPPX;
    public static javax.swing.JTextArea jTextFusionOYFX;
    public static javax.swing.JTextArea jTextFusionOYX;
    public static javax.swing.JTextArea jTextFusionOZ;
    public static javax.swing.JTextArea jTextFusionOZEM;
    public static javax.swing.JTextArea jTextFusionOZF;
    public static javax.swing.JTextArea jTextFusionOZFEM;
    public static javax.swing.JTextArea jTextFusionOZFI;
    public static javax.swing.JTextArea jTextFusionOZFIEM;
    public static javax.swing.JTextArea jTextFusionOZFIX;
    public static javax.swing.JTextArea jTextFusionOZFNCI;
    public static javax.swing.JTextArea jTextFusionOZFNCIEM;
    public static javax.swing.JTextArea jTextFusionOZFNCIX;
    public static javax.swing.JTextArea jTextFusionOZFPP;
    public static javax.swing.JTextArea jTextFusionOZFPPEM;
    public static javax.swing.JTextArea jTextFusionOZFPPX;
    public static javax.swing.JTextArea jTextFusionOZFX;
    public static javax.swing.JTextArea jTextFusionOZX;
    public static javax.swing.JTextArea jTextFusionTX;
    public static javax.swing.JTextArea jTextFusionTXEM;
    public static javax.swing.JTextArea jTextFusionTXF;
    public static javax.swing.JTextArea jTextFusionTXFEM;
    public static javax.swing.JTextArea jTextFusionTXFI;
    public static javax.swing.JTextArea jTextFusionTXFIEM;
    public static javax.swing.JTextArea jTextFusionTXFIX;
    public static javax.swing.JTextArea jTextFusionTXFNCI;
    public static javax.swing.JTextArea jTextFusionTXFNCIEM;
    public static javax.swing.JTextArea jTextFusionTXFNCIX;
    public static javax.swing.JTextArea jTextFusionTXFPP;
    public static javax.swing.JTextArea jTextFusionTXFPPEM;
    public static javax.swing.JTextArea jTextFusionTXFPPX;
    public static javax.swing.JTextArea jTextFusionTXFX;
    public static javax.swing.JTextArea jTextFusionTXX;
    public static javax.swing.JTextArea jTextFusionTY;
    public static javax.swing.JTextArea jTextFusionTYEM;
    public static javax.swing.JTextArea jTextFusionTYF;
    public static javax.swing.JTextArea jTextFusionTYFEM;
    public static javax.swing.JTextArea jTextFusionTYFI;
    public static javax.swing.JTextArea jTextFusionTYFIEM;
    public static javax.swing.JTextArea jTextFusionTYFIX;
    public static javax.swing.JTextArea jTextFusionTYFNCI;
    public static javax.swing.JTextArea jTextFusionTYFNCIEM;
    public static javax.swing.JTextArea jTextFusionTYFNCIX;
    public static javax.swing.JTextArea jTextFusionTYFPP;
    public static javax.swing.JTextArea jTextFusionTYFPPEM;
    public static javax.swing.JTextArea jTextFusionTYFPPX;
    public static javax.swing.JTextArea jTextFusionTYFX;
    public static javax.swing.JTextArea jTextFusionTYX;
    public static javax.swing.JTextArea jTextFusionTZ;
    public static javax.swing.JTextArea jTextFusionTZEM;
    public static javax.swing.JTextArea jTextFusionTZF;
    public static javax.swing.JTextArea jTextFusionTZFEM;
    public static javax.swing.JTextArea jTextFusionTZFI;
    public static javax.swing.JTextArea jTextFusionTZFIEM;
    public static javax.swing.JTextArea jTextFusionTZFIX;
    public static javax.swing.JTextArea jTextFusionTZFNCI;
    public static javax.swing.JTextArea jTextFusionTZFNCIEM;
    public static javax.swing.JTextArea jTextFusionTZFNCIX;
    public static javax.swing.JTextArea jTextFusionTZFPP;
    public static javax.swing.JTextArea jTextFusionTZFPPEM;
    public static javax.swing.JTextArea jTextFusionTZFPPX;
    public static javax.swing.JTextArea jTextFusionTZFX;
    public static javax.swing.JTextArea jTextFusionTZX;
    public static javax.swing.JTextArea jTextGCDX;
    public static javax.swing.JTextArea jTextGCDXEM;
    public static javax.swing.JTextArea jTextGCDXX;
    public static javax.swing.JTextArea jTextGCDY;
    public static javax.swing.JTextArea jTextGCDYEM;
    public static javax.swing.JTextArea jTextGCDYX;
    public static javax.swing.JTextArea jTextGCDZ;
    public static javax.swing.JTextArea jTextGCDZEM;
    public static javax.swing.JTextArea jTextGCDZX;
    public static javax.swing.JTextArea jTextGCOX;
    public static javax.swing.JTextArea jTextGCOXEM;
    public static javax.swing.JTextArea jTextGCOXX;
    public static javax.swing.JTextArea jTextGCOY;
    public static javax.swing.JTextArea jTextGCOYEM;
    public static javax.swing.JTextArea jTextGCOYX;
    public static javax.swing.JTextArea jTextGCOZ;
    public static javax.swing.JTextArea jTextGCOZEM;
    public static javax.swing.JTextArea jTextGCOZX;
    public static javax.swing.JTextArea jTextGCTX;
    public static javax.swing.JTextArea jTextGCTXEM;
    public static javax.swing.JTextArea jTextGCTXX;
    public static javax.swing.JTextArea jTextGCTY;
    public static javax.swing.JTextArea jTextGCTYEM;
    public static javax.swing.JTextArea jTextGCTYX;
    public static javax.swing.JTextArea jTextGCTZ;
    public static javax.swing.JTextArea jTextGCTZEM;
    public static javax.swing.JTextArea jTextGCTZX;
    public static javax.swing.JTextArea jTextNCNIDX;
    public static javax.swing.JTextArea jTextNCNIDXEM;
    public static javax.swing.JTextArea jTextNCNIDXX;
    public static javax.swing.JTextArea jTextNCNIDY;
    public static javax.swing.JTextArea jTextNCNIDYEM;
    public static javax.swing.JTextArea jTextNCNIDYX;
    public static javax.swing.JTextArea jTextNCNIDZ;
    public static javax.swing.JTextArea jTextNCNIDZEM;
    public static javax.swing.JTextArea jTextNCNIDZX;
    public static javax.swing.JTextArea jTextNCNIOX;
    public static javax.swing.JTextArea jTextNCNIOXEM;
    public static javax.swing.JTextArea jTextNCNIOXX;
    public static javax.swing.JTextArea jTextNCNIOY;
    public static javax.swing.JTextArea jTextNCNIOYEM;
    public static javax.swing.JTextArea jTextNCNIOYX;
    public static javax.swing.JTextArea jTextNCNIOZ;
    public static javax.swing.JTextArea jTextNCNIOZEM;
    public static javax.swing.JTextArea jTextNCNIOZX;
    public static javax.swing.JTextArea jTextNCNITX;
    public static javax.swing.JTextArea jTextNCNITXEM;
    public static javax.swing.JTextArea jTextNCNITXX;
    public static javax.swing.JTextArea jTextNCNITY;
    public static javax.swing.JTextArea jTextNCNITYEM;
    public static javax.swing.JTextArea jTextNCNITYX;
    public static javax.swing.JTextArea jTextNCNITZ;
    public static javax.swing.JTextArea jTextNCNITZEM;
    public static javax.swing.JTextArea jTextNCNITZX;
    private javax.swing.JLabel lblEmocion;
    // End of variables declaration//GEN-END:variables
}
