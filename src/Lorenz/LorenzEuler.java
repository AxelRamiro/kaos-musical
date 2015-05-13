package Lorenz;

/**
 * @author OMAR LÓPEZ ORTEGA
 */
public class LorenzEuler {

    public double xInicial = 0;
    public double xSiguiente = 0;
    public double yInicial = 0;
    public double ySiguiente = 0;
    public double zInicial = 0;
    public double zSiguiente = 0;
    public double sigma;
    public double b;
    public double r;
    public double dt = 0.001;
    public int h = 1;
    public double lasXs[];// = new double[25];
    public double lasYs[];// = new double[25];
    public double lasZs[];// = new double[25];
    public double lasXsmapeadas[];
    public double lasYsmapeadas[];
    public double lasZsmapeadas[];
    public int iteraciones;
    public int numeroOpcion;
    public char multiplexor;
    public boolean tv;
    public boolean dv;
    ProcesadorLorenz p = new ProcesadorLorenz();
    String instrumento = new String();

    public void defineIteraciones(int itera) {
        this.iteraciones = itera;
    }

    public void esTempoVariable(boolean tv) {
        this.tv = tv;
        //System.out.println(this.tv);
    }

    public void esDuracionVariable(boolean dv) {
        this.dv = dv;
        //System.out.println(this.dv);
    }

    public void defineValoresIniciales(int x, int y, int z, int t1, int t2, int t3, double d1, double d2, double d3, double sig, double r, double b) {
        p.tamañoVector(this.iteraciones);
        p.recibeOpcionesVariacion(this.tv, this.dv);
        this.xInicial = x;
        this.yInicial = y;
        this.zInicial = z;
        this.sigma = sig;
        this.r = r;
        this.b = b;
        this.cicloLorenz();
        p.agrupaNotas(lasXs, lasYs, lasZs);
        //this.xInicial = d1;
        //this.yInicial = d2;
        //this.zInicial = d3;
        if (this.dv == true) {
            this.xInicial = d1;
            this.yInicial = d2;
            this.zInicial = d3;
            this.cicloLorenz();
            p.agrupaDuraciones(lasXs, lasYs, lasZs);
        }
        if (this.dv == false) {
            p.agrupaDuraciones(d1, d2, d3);
        }
        //this.xInicial = t1;
        //this.yInicial = t2;
        //this.zInicial = t3;
        if (this.tv == true) {
            this.xInicial = t1;
            this.yInicial = t2;
            this.zInicial = t3;
            this.cicloLorenz();
            p.agrupaTempos(lasXs, lasYs, lasZs);
        }
        if (this.tv == false) {
            p.agrupaTempos(t1, t2, t3);
        }
        p.ensamblaNotas();
    }

    public void defineInstumento(String instrument) {
        p.recibeInstrumento(instrument);
    }

    public void definePlantilla(String plantilla) {
        p.recibePlantilla(plantilla);
    }

    public void defineEscala(String s) {
        p.recibeEscala(s);
    }

    public void defineAcorde(String s) {
        p.recibeAcorde(s);
    }

    public void defineNombreArchivo(String n) {
        p.recibeNombreArchivo(n);
    }

    public void recibeNombreProyecto(String nP) {
        p.recibeNombreProyecto(nP);
    }

    public double regresaSigma() {
        return sigma;
    }

    public void defineB(double b) {
        this.b = b;
    }

    public double regresaB() {
        return b;
    }

    public void defineR(double r) {
        this.r = r;
    }

    public double regresaR() {
        return r;
    }

    public double calculaSiguienteX() {
        return xInicial - (xInicial - yInicial) * this.sigma * dt;
    }

    public double calculaSiguienteY() {
        return yInicial + (this.r * xInicial - yInicial - (xInicial * zInicial)) * dt;
    }

    public double calculaSiguienteZ() {
        return zInicial + ((xInicial * yInicial) - this.b * (zInicial)) * dt;
    }

    public void cicloLorenz() {
        lasXs = new double[iteraciones];
        lasYs = new double[iteraciones];
        lasZs = new double[iteraciones];
        for (int i = 0; i < iteraciones; i++) {
            lasXs[i] = calculaSiguienteX();
            lasYs[i] = calculaSiguienteY();
            lasZs[i] = calculaSiguienteZ();
            xInicial = lasXs[i];
            yInicial = lasYs[i];
            zInicial = lasZs[i];
            //System.out.println(i + " " + lasXs[i] + " " + lasYs[i] + " " + lasZs[i]);             
        }
    }
}
