    package EvaEmocion;

import mx.edu.uaeh.jfk.BaseReglasMamdani;
import mx.edu.uaeh.jfk.VariableMamdani;
import mx.edu.uaeh.jfk.funciones.*;
public class CalculoEmociones
{
    public double res = 0;
    public BaseReglasMamdani brm;
    public VariableMamdani agrado;
    public VariableMamdani activacion;
    public VariableMamdani calificacionEmocional;
    
    public double calculaColor(double r, double g)
    {
	//ejemplo3. Se construye una base de reglas difuso con 2 variables de entrada y una variable de salida
        agrado.setPuntoEvaluacion(r);
        activacion.setPuntoEvaluacion(g);
        res = brm.getResultadoNew();
        return res;
    }
    public void mostrarRegiones()
    {
        brm.mostrarVariables();
    }
    public CalculoEmociones()
    {
        brm = new BaseReglasMamdani("BaseReglasColorDifuso");
        try
        {
            agrado=new VariableMamdani("agrado",0.1,10);
            agrado.agregarClausulaAntecedente(new Sigmoidal(-5.0,1.5),"BajoNegativo");
            agrado.agregarClausulaAntecedente(new Gaussian(2,0.65),"MedioNegativo");
            agrado.agregarClausulaAntecedente(new Gaussian(4,0.65),"AltoNegativo");
            agrado.agregarClausulaAntecedente(new Gaussian(6,0.65),"BajoPositivo");
            agrado.agregarClausulaAntecedente(new Gaussian(8,0.65),"MedioPositivo");
            agrado.agregarClausulaAntecedente(new Sigmoidal(5,8.5),"AltoPositivo");

            activacion=new VariableMamdani("activacion",0.1,10);
            activacion.agregarClausulaAntecedente(new Sigmoidal(-5,1.5),"InferiorBaja");
            activacion.agregarClausulaAntecedente(new Gaussian(2,0.65),"InferiorMedia");
            activacion.agregarClausulaAntecedente(new Gaussian(4,0.65),"InferiorAlta");
            activacion.agregarClausulaAntecedente(new Gaussian(6,0.65),"SuperiorAlta");
            activacion.agregarClausulaAntecedente(new Gaussian(8,0.65),"SuperiorMedia");
            activacion.agregarClausulaAntecedente(new Sigmoidal(5,8.5),"SuperiorAlta");

            calificacionEmocional = new VariableMamdani("calificacionEmocional", -10, 10);
            calificacionEmocional.agregarClausulaSalida(new Sigmoidal(-10,-9),"Miedo");
            calificacionEmocional.agregarClausulaSalida(new Gaussian(-8,0.5),"Enojo");
            calificacionEmocional.agregarClausulaSalida(new Gaussian(-7,0.5),"Estres");
            calificacionEmocional.agregarClausulaSalida(new Gaussian(-6,0.5),"Dolor");
            calificacionEmocional.agregarClausulaSalida(new Gaussian(-5,0.5),"Tristeza");
            calificacionEmocional.agregarClausulaSalida(new Gaussian(-4,0.5),"Depresion");
            calificacionEmocional.agregarClausulaSalida(new Gaussian(-3,0.5),"Aletargamiento");
            calificacionEmocional.agregarClausulaSalida(new Gaussian(-1,0.75),"Fatiga");
            calificacionEmocional.agregarClausulaSalida(new Gaussian(1,0.75),"Tranquilidad");
            calificacionEmocional.agregarClausulaSalida(new Gaussian(3,0.5),"Relajamiento");
            calificacionEmocional.agregarClausulaSalida(new Gaussian(4,0.5),"Serenidad");
            calificacionEmocional.agregarClausulaSalida(new Gaussian(5,0.5),"Satisfaccion");
            calificacionEmocional.agregarClausulaSalida(new Gaussian(6,0.5),"Alegria");
            calificacionEmocional.agregarClausulaSalida(new Gaussian(7,0.5),"Euforia");
            calificacionEmocional.agregarClausulaSalida(new Gaussian(8,0.5),"Excitacion");
            calificacionEmocional.agregarClausulaSalida(new Sigmoidal(10,9),"Sorpresa");

            brm.setVariables(activacion, agrado, calificacionEmocional);
            brm.agregarRegla("SuperiorAlta AltoPositivo Excitacion");
            brm.agregarRegla("SuperiorAlta MedioPositivo Sorpresa");
            brm.agregarRegla("SuperiorAlta BajoPositivo Sorpresa");
            brm.agregarRegla("SuperiorMedia AltoPositivo Excitacion");
            brm.agregarRegla("SuperiorMedia MedioPositivo Euforia");
            brm.agregarRegla("SuperiorMedia BajoPositivo Euforia");
            brm.agregarRegla("SuperiorBaja AltoPositivo Alegria");
            brm.agregarRegla("SuperiorBaja MedioNegativo Alegria");
            brm.agregarRegla("SuperiorBaja BajoNegativo Satisfaccion");
            brm.agregarRegla("InferiorAlta AltoPositivo Satisfaccion");
            brm.agregarRegla("InferiorAlta MedioPositivo Satisfaccion");
            brm.agregarRegla("InferiorAlta BajoPositivo Serenidad");
            brm.agregarRegla("InferiorMedia AltoPositivo Serenidad");
            brm.agregarRegla("InferiorMedia MedioNegativo Serenidad");
            brm.agregarRegla("InferiorMedia BajoPositivo Relajamiento");
            brm.agregarRegla("InferiorBaja AltoPositivo Relajamiento");
            brm.agregarRegla("InferiorBaja MedioPositivo Tranquilidad");
            brm.agregarRegla("InferiorBaja BajoPositivo Tranquilidad");
            brm.agregarRegla("SuperiorAlta BajoNegativo Miedo");
            brm.agregarRegla("SuperiorAlta MedioNegativo Miedo");
            brm.agregarRegla("SuperiorAlta AltoNegativo Enojo");
            brm.agregarRegla("SuperiorMedia AltoNegativo Estres");
            brm.agregarRegla("SuperiorMedia MedioNegativo Estres");
            brm.agregarRegla("SuperiorMedia BajoNegativo Dolor");
            brm.agregarRegla("SuperiorBaja AltoNegativo Dolor");
            brm.agregarRegla("SuperiorBaja MedioNegativo Dolor");
            brm.agregarRegla("SuperiorBaja BajoNegativo Tristeza");
            brm.agregarRegla("InferiorAlta AltoNegativo Depresion");
            brm.agregarRegla("InferiorAlta MedioNegativo Tristeza");
            brm.agregarRegla("InferiorAlta BajoNegativo Depresion");
            brm.agregarRegla("InferiorMedia AltoNegativo Aletargamiento");
            brm.agregarRegla("InferiorMedia MedioNegativo Aletargamiento");
            brm.agregarRegla("InferiorMedia BajoNegativo Fatiga");
            brm.agregarRegla("InferiorBaja AltoNegativo Aletargamiento");
            brm.agregarRegla("InferiorBaja MedioNegativo Fatiga");
            brm.agregarRegla("InferiorBaja BajoNegativo Fatiga");
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
