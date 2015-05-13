package EvaEmocion;
import InterfazUsuario.guiSelector;
import InterfazUsuario.guiEvaluacion;
import Almacenamiento.EjecutorSentencias;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * marcoEmociones.java
 * Created on 23-feb-2013, 17:21:15
 * @author Omar López Ortega
 * Profesor - Investigador CITIS UAEH
 */
import java.awt.*;

public class marcoEmociones extends javax.swing.JFrame
{
    String nombreOP, laEmocion;
    double x, y;
    double rojo, verde, azul, calificacionEmocional;
    ScrollPane panel = new ScrollPane();
    Color color;
    public CalculoEmociones colDif = new CalculoEmociones();
    /** Creates new form marcoEmociones */
    public marcoEmociones()
    {
        initComponents();
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(500, 500));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jLabel1.setText("AGRADO");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jLabel2.setText("DESAGRADO");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jLabel3.setText("ACTIVACIÓN ALTA");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jLabel4.setText("ACTIVACIÓN BAJA");

        jLabel5.setText("Tranquilidad");

        jLabel6.setText("Relajamiento");

        jLabel7.setText("Serenidad");

        jLabel8.setText("Satisfacción");

        jLabel9.setText("Alegría");

        jLabel10.setText("Euforia");

        jLabel11.setText("Excitación");

        jLabel12.setText("Sorpresa");

        jLabel13.setText("Fatiga");

        jLabel14.setText("Aletargamiento");

        jLabel15.setText("Depresión");

        jLabel16.setText("Tristeza");

        jLabel17.setText("Dolido");

        jLabel18.setText("Estres");

        jLabel19.setText("Enojo");

        jLabel20.setText("Miedo");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(282, 282, 282)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel3)
                            .add(jLabel4)))
                    .add(layout.createSequentialGroup()
                        .add(60, 60, 60)
                        .add(jLabel16)))
                .addContainerGap(260, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(157, 157, 157)
                        .add(jLabel19)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(228, 228, 228)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel13)
                            .add(jLabel20))
                        .add(149, 149, 149)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel12)
                            .add(jLabel5))
                        .add(184, 184, 184))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel6)
                            .add(jLabel11))
                        .add(124, 124, 124))))
            .add(layout.createSequentialGroup()
                .add(143, 143, 143)
                .add(jLabel14)
                .addContainerGap(439, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(87, 87, 87)
                        .add(jLabel15))
                    .add(layout.createSequentialGroup()
                        .add(103, 103, 103)
                        .add(jLabel18)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 395, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(jLabel7)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jLabel10)
                        .add(88, 88, 88))))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel17))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel2)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 464, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jLabel1)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel9)
                            .add(jLabel8))
                        .add(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jLabel3)
                        .add(28, 28, 28)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel12)
                            .add(jLabel20))
                        .add(33, 33, 33)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel11)
                            .add(jLabel19))
                        .add(39, 39, 39)
                        .add(jLabel10)
                        .add(53, 53, 53))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel18)
                        .add(42, 42, 42)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(jLabel17))
                .add(45, 45, 45)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jLabel1))
                .add(28, 28, 28)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(jLabel16))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 60, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel15)
                    .add(jLabel7))
                .add(49, 49, 49)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel14)
                    .add(jLabel6))
                .add(36, 36, 36)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jLabel13))
                .add(13, 13, 13)
                .add(jLabel4)
                .add(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        //if(e.getID() == MouseEvent.MOUSE_CLICKED)
        {
            x = (double) evt.getX();
            y = (double) evt.getY();
            x = (10 - (700-x)/70);
            y = (10 - (y/70));
            //calificacionEmocional = colDif.calculaColor(x, y);
            nombreOP = guiSelector.comboOP.getSelectedItem().toString();
            laEmocion = guiEvaluacion.comboEmociones.getSelectedItem().toString();
            EjecutorSentencias.insertaEvaluacionEmocional(nombreOP, laEmocion, x, y);
            System.out.println("Agrado: " + x + " Activacion: " + y + " Calificacion: " + calificacionEmocional + " " + nombreOP + " " + laEmocion);
            //colDif.mostrarRegiones();
            this.dispose();
        }
    }//GEN-LAST:event_formMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
            x = (double) evt.getX();
            y = (double) evt.getY();
            x = (10 - (700-x)/70);
            y = (10 - (y/70));
            calificacionEmocional = colDif.calculaColor(x, y);
            rojo = (x/10);
            verde = (y/10);
            calificacionEmocional = (calificacionEmocional/10);
            azul = calificacionEmocional;
            if(azul < 0){azul = azul*(-1);}
            try
            {
                color = new Color((float)rojo, (float)verde, (float)azul);
                this.setBackground(color);
            }
            catch(java.lang.IllegalArgumentException e)
            {     
            }
    }//GEN-LAST:event_formMouseMoved

    /**
    * @param args the command line arguments
    */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new marcoEmociones().setSize(700,700);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
