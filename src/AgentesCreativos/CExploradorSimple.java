package AgentesCreativos;

import jade.core.Agent;
import jade.core.AID;
import jade.core.behaviours.*;
import jade.lang.acl.*;
import InterfazUsuario.InterfazKaos;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

/**
 * @author Omar Lopez Ortega Profesor Investigador CITIS - UAEH
 */
public class CExploradorSimple extends SimpleBehaviour {

    int iteracionCreativa = 0;
    int j = 0, i = 0, k = 0, l = 0;
    int iteracionesCreativas = 0;
    int nPianos, nGuitarras, nCuerdas, nBajos, nVientos, nEscalas, nAcordes;
    ACLMessage msg;
    MessageTemplate plantillaRecepcion;
    AID idP;
    String keGenerador, keCambio, instrumento, escala, acorde;
    ContainerController cc;
    AgentController ac;

    public CExploradorSimple(Agent a) {
        super(a);
    }

    @Override
    public void onStart() {
        InterfazKaos.TextAreaAgentes.append("\n" + myAgent.getLocalName() + " listo para iniciar exploraciones creativas!!!");
        idP = new AID("AgentePlaneador", AID.ISLOCALNAME);
        //AgenteExplorador (this) recibe datos provenientes de AgentePlaneador
        plantillaRecepcion = MessageTemplate.and(MessageTemplate.MatchPerformative(ACLMessage.INFORM), MessageTemplate.MatchSender(idP));
        msg = myAgent.blockingReceive(plantillaRecepcion);
        keGenerador = msg.getContent();
        InterfazKaos.TextAreaAgentes.append("\n" + myAgent.getLocalName() + " recibe " + msg.getContent() + " de " + msg.getSender().getLocalName());
        //AgenteExplorador (this) confirma recepción de datos a AgentePlaneador
        ACLMessage reply = msg.createReply();
        reply.setPerformative(ACLMessage.CONFIRM);
        reply.setContent("RECEPCION DE DATOS CORRECTA");
        myAgent.send(reply);
        plantillaRecepcion = MessageTemplate.and(MessageTemplate.MatchPerformative(ACLMessage.INFORM), MessageTemplate.MatchSender(idP));
        msg = myAgent.blockingReceive(plantillaRecepcion);
        keCambio = msg.getContent();
        ComputadorExploracion.defineExploracion(keGenerador);
    }

    @Override
    public void action() {
        nPianos = InterfazKaos.MenuPianos.getItemCount();
        nGuitarras = InterfazKaos.MenuGuitarras.getItemCount();
        nBajos = InterfazKaos.MenuBajos.getItemCount();
        nCuerdas = InterfazKaos.MenuCuerdas.getItemCount();
        nVientos = InterfazKaos.MenuMetales.getItemCount();
        nAcordes = InterfazKaos.MenuAcordes.getItemCount();
        nEscalas = InterfazKaos.MenuEscalas.getItemCount();
        if (msg != null) {
            InterfazKaos.TextAreaAgentes.append("\n" + myAgent.getLocalName() + " ejecuta iteracion creativa " + iteracionCreativa);
            //cambiar exploracion creativa segun cambie la variable de cambio
            if (keCambio == null) {
                iteracionesCreativas = 0;
                escala = InterfazKaos.escalaMusical;
                acorde = InterfazKaos.elAcorde;
                instrumento = InterfazKaos.elInstrumento;
                //InterfazKaos.TextAreaAgentes.append("\n\tSistema recursivo: " + keGenerador + " Instrumento: " +instrumento + " Escala: " + escala + " Acorde: " + acorde + "\t");
                //ComputadorExploracion.computaExploracion(keGenerador, instrumento, escala, acorde);        
            } else if (keCambio.equals("Instrumento")) {
                iteracionesCreativas = nPianos + nGuitarras + nCuerdas + nBajos - 4;
                escala = InterfazKaos.escalaMusical;
                acorde = InterfazKaos.elAcorde;
                if (iteracionCreativa < nPianos) {
                    instrumento = InterfazKaos.MenuPianos.getItem(iteracionCreativa).getText();
                }
                if ((iteracionCreativa >= nPianos) && (iteracionCreativa < (nPianos + nGuitarras))) {
                    instrumento = InterfazKaos.MenuGuitarras.getItem(i).getText();
                    i++;
                }
                if ((iteracionCreativa >= (nPianos + nGuitarras)) && (iteracionCreativa < (nCuerdas + nGuitarras + nPianos))) {
                    instrumento = InterfazKaos.MenuCuerdas.getItem(k).getText();
                    k++;
                }
                if (iteracionCreativa >= (nCuerdas + nGuitarras + nPianos) && iteracionCreativa <= (nCuerdas + nGuitarras + nPianos + nBajos)) {
                    instrumento = InterfazKaos.MenuBajos.getItem(l).getText();
                    l++;
                }
            } else if (keCambio.equals("Escala")) {
                iteracionesCreativas = nEscalas - 1;
                instrumento = InterfazKaos.elInstrumento;
                acorde = InterfazKaos.elAcorde;
                escala = InterfazKaos.MenuEscalas.getItem(i).getText();
                i++;
            } else if (keCambio.equals("Acorde")) {
                iteracionesCreativas = nAcordes - 1;
                escala = InterfazKaos.escalaMusical;
                instrumento = InterfazKaos.elInstrumento;
                acorde = InterfazKaos.MenuAcordes.getItem(i).getText();
                i++;
            }
            InterfazKaos.TextAreaAgentes.append("\n\tSistema recursivo: " + keGenerador + " Instrumento: " + instrumento + " Escala: " + escala + " Acorde: " + acorde + "\t");
            ComputadorExploracion.computaExploracion(keGenerador, instrumento, escala, acorde);
            iteracionCreativa++;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public boolean done() {

        if (iteracionCreativa >= iteracionesCreativas) {
            InterfazKaos.TextAreaAgentes.append("\nExploraciones terminadas!!!");
            //AgenteExplorador (this) informa exploraciones terminadas a AgentePleaneador
            msg = new ACLMessage(ACLMessage.INFORM);
            msg.setContent("TERMINADO");
            msg.addReceiver(idP);
            myAgent.send(msg);
            myAgent.doDelete();
            return true;
        } else {
            return false;
        }
    }
}
