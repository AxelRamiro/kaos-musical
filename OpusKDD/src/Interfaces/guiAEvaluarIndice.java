package Interfaces;

import Agentes.AgPlaneador;
import Comportamientos.CExtraer;
import Comportamientos.CFusionar;
import Comportamientos.CFusionarXM;
import Comportamientos.CFusionarEM;
import ObjeAux.promp;
import jade.gui.GuiEvent;
import java.util.ArrayList;

public class guiAEvaluarIndice extends javax.swing.JFrame implements ObjeAux.Actions {

    String txchs, txdbs, tychs, tydbs, tzchs, tzdbs;

    String dxchs, dxdbs, dychs, dydbs, dzchs, dzdbs;

    String oxchs, oxdbs, oychs, oydbs, ozchs, ozdbs;

    String txchsX, txdbsX, tychsX, tydbsX, tzchsX, tzdbsX;

    String dxchsX;
    String dxdbsX;
    String dychsX;
    String dydbsX;
    String dzchsX;
    String dzdbsX;

    String oxchsX;
    String oxdbsX;
    String oychsX;
    String oydbsX;
    String ozchsX;
    String ozdbsX;

    String txchsEM;
    String txdbsEM;
    String tychsEM;
    String tydbsEM;
    String tzchsEM;
    String tzdbsEM;

    String dxchsEM;
    String dxdbsEM;
    String dychsEM;
    String dydbsEM;
    String dzchsEM;
    String dzdbsEM;

    String oxchsEM;
    String oxdbsEM;
    String oychsEM;
    String oydbsEM;
    String ozchsEM;
    String ozdbsEM;
    
    AgPlaneador Agnt;

    public guiAEvaluarIndice(AgPlaneador a) {
        initComponents();
        
        Agnt = a;
        
        evaluarTempos();
        evaluarDuracion();
        evaluarOctavas();

        recomendarTempos();
        recomendarDuracion();
        recomendarOctavas();

        evaluarTemposXM();
        evaluarDuracionXM();
        evaluarOctavasXM();

        recomendarTemposXM();
        recomendarDuracionXM();
        recomendarOctavasXM();

        evaluarTemposEM();
        evaluarDuracionEM();
        evaluarOctavasEM();

        recomendarTemposEM();
        recomendarDuracionEM();
        recomendarOctavasEM();
        lblEmocion1.setText((String) guiARecomendar.jcboE.getSelectedItem());
        Agnt.postGuiEvent(new GuiEvent(this, SUGGEST));
    }

    @SuppressWarnings("unchecked")

    public void evaluarTempos() {

        promp p = new promp();
        double txch[] = {0, 0, 0};
        double txdb[] = {0, 0, 0};
        double tych[] = {0, 0, 0};
        double tydb[] = {0, 0, 0};
        double tzch[] = {0, 0, 0};
        double tzdb[] = {0, 0, 0};

        jTextTXCH.setText(guiARecomendar.jTXIndiceCH.getText());
        jTextTXFCH.setText(guiAFusionar.jTXFIndiceCH.getText());
        jTextTXFCHPA.setText(guiAFusionar.jTXFIndiceCHPA.getText()); ////

        jTextTXDB.setText(guiARecomendar.jTXIndiceDB.getText());
        jTextTXFDB.setText(guiAFusionar.jTXFIndiceDB.getText());
        jTextTXFDBPA.setText(guiAFusionar.jTXFIndiceDBPA.getText()); ///

        jTextTYCH.setText(guiARecomendar.jTYIndiceCH.getText());
        jTextTYFCH.setText(guiAFusionar.jTYFIndiceCH.getText());
        jTextTYFCHPA.setText(guiAFusionar.jTYFIndiceCHPA.getText()); ///

        jTextTYDB.setText(guiARecomendar.jTYIndiceDB.getText());
        jTextTYFDB.setText(guiAFusionar.jTYFIndiceDB.getText());
        jTextTYFDBPA.setText(guiAFusionar.jTYFIndiceDBPA.getText()); ///

        jTextTZCH.setText(guiARecomendar.jTZIndiceCH.getText());
        jTextTZFCH.setText(guiAFusionar.jTZFIndiceCH.getText());
        jTextTZFCHPA.setText(guiAFusionar.jTZFIndiceCHPA.getText()); ////

        jTextTZDB.setText(guiARecomendar.jTZIndiceDB.getText());
        jTextTZFDB.setText(guiAFusionar.jTZFIndiceDB.getText());
        jTextTZFDBPA.setText(guiAFusionar.jTZFIndiceDBPA.getText());  ///

        txch[0] = Double.parseDouble(jTextTXCH.getText());
        txch[1] = Double.parseDouble(jTextTXFCH.getText());
        txch[2] = Double.parseDouble(jTextTXFCHPA.getText());
        txdb[0] = Double.parseDouble(jTextTXDB.getText());
        txdb[1] = Double.parseDouble(jTextTXFDB.getText());
        txdb[2] = Double.parseDouble(jTextTXFDBPA.getText());
        tych[0] = Double.parseDouble(jTextTYCH.getText());
        tych[1] = Double.parseDouble(jTextTYFCH.getText());
        tych[2] = Double.parseDouble(jTextTYFCHPA.getText());
        tydb[0] = Double.parseDouble(jTextTYDB.getText());
        tydb[1] = Double.parseDouble(jTextTYFDB.getText());
        tydb[2] = Double.parseDouble(jTextTYFDBPA.getText());
        tzch[0] = Double.parseDouble(jTextTZCH.getText());
        tzch[1] = Double.parseDouble(jTextTZFCH.getText());
        tzch[2] = Double.parseDouble(jTextTZFCHPA.getText());
        tzdb[0] = Double.parseDouble(jTextTZDB.getText());
        tzdb[1] = Double.parseDouble(jTextTZFDB.getText());
        tzdb[2] = Double.parseDouble(jTextTZFDBPA.getText());

        jTextTXRCH.setText(String.valueOf(p.calcularMayor(txch)));
        jTextTXRDB.setText(String.valueOf(p.calcularMenor(txdb)));
        jTextTYRCH.setText(String.valueOf(p.calcularMayor(tych)));
        jTextTYRDB.setText(String.valueOf(p.calcularMenor(tydb)));
        jTextTZRCH.setText(String.valueOf(p.calcularMayor(tzch)));
        jTextTZRDB.setText(String.valueOf(p.calcularMenor(tzdb)));

        lblCHX.setText(p.calcularMayorPosision(txch));
        lblDBX.setText(p.calcularMenorPosision(txdb));

        lblCHY.setText(p.calcularMayorPosision(tych));
        lblDBY.setText(p.calcularMenorPosision(tydb));

        lblCHZ.setText(p.calcularMayorPosision(tzch));
        lblDBZ.setText(p.calcularMenorPosision(tzdb));

        txchs = lblCHX.getText();
        txdbs = lblDBX.getText();
        tychs = lblCHY.getText();
        tydbs = lblDBY.getText();
        tzchs = lblCHZ.getText();
        tzdbs = lblDBZ.getText();

    }

    public void evaluarTemposXM() {

        promp p = new promp();
        double txch[] = {0, 0, 0};
        double txdb[] = {0, 0, 0};
        double tych[] = {0, 0, 0};
        double tydb[] = {0, 0, 0};
        double tzch[] = {0, 0, 0};
        double tzdb[] = {0, 0, 0};

        jTextTXCH1.setText(guiARecomendar.jTXIndiceCHX.getText());
        jTextTXFCH1.setText(guiAFusionar.jTXFIndiceCHX.getText());
        jTextTXFCHPA1.setText(guiAFusionar.jTXFIndiceCHPAX.getText()); ////

        jTextTXDB1.setText(guiARecomendar.jTXIndiceDBX.getText());
        jTextTXFDB1.setText(guiAFusionar.jTXFIndiceDBX.getText());
        jTextTXFDBPA1.setText(guiAFusionar.jTXFIndiceDBPAX.getText()); ///

        jTextTYCH1.setText(guiARecomendar.jTYIndiceCHX.getText());
        jTextTYFCH1.setText(guiAFusionar.jTYFIndiceCHX.getText());
        jTextTYFCHPA1.setText(guiAFusionar.jTYFIndiceCHPAX.getText()); ///

        jTextTYDB1.setText(guiARecomendar.jTYIndiceDBX.getText());
        jTextTYFDB1.setText(guiAFusionar.jTYFIndiceDBX.getText());
        jTextTYFDBPA1.setText(guiAFusionar.jTYFIndiceDBPAX.getText()); ///

        jTextTZCH1.setText(guiARecomendar.jTZIndiceCHX.getText());
        jTextTZFCH1.setText(guiAFusionar.jTZFIndiceCHX.getText());
        jTextTZFCHPA1.setText(guiAFusionar.jTZFIndiceCHPAX.getText()); ////

        jTextTZDB1.setText(guiARecomendar.jTZIndiceDBX.getText());
        jTextTZFDB1.setText(guiAFusionar.jTZFIndiceDBX.getText());
        jTextTZFDBPA1.setText(guiAFusionar.jTZFIndiceDBPAX.getText());  ///

        txch[0] = Double.parseDouble(jTextTXCH1.getText());
        txch[1] = Double.parseDouble(jTextTXFCH1.getText());
        txch[2] = Double.parseDouble(jTextTXFCHPA1.getText());
        txdb[0] = Double.parseDouble(jTextTXDB1.getText());
        txdb[1] = Double.parseDouble(jTextTXFDB1.getText());
        txdb[2] = Double.parseDouble(jTextTXFDBPA1.getText());
        tych[0] = Double.parseDouble(jTextTYCH1.getText());
        tych[1] = Double.parseDouble(jTextTYFCH1.getText());
        tych[2] = Double.parseDouble(jTextTYFCHPA1.getText());
        tydb[0] = Double.parseDouble(jTextTYDB1.getText());
        tydb[1] = Double.parseDouble(jTextTYFDB1.getText());
        tydb[2] = Double.parseDouble(jTextTYFDBPA1.getText());
        tzch[0] = Double.parseDouble(jTextTZCH1.getText());
        tzch[1] = Double.parseDouble(jTextTZFCH1.getText());
        tzch[2] = Double.parseDouble(jTextTZFCHPA1.getText());
        tzdb[0] = Double.parseDouble(jTextTZDB1.getText());
        tzdb[1] = Double.parseDouble(jTextTZFDB1.getText());
        tzdb[2] = Double.parseDouble(jTextTZFDBPA1.getText());

        jTextTXRCH1.setText(String.valueOf(p.calcularMayor(txch)));
        jTextTXRDB1.setText(String.valueOf(p.calcularMenor(txdb)));
        jTextTYRCH1.setText(String.valueOf(p.calcularMayor(tych)));
        jTextTYRDB1.setText(String.valueOf(p.calcularMenor(tydb)));
        jTextTZRCH1.setText(String.valueOf(p.calcularMayor(tzch)));
        jTextTZRDB1.setText(String.valueOf(p.calcularMenor(tzdb)));

        lblCHX1.setText(p.calcularMayorPosision(txch));
        lblDBX1.setText(p.calcularMenorPosision(txdb));

        lblCHY1.setText(p.calcularMayorPosision(tych));
        lblDBY1.setText(p.calcularMenorPosision(tydb));

        lblCHZ1.setText(p.calcularMayorPosision(tzch));
        lblDBZ1.setText(p.calcularMenorPosision(tzdb));

        txchsX = lblCHX1.getText();
        txdbsX = lblDBX1.getText();
        tychsX = lblCHY1.getText();
        tydbsX = lblDBY1.getText();
        tzchsX = lblCHZ1.getText();
        tzdbsX = lblDBZ1.getText();

    }

    public void evaluarTemposEM() {

        promp p = new promp();
        double txch[] = {0, 0, 0};
        double txdb[] = {0, 0, 0};
        double tych[] = {0, 0, 0};
        double tydb[] = {0, 0, 0};
        double tzch[] = {0, 0, 0};
        double tzdb[] = {0, 0, 0};

        jTextTXCH2.setText(guiARecomendar.jTXIndiceCHEM.getText());
        jTextTXFCH2.setText(guiAFusionar.jTXFIndiceCHEM.getText());
        jTextTXFCHPA2.setText(guiAFusionar.jTXFIndiceCHPAEM.getText()); ////

        jTextTXDB2.setText(guiARecomendar.jTXIndiceDBEM.getText());
        jTextTXFDB2.setText(guiAFusionar.jTXFIndiceDBEM.getText());
        jTextTXFDBPA2.setText(guiAFusionar.jTXFIndiceDBPAEM.getText()); ///

        jTextTYCH2.setText(guiARecomendar.jTYIndiceCHEM.getText());
        jTextTYFCH2.setText(guiAFusionar.jTYFIndiceCHEM.getText());
        jTextTYFCHPA2.setText(guiAFusionar.jTYFIndiceCHPAEM.getText()); ///

        jTextTYDB2.setText(guiARecomendar.jTYIndiceDBEM.getText());
        jTextTYFDB2.setText(guiAFusionar.jTYFIndiceDBEM.getText());
        jTextTYFDBPA2.setText(guiAFusionar.jTYFIndiceDBPAEM.getText()); ///

        jTextTZCH2.setText(guiARecomendar.jTZIndiceCHEM.getText());
        jTextTZFCH2.setText(guiAFusionar.jTZFIndiceCHEM.getText());
        jTextTZFCHPA2.setText(guiAFusionar.jTZFIndiceCHPAEM.getText()); ////

        jTextTZDB2.setText(guiARecomendar.jTZIndiceDBEM.getText());
        jTextTZFDB2.setText(guiAFusionar.jTZFIndiceDBEM.getText());
        jTextTZFDBPA2.setText(guiAFusionar.jTZFIndiceDBPAEM.getText());  ///

        txch[0] = Double.parseDouble(jTextTXCH2.getText());
        txch[1] = Double.parseDouble(jTextTXFCH2.getText());
        txch[2] = Double.parseDouble(jTextTXFCHPA2.getText());
        txdb[0] = Double.parseDouble(jTextTXDB2.getText());
        txdb[1] = Double.parseDouble(jTextTXFDB2.getText());
        txdb[2] = Double.parseDouble(jTextTXFDBPA2.getText());
        tych[0] = Double.parseDouble(jTextTYCH2.getText());
        tych[1] = Double.parseDouble(jTextTYFCH2.getText());
        tych[2] = Double.parseDouble(jTextTYFCHPA2.getText());
        tydb[0] = Double.parseDouble(jTextTYDB2.getText());
        tydb[1] = Double.parseDouble(jTextTYFDB2.getText());
        tydb[2] = Double.parseDouble(jTextTYFDBPA2.getText());
        tzch[0] = Double.parseDouble(jTextTZCH2.getText());
        tzch[1] = Double.parseDouble(jTextTZFCH2.getText());
        tzch[2] = Double.parseDouble(jTextTZFCHPA2.getText());
        tzdb[0] = Double.parseDouble(jTextTZDB2.getText());
        tzdb[1] = Double.parseDouble(jTextTZFDB2.getText());
        tzdb[2] = Double.parseDouble(jTextTZFDBPA2.getText());

        jTextTXRCH2.setText(String.valueOf(p.calcularMayor(txch)));
        jTextTXRDB2.setText(String.valueOf(p.calcularMenor(txdb)));
        jTextTYRCH2.setText(String.valueOf(p.calcularMayor(tych)));
        jTextTYRDB2.setText(String.valueOf(p.calcularMenor(tydb)));
        jTextTZRCH2.setText(String.valueOf(p.calcularMayor(tzch)));
        jTextTZRDB2.setText(String.valueOf(p.calcularMenor(tzdb)));

        lblCHX2.setText(p.calcularMayorPosision(txch));
        lblDBX2.setText(p.calcularMenorPosision(txdb));

        lblCHY2.setText(p.calcularMayorPosision(tych));
        lblDBY2.setText(p.calcularMenorPosision(tydb));

        lblCHZ2.setText(p.calcularMayorPosision(tzch));
        lblDBZ2.setText(p.calcularMenorPosision(tzdb));

        txchsEM = lblCHX2.getText();
        txdbsEM = lblDBX2.getText();
        tychsEM = lblCHY2.getText();
        tydbsEM = lblDBY2.getText();
        tzchsEM = lblCHZ2.getText();
        tzdbsEM = lblDBZ2.getText();

    }

    public void evaluarDuracion() {

        promp p = new promp();
        double dxch[] = {0, 0, 0};
        double dxdb[] = {0, 0, 0};
        double dych[] = {0, 0, 0};
        double dydb[] = {0, 0, 0};
        double dzch[] = {0, 0, 0};
        double dzdb[] = {0, 0, 0};

        jTextDXCH.setText(guiARecomendar.jDXIndiceCH.getText());
        jTextDXFCH.setText(guiAFusionar.jDXFIndiceCH.getText());
        jTextDXFCHPA.setText(guiAFusionar.jDXFIndiceCHPA.getText()); ////

        jTextDXDB.setText(guiARecomendar.jDXIndiceDB.getText());
        jTextDXFDB.setText(guiAFusionar.jDXFIndiceDB.getText());
        jTextDXFDBPA.setText(guiAFusionar.jDXFIndiceDBPA.getText()); ///

        jTextDYCH.setText(guiARecomendar.jDYIndiceCH.getText());
        jTextDYFCH.setText(guiAFusionar.jDYFIndiceCH.getText());
        jTextDYFCHPA.setText(guiAFusionar.jDYFIndiceCHPA.getText()); ///

        jTextDYDB.setText(guiARecomendar.jDYIndiceDB.getText());
        jTextDYFDB.setText(guiAFusionar.jDYFIndiceDB.getText());
        jTextDYFDBPA.setText(guiAFusionar.jDYFIndiceDBPA.getText()); ///

        jTextDZCH.setText(guiARecomendar.jDZIndiceCH.getText());
        jTextDZFCH.setText(guiAFusionar.jDZFIndiceCH.getText());
        jTextDZFCHPA.setText(guiAFusionar.jDZFIndiceCHPA.getText()); ////

        jTextDZDB.setText(guiARecomendar.jDZIndiceDB.getText());
        jTextDZFDB.setText(guiAFusionar.jDZFIndiceDB.getText());
        jTextDZFDBPA.setText(guiAFusionar.jDZFIndiceDBPA.getText());  ///

        dxch[0] = Double.parseDouble(jTextDXCH.getText());
        dxch[1] = Double.parseDouble(jTextDXFCH.getText());
        dxch[2] = Double.parseDouble(jTextDXFCHPA.getText());
        dxdb[0] = Double.parseDouble(jTextDXDB.getText());
        dxdb[1] = Double.parseDouble(jTextDXFDB.getText());
        dxdb[2] = Double.parseDouble(jTextDXFDBPA.getText());
        dych[0] = Double.parseDouble(jTextDYCH.getText());
        dych[1] = Double.parseDouble(jTextDYFCH.getText());
        dych[2] = Double.parseDouble(jTextDYFCHPA.getText());
        dydb[0] = Double.parseDouble(jTextDYDB.getText());
        dydb[1] = Double.parseDouble(jTextDYFDB.getText());
        dydb[2] = Double.parseDouble(jTextDYFDBPA.getText());
        dzch[0] = Double.parseDouble(jTextDZCH.getText());
        dzch[1] = Double.parseDouble(jTextDZFCH.getText());
        dzch[2] = Double.parseDouble(jTextDZFCHPA.getText());
        dzdb[0] = Double.parseDouble(jTextDZDB.getText());
        dzdb[1] = Double.parseDouble(jTextDZFDB.getText());
        dzdb[2] = Double.parseDouble(jTextDZFDBPA.getText());

        jTextDXRCH.setText(String.valueOf(p.calcularMayor(dxch)));
        jTextDXRDB.setText(String.valueOf(p.calcularMenor(dxdb)));
        jTextDYRCH.setText(String.valueOf(p.calcularMayor(dych)));
        jTextDYRDB.setText(String.valueOf(p.calcularMenor(dydb)));
        jTextDZRCH.setText(String.valueOf(p.calcularMayor(dzch)));
        jTextDZRDB.setText(String.valueOf(p.calcularMenor(dzdb)));

        lblCHXD.setText(p.calcularMayorPosision(dxch));
        lblDBXD.setText(p.calcularMenorPosision(dxdb));

        lblCHYD.setText(p.calcularMayorPosision(dych));
        lblDBYD.setText(p.calcularMenorPosision(dydb));

        lblCHZD.setText(p.calcularMayorPosision(dzch));
        lblDBZD.setText(p.calcularMenorPosision(dzdb));

        dxchs = lblCHXD.getText();
        dxdbs = lblDBXD.getText();
        dychs = lblCHYD.getText();
        dydbs = lblDBYD.getText();
        dzchs = lblCHZD.getText();
        dzdbs = lblDBZD.getText();

    }

    public void evaluarDuracionXM() {

        promp p = new promp();
        double dxch[] = {0, 0, 0};
        double dxdb[] = {0, 0, 0};
        double dych[] = {0, 0, 0};
        double dydb[] = {0, 0, 0};
        double dzch[] = {0, 0, 0};
        double dzdb[] = {0, 0, 0};

        jTextDXCH1.setText(guiARecomendar.jDXIndiceCHX.getText());
        jTextDXFCH1.setText(guiAFusionar.jDXFIndiceCHX.getText());
        jTextDXFCHPA1.setText(guiAFusionar.jDXFIndiceCHPAX.getText()); ////

        jTextDXDB1.setText(guiARecomendar.jDXIndiceDBX.getText());
        jTextDXFDB1.setText(guiAFusionar.jDXFIndiceDBX.getText());
        jTextDXFDBPA1.setText(guiAFusionar.jDXFIndiceDBPAX.getText()); ///

        jTextDYCH1.setText(guiARecomendar.jDYIndiceCHX.getText());
        jTextDYFCH1.setText(guiAFusionar.jDYFIndiceCHX.getText());
        jTextDYFCHPA1.setText(guiAFusionar.jDYFIndiceCHPAX.getText()); ///

        jTextDYDB1.setText(guiARecomendar.jDYIndiceDBX.getText());
        jTextDYFDB1.setText(guiAFusionar.jDYFIndiceDBX.getText());
        jTextDYFDBPA1.setText(guiAFusionar.jDYFIndiceDBPAX.getText()); ///

        jTextDZCH1.setText(guiARecomendar.jDZIndiceCHX.getText());
        jTextDZFCH1.setText(guiAFusionar.jDZFIndiceCHX.getText());
        jTextDZFCHPA1.setText(guiAFusionar.jDZFIndiceCHPAX.getText()); ////

        jTextDZDB1.setText(guiARecomendar.jDZIndiceDBX.getText());
        jTextDZFDB1.setText(guiAFusionar.jDZFIndiceDBX.getText());
        jTextDZFDBPA1.setText(guiAFusionar.jDZFIndiceDBPAX.getText());  ///

        dxch[0] = Double.parseDouble(jTextDXCH1.getText());
        dxch[1] = Double.parseDouble(jTextDXFCH1.getText());
        dxch[2] = Double.parseDouble(jTextDXFCHPA1.getText());
        dxdb[0] = Double.parseDouble(jTextDXDB1.getText());
        dxdb[1] = Double.parseDouble(jTextDXFDB1.getText());
        dxdb[2] = Double.parseDouble(jTextDXFDBPA1.getText());
        dych[0] = Double.parseDouble(jTextDYCH1.getText());
        dych[1] = Double.parseDouble(jTextDYFCH1.getText());
        dych[2] = Double.parseDouble(jTextDYFCHPA1.getText());
        dydb[0] = Double.parseDouble(jTextDYDB1.getText());
        dydb[1] = Double.parseDouble(jTextDYFDB1.getText());
        dydb[2] = Double.parseDouble(jTextDYFDBPA1.getText());
        dzch[0] = Double.parseDouble(jTextDZCH1.getText());
        dzch[1] = Double.parseDouble(jTextDZFCH1.getText());
        dzch[2] = Double.parseDouble(jTextDZFCHPA1.getText());
        dzdb[0] = Double.parseDouble(jTextDZDB1.getText());
        dzdb[1] = Double.parseDouble(jTextDZFDB1.getText());
        dzdb[2] = Double.parseDouble(jTextDZFDBPA1.getText());

        jTextDXRCH1.setText(String.valueOf(p.calcularMayor(dxch)));
        jTextDXRDB1.setText(String.valueOf(p.calcularMenor(dxdb)));
        jTextDYRCH1.setText(String.valueOf(p.calcularMayor(dych)));
        jTextDYRDB1.setText(String.valueOf(p.calcularMenor(dydb)));
        jTextDZRCH1.setText(String.valueOf(p.calcularMayor(dzch)));
        jTextDZRDB1.setText(String.valueOf(p.calcularMenor(dzdb)));

        lblCHXD1.setText(p.calcularMayorPosision(dxch));
        lblDBXD1.setText(p.calcularMenorPosision(dxdb));

        lblCHYD1.setText(p.calcularMayorPosision(dych));
        lblDBYD1.setText(p.calcularMenorPosision(dydb));

        lblCHZD1.setText(p.calcularMayorPosision(dzch));
        lblDBZD1.setText(p.calcularMenorPosision(dzdb));

        dxchsX = lblCHXD1.getText();
        dxdbsX = lblDBXD1.getText();
        dychsX = lblCHYD1.getText();
        dydbsX = lblDBYD1.getText();
        dzchsX = lblCHZD1.getText();
        dzdbsX = lblDBZD1.getText();

    }

    public void evaluarDuracionEM() {

        promp p = new promp();
        double dxch[] = {0, 0, 0};
        double dxdb[] = {0, 0, 0};
        double dych[] = {0, 0, 0};
        double dydb[] = {0, 0, 0};
        double dzch[] = {0, 0, 0};
        double dzdb[] = {0, 0, 0};

        jTextDXCH2.setText(guiARecomendar.jDXIndiceCHEM.getText());
        jTextDXFCH2.setText(guiAFusionar.jDXFIndiceCHEM.getText());
        jTextDXFCHPA2.setText(guiAFusionar.jDXFIndiceCHPAEM.getText()); ////

        jTextDXDB2.setText(guiARecomendar.jDXIndiceDBEM.getText());
        jTextDXFDB2.setText(guiAFusionar.jDXFIndiceDBEM.getText());
        jTextDXFDBPA2.setText(guiAFusionar.jDXFIndiceDBPAEM.getText()); ///

        jTextDYCH2.setText(guiARecomendar.jDYIndiceCHEM.getText());
        jTextDYFCH2.setText(guiAFusionar.jDYFIndiceCHEM.getText());
        jTextDYFCHPA2.setText(guiAFusionar.jDYFIndiceCHPAEM.getText()); ///

        jTextDYDB2.setText(guiARecomendar.jDYIndiceDBEM.getText());
        jTextDYFDB2.setText(guiAFusionar.jDYFIndiceDBEM.getText());
        jTextDYFDBPA2.setText(guiAFusionar.jDYFIndiceDBPAEM.getText()); ///

        jTextDZCH2.setText(guiARecomendar.jDZIndiceCHEM.getText());
        jTextDZFCH2.setText(guiAFusionar.jDZFIndiceCHEM.getText());
        jTextDZFCHPA2.setText(guiAFusionar.jDZFIndiceCHPAEM.getText()); ////

        jTextDZDB2.setText(guiARecomendar.jDZIndiceDBEM.getText());
        jTextDZFDB2.setText(guiAFusionar.jDZFIndiceDBEM.getText());
        jTextDZFDBPA2.setText(guiAFusionar.jDZFIndiceDBPAEM.getText());  ///

        dxch[0] = Double.parseDouble(jTextDXCH2.getText());
        dxch[1] = Double.parseDouble(jTextDXFCH2.getText());
        dxch[2] = Double.parseDouble(jTextDXFCHPA2.getText());
        dxdb[0] = Double.parseDouble(jTextDXDB2.getText());
        dxdb[1] = Double.parseDouble(jTextDXFDB2.getText());
        dxdb[2] = Double.parseDouble(jTextDXFDBPA2.getText());
        dych[0] = Double.parseDouble(jTextDYCH2.getText());
        dych[1] = Double.parseDouble(jTextDYFCH2.getText());
        dych[2] = Double.parseDouble(jTextDYFCHPA2.getText());
        dydb[0] = Double.parseDouble(jTextDYDB2.getText());
        dydb[1] = Double.parseDouble(jTextDYFDB2.getText());
        dydb[2] = Double.parseDouble(jTextDYFDBPA2.getText());
        dzch[0] = Double.parseDouble(jTextDZCH2.getText());
        dzch[1] = Double.parseDouble(jTextDZFCH2.getText());
        dzch[2] = Double.parseDouble(jTextDZFCHPA2.getText());
        dzdb[0] = Double.parseDouble(jTextDZDB2.getText());
        dzdb[1] = Double.parseDouble(jTextDZFDB2.getText());
        dzdb[2] = Double.parseDouble(jTextDZFDBPA2.getText());

        jTextDXRCH2.setText(String.valueOf(p.calcularMayor(dxch)));
        jTextDXRDB2.setText(String.valueOf(p.calcularMenor(dxdb)));
        jTextDYRCH2.setText(String.valueOf(p.calcularMayor(dych)));
        jTextDYRDB2.setText(String.valueOf(p.calcularMenor(dydb)));
        jTextDZRCH2.setText(String.valueOf(p.calcularMayor(dzch)));
        jTextDZRDB2.setText(String.valueOf(p.calcularMenor(dzdb)));

        lblCHXD2.setText(p.calcularMayorPosision(dxch));
        lblDBXD2.setText(p.calcularMenorPosision(dxdb));

        lblCHYD2.setText(p.calcularMayorPosision(dych));
        lblDBYD2.setText(p.calcularMenorPosision(dydb));

        lblCHZD2.setText(p.calcularMayorPosision(dzch));
        lblDBZD2.setText(p.calcularMenorPosision(dzdb));

        dxchsEM = lblCHXD2.getText();
        dxdbsEM = lblDBXD2.getText();
        dychsEM = lblCHYD2.getText();
        dydbsEM = lblDBYD2.getText();
        dzchsEM = lblCHZD2.getText();
        dzdbsEM = lblDBZD2.getText();

    }

