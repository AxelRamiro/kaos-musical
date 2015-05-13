/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * guiSelector.java
 *
 * Created on 18-feb-2013, 9:13:19
 */

package InterfazUsuario;
import PlantillasDeCanciones.Plantilla;
import AgentesCreativos.*;
import jade.gui.*;
//import EvaEmocion.marcoEmociones;
/**
 *
 * @author Omar Lopez Ortega
 * Profesor - Investigador CITIS - UAEH
 */
public class guiSelector extends javax.swing.JFrame {

    /** Creates new form guiSelector */
    public guiSelector()
    {
        initComponents();
    }
    public guiSelector(AgenteSelector a)
    {
        initComponents();
        selector = a;
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelProyectos = new javax.swing.JLabel();
        botonProyectos = new javax.swing.JButton();
        comboProyectos = new javax.swing.JComboBox();
        labelOP = new javax.swing.JLabel();
        comboOP = new javax.swing.JComboBox();
        botonInterpretaOP = new javax.swing.JButton();
        botonEvaluar = new javax.swing.JButton();
        botonSalirSelector = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 153, 255));
        setForeground(new java.awt.Color(0, 153, 204));

        labelProyectos.setText("Lista de Proyectos Exploratorios");

        botonProyectos.setText("Buscar Proyectos");
        botonProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaProyectos(evt);
            }
        });

        comboProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaObrasDeProyecto(evt);
            }
        });

        labelOP.setText("Obras Primarias del Proyecto");

        botonInterpretaOP.setText("Tocar Obra Primaria");
        botonInterpretaOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interpretaOpusPrimaria(evt);
            }
        });

        botonEvaluar.setText("Evaluar");
        botonEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanzaEvaluacion(evt);
            }
        });

        botonSalirSelector.setText("Salir");
        botonSalirSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirSelector(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(26, 26, 26)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(8, 8, 8)
                        .add(comboProyectos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 208, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(183, 183, 183)
                                .add(comboOP, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 321, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                        .add(botonInterpretaOP)
                                        .add(124, 124, 124))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(botonSalirSelector)
                                            .add(botonEvaluar))
                                        .add(208, 208, 208))))))
                    .add(layout.createSequentialGroup()
                        .add(botonProyectos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 184, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(labelProyectos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(labelOP, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 203, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(165, 165, 165))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(52, 52, 52)
                .add(botonProyectos)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelProyectos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelOP))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(comboProyectos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(comboOP, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(botonInterpretaOP)
                .add(18, 18, 18)
                .add(botonEvaluar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 65, Short.MAX_VALUE)
                .add(botonSalirSelector)
                .add(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscaProyectos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaProyectos
        // TODO add your handling code here:
        comboProyectos.removeAllItems();
        eventoEnGui = new GuiEvent(this, 1);
        selector.postGuiEvent(eventoEnGui);
        //ps = EjecutorSentencias.entregaNombresProyectos();
        //for(int i = 0; i < ps.length; i++)
        //{
        //    comboProyectos.addItem(ps[i]);
        //}
    }//GEN-LAST:event_buscaProyectos

    private void buscaObrasDeProyecto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaObrasDeProyecto
        // TODO add your handling code here:
        comboOP.removeAllItems();
        eventoEnGui = new GuiEvent(this, 3);
        selector.postGuiEvent(eventoEnGui);
        //ops=EjecutorSentencias.entregaObrasPrimarias(comboProyectos.getSelectedItem().toString());
        //for(int i = 0; i < ops.length; i++)
        //{
        //    comboOP.addItem(ops[i]);
        //}
    }//GEN-LAST:event_buscaObrasDeProyecto

    private void interpretaOpusPrimaria(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interpretaOpusPrimaria
        // TODO add your handling code here:
        rep = new Plantilla();
        rep.abreArchivoMidi(comboOP.getSelectedItem().toString());
        rep.close();
    }//GEN-LAST:event_interpretaOpusPrimaria

    private void lanzaEvaluacion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzaEvaluacion
        // TODO add your handling code here:
        if(ge.isActive()){ge.dispose();}
        else{ge.setVisible(true);}
    }//GEN-LAST:event_lanzaEvaluacion

    private void salirSelector(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirSelector
        // TODO add your handling code here:
        eventoEnGui = new GuiEvent(this, 2);
        selector.postGuiEvent(eventoEnGui);
    }//GEN-LAST:event_salirSelector

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiSelector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEvaluar;
    private javax.swing.JButton botonInterpretaOP;
    private javax.swing.JButton botonProyectos;
    private javax.swing.JButton botonSalirSelector;
    public static javax.swing.JComboBox comboOP;
    public static javax.swing.JComboBox comboProyectos;
    private javax.swing.JLabel labelOP;
    private javax.swing.JLabel labelProyectos;
    // End of variables declaration//GEN-END:variables
    String[] ps;
    String[] ops;
    Plantilla rep;
    public static AgenteSelector selector;
    public GuiEvent eventoEnGui;
    guiEvaluacion ge = new guiEvaluacion();;
}
