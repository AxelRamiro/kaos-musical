package ObjeAux;

/**
 *
 * @author Axel Ramiro
 */

public class OpusPrimaria implements java.io.Serializable {

    int tempoX, tempoY, tempoZ, octavaX, octavaY, octavaZ;
    double duraX, duraY, duraZ;
    String indice, metodo,instrumento, escala, acorde;
    
    public void set(int tx, int ty, int tz, double dx, double dy, double dz, int ox, int oy,  int oz, String ins, String esc, String ac, String i, String m) {
        this.tempoX = tx;
        this.tempoY = ty;
        this.tempoZ = tz;
        this.duraX = dx;
        this.duraY = dy;
        this.duraZ = dz;
        this.octavaX = ox;
        this.octavaY = oy;
        this.octavaZ = oz;
        this.instrumento = ins;
        this.escala = esc;
        this.acorde = ac;
        this.indice = i;
        this.metodo = m;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public int getOctavaX() {
        return octavaX;
    }

    public void setOctavaX(int octavaX) {
        this.octavaX = octavaX;
    }

    public int getTempoX() {
        return tempoX;
    }

    public void setTempoX(int tempoX) {
        this.tempoX = tempoX;
    }

    public int getTempoY() {
        return tempoY;
    }

    public void setTempoY(int tempoY) {
        this.tempoY = tempoY;
    }

    public int getTempoZ() {
        return tempoZ;
    }

    public void setTempoZ(int tempoZ) {
        this.tempoZ = tempoZ;
    }

    public int getOctavaY() {
        return octavaY;
    }

    public void setOctavaY(int octavaY) {
        this.octavaY = octavaY;
    }

    public int getOctavaZ() {
        return octavaZ;
    }

    public void setOctavaZ(int octavaZ) {
        this.octavaZ = octavaZ;
    }

    @Override
    public String toString() {
        return "OpusPrimaria{" + "tempoX=" + tempoX + ", tempoY=" + tempoY + ", tempoZ=" + tempoZ + ", duraX=" + duraX + ", duraY=" + duraY + ", duraZ=" + duraZ + ", octavaX=" + octavaX + ", octavaY=" + octavaY + ", octavaZ=" + octavaZ + ", instrumento=" + instrumento + ", escala=" + escala + ", acorde=" + acorde + '}';
    }

    public void setOctavaX(double octavaX) {
        this.octavaX = (int) octavaX;
    }

    public void setOctavaY(double octavaY) {
        this.octavaY = (int) octavaY;
    }

    public void setOctavaZ(double octavaZ) {
        this.octavaZ = (int) octavaZ;
    }

    public void setTempoX(double tempoX) {
        this.tempoX = (int) tempoX;
    }

    public void setTempoY(double tempoY) {
        this.tempoY = (int) tempoY;
    }

    public void setTempoZ(double tempoZ) {
        this.tempoZ = (int) tempoZ;
    }

    public double getDuraX() {
        return duraX;
    }

    public void setDuraX(double duraX) {
        this.duraX = duraX;
    }

    public double getDuraY() {
        return duraY;
    }

    public void setDuraY(double duraY) {
        this.duraY = duraY;
    }

    public double getDuraZ() {
        return duraZ;
    }

    public void setDuraZ(double duraZ) {
        this.duraZ = duraZ;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public String getAcorde() {
        return acorde;
    }

    public void setAcorde(String acorde) {
        this.acorde = acorde;
    }
}