    public void evaluarOctavas() {

        promp p = new promp();
        double oxch[] = {0, 0, 0};
        double oxdb[] = {0, 0, 0};
        double oych[] = {0, 0, 0};
        double oydb[] = {0, 0, 0};
        double ozch[] = {0, 0, 0};
        double ozdb[] = {0, 0, 0};

        jTextOXCH.setText(guiARecomendar.jOXIndiceCH.getText());
        jTextOXFCH.setText(guiAFusionar.jOXFIndiceCH.getText());
        jTextOXFCHPA.setText(guiAFusionar.jOXFIndiceCHPA.getText()); ////

        jTextOXDB.setText(guiARecomendar.jOXIndiceDB.getText());
        jTextOXFDB.setText(guiAFusionar.jOXFIndiceDB.getText());
        jTextOXFDBPA.setText(guiAFusionar.jOXFIndiceDBPA.getText()); ///

        jTextOYCH.setText(guiARecomendar.jOYIndiceCH.getText());
        jTextOYFCH.setText(guiAFusionar.jOYFIndiceCH.getText());
        jTextOYFCHPA.setText(guiAFusionar.jOYFIndiceCHPA.getText()); ///

        jTextOYDB.setText(guiARecomendar.jOYIndiceDB.getText());
        jTextOYFDB.setText(guiAFusionar.jOYFIndiceDB.getText());
        jTextOYFDBPA.setText(guiAFusionar.jOYFIndiceDBPA.getText()); ///

        jTextOZCH.setText(guiARecomendar.jOZIndiceCH.getText());
        jTextOZFCH.setText(guiAFusionar.jOZFIndiceCH.getText());
        jTextOZFCHPA.setText(guiAFusionar.jOZFIndiceCHPA.getText()); ////

        jTextOZDB.setText(guiARecomendar.jOZIndiceDB.getText());
        jTextOZFDB.setText(guiAFusionar.jOZFIndiceDB.getText());
        jTextOZFDBPA.setText(guiAFusionar.jOZFIndiceDBPA.getText());  ///

        oxch[0] = Double.parseDouble(jTextOXCH.getText());
        oxch[1] = Double.parseDouble(jTextOXFCH.getText());
        oxch[2] = Double.parseDouble(jTextOXFCHPA.getText());
        oxdb[0] = Double.parseDouble(jTextOXDB.getText());
        oxdb[1] = Double.parseDouble(jTextOXFDB.getText());
        oxdb[2] = Double.parseDouble(jTextOXFDBPA.getText());
        oych[0] = Double.parseDouble(jTextOYCH.getText());
        oych[1] = Double.parseDouble(jTextOYFCH.getText());
        oych[2] = Double.parseDouble(jTextOYFCHPA.getText());
        oydb[0] = Double.parseDouble(jTextOYDB.getText());
        oydb[1] = Double.parseDouble(jTextOYFDB.getText());
        oydb[2] = Double.parseDouble(jTextOYFDBPA.getText());
        ozch[0] = Double.parseDouble(jTextOZCH.getText());
        ozch[1] = Double.parseDouble(jTextOZFCH.getText());
        ozch[2] = Double.parseDouble(jTextOZFCHPA.getText());
        ozdb[0] = Double.parseDouble(jTextOZDB.getText());
        ozdb[1] = Double.parseDouble(jTextOZFDB.getText());
        ozdb[2] = Double.parseDouble(jTextOZFDBPA.getText());

        jTextOXRCH.setText(String.valueOf(p.calcularMayor(oxch)));
        jTextOXRDB.setText(String.valueOf(p.calcularMenor(oxdb)));
        jTextOYRCH.setText(String.valueOf(p.calcularMayor(oych)));
        jTextOYRDB.setText(String.valueOf(p.calcularMenor(oydb)));
        jTextOZRCH.setText(String.valueOf(p.calcularMayor(ozch)));
        jTextOZRDB.setText(String.valueOf(p.calcularMenor(ozdb)));

        lblCHXO.setText(p.calcularMayorPosision(oxch));
        lblDBXO.setText(p.calcularMenorPosision(oxdb));

        lblCHYO.setText(p.calcularMayorPosision(oych));
        lblDBYO.setText(p.calcularMenorPosision(oydb));

        lblCHZO.setText(p.calcularMayorPosision(ozch));
        lblDBZO.setText(p.calcularMenorPosision(ozdb));

        oxchs = lblCHXO.getText();
        oxdbs = lblDBXO.getText();
        oychs = lblCHYO.getText();
        oydbs = lblDBYO.getText();
        ozchs = lblCHZO.getText();
        ozdbs = lblDBZO.getText();

    }

    public void evaluarOctavasXM() {

        promp p = new promp();
        double oxch[] = {0, 0, 0};
        double oxdb[] = {0, 0, 0};
        double oych[] = {0, 0, 0};
        double oydb[] = {0, 0, 0};
        double ozch[] = {0, 0, 0};
        double ozdb[] = {0, 0, 0};

        jTextOXCH1.setText(guiARecomendar.jOXIndiceCHX.getText());
        jTextOXFCH1.setText(guiAFusionar.jOXFIndiceCHX.getText());
        jTextOXFCHPA1.setText(guiAFusionar.jOXFIndiceCHPAX.getText()); ////

        jTextOXDB1.setText(guiARecomendar.jOXIndiceDBX.getText());
        jTextOXFDB1.setText(guiAFusionar.jOXFIndiceDBX.getText());
        jTextOXFDBPA1.setText(guiAFusionar.jOXFIndiceDBPAX.getText()); ///

        jTextOYCH1.setText(guiARecomendar.jOYIndiceCHX.getText());
        jTextOYFCH1.setText(guiAFusionar.jOYFIndiceCHX.getText());
        jTextOYFCHPA1.setText(guiAFusionar.jOYFIndiceCHPAX.getText()); ///

        jTextOYDB1.setText(guiARecomendar.jOYIndiceDBX.getText());
        jTextOYFDB1.setText(guiAFusionar.jOYFIndiceDBX.getText());
        jTextOYFDBPA1.setText(guiAFusionar.jOYFIndiceDBPAX.getText()); ///

        jTextOZCH1.setText(guiARecomendar.jOZIndiceCHX.getText());
        jTextOZFCH1.setText(guiAFusionar.jOZFIndiceCHX.getText());
        jTextOZFCHPA1.setText(guiAFusionar.jOZFIndiceCHPAX.getText()); ////

        jTextOZDB1.setText(guiARecomendar.jOZIndiceDBX.getText());
        jTextOZFDB1.setText(guiAFusionar.jOZFIndiceDBX.getText());
        jTextOZFDBPA1.setText(guiAFusionar.jOZFIndiceDBPAX.getText());  ///

        oxch[0] = Double.parseDouble(jTextOXCH1.getText());
        oxch[1] = Double.parseDouble(jTextOXFCH1.getText());
        oxch[2] = Double.parseDouble(jTextOXFCHPA1.getText());
        oxdb[0] = Double.parseDouble(jTextOXDB1.getText());
        oxdb[1] = Double.parseDouble(jTextOXFDB1.getText());
        oxdb[2] = Double.parseDouble(jTextOXFDBPA1.getText());
        oych[0] = Double.parseDouble(jTextOYCH1.getText());
        oych[1] = Double.parseDouble(jTextOYFCH1.getText());
        oych[2] = Double.parseDouble(jTextOYFCHPA1.getText());
        oydb[0] = Double.parseDouble(jTextOYDB1.getText());
        oydb[1] = Double.parseDouble(jTextOYFDB1.getText());
        oydb[2] = Double.parseDouble(jTextOYFDBPA1.getText());
        ozch[0] = Double.parseDouble(jTextOZCH1.getText());
        ozch[1] = Double.parseDouble(jTextOZFCH1.getText());
        ozch[2] = Double.parseDouble(jTextOZFCHPA1.getText());
        ozdb[0] = Double.parseDouble(jTextOZDB1.getText());
        ozdb[1] = Double.parseDouble(jTextOZFDB1.getText());
        ozdb[2] = Double.parseDouble(jTextOZFDBPA1.getText());

        jTextOXRCH1.setText(String.valueOf(p.calcularMayor(oxch)));
        jTextOXRDB1.setText(String.valueOf(p.calcularMenor(oxdb)));
        jTextOYRCH1.setText(String.valueOf(p.calcularMayor(oych)));
        jTextOYRDB1.setText(String.valueOf(p.calcularMenor(oydb)));
        jTextOZRCH1.setText(String.valueOf(p.calcularMayor(ozch)));
        jTextOZRDB1.setText(String.valueOf(p.calcularMenor(ozdb)));

        lblCHXO1.setText(p.calcularMayorPosision(oxch));
        lblDBXO1.setText(p.calcularMenorPosision(oxdb));

        lblCHYO1.setText(p.calcularMayorPosision(oych));
        lblDBYO1.setText(p.calcularMenorPosision(oydb));

        lblCHZO1.setText(p.calcularMayorPosision(ozch));
        lblDBZO1.setText(p.calcularMenorPosision(ozdb));

        oxchsX = lblCHXO1.getText();
        oxdbsX = lblDBXO1.getText();
        oychsX = lblCHYO1.getText();
        oydbsX = lblDBYO1.getText();
        ozchsX = lblCHZO1.getText();
        ozdbsX = lblDBZO1.getText();

    }

    public void evaluarOctavasEM() {

        promp p = new promp();
        double oxch[] = {0, 0, 0};
        double oxdb[] = {0, 0, 0};
        double oych[] = {0, 0, 0};
        double oydb[] = {0, 0, 0};
        double ozch[] = {0, 0, 0};
        double ozdb[] = {0, 0, 0};

        jTextOXCH2.setText(guiARecomendar.jOXIndiceCHEM.getText());
        jTextOXFCH2.setText(guiAFusionar.jOXFIndiceCHEM.getText());
        jTextOXFCHPA2.setText(guiAFusionar.jOXFIndiceCHPAEM.getText()); ////

        jTextOXDB2.setText(guiARecomendar.jOXIndiceDBEM.getText());
        jTextOXFDB2.setText(guiAFusionar.jOXFIndiceDBEM.getText());
        jTextOXFDBPA2.setText(guiAFusionar.jOXFIndiceDBPAEM.getText()); ///

        jTextOYCH2.setText(guiARecomendar.jOYIndiceCHEM.getText());
        jTextOYFCH2.setText(guiAFusionar.jOYFIndiceCHEM.getText());
        jTextOYFCHPA2.setText(guiAFusionar.jOYFIndiceCHPAEM.getText()); ///

        jTextOYDB2.setText(guiARecomendar.jOYIndiceDBEM.getText());
        jTextOYFDB2.setText(guiAFusionar.jOYFIndiceDBEM.getText());
        jTextOYFDBPA2.setText(guiAFusionar.jOYFIndiceDBPAEM.getText()); ///

        jTextOZCH2.setText(guiARecomendar.jOZIndiceCHEM.getText());
        jTextOZFCH2.setText(guiAFusionar.jOZFIndiceCHEM.getText());
        jTextOZFCHPA2.setText(guiAFusionar.jOZFIndiceCHPAEM.getText()); ////

        jTextOZDB2.setText(guiARecomendar.jOZIndiceDBEM.getText());
        jTextOZFDB2.setText(guiAFusionar.jOZFIndiceDBEM.getText());
        jTextOZFDBPA2.setText(guiAFusionar.jOZFIndiceDBPAEM.getText());  ///

        oxch[0] = Double.parseDouble(jTextOXCH2.getText());
        oxch[1] = Double.parseDouble(jTextOXFCH2.getText());
        oxch[2] = Double.parseDouble(jTextOXFCHPA2.getText());
        oxdb[0] = Double.parseDouble(jTextOXDB2.getText());
        oxdb[1] = Double.parseDouble(jTextOXFDB2.getText());
        oxdb[2] = Double.parseDouble(jTextOXFDBPA2.getText());
        oych[0] = Double.parseDouble(jTextOYCH2.getText());
        oych[1] = Double.parseDouble(jTextOYFCH2.getText());
        oych[2] = Double.parseDouble(jTextOYFCHPA2.getText());
        oydb[0] = Double.parseDouble(jTextOYDB2.getText());
        oydb[1] = Double.parseDouble(jTextOYFDB2.getText());
        oydb[2] = Double.parseDouble(jTextOYFDBPA2.getText());
        ozch[0] = Double.parseDouble(jTextOZCH2.getText());
        ozch[1] = Double.parseDouble(jTextOZFCH2.getText());
        ozch[2] = Double.parseDouble(jTextOZFCHPA2.getText());
        ozdb[0] = Double.parseDouble(jTextOZDB2.getText());
        ozdb[1] = Double.parseDouble(jTextOZFDB2.getText());
        ozdb[2] = Double.parseDouble(jTextOZFDBPA2.getText());

        jTextOXRCH2.setText(String.valueOf(p.calcularMayor(oxch)));
        jTextOXRDB2.setText(String.valueOf(p.calcularMenor(oxdb)));
        jTextOYRCH2.setText(String.valueOf(p.calcularMayor(oych)));
        jTextOYRDB2.setText(String.valueOf(p.calcularMenor(oydb)));
        jTextOZRCH2.setText(String.valueOf(p.calcularMayor(ozch)));
        jTextOZRDB2.setText(String.valueOf(p.calcularMenor(ozdb)));

        lblCHXO2.setText(p.calcularMayorPosision(oxch));
        lblDBXO2.setText(p.calcularMenorPosision(oxdb));

        lblCHYO2.setText(p.calcularMayorPosision(oych));
        lblDBYO2.setText(p.calcularMenorPosision(oydb));

        lblCHZO2.setText(p.calcularMayorPosision(ozch));
        lblDBZO2.setText(p.calcularMenorPosision(ozdb));

        oxchsEM = lblCHXO2.getText();
        oxdbsEM = lblDBXO2.getText();
        oychsEM = lblCHYO2.getText();
        oydbsEM = lblDBYO2.getText();
        ozchsEM = lblCHZO2.getText();
        ozdbsEM = lblDBZO2.getText();

    }

