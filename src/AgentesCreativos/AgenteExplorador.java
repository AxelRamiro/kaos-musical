/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentesCreativos;
import jade.core.Agent;
/**
 * @author Omar Lopez Ortega
 * Profesor Investigador CITIS - UAEH
 */
public class AgenteExplorador extends Agent
{
    CExploradorSimple ceSimple = new CExploradorSimple(this);
    @Override
    public void setup()
    {
        addBehaviour(ceSimple);
    }
}
