/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AgentesCreativos;
import jade.gui.*;
import InterfazUsuario.*;
import Almacenamiento.EjecutorSentencias;
/**
 * @author Omar Lopez Ortega
 * Profesor - Investigador
 * CITIS - UAEH
 */
public class AgenteSelector extends GuiAgent
{
    public CSelectorTicker cst;
    public CSelectorSimple css;
    guiSelector guis;
    public String[] ops;
    @Override
    public void setup()
    {
        guis = new guiSelector(this);
        guis.setVisible(true);
    }
    public void onGuiEvent(GuiEvent e)
    {
        int numeroEvento = e.getType();
        if(numeroEvento == 1)
        {
            css = new CSelectorSimple(this);
            cst = new CSelectorTicker(this);
            addBehaviour(css);
        }
        if(numeroEvento == 2)
        {
            this.doDelete();
            guis.setVisible(false);
        }
        if(numeroEvento == 3)
        {
            guiSelector.comboOP.removeAllItems();
            ops=EjecutorSentencias.entregaObrasPrimarias(guiSelector.comboProyectos.getSelectedItem().toString());
            for(int i = 0; i < ops.length; i++)
            {
                guiSelector.comboOP.addItem(ops[i]);
            }
        }
    }
}