    public void recomendarTempos() {

         ////////////  Reciben Arreglos /////////
        ArrayList iTXCH = new ArrayList(); /// Instancias pre fusion
        ArrayList iTYCH = new ArrayList();
        ArrayList iTZCH = new ArrayList();

        ArrayList cenTXCH = new ArrayList(); /// Centroides Tempos tempos ch
        ArrayList cenTYCH = new ArrayList();
        ArrayList cenTZCH = new ArrayList();

        ArrayList cenTXDB = new ArrayList(); /// centroide tempos db
        ArrayList cenTYDB = new ArrayList();
        ArrayList cenTZDB = new ArrayList();

        ArrayList insTXCH = new ArrayList(); /// Instancias fusion
        ArrayList insTYCH = new ArrayList();
        ArrayList insTZCH = new ArrayList();

        ArrayList ppTXCH = new ArrayList(); /// centroide promedio ponderado tempos
        ArrayList ppTYCH = new ArrayList();
        ArrayList ppTZCH = new ArrayList();

        ArrayList ppTXDB = new ArrayList(); /// centroide promedio ponderado duracion
        ArrayList ppTYDB = new ArrayList();
        ArrayList ppTZDB = new ArrayList();

        ArrayList paTXCH = new ArrayList(); /// centroide promedio aritmetico tempos ch
        ArrayList paTYCH = new ArrayList();
        ArrayList paTZCH = new ArrayList();

        ArrayList paTXDB = new ArrayList(); /// centroide promedio artimetico tempos db
        ArrayList paTYDB = new ArrayList();
        ArrayList paTZDB = new ArrayList();

//////////////////  TEMPO EN X  //////////////////////////////      
        ////////// calinsky - harabaz /////////
        if (txchs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTXCH = CExtraer.arrayTempoXCprueba;
            iTXCH = CExtraer.arrayTempoXIprueba;
            res = Double.parseDouble((String) iTXCH.get(0));
            for (int i = 0; i < iTXCH.size(); i++) {
                if (Double.parseDouble((String) iTXCH.get(i)) > res) {
                    System.out.println(iTXCH.get(i));
                    res = Double.parseDouble((String) iTXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTXCH.setText(cenTXCH.get(iposision).toString());
        }

        if (txchs == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTXCH = CFusionar.arregloInstanciasTX1;
            ppTXCH = CFusionar.arregloPPTX1;

            res = Double.parseDouble((String) insTXCH.get(0));
            for (int i = 0; i < insTXCH.size(); i++) {
                if (Double.parseDouble((String) insTXCH.get(i)) > res) {
                    System.out.println(insTXCH.get(i));

                    res = Double.parseDouble((String) insTXCH.get(i));
                    iposision = i;

                    System.out.println(iposision);

                }
            }
            valorTXCH.setText(ppTXCH.get(iposision).toString());
        }

        if (txchs == "Fusion PA") {

            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTXCH = CFusionar.arregloInstanciasTX1;
            paTXCH = CFusionar.arregloPATX1;
            res = Double.parseDouble((String) insTXCH.get(0));
            for (int i = 0; i < insTXCH.size(); i++) {
                if (Double.parseDouble((String) insTXCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTXCH.get(i));
                    iposision = i;
                }
            }
            valorTXCH.setText(paTXCH.get(iposision).toString());

        }

        //////////// davies bouldin //////////////
        if (txdbs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTXDB = CExtraer.arrayTempoXCprueba;
            iTXCH = CExtraer.arrayTempoXIprueba;
            res = Double.parseDouble((String) iTXCH.get(0));
            for (int i = 0; i < iTXCH.size(); i++) {
                if (Double.parseDouble((String) iTXCH.get(i)) > res) {
                    System.out.println(iTXCH.get(i));
                    res = Double.parseDouble((String) iTXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTXDB.setText(cenTXDB.get(iposision).toString());
        }

        if (txdbs == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTXCH = CFusionar.arregloInstanciasTX1;
            ppTXDB = CFusionar.arregloPPTX1;
            res = Double.parseDouble((String) insTXCH.get(0));
            for (int i = 0; i < insTXCH.size(); i++) {
                if (Double.parseDouble((String) insTXCH.get(i)) > res) {
                    System.out.println(insTXCH.get(i));
                    res = Double.parseDouble((String) insTXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTXDB.setText(ppTXDB.get(iposision).toString());
        }
        if (txdbs == "Fusion PA") {

            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTXCH = CFusionar.arregloInstanciasTX1;
            paTXDB = CFusionar.arregloPATX1;
            res = Double.parseDouble((String) insTXCH.get(0));
            for (int i = 0; i < insTXCH.size(); i++) {
                if (Double.parseDouble((String) insTXCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTXCH.get(i));
                    iposision = i;
                }
            }
            valorTXDB.setText(paTXDB.get(iposision).toString());

        }

        ///////////// TEMPO EN Y //////////// 
        ////////////  calinsky - harabaz /////////////
        if (tychs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTYCH = CExtraer.arrayTempoYCprueba;
            iTYCH = CExtraer.arrayTempoYIprueba;
            res = Double.parseDouble((String) iTYCH.get(0));
            for (int i = 0; i < iTYCH.size(); i++) {
                if (Double.parseDouble((String) iTYCH.get(i)) > res) {
                    System.out.println(iTYCH.get(i));
                    res = Double.parseDouble((String) iTYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTYCH.setText(cenTYCH.get(iposision).toString());
        }

        if (tychs == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTYCH = CFusionar.arregloInstanciasTY1;
            ppTYCH = CFusionar.arregloPPTY1;
            res = Double.parseDouble((String) insTYCH.get(0));
            for (int i = 0; i < insTYCH.size(); i++) {
                if (Double.parseDouble((String) insTYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTYCH.get(i));
                    iposision = i;
                }
            }
            valorTYCH.setText(ppTYCH.get(iposision).toString());

        }

        if (tychs == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTYCH = CFusionar.arregloInstanciasTY1;
            paTYCH = CFusionar.arregloPATY1;
            res = Double.parseDouble((String) insTYCH.get(0));
            for (int i = 0; i < insTYCH.size(); i++) {
                if (Double.parseDouble((String) insTYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTYCH.get(i));
                    iposision = i;
                }
            }
            valorTYCH.setText(paTYCH.get(iposision).toString());
        }
        /////////// davies - bouldin /////////////
        if (tydbs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTYDB = CExtraer.arrayTempoYCprueba;
            iTYCH = CExtraer.arrayTempoYIprueba;
            res = Double.parseDouble((String) iTYCH.get(0));
            for (int i = 0; i < iTYCH.size(); i++) {
                if (Double.parseDouble((String) iTYCH.get(i)) > res) {
                    System.out.println(iTYCH.get(i));
                    res = Double.parseDouble((String) iTYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTYDB.setText(cenTYDB.get(iposision).toString());
        }

        if (tydbs == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTYCH = CFusionar.arregloInstanciasTY1;
            ppTYDB = CFusionar.arregloPPTY1;
            res = Double.parseDouble((String) insTYCH.get(0));
            for (int i = 0; i < insTYCH.size(); i++) {
                if (Double.parseDouble((String) insTYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTYCH.get(i));
                    iposision = i;
                }
            }
            valorTYDB.setText(ppTYDB.get(iposision).toString());
        }
        if (tydbs == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTYCH = CFusionar.arregloInstanciasTY1;
            paTYDB = CFusionar.arregloPATY1;
            res = Double.parseDouble((String) insTYCH.get(0));
            for (int i = 0; i < insTYCH.size(); i++) {
                if (Double.parseDouble((String) insTYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTYCH.get(i));
                    iposision = i;
                }
            }
            valorTYDB.setText(paTYDB.get(iposision).toString());
        }

        ///////////// TEMPO EN Z ////////////       
        ///////////// calinsky harabaz ///////////////////
        if (tzchs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTZCH = CExtraer.arrayTempoZCprueba;
            iTZCH = CExtraer.arrayTempoZIprueba;
            res = Double.parseDouble((String) iTZCH.get(0));
            for (int i = 0; i < iTZCH.size(); i++) {
                if (Double.parseDouble((String) iTZCH.get(i)) > res) {
                    System.out.println(iTZCH.get(i));
                    res = Double.parseDouble((String) iTZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTZCH.setText(cenTZCH.get(iposision).toString());
        }

        if (tzchs == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTZCH = CFusionar.arregloInstanciasTZ1;
            ppTZCH = CFusionar.arregloPPTZ1;
            res = Double.parseDouble((String) insTZCH.get(0));
            for (int i = 0; i < insTZCH.size(); i++) {
                if (Double.parseDouble((String) insTZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTZCH.get(i));
                    iposision = i;
                }
            }
            valorTZCH.setText(ppTZCH.get(iposision).toString());
        }
        if (tzchs == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTZCH = CFusionar.arregloInstanciasTZ1;
            paTZCH = CFusionar.arregloPATZ1;
            res = Double.parseDouble((String) insTZCH.get(0));
            for (int i = 0; i < insTZCH.size(); i++) {
                if (Double.parseDouble((String) insTZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTZCH.get(i));
                    iposision = i;
                }
            }
            valorTZCH.setText(paTZCH.get(iposision).toString());
        }

    ///////////// davies bouldin ///////////////////   
        if (tzdbs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTZDB = CExtraer.arrayTempoZCprueba;
            iTZCH = CExtraer.arrayTempoZIprueba;
            res = Double.parseDouble((String) iTZCH.get(0));
            for (int i = 0; i < iTZCH.size(); i++) {
                if (Double.parseDouble((String) iTZCH.get(i)) > res) {
                    System.out.println(iTZCH.get(i));
                    res = Double.parseDouble((String) iTZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTZDB.setText(cenTZDB.get(iposision).toString());
        }

        if (tzdbs == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTZCH = CFusionar.arregloInstanciasTZ1;
            ppTZDB = CFusionar.arregloPPTZ1;
            res = Double.parseDouble((String) insTZCH.get(0));
            for (int i = 0; i < insTZCH.size(); i++) {
                if (Double.parseDouble((String) insTZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTZCH.get(i));
                    iposision = i;
                }
            }
            valorTZDB.setText(ppTZDB.get(iposision).toString());
        }
        //////////
        if (tzdbs == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTZCH = CFusionar.arregloInstanciasTZ1;
            paTZDB = CFusionar.arregloPATZ1;
            res = Double.parseDouble((String) insTZCH.get(0));
            for (int i = 0; i < insTZCH.size(); i++) {
                if (Double.parseDouble((String) insTZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTZCH.get(i));
                    iposision = i;
                }
            }
            valorTZDB.setText(paTZDB.get(iposision).toString());
        }

    }

    public void recomendarTemposXM() {

        ArrayList iTXCH = new ArrayList();
        ArrayList iTYCH = new ArrayList();
        ArrayList iTZCH = new ArrayList();

        ArrayList cenTXCH = new ArrayList();
        ArrayList cenTYCH = new ArrayList();
        ArrayList cenTZCH = new ArrayList();

        ArrayList cenTXDB = new ArrayList();
        ArrayList cenTYDB = new ArrayList();
        ArrayList cenTZDB = new ArrayList();

        ArrayList insTXCH = new ArrayList();
        ArrayList insTYCH = new ArrayList();
        ArrayList insTZCH = new ArrayList();

        ArrayList ppTXCH = new ArrayList();
        ArrayList ppTYCH = new ArrayList();
        ArrayList ppTZCH = new ArrayList();

        ArrayList ppTXDB = new ArrayList();
        ArrayList ppTYDB = new ArrayList();
        ArrayList ppTZDB = new ArrayList();

        ArrayList paTXCH = new ArrayList();
        ArrayList paTYCH = new ArrayList();
        ArrayList paTZCH = new ArrayList();

        ArrayList paTXDB = new ArrayList();
        ArrayList paTYDB = new ArrayList();
        ArrayList paTZDB = new ArrayList();

//////////////////  TEMPO EN X  //////////////////////////////      
        ////////// calinsky - harabaz /////////
        if (txchsX == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTXCH = CExtraer.arrayTempoXCpruebaX;
            iTXCH = CExtraer.arrayTempoXIpruebaX;
            res = Double.parseDouble((String) iTXCH.get(0));
            for (int i = 0; i < iTXCH.size(); i++) {
                if (Double.parseDouble((String) iTXCH.get(i)) > res) {
                    System.out.println(iTXCH.get(i));
                    res = Double.parseDouble((String) iTXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTXCH1.setText(cenTXCH.get(iposision).toString());
        }

        if (txchsX == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTXCH = CFusionarXM.arregloInstanciasTXX;
            ppTXCH = CFusionarXM.arregloPPTXX;
            res = Double.parseDouble((String) insTXCH.get(0));
            for (int i = 0; i < insTXCH.size(); i++) {
                if (Double.parseDouble((String) insTXCH.get(i)) > res) {
                    System.out.println(insTXCH.get(i));

                    res = Double.parseDouble((String) insTXCH.get(i));
                    iposision = i;

                    System.out.println(iposision);

                }
            }
            valorTXCH1.setText(ppTXCH.get(iposision).toString());
        }

        if (txchsX == "Fusion PA") {

            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTXCH = CFusionarXM.arregloInstanciasTXX;
            paTXCH = CFusionarXM.arregloPATXX;
            res = Double.parseDouble((String) insTXCH.get(0));
            for (int i = 0; i < insTXCH.size(); i++) {
                if (Double.parseDouble((String) insTXCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTXCH.get(i));
                    iposision = i;
                }
            }
            valorTXCH1.setText(paTXCH.get(iposision).toString());

        }

        //////////// davies bouldin //////////////
        if (txdbsX == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTXDB = CExtraer.arrayTempoXCpruebaX;
            iTXCH = CExtraer.arrayTempoXIpruebaX;
            res = Double.parseDouble((String) iTXCH.get(0));
            for (int i = 0; i < iTXCH.size(); i++) {
                if (Double.parseDouble((String) iTXCH.get(i)) > res) {
                    System.out.println(iTXCH.get(i));
                    res = Double.parseDouble((String) iTXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTXDB1.setText(cenTXDB.get(iposision).toString());
        }

        if (txdbsX == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTXCH = CFusionarXM.arregloInstanciasTXX;
            ppTXDB = CFusionarXM.arregloPPTXX;
            res = Double.parseDouble((String) insTXCH.get(0));
            for (int i = 0; i < insTXCH.size(); i++) {
                if (Double.parseDouble((String) insTXCH.get(i)) > res) {
                    System.out.println(insTXCH.get(i));
                    res = Double.parseDouble((String) insTXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTXDB1.setText(ppTXDB.get(iposision).toString());
        }
        if (txdbsX == "Fusion PA") {

            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTXCH = CFusionarXM.arregloInstanciasTXX;
            paTXDB = CFusionarXM.arregloPATXX;
            res = Double.parseDouble((String) insTXCH.get(0));
            for (int i = 0; i < insTXCH.size(); i++) {
                if (Double.parseDouble((String) insTXCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTXCH.get(i));
                    iposision = i;
                }
            }
            valorTXDB1.setText(paTXDB.get(iposision).toString());

        }

        ///////////// TEMPO EN Y //////////// 
        ////////////  calinsky - harabaz /////////////
        if (tychsX == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTYCH = CExtraer.arrayTempoYCpruebaX;
            iTYCH = CExtraer.arrayTempoYIpruebaX;
            res = Double.parseDouble((String) iTYCH.get(0));
            for (int i = 0; i < iTYCH.size(); i++) {
                if (Double.parseDouble((String) iTYCH.get(i)) > res) {
                    System.out.println(iTYCH.get(i));
                    res = Double.parseDouble((String) iTYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTYCH1.setText(cenTYCH.get(iposision).toString());
        }

        if (tychsX == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTYCH = CFusionarXM.arregloInstanciasTYX;
            ppTYCH = CFusionarXM.arregloPPTYX;
            res = Double.parseDouble((String) insTYCH.get(0));
            for (int i = 0; i < insTYCH.size(); i++) {
                if (Double.parseDouble((String) insTYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTYCH.get(i));
                    iposision = i;
                }
            }
            valorTYCH1.setText(ppTYCH.get(iposision).toString());

        }

        if (tychsX == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTYCH = CFusionarXM.arregloInstanciasTYX;
            paTYCH = CFusionarXM.arregloPATY1X;
            res = Double.parseDouble((String) insTYCH.get(0));
            for (int i = 0; i < insTYCH.size(); i++) {
                if (Double.parseDouble((String) insTYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTYCH.get(i));
                    iposision = i;
                }
            }
            valorTYCH1.setText(paTYCH.get(iposision).toString());
        }
        /////////// davies - bouldin /////////////  
        if (tydbsX == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTYDB = CExtraer.arrayTempoYCpruebaX;
            iTYCH = CExtraer.arrayTempoYIpruebaX;
            res = Double.parseDouble((String) iTYCH.get(0));
            for (int i = 0; i < iTYCH.size(); i++) {
                if (Double.parseDouble((String) iTYCH.get(i)) > res) {
                    System.out.println(iTYCH.get(i));
                    res = Double.parseDouble((String) iTYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTYDB1.setText(cenTYDB.get(iposision).toString());
        }

        if (tydbsX == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTYCH = CFusionarXM.arregloInstanciasTYX;
            ppTYDB = CFusionarXM.arregloPPTYX;
            res = Double.parseDouble((String) insTYCH.get(0));
            for (int i = 0; i < insTYCH.size(); i++) {
                if (Double.parseDouble((String) insTYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTYCH.get(i));
                    iposision = i;
                }
            }
            valorTYDB1.setText(ppTYDB.get(iposision).toString());
        }
        if (tydbsX == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTYCH = CFusionarXM.arregloInstanciasTYX;
            paTYDB = CFusionarXM.arregloPATYX;
            res = Double.parseDouble((String) insTYCH.get(0));
            for (int i = 0; i < insTYCH.size(); i++) {
                if (Double.parseDouble((String) insTYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTYCH.get(i));
                    iposision = i;
                }
            }
            valorTYDB1.setText(paTYDB.get(iposision).toString());
        }

        ///////////// TEMPO EN Z ////////////       
        ///////////// calinsky harabaz ///////////////////
        if (tzchsX == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTZCH = CExtraer.arrayTempoZCpruebaX;
            iTZCH = CExtraer.arrayTempoZIpruebaX;
            res = Double.parseDouble((String) iTZCH.get(0));
            for (int i = 0; i < iTZCH.size(); i++) {
                if (Double.parseDouble((String) iTZCH.get(i)) > res) {
                    System.out.println(iTZCH.get(i));
                    res = Double.parseDouble((String) iTZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTZCH1.setText(cenTZCH.get(iposision).toString());
        }

        if (tzchsX == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTZCH = CFusionarXM.arregloInstanciasTZX;
            ppTZCH = CFusionarXM.arregloPPTZX;
            res = Double.parseDouble((String) insTZCH.get(0));
            for (int i = 0; i < insTZCH.size(); i++) {
                if (Double.parseDouble((String) insTZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTZCH.get(i));
                    iposision = i;
                }
            }
            valorTZCH1.setText(ppTZCH.get(iposision).toString());
        }
        if (tzchsX == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTZCH = CFusionarXM.arregloInstanciasTZX;
            paTZCH = CFusionarXM.arregloPATZX;
            res = Double.parseDouble((String) insTZCH.get(0));
            for (int i = 0; i < insTZCH.size(); i++) {
                if (Double.parseDouble((String) insTZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTZCH.get(i));
                    iposision = i;
                }
            }
            valorTZCH1.setText(paTZCH.get(iposision).toString());
        }

    ///////////// davies bouldin ///////////////////  
        if (tzdbsX == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTZDB = CExtraer.arrayTempoZCpruebaX;
            iTZCH = CExtraer.arrayTempoZIpruebaX;
            res = Double.parseDouble((String) iTZCH.get(0));
            for (int i = 0; i < iTZCH.size(); i++) {
                if (Double.parseDouble((String) iTZCH.get(i)) > res) {
                    System.out.println(iTZCH.get(i));
                    res = Double.parseDouble((String) iTZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTZDB1.setText(cenTZDB.get(iposision).toString());
        }

        if (tzdbsX == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTZCH = CFusionarXM.arregloInstanciasTZX;
            ppTZDB = CFusionarXM.arregloPPTZX;
            res = Double.parseDouble((String) insTZCH.get(0));
            for (int i = 0; i < insTZCH.size(); i++) {
                if (Double.parseDouble((String) insTZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTZCH.get(i));
                    iposision = i;
                }
            }
            valorTZDB1.setText(ppTZDB.get(iposision).toString());
        }
        //////////
        if (tzdbsX == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTZCH = CFusionarXM.arregloInstanciasTZX;
            paTZDB = CFusionarXM.arregloPATZX;
            res = Double.parseDouble((String) insTZCH.get(0));
            for (int i = 0; i < insTZCH.size(); i++) {
                if (Double.parseDouble((String) insTZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTZCH.get(i));
                    iposision = i;
                }
            }
            valorTZDB1.setText(paTZDB.get(iposision).toString());
        }

    }

    public void recomendarTemposEM() {

         ////////////  Reciben Arreglos /////////
        ArrayList iTXCH = new ArrayList(); /// Instancias pre fusion
        ArrayList iTYCH = new ArrayList();
        ArrayList iTZCH = new ArrayList();

        ArrayList cenTXCH = new ArrayList(); /// Centroides Tempos tempos ch
        ArrayList cenTYCH = new ArrayList();
        ArrayList cenTZCH = new ArrayList();

        ArrayList cenTXDB = new ArrayList(); /// centroide tempos db
        ArrayList cenTYDB = new ArrayList();
        ArrayList cenTZDB = new ArrayList();

        ArrayList insTXCH = new ArrayList(); /// Instancias fusion
        ArrayList insTYCH = new ArrayList();
        ArrayList insTZCH = new ArrayList();

        ArrayList ppTXCH = new ArrayList(); /// centroide promedio ponderado tempos
        ArrayList ppTYCH = new ArrayList();
        ArrayList ppTZCH = new ArrayList();

        ArrayList ppTXDB = new ArrayList(); /// centroide promedio ponderado duracion
        ArrayList ppTYDB = new ArrayList();
        ArrayList ppTZDB = new ArrayList();

        ArrayList paTXCH = new ArrayList(); /// centroide promedio aritmetico tempos ch
        ArrayList paTYCH = new ArrayList();
        ArrayList paTZCH = new ArrayList();

        ArrayList paTXDB = new ArrayList(); /// centroide promedio artimetico tempos db
        ArrayList paTYDB = new ArrayList();
        ArrayList paTZDB = new ArrayList();

//////////////////  TEMPO EN X  //////////////////////////////      
        ////////// calinsky - harabaz /////////
        if (txchsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTXCH = CExtraer.arrayTempoXCpruebaEM;
            iTXCH = CExtraer.arrayTempoXIpruebaEM;
            res = Double.parseDouble((String) iTXCH.get(0));
            for (int i = 0; i < iTXCH.size(); i++) {
                if (Double.parseDouble((String) iTXCH.get(i)) > res) {
                    System.out.println(iTXCH.get(i));
                    res = Double.parseDouble((String) iTXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTXCH2.setText(cenTXCH.get(iposision).toString());
        }

        if (txchsEM == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTXCH = CFusionarEM.arregloInstanciasTX1EM;
            ppTXCH = CFusionarEM.arregloPPTX1EM;

            res = Double.parseDouble((String) insTXCH.get(0));
            for (int i = 0; i < insTXCH.size(); i++) {
                if (Double.parseDouble((String) insTXCH.get(i)) > res) {
                    System.out.println(insTXCH.get(i));

                    res = Double.parseDouble((String) insTXCH.get(i));
                    iposision = i;

                    System.out.println(iposision);

                }
            }
            valorTXCH2.setText(ppTXCH.get(iposision).toString());
        }

        if (txchsEM == "Fusion PA") {

            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTXCH = CFusionarEM.arregloInstanciasTX1EM;
            paTXCH = CFusionarEM.arregloPATX1EM;
            res = Double.parseDouble((String) insTXCH.get(0));
            for (int i = 0; i < insTXCH.size(); i++) {
                if (Double.parseDouble((String) insTXCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTXCH.get(i));
                    iposision = i;
                }
            }
            valorTXCH2.setText(paTXCH.get(iposision).toString());

        }

        //////////// davies bouldin //////////////
        if (txdbsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTXDB = CExtraer.arrayTempoXCpruebaEM;
            iTXCH = CExtraer.arrayTempoXIpruebaEM;
            res = Double.parseDouble((String) iTXCH.get(0));
            for (int i = 0; i < iTXCH.size(); i++) {
                if (Double.parseDouble((String) iTXCH.get(i)) > res) {
                    System.out.println(iTXCH.get(i));
                    res = Double.parseDouble((String) iTXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTXDB2.setText(cenTXDB.get(iposision).toString());
        }

        if (txdbsEM == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTXCH = CFusionarEM.arregloInstanciasTX1EM;
            ppTXDB = CFusionarEM.arregloPPTX1EM;
            res = Double.parseDouble((String) insTXCH.get(0));
            for (int i = 0; i < insTXCH.size(); i++) {
                if (Double.parseDouble((String) insTXCH.get(i)) > res) {
                    System.out.println(insTXCH.get(i));
                    res = Double.parseDouble((String) insTXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTXDB2.setText(ppTXDB.get(iposision).toString());
        }
        if (txdbsEM == "Fusion PA") {

            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTXCH = CFusionarEM.arregloInstanciasTX1EM;
            paTXDB = CFusionarEM.arregloPATX1EM;

            res = Double.parseDouble((String) insTXCH.get(0));
            for (int i = 0; i < insTXCH.size(); i++) {
                if (Double.parseDouble((String) insTXCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTXCH.get(i));
                    iposision = i;
                }
            }
            valorTXDB2.setText(paTXDB.get(iposision).toString());

        }

        ///////////// TEMPO EN Y //////////// 
        ////////////  calinsky - harabaz /////////////
        if (tychsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTYCH = CExtraer.arrayTempoYCpruebaEM;
            iTYCH = CExtraer.arrayTempoYIpruebaEM;
            res = Double.parseDouble((String) iTYCH.get(0));
            for (int i = 0; i < iTYCH.size(); i++) {
                if (Double.parseDouble((String) iTYCH.get(i)) > res) {
                    System.out.println(iTYCH.get(i));
                    res = Double.parseDouble((String) iTYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTYCH2.setText(cenTYCH.get(iposision).toString());
        }

        if (tychsEM == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTYCH = CFusionarEM.arregloInstanciasTY1EM;
            ppTYCH = CFusionarEM.arregloPPTY1EM;
            res = Double.parseDouble((String) insTYCH.get(0));
            for (int i = 0; i < insTYCH.size(); i++) {
                if (Double.parseDouble((String) insTYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTYCH.get(i));
                    iposision = i;
                }
            }
            valorTYCH2.setText(ppTYCH.get(iposision).toString());

        }

        if (tychsEM == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTYCH = CFusionarEM.arregloInstanciasTY1EM;
            paTYCH = CFusionarEM.arregloPATY1EM;
            res = Double.parseDouble((String) insTYCH.get(0));
            for (int i = 0; i < insTYCH.size(); i++) {
                if (Double.parseDouble((String) insTYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTYCH.get(i));
                    iposision = i;
                }
            }
            valorTYCH2.setText(paTYCH.get(iposision).toString());
        }
        /////////// davies - bouldin /////////////
        if (tydbsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTYDB = CExtraer.arrayTempoYCpruebaEM;
            iTYCH = CExtraer.arrayTempoYIpruebaEM;
            res = Double.parseDouble((String) iTYCH.get(0));
            for (int i = 0; i < iTYCH.size(); i++) {
                if (Double.parseDouble((String) iTYCH.get(i)) > res) {
                    System.out.println(iTYCH.get(i));
                    res = Double.parseDouble((String) iTYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTYDB2.setText(cenTYDB.get(iposision).toString());
        }

        if (tydbsEM == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTYCH = CFusionarEM.arregloInstanciasTY1EM;
            ppTYDB = CFusionarEM.arregloPPTY1EM;
            res = Double.parseDouble((String) insTYCH.get(0));
            for (int i = 0; i < insTYCH.size(); i++) {
                if (Double.parseDouble((String) insTYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTYCH.get(i));
                    iposision = i;
                }
            }
            valorTYDB2.setText(ppTYDB.get(iposision).toString());
        }
        if (tydbsEM == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTYCH = CFusionarEM.arregloInstanciasTY1EM;
            paTYDB = CFusionarEM.arregloPATY1EM;
            res = Double.parseDouble((String) insTYCH.get(0));
            for (int i = 0; i < insTYCH.size(); i++) {
                if (Double.parseDouble((String) insTYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTYCH.get(i));
                    iposision = i;
                }
            }
            valorTYDB2.setText(paTYDB.get(iposision).toString());
        }

        ///////////// TEMPO EN Z ////////////       
        ///////////// calinsky harabaz ///////////////////
        if (tzchsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTZCH = CExtraer.arrayTempoZCpruebaEM;
            iTZCH = CExtraer.arrayTempoZIpruebaEM;
            res = Double.parseDouble((String) iTZCH.get(0));
            for (int i = 0; i < iTZCH.size(); i++) {
                if (Double.parseDouble((String) iTZCH.get(i)) > res) {
                    System.out.println(iTZCH.get(i));
                    res = Double.parseDouble((String) iTZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTZCH2.setText(cenTZCH.get(iposision).toString());
        }

        if (tzchsEM == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTZCH = CFusionarEM.arregloInstanciasTZ1EM;
            ppTZCH = CFusionarEM.arregloPPTZ1EM;
            res = Double.parseDouble((String) insTZCH.get(0));
            for (int i = 0; i < insTZCH.size(); i++) {
                if (Double.parseDouble((String) insTZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTZCH.get(i));
                    iposision = i;
                }
            }
            valorTZCH2.setText(ppTZCH.get(iposision).toString());
        }
        if (tzchsEM == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTZCH = CFusionarEM.arregloInstanciasTZ1EM;
            paTZCH = CFusionarEM.arregloPATZ1EM;
            res = Double.parseDouble((String) insTZCH.get(0));
            for (int i = 0; i < insTZCH.size(); i++) {
                if (Double.parseDouble((String) insTZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTZCH.get(i));
                    iposision = i;
                }
            }
            valorTZCH2.setText(paTZCH.get(iposision).toString());
        }

    ///////////// davies bouldin ///////////////////   
        if (tzdbsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenTZDB = CExtraer.arrayTempoZCpruebaEM;
            iTZCH = CExtraer.arrayTempoZIpruebaEM;
            res = Double.parseDouble((String) iTZCH.get(0));
            for (int i = 0; i < iTZCH.size(); i++) {
                if (Double.parseDouble((String) iTZCH.get(i)) > res) {
                    System.out.println(iTZCH.get(i));
                    res = Double.parseDouble((String) iTZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorTZDB2.setText(cenTZDB.get(iposision).toString());
        }

        if (tzdbsEM == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTZCH = CFusionarEM.arregloInstanciasTZ1EM;
            ppTZDB = CFusionarEM.arregloPPTZ1EM;
            res = Double.parseDouble((String) insTZCH.get(0));
            for (int i = 0; i < insTZCH.size(); i++) {
                if (Double.parseDouble((String) insTZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTZCH.get(i));
                    iposision = i;
                }
            }
            valorTZDB2.setText(ppTZDB.get(iposision).toString());
        }
        //////////
        if (tzdbsEM == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insTZCH = CFusionarEM.arregloInstanciasTZ1EM;
            paTZDB = CFusionarEM.arregloPATZ1EM;
            res = Double.parseDouble((String) insTZCH.get(0));
            for (int i = 0; i < insTZCH.size(); i++) {
                if (Double.parseDouble((String) insTZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insTZCH.get(i));
                    iposision = i;
                }
            }
            valorTZDB2.setText(paTZDB.get(iposision).toString());
        }

    }

    public void recomendarDuracion() {

        ArrayList iDXCH = new ArrayList();
        ArrayList iDYCH = new ArrayList();
        ArrayList iDZCH = new ArrayList();

        ArrayList cenDXCH = new ArrayList();
        ArrayList cenDYCH = new ArrayList();
        ArrayList cenDZCH = new ArrayList();

        ArrayList cenDXDB = new ArrayList();
        ArrayList cenDYDB = new ArrayList();
        ArrayList cenDZDB = new ArrayList();

        ArrayList insDXCH = new ArrayList();
        ArrayList insDYCH = new ArrayList();
        ArrayList insDZCH = new ArrayList();

        ArrayList ppDXCH = new ArrayList();
        ArrayList ppDYCH = new ArrayList();
        ArrayList ppDZCH = new ArrayList();

        ArrayList ppDXDB = new ArrayList();
        ArrayList ppDYDB = new ArrayList();
        ArrayList ppDZDB = new ArrayList();

        ArrayList paDXCH = new ArrayList();
        ArrayList paDYCH = new ArrayList();
        ArrayList paDZCH = new ArrayList();

        ArrayList paDXDB = new ArrayList();
        ArrayList paDYDB = new ArrayList();
        ArrayList paDZDB = new ArrayList();

//////////////////  TEMPO EN X  //////////////////////////////      
        ////////// calinsky - harabaz /////////
        if (dxchs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDXCH = CExtraer.arrayDuracionXCprueba;
            iDXCH = CExtraer.arrayDuracionXIprueba;
            res = Double.parseDouble((String) iDXCH.get(0));
            for (int i = 0; i < iDXCH.size(); i++) {
                if (Double.parseDouble((String) iDXCH.get(i)) > res) {
                    System.out.println(iDXCH.get(i));
                    res = Double.parseDouble((String) iDXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDXCH.setText(cenDXCH.get(iposision).toString());
        }

        insDXCH = CFusionar.arregloInstanciasDX1;

        if (insDXCH.isEmpty()) {
            if (dxchs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionar.arregloInstanciasDX;
                paDXCH = CFusionar.arregloPADX;
                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXCH.setText(ppDXCH.get(iposision).toString());
            }

            if (dxchs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionar.arregloInstanciasDX;
                paDXCH = CFusionar.arregloPADX;

                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXCH.setText(paDXCH.get(iposision).toString());

            }

        } else {
            if (dxchs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionar.arregloInstanciasDX1;
                ppDXCH = CFusionar.arregloPPDX1;
                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXCH.setText(ppDXCH.get(iposision).toString());
            }

            if (dxchs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionar.arregloInstanciasDX1;
                paDXCH = CFusionar.arregloPADX1;

                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXCH.setText(paDXCH.get(iposision).toString());

            }
        }

        //////////// davies bouldin //////////////
        if (dxdbs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDXDB = CExtraer.arrayDuracionXCprueba;
            iDXCH = CExtraer.arrayDuracionXIprueba;
            res = Double.parseDouble((String) iDXCH.get(0));
            for (int i = 0; i < iDXCH.size(); i++) {
                if (Double.parseDouble((String) iDXCH.get(i)) > res) {
                    System.out.println(iDXCH.get(i));
                    res = Double.parseDouble((String) iDXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDXDB.setText(cenDXDB.get(iposision).toString());
        }

        insDXCH = CFusionar.arregloInstanciasDX1;

        if (insDXCH.isEmpty()) {
            if (dxdbs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionar.arregloInstanciasDX;
                ppDXDB = CFusionar.arregloPPDX;
                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXDB.setText(ppDXDB.get(iposision).toString());
            }
            if (dxdbs == "Fusion PA") {

                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionar.arregloInstanciasDX;
                paDXDB = CFusionar.arregloPADX;
                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXDB.setText(paDXDB.get(iposision).toString());

            }

        } else {
            if (dxdbs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionar.arregloInstanciasDX1;
                ppDXDB = CFusionar.arregloPPDX1;
                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXDB.setText(ppDXDB.get(iposision).toString());
            }
            if (dxdbs == "Fusion PA") {

                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionar.arregloInstanciasDX1;
                paDXDB = CFusionar.arregloPADX1;
                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXDB.setText(paDXDB.get(iposision).toString());

            }
        }

        ///////////// TEMPO EN Y //////////// 
        ////////////  calinsky - harabaz /////////////
        if (dychs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDYCH = CExtraer.arrayDuracionYCprueba;
            iDYCH = CExtraer.arrayDuracionYIprueba;
            res = Double.parseDouble((String) iDYCH.get(0));
            for (int i = 0; i < iDYCH.size(); i++) {
                if (Double.parseDouble((String) iDYCH.get(i)) > res) {
                    System.out.println(iDYCH.get(i));
                    res = Double.parseDouble((String) iDYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDYCH.setText(cenDYCH.get(iposision).toString());
        }

        insDYCH = CFusionar.arregloInstanciasDY1;

        if (insDYCH.isEmpty()) {

            if (dychs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionar.arregloInstanciasDY;
                ppDYCH = CFusionar.arregloPPDY;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYCH.setText(ppDYCH.get(iposision).toString());

            }

            if (dychs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionar.arregloInstanciasDY;
                paDYCH = CFusionar.arregloPADY;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYCH.setText(paDYCH.get(iposision).toString());
            }
        } else {
            if (dychs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionar.arregloInstanciasDY1;
                ppDYCH = CFusionar.arregloPPDY1;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYCH.setText(ppDYCH.get(iposision).toString());

            }

            if (dychs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionar.arregloInstanciasDY1;
                paDYCH = CFusionar.arregloPADY1;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYCH.setText(paDYCH.get(iposision).toString());
            }
        }

        /////////// davies - bouldin /////////////
        if (dydbs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDYDB = CExtraer.arrayDuracionYCprueba;
            iDYCH = CExtraer.arrayDuracionYIprueba;
            res = Double.parseDouble((String) iDYCH.get(0));
            for (int i = 0; i < iDYCH.size(); i++) {
                if (Double.parseDouble((String) iDYCH.get(i)) > res) {
                    System.out.println(iDYCH.get(i));
                    res = Double.parseDouble((String) iDYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDYDB.setText(cenDYDB.get(iposision).toString());
        }

        insDYCH = CFusionar.arregloInstanciasDY1;
        if (insDYCH.isEmpty()) {

            if (dydbs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionar.arregloInstanciasDY;
                ppDYDB = CFusionar.arregloPPDY;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYDB.setText(ppDYDB.get(iposision).toString());
            }
            if (dydbs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionar.arregloInstanciasDY;
                paDYDB = CFusionar.arregloPADY;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYDB.setText(paDYDB.get(iposision).toString());
            }

        } else {

            if (dydbs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionar.arregloInstanciasDY1;
                ppDYDB = CFusionar.arregloPPDY1;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYDB.setText(ppDYDB.get(iposision).toString());
            }
            if (dydbs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionar.arregloInstanciasDY1;
                paDYDB = CFusionar.arregloPADY1;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYDB.setText(paDYDB.get(iposision).toString());
            }

        }

        ///////////// TEMPO EN Z ////////////       
        ///////////// calinsky harabaz ///////////////////
        if (dzchs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDZCH = CExtraer.arrayDuracionZCprueba;
            iDZCH = CExtraer.arrayDuracionZIprueba;
            res = Double.parseDouble((String) iDZCH.get(0));
            for (int i = 0; i < iDZCH.size(); i++) {
                if (Double.parseDouble((String) iDZCH.get(i)) > res) {
                    System.out.println(iDZCH.get(i));
                    res = Double.parseDouble((String) iDZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDZCH.setText(cenDZCH.get(iposision).toString());
        }

        insDZCH = CFusionar.arregloInstanciasDZ1;
        if (insDZCH.isEmpty()) {
            if (dzchs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionar.arregloInstanciasDZ;
                ppDZCH = CFusionar.arregloPPDZ;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZCH.setText(ppDZCH.get(iposision).toString());
            }
            if (dzchs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionar.arregloInstanciasDZ;
                paDZCH = CFusionar.arregloPADZ;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZCH.setText(paDZCH.get(iposision).toString());
            }
        } else {
            if (dzchs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionar.arregloInstanciasDZ1;
                ppDZCH = CFusionar.arregloPPDZ1;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZCH.setText(ppDZCH.get(iposision).toString());
            }
            if (dzchs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionar.arregloInstanciasDZ1;
                paDZCH = CFusionar.arregloPADZ1;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZCH.setText(paDZCH.get(iposision).toString());
            }

        }
    ///////////// davies bouldin /////////////////// 

        if (dzdbs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDZDB = CExtraer.arrayDuracionZCprueba;
            iDZCH = CExtraer.arrayDuracionZIprueba;
            res = Double.parseDouble((String) iDZCH.get(0));
            for (int i = 0; i < iDZCH.size(); i++) {
                if (Double.parseDouble((String) iDZCH.get(i)) > res) {
                    System.out.println(iDZCH.get(i));
                    res = Double.parseDouble((String) iDZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDZDB.setText(cenDZDB.get(iposision).toString());
        }

        insDZCH = CFusionar.arregloInstanciasDZ1;
        if (insDZCH.isEmpty()) {

            if (dzdbs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionar.arregloInstanciasDZ;
                ppDZDB = CFusionar.arregloPPDZ;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZDB.setText(ppDZDB.get(iposision).toString());
            }
            //////////
            if (dzdbs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionar.arregloInstanciasDZ;
                paDZDB = CFusionar.arregloPADZ;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZDB.setText(paDZDB.get(iposision).toString());
            }
        } else {
            if (dzdbs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionar.arregloInstanciasDZ1;
                ppDZDB = CFusionar.arregloPPDZ1;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZDB.setText(ppDZDB.get(iposision).toString());
            }
            //////////
            if (dzdbs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionar.arregloInstanciasDZ1;
                paDZDB = CFusionar.arregloPADZ1;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZDB.setText(paDZDB.get(iposision).toString());
            }
        }
    }

    public void recomendarDuracionXM() {

        ArrayList iDXCH = new ArrayList();
        ArrayList iDYCH = new ArrayList();
        ArrayList iDZCH = new ArrayList();

        ArrayList cenDXCH = new ArrayList();
        ArrayList cenDYCH = new ArrayList();
        ArrayList cenDZCH = new ArrayList();

        ArrayList cenDXDB = new ArrayList();
        ArrayList cenDYDB = new ArrayList();
        ArrayList cenDZDB = new ArrayList();

        ArrayList insDXCH = new ArrayList();
        ArrayList insDYCH = new ArrayList();
        ArrayList insDZCH = new ArrayList();

        ArrayList ppDXCH = new ArrayList();
        ArrayList ppDYCH = new ArrayList();
        ArrayList ppDZCH = new ArrayList();

        ArrayList ppDXDB = new ArrayList();
        ArrayList ppDYDB = new ArrayList();
        ArrayList ppDZDB = new ArrayList();

        ArrayList paDXCH = new ArrayList();
        ArrayList paDYCH = new ArrayList();
        ArrayList paDZCH = new ArrayList();

        ArrayList paDXDB = new ArrayList();
        ArrayList paDYDB = new ArrayList();
        ArrayList paDZDB = new ArrayList();

//////////////////  TEMPO EN X  //////////////////////////////      
        ////////// calinsky - harabaz /////////
        if (dxchsX == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDXCH = CExtraer.arrayDuracionXCpruebaX;
            iDXCH = CExtraer.arrayDuracionXIpruebaX;
            res = Double.parseDouble((String) iDXCH.get(0));
            for (int i = 0; i < iDXCH.size(); i++) {
                if (Double.parseDouble((String) iDXCH.get(i)) > res) {
                    System.out.println(iDXCH.get(i));
                    res = Double.parseDouble((String) iDXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDXCH1.setText(cenDXCH.get(iposision).toString());
        }

        if (dxchsX == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insDXCH = CFusionarXM.arregloInstanciasDXX;
            ppDXCH = CFusionarXM.arregloPPDXX;
            res = Double.parseDouble((String) insDXCH.get(0));
            for (int i = 0; i < insDXCH.size(); i++) {
                if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                    res = Double.parseDouble((String) insDXCH.get(i));
                    iposision = i;
                }
            }
            valorDXCH1.setText(ppDXCH.get(iposision).toString());
        }

        if (dxchsX == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insDXCH = CFusionarXM.arregloInstanciasDXX;
            paDXCH = CFusionarXM.arregloPADXX;

            res = Double.parseDouble((String) insDXCH.get(0));
            for (int i = 0; i < insDXCH.size(); i++) {
                if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                    res = Double.parseDouble((String) insDXCH.get(i));
                    iposision = i;
                }
            }
            valorDXCH1.setText(paDXCH.get(iposision).toString());

        }

        //////////// davies bouldin //////////////
        if (dxdbsX == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDXDB = CExtraer.arrayDuracionXCpruebaX;
            iDXCH = CExtraer.arrayDuracionXIpruebaX;
            res = Double.parseDouble((String) iDXCH.get(0));
            for (int i = 0; i < iDXCH.size(); i++) {
                if (Double.parseDouble((String) iDXCH.get(i)) > res) {
                    System.out.println(iDXCH.get(i));
                    res = Double.parseDouble((String) iDXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDXDB1.setText(cenDXDB.get(iposision).toString());
        }

        if (dxdbsX == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insDXCH = CFusionarXM.arregloInstanciasDXX;
            ppDXDB = CFusionarXM.arregloPPDXX;
            res = Double.parseDouble((String) insDXCH.get(0));
            for (int i = 0; i < insDXCH.size(); i++) {
                if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                    res = Double.parseDouble((String) insDXCH.get(i));
                    iposision = i;
                }
            }
            valorDXDB1.setText(ppDXDB.get(iposision).toString());
        }

        if (dxdbsX == "Fusion PA") {

            double res = 0;
            double cont = 0;
            int iposision = 0;

            insDXCH = CFusionarXM.arregloInstanciasDXX;
            paDXDB = CFusionarXM.arregloPADXX;
            res = Double.parseDouble((String) insDXCH.get(0));
            for (int i = 0; i < insDXCH.size(); i++) {
                if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                    res = Double.parseDouble((String) insDXCH.get(i));
                    iposision = i;
                }
            }
            valorDXDB1.setText(paDXDB.get(iposision).toString());

        }

        ///////////// TEMPO EN Y //////////// 
        ////////////  calinsky - harabaz /////////////
        if (dychsX == "Pre Fusion") {

            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDYCH = CExtraer.arrayDuracionYCpruebaX;
            iDYCH = CExtraer.arrayDuracionYIpruebaX;
            res = Double.parseDouble((String) iDYCH.get(0));
            for (int i = 0; i < iDYCH.size(); i++) {
                if (Double.parseDouble((String) iDYCH.get(i)) > res) {
                    System.out.println(iDYCH.get(i));
                    res = Double.parseDouble((String) iDYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDYCH1.setText(cenDYCH.get(iposision).toString());

        }

        if (dychsX == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insDYCH = CFusionarXM.arregloInstanciasDYX;
            ppDYCH = CFusionarXM.arregloPPDYX;
            res = Double.parseDouble((String) insDYCH.get(0));
            for (int i = 0; i < insDYCH.size(); i++) {
                if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insDYCH.get(i));
                    iposision = i;
                }
            }
            valorDYCH1.setText(ppDYCH.get(iposision).toString());

        }

        if (dychsX == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insDYCH = CFusionarXM.arregloInstanciasDYX;
            paDYCH = CFusionarXM.arregloPADYX;
            res = Double.parseDouble((String) insDYCH.get(0));
            for (int i = 0; i < insDYCH.size(); i++) {
                if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insDYCH.get(i));
                    iposision = i;
                }
            }
            valorDYCH1.setText(paDYCH.get(iposision).toString());
        }
        /////////// davies - bouldin /////////////   
        if (dydbsX == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDYDB = CExtraer.arrayDuracionYCpruebaX;
            iDYCH = CExtraer.arrayDuracionYIpruebaX;
            res = Double.parseDouble((String) iDYCH.get(0));
            for (int i = 0; i < iDYCH.size(); i++) {
                if (Double.parseDouble((String) iDYCH.get(i)) > res) {
                    System.out.println(iDYCH.get(i));
                    res = Double.parseDouble((String) iDYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDYDB1.setText(cenDYDB.get(iposision).toString());
        }

        if (dydbsX == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insDYCH = CFusionarXM.arregloInstanciasDYX;
            ppDYDB = CFusionarXM.arregloPPDYX;
            res = Double.parseDouble((String) insDYCH.get(0));
            for (int i = 0; i < insDYCH.size(); i++) {
                if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insDYCH.get(i));
                    iposision = i;
                }
            }
            valorDYDB1.setText(ppDYDB.get(iposision).toString());
        }
        if (dydbsX == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insDYCH = CFusionarXM.arregloInstanciasDYX;
            paDYDB = CFusionarXM.arregloPADYX;
            res = Double.parseDouble((String) insDYCH.get(0));
            for (int i = 0; i < insDYCH.size(); i++) {
                if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                    res = Double.parseDouble((String) insDYCH.get(i));
                    iposision = i;
                }
            }
            valorDYDB1.setText(paDYDB.get(iposision).toString());
        }

        ///////////// TEMPO EN Z ////////////       
        ///////////// calinsky harabaz ///////////////////
        if (dzchsX == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDZCH = CExtraer.arrayDuracionZCpruebaX;
            iDZCH = CExtraer.arrayDuracionZIpruebaX;
            res = Double.parseDouble((String) iDZCH.get(0));
            for (int i = 0; i < iDZCH.size(); i++) {
                if (Double.parseDouble((String) iDZCH.get(i)) > res) {
                    System.out.println(iDZCH.get(i));
                    res = Double.parseDouble((String) iDZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDZCH1.setText(cenDZCH.get(iposision).toString());

        }

        if (dzchsX == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insDZCH = CFusionarXM.arregloInstanciasDZX;
            ppDZCH = CFusionarXM.arregloPPDZX;
            res = Double.parseDouble((String) insDZCH.get(0));
            for (int i = 0; i < insDZCH.size(); i++) {
                if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insDZCH.get(i));
                    iposision = i;
                }
            }
            valorDZCH1.setText(ppDZCH.get(iposision).toString());
        }
        if (dzchsX == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insDZCH = CFusionarXM.arregloInstanciasDZX;
            paDZCH = CFusionarXM.arregloPADZX;
            res = Double.parseDouble((String) insDZCH.get(0));
            for (int i = 0; i < insDZCH.size(); i++) {
                if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insDZCH.get(i));
                    iposision = i;
                }
            }
            valorDZCH1.setText(paDZCH.get(iposision).toString());
        }

        ///////////// davies bouldin ///////////////////    
        if (dzdbsX == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDZDB = CExtraer.arrayDuracionZCpruebaX;
            iDZCH = CExtraer.arrayDuracionZIpruebaX;
            res = Double.parseDouble((String) iDZCH.get(0));
            for (int i = 0; i < iDZCH.size(); i++) {
                if (Double.parseDouble((String) iDZCH.get(i)) > res) {
                    System.out.println(iDZCH.get(i));
                    res = Double.parseDouble((String) iDZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDZDB1.setText(cenDZDB.get(iposision).toString());

        }
        if (dzdbsX == "Fusion PP") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insDZCH = CFusionarXM.arregloInstanciasDZX;
            ppDZDB = CFusionarXM.arregloPPDZX;
            res = Double.parseDouble((String) insDZCH.get(0));
            for (int i = 0; i < insDZCH.size(); i++) {
                if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insDZCH.get(i));
                    iposision = i;
                }
            }
            valorDZDB1.setText(ppDZDB.get(iposision).toString());
        }
        //////////////////////////////////////////////////////////////////
        if (dzdbsX == "Fusion PA") {
            double res = 0;
            double cont = 0;
            int iposision = 0;

            insDZCH = CFusionarXM.arregloInstanciasDZX;
            paDZDB = CFusionarXM.arregloPADZX;
            res = Double.parseDouble((String) insDZCH.get(0));
            for (int i = 0; i < insDZCH.size(); i++) {
                if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                    res = Double.parseDouble((String) insDZCH.get(i));
                    iposision = i;
                }
            }
            valorDZDB1.setText(paDZDB.get(iposision).toString());
        }

    }

    public void recomendarDuracionEM() {

        ArrayList iDXCH = new ArrayList();
        ArrayList iDYCH = new ArrayList();
        ArrayList iDZCH = new ArrayList();

        ArrayList cenDXCH = new ArrayList();
        ArrayList cenDYCH = new ArrayList();
        ArrayList cenDZCH = new ArrayList();

        ArrayList cenDXDB = new ArrayList();
        ArrayList cenDYDB = new ArrayList();
        ArrayList cenDZDB = new ArrayList();

        ArrayList insDXCH = new ArrayList();
        ArrayList insDYCH = new ArrayList();
        ArrayList insDZCH = new ArrayList();

        ArrayList ppDXCH = new ArrayList();
        ArrayList ppDYCH = new ArrayList();
        ArrayList ppDZCH = new ArrayList();

        ArrayList ppDXDB = new ArrayList();
        ArrayList ppDYDB = new ArrayList();
        ArrayList ppDZDB = new ArrayList();

        ArrayList paDXCH = new ArrayList();
        ArrayList paDYCH = new ArrayList();
        ArrayList paDZCH = new ArrayList();

        ArrayList paDXDB = new ArrayList();
        ArrayList paDYDB = new ArrayList();
        ArrayList paDZDB = new ArrayList();

//////////////////  TEMPO EN X  //////////////////////////////      
        ////////// calinsky - harabaz /////////
        if (dxchsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDXCH = CExtraer.arrayDuracionXCpruebaEM;
            iDXCH = CExtraer.arrayDuracionXIpruebaEM;
            res = Double.parseDouble((String) iDXCH.get(0));
            for (int i = 0; i < iDXCH.size(); i++) {
                if (Double.parseDouble((String) iDXCH.get(i)) > res) {
                    System.out.println(iDXCH.get(i));
                    res = Double.parseDouble((String) iDXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDXCH2.setText(cenDXCH.get(iposision).toString());
        }

        insDXCH = CFusionarEM.arregloInstanciasDX1EM;

        if (insDXCH.isEmpty()) {
            if (dxchsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionarEM.arregloInstanciasDXEM;
                paDXCH = CFusionarEM.arregloPADXEM;
                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXCH2.setText(paDXCH.get(iposision).toString());
            }

            if (dxchsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionarEM.arregloInstanciasDXEM;
                paDXCH = CFusionarEM.arregloPADXEM;

                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXCH2.setText(paDXCH.get(iposision).toString());

            }

        } else {
            if (dxchsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionarEM.arregloInstanciasDX1EM;
                ppDXCH = CFusionarEM.arregloPPDX1EM;
                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXCH2.setText(ppDXCH.get(iposision).toString());
            }

            if (dxchsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionarEM.arregloInstanciasDX1EM;
                paDXCH = CFusionarEM.arregloPADX1EM;

                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXCH2.setText(paDXCH.get(iposision).toString());

            }
        }

        //////////// davies bouldin //////////////
        if (dxdbsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDXDB = CExtraer.arrayDuracionXCpruebaEM;
            iDXCH = CExtraer.arrayDuracionXIpruebaEM;
            res = Double.parseDouble((String) iDXCH.get(0));
            for (int i = 0; i < iDXCH.size(); i++) {
                if (Double.parseDouble((String) iDXCH.get(i)) > res) {
                    System.out.println(iDXCH.get(i));
                    res = Double.parseDouble((String) iDXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDXDB2.setText(cenDXDB.get(iposision).toString());
        }

        insDXCH = CFusionarEM.arregloInstanciasDX1EM;

        if (insDXCH.isEmpty()) {
            if (dxdbsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionarEM.arregloInstanciasDXEM;
                ppDXDB = CFusionarEM.arregloPPDXEM;
                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXDB2.setText(ppDXDB.get(iposision).toString());
            }
            if (dxdbsEM == "Fusion PA") {

                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionarEM.arregloInstanciasDXEM;
                paDXDB = CFusionarEM.arregloPADXEM;
                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXDB2.setText(paDXDB.get(iposision).toString());

            }

        } else {
            if (dxdbsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionarEM.arregloInstanciasDX1EM;
                ppDXDB = CFusionarEM.arregloPPDX1EM;
                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXDB2.setText(ppDXDB.get(iposision).toString());
            }
            if (dxdbsEM == "Fusion PA") {

                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDXCH = CFusionarEM.arregloInstanciasDX1EM;
                paDXDB = CFusionarEM.arregloPADX1EM;
                res = Double.parseDouble((String) insDXCH.get(0));
                for (int i = 0; i < insDXCH.size(); i++) {
                    if (Double.parseDouble((String) insDXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDXCH.get(i));
                        iposision = i;
                    }
                }
                valorDXDB2.setText(paDXDB.get(iposision).toString());

            }
        }

        ///////////// TEMPO EN Y //////////// 
        ////////////  calinsky - harabaz /////////////
        if (dychsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDYCH = CExtraer.arrayDuracionYCpruebaEM;
            iDYCH = CExtraer.arrayDuracionYIpruebaEM;
            res = Double.parseDouble((String) iDYCH.get(0));
            for (int i = 0; i < iDYCH.size(); i++) {
                if (Double.parseDouble((String) iDYCH.get(i)) > res) {
                    System.out.println(iDYCH.get(i));
                    res = Double.parseDouble((String) iDYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDYCH2.setText(cenDYCH.get(iposision).toString());
        }

        insDYCH = CFusionarEM.arregloInstanciasDY1EM;

        if (insDYCH.isEmpty()) {

            if (dychsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionarEM.arregloInstanciasDYEM;
                ppDYCH = CFusionarEM.arregloPPDYEM;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYCH2.setText(ppDYCH.get(iposision).toString());

            }

            if (dychsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionarEM.arregloInstanciasDYEM;
                paDYCH = CFusionarEM.arregloPADYEM;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYCH2.setText(paDYCH.get(iposision).toString());
            }
        } else {
            if (dychsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionarEM.arregloInstanciasDY1EM;
                ppDYCH = CFusionarEM.arregloPPDY1EM;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYCH2.setText(ppDYCH.get(iposision).toString());

            }

            if (dychsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionarEM.arregloInstanciasDY1EM;
                paDYCH = CFusionarEM.arregloPADY1EM;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYCH2.setText(paDYCH.get(iposision).toString());
            }
        }

        /////////// davies - bouldin /////////////
        if (dydbsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDYDB = CExtraer.arrayDuracionYCpruebaEM;
            iDYCH = CExtraer.arrayDuracionYIpruebaEM;
            res = Double.parseDouble((String) iDYCH.get(0));
            for (int i = 0; i < iDYCH.size(); i++) {
                if (Double.parseDouble((String) iDYCH.get(i)) > res) {
                    System.out.println(iDYCH.get(i));
                    res = Double.parseDouble((String) iDYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDYDB2.setText(cenDYDB.get(iposision).toString());
        }

        insDYCH = CFusionarEM.arregloInstanciasDY1EM;
        if (insDYCH.isEmpty()) {

            if (dydbsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionarEM.arregloInstanciasDYEM;
                ppDYDB = CFusionarEM.arregloPPDYEM;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYDB2.setText(ppDYDB.get(iposision).toString());
            }
            if (dydbsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionarEM.arregloInstanciasDYEM;
                paDYDB = CFusionarEM.arregloPADYEM;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYDB2.setText(paDYDB.get(iposision).toString());
            }

        } else {

            if (dydbsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionarEM.arregloInstanciasDY1EM;
                ppDYDB = CFusionarEM.arregloPPDY1EM;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYDB2.setText(ppDYDB.get(iposision).toString());
            }
            if (dydbsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDYCH = CFusionarEM.arregloInstanciasDY1EM;
                paDYDB = CFusionarEM.arregloPADY1EM;
                res = Double.parseDouble((String) insDYCH.get(0));
                for (int i = 0; i < insDYCH.size(); i++) {
                    if (Double.parseDouble((String) insDYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDYCH.get(i));
                        iposision = i;
                    }
                }
                valorDYDB2.setText(paDYDB.get(iposision).toString());
            }

        }

        ///////////// TEMPO EN Z ////////////       
        ///////////// calinsky harabaz ///////////////////
        if (dzchsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDZCH = CExtraer.arrayDuracionZCpruebaEM;
            iDZCH = CExtraer.arrayDuracionZIpruebaEM;
            res = Double.parseDouble((String) iDZCH.get(0));
            for (int i = 0; i < iDZCH.size(); i++) {
                if (Double.parseDouble((String) iDZCH.get(i)) > res) {
                    System.out.println(iDZCH.get(i));
                    res = Double.parseDouble((String) iDZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDZCH2.setText(cenDZCH.get(iposision).toString());
        }

        insDZCH = CFusionarEM.arregloInstanciasDZ1EM;
        if (insDZCH.isEmpty()) {
            if (dzchsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionarEM.arregloInstanciasDZEM;
                ppDZCH = CFusionarEM.arregloPPDZEM;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZCH2.setText(ppDZCH.get(iposision).toString());
            }
            if (dzchsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionarEM.arregloInstanciasDZEM;
                paDZCH = CFusionarEM.arregloPADZEM;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZCH2.setText(paDZCH.get(iposision).toString());
            }
        } else {
            if (dzchsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionarEM.arregloInstanciasDZ1EM;
                ppDZCH = CFusionarEM.arregloPPDZ1EM;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZCH2.setText(ppDZCH.get(iposision).toString());
            }
            if (dzchsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionarEM.arregloInstanciasDZ1EM;
                paDZCH = CFusionarEM.arregloPADZ1EM;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZCH2.setText(paDZCH.get(iposision).toString());
            }

        }
    ///////////// davies bouldin /////////////////// 

        if (dzdbsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenDZDB = CExtraer.arrayDuracionZCpruebaEM;
            iDZCH = CExtraer.arrayDuracionZIpruebaEM;
            res = Double.parseDouble((String) iDZCH.get(0));
            for (int i = 0; i < iDZCH.size(); i++) {
                if (Double.parseDouble((String) iDZCH.get(i)) > res) {
                    System.out.println(iDZCH.get(i));
                    res = Double.parseDouble((String) iDZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorDZDB2.setText(cenDZDB.get(iposision).toString());
        }

        insDZCH = CFusionarEM.arregloInstanciasDZ1EM;
        if (insDZCH.isEmpty()) {

            if (dzdbsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionarEM.arregloInstanciasDZEM;
                ppDZDB = CFusionarEM.arregloPPDZEM;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZDB2.setText(ppDZDB.get(iposision).toString());
            }
            //////////
            if (dzdbsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionarEM.arregloInstanciasDZEM;
                paDZDB = CFusionarEM.arregloPADZEM;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZDB2.setText(paDZDB.get(iposision).toString());
            }
        } else {
            if (dzdbsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionarEM.arregloInstanciasDZ1EM;
                ppDZDB = CFusionarEM.arregloPPDZ1EM;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZDB2.setText(ppDZDB.get(iposision).toString());
            }
            //////////
            if (dzdbsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insDZCH = CFusionarEM.arregloInstanciasDZ1EM;
                paDZDB = CFusionarEM.arregloPADZ1EM;
                res = Double.parseDouble((String) insDZCH.get(0));
                for (int i = 0; i < insDZCH.size(); i++) {
                    if (Double.parseDouble((String) insDZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insDZCH.get(i));
                        iposision = i;
                    }
                }
                valorDZDB2.setText(paDZDB.get(iposision).toString());
            }
        }
    }

    public void recomendarOctavas() {

        ArrayList iOXCH = new ArrayList();
        ArrayList iOYCH = new ArrayList();
        ArrayList iOZCH = new ArrayList();

        ArrayList cenOXCH = new ArrayList();
        ArrayList cenOYCH = new ArrayList();
        ArrayList cenOZCH = new ArrayList();

        ArrayList cenOXDB = new ArrayList();
        ArrayList cenOYDB = new ArrayList();
        ArrayList cenOZDB = new ArrayList();

        ArrayList insOXCH = new ArrayList();
        ArrayList insOYCH = new ArrayList();
        ArrayList insOZCH = new ArrayList();

        ArrayList ppOXCH = new ArrayList();
        ArrayList ppOYCH = new ArrayList();
        ArrayList ppOZCH = new ArrayList();

        ArrayList ppOXDB = new ArrayList();
        ArrayList ppOYDB = new ArrayList();
        ArrayList ppOZDB = new ArrayList();

        ArrayList paOXCH = new ArrayList();
        ArrayList paOYCH = new ArrayList();
        ArrayList paOZCH = new ArrayList();

        ArrayList paOXDB = new ArrayList();
        ArrayList paOYDB = new ArrayList();
        ArrayList paOZDB = new ArrayList();

//////////////////  TEMPO EN X  //////////////////////////////      
        ////////// calinsky - harabaz /////////
        if (oxchs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOXCH = CExtraer.arrayOctavaXCprueba;
            iOXCH = CExtraer.arrayOctavaXIprueba;
            res = Double.parseDouble((String) iOXCH.get(0));
            for (int i = 0; i < iOXCH.size(); i++) {
                if (Double.parseDouble((String) iOXCH.get(i)) > res) {
                    System.out.println(iOXCH.get(i));
                    res = Double.parseDouble((String) iOXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOXCH.setText(cenOXCH.get(iposision).toString());
        }

        insOXCH = CFusionar.arregloInstanciasOX1;
        if (insOXCH.isEmpty()) {

            if (oxchs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionar.arregloInstanciasOX;
                ppOXCH = CFusionar.arregloPPOX;
                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXCH.setText(ppOXCH.get(iposision).toString());
            }

            if (oxchs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionar.arregloInstanciasOX;
                paOXCH = CFusionar.arregloPAOX;

                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXCH.setText(paOXCH.get(iposision).toString());

            }
        } else {
            if (oxchs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionar.arregloInstanciasOX1;
                ppOXCH = CFusionar.arregloPPOX1;
                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXCH.setText(ppOXCH.get(iposision).toString());
            }

            if (oxchs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionar.arregloInstanciasOX1;
                paOXCH = CFusionar.arregloPAOX1;

                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXCH.setText(paOXCH.get(iposision).toString());

            }

        }

        //////////// davies bouldin //////////////
        if (oxdbs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOXDB = CExtraer.arrayOctavaXCprueba;
            iOXCH = CExtraer.arrayOctavaXIprueba;
            res = Double.parseDouble((String) iOXCH.get(0));
            for (int i = 0; i < iOXCH.size(); i++) {
                if (Double.parseDouble((String) iOXCH.get(i)) > res) {
                    System.out.println(iOXCH.get(i));
                    res = Double.parseDouble((String) iOXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOXDB.setText(cenOXDB.get(iposision).toString());
        }

        insOXCH = CFusionar.arregloInstanciasOX1;
        if (insOXCH.isEmpty()) {
            if (oxdbs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionar.arregloInstanciasOX;
                ppOXDB = CFusionar.arregloPPOX;
                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXDB.setText(ppOXDB.get(iposision).toString());
            }
            if (oxdbs == "Fusion PA") {

                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionar.arregloInstanciasOX;
                paOXDB = CFusionar.arregloPAOX;

                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXDB.setText(paOXDB.get(iposision).toString());

            }
        } else {
            if (oxdbs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionar.arregloInstanciasOX1;
                ppOXDB = CFusionar.arregloPPOX1;
                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXDB.setText(ppOXDB.get(iposision).toString());
            }
            if (oxdbs == "Fusion PA") {

                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionar.arregloInstanciasOX1;
                paOXDB = CFusionar.arregloPAOX1;

                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXDB.setText(paOXDB.get(iposision).toString());

            }
        }

        ///////////// TEMPO EN Y //////////// 
        ////////////  calinsky - harabaz /////////////
        if (oychs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOYCH = CExtraer.arrayOctavaYCprueba;
            iOYCH = CExtraer.arrayOctavaYIprueba;
            res = Double.parseDouble((String) iOYCH.get(0));
            for (int i = 0; i < iOYCH.size(); i++) {
                if (Double.parseDouble((String) iOYCH.get(i)) > res) {
                    System.out.println(iOYCH.get(i));
                    res = Double.parseDouble((String) iOYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOYCH.setText(cenOYCH.get(iposision).toString());
        }

        insOYCH = CFusionar.arregloInstanciasOY1;
        if (insOYCH.isEmpty()) {
            if (oychs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionar.arregloInstanciasOY;
                ppOYCH = CFusionar.arregloPPOY;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYCH.setText(ppOYCH.get(iposision).toString());

            }

            if (oychs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionar.arregloInstanciasOY;
                paOYCH = CFusionar.arregloPAOY;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYCH.setText(paOYCH.get(iposision).toString());
            }
        } else {
            if (oychs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionar.arregloInstanciasOY1;
                ppOYCH = CFusionar.arregloPPOY1;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYCH.setText(ppOYCH.get(iposision).toString());

            }

            if (oychs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionar.arregloInstanciasOY1;
                paOYCH = CFusionar.arregloPAOY1;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYCH.setText(paOYCH.get(iposision).toString());
            }
        }

        /////////// davies - bouldin ///////////// 
        if (oydbs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOYDB = CExtraer.arrayOctavaYCprueba;
            iOYCH = CExtraer.arrayOctavaYIprueba;
            res = Double.parseDouble((String) iOYCH.get(0));
            for (int i = 0; i < iOYCH.size(); i++) {
                if (Double.parseDouble((String) iOYCH.get(i)) > res) {
                    System.out.println(iOYCH.get(i));
                    res = Double.parseDouble((String) iOYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOYDB.setText(cenOYDB.get(iposision).toString());
        }

        insOYCH = CFusionar.arregloInstanciasOY1;
        if (insOYCH.isEmpty()) {
            if (oydbs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionar.arregloInstanciasOY;
                ppOYDB = CFusionar.arregloPPOY;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYDB.setText(ppOYDB.get(iposision).toString());
            }

            if (oydbs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionar.arregloInstanciasOY;
                paOYDB = CFusionar.arregloPAOY;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYDB.setText(paOYDB.get(iposision).toString());
            }

        } else {
            if (oydbs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionar.arregloInstanciasOY1;
                ppOYDB = CFusionar.arregloPPOY1;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYDB.setText(ppOYDB.get(iposision).toString());
            }

            if (oydbs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionar.arregloInstanciasOY1;
                paOYDB = CFusionar.arregloPAOY1;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYDB.setText(paOYDB.get(iposision).toString());
            }

        }

        ///////////// TEMPO EN Z ////////////       
        ///////////// calinsky harabaz ///////////////////
        if (ozchs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOZCH = CExtraer.arrayOctavaZCprueba;
            iOZCH = CExtraer.arrayOctavaZIprueba;
            res = Double.parseDouble((String) iOZCH.get(0));
            for (int i = 0; i < iOZCH.size(); i++) {
                if (Double.parseDouble((String) iOZCH.get(i)) > res) {
                    System.out.println(iOZCH.get(i));
                    res = Double.parseDouble((String) iOZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOZCH.setText(cenOZCH.get(iposision).toString());
        }

        insOZCH = CFusionar.arregloInstanciasOZ1;
        if (insOZCH.isEmpty()) {
            if (ozchs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionar.arregloInstanciasOZ;
                ppOZCH = CFusionar.arregloPPOZ;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZCH.setText(ppOZCH.get(iposision).toString());
            }
            if (ozchs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionar.arregloInstanciasOZ;
                paOZCH = CFusionar.arregloPAOZ;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZCH.setText(paOZCH.get(iposision).toString());
            }
        } else {
            if (ozchs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionar.arregloInstanciasOZ1;
                ppOZCH = CFusionar.arregloPPOZ1;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZCH.setText(ppOZCH.get(iposision).toString());
            }
            if (ozchs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionar.arregloInstanciasOZ1;
                paOZCH = CFusionar.arregloPAOZ1;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZCH.setText(paOZCH.get(iposision).toString());
            }
        }

    ///////////// davies bouldin /////////////////// 
        if (ozdbs == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOZDB = CExtraer.arrayOctavaZCprueba;
            iOZCH = CExtraer.arrayOctavaZIprueba;
            res = Double.parseDouble((String) iOZCH.get(0));
            for (int i = 0; i < iOZCH.size(); i++) {
                if (Double.parseDouble((String) iOZCH.get(i)) > res) {
                    System.out.println(iOZCH.get(i));
                    res = Double.parseDouble((String) iOZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOZDB.setText(cenOZDB.get(iposision).toString());
        }
        insOZCH = CFusionar.arregloInstanciasOZ1;
        if (insOZCH.isEmpty()) {
            if (ozdbs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionar.arregloInstanciasOZ;
                ppOZDB = CFusionar.arregloPPOZ;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZDB.setText(ppOZDB.get(iposision).toString());
            }
            //////////
            if (ozdbs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionar.arregloInstanciasOZ;
                paOZDB = CFusionar.arregloPAOZ;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZDB.setText(paOZDB.get(iposision).toString());
            }
        } else {
            if (ozdbs == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionar.arregloInstanciasOZ1;
                ppOZDB = CFusionar.arregloPPOZ1;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZDB.setText(ppOZDB.get(iposision).toString());
            }
            //////////
            if (ozdbs == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionar.arregloInstanciasOZ1;
                paOZDB = CFusionar.arregloPAOZ1;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZDB.setText(paOZDB.get(iposision).toString());
            }
        }

    }

    public void recomendarOctavasXM() {

        ArrayList iOXCH = new ArrayList();
        ArrayList iOYCH = new ArrayList();
        ArrayList iOZCH = new ArrayList();

        ArrayList cenOXCH = new ArrayList();
        ArrayList cenOYCH = new ArrayList();
        ArrayList cenOZCH = new ArrayList();

        ArrayList cenOXDB = new ArrayList();
        ArrayList cenOYDB = new ArrayList();
        ArrayList cenOZDB = new ArrayList();

        ArrayList insOXCH = new ArrayList();
        ArrayList insOYCH = new ArrayList();
        ArrayList insOZCH = new ArrayList();

        ArrayList ppOXCH = new ArrayList();
        ArrayList ppOYCH = new ArrayList();
        ArrayList ppOZCH = new ArrayList();

        ArrayList ppOXDB = new ArrayList();
        ArrayList ppOYDB = new ArrayList();
        ArrayList ppOZDB = new ArrayList();

        ArrayList paOXCH = new ArrayList();
        ArrayList paOYCH = new ArrayList();
        ArrayList paOZCH = new ArrayList();

        ArrayList paOXDB = new ArrayList();
        ArrayList paOYDB = new ArrayList();
        ArrayList paOZDB = new ArrayList();

//////////////////  TEMPO EN X  //////////////////////////////      
        ////////// calinsky - harabaz /////////
        if (oxchsX == "Pre Fusion") {

            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOXCH = CExtraer.arrayOctavaXCpruebaX;
            iOXCH = CExtraer.arrayOctavaXIpruebaX;
            res = Double.parseDouble((String) iOXCH.get(0));
            for (int i = 0; i < iOXCH.size(); i++) {
                if (Double.parseDouble((String) iOXCH.get(i)) > res) {
                    System.out.println(iOXCH.get(i));
                    res = Double.parseDouble((String) iOXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOXCH1.setText(cenOXCH.get(iposision).toString());

        }

        insOXCH = CFusionarXM.arregloInstanciasOX1X;
        if (insOXCH.isEmpty()) {
            if (oxchsX == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarXM.arregloInstanciasOXX;
                ppOXCH = CFusionarXM.arregloPPOXX;
                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXCH1.setText(ppOXCH.get(iposision).toString());
            }

            if (oxchsX == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarXM.arregloInstanciasOXX;
                paOXCH = CFusionarXM.arregloPAOXX;

                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXCH1.setText(paOXCH.get(iposision).toString());

            }

        } else {
            if (oxchsX == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarXM.arregloInstanciasOX1X;
                ppOXCH = CFusionarXM.arregloPPOX1X;
                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXCH1.setText(ppOXCH.get(iposision).toString());
            }

            if (oxchsX == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarXM.arregloInstanciasOX1X;
                paOXCH = CFusionarXM.arregloPAOX1X;

                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXCH1.setText(paOXCH.get(iposision).toString());

            }

        }

        //////////// davies bouldin //////////////
        if (oxdbsX == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOXDB = CExtraer.arrayOctavaXCpruebaX;
            iOXCH = CExtraer.arrayOctavaXIpruebaX;
            res = Double.parseDouble((String) iOXCH.get(0));
            for (int i = 0; i < iOXCH.size(); i++) {
                if (Double.parseDouble((String) iOXCH.get(i)) > res) {
                    System.out.println(iOXCH.get(i));
                    res = Double.parseDouble((String) iOXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOXDB1.setText(cenOXDB.get(iposision).toString());
        }

        insOXCH = CFusionarXM.arregloInstanciasOX1X;
        if (insOXCH.isEmpty()) {
            if (oxdbsX == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarXM.arregloInstanciasOXX;
                ppOXDB = CFusionarXM.arregloPPOXX;
                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXDB1.setText(ppOXDB.get(iposision).toString());
            }
            if (oxdbsX == "Fusion PA") {

                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarXM.arregloInstanciasOXX;
                paOXDB = CFusionarXM.arregloPAOXX;

                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXDB1.setText(paOXDB.get(iposision).toString());

            }
        } else {
            if (oxdbsX == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarXM.arregloInstanciasOX1X;
                ppOXDB = CFusionarXM.arregloPPOX1X;
                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXDB1.setText(ppOXDB.get(iposision).toString());
            }
            if (oxdbsX == "Fusion PA") {

                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarXM.arregloInstanciasOX1X;
                paOXDB = CFusionarXM.arregloPAOX1X;

                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXDB1.setText(paOXDB.get(iposision).toString());

            }
        }

        ///////////// TEMPO EN Y //////////// 
        ////////////  calinsky - harabaz /////////////
        if (oychsX == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOYCH = CExtraer.arrayOctavaYCpruebaX;
            iOYCH = CExtraer.arrayOctavaYIpruebaX;
            res = Double.parseDouble((String) iOYCH.get(0));
            for (int i = 0; i < iOYCH.size(); i++) {
                if (Double.parseDouble((String) iOYCH.get(i)) > res) {
                    System.out.println(iOYCH.get(i));
                    res = Double.parseDouble((String) iOYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOYCH1.setText(cenOYCH.get(iposision).toString());
        }
        insOYCH = CFusionarXM.arregloInstanciasOY1X;
        if (insOYCH.isEmpty()) {
            if (oychsX == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarXM.arregloInstanciasOYX;
                ppOYCH = CFusionarXM.arregloPPOYX;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYCH1.setText(ppOYCH.get(iposision).toString());

            }

            if (oychsX == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarXM.arregloInstanciasOYX;
                paOYCH = CFusionarXM.arregloPAOYX;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYCH1.setText(paOYCH.get(iposision).toString());
            }
        } else {
            if (oychsX == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarXM.arregloInstanciasOY1X;
                ppOYCH = CFusionarXM.arregloPPOY1X;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYCH1.setText(ppOYCH.get(iposision).toString());

            }

            if (oychsX == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarXM.arregloInstanciasOY1X;
                paOYCH = CFusionarXM.arregloPAOY1X;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYCH1.setText(paOYCH.get(iposision).toString());
            }
        }

        /////////// davies - bouldin /////////////   
        if (oydbsX == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOYDB = CExtraer.arrayOctavaYCpruebaX;
            iOYCH = CExtraer.arrayOctavaYIpruebaX;
            res = Double.parseDouble((String) iOYCH.get(0));
            for (int i = 0; i < iOYCH.size(); i++) {
                if (Double.parseDouble((String) iOYCH.get(i)) > res) {
                    System.out.println(iOYCH.get(i));
                    res = Double.parseDouble((String) iOYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOYDB1.setText(cenOYDB.get(iposision).toString());
        }

        insOYCH = CFusionarXM.arregloInstanciasOY1X;
        if (insOYCH.isEmpty()) {
            if (oydbsX == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarXM.arregloInstanciasOYX;
                ppOYDB = CFusionarXM.arregloPPOYX;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYDB1.setText(ppOYDB.get(iposision).toString());
            }

            if (oydbsX == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarXM.arregloInstanciasOYX;
                paOYDB = CFusionarXM.arregloPAOYX;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYDB1.setText(paOYDB.get(iposision).toString());
            }
        } else {
            if (oydbsX == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarXM.arregloInstanciasOY1X;
                ppOYDB = CFusionarXM.arregloPPOY1X;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYDB1.setText(ppOYDB.get(iposision).toString());
            }

            if (oydbsX == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarXM.arregloInstanciasOY1X;
                paOYDB = CFusionarXM.arregloPAOY1X;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYDB1.setText(paOYDB.get(iposision).toString());
            }
        }

        ///////////// TEMPO EN Z ////////////       
        ///////////// calinsky harabaz ///////////////////
        if (ozchsX == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOZCH = CExtraer.arrayOctavaZCpruebaX;
            iOZCH = CExtraer.arrayOctavaZIpruebaX;
            res = Double.parseDouble((String) iOZCH.get(0));
            for (int i = 0; i < iOZCH.size(); i++) {
                if (Double.parseDouble((String) iOZCH.get(i)) > res) {
                    System.out.println(iOZCH.get(i));
                    res = Double.parseDouble((String) iOZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOZCH1.setText(cenOZCH.get(iposision).toString());
        }

        insOZCH = CFusionarXM.arregloInstanciasOZ1X;
        if (insOZCH.isEmpty()) {
            if (ozchsX == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarXM.arregloInstanciasOZX;
                ppOZCH = CFusionarXM.arregloPPOZX;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZCH1.setText(ppOZCH.get(iposision).toString());
            }
            if (ozchsX == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarXM.arregloInstanciasOZX;
                paOZCH = CFusionarXM.arregloPAOZX;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZCH1.setText(paOZCH.get(iposision).toString());
            }
        } else {
            if (ozchsX == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarXM.arregloInstanciasOZ1X;
                ppOZCH = CFusionarXM.arregloPPOZ1X;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZCH1.setText(ppOZCH.get(iposision).toString());
            }
            if (ozchsX == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarXM.arregloInstanciasOZ1X;
                paOZCH = CFusionarXM.arregloPAOZ1X;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZCH1.setText(paOZCH.get(iposision).toString());
            }
        }

        ///////////// davies bouldin ///////////////////    
        if (ozdbsX == "Pre Fusion") {

            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOZDB = CExtraer.arrayOctavaZCpruebaX;
            iOZCH = CExtraer.arrayOctavaZIpruebaX;
            res = Double.parseDouble((String) iOZCH.get(0));
            for (int i = 0; i < iOZCH.size(); i++) {
                if (Double.parseDouble((String) iOZCH.get(i)) > res) {
                    System.out.println(iOZCH.get(i));
                    res = Double.parseDouble((String) iOZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOZDB1.setText(cenOZDB.get(iposision).toString());

        }
        insOZCH = CFusionarXM.arregloInstanciasOZ1X;
        if (insOZCH.isEmpty()) {
            if (ozdbsX == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarXM.arregloInstanciasOZX;
                ppOZDB = CFusionarXM.arregloPPOZX;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZDB1.setText(ppOZDB.get(iposision).toString());
            }
            //////////
            if (ozdbsX == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarXM.arregloInstanciasOZX;
                paOZDB = CFusionarXM.arregloPAOZX;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZDB1.setText(paOZDB.get(iposision).toString());
            }
        } else {
            if (ozdbsX == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarXM.arregloInstanciasOZ1X;
                ppOZDB = CFusionarXM.arregloPPOZ1X;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZDB1.setText(ppOZDB.get(iposision).toString());
            }
            //////////
            if (ozdbsX == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarXM.arregloInstanciasOZ1X;
                paOZDB = CFusionarXM.arregloPAOZ1X;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZDB1.setText(paOZDB.get(iposision).toString());
            }
        }

    }

    public void recomendarOctavasEM() {

        ArrayList iOXCH = new ArrayList();
        ArrayList iOYCH = new ArrayList();
        ArrayList iOZCH = new ArrayList();

        ArrayList cenOXCH = new ArrayList();
        ArrayList cenOYCH = new ArrayList();
        ArrayList cenOZCH = new ArrayList();

        ArrayList cenOXDB = new ArrayList();
        ArrayList cenOYDB = new ArrayList();
        ArrayList cenOZDB = new ArrayList();

        ArrayList insOXCH = new ArrayList();
        ArrayList insOYCH = new ArrayList();
        ArrayList insOZCH = new ArrayList();

        ArrayList ppOXCH = new ArrayList();
        ArrayList ppOYCH = new ArrayList();
        ArrayList ppOZCH = new ArrayList();

        ArrayList ppOXDB = new ArrayList();
        ArrayList ppOYDB = new ArrayList();
        ArrayList ppOZDB = new ArrayList();

        ArrayList paOXCH = new ArrayList();
        ArrayList paOYCH = new ArrayList();
        ArrayList paOZCH = new ArrayList();

        ArrayList paOXDB = new ArrayList();
        ArrayList paOYDB = new ArrayList();
        ArrayList paOZDB = new ArrayList();

//////////////////  TEMPO EN X  //////////////////////////////      
        ////////// calinsky - harabaz /////////
        if (oxchsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOXCH = CExtraer.arrayOctavaXCpruebaEM;
            iOXCH = CExtraer.arrayOctavaXIpruebaEM;
            res = Double.parseDouble((String) iOXCH.get(0));
            for (int i = 0; i < iOXCH.size(); i++) {
                if (Double.parseDouble((String) iOXCH.get(i)) > res) {
                    System.out.println(iOXCH.get(i));
                    res = Double.parseDouble((String) iOXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOXCH2.setText(cenOXCH.get(iposision).toString());
        }

        insOXCH = CFusionarEM.arregloInstanciasOX1EM;
        if (insOXCH.isEmpty()) {
            if (oxchsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarEM.arregloInstanciasOXEM;
                ppOXCH = CFusionarEM.arregloPPOXEM;
                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXCH2.setText(ppOXCH.get(iposision).toString());
            }

            if (oxchsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarEM.arregloInstanciasOXEM;
                paOXCH = CFusionarEM.arregloPAOXEM;

                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXCH2.setText(paOXCH.get(iposision).toString());

            }

        } else {
            if (oxchsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarEM.arregloInstanciasOX1EM;
                ppOXCH = CFusionarEM.arregloPPOX1EM;
                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXCH2.setText(ppOXCH.get(iposision).toString());
            }

            if (oxchsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarEM.arregloInstanciasOX1EM;
                paOXCH = CFusionarEM.arregloPAOX1EM;

                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXCH2.setText(paOXCH.get(iposision).toString());

            }

        }

        //////////// davies bouldin //////////////
        if (oxdbsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOXDB = CExtraer.arrayOctavaXCpruebaEM;
            iOXCH = CExtraer.arrayOctavaXIpruebaEM;
            res = Double.parseDouble((String) iOXCH.get(0));
            for (int i = 0; i < iOXCH.size(); i++) {
                if (Double.parseDouble((String) iOXCH.get(i)) > res) {
                    System.out.println(iOXCH.get(i));
                    res = Double.parseDouble((String) iOXCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOXDB2.setText(cenOXDB.get(iposision).toString());
        }

        insOXCH = CFusionarEM.arregloInstanciasOX1EM;
        if (insOXCH.isEmpty()) {
            if (oxdbsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarEM.arregloInstanciasOXEM;
                ppOXDB = CFusionarEM.arregloPPOXEM;
                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXDB2.setText(ppOXDB.get(iposision).toString());
            }
            if (oxdbsEM == "Fusion PA") {

                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarEM.arregloInstanciasOXEM;
                paOXDB = CFusionarEM.arregloPAOXEM;

                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXDB2.setText(paOXDB.get(iposision).toString());

            }
        } else {
            if (oxdbsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarEM.arregloInstanciasOX1EM;
                ppOXDB = CFusionarEM.arregloPPOX1EM;
                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXDB2.setText(ppOXDB.get(iposision).toString());
            }
            if (oxdbsEM == "Fusion PA") {

                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOXCH = CFusionarEM.arregloInstanciasOX1EM;
                paOXDB = CFusionarEM.arregloPAOX1EM;

                res = Double.parseDouble((String) insOXCH.get(0));
                for (int i = 0; i < insOXCH.size(); i++) {
                    if (Double.parseDouble((String) insOXCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOXCH.get(i));
                        iposision = i;
                    }
                }
                valorOXDB2.setText(paOXDB.get(iposision).toString());

            }
        }

        ///////////// TEMPO EN Y //////////// 
        ////////////  calinsky - harabaz /////////////
        if (oychsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOYCH = CExtraer.arrayOctavaYCpruebaEM;
            iOYCH = CExtraer.arrayOctavaYIpruebaEM;
            res = Double.parseDouble((String) iOYCH.get(0));
            for (int i = 0; i < iOYCH.size(); i++) {
                if (Double.parseDouble((String) iOYCH.get(i)) > res) {
                    System.out.println(iOYCH.get(i));
                    res = Double.parseDouble((String) iOYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOYCH2.setText(cenOYCH.get(iposision).toString());
        }

        insOYCH = CFusionarEM.arregloInstanciasOY1EM;
        if (insOYCH.isEmpty()) {
            if (oychsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarEM.arregloInstanciasOYEM;
                ppOYCH = CFusionarEM.arregloPPOYEM;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYCH2.setText(ppOYCH.get(iposision).toString());

            }

            if (oychsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarEM.arregloInstanciasOYEM;
                paOYCH = CFusionarEM.arregloPAOYEM;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYCH2.setText(paOYCH.get(iposision).toString());
            }
        } else {
            if (oychsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarEM.arregloInstanciasOY1EM;
                ppOYCH = CFusionarEM.arregloPPOY1EM;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYCH2.setText(ppOYCH.get(iposision).toString());

            }

            if (oychsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarEM.arregloInstanciasOY1EM;
                paOYCH = CFusionarEM.arregloPAOY1EM;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYCH2.setText(paOYCH.get(iposision).toString());
            }
        }

        /////////// davies - bouldin ///////////// 
        if (oydbsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOYDB = CExtraer.arrayOctavaYCpruebaEM;
            iOYCH = CExtraer.arrayOctavaYIpruebaEM;
            res = Double.parseDouble((String) iOYCH.get(0));
            for (int i = 0; i < iOYCH.size(); i++) {
                if (Double.parseDouble((String) iOYCH.get(i)) > res) {
                    System.out.println(iOYCH.get(i));
                    res = Double.parseDouble((String) iOYCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOYDB2.setText(cenOYDB.get(iposision).toString());
        }

        insOYCH = CFusionarEM.arregloInstanciasOY1EM;
        if (insOYCH.isEmpty()) {
            if (oydbsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarEM.arregloInstanciasOYEM;
                ppOYDB = CFusionarEM.arregloPPOYEM;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYDB2.setText(ppOYDB.get(iposision).toString());
            }

            if (oydbsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarEM.arregloInstanciasOYEM;
                paOYDB = CFusionarEM.arregloPAOYEM;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYDB2.setText(paOYDB.get(iposision).toString());
            }
        } else {
            if (oydbsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarEM.arregloInstanciasOY1EM;
                ppOYDB = CFusionarEM.arregloPPOY1EM;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYDB2.setText(ppOYDB.get(iposision).toString());
            }

            if (oydbsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOYCH = CFusionarEM.arregloInstanciasOY1EM;
                paOYDB = CFusionarEM.arregloPAOY1EM;
                res = Double.parseDouble((String) insOYCH.get(0));
                for (int i = 0; i < insOYCH.size(); i++) {
                    if (Double.parseDouble((String) insOYCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOYCH.get(i));
                        iposision = i;
                    }
                }
                valorOYDB2.setText(paOYDB.get(iposision).toString());
            }
        }

        ///////////// TEMPO EN Z ////////////       
        ///////////// calinsky harabaz ///////////////////
        if (ozchsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOZCH = CExtraer.arrayOctavaZCpruebaEM;
            iOZCH = CExtraer.arrayOctavaZIpruebaEM;
            res = Double.parseDouble((String) iOZCH.get(0));
            for (int i = 0; i < iOZCH.size(); i++) {
                if (Double.parseDouble((String) iOZCH.get(i)) > res) {
                    System.out.println(iOZCH.get(i));
                    res = Double.parseDouble((String) iOZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOZCH2.setText(cenOZCH.get(iposision).toString());
        }

        insOZCH = CFusionarEM.arregloInstanciasOZ1EM;
        if (insOZCH.isEmpty()) {
            if (ozchsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarEM.arregloInstanciasOZEM;
                ppOZCH = CFusionarEM.arregloPPOZEM;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZCH2.setText(ppOZCH.get(iposision).toString());
            }
            if (ozchsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarEM.arregloInstanciasOZEM;
                paOZCH = CFusionarEM.arregloPAOZEM;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZCH2.setText(paOZCH.get(iposision).toString());
            }
        } else {
            if (ozchsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarEM.arregloInstanciasOZ1EM;
                ppOZCH = CFusionarEM.arregloPPOZ1EM;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZCH2.setText(ppOZCH.get(iposision).toString());
            }
            if (ozchsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarEM.arregloInstanciasOZ1EM;
                paOZCH = CFusionarEM.arregloPAOZ1EM;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZCH2.setText(paOZCH.get(iposision).toString());
            }
        }

    ///////////// davies bouldin /////////////////// 
        if (ozdbsEM == "Pre Fusion") {
            double res = 0;
            double cont = 0;
            int iposision = 0;
            cenOZDB = CExtraer.arrayOctavaZCpruebaEM;
            iOZCH = CExtraer.arrayOctavaZIpruebaEM;
            res = Double.parseDouble((String) iOZCH.get(0));
            for (int i = 0; i < iOZCH.size(); i++) {
                if (Double.parseDouble((String) iOZCH.get(i)) > res) {
                    System.out.println(iOZCH.get(i));
                    res = Double.parseDouble((String) iOZCH.get(i));
                    iposision = i;
                    System.out.println(iposision);
                }
            }
            valorOZDB2.setText(cenOZDB.get(iposision).toString());
        }

        insOZCH = CFusionarEM.arregloInstanciasOZ1EM;
        if (insOZCH.isEmpty()) {
            if (ozdbsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarEM.arregloInstanciasOZEM;
                ppOZDB = CFusionarEM.arregloPPOZEM;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZDB2.setText(ppOZDB.get(iposision).toString());
            }
            //////////
            if (ozdbsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarEM.arregloInstanciasOZEM;
                paOZDB = CFusionarEM.arregloPAOZEM;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZDB2.setText(paOZDB.get(iposision).toString());
            }
        } else {
            if (ozdbsEM == "Fusion PP") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarEM.arregloInstanciasOZ1EM;
                ppOZDB = CFusionarEM.arregloPPOZ1EM;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZDB2.setText(ppOZDB.get(iposision).toString());
            }
            //////////
            if (ozdbsEM == "Fusion PA") {
                double res = 0;
                double cont = 0;
                int iposision = 0;

                insOZCH = CFusionarEM.arregloInstanciasOZ1EM;
                paOZDB = CFusionarEM.arregloPAOZ1EM;
                res = Double.parseDouble((String) insOZCH.get(0));
                for (int i = 0; i < insOZCH.size(); i++) {
                    if (Double.parseDouble((String) insOZCH.get(i)) > res) {
                        res = Double.parseDouble((String) insOZCH.get(i));
                        iposision = i;
                    }
                }
                valorOZDB2.setText(paOZDB.get(iposision).toString());
            }
        }

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextTZRDB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextTZRCH = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextTXRCH = new javax.swing.JTextField();
        jTextTXRDB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextTYRCH = new javax.swing.JTextField();
        jTextTYRDB = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextTXCH = new javax.swing.JTextField();
        jTextTXDB = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextTYCH = new javax.swing.JTextField();
        jTextTYDB = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextTZCH = new javax.swing.JTextField();
        jTextTZDB = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextTXFCH = new javax.swing.JTextField();
        jTextTXFDB = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextTYFCH = new javax.swing.JTextField();
        jTextTYFDB = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextTZFCH = new javax.swing.JTextField();
        jTextTZFDB = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextTXFCHPA = new javax.swing.JTextField();
        jTextTXFDBPA = new javax.swing.JTextField();
        jTextTYFCHPA = new javax.swing.JTextField();
        jTextTYFDBPA = new javax.swing.JTextField();
        jTextTZFCHPA = new javax.swing.JTextField();
        jTextTZFDBPA = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblDBZ = new javax.swing.JLabel();
        valorTYCH = new javax.swing.JTextField();
        valorTZDB = new javax.swing.JTextField();
        valorTXCH = new javax.swing.JTextField();
        valorTXDB = new javax.swing.JTextField();
        valorTYDB = new javax.swing.JTextField();
        valorTZCH = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblCHX = new javax.swing.JLabel();
        lblDBX = new javax.swing.JLabel();
        lblCHY = new javax.swing.JLabel();
        lblDBY = new javax.swing.JLabel();
        lblCHZ = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jTextTZRDB1 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jTextTZRCH1 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jTextTXRCH1 = new javax.swing.JTextField();
        jTextTXRDB1 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jTextTYRCH1 = new javax.swing.JTextField();
        jTextTYRDB1 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jTextTXCH1 = new javax.swing.JTextField();
        jTextTXDB1 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jTextTYCH1 = new javax.swing.JTextField();
        jTextTYDB1 = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jTextTZCH1 = new javax.swing.JTextField();
        jTextTZDB1 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jTextTXFCH1 = new javax.swing.JTextField();
        jTextTXFDB1 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jTextTYFCH1 = new javax.swing.JTextField();
        jTextTYFDB1 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jTextTZFCH1 = new javax.swing.JTextField();
        jTextTZFDB1 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jTextTXFCHPA1 = new javax.swing.JTextField();
        jTextTXFDBPA1 = new javax.swing.JTextField();
        jTextTYFCHPA1 = new javax.swing.JTextField();
        jTextTYFDBPA1 = new javax.swing.JTextField();
        jTextTZFCHPA1 = new javax.swing.JTextField();
        jTextTZFDBPA1 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        lblDBZ1 = new javax.swing.JLabel();
        valorTYCH1 = new javax.swing.JTextField();
        valorTZDB1 = new javax.swing.JTextField();
        valorTXCH1 = new javax.swing.JTextField();
        valorTXDB1 = new javax.swing.JTextField();
        valorTYDB1 = new javax.swing.JTextField();
        valorTZCH1 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        lblCHX1 = new javax.swing.JLabel();
        lblDBX1 = new javax.swing.JLabel();
        lblCHY1 = new javax.swing.JLabel();
        lblDBY1 = new javax.swing.JLabel();
        lblCHZ1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jTextTZRDB2 = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        jTextTZRCH2 = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jTextTXRCH2 = new javax.swing.JTextField();
        jTextTXRDB2 = new javax.swing.JTextField();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jTextTYRCH2 = new javax.swing.JTextField();
        jTextTYRDB2 = new javax.swing.JTextField();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jTextTXCH2 = new javax.swing.JTextField();
        jTextTXDB2 = new javax.swing.JTextField();
        jLabel157 = new javax.swing.JLabel();
        jTextTYCH2 = new javax.swing.JTextField();
        jTextTYDB2 = new javax.swing.JTextField();
        jLabel158 = new javax.swing.JLabel();
        jTextTZCH2 = new javax.swing.JTextField();
        jTextTZDB2 = new javax.swing.JTextField();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jTextTXFCH2 = new javax.swing.JTextField();
        jTextTXFDB2 = new javax.swing.JTextField();
        jLabel161 = new javax.swing.JLabel();
        jTextTYFCH2 = new javax.swing.JTextField();
        jTextTYFDB2 = new javax.swing.JTextField();
        jLabel162 = new javax.swing.JLabel();
        jTextTZFCH2 = new javax.swing.JTextField();
        jTextTZFDB2 = new javax.swing.JTextField();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jTextTXFCHPA2 = new javax.swing.JTextField();
        jTextTXFDBPA2 = new javax.swing.JTextField();
        jTextTYFCHPA2 = new javax.swing.JTextField();
        jTextTYFDBPA2 = new javax.swing.JTextField();
        jTextTZFCHPA2 = new javax.swing.JTextField();
        jTextTZFDBPA2 = new javax.swing.JTextField();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        lblDBZ2 = new javax.swing.JLabel();
        valorTYCH2 = new javax.swing.JTextField();
        valorTZDB2 = new javax.swing.JTextField();
        valorTXCH2 = new javax.swing.JTextField();
        valorTXDB2 = new javax.swing.JTextField();
        valorTYDB2 = new javax.swing.JTextField();
        valorTZCH2 = new javax.swing.JTextField();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        lblCHX2 = new javax.swing.JLabel();
        lblDBX2 = new javax.swing.JLabel();
        lblCHY2 = new javax.swing.JLabel();
        lblDBY2 = new javax.swing.JLabel();
        lblCHZ2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextDZRDB = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextDZRCH = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextDXRCH = new javax.swing.JTextField();
        jTextDXRDB = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextDYRCH = new javax.swing.JTextField();
        jTextDYRDB = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextDXCH = new javax.swing.JTextField();
        jTextDXDB = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextDYCH = new javax.swing.JTextField();
        jTextDYDB = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextDZCH = new javax.swing.JTextField();
        jTextDZDB = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextDXFCH = new javax.swing.JTextField();
        jTextDXFDB = new javax.swing.JTextField();
        jTextDYFCH = new javax.swing.JTextField();
        jTextDYFDB = new javax.swing.JTextField();
        jTextDZFCH = new javax.swing.JTextField();
        jTextDZFDB = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextDXFCHPA = new javax.swing.JTextField();
        jTextDXFDBPA = new javax.swing.JTextField();
        jTextDYFCHPA = new javax.swing.JTextField();
        jTextDYFDBPA = new javax.swing.JTextField();
        jTextDZFCHPA = new javax.swing.JTextField();
        jTextDZFDBPA = new javax.swing.JTextField();
        lblDBZD = new javax.swing.JLabel();
        valorDYCH = new javax.swing.JTextField();
        valorDZDB = new javax.swing.JTextField();
        valorDXCH = new javax.swing.JTextField();
        valorDXDB = new javax.swing.JTextField();
        valorDYDB = new javax.swing.JTextField();
        valorDZCH = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        lblCHXD = new javax.swing.JLabel();
        lblDBXD = new javax.swing.JLabel();
        lblCHYD = new javax.swing.JLabel();
        lblDBYD = new javax.swing.JLabel();
        lblCHZD = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jTextDZRDB1 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jTextDZRCH1 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jTextDXRCH1 = new javax.swing.JTextField();
        jTextDXRDB1 = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jTextDYRCH1 = new javax.swing.JTextField();
        jTextDYRDB1 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jTextDXCH1 = new javax.swing.JTextField();
        jTextDXDB1 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jTextDYCH1 = new javax.swing.JTextField();
        jTextDYDB1 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jTextDZCH1 = new javax.swing.JTextField();
        jTextDZDB1 = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jTextDXFCH1 = new javax.swing.JTextField();
        jTextDXFDB1 = new javax.swing.JTextField();
        jTextDYFCH1 = new javax.swing.JTextField();
        jTextDYFDB1 = new javax.swing.JTextField();
        jTextDZFCH1 = new javax.swing.JTextField();
        jTextDZFDB1 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jTextDXFCHPA1 = new javax.swing.JTextField();
        jTextDXFDBPA1 = new javax.swing.JTextField();
        jTextDYFCHPA1 = new javax.swing.JTextField();
        jTextDYFDBPA1 = new javax.swing.JTextField();
        jTextDZFCHPA1 = new javax.swing.JTextField();
        jTextDZFDBPA1 = new javax.swing.JTextField();
        lblDBZD1 = new javax.swing.JLabel();
        valorDYCH1 = new javax.swing.JTextField();
        valorDZDB1 = new javax.swing.JTextField();
        valorDXCH1 = new javax.swing.JTextField();
        valorDXDB1 = new javax.swing.JTextField();
        valorDYDB1 = new javax.swing.JTextField();
        valorDZCH1 = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        lblCHXD1 = new javax.swing.JLabel();
        lblDBXD1 = new javax.swing.JLabel();
        lblCHYD1 = new javax.swing.JLabel();
        lblDBYD1 = new javax.swing.JLabel();
        lblCHZD1 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jTextDZRDB2 = new javax.swing.JTextField();
        jLabel171 = new javax.swing.JLabel();
        jTextDZRCH2 = new javax.swing.JTextField();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jTextDXRCH2 = new javax.swing.JTextField();
        jTextDXRDB2 = new javax.swing.JTextField();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jTextDYRCH2 = new javax.swing.JTextField();
        jTextDYRDB2 = new javax.swing.JTextField();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jTextDXCH2 = new javax.swing.JTextField();
        jTextDXDB2 = new javax.swing.JTextField();
        jLabel178 = new javax.swing.JLabel();
        jTextDYCH2 = new javax.swing.JTextField();
        jTextDYDB2 = new javax.swing.JTextField();
        jLabel179 = new javax.swing.JLabel();
        jTextDZCH2 = new javax.swing.JTextField();
        jTextDZDB2 = new javax.swing.JTextField();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jTextDXFCH2 = new javax.swing.JTextField();
        jTextDXFDB2 = new javax.swing.JTextField();
        jTextDYFCH2 = new javax.swing.JTextField();
        jTextDYFDB2 = new javax.swing.JTextField();
        jTextDZFCH2 = new javax.swing.JTextField();
        jTextDZFDB2 = new javax.swing.JTextField();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jTextDXFCHPA2 = new javax.swing.JTextField();
        jTextDXFDBPA2 = new javax.swing.JTextField();
        jTextDYFCHPA2 = new javax.swing.JTextField();
        jTextDYFDBPA2 = new javax.swing.JTextField();
        jTextDZFCHPA2 = new javax.swing.JTextField();
        jTextDZFDBPA2 = new javax.swing.JTextField();
        lblDBZD2 = new javax.swing.JLabel();
        valorDYCH2 = new javax.swing.JTextField();
        valorDZDB2 = new javax.swing.JTextField();
        valorDXCH2 = new javax.swing.JTextField();
        valorDXDB2 = new javax.swing.JTextField();
        valorDYDB2 = new javax.swing.JTextField();
        valorDZCH2 = new javax.swing.JTextField();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        lblCHXD2 = new javax.swing.JLabel();
        lblDBXD2 = new javax.swing.JLabel();
        lblCHYD2 = new javax.swing.JLabel();
        lblDBYD2 = new javax.swing.JLabel();
        lblCHZD2 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextOZRDB = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextOZRCH = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextOXRCH = new javax.swing.JTextField();
        jTextOXRDB = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jTextOYRCH = new javax.swing.JTextField();
        jTextOYRDB = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jTextOXCH = new javax.swing.JTextField();
        jTextOXDB = new javax.swing.JTextField();
        jTextOYCH = new javax.swing.JTextField();
        jTextOYDB = new javax.swing.JTextField();
        jTextOZCH = new javax.swing.JTextField();
        jTextOZDB = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jTextOXFCH = new javax.swing.JTextField();
        jTextOXFDB = new javax.swing.JTextField();
        jTextOYFCH = new javax.swing.JTextField();
        jTextOYFDB = new javax.swing.JTextField();
        jTextOZFCH = new javax.swing.JTextField();
        jTextOZFDB = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jTextOXFCHPA = new javax.swing.JTextField();
        jTextOXFDBPA = new javax.swing.JTextField();
        jTextOYFCHPA = new javax.swing.JTextField();
        jTextOYFDBPA = new javax.swing.JTextField();
        jTextOZFCHPA = new javax.swing.JTextField();
        jTextOZFDBPA = new javax.swing.JTextField();
        lblDBZO = new javax.swing.JLabel();
        valorOYCH = new javax.swing.JTextField();
        valorOZDB = new javax.swing.JTextField();
        valorOXCH = new javax.swing.JTextField();
        valorOXDB = new javax.swing.JTextField();
        valorOYDB = new javax.swing.JTextField();
        valorOZCH = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        lblCHXO = new javax.swing.JLabel();
        lblDBXO = new javax.swing.JLabel();
        lblCHYO = new javax.swing.JLabel();
        lblDBYO = new javax.swing.JLabel();
        lblCHZO = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jTextOZRDB1 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        jTextOZRCH1 = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jTextOXRCH1 = new javax.swing.JTextField();
        jTextOXRDB1 = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jTextOYRCH1 = new javax.swing.JTextField();
        jTextOYRDB1 = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jTextOXCH1 = new javax.swing.JTextField();
        jTextOXDB1 = new javax.swing.JTextField();
        jTextOYCH1 = new javax.swing.JTextField();
        jTextOYDB1 = new javax.swing.JTextField();
        jTextOZCH1 = new javax.swing.JTextField();
        jTextOZDB1 = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        jTextOXFCH1 = new javax.swing.JTextField();
        jTextOXFDB1 = new javax.swing.JTextField();
        jTextOYFCH1 = new javax.swing.JTextField();
        jTextOYFDB1 = new javax.swing.JTextField();
        jTextOZFCH1 = new javax.swing.JTextField();
        jTextOZFDB1 = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        jTextOXFCHPA1 = new javax.swing.JTextField();
        jTextOXFDBPA1 = new javax.swing.JTextField();
        jTextOYFCHPA1 = new javax.swing.JTextField();
        jTextOYFDBPA1 = new javax.swing.JTextField();
        jTextOZFCHPA1 = new javax.swing.JTextField();
        jTextOZFDBPA1 = new javax.swing.JTextField();
        lblDBZO1 = new javax.swing.JLabel();
        valorOYCH1 = new javax.swing.JTextField();
        valorOZDB1 = new javax.swing.JTextField();
        valorOXCH1 = new javax.swing.JTextField();
        valorOXDB1 = new javax.swing.JTextField();
        valorOYDB1 = new javax.swing.JTextField();
        valorOZCH1 = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        lblCHXO1 = new javax.swing.JLabel();
        lblDBXO1 = new javax.swing.JLabel();
        lblCHYO1 = new javax.swing.JLabel();
        lblDBYO1 = new javax.swing.JLabel();
        lblCHZO1 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jTextOZRDB2 = new javax.swing.JTextField();
        jLabel195 = new javax.swing.JLabel();
        jTextOZRCH2 = new javax.swing.JTextField();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jTextOXRCH2 = new javax.swing.JTextField();
        jTextOXRDB2 = new javax.swing.JTextField();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jTextOYRCH2 = new javax.swing.JTextField();
        jTextOYRDB2 = new javax.swing.JTextField();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jTextOXCH2 = new javax.swing.JTextField();
        jTextOXDB2 = new javax.swing.JTextField();
        jTextOYCH2 = new javax.swing.JTextField();
        jTextOYDB2 = new javax.swing.JTextField();
        jTextOZCH2 = new javax.swing.JTextField();
        jTextOZDB2 = new javax.swing.JTextField();
        jLabel202 = new javax.swing.JLabel();
        jTextOXFCH2 = new javax.swing.JTextField();
        jTextOXFDB2 = new javax.swing.JTextField();
        jTextOYFCH2 = new javax.swing.JTextField();
        jTextOYFDB2 = new javax.swing.JTextField();
        jTextOZFCH2 = new javax.swing.JTextField();
        jTextOZFDB2 = new javax.swing.JTextField();
        jLabel203 = new javax.swing.JLabel();
        jTextOXFCHPA2 = new javax.swing.JTextField();
        jTextOXFDBPA2 = new javax.swing.JTextField();
        jTextOYFCHPA2 = new javax.swing.JTextField();
        jTextOYFDBPA2 = new javax.swing.JTextField();
        jTextOZFCHPA2 = new javax.swing.JTextField();
        jTextOZFDBPA2 = new javax.swing.JTextField();
        lblDBZO2 = new javax.swing.JLabel();
        valorOYCH2 = new javax.swing.JTextField();
        valorOZDB2 = new javax.swing.JTextField();
        valorOXCH2 = new javax.swing.JTextField();
        valorOXDB2 = new javax.swing.JTextField();
        valorOYDB2 = new javax.swing.JTextField();
        valorOZCH2 = new javax.swing.JTextField();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        lblCHXO2 = new javax.swing.JLabel();
        lblDBXO2 = new javax.swing.JLabel();
        lblCHYO2 = new javax.swing.JLabel();
        lblDBYO2 = new javax.swing.JLabel();
        lblCHZO2 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblEmocion1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Davies - Bouldin");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel2.setText("Valor Recomendado");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, -1, -1));

        jLabel3.setText("Tempo Z");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, -1, -1));
        jPanel4.add(jTextTZRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 170, -1));

        jLabel4.setText("Calisky-Harabaz");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jTextTZRCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTZRCHActionPerformed(evt);
            }
        });
        jPanel4.add(jTextTZRCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 170, -1));

        jLabel5.setText("Tempo X");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, -1, -1));

        jLabel6.setText("Calisky-Harabaz");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel7.setText("Davies - Bouldin");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel4.add(jTextTXRCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 170, -1));
        jPanel4.add(jTextTXRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 170, -1));

        jLabel8.setText("Tempo Y");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, -1));

        jLabel9.setText("Calisky-Harabaz");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel10.setText("Davies - Bouldin");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel4.add(jTextTYRCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 170, -1));

        jTextTYRDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTYRDBActionPerformed(evt);
            }
        });
        jPanel4.add(jTextTYRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 170, -1));

        jLabel11.setText("Antes de Fusión");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel12.setText("Tempo X");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));
        jPanel4.add(jTextTXCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, -1));
        jPanel4.add(jTextTXDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, -1));

        jLabel13.setText("Tempo Y");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));
        jPanel4.add(jTextTYCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, -1));
        jPanel4.add(jTextTYDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, -1));

        jLabel14.setText("Tempo Z");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));
        jPanel4.add(jTextTZCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 170, -1));
        jPanel4.add(jTextTZDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 170, -1));

        jLabel15.setText("Despues de Fusión PA");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, -1));

        jLabel16.setText("Tempo X");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));
        jPanel4.add(jTextTXFCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 160, -1));
        jPanel4.add(jTextTXFDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 160, -1));

        jLabel17.setText("Tempo Y");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));
        jPanel4.add(jTextTYFCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));
        jPanel4.add(jTextTYFDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, -1));

        jLabel18.setText("Tempo Z");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, -1));
        jPanel4.add(jTextTZFCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 160, -1));
        jPanel4.add(jTextTZFDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 160, -1));

        jLabel19.setText("Despues de Fusión PP");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 150, -1));

        jLabel20.setText("Tempo X");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));
        jPanel4.add(jTextTXFCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 160, -1));
        jPanel4.add(jTextTXFDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, -1));
        jPanel4.add(jTextTYFCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 160, -1));
        jPanel4.add(jTextTYFDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 160, -1));
        jPanel4.add(jTextTZFCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 160, -1));
        jPanel4.add(jTextTZFDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 160, -1));

        jLabel21.setText("Tempo Y");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel22.setText("Tempo Z");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        lblDBZ.setBackground(new java.awt.Color(0, 102, 102));
        lblDBZ.setForeground(new java.awt.Color(255, 51, 51));
        lblDBZ.setText("Indice Ganador");
        lblDBZ.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(lblDBZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));
        jPanel4.add(valorTYCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 170, -1));
        jPanel4.add(valorTZDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 170, -1));
        jPanel4.add(valorTXCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 170, -1));
        jPanel4.add(valorTXDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 170, -1));
        jPanel4.add(valorTYDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, 170, -1));
        jPanel4.add(valorTZCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 310, 170, -1));

        jLabel24.setText("Indice Ganador Valor");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        jLabel25.setText("Indice Ganador");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        lblCHX.setBackground(new java.awt.Color(0, 102, 102));
        lblCHX.setForeground(new java.awt.Color(255, 51, 51));
        lblCHX.setText("Indice Ganador");
        lblCHX.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(lblCHX, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        lblDBX.setBackground(new java.awt.Color(0, 102, 102));
        lblDBX.setForeground(new java.awt.Color(255, 51, 51));
        lblDBX.setText("Indice Ganador");
        lblDBX.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(lblDBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        lblCHY.setBackground(new java.awt.Color(0, 102, 102));
        lblCHY.setForeground(new java.awt.Color(255, 51, 51));
        lblCHY.setText("Indice Ganador");
        lblCHY.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(lblCHY, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        lblDBY.setBackground(new java.awt.Color(0, 102, 102));
        lblDBY.setForeground(new java.awt.Color(255, 51, 51));
        lblDBY.setText("Indice Ganador");
        lblDBY.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(lblDBY, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        lblCHZ.setBackground(new java.awt.Color(0, 102, 102));
        lblCHZ.setForeground(new java.awt.Color(255, 51, 51));
        lblCHZ.setText("Indice Ganador");
        lblCHZ.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(lblCHZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        jTabbedPane2.addTab("Kmeans", jPanel4);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setText("Davies - Bouldin");
        jPanel10.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel59.setText("Valor Recomendado");
        jPanel10.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, -1, -1));

        jLabel61.setText("Tempo Z");
        jPanel10.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, -1, -1));
        jPanel10.add(jTextTZRDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 170, -1));

        jLabel63.setText("Calisky-Harabaz");
        jPanel10.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jTextTZRCH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTZRCH1ActionPerformed(evt);
            }
        });
        jPanel10.add(jTextTZRCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 170, -1));

        jLabel67.setText("Tempo X");
        jPanel10.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, -1, -1));

        jLabel68.setText("Calisky-Harabaz");
        jPanel10.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel69.setText("Davies - Bouldin");
        jPanel10.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel10.add(jTextTXRCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 170, -1));
        jPanel10.add(jTextTXRDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 170, -1));

        jLabel71.setText("Tempo Y");
        jPanel10.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, -1));

        jLabel72.setText("Calisky-Harabaz");
        jPanel10.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel82.setText("Davies - Bouldin");
        jPanel10.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel10.add(jTextTYRCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 170, -1));

        jTextTYRDB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTYRDB1ActionPerformed(evt);
            }
        });
        jPanel10.add(jTextTYRDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 170, -1));

        jLabel83.setText("Antes de Fusión");
        jPanel10.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel84.setText("Tempo X");
        jPanel10.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));
        jPanel10.add(jTextTXCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, -1));
        jPanel10.add(jTextTXDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, -1));

        jLabel85.setText("Tempo Y");
        jPanel10.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));
        jPanel10.add(jTextTYCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, -1));
        jPanel10.add(jTextTYDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, -1));

        jLabel86.setText("Tempo Z");
        jPanel10.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));
        jPanel10.add(jTextTZCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 170, -1));
        jPanel10.add(jTextTZDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 170, -1));

        jLabel87.setText("Despues de Fusión PA");
        jPanel10.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, -1));

        jLabel88.setText("Tempo X");
        jPanel10.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));
        jPanel10.add(jTextTXFCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 160, -1));
        jPanel10.add(jTextTXFDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 160, -1));

        jLabel89.setText("Tempo Y");
        jPanel10.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));
        jPanel10.add(jTextTYFCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));
        jPanel10.add(jTextTYFDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, -1));

        jLabel90.setText("Tempo Z");
        jPanel10.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, -1));
        jPanel10.add(jTextTZFCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 160, -1));
        jPanel10.add(jTextTZFDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 160, -1));

        jLabel91.setText("Despues de Fusión PP");
        jPanel10.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 150, -1));

        jLabel92.setText("Tempo X");
        jPanel10.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));
        jPanel10.add(jTextTXFCHPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 160, -1));
        jPanel10.add(jTextTXFDBPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, -1));
        jPanel10.add(jTextTYFCHPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 160, -1));
        jPanel10.add(jTextTYFDBPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 160, -1));
        jPanel10.add(jTextTZFCHPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 160, -1));
        jPanel10.add(jTextTZFDBPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 160, -1));

        jLabel93.setText("Tempo Y");
        jPanel10.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel94.setText("Tempo Z");
        jPanel10.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        lblDBZ1.setBackground(new java.awt.Color(0, 102, 102));
        lblDBZ1.setForeground(new java.awt.Color(255, 51, 51));
        lblDBZ1.setText("Indice Ganador");
        lblDBZ1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(lblDBZ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));
        jPanel10.add(valorTYCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 170, -1));
        jPanel10.add(valorTZDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 170, -1));
        jPanel10.add(valorTXCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 170, -1));
        jPanel10.add(valorTXDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 170, -1));
        jPanel10.add(valorTYDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, 170, -1));
        jPanel10.add(valorTZCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 310, 170, -1));

        jLabel95.setText("Indice Ganador Valor");
        jPanel10.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        jLabel96.setText("Indice Ganador");
        jPanel10.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        lblCHX1.setBackground(new java.awt.Color(0, 102, 102));
        lblCHX1.setForeground(new java.awt.Color(255, 51, 51));
        lblCHX1.setText("Indice Ganador");
        lblCHX1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(lblCHX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        lblDBX1.setBackground(new java.awt.Color(0, 102, 102));
        lblDBX1.setForeground(new java.awt.Color(255, 51, 51));
        lblDBX1.setText("Indice Ganador");
        lblDBX1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(lblDBX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        lblCHY1.setBackground(new java.awt.Color(0, 102, 102));
        lblCHY1.setForeground(new java.awt.Color(255, 51, 51));
        lblCHY1.setText("Indice Ganador");
        lblCHY1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(lblCHY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        lblDBY1.setBackground(new java.awt.Color(0, 102, 102));
        lblDBY1.setForeground(new java.awt.Color(255, 51, 51));
        lblDBY1.setText("Indice Ganador");
        lblDBY1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(lblDBY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        lblCHZ1.setBackground(new java.awt.Color(0, 102, 102));
        lblCHZ1.setForeground(new java.awt.Color(255, 51, 51));
        lblCHZ1.setText("Indice Ganador");
        lblCHZ1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(lblCHZ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1123, Short.MAX_VALUE)
            .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel5Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 483, Short.MAX_VALUE)
            .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel5Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 483, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Xmeans", jPanel5);

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel145.setText("Davies - Bouldin");
        jPanel14.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel146.setText("Valor Recomendado");
        jPanel14.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, -1, -1));

        jLabel147.setText("Tempo Z");
        jPanel14.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, -1, -1));
        jPanel14.add(jTextTZRDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 170, -1));

        jLabel148.setText("Calisky-Harabaz");
        jPanel14.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jTextTZRCH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTZRCH2ActionPerformed(evt);
            }
        });
        jPanel14.add(jTextTZRCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 170, -1));

        jLabel149.setText("Tempo X");
        jPanel14.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, -1, -1));

        jLabel150.setText("Calisky-Harabaz");
        jPanel14.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel151.setText("Davies - Bouldin");
        jPanel14.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel14.add(jTextTXRCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 170, -1));
        jPanel14.add(jTextTXRDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 170, -1));

        jLabel152.setText("Tempo Y");
        jPanel14.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, -1));

        jLabel153.setText("Calisky-Harabaz");
        jPanel14.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel154.setText("Davies - Bouldin");
        jPanel14.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel14.add(jTextTYRCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 170, -1));

        jTextTYRDB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTYRDB2ActionPerformed(evt);
            }
        });
        jPanel14.add(jTextTYRDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 170, -1));

        jLabel155.setText("Antes de Fusión");
        jPanel14.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel156.setText("Tempo X");
        jPanel14.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));
        jPanel14.add(jTextTXCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, -1));
        jPanel14.add(jTextTXDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, -1));

        jLabel157.setText("Tempo Y");
        jPanel14.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));
        jPanel14.add(jTextTYCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, -1));
        jPanel14.add(jTextTYDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, -1));

        jLabel158.setText("Tempo Z");
        jPanel14.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));
        jPanel14.add(jTextTZCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 170, -1));
        jPanel14.add(jTextTZDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 170, -1));

        jLabel159.setText("Despues de Fusión PA");
        jPanel14.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, -1));

        jLabel160.setText("Tempo X");
        jPanel14.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));
        jPanel14.add(jTextTXFCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 160, -1));
        jPanel14.add(jTextTXFDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 160, -1));

        jLabel161.setText("Tempo Y");
        jPanel14.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));
        jPanel14.add(jTextTYFCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));
        jPanel14.add(jTextTYFDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, -1));

        jLabel162.setText("Tempo Z");
        jPanel14.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, -1));
        jPanel14.add(jTextTZFCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 160, -1));
        jPanel14.add(jTextTZFDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 160, -1));

        jLabel163.setText("Despues de Fusión PP");
        jPanel14.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 150, -1));

        jLabel164.setText("Tempo X");
        jPanel14.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));
        jPanel14.add(jTextTXFCHPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 160, -1));
        jPanel14.add(jTextTXFDBPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, -1));
        jPanel14.add(jTextTYFCHPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 160, -1));
        jPanel14.add(jTextTYFDBPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 160, -1));
        jPanel14.add(jTextTZFCHPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 160, -1));
        jPanel14.add(jTextTZFDBPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 160, -1));

        jLabel165.setText("Tempo Y");
        jPanel14.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel166.setText("Tempo Z");
        jPanel14.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        lblDBZ2.setBackground(new java.awt.Color(0, 102, 102));
        lblDBZ2.setForeground(new java.awt.Color(255, 51, 51));
        lblDBZ2.setText("Indice Ganador");
        lblDBZ2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.add(lblDBZ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));
        jPanel14.add(valorTYCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 170, -1));
        jPanel14.add(valorTZDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 170, -1));
        jPanel14.add(valorTXCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 170, -1));
        jPanel14.add(valorTXDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 170, -1));
        jPanel14.add(valorTYDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, 170, -1));
        jPanel14.add(valorTZCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 310, 170, -1));

        jLabel167.setText("Indice Ganador Valor");
        jPanel14.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        jLabel168.setText("Indice Ganador");
        jPanel14.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        lblCHX2.setBackground(new java.awt.Color(0, 102, 102));
        lblCHX2.setForeground(new java.awt.Color(255, 51, 51));
        lblCHX2.setText("Indice Ganador");
        lblCHX2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.add(lblCHX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        lblDBX2.setBackground(new java.awt.Color(0, 102, 102));
        lblDBX2.setForeground(new java.awt.Color(255, 51, 51));
        lblDBX2.setText("Indice Ganador");
        lblDBX2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.add(lblDBX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        lblCHY2.setBackground(new java.awt.Color(0, 102, 102));
        lblCHY2.setForeground(new java.awt.Color(255, 51, 51));
        lblCHY2.setText("Indice Ganador");
        lblCHY2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.add(lblCHY2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        lblDBY2.setBackground(new java.awt.Color(0, 102, 102));
        lblDBY2.setForeground(new java.awt.Color(255, 51, 51));
        lblDBY2.setText("Indice Ganador");
        lblDBY2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.add(lblDBY2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        lblCHZ2.setBackground(new java.awt.Color(0, 102, 102));
        lblCHZ2.setForeground(new java.awt.Color(255, 51, 51));
        lblCHZ2.setText("Indice Ganador");
        lblCHZ2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.add(lblCHZ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        org.jdesktop.layout.GroupLayout jPanel13Layout = new org.jdesktop.layout.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1123, Short.MAX_VALUE)
            .add(jPanel13Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel13Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 483, Short.MAX_VALUE)
            .add(jPanel13Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel13Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 483, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("EM", jPanel13);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .add(jTabbedPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(28, 28, 28)
                .add(jTabbedPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 529, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tempos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setText("Davies - Bouldin");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel26.setText("Valor Recomendado");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, -1, -1));
        jPanel6.add(jTextDZRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 170, -1));

        jLabel28.setText("Calisky-Harabaz");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jTextDZRCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDZRCHActionPerformed(evt);
            }
        });
        jPanel6.add(jTextDZRCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 170, -1));

        jLabel30.setText("Calisky-Harabaz");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel31.setText("Davies - Bouldin");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel6.add(jTextDXRCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 170, -1));
        jPanel6.add(jTextDXRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 170, -1));

        jLabel33.setText("Calisky-Harabaz");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel34.setText("Davies - Bouldin");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel6.add(jTextDYRCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 170, -1));

        jTextDYRDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDYRDBActionPerformed(evt);
            }
        });
        jPanel6.add(jTextDYRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 170, -1));

        jLabel35.setText("Antes de Fusión");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel36.setText("Duracion X");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));
        jPanel6.add(jTextDXCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, -1));
        jPanel6.add(jTextDXDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, -1));

        jLabel37.setText("Duracion Y");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, -1, -1));
        jPanel6.add(jTextDYCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, -1));
        jPanel6.add(jTextDYDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, -1));

        jLabel38.setText("Duracion Z");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, -1, -1));
        jPanel6.add(jTextDZCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 170, -1));
        jPanel6.add(jTextDZDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 170, -1));

        jLabel39.setText("Despues de Fusión PA");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, -1));

        jLabel40.setText("Duracion X");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, -1, -1));
        jPanel6.add(jTextDXFCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 160, -1));
        jPanel6.add(jTextDXFDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 160, -1));
        jPanel6.add(jTextDYFCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));
        jPanel6.add(jTextDYFDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, -1));
        jPanel6.add(jTextDZFCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 160, -1));
        jPanel6.add(jTextDZFDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 160, -1));

        jLabel43.setText("Despues de Fusión PP");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 150, -1));

        jLabel44.setText("Duracion X");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));
        jPanel6.add(jTextDXFCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 160, -1));
        jPanel6.add(jTextDXFDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, -1));
        jPanel6.add(jTextDYFCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 160, -1));
        jPanel6.add(jTextDYFDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 160, -1));
        jPanel6.add(jTextDZFCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 160, -1));
        jPanel6.add(jTextDZFDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 160, -1));

        lblDBZD.setBackground(new java.awt.Color(0, 102, 102));
        lblDBZD.setForeground(new java.awt.Color(255, 51, 51));
        lblDBZD.setText("Indice Ganador");
        lblDBZD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(lblDBZD, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));
        jPanel6.add(valorDYCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 170, -1));
        jPanel6.add(valorDZDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 170, -1));
        jPanel6.add(valorDXCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 170, -1));
        jPanel6.add(valorDXDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 170, -1));
        jPanel6.add(valorDYDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, 170, -1));
        jPanel6.add(valorDZCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 310, 170, -1));

        jLabel47.setText("Indice Ganador Valor");
        jPanel6.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        jLabel48.setText("Indice Ganador");
        jPanel6.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        lblCHXD.setBackground(new java.awt.Color(0, 102, 102));
        lblCHXD.setForeground(new java.awt.Color(255, 51, 51));
        lblCHXD.setText("Indice Ganador");
        lblCHXD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(lblCHXD, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        lblDBXD.setBackground(new java.awt.Color(0, 102, 102));
        lblDBXD.setForeground(new java.awt.Color(255, 51, 51));
        lblDBXD.setText("Indice Ganador");
        lblDBXD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(lblDBXD, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        lblCHYD.setBackground(new java.awt.Color(0, 102, 102));
        lblCHYD.setForeground(new java.awt.Color(255, 51, 51));
        lblCHYD.setText("Indice Ganador");
        lblCHYD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(lblCHYD, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        lblDBYD.setBackground(new java.awt.Color(0, 102, 102));
        lblDBYD.setForeground(new java.awt.Color(255, 51, 51));
        lblDBYD.setText("Indice Ganador");
        lblDBYD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(lblDBYD, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        lblCHZD.setBackground(new java.awt.Color(0, 102, 102));
        lblCHZD.setForeground(new java.awt.Color(255, 51, 51));
        lblCHZD.setText("Indice Ganador");
        lblCHZD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(lblCHZD, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        jLabel49.setText("Duracion Y");
        jPanel6.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel50.setText("Duracion Y");
        jPanel6.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel51.setText("Duracion X");
        jPanel6.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabel52.setText("Duracion Y");
        jPanel6.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel53.setText("Duracion Z");
        jPanel6.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jLabel54.setText("Duracion Z");
        jPanel6.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        jLabel55.setText("Duracion Z");
        jPanel6.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        jTabbedPane3.addTab("Kmeans", jPanel6);

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel97.setText("Davies - Bouldin");
        jPanel11.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel98.setText("Valor Recomendado");
        jPanel11.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, -1, -1));
        jPanel11.add(jTextDZRDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 170, -1));

        jLabel99.setText("Calisky-Harabaz");
        jPanel11.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jTextDZRCH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDZRCH1ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextDZRCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 170, -1));

        jLabel100.setText("Calisky-Harabaz");
        jPanel11.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel101.setText("Davies - Bouldin");
        jPanel11.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel11.add(jTextDXRCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 170, -1));
        jPanel11.add(jTextDXRDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 170, -1));

        jLabel102.setText("Calisky-Harabaz");
        jPanel11.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel103.setText("Davies - Bouldin");
        jPanel11.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel11.add(jTextDYRCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 170, -1));

        jTextDYRDB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDYRDB1ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextDYRDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 170, -1));

        jLabel104.setText("Antes de Fusión");
        jPanel11.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel105.setText("Duracion X");
        jPanel11.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));
        jPanel11.add(jTextDXCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, -1));
        jPanel11.add(jTextDXDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, -1));

        jLabel106.setText("Duracion Y");
        jPanel11.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, -1, -1));
        jPanel11.add(jTextDYCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, -1));
        jPanel11.add(jTextDYDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, -1));

        jLabel107.setText("Duracion Z");
        jPanel11.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, -1, -1));
        jPanel11.add(jTextDZCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 170, -1));
        jPanel11.add(jTextDZDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 170, -1));

        jLabel108.setText("Despues de Fusión PA");
        jPanel11.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, -1));

        jLabel109.setText("Duracion X");
        jPanel11.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, -1, -1));
        jPanel11.add(jTextDXFCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 160, -1));
        jPanel11.add(jTextDXFDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 160, -1));
        jPanel11.add(jTextDYFCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));
        jPanel11.add(jTextDYFDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, -1));
        jPanel11.add(jTextDZFCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 160, -1));
        jPanel11.add(jTextDZFDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 160, -1));

        jLabel110.setText("Despues de Fusión PP");
        jPanel11.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 150, -1));

        jLabel111.setText("Duracion X");
        jPanel11.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));
        jPanel11.add(jTextDXFCHPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 160, -1));
        jPanel11.add(jTextDXFDBPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, -1));
        jPanel11.add(jTextDYFCHPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 160, -1));
        jPanel11.add(jTextDYFDBPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 160, -1));
        jPanel11.add(jTextDZFCHPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 160, -1));
        jPanel11.add(jTextDZFDBPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 160, -1));

        lblDBZD1.setBackground(new java.awt.Color(0, 102, 102));
        lblDBZD1.setForeground(new java.awt.Color(255, 51, 51));
        lblDBZD1.setText("Indice Ganador");
        lblDBZD1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.add(lblDBZD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));
        jPanel11.add(valorDYCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 170, -1));
        jPanel11.add(valorDZDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 170, -1));
        jPanel11.add(valorDXCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 170, -1));
        jPanel11.add(valorDXDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 170, -1));
        jPanel11.add(valorDYDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, 170, -1));
        jPanel11.add(valorDZCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 310, 170, -1));

        jLabel112.setText("Indice Ganador Valor");
        jPanel11.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        jLabel113.setText("Indice Ganador");
        jPanel11.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        lblCHXD1.setBackground(new java.awt.Color(0, 102, 102));
        lblCHXD1.setForeground(new java.awt.Color(255, 51, 51));
        lblCHXD1.setText("Indice Ganador");
        lblCHXD1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.add(lblCHXD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        lblDBXD1.setBackground(new java.awt.Color(0, 102, 102));
        lblDBXD1.setForeground(new java.awt.Color(255, 51, 51));
        lblDBXD1.setText("Indice Ganador");
        lblDBXD1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.add(lblDBXD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        lblCHYD1.setBackground(new java.awt.Color(0, 102, 102));
        lblCHYD1.setForeground(new java.awt.Color(255, 51, 51));
        lblCHYD1.setText("Indice Ganador");
        lblCHYD1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.add(lblCHYD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        lblDBYD1.setBackground(new java.awt.Color(0, 102, 102));
        lblDBYD1.setForeground(new java.awt.Color(255, 51, 51));
        lblDBYD1.setText("Indice Ganador");
        lblDBYD1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.add(lblDBYD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        lblCHZD1.setBackground(new java.awt.Color(0, 102, 102));
        lblCHZD1.setForeground(new java.awt.Color(255, 51, 51));
        lblCHZD1.setText("Indice Ganador");
        lblCHZD1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.add(lblCHZD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        jLabel114.setText("Duracion Y");
        jPanel11.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel115.setText("Duracion Y");
        jPanel11.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel116.setText("Duracion X");
        jPanel11.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabel117.setText("Duracion Y");
        jPanel11.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel118.setText("Duracion Z");
        jPanel11.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jLabel119.setText("Duracion Z");
        jPanel11.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        jLabel120.setText("Duracion Z");
        jPanel11.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1123, Short.MAX_VALUE)
            .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel7Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 483, Short.MAX_VALUE)
            .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel7Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 483, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane3.addTab("Xmeans", jPanel7);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel169.setText("Davies - Bouldin");
        jPanel16.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel170.setText("Valor Recomendado");
        jPanel16.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, -1, -1));
        jPanel16.add(jTextDZRDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 170, -1));

        jLabel171.setText("Calisky-Harabaz");
        jPanel16.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jTextDZRCH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDZRCH2ActionPerformed(evt);
            }
        });
        jPanel16.add(jTextDZRCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 170, -1));

        jLabel172.setText("Calisky-Harabaz");
        jPanel16.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel173.setText("Davies - Bouldin");
        jPanel16.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel16.add(jTextDXRCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 170, -1));
        jPanel16.add(jTextDXRDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 170, -1));

        jLabel174.setText("Calisky-Harabaz");
        jPanel16.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel175.setText("Davies - Bouldin");
        jPanel16.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel16.add(jTextDYRCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 170, -1));

        jTextDYRDB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDYRDB2ActionPerformed(evt);
            }
        });
        jPanel16.add(jTextDYRDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 170, -1));

        jLabel176.setText("Antes de Fusión");
        jPanel16.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel177.setText("Duracion X");
        jPanel16.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));
        jPanel16.add(jTextDXCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, -1));
        jPanel16.add(jTextDXDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, -1));

        jLabel178.setText("Duracion Y");
        jPanel16.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, -1, -1));
        jPanel16.add(jTextDYCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, -1));
        jPanel16.add(jTextDYDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, -1));

        jLabel179.setText("Duracion Z");
        jPanel16.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, -1, -1));
        jPanel16.add(jTextDZCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 170, -1));
        jPanel16.add(jTextDZDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 170, -1));

        jLabel180.setText("Despues de Fusión PA");
        jPanel16.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, -1));

        jLabel181.setText("Duracion X");
        jPanel16.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, -1, -1));
        jPanel16.add(jTextDXFCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 160, -1));
        jPanel16.add(jTextDXFDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 160, -1));
        jPanel16.add(jTextDYFCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));
        jPanel16.add(jTextDYFDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, -1));
        jPanel16.add(jTextDZFCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 160, -1));
        jPanel16.add(jTextDZFDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 160, -1));

        jLabel182.setText("Despues de Fusión PP");
        jPanel16.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 150, -1));

        jLabel183.setText("Duracion X");
        jPanel16.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));
        jPanel16.add(jTextDXFCHPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 160, -1));
        jPanel16.add(jTextDXFDBPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, -1));
        jPanel16.add(jTextDYFCHPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 160, -1));
        jPanel16.add(jTextDYFDBPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 160, -1));
        jPanel16.add(jTextDZFCHPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 160, -1));
        jPanel16.add(jTextDZFDBPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 160, -1));

        lblDBZD2.setBackground(new java.awt.Color(0, 102, 102));
        lblDBZD2.setForeground(new java.awt.Color(255, 51, 51));
        lblDBZD2.setText("Indice Ganador");
        lblDBZD2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel16.add(lblDBZD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));
        jPanel16.add(valorDYCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 170, -1));
        jPanel16.add(valorDZDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 170, -1));
        jPanel16.add(valorDXCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 170, -1));
        jPanel16.add(valorDXDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 170, -1));
        jPanel16.add(valorDYDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, 170, -1));
        jPanel16.add(valorDZCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 310, 170, -1));

        jLabel184.setText("Indice Ganador Valor");
        jPanel16.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        jLabel185.setText("Indice Ganador");
        jPanel16.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        lblCHXD2.setBackground(new java.awt.Color(0, 102, 102));
        lblCHXD2.setForeground(new java.awt.Color(255, 51, 51));
        lblCHXD2.setText("Indice Ganador");
        lblCHXD2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel16.add(lblCHXD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        lblDBXD2.setBackground(new java.awt.Color(0, 102, 102));
        lblDBXD2.setForeground(new java.awt.Color(255, 51, 51));
        lblDBXD2.setText("Indice Ganador");
        lblDBXD2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel16.add(lblDBXD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        lblCHYD2.setBackground(new java.awt.Color(0, 102, 102));
        lblCHYD2.setForeground(new java.awt.Color(255, 51, 51));
        lblCHYD2.setText("Indice Ganador");
        lblCHYD2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel16.add(lblCHYD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        lblDBYD2.setBackground(new java.awt.Color(0, 102, 102));
        lblDBYD2.setForeground(new java.awt.Color(255, 51, 51));
        lblDBYD2.setText("Indice Ganador");
        lblDBYD2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel16.add(lblDBYD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        lblCHZD2.setBackground(new java.awt.Color(0, 102, 102));
        lblCHZD2.setForeground(new java.awt.Color(255, 51, 51));
        lblCHZD2.setText("Indice Ganador");
        lblCHZD2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel16.add(lblCHZD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        jLabel186.setText("Duracion Y");
        jPanel16.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel187.setText("Duracion Y");
        jPanel16.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel188.setText("Duracion X");
        jPanel16.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabel189.setText("Duracion Y");
        jPanel16.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel190.setText("Duracion Z");
        jPanel16.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jLabel191.setText("Duracion Z");
        jPanel16.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        jLabel192.setText("Duracion Z");
        jPanel16.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        org.jdesktop.layout.GroupLayout jPanel15Layout = new org.jdesktop.layout.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1123, Short.MAX_VALUE)
            .add(jPanel15Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel15Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 483, Short.MAX_VALUE)
            .add(jPanel15Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel15Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 483, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane3.addTab("EM", jPanel15);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .add(jTabbedPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(28, 28, 28)
                .add(jTabbedPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 529, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Duración", jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setText("Davies - Bouldin");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel29.setText("Valor Recomendado");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, -1, -1));
        jPanel8.add(jTextOZRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 170, -1));

        jLabel32.setText("Calisky-Harabaz");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jTextOZRCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextOZRCHActionPerformed(evt);
            }
        });
        jPanel8.add(jTextOZRCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 170, -1));

        jLabel41.setText("Calisky-Harabaz");
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel42.setText("Davies - Bouldin");
        jPanel8.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel8.add(jTextOXRCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 170, -1));
        jPanel8.add(jTextOXRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 170, -1));

        jLabel45.setText("Calisky-Harabaz");
        jPanel8.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel46.setText("Davies - Bouldin");
        jPanel8.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel8.add(jTextOYRCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 170, -1));

        jTextOYRDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextOYRDBActionPerformed(evt);
            }
        });
        jPanel8.add(jTextOYRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 170, -1));

        jLabel56.setText("Antes de Fusión");
        jPanel8.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel57.setText("Octava X");
        jPanel8.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, -1, -1));
        jPanel8.add(jTextOXCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, -1));
        jPanel8.add(jTextOXDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, -1));
        jPanel8.add(jTextOYCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, -1));
        jPanel8.add(jTextOYDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, -1));
        jPanel8.add(jTextOZCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 170, -1));
        jPanel8.add(jTextOZDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 170, -1));

        jLabel60.setText("Despues de Fusión PA");
        jPanel8.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, -1));
        jPanel8.add(jTextOXFCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 160, -1));
        jPanel8.add(jTextOXFDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 160, -1));
        jPanel8.add(jTextOYFCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));
        jPanel8.add(jTextOYFDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, -1));
        jPanel8.add(jTextOZFCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 160, -1));
        jPanel8.add(jTextOZFDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 160, -1));

        jLabel62.setText("Despues de Fusión PP");
        jPanel8.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 150, -1));
        jPanel8.add(jTextOXFCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 160, -1));

        jTextOXFDBPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextOXFDBPAActionPerformed(evt);
            }
        });
        jPanel8.add(jTextOXFDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, -1));
        jPanel8.add(jTextOYFCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 160, -1));
        jPanel8.add(jTextOYFDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 160, -1));
        jPanel8.add(jTextOZFCHPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 160, -1));
        jPanel8.add(jTextOZFDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 160, -1));

        lblDBZO.setBackground(new java.awt.Color(0, 102, 102));
        lblDBZO.setForeground(new java.awt.Color(255, 51, 51));
        lblDBZO.setText("Indice Ganador");
        lblDBZO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.add(lblDBZO, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));
        jPanel8.add(valorOYCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 170, -1));
        jPanel8.add(valorOZDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 170, -1));
        jPanel8.add(valorOXCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 170, -1));
        jPanel8.add(valorOXDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 170, -1));
        jPanel8.add(valorOYDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, 170, -1));
        jPanel8.add(valorOZCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 310, 170, -1));

        jLabel64.setText("Indice Ganador Valor");
        jPanel8.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        jLabel65.setText("Indice Ganador");
        jPanel8.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        lblCHXO.setBackground(new java.awt.Color(0, 102, 102));
        lblCHXO.setForeground(new java.awt.Color(255, 51, 51));
        lblCHXO.setText("Indice Ganador");
        lblCHXO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.add(lblCHXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        lblDBXO.setBackground(new java.awt.Color(0, 102, 102));
        lblDBXO.setForeground(new java.awt.Color(255, 51, 51));
        lblDBXO.setText("Indice Ganador");
        lblDBXO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.add(lblDBXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        lblCHYO.setBackground(new java.awt.Color(0, 102, 102));
        lblCHYO.setForeground(new java.awt.Color(255, 51, 51));
        lblCHYO.setText("Indice Ganador");
        lblCHYO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.add(lblCHYO, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        lblDBYO.setBackground(new java.awt.Color(0, 102, 102));
        lblDBYO.setForeground(new java.awt.Color(255, 51, 51));
        lblDBYO.setText("Indice Ganador");
        lblDBYO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.add(lblDBYO, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        lblCHZO.setBackground(new java.awt.Color(0, 102, 102));
        lblCHZO.setForeground(new java.awt.Color(255, 51, 51));
        lblCHZO.setText("Indice Ganador");
        lblCHZO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.add(lblCHZO, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        jLabel66.setText("Octava Y");
        jPanel8.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, -1, -1));

        jLabel70.setText("Octava Z");
        jPanel8.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, -1, -1));

        jLabel73.setText("Octava X");
        jPanel8.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel74.setText("Octava X");
        jPanel8.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabel75.setText("Octava X");
        jPanel8.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jLabel76.setText("Octava Y");
        jPanel8.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel77.setText("Octava Y");
        jPanel8.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        jLabel78.setText("Octava Y");
        jPanel8.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel79.setText("Octava Z");
        jPanel8.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jLabel80.setText("Octava Z");
        jPanel8.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        jLabel81.setText("Octava Z");
        jPanel8.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        jTabbedPane4.addTab("Kmeans", jPanel8);

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel121.setText("Davies - Bouldin");
        jPanel12.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel122.setText("Valor Recomendado");
        jPanel12.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, -1, -1));
        jPanel12.add(jTextOZRDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 170, -1));

        jLabel123.setText("Calisky-Harabaz");
        jPanel12.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jTextOZRCH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextOZRCH1ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextOZRCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 170, -1));

        jLabel124.setText("Calisky-Harabaz");
        jPanel12.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel125.setText("Davies - Bouldin");
        jPanel12.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel12.add(jTextOXRCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 170, -1));
        jPanel12.add(jTextOXRDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 170, -1));

        jLabel126.setText("Calisky-Harabaz");
        jPanel12.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel127.setText("Davies - Bouldin");
        jPanel12.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel12.add(jTextOYRCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 170, -1));

        jTextOYRDB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextOYRDB1ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextOYRDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 170, -1));

        jLabel128.setText("Antes de Fusión");
        jPanel12.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel129.setText("Octava X");
        jPanel12.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, -1, -1));
        jPanel12.add(jTextOXCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, -1));
        jPanel12.add(jTextOXDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, -1));
        jPanel12.add(jTextOYCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, -1));
        jPanel12.add(jTextOYDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, -1));
        jPanel12.add(jTextOZCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 170, -1));
        jPanel12.add(jTextOZDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 170, -1));

        jLabel130.setText("Despues de Fusión PA");
        jPanel12.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, -1));
        jPanel12.add(jTextOXFCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 160, -1));
        jPanel12.add(jTextOXFDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 160, -1));
        jPanel12.add(jTextOYFCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));
        jPanel12.add(jTextOYFDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, -1));
        jPanel12.add(jTextOZFCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 160, -1));
        jPanel12.add(jTextOZFDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 160, -1));

        jLabel131.setText("Despues de Fusión PP");
        jPanel12.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 150, -1));
        jPanel12.add(jTextOXFCHPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 160, -1));
        jPanel12.add(jTextOXFDBPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, -1));
        jPanel12.add(jTextOYFCHPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 160, -1));
        jPanel12.add(jTextOYFDBPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 160, -1));
        jPanel12.add(jTextOZFCHPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 160, -1));
        jPanel12.add(jTextOZFDBPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 160, -1));

        lblDBZO1.setBackground(new java.awt.Color(0, 102, 102));
        lblDBZO1.setForeground(new java.awt.Color(255, 51, 51));
        lblDBZO1.setText("Indice Ganador");
        lblDBZO1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.add(lblDBZO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));
        jPanel12.add(valorOYCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 170, -1));
        jPanel12.add(valorOZDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 170, -1));
        jPanel12.add(valorOXCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 170, -1));
        jPanel12.add(valorOXDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 170, -1));
        jPanel12.add(valorOYDB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, 170, -1));
        jPanel12.add(valorOZCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 310, 170, -1));

        jLabel132.setText("Indice Ganador Valor");
        jPanel12.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        jLabel133.setText("Indice Ganador");
        jPanel12.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        lblCHXO1.setBackground(new java.awt.Color(0, 102, 102));
        lblCHXO1.setForeground(new java.awt.Color(255, 51, 51));
        lblCHXO1.setText("Indice Ganador");
        lblCHXO1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.add(lblCHXO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        lblDBXO1.setBackground(new java.awt.Color(0, 102, 102));
        lblDBXO1.setForeground(new java.awt.Color(255, 51, 51));
        lblDBXO1.setText("Indice Ganador");
        lblDBXO1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.add(lblDBXO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        lblCHYO1.setBackground(new java.awt.Color(0, 102, 102));
        lblCHYO1.setForeground(new java.awt.Color(255, 51, 51));
        lblCHYO1.setText("Indice Ganador");
        lblCHYO1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.add(lblCHYO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        lblDBYO1.setBackground(new java.awt.Color(0, 102, 102));
        lblDBYO1.setForeground(new java.awt.Color(255, 51, 51));
        lblDBYO1.setText("Indice Ganador");
        lblDBYO1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.add(lblDBYO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        lblCHZO1.setBackground(new java.awt.Color(0, 102, 102));
        lblCHZO1.setForeground(new java.awt.Color(255, 51, 51));
        lblCHZO1.setText("Indice Ganador");
        lblCHZO1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.add(lblCHZO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        jLabel134.setText("Octava Y");
        jPanel12.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, -1, -1));

        jLabel135.setText("Octava Z");
        jPanel12.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, -1, -1));

        jLabel136.setText("Octava X");
        jPanel12.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel137.setText("Octava X");
        jPanel12.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabel138.setText("Octava X");
        jPanel12.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jLabel139.setText("Octava Y");
        jPanel12.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel140.setText("Octava Y");
        jPanel12.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        jLabel141.setText("Octava Y");
        jPanel12.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel142.setText("Octava Z");
        jPanel12.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jLabel143.setText("Octava Z");
        jPanel12.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        jLabel144.setText("Octava Z");
        jPanel12.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        org.jdesktop.layout.GroupLayout jPanel9Layout = new org.jdesktop.layout.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1123, Short.MAX_VALUE)
            .add(jPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel9Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 483, Short.MAX_VALUE)
            .add(jPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel9Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 483, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("Xmeans", jPanel9);

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel193.setText("Davies - Bouldin");
        jPanel18.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel194.setText("Valor Recomendado");
        jPanel18.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, -1, -1));
        jPanel18.add(jTextOZRDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 170, -1));

        jLabel195.setText("Calisky-Harabaz");
        jPanel18.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jTextOZRCH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextOZRCH2ActionPerformed(evt);
            }
        });
        jPanel18.add(jTextOZRCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 170, -1));

        jLabel196.setText("Calisky-Harabaz");
        jPanel18.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel197.setText("Davies - Bouldin");
        jPanel18.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel18.add(jTextOXRCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 170, -1));
        jPanel18.add(jTextOXRDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 170, -1));

        jLabel198.setText("Calisky-Harabaz");
        jPanel18.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel199.setText("Davies - Bouldin");
        jPanel18.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel18.add(jTextOYRCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 170, -1));

        jTextOYRDB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextOYRDB2ActionPerformed(evt);
            }
        });
        jPanel18.add(jTextOYRDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 170, -1));

        jLabel200.setText("Antes de Fusión");
        jPanel18.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel201.setText("Octava X");
        jPanel18.add(jLabel201, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, -1, -1));
        jPanel18.add(jTextOXCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, -1));
        jPanel18.add(jTextOXDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, -1));
        jPanel18.add(jTextOYCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, -1));
        jPanel18.add(jTextOYDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, -1));
        jPanel18.add(jTextOZCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 170, -1));
        jPanel18.add(jTextOZDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 170, -1));

        jLabel202.setText("Despues de Fusión PA");
        jPanel18.add(jLabel202, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, -1));
        jPanel18.add(jTextOXFCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 160, -1));
        jPanel18.add(jTextOXFDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 160, -1));
        jPanel18.add(jTextOYFCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));
        jPanel18.add(jTextOYFDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, -1));
        jPanel18.add(jTextOZFCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 160, -1));
        jPanel18.add(jTextOZFDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 160, -1));

        jLabel203.setText("Despues de Fusión PP");
        jPanel18.add(jLabel203, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 150, -1));
        jPanel18.add(jTextOXFCHPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 160, -1));
        jPanel18.add(jTextOXFDBPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, -1));
        jPanel18.add(jTextOYFCHPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 160, -1));
        jPanel18.add(jTextOYFDBPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 160, -1));
        jPanel18.add(jTextOZFCHPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 160, -1));
        jPanel18.add(jTextOZFDBPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 160, -1));

        lblDBZO2.setBackground(new java.awt.Color(0, 102, 102));
        lblDBZO2.setForeground(new java.awt.Color(255, 51, 51));
        lblDBZO2.setText("Indice Ganador");
        lblDBZO2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.add(lblDBZO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));
        jPanel18.add(valorOYCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 170, -1));
        jPanel18.add(valorOZDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 170, -1));
        jPanel18.add(valorOXCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 170, -1));
        jPanel18.add(valorOXDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 170, -1));
        jPanel18.add(valorOYDB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, 170, -1));
        jPanel18.add(valorOZCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 310, 170, -1));

        jLabel204.setText("Indice Ganador Valor");
        jPanel18.add(jLabel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        jLabel205.setText("Indice Ganador");
        jPanel18.add(jLabel205, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        lblCHXO2.setBackground(new java.awt.Color(0, 102, 102));
        lblCHXO2.setForeground(new java.awt.Color(255, 51, 51));
        lblCHXO2.setText("Indice Ganador");
        lblCHXO2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.add(lblCHXO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        lblDBXO2.setBackground(new java.awt.Color(0, 102, 102));
        lblDBXO2.setForeground(new java.awt.Color(255, 51, 51));
        lblDBXO2.setText("Indice Ganador");
        lblDBXO2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.add(lblDBXO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        lblCHYO2.setBackground(new java.awt.Color(0, 102, 102));
        lblCHYO2.setForeground(new java.awt.Color(255, 51, 51));
        lblCHYO2.setText("Indice Ganador");
        lblCHYO2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.add(lblCHYO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        lblDBYO2.setBackground(new java.awt.Color(0, 102, 102));
        lblDBYO2.setForeground(new java.awt.Color(255, 51, 51));
        lblDBYO2.setText("Indice Ganador");
        lblDBYO2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.add(lblDBYO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        lblCHZO2.setBackground(new java.awt.Color(0, 102, 102));
        lblCHZO2.setForeground(new java.awt.Color(255, 51, 51));
        lblCHZO2.setText("Indice Ganador");
        lblCHZO2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.add(lblCHZO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        jLabel206.setText("Octava Y");
        jPanel18.add(jLabel206, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, -1, -1));

        jLabel207.setText("Octava Z");
        jPanel18.add(jLabel207, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, -1, -1));

        jLabel208.setText("Octava X");
        jPanel18.add(jLabel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel209.setText("Octava X");
        jPanel18.add(jLabel209, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabel210.setText("Octava X");
        jPanel18.add(jLabel210, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jLabel211.setText("Octava Y");
        jPanel18.add(jLabel211, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel212.setText("Octava Y");
        jPanel18.add(jLabel212, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        jLabel213.setText("Octava Y");
        jPanel18.add(jLabel213, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel214.setText("Octava Z");
        jPanel18.add(jLabel214, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jLabel215.setText("Octava Z");
        jPanel18.add(jLabel215, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        jLabel216.setText("Octava Z");
        jPanel18.add(jLabel216, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        org.jdesktop.layout.GroupLayout jPanel17Layout = new org.jdesktop.layout.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1123, Short.MAX_VALUE)
            .add(jPanel17Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel17Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 483, Short.MAX_VALUE)
            .add(jPanel17Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel17Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jPanel18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 483, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("EM", jPanel17);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .add(jTabbedPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(28, 28, 28)
                .add(jTabbedPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 529, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Octavas", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 660, -1, -1));

        lblEmocion1.setForeground(new java.awt.Color(204, 0, 0));
        lblEmocion1.setText("jLabel217");
        getContentPane().add(lblEmocion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jMenu1.setText("Acciones");

        jMenuItem1.setText("Recomendar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
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

    private void jTextTYRDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTYRDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTYRDBActionPerformed

    private void jTextTZRCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTZRCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTZRCHActionPerformed

    private void jTextDZRCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDZRCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDZRCHActionPerformed

    private void jTextDYRDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDYRDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDYRDBActionPerformed

    private void jTextOZRCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextOZRCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextOZRCHActionPerformed

    private void jTextOYRDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextOYRDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextOYRDBActionPerformed

    private void jTextOXFDBPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextOXFDBPAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextOXFDBPAActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Agnt.postGuiEvent(new GuiEvent(this, SUGGEST));
//        guiRecomendarKM rec = new guiRecomendarKM();
//        rec.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextTZRCH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTZRCH1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTZRCH1ActionPerformed

    private void jTextTYRDB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTYRDB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTYRDB1ActionPerformed

    private void jTextDZRCH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDZRCH1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDZRCH1ActionPerformed

    private void jTextDYRDB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDYRDB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDYRDB1ActionPerformed

    private void jTextOZRCH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextOZRCH1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextOZRCH1ActionPerformed

    private void jTextOYRDB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextOYRDB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextOYRDB1ActionPerformed

    private void jTextTZRCH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTZRCH2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTZRCH2ActionPerformed

    private void jTextTYRDB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTYRDB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTYRDB2ActionPerformed

    private void jTextDZRCH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDZRCH2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDZRCH2ActionPerformed

    private void jTextDYRDB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDYRDB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDYRDB2ActionPerformed

    private void jTextOZRCH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextOZRCH2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextOZRCH2ActionPerformed

    private void jTextOYRDB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextOYRDB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextOYRDB2ActionPerformed

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
            java.util.logging.Logger.getLogger(guiAEvaluarIndice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiAEvaluarIndice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiAEvaluarIndice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiAEvaluarIndice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextDXCH;
    private javax.swing.JTextField jTextDXCH1;
    private javax.swing.JTextField jTextDXCH2;
    private javax.swing.JTextField jTextDXDB;
    private javax.swing.JTextField jTextDXDB1;
    private javax.swing.JTextField jTextDXDB2;
    private javax.swing.JTextField jTextDXFCH;
    private javax.swing.JTextField jTextDXFCH1;
    private javax.swing.JTextField jTextDXFCH2;
    private javax.swing.JTextField jTextDXFCHPA;
    private javax.swing.JTextField jTextDXFCHPA1;
    private javax.swing.JTextField jTextDXFCHPA2;
    private javax.swing.JTextField jTextDXFDB;
    private javax.swing.JTextField jTextDXFDB1;
    private javax.swing.JTextField jTextDXFDB2;
    private javax.swing.JTextField jTextDXFDBPA;
    private javax.swing.JTextField jTextDXFDBPA1;
    private javax.swing.JTextField jTextDXFDBPA2;
    private javax.swing.JTextField jTextDXRCH;
    private javax.swing.JTextField jTextDXRCH1;
    private javax.swing.JTextField jTextDXRCH2;
    private javax.swing.JTextField jTextDXRDB;
    private javax.swing.JTextField jTextDXRDB1;
    private javax.swing.JTextField jTextDXRDB2;
    private javax.swing.JTextField jTextDYCH;
    private javax.swing.JTextField jTextDYCH1;
    private javax.swing.JTextField jTextDYCH2;
    private javax.swing.JTextField jTextDYDB;
    private javax.swing.JTextField jTextDYDB1;
    private javax.swing.JTextField jTextDYDB2;
    private javax.swing.JTextField jTextDYFCH;
    private javax.swing.JTextField jTextDYFCH1;
    private javax.swing.JTextField jTextDYFCH2;
    private javax.swing.JTextField jTextDYFCHPA;
    private javax.swing.JTextField jTextDYFCHPA1;
    private javax.swing.JTextField jTextDYFCHPA2;
    private javax.swing.JTextField jTextDYFDB;
    private javax.swing.JTextField jTextDYFDB1;
    private javax.swing.JTextField jTextDYFDB2;
    private javax.swing.JTextField jTextDYFDBPA;
    private javax.swing.JTextField jTextDYFDBPA1;
    private javax.swing.JTextField jTextDYFDBPA2;
    private javax.swing.JTextField jTextDYRCH;
    private javax.swing.JTextField jTextDYRCH1;
    private javax.swing.JTextField jTextDYRCH2;
    private javax.swing.JTextField jTextDYRDB;
    private javax.swing.JTextField jTextDYRDB1;
    private javax.swing.JTextField jTextDYRDB2;
    private javax.swing.JTextField jTextDZCH;
    private javax.swing.JTextField jTextDZCH1;
    private javax.swing.JTextField jTextDZCH2;
    private javax.swing.JTextField jTextDZDB;
    private javax.swing.JTextField jTextDZDB1;
    private javax.swing.JTextField jTextDZDB2;
    private javax.swing.JTextField jTextDZFCH;
    private javax.swing.JTextField jTextDZFCH1;
    private javax.swing.JTextField jTextDZFCH2;
    private javax.swing.JTextField jTextDZFCHPA;
    private javax.swing.JTextField jTextDZFCHPA1;
    private javax.swing.JTextField jTextDZFCHPA2;
    private javax.swing.JTextField jTextDZFDB;
    private javax.swing.JTextField jTextDZFDB1;
    private javax.swing.JTextField jTextDZFDB2;
    private javax.swing.JTextField jTextDZFDBPA;
    private javax.swing.JTextField jTextDZFDBPA1;
    private javax.swing.JTextField jTextDZFDBPA2;
    private javax.swing.JTextField jTextDZRCH;
    private javax.swing.JTextField jTextDZRCH1;
    private javax.swing.JTextField jTextDZRCH2;
    private javax.swing.JTextField jTextDZRDB;
    private javax.swing.JTextField jTextDZRDB1;
    private javax.swing.JTextField jTextDZRDB2;
    private javax.swing.JTextField jTextOXCH;
    private javax.swing.JTextField jTextOXCH1;
    private javax.swing.JTextField jTextOXCH2;
    private javax.swing.JTextField jTextOXDB;
    private javax.swing.JTextField jTextOXDB1;
    private javax.swing.JTextField jTextOXDB2;
    private javax.swing.JTextField jTextOXFCH;
    private javax.swing.JTextField jTextOXFCH1;
    private javax.swing.JTextField jTextOXFCH2;
    private javax.swing.JTextField jTextOXFCHPA;
    private javax.swing.JTextField jTextOXFCHPA1;
    private javax.swing.JTextField jTextOXFCHPA2;
    private javax.swing.JTextField jTextOXFDB;
    private javax.swing.JTextField jTextOXFDB1;
    private javax.swing.JTextField jTextOXFDB2;
    private javax.swing.JTextField jTextOXFDBPA;
    private javax.swing.JTextField jTextOXFDBPA1;
    private javax.swing.JTextField jTextOXFDBPA2;
    private javax.swing.JTextField jTextOXRCH;
    private javax.swing.JTextField jTextOXRCH1;
    private javax.swing.JTextField jTextOXRCH2;
    private javax.swing.JTextField jTextOXRDB;
    private javax.swing.JTextField jTextOXRDB1;
    private javax.swing.JTextField jTextOXRDB2;
    private javax.swing.JTextField jTextOYCH;
    private javax.swing.JTextField jTextOYCH1;
    private javax.swing.JTextField jTextOYCH2;
    private javax.swing.JTextField jTextOYDB;
    private javax.swing.JTextField jTextOYDB1;
    private javax.swing.JTextField jTextOYDB2;
    private javax.swing.JTextField jTextOYFCH;
    private javax.swing.JTextField jTextOYFCH1;
    private javax.swing.JTextField jTextOYFCH2;
    private javax.swing.JTextField jTextOYFCHPA;
    private javax.swing.JTextField jTextOYFCHPA1;
    private javax.swing.JTextField jTextOYFCHPA2;
    private javax.swing.JTextField jTextOYFDB;
    private javax.swing.JTextField jTextOYFDB1;
    private javax.swing.JTextField jTextOYFDB2;
    private javax.swing.JTextField jTextOYFDBPA;
    private javax.swing.JTextField jTextOYFDBPA1;
    private javax.swing.JTextField jTextOYFDBPA2;
    private javax.swing.JTextField jTextOYRCH;
    private javax.swing.JTextField jTextOYRCH1;
    private javax.swing.JTextField jTextOYRCH2;
    private javax.swing.JTextField jTextOYRDB;
    private javax.swing.JTextField jTextOYRDB1;
    private javax.swing.JTextField jTextOYRDB2;
    private javax.swing.JTextField jTextOZCH;
    private javax.swing.JTextField jTextOZCH1;
    private javax.swing.JTextField jTextOZCH2;
    private javax.swing.JTextField jTextOZDB;
    private javax.swing.JTextField jTextOZDB1;
    private javax.swing.JTextField jTextOZDB2;
    private javax.swing.JTextField jTextOZFCH;
    private javax.swing.JTextField jTextOZFCH1;
    private javax.swing.JTextField jTextOZFCH2;
    private javax.swing.JTextField jTextOZFCHPA;
    private javax.swing.JTextField jTextOZFCHPA1;
    private javax.swing.JTextField jTextOZFCHPA2;
    private javax.swing.JTextField jTextOZFDB;
    private javax.swing.JTextField jTextOZFDB1;
    private javax.swing.JTextField jTextOZFDB2;
    private javax.swing.JTextField jTextOZFDBPA;
    private javax.swing.JTextField jTextOZFDBPA1;
    private javax.swing.JTextField jTextOZFDBPA2;
    private javax.swing.JTextField jTextOZRCH;
    private javax.swing.JTextField jTextOZRCH1;
    private javax.swing.JTextField jTextOZRCH2;
    private javax.swing.JTextField jTextOZRDB;
    private javax.swing.JTextField jTextOZRDB1;
    private javax.swing.JTextField jTextOZRDB2;
    private javax.swing.JTextField jTextTXCH;
    private javax.swing.JTextField jTextTXCH1;
    private javax.swing.JTextField jTextTXCH2;
    private javax.swing.JTextField jTextTXDB;
    private javax.swing.JTextField jTextTXDB1;
    private javax.swing.JTextField jTextTXDB2;
    private javax.swing.JTextField jTextTXFCH;
    private javax.swing.JTextField jTextTXFCH1;
    private javax.swing.JTextField jTextTXFCH2;
    private javax.swing.JTextField jTextTXFCHPA;
    private javax.swing.JTextField jTextTXFCHPA1;
    private javax.swing.JTextField jTextTXFCHPA2;
    private javax.swing.JTextField jTextTXFDB;
    private javax.swing.JTextField jTextTXFDB1;
    private javax.swing.JTextField jTextTXFDB2;
    private javax.swing.JTextField jTextTXFDBPA;
    private javax.swing.JTextField jTextTXFDBPA1;
    private javax.swing.JTextField jTextTXFDBPA2;
    private javax.swing.JTextField jTextTXRCH;
    private javax.swing.JTextField jTextTXRCH1;
    private javax.swing.JTextField jTextTXRCH2;
    private javax.swing.JTextField jTextTXRDB;
    private javax.swing.JTextField jTextTXRDB1;
    private javax.swing.JTextField jTextTXRDB2;
    private javax.swing.JTextField jTextTYCH;
    private javax.swing.JTextField jTextTYCH1;
    private javax.swing.JTextField jTextTYCH2;
    private javax.swing.JTextField jTextTYDB;
    private javax.swing.JTextField jTextTYDB1;
    private javax.swing.JTextField jTextTYDB2;
    private javax.swing.JTextField jTextTYFCH;
    private javax.swing.JTextField jTextTYFCH1;
    private javax.swing.JTextField jTextTYFCH2;
    private javax.swing.JTextField jTextTYFCHPA;
    private javax.swing.JTextField jTextTYFCHPA1;
    private javax.swing.JTextField jTextTYFCHPA2;
    private javax.swing.JTextField jTextTYFDB;
    private javax.swing.JTextField jTextTYFDB1;
    private javax.swing.JTextField jTextTYFDB2;
    private javax.swing.JTextField jTextTYFDBPA;
    private javax.swing.JTextField jTextTYFDBPA1;
    private javax.swing.JTextField jTextTYFDBPA2;
    private javax.swing.JTextField jTextTYRCH;
    private javax.swing.JTextField jTextTYRCH1;
    private javax.swing.JTextField jTextTYRCH2;
    private javax.swing.JTextField jTextTYRDB;
    private javax.swing.JTextField jTextTYRDB1;
    private javax.swing.JTextField jTextTYRDB2;
    private javax.swing.JTextField jTextTZCH;
    private javax.swing.JTextField jTextTZCH1;
    private javax.swing.JTextField jTextTZCH2;
    private javax.swing.JTextField jTextTZDB;
    private javax.swing.JTextField jTextTZDB1;
    private javax.swing.JTextField jTextTZDB2;
    private javax.swing.JTextField jTextTZFCH;
    private javax.swing.JTextField jTextTZFCH1;
    private javax.swing.JTextField jTextTZFCH2;
    private javax.swing.JTextField jTextTZFCHPA;
    private javax.swing.JTextField jTextTZFCHPA1;
    private javax.swing.JTextField jTextTZFCHPA2;
    private javax.swing.JTextField jTextTZFDB;
    private javax.swing.JTextField jTextTZFDB1;
    private javax.swing.JTextField jTextTZFDB2;
    private javax.swing.JTextField jTextTZFDBPA;
    private javax.swing.JTextField jTextTZFDBPA1;
    private javax.swing.JTextField jTextTZFDBPA2;
    private javax.swing.JTextField jTextTZRCH;
    private javax.swing.JTextField jTextTZRCH1;
    private javax.swing.JTextField jTextTZRCH2;
    private javax.swing.JTextField jTextTZRDB;
    private javax.swing.JTextField jTextTZRDB1;
    private javax.swing.JTextField jTextTZRDB2;
    private javax.swing.JLabel lblCHX;
    private javax.swing.JLabel lblCHX1;
    private javax.swing.JLabel lblCHX2;
    private javax.swing.JLabel lblCHXD;
    private javax.swing.JLabel lblCHXD1;
    private javax.swing.JLabel lblCHXD2;
    private javax.swing.JLabel lblCHXO;
    private javax.swing.JLabel lblCHXO1;
    private javax.swing.JLabel lblCHXO2;
    private javax.swing.JLabel lblCHY;
    private javax.swing.JLabel lblCHY1;
    private javax.swing.JLabel lblCHY2;
    private javax.swing.JLabel lblCHYD;
    private javax.swing.JLabel lblCHYD1;
    private javax.swing.JLabel lblCHYD2;
    private javax.swing.JLabel lblCHYO;
    private javax.swing.JLabel lblCHYO1;
    private javax.swing.JLabel lblCHYO2;
    private javax.swing.JLabel lblCHZ;
    private javax.swing.JLabel lblCHZ1;
    private javax.swing.JLabel lblCHZ2;
    private javax.swing.JLabel lblCHZD;
    private javax.swing.JLabel lblCHZD1;
    private javax.swing.JLabel lblCHZD2;
    private javax.swing.JLabel lblCHZO;
    private javax.swing.JLabel lblCHZO1;
    private javax.swing.JLabel lblCHZO2;
    private javax.swing.JLabel lblDBX;
    private javax.swing.JLabel lblDBX1;
    private javax.swing.JLabel lblDBX2;
    private javax.swing.JLabel lblDBXD;
    private javax.swing.JLabel lblDBXD1;
    private javax.swing.JLabel lblDBXD2;
    private javax.swing.JLabel lblDBXO;
    private javax.swing.JLabel lblDBXO1;
    private javax.swing.JLabel lblDBXO2;
    private javax.swing.JLabel lblDBY;
    private javax.swing.JLabel lblDBY1;
    private javax.swing.JLabel lblDBY2;
    private javax.swing.JLabel lblDBYD;
    private javax.swing.JLabel lblDBYD1;
    private javax.swing.JLabel lblDBYD2;
    private javax.swing.JLabel lblDBYO;
    private javax.swing.JLabel lblDBYO1;
    private javax.swing.JLabel lblDBYO2;
    private javax.swing.JLabel lblDBZ;
    private javax.swing.JLabel lblDBZ1;
    private javax.swing.JLabel lblDBZ2;
    private javax.swing.JLabel lblDBZD;
    private javax.swing.JLabel lblDBZD1;
    private javax.swing.JLabel lblDBZD2;
    private javax.swing.JLabel lblDBZO;
    private javax.swing.JLabel lblDBZO1;
    private javax.swing.JLabel lblDBZO2;
    private javax.swing.JLabel lblEmocion1;
    public static javax.swing.JTextField valorDXCH;
    public static javax.swing.JTextField valorDXCH1;
    public static javax.swing.JTextField valorDXCH2;
    public static javax.swing.JTextField valorDXDB;
    public static javax.swing.JTextField valorDXDB1;
    public static javax.swing.JTextField valorDXDB2;
    public static javax.swing.JTextField valorDYCH;
    public static javax.swing.JTextField valorDYCH1;
    public static javax.swing.JTextField valorDYCH2;
    public static javax.swing.JTextField valorDYDB;
    public static javax.swing.JTextField valorDYDB1;
    public static javax.swing.JTextField valorDYDB2;
    public static javax.swing.JTextField valorDZCH;
    public static javax.swing.JTextField valorDZCH1;
    public static javax.swing.JTextField valorDZCH2;
    public static javax.swing.JTextField valorDZDB;
    public static javax.swing.JTextField valorDZDB1;
    public static javax.swing.JTextField valorDZDB2;
    public static javax.swing.JTextField valorOXCH;
    public static javax.swing.JTextField valorOXCH1;
    public static javax.swing.JTextField valorOXCH2;
    public static javax.swing.JTextField valorOXDB;
    public static javax.swing.JTextField valorOXDB1;
    public static javax.swing.JTextField valorOXDB2;
    public static javax.swing.JTextField valorOYCH;
    public static javax.swing.JTextField valorOYCH1;
    public static javax.swing.JTextField valorOYCH2;
    public static javax.swing.JTextField valorOYDB;
    public static javax.swing.JTextField valorOYDB1;
    public static javax.swing.JTextField valorOYDB2;
    public static javax.swing.JTextField valorOZCH;
    public static javax.swing.JTextField valorOZCH1;
    public static javax.swing.JTextField valorOZCH2;
    public static javax.swing.JTextField valorOZDB;
    public static javax.swing.JTextField valorOZDB1;
    public static javax.swing.JTextField valorOZDB2;
    public static javax.swing.JTextField valorTXCH;
    public static javax.swing.JTextField valorTXCH1;
    public static javax.swing.JTextField valorTXCH2;
    public static javax.swing.JTextField valorTXDB;
    public static javax.swing.JTextField valorTXDB1;
    public static javax.swing.JTextField valorTXDB2;
    public static javax.swing.JTextField valorTYCH;
    public static javax.swing.JTextField valorTYCH1;
    public static javax.swing.JTextField valorTYCH2;
    public static javax.swing.JTextField valorTYDB;
    public static javax.swing.JTextField valorTYDB1;
    public static javax.swing.JTextField valorTYDB2;
    public static javax.swing.JTextField valorTZCH;
    public static javax.swing.JTextField valorTZCH1;
    public static javax.swing.JTextField valorTZCH2;
    public static javax.swing.JTextField valorTZDB;
    public static javax.swing.JTextField valorTZDB1;
    public static javax.swing.JTextField valorTZDB2;
    // End of variables declaration//GEN-END:variables
}
