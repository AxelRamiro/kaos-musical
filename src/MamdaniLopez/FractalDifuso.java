/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MamdaniLopez;
/*
import mx.edu.uaeh.jfk.BaseReglasMamdani;
import mx.edu.uaeh.jfk.VariableMamdani;
import mx.edu.uaeh.jfk.funciones.*;
/**
 *
 * @author Omar López Ortega
 */
/*
public class FractalDifuso
{
    public BaseReglasMamdani brmFractalDifuso;//se declara la base de reglas
    public VariableMamdani xEntrada; //valor x en la entrada
    public VariableMamdani yEntrada;//valor y en la entrada
    public VariableMamdani xSalida;//valor x en la salida
    public double res = 0;

    public double calculaFractalDifuso(double x, double y)
    {
        xEntrada.setPuntoEvaluacion(x);
        yEntrada.setPuntoEvaluacion(y);
        res = brmFractalDifuso.getResultadoNew();
        return res;
    }
    public void mostrarRegiones()
    {
                //brmFractalDifuso.mostrarVariables();
    }
    public FractalDifuso()
    {
        brmFractalDifuso = new BaseReglasMamdani("Fractal Difuso");
        try
        {
            //Base de reglas para el cálculo del fractal
            xEntrada = new VariableMamdani("xEntrada", -175, 130); // xEntrada
            yEntrada = new VariableMamdani("yEntrada", -175, 130); //yEntrada
            xSalida = new VariableMamdani("xSalida", -175, 130); //xSalida
            //xEntrada
            xEntrada.agregarClausulaAntecedente(new Sigmoidal(-1, 6),"xe1A");
            xEntrada.agregarClausulaAntecedente(new Gaussian(9,6), "xe1B");
            xEntrada.agregarClausulaAntecedente(new Gaussian(15,6), "xe2A");
            xEntrada.agregarClausulaAntecedente(new Gaussian(21,6), "xe2B");
            xEntrada.agregarClausulaAntecedente(new Gaussian(27,6), "xe3A");
            xEntrada.agregarClausulaAntecedente(new Gaussian(33,6), "xe3B");
            xEntrada.agregarClausulaAntecedente(new Gaussian(39,6), "xe4A");
            xEntrada.agregarClausulaAntecedente(new Gaussian(45,6), "xe4B");
            xEntrada.agregarClausulaAntecedente(new Gaussian(51,6), "xe5A");
            xEntrada.agregarClausulaAntecedente(new Gaussian(57,6), "xe5B");
            xEntrada.agregarClausulaAntecedente(new Gaussian(63,6), "xe6A");
            xEntrada.agregarClausulaAntecedente(new Gaussian(69,6), "xe6B");
            xEntrada.agregarClausulaAntecedente(new Gaussian(75,6), "xe7A");
            xEntrada.agregarClausulaAntecedente(new Gaussian(81,6), "xe7B");
            xEntrada.agregarClausulaAntecedente(new Gaussian(87,6), "xe8A");
            xEntrada.agregarClausulaAntecedente(new Gaussian(93,6), "xe8B");
            xEntrada.agregarClausulaAntecedente(new Gaussian(99,6), "xe9A");
            xEntrada.agregarClausulaAntecedente(new Gaussian(105,6), "xe9B");
            xEntrada.agregarClausulaAntecedente(new Gaussian(111,6), "xe10A");
            xEntrada.agregarClausulaAntecedente(new Sigmoidal(1,111), "xe10B");
            //yEntrada
            yEntrada.agregarClausulaAntecedente(new Sigmoidal(-1, 6),"ye1A");
            yEntrada.agregarClausulaAntecedente(new Gaussian(9,6), "ye1B");
            yEntrada.agregarClausulaAntecedente(new Gaussian(15,6), "ye2A");
            yEntrada.agregarClausulaAntecedente(new Gaussian(21,6), "ye2B");
            yEntrada.agregarClausulaAntecedente(new Gaussian(27,6), "ye3A");
            yEntrada.agregarClausulaAntecedente(new Gaussian(33,6), "ye3B");
            yEntrada.agregarClausulaAntecedente(new Gaussian(39,6), "ye4A");
            yEntrada.agregarClausulaAntecedente(new Gaussian(45,6), "ye4B");
            yEntrada.agregarClausulaAntecedente(new Gaussian(51,6), "ye5A");
            yEntrada.agregarClausulaAntecedente(new Gaussian(57,6), "ye5B");
            yEntrada.agregarClausulaAntecedente(new Gaussian(63,6), "ye6A");
            yEntrada.agregarClausulaAntecedente(new Gaussian(69,6), "ye6B");
            yEntrada.agregarClausulaAntecedente(new Gaussian(75,6), "ye7A");
            yEntrada.agregarClausulaAntecedente(new Gaussian(81,6), "ye7B");
            yEntrada.agregarClausulaAntecedente(new Gaussian(87,6), "ye8A");
            yEntrada.agregarClausulaAntecedente(new Gaussian(93,6), "ye8B");
            yEntrada.agregarClausulaAntecedente(new Gaussian(99,6), "ye9A");
            yEntrada.agregarClausulaAntecedente(new Gaussian(105,6), "ye9B");
            yEntrada.agregarClausulaAntecedente(new Gaussian(111,6), "ye10A");
            yEntrada.agregarClausulaAntecedente(new Sigmoidal(1,111), "ye10B");
            //xSalida
            xSalida.agregarClausulaSalida(new Sigmoidal(-1, 6),"xs1A");
            xSalida.agregarClausulaSalida(new Gaussian(9,6), "xs1B");
            xSalida.agregarClausulaSalida(new Gaussian(15,6), "xs2A");
            xSalida.agregarClausulaSalida(new Gaussian(21,6), "xs2B");
            xSalida.agregarClausulaSalida(new Gaussian(27,6), "xs3A");
            xSalida.agregarClausulaSalida(new Gaussian(33,6), "xs3B");
            xSalida.agregarClausulaSalida(new Gaussian(39,6), "xs4A");
            xSalida.agregarClausulaSalida(new Gaussian(45,6), "xs4B");
            xSalida.agregarClausulaSalida(new Gaussian(51,6), "xs5A");
            xSalida.agregarClausulaSalida(new Gaussian(57,6), "xs5B");
            xSalida.agregarClausulaSalida(new Gaussian(63,6), "xs6A");
            xSalida.agregarClausulaSalida(new Gaussian(69,6), "xs6B");
            xSalida.agregarClausulaSalida(new Gaussian(75,6), "xs7A");
            xSalida.agregarClausulaSalida(new Gaussian(81,6), "xs7B");
            xSalida.agregarClausulaSalida(new Gaussian(87,6), "xs8A");
            xSalida.agregarClausulaSalida(new Gaussian(93,6), "xs8B");
            xSalida.agregarClausulaSalida(new Gaussian(99,6), "xs9A");
            xSalida.agregarClausulaSalida(new Gaussian(105,6), "xs9B");
            xSalida.agregarClausulaSalida(new Gaussian(111,3), "xs10A");
            xSalida.agregarClausulaSalida(new Sigmoidal(1,111), "xs10B");
            //crear reglas
            //xe1A
            brmFractalDifuso.setVariables(xEntrada, yEntrada, xSalida);
            brmFractalDifuso.agregarRegla("xe1A ye1A xs1A");
            brmFractalDifuso.agregarRegla("xe1A ye1B xs1B");
            brmFractalDifuso.agregarRegla("xe1A ye2A xs2A");
            brmFractalDifuso.agregarRegla("xe1A ye2B xs2B");
            brmFractalDifuso.agregarRegla("xe1A ye3A xs3A");
            brmFractalDifuso.agregarRegla("xe1A ye3B xs3B");
            brmFractalDifuso.agregarRegla("xe1A ye4A xs4A");
            brmFractalDifuso.agregarRegla("xe1A ye4B xs4B");
            brmFractalDifuso.agregarRegla("xe1A ye5A xs5A");
            brmFractalDifuso.agregarRegla("xe1A ye5B xs5B");
            brmFractalDifuso.agregarRegla("xe1A ye6A xs6A");
            brmFractalDifuso.agregarRegla("xe1A ye6B xs6B");
            brmFractalDifuso.agregarRegla("xe1A ye7A xs7A");
            brmFractalDifuso.agregarRegla("xe1A ye7B xs7B");
            brmFractalDifuso.agregarRegla("xe1A ye8A xs8A");
            brmFractalDifuso.agregarRegla("xe1A ye8B xs8B");
            brmFractalDifuso.agregarRegla("xe1A ye9A xs9A");
            brmFractalDifuso.agregarRegla("xe1A ye9B xs9B");
            brmFractalDifuso.agregarRegla("xe1A ye10A xs10A");
            brmFractalDifuso.agregarRegla("xe1A ye10B xs10B");
            //xe1B
            brmFractalDifuso.agregarRegla("xe1B ye1A xs10B");
            brmFractalDifuso.agregarRegla("xe1B ye1B xs10A");
            brmFractalDifuso.agregarRegla("xe1B ye2A xs9B");
            brmFractalDifuso.agregarRegla("xe1B ye2B xs9A");
            brmFractalDifuso.agregarRegla("xe1B ye3A xs8B");
            brmFractalDifuso.agregarRegla("xe1B ye3B xs8A");
            brmFractalDifuso.agregarRegla("xe1B ye4A xs7B");
            brmFractalDifuso.agregarRegla("xe1B ye4B xs7A");
            brmFractalDifuso.agregarRegla("xe1B ye5A xs6B");
            brmFractalDifuso.agregarRegla("xe1B ye5B xs6A");
            brmFractalDifuso.agregarRegla("xe1B ye6A xs5B");
            brmFractalDifuso.agregarRegla("xe1B ye6B xs5A");
            brmFractalDifuso.agregarRegla("xe1B ye7A xs4B");
            brmFractalDifuso.agregarRegla("xe1B ye7B xs4A");
            brmFractalDifuso.agregarRegla("xe1B ye8A xs3B");
            brmFractalDifuso.agregarRegla("xe1B ye8B xs3A");
            brmFractalDifuso.agregarRegla("xe1B ye9A xs2B");
            brmFractalDifuso.agregarRegla("xe1B ye9B xs2A");
            brmFractalDifuso.agregarRegla("xe1B ye10A xs1B");
            brmFractalDifuso.agregarRegla("xe1B ye10B xs1A");
            //xe2A
            brmFractalDifuso.agregarRegla("xe2A ye1A xs1A");
            brmFractalDifuso.agregarRegla("xe2A ye1B xs1B");
            brmFractalDifuso.agregarRegla("xe2A ye2A xs2A");
            brmFractalDifuso.agregarRegla("xe2A ye2B xs2B");
            brmFractalDifuso.agregarRegla("xe2A ye3A xs3A");
            brmFractalDifuso.agregarRegla("xe2A ye3B xs3B");
            brmFractalDifuso.agregarRegla("xe2A ye4A xs4A");
            brmFractalDifuso.agregarRegla("xe2A ye4B xs4B");
            brmFractalDifuso.agregarRegla("xe2A ye5A xs5A");
            brmFractalDifuso.agregarRegla("xe2A ye5B xs5B");
            brmFractalDifuso.agregarRegla("xe2A ye6A xs6A");
            brmFractalDifuso.agregarRegla("xe2A ye6B xs6B");
            brmFractalDifuso.agregarRegla("xe2A ye7A xs7A");
            brmFractalDifuso.agregarRegla("xe2A ye7B xs7B");
            brmFractalDifuso.agregarRegla("xe2A ye8A xs8A");
            brmFractalDifuso.agregarRegla("xe2A ye8B xs8B");
            brmFractalDifuso.agregarRegla("xe2A ye9A xs9A");
            brmFractalDifuso.agregarRegla("xe2A ye9B xs9B");
            brmFractalDifuso.agregarRegla("xe2A ye10A xs10A");
            brmFractalDifuso.agregarRegla("xe2A ye10B xs10B");
            //xe2B
            brmFractalDifuso.agregarRegla("xe2B ye1A xs10B");
            brmFractalDifuso.agregarRegla("xe2B ye1B xs10A");
            brmFractalDifuso.agregarRegla("xe2B ye2A xs9B");
            brmFractalDifuso.agregarRegla("xe2B ye2B xs9A");
            brmFractalDifuso.agregarRegla("xe2B ye3A xs8B");
            brmFractalDifuso.agregarRegla("xe2B ye3B xs8A");
            brmFractalDifuso.agregarRegla("xe2B ye4A xs7B");
            brmFractalDifuso.agregarRegla("xe2B ye4B xs7A");
            brmFractalDifuso.agregarRegla("xe2B ye5A xs6B");
            brmFractalDifuso.agregarRegla("xe2B ye5B xs6A");
            brmFractalDifuso.agregarRegla("xe2B ye6A xs5B");
            brmFractalDifuso.agregarRegla("xe2B ye6B xs5A");
            brmFractalDifuso.agregarRegla("xe2B ye7A xs4B");
            brmFractalDifuso.agregarRegla("xe2B ye7B xs4A");
            brmFractalDifuso.agregarRegla("xe2B ye8A xs3B");
            brmFractalDifuso.agregarRegla("xe2B ye8B xs3A");
            brmFractalDifuso.agregarRegla("xe2B ye9A xs2B");
            brmFractalDifuso.agregarRegla("xe2B ye9B xs2A");
            brmFractalDifuso.agregarRegla("xe2B ye10A xs1B");
            brmFractalDifuso.agregarRegla("xe2B ye10B xs1A");
            //xe3A
            brmFractalDifuso.agregarRegla("xe3A ye1A xs1A");
            brmFractalDifuso.agregarRegla("xe3A ye1B xs1B");
            brmFractalDifuso.agregarRegla("xe3A ye2A xs2A");
            brmFractalDifuso.agregarRegla("xe3A ye2B xs2B");
            brmFractalDifuso.agregarRegla("xe3A ye3A xs3A");
            brmFractalDifuso.agregarRegla("xe3A ye3B xs3B");
            brmFractalDifuso.agregarRegla("xe3A ye4A xs4A");
            brmFractalDifuso.agregarRegla("xe3A ye4B xs4B");
            brmFractalDifuso.agregarRegla("xe3A ye5A xs5A");
            brmFractalDifuso.agregarRegla("xe3A ye5B xs5B");
            brmFractalDifuso.agregarRegla("xe3A ye6A xs6A");
            brmFractalDifuso.agregarRegla("xe3A ye6B xs6B");
            brmFractalDifuso.agregarRegla("xe3A ye7A xs7A");
            brmFractalDifuso.agregarRegla("xe3A ye7B xs7B");
            brmFractalDifuso.agregarRegla("xe3A ye8A xs8A");
            brmFractalDifuso.agregarRegla("xe3A ye8B xs8B");
            brmFractalDifuso.agregarRegla("xe3A ye9A xs9A");
            brmFractalDifuso.agregarRegla("xe3A ye9B xs9B");
            brmFractalDifuso.agregarRegla("xe3A ye10A xs10A");
            brmFractalDifuso.agregarRegla("xe3A ye10B xs10B");
            //xe3B
            brmFractalDifuso.agregarRegla("xe3B ye1A xs10B");
            brmFractalDifuso.agregarRegla("xe3B ye1B xs10A");
            brmFractalDifuso.agregarRegla("xe3B ye2A xs9B");
            brmFractalDifuso.agregarRegla("xe3B ye2B xs9A");
            brmFractalDifuso.agregarRegla("xe3B ye3A xs8B");
            brmFractalDifuso.agregarRegla("xe3B ye3B xs8A");
            brmFractalDifuso.agregarRegla("xe3B ye4A xs7B");
            brmFractalDifuso.agregarRegla("xe3B ye4B xs7A");
            brmFractalDifuso.agregarRegla("xe3B ye5A xs6B");
            brmFractalDifuso.agregarRegla("xe3B ye5B xs6A");
            brmFractalDifuso.agregarRegla("xe3B ye6A xs5B");
            brmFractalDifuso.agregarRegla("xe3B ye6B xs5A");
            brmFractalDifuso.agregarRegla("xe3B ye7A xs4B");
            brmFractalDifuso.agregarRegla("xe3B ye7B xs4A");
            brmFractalDifuso.agregarRegla("xe3B ye8A xs3B");
            brmFractalDifuso.agregarRegla("xe3B ye8B xs3A");
            brmFractalDifuso.agregarRegla("xe3B ye9A xs2B");
            brmFractalDifuso.agregarRegla("xe3B ye9B xs2A");
            brmFractalDifuso.agregarRegla("xe3B ye10A xs1B");
            brmFractalDifuso.agregarRegla("xe3B ye10B xs1A");
            //xe4A
            brmFractalDifuso.agregarRegla("xe4A ye1A xs1A");
            brmFractalDifuso.agregarRegla("xe4A ye1B xs1B");
            brmFractalDifuso.agregarRegla("xe4A ye2A xs2A");
            brmFractalDifuso.agregarRegla("xe4A ye2B xs2B");
            brmFractalDifuso.agregarRegla("xe4A ye3A xs3A");
            brmFractalDifuso.agregarRegla("xe4A ye3B xs3B");
            brmFractalDifuso.agregarRegla("xe4A ye4A xs4A");
            brmFractalDifuso.agregarRegla("xe4A ye4B xs4B");
            brmFractalDifuso.agregarRegla("xe4A ye5A xs5A");
            brmFractalDifuso.agregarRegla("xe4A ye5B xs5B");
            brmFractalDifuso.agregarRegla("xe4A ye6A xs6A");
            brmFractalDifuso.agregarRegla("xe4A ye6B xs6B");
            brmFractalDifuso.agregarRegla("xe4A ye7A xs7A");
            brmFractalDifuso.agregarRegla("xe4A ye7B xs7B");
            brmFractalDifuso.agregarRegla("xe4A ye8A xs8A");
            brmFractalDifuso.agregarRegla("xe4A ye8B xs8B");
            brmFractalDifuso.agregarRegla("xe4A ye9A xs9A");
            brmFractalDifuso.agregarRegla("xe4A ye9B xs9B");
            brmFractalDifuso.agregarRegla("xe4A ye10A xs10A");
            brmFractalDifuso.agregarRegla("xe4A ye10B xs10B");
            //xe4B
            brmFractalDifuso.agregarRegla("xe4B ye1A xs10B");
            brmFractalDifuso.agregarRegla("xe4B ye1B xs10A");
            brmFractalDifuso.agregarRegla("xe4B ye2A xs9B");
            brmFractalDifuso.agregarRegla("xe4B ye2B xs9A");
            brmFractalDifuso.agregarRegla("xe4B ye3A xs8B");
            brmFractalDifuso.agregarRegla("xe4B ye3B xs8A");
            brmFractalDifuso.agregarRegla("xe4B ye4A xs7B");
            brmFractalDifuso.agregarRegla("xe4B ye4B xs7A");
            brmFractalDifuso.agregarRegla("xe4B ye5A xs6B");
            brmFractalDifuso.agregarRegla("xe4B ye5B xs6A");
            brmFractalDifuso.agregarRegla("xe4B ye6A xs5B");
            brmFractalDifuso.agregarRegla("xe4B ye6B xs5A");
            brmFractalDifuso.agregarRegla("xe4B ye7A xs4B");
            brmFractalDifuso.agregarRegla("xe4B ye7B xs4A");
            brmFractalDifuso.agregarRegla("xe4B ye8A xs3B");
            brmFractalDifuso.agregarRegla("xe4B ye8B xs3A");
            brmFractalDifuso.agregarRegla("xe4B ye9A xs2B");
            brmFractalDifuso.agregarRegla("xe4B ye9B xs2A");
            brmFractalDifuso.agregarRegla("xe4B ye10A xs1B");
            brmFractalDifuso.agregarRegla("xe4B ye10B xs1A");
            //xe5A
            brmFractalDifuso.agregarRegla("xe5A ye1A xs1A");
            brmFractalDifuso.agregarRegla("xe5A ye1B xs1B");
            brmFractalDifuso.agregarRegla("xe5A ye2A xs2A");
            brmFractalDifuso.agregarRegla("xe5A ye2B xs2B");
            brmFractalDifuso.agregarRegla("xe5A ye3A xs3A");
            brmFractalDifuso.agregarRegla("xe5A ye3B xs3B");
            brmFractalDifuso.agregarRegla("xe5A ye4A xs4A");
            brmFractalDifuso.agregarRegla("xe5A ye4B xs4B");
            brmFractalDifuso.agregarRegla("xe5A ye5A xs5A");
            brmFractalDifuso.agregarRegla("xe5A ye5B xs5B");
            brmFractalDifuso.agregarRegla("xe5A ye6A xs6A");
            brmFractalDifuso.agregarRegla("xe5A ye6B xs6B");
            brmFractalDifuso.agregarRegla("xe5A ye7A xs7A");
            brmFractalDifuso.agregarRegla("xe5A ye7B xs7B");
            brmFractalDifuso.agregarRegla("xe5A ye8A xs8A");
            brmFractalDifuso.agregarRegla("xe5A ye8B xs8B");
            brmFractalDifuso.agregarRegla("xe5A ye9A xs9A");
            brmFractalDifuso.agregarRegla("xe5A ye9B xs9B");
            brmFractalDifuso.agregarRegla("xe5A ye10A xs10A");
            brmFractalDifuso.agregarRegla("xe5A ye10B xs10B");
            //xe5B
            brmFractalDifuso.agregarRegla("xe5B ye1A xs10B");
            brmFractalDifuso.agregarRegla("xe5B ye1B xs10A");
            brmFractalDifuso.agregarRegla("xe5B ye2A xs9B");
            brmFractalDifuso.agregarRegla("xe5B ye2B xs9A");
            brmFractalDifuso.agregarRegla("xe5B ye3A xs8B");
            brmFractalDifuso.agregarRegla("xe5B ye3B xs8A");
            brmFractalDifuso.agregarRegla("xe5B ye4A xs7B");
            brmFractalDifuso.agregarRegla("xe5B ye4B xs7A");
            brmFractalDifuso.agregarRegla("xe5B ye5A xs6B");
            brmFractalDifuso.agregarRegla("xe5B ye5B xs6A");
            brmFractalDifuso.agregarRegla("xe5B ye6A xs5B");
            brmFractalDifuso.agregarRegla("xe5B ye6B xs5A");
            brmFractalDifuso.agregarRegla("xe5B ye7A xs4B");
            brmFractalDifuso.agregarRegla("xe5B ye7B xs4A");
            brmFractalDifuso.agregarRegla("xe5B ye8A xs3B");
            brmFractalDifuso.agregarRegla("xe5B ye8B xs3A");
            brmFractalDifuso.agregarRegla("xe5B ye9A xs2B");
            brmFractalDifuso.agregarRegla("xe5B ye9B xs2A");
            brmFractalDifuso.agregarRegla("xe5B ye10A xs1B");
            brmFractalDifuso.agregarRegla("xe5B ye10B xs1A");
            //xe6A
            brmFractalDifuso.agregarRegla("xe6A ye1A xs1A");
            brmFractalDifuso.agregarRegla("xe6A ye1B xs1B");
            brmFractalDifuso.agregarRegla("xe6A ye2A xs2A");
            brmFractalDifuso.agregarRegla("xe6A ye2B xs2B");
            brmFractalDifuso.agregarRegla("xe6A ye3A xs3A");
            brmFractalDifuso.agregarRegla("xe6A ye3B xs3B");
            brmFractalDifuso.agregarRegla("xe6A ye4A xs4A");
            brmFractalDifuso.agregarRegla("xe6A ye4B xs4B");
            brmFractalDifuso.agregarRegla("xe6A ye5A xs5A");
            brmFractalDifuso.agregarRegla("xe6A ye5B xs5B");
            brmFractalDifuso.agregarRegla("xe6A ye6A xs6A");
            brmFractalDifuso.agregarRegla("xe6A ye6B xs6B");
            brmFractalDifuso.agregarRegla("xe6A ye7A xs7A");
            brmFractalDifuso.agregarRegla("xe6A ye7B xs7B");
            brmFractalDifuso.agregarRegla("xe6A ye8A xs8A");
            brmFractalDifuso.agregarRegla("xe6A ye8B xs8B");
            brmFractalDifuso.agregarRegla("xe6A ye9A xs9A");
            brmFractalDifuso.agregarRegla("xe6A ye9B xs9B");
            brmFractalDifuso.agregarRegla("xe6A ye10A xs10A");
            brmFractalDifuso.agregarRegla("xe6A ye10B xs10B");
            //xe6B
            brmFractalDifuso.agregarRegla("xe6B ye1A xs10B");
            brmFractalDifuso.agregarRegla("xe6B ye1B xs10A");
            brmFractalDifuso.agregarRegla("xe6B ye2A xs9B");
            brmFractalDifuso.agregarRegla("xe6B ye2B xs9A");
            brmFractalDifuso.agregarRegla("xe6B ye3A xs8B");
            brmFractalDifuso.agregarRegla("xe6B ye3B xs8A");
            brmFractalDifuso.agregarRegla("xe6B ye4A xs7B");
            brmFractalDifuso.agregarRegla("xe6B ye4B xs7A");
            brmFractalDifuso.agregarRegla("xe6B ye5A xs6B");
            brmFractalDifuso.agregarRegla("xe6B ye5B xs6A");
            brmFractalDifuso.agregarRegla("xe6B ye6A xs5B");
            brmFractalDifuso.agregarRegla("xe6B ye6B xs5A");
            brmFractalDifuso.agregarRegla("xe6B ye7A xs4B");
            brmFractalDifuso.agregarRegla("xe6B ye7B xs4A");
            brmFractalDifuso.agregarRegla("xe6B ye8A xs3B");
            brmFractalDifuso.agregarRegla("xe6B ye8B xs3A");
            brmFractalDifuso.agregarRegla("xe6B ye9A xs2B");
            brmFractalDifuso.agregarRegla("xe6B ye9B xs2A");
            brmFractalDifuso.agregarRegla("xe6B ye10A xs1B");
            brmFractalDifuso.agregarRegla("xe6B ye10B xs1A");
            //xe7A
            brmFractalDifuso.agregarRegla("xe7A ye1A xs1A");
            brmFractalDifuso.agregarRegla("xe7A ye1B xs1B");
            brmFractalDifuso.agregarRegla("xe7A ye2A xs2A");
            brmFractalDifuso.agregarRegla("xe7A ye2B xs2B");
            brmFractalDifuso.agregarRegla("xe7A ye3A xs3A");
            brmFractalDifuso.agregarRegla("xe7A ye3B xs3B");
            brmFractalDifuso.agregarRegla("xe7A ye4A xs4A");
            brmFractalDifuso.agregarRegla("xe7A ye4B xs4B");
            brmFractalDifuso.agregarRegla("xe7A ye5A xs5A");
            brmFractalDifuso.agregarRegla("xe7A ye5B xs5B");
            brmFractalDifuso.agregarRegla("xe7A ye6A xs6A");
            brmFractalDifuso.agregarRegla("xe7A ye6B xs6B");
            brmFractalDifuso.agregarRegla("xe7A ye7A xs7A");
            brmFractalDifuso.agregarRegla("xe7A ye7B xs7B");
            brmFractalDifuso.agregarRegla("xe7A ye8A xs8A");
            brmFractalDifuso.agregarRegla("xe7A ye8B xs8B");
            brmFractalDifuso.agregarRegla("xe7A ye9A xs9A");
            brmFractalDifuso.agregarRegla("xe7A ye9B xs9B");
            brmFractalDifuso.agregarRegla("xe7A ye10A xs10A");
            brmFractalDifuso.agregarRegla("xe7A ye10B xs10B");
            //xe7B
            brmFractalDifuso.agregarRegla("xe7B ye1A xs10B");
            brmFractalDifuso.agregarRegla("xe7B ye1B xs10A");
            brmFractalDifuso.agregarRegla("xe7B ye2A xs9B");
            brmFractalDifuso.agregarRegla("xe7B ye2B xs9A");
            brmFractalDifuso.agregarRegla("xe7B ye3A xs8B");
            brmFractalDifuso.agregarRegla("xe7B ye3B xs8A");
            brmFractalDifuso.agregarRegla("xe7B ye4A xs7B");
            brmFractalDifuso.agregarRegla("xe7B ye4B xs7A");
            brmFractalDifuso.agregarRegla("xe7B ye5A xs6B");
            brmFractalDifuso.agregarRegla("xe7B ye5B xs6A");
            brmFractalDifuso.agregarRegla("xe7B ye6A xs5B");
            brmFractalDifuso.agregarRegla("xe7B ye6B xs5A");
            brmFractalDifuso.agregarRegla("xe7B ye7A xs4B");
            brmFractalDifuso.agregarRegla("xe7B ye7B xs4A");
            brmFractalDifuso.agregarRegla("xe7B ye8A xs3B");
            brmFractalDifuso.agregarRegla("xe7B ye8B xs3A");
            brmFractalDifuso.agregarRegla("xe7B ye9A xs2B");
            brmFractalDifuso.agregarRegla("xe7B ye9B xs2A");
            brmFractalDifuso.agregarRegla("xe7B ye10A xs1B");
            brmFractalDifuso.agregarRegla("xe7B ye10B xs1A");
            //xe8A
            brmFractalDifuso.agregarRegla("xe8A ye1A xs1A");
            brmFractalDifuso.agregarRegla("xe8A ye1B xs1B");
            brmFractalDifuso.agregarRegla("xe8A ye2A xs2A");
            brmFractalDifuso.agregarRegla("xe8A ye2B xs2B");
            brmFractalDifuso.agregarRegla("xe8A ye3A xs3A");
            brmFractalDifuso.agregarRegla("xe8A ye3B xs3B");
            brmFractalDifuso.agregarRegla("xe8A ye4A xs4A");
            brmFractalDifuso.agregarRegla("xe8A ye4B xs4B");
            brmFractalDifuso.agregarRegla("xe8A ye5A xs5A");
            brmFractalDifuso.agregarRegla("xe8A ye5B xs5B");
            brmFractalDifuso.agregarRegla("xe8A ye6A xs6A");
            brmFractalDifuso.agregarRegla("xe8A ye6B xs6B");
            brmFractalDifuso.agregarRegla("xe8A ye7A xs7A");
            brmFractalDifuso.agregarRegla("xe8A ye7B xs7B");
            brmFractalDifuso.agregarRegla("xe8A ye8A xs8A");
            brmFractalDifuso.agregarRegla("xe8A ye8B xs8B");
            brmFractalDifuso.agregarRegla("xe8A ye9A xs9A");
            brmFractalDifuso.agregarRegla("xe8A ye9B xs9B");
            brmFractalDifuso.agregarRegla("xe8A ye10A xs10A");
            brmFractalDifuso.agregarRegla("xe8A ye10B xs10B");
            //xe8B
            brmFractalDifuso.agregarRegla("xe8B ye1A xs10B");
            brmFractalDifuso.agregarRegla("xe8B ye1B xs10A");
            brmFractalDifuso.agregarRegla("xe8B ye2A xs9B");
            brmFractalDifuso.agregarRegla("xe8B ye2B xs9A");
            brmFractalDifuso.agregarRegla("xe8B ye3A xs8B");
            brmFractalDifuso.agregarRegla("xe8B ye3B xs8A");
            brmFractalDifuso.agregarRegla("xe8B ye4A xs7B");
            brmFractalDifuso.agregarRegla("xe8B ye4B xs7A");
            brmFractalDifuso.agregarRegla("xe8B ye5A xs6B");
            brmFractalDifuso.agregarRegla("xe8B ye5B xs6A");
            brmFractalDifuso.agregarRegla("xe8B ye6A xs5B");
            brmFractalDifuso.agregarRegla("xe8B ye6B xs5A");
            brmFractalDifuso.agregarRegla("xe8B ye7A xs4B");
            brmFractalDifuso.agregarRegla("xe8B ye7B xs4A");
            brmFractalDifuso.agregarRegla("xe8B ye8A xs3B");
            brmFractalDifuso.agregarRegla("xe8B ye8B xs3A");
            brmFractalDifuso.agregarRegla("xe8B ye9A xs2B");
            brmFractalDifuso.agregarRegla("xe8B ye9B xs2A");
            brmFractalDifuso.agregarRegla("xe8B ye10A xs1B");
            brmFractalDifuso.agregarRegla("xe8B ye10B xs1A");
            //xe9A
            brmFractalDifuso.agregarRegla("xe9A ye1A xs1A");
            brmFractalDifuso.agregarRegla("xe9A ye1B xs1B");
            brmFractalDifuso.agregarRegla("xe9A ye2A xs2A");
            brmFractalDifuso.agregarRegla("xe9A ye2B xs2B");
            brmFractalDifuso.agregarRegla("xe9A ye3A xs3A");
            brmFractalDifuso.agregarRegla("xe9A ye3B xs3B");
            brmFractalDifuso.agregarRegla("xe9A ye4A xs4A");
            brmFractalDifuso.agregarRegla("xe9A ye4B xs4B");
            brmFractalDifuso.agregarRegla("xe9A ye5A xs5A");
            brmFractalDifuso.agregarRegla("xe9A ye5B xs5B");
            brmFractalDifuso.agregarRegla("xe9A ye6A xs6A");
            brmFractalDifuso.agregarRegla("xe9A ye6B xs6B");
            brmFractalDifuso.agregarRegla("xe9A ye7A xs7A");
            brmFractalDifuso.agregarRegla("xe9A ye7B xs7B");
            brmFractalDifuso.agregarRegla("xe9A ye8A xs8A");
            brmFractalDifuso.agregarRegla("xe9A ye8B xs8B");
            brmFractalDifuso.agregarRegla("xe9A ye9A xs9A");
            brmFractalDifuso.agregarRegla("xe9A ye9B xs9B");
            brmFractalDifuso.agregarRegla("xe9A ye10A xs10A");
            brmFractalDifuso.agregarRegla("xe9A ye10B xs10B");
            //xe9B
            brmFractalDifuso.agregarRegla("xe9B ye1A xs10B");
            brmFractalDifuso.agregarRegla("xe9B ye1B xs10A");
            brmFractalDifuso.agregarRegla("xe9B ye2A xs9B");
            brmFractalDifuso.agregarRegla("xe9B ye2B xs9A");
            brmFractalDifuso.agregarRegla("xe9B ye3A xs8B");
            brmFractalDifuso.agregarRegla("xe9B ye3B xs8A");
            brmFractalDifuso.agregarRegla("xe9B ye4A xs7B");
            brmFractalDifuso.agregarRegla("xe9B ye4B xs7A");
            brmFractalDifuso.agregarRegla("xe9B ye5A xs6B");
            brmFractalDifuso.agregarRegla("xe9B ye5B xs6A");
            brmFractalDifuso.agregarRegla("xe9B ye6A xs5B");
            brmFractalDifuso.agregarRegla("xe9B ye6B xs5A");
            brmFractalDifuso.agregarRegla("xe9B ye7A xs4B");
            brmFractalDifuso.agregarRegla("xe9B ye7B xs4A");
            brmFractalDifuso.agregarRegla("xe9B ye8A xs3B");
            brmFractalDifuso.agregarRegla("xe9B ye8B xs3A");
            brmFractalDifuso.agregarRegla("xe9B ye9A xs2B");
            brmFractalDifuso.agregarRegla("xe9B ye9B xs2A");
            brmFractalDifuso.agregarRegla("xe9B ye10A xs1B");
            brmFractalDifuso.agregarRegla("xe9B ye10B xs1A");
            //xe10A
            brmFractalDifuso.agregarRegla("xe10A ye1A xs1A");
            brmFractalDifuso.agregarRegla("xe10A ye1B xs1B");
            brmFractalDifuso.agregarRegla("xe10A ye2A xs2A");
            brmFractalDifuso.agregarRegla("xe10A ye2B xs2B");
            brmFractalDifuso.agregarRegla("xe10A ye3A xs3A");
            brmFractalDifuso.agregarRegla("xe10A ye3B xs3B");
            brmFractalDifuso.agregarRegla("xe10A ye4A xs4A");
            brmFractalDifuso.agregarRegla("xe10A ye4B xs4B");
            brmFractalDifuso.agregarRegla("xe10A ye5A xs5A");
            brmFractalDifuso.agregarRegla("xe10A ye5B xs5B");
            brmFractalDifuso.agregarRegla("xe10A ye6A xs6A");
            brmFractalDifuso.agregarRegla("xe10A ye6B xs6B");
            brmFractalDifuso.agregarRegla("xe10A ye7A xs7A");
            brmFractalDifuso.agregarRegla("xe10A ye7B xs7B");
            brmFractalDifuso.agregarRegla("xe10A ye8A xs8A");
            brmFractalDifuso.agregarRegla("xe10A ye8B xs8B");
            brmFractalDifuso.agregarRegla("xe10A ye9A xs9A");
            brmFractalDifuso.agregarRegla("xe10A ye9B xs9B");
            brmFractalDifuso.agregarRegla("xe10A ye10A xs10A");
            brmFractalDifuso.agregarRegla("xe10A ye10B xs10B");
            //xe10B
            brmFractalDifuso.agregarRegla("xe10B ye1A xs10B");
            brmFractalDifuso.agregarRegla("xe10B ye1B xs10A");
            brmFractalDifuso.agregarRegla("xe10B ye2A xs9B");
            brmFractalDifuso.agregarRegla("xe10B ye2B xs9A");
            brmFractalDifuso.agregarRegla("xe10B ye3A xs8B");
            brmFractalDifuso.agregarRegla("xe10B ye3B xs8A");
            brmFractalDifuso.agregarRegla("xe10B ye4A xs7B");
            brmFractalDifuso.agregarRegla("xe10B ye4B xs7A");
            brmFractalDifuso.agregarRegla("xe10B ye5A xs6B");
            brmFractalDifuso.agregarRegla("xe10B ye5B xs6A");
            brmFractalDifuso.agregarRegla("xe10B ye6A xs5B");
            brmFractalDifuso.agregarRegla("xe10B ye6B xs5A");
            brmFractalDifuso.agregarRegla("xe10B ye7A xs4B");
            brmFractalDifuso.agregarRegla("xe10B ye7B xs4A");
            brmFractalDifuso.agregarRegla("xe10B ye8A xs3B");
            brmFractalDifuso.agregarRegla("xe10B ye8B xs3A");
            brmFractalDifuso.agregarRegla("xe10B ye9A xs2B");
            brmFractalDifuso.agregarRegla("xe10B ye9B xs2A");
            brmFractalDifuso.agregarRegla("xe10B ye10A xs1B");
            brmFractalDifuso.agregarRegla("xe10B ye10B xs1A");
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }

}*/

import mx.edu.uaeh.jfk.BaseReglasMamdani;
import mx.edu.uaeh.jfk.VariableMamdani;
import mx.edu.uaeh.jfk.funciones.*;


public class FractalDifuso
{
    public BaseReglasMamdani brm;//se declara la base de reglas
    public VariableMamdani inputX;
    public VariableMamdani inputY;
    public VariableMamdani outputX;
    public int itera;
    public double res = 0;

    //////////////////////////////////////////////////////////////////////
    public double calculaFractalDifuso(double X0,double Y0)
    {
        inputX.setPuntoEvaluacion(X0);// variable de entrada X
        inputY.setPuntoEvaluacion(Y0);// variable de entrada Y
        res = brm.getResultadoNew();//valor crisp resultante
        return res;
    }
	public void mostrarRegiones()
    {
                //brm.mostrarVariables();
    }
    ////////////////////////////////////////////////////////////////////////

    public FractalDifuso()
    {
        brm = new BaseReglasMamdani("Mamdani-Lopez");

        try
        {
            ///////////////////////20 zonas INPUT X/////////////////////////////////
                   inputX=new VariableMamdani("inputX",-127,127);
                   inputX.agregarClausulaAntecedente(new Sigmoidal(-1,-123),"XA");
                   inputX.agregarClausulaAntecedente(new Gaussian(-114.3,12.7),"XB");
                   inputX.agregarClausulaAntecedente(new Gaussian(-101.6,12.7),"XC");
                   inputX.agregarClausulaAntecedente(new Gaussian(-88.9,12.7),"XD");
                   inputX.agregarClausulaAntecedente(new Gaussian(-76.2,12.7),"XE");
                   inputX.agregarClausulaAntecedente(new Gaussian(-63.5,12.7),"XF");
                   inputX.agregarClausulaAntecedente(new Gaussian(50.8,12.7),"XG");
                   inputX.agregarClausulaAntecedente(new Gaussian(-38.1,12.7),"XH");
                   inputX.agregarClausulaAntecedente(new Gaussian(-25.4,12.7),"XI");
                   inputX.agregarClausulaAntecedente(new Gaussian(-12.7,12.7),"XJ");
                   inputX.agregarClausulaAntecedente(new Gaussian(0.0,12.7),"XK");
                   inputX.agregarClausulaAntecedente(new Gaussian(12.7,12.7),"XL");
                   inputX.agregarClausulaAntecedente(new Gaussian(25.4,12.7),"XM");
                   inputX.agregarClausulaAntecedente(new Gaussian(38.1,12.7),"XN");
                   inputX.agregarClausulaAntecedente(new Gaussian(50.8,12.7),"XO");
                   inputX.agregarClausulaAntecedente(new Gaussian(63.5,12.7),"XP");
                   inputX.agregarClausulaAntecedente(new Gaussian(76.2,12.7),"XQ");
                   inputX.agregarClausulaAntecedente(new Gaussian(88.9,12.7),"XR");
                   inputX.agregarClausulaAntecedente(new Gaussian(101.6,12.7),"XS");
                   inputX.agregarClausulaAntecedente(new Sigmoidal(1,123),"XT");

             /////////////////////////////////////FIN 20 ZONAS X////////////////////////////////////////

             //////////////////////////////////////10 ZONAS X///////////////////////
//                   inputX=new VariableMamdani("inputX",-127,127); //UOD
//                   inputX.agregarClausulaAntecedente(new Sigmoidal(-1,115),"XA");
//                   inputX.agregarClausulaAntecedente(new Gaussian(-76.2,25.4),"XB");
//                   inputX.agregarClausulaAntecedente(new Gaussian(-50.8,25.4),"XC");
//                   inputX.agregarClausulaAntecedente(new Gaussian(-25.4,25.4),"XD");
//                   inputX.agregarClausulaAntecedente(new Gaussian(0.0,25.4),"XE");
//                   inputX.agregarClausulaAntecedente(new Gaussian(25.4,25.4),"XF");
//                   inputX.agregarClausulaAntecedente(new Gaussian(50.8,25.4),"XG");
//                   inputX.agregarClausulaAntecedente(new Gaussian(76.2,25.4),"XH");
//                   inputX.agregarClausulaAntecedente(new Gaussian(101.6,25.4),"XI");
//                   inputX.agregarClausulaAntecedente(new Sigmoidal(1,115),"XJ");


            ///////////////////////////////FIN 10 ZONAS X///////////////////////////////////////

            ////////////////////////////10 ZONAS Y//////////////////////////////////////////////////
//                   inputY=new VariableMamdani("inputY",-127,127); //UOD
//                   inputY.agregarClausulaAntecedente(new Sigmoidal(-1,-115),"YA");
//                   inputY.agregarClausulaAntecedente(new Gaussian(-76.2,25.4),"YB");
//                   inputY.agregarClausulaAntecedente(new Gaussian(-50.8,25.4),"YC");
//                   inputY.agregarClausulaAntecedente(new Gaussian(-25.4,25.4),"YD");
//                   inputY.agregarClausulaAntecedente(new Gaussian(0.0,25.4),"YE");
//                   inputY.agregarClausulaAntecedente(new Gaussian(25.4,25.4),"YF");
//                   inputY.agregarClausulaAntecedente(new Gaussian(50.8,25.4),"YG");
//                   inputY.agregarClausulaAntecedente(new Gaussian(76.2,25.4),"YH");
//                   inputY.agregarClausulaAntecedente(new Gaussian(101.6,25.4),"YI");
//                   inputY.agregarClausulaAntecedente(new Sigmoidal(1,115),"YJ");

                ///////////////////////////////////FIN 10 Y//////////////////////////////////////////////

          //////////////////////////////////20 ZONAS Y/////////////////////////////////////////////////
                   inputY=new VariableMamdani("inputY",-127,127); //UOD
                   inputY.agregarClausulaAntecedente(new Sigmoidal(-1,-123),"YA");
                   inputY.agregarClausulaAntecedente(new Gaussian(-114.3,12.7),"YB");
                   inputY.agregarClausulaAntecedente(new Gaussian(-101.6,12.7),"YC");
                   inputY.agregarClausulaAntecedente(new Gaussian(-88.9,12.7),"YD");
                   inputY.agregarClausulaAntecedente(new Gaussian(-76.2,12.7),"YE");
                   inputY.agregarClausulaAntecedente(new Gaussian(-63.5,12.7),"YF");
                   inputY.agregarClausulaAntecedente(new Gaussian(-50.8,12.7),"YG");
                   inputY.agregarClausulaAntecedente(new Gaussian(-38.1,12.7),"YH");
                   inputY.agregarClausulaAntecedente(new Gaussian(-25.4,12.7),"YI");
                   inputY.agregarClausulaAntecedente(new Gaussian(-12.7,12.7),"YJ");
                   inputY.agregarClausulaAntecedente(new Gaussian(0.0,12.7),"YK");
                   inputY.agregarClausulaAntecedente(new Gaussian(25.4,12.7),"YL");
                   inputY.agregarClausulaAntecedente(new Gaussian(38.1,12.7),"YM");
                   inputY.agregarClausulaAntecedente(new Gaussian(50.8,12.7),"YN");
                   inputY.agregarClausulaAntecedente(new Gaussian(63.5,12.7),"YO");
                   inputY.agregarClausulaAntecedente(new Gaussian(76.2,12.7),"YP");
                   inputY.agregarClausulaAntecedente(new Gaussian(88.9,12.7),"YQ");
                   inputY.agregarClausulaAntecedente(new Gaussian(101.6,12.7),"YR");
                   inputY.agregarClausulaAntecedente(new Gaussian(114.6,12.7),"YS");
                   inputY.agregarClausulaAntecedente(new Sigmoidal(1,123),"YT");

          ///////////////////////////////////////FIN 20 ZONAS Y/////////////////////////////////////

         ///////////////////////////////////10 ZONAS DE SALIDA///////////////////////////////////////////
                   //para definir las clausulas de variable salida se usa el metODo agregarClausulaSalida
//                    outputX = new VariableMamdani("outputX", -127, 127);//UOD grades//grade es variable de salida
//                    outputX.agregarClausulaSalida(new Sigmoidal(-1,-115),"OA");
//                    outputX.agregarClausulaSalida(new Gaussian(-76.2,25.4),"OB");
//                    outputX.agregarClausulaSalida(new Gaussian(-50.8,25.4),"OC");
//                    outputX.agregarClausulaSalida(new Gaussian(-25.4,25.4),"OD");
//                    outputX.agregarClausulaSalida(new Gaussian(0.0,25.4),"OE");
//                    outputX.agregarClausulaSalida(new Gaussian(25.4,25.4),"OF");
//                    outputX.agregarClausulaSalida(new Gaussian(50.8,25.4),"OG");
//                    outputX.agregarClausulaSalida(new Gaussian(76.2,25.4),"OH");
//                    outputX.agregarClausulaSalida(new Gaussian(101.6,25.4),"OI");
//                    outputX.agregarClausulaSalida(new Sigmoidal(1,115),"OJ");
//          ////////////////////////////////////10 ZONAS SALIDA//////////////////////////////

             ///////////////////////////////////////20 ZONAS DE SALIDA/////////////////////////
                    outputX = new VariableMamdani("XImas1", -127, 127);
                    outputX.agregarClausulaSalida(new Sigmoidal(-1,-123),"OA");
                    outputX.agregarClausulaSalida(new Gaussian(-114.3,12.7),"OB");
                    outputX.agregarClausulaSalida(new Gaussian(-101.6,12.7),"OC");
                    outputX.agregarClausulaSalida(new Gaussian(-88.9,12.7),"OD");
                    outputX.agregarClausulaSalida(new Gaussian(-76.2,12.7),"OE");
                    outputX.agregarClausulaSalida(new Gaussian(-63.5,12.7),"OF");
                    outputX.agregarClausulaSalida(new Gaussian(-50.8,12.7),"OG");
                    outputX.agregarClausulaSalida(new Gaussian(-38.1,12.7),"OH");
                    outputX.agregarClausulaSalida(new Gaussian(-25.4,12.7),"OI");
                    outputX.agregarClausulaSalida(new Gaussian(-12.7,12.7),"OJ");
                    outputX.agregarClausulaSalida(new Gaussian(0.0,12.7),"OK");
                    outputX.agregarClausulaSalida(new Gaussian(12.7,12.7),"OL");
                    outputX.agregarClausulaSalida(new Gaussian(25.4,12.7),"OM");
                    outputX.agregarClausulaSalida(new Gaussian(38.1,12.7),"ON");
                    outputX.agregarClausulaSalida(new Gaussian(50.8,12.7),"OO");
                    outputX.agregarClausulaSalida(new Gaussian(63.5,12.7),"OP");
                    outputX.agregarClausulaSalida(new Gaussian(76.2,12.7),"OQ");
                    outputX.agregarClausulaSalida(new Gaussian(88.9,12.7),"OR");
                    outputX.agregarClausulaSalida(new Gaussian(101.6,12.7),"OS");
                    outputX.agregarClausulaSalida(new Sigmoidal(1,123),"OT");

             ///////////////////////////////////////20 ZONAS DE SALIDA FIN/////////////////////
            ///////////////////////////////////////////reglas XA/////////////////////////////////////
                   brm.setVariables(inputX, inputY, outputX);

                   brm.agregarRegla("XA YA  OA ");
                   brm.agregarRegla("XA YB  OB ");
                   brm.agregarRegla("XA YC  OC ");
                   brm.agregarRegla("XA YD  OD ");
                   brm.agregarRegla("XA YE  OE ");
                   brm.agregarRegla("XA YF  OF ");
                   brm.agregarRegla("XA YG  OG ");
                   brm.agregarRegla("XA YH  OH ");
                   brm.agregarRegla("XA YI  OI ");
                   brm.agregarRegla("XA YJ  OJ ");

                   brm.agregarRegla("XA YK  OT ");
                   brm.agregarRegla("XA YL  OS ");
                   brm.agregarRegla("XA YM  OR ");
                   brm.agregarRegla("XA YN  OQ ");
                   brm.agregarRegla("XA YO  OP ");
                   brm.agregarRegla("XA YP  OO ");
                   brm.agregarRegla("XA YQ  ON ");
                   brm.agregarRegla("XA YR  OM ");
                   brm.agregarRegla("XA YS  OL ");
                   brm.agregarRegla("XA YT  OK ");
               ///////////////////////REGLAS XB////////////////////////////////
//                   brm.agregarRegla("XB YA  OA ");
//                   brm.agregarRegla("XB YB  OB ");
//                   brm.agregarRegla("XB YC  OC ");
//                   brm.agregarRegla("XB YD  OD ");
//                   brm.agregarRegla("XB YE  OE ");
//                   brm.agregarRegla("XB YF  OF ");
//                   brm.agregarRegla("XB YG  OG ");
//                   brm.agregarRegla("XB YH  OH ");
//                   brm.agregarRegla("XB YI  OI ");
//                   brm.agregarRegla("XB YJ  OJ ");

                   brm.agregarRegla("XB YA  OJ ");
                   brm.agregarRegla("XB YB  OI ");
                   brm.agregarRegla("XB YC  OH ");
                   brm.agregarRegla("XB YD  OG ");
                   brm.agregarRegla("XB YE  OF ");
                   brm.agregarRegla("XB YF  OE ");
                   brm.agregarRegla("XB YG  OD ");
                   brm.agregarRegla("XB YH  OC ");
                   brm.agregarRegla("XB YI  OB ");
                   brm.agregarRegla("XB YJ  OA ");
                   
                   brm.agregarRegla("XB YK  OT ");
                   brm.agregarRegla("XB YL  OS ");
                   brm.agregarRegla("XB YM  OR ");
                   brm.agregarRegla("XB YN  OQ ");
                   brm.agregarRegla("XB YO  OP ");
                   brm.agregarRegla("XB YP  OO ");
                   brm.agregarRegla("XB YQ  ON ");
                   brm.agregarRegla("XB YR  OM ");
                   brm.agregarRegla("XB YS  OL ");
                   brm.agregarRegla("XB YT  OK ");

               ////////////////////////REGLAS XC///////////////////////////////

                   brm.agregarRegla("XC YA  OA ");
                   brm.agregarRegla("XC YB  OB ");
                   brm.agregarRegla("XC YC  OC ");
                   brm.agregarRegla("XC YD  OD ");
                   brm.agregarRegla("XC YE  OE ");
                   brm.agregarRegla("XC YF  OF ");
                   brm.agregarRegla("XC YG  OG ");
                   brm.agregarRegla("XC YH  OH ");
                   brm.agregarRegla("XC YI  OI ");
                   brm.agregarRegla("XC YJ  OJ ");

                   brm.agregarRegla("XC YK  OT ");
                   brm.agregarRegla("XC YL  OS ");
                   brm.agregarRegla("XC YM  OR ");
                   brm.agregarRegla("XC YN  OQ ");
                   brm.agregarRegla("XC YO  OP ");
                   brm.agregarRegla("XC YP  OO ");
                   brm.agregarRegla("XC YQ  ON ");
                   brm.agregarRegla("XC YR  OM ");
                   brm.agregarRegla("XC YS  OL ");
                   brm.agregarRegla("XC YT  OK ");
               //////////////////////////REGLAS D/////////////////////////////

//                   brm.agregarRegla("XD YA  OA ");
//                   brm.agregarRegla("XD YB  OB ");
//                   brm.agregarRegla("XD YC  OC ");
//                   brm.agregarRegla("XD YD  OD ");
//                   brm.agregarRegla("XD YE  OE ");
//                   brm.agregarRegla("XD YF  OF ");
//                   brm.agregarRegla("XD YG  OG ");
//                   brm.agregarRegla("XD YH  OH ");
//                   brm.agregarRegla("XD YI  OI ");
//                   brm.agregarRegla("XD YJ  OJ ");

                   brm.agregarRegla("XD YA  OJ ");
                   brm.agregarRegla("XD YB  OI ");
                   brm.agregarRegla("XD YC  OH ");
                   brm.agregarRegla("XD YD  OG ");
                   brm.agregarRegla("XD YE  OF ");
                   brm.agregarRegla("XD YF  OE ");
                   brm.agregarRegla("XD YG  OD ");
                   brm.agregarRegla("XD YH  OC ");
                   brm.agregarRegla("XD YI  OB ");
                   brm.agregarRegla("XD YJ  OA ");

                   brm.agregarRegla("XD YK  OT ");
                   brm.agregarRegla("XD YL  OS ");
                   brm.agregarRegla("XD YM  OR ");
                   brm.agregarRegla("XD YN  OQ ");
                   brm.agregarRegla("XD YO  OP ");
                   brm.agregarRegla("XD YP  OO ");
                   brm.agregarRegla("XD YQ  ON ");
                   brm.agregarRegla("XD YR  OM ");
                   brm.agregarRegla("XD YS  OL ");
                   brm.agregarRegla("XD YT  OK ");
               ////////////////////////REGLAS E///////////////////////////////
                   brm.agregarRegla("XE YA  OA ");
                   brm.agregarRegla("XE YB  OB ");
                   brm.agregarRegla("XE YC  OC ");
                   brm.agregarRegla("XE YD  OD ");
                   brm.agregarRegla("XE YE  OE ");
                   brm.agregarRegla("XE YF  OF ");
                   brm.agregarRegla("XE YG  OG ");
                   brm.agregarRegla("XE YH  OH ");
                   brm.agregarRegla("XE YI  OI ");
                   brm.agregarRegla("XE YJ  OJ ");

//                   brm.agregarRegla("XE YK  OT ");
//                   brm.agregarRegla("XE YL  OS ");
//                   brm.agregarRegla("XE YM  OR ");
//                   brm.agregarRegla("XE YN  OQ ");
//                   brm.agregarRegla("XE YO  OP ");
//                   brm.agregarRegla("XE YP  OO ");
//                   brm.agregarRegla("XE YQ  ON ");
//                   brm.agregarRegla("XE YR  OM ");
//                   brm.agregarRegla("XE YS  OL ");
//                   brm.agregarRegla("XE YT  OK ");
               /////////////////////////REGLAS F//////////////////////////////

//                   brm.agregarRegla("XF YA  OA ");
//                   brm.agregarRegla("XF YB  OB ");
//                   brm.agregarRegla("XF YC  OC ");
//                   brm.agregarRegla("XF YD  OD ");
//                   brm.agregarRegla("XF YE  OE ");
//                   brm.agregarRegla("XF YF  OF ");
//                   brm.agregarRegla("XF YG  OG ");
//                   brm.agregarRegla("XF YH  OH ");
//                   brm.agregarRegla("XF YI  OI ");
//                   brm.agregarRegla("XF YJ  OJ ");

                    brm.agregarRegla("XF YA  OJ ");
                   brm.agregarRegla("XF YB  OI ");
                   brm.agregarRegla("XF YC  OH ");
                   brm.agregarRegla("XF YD  OG ");
                   brm.agregarRegla("XF YE  OF ");
                   brm.agregarRegla("XF YF  OE ");
                   brm.agregarRegla("XF YG  OD ");
                   brm.agregarRegla("XF YH  OC ");
                   brm.agregarRegla("XF YI  OB ");
                   brm.agregarRegla("XF YJ  OA ");

//                   brm.agregarRegla("XF YK  OT ");
//                   brm.agregarRegla("XF YL  OS ");
//                   brm.agregarRegla("XF YM  OR ");
//                   brm.agregarRegla("XF YN  OQ ");
//                   brm.agregarRegla("XF YO  OP ");
//                   brm.agregarRegla("XF YP  OO ");
//                   brm.agregarRegla("XF YQ  ON ");
//                   brm.agregarRegla("XF YR  OM ");
//                   brm.agregarRegla("XF YS  OL ");
//                   brm.agregarRegla("XF YT  OK ");
               /////////////////////////REGLAS G//////////////////////////////

                   brm.agregarRegla("XG YA  OA ");
                   brm.agregarRegla("XG YB  OB ");
                   brm.agregarRegla("XG YC  OC ");
                   brm.agregarRegla("XG YD  OD ");
                   brm.agregarRegla("XG YE  OE ");
                   brm.agregarRegla("XG YF  OF ");
                   brm.agregarRegla("XG YG  OG ");
                   brm.agregarRegla("XG YH  OH ");
                   brm.agregarRegla("XG YI  OI ");
                   brm.agregarRegla("XG YJ  OJ ");

//                   brm.agregarRegla("XG YK  OT ");
//                   brm.agregarRegla("XG YL  OS ");
//                   brm.agregarRegla("XG YM  OR ");
//                   brm.agregarRegla("XG YN  OQ ");
//                   brm.agregarRegla("XG YO  OP ");
//                   brm.agregarRegla("XG YP  OO ");
//                   brm.agregarRegla("XG YQ  ON ");
//                   brm.agregarRegla("XG YR  OM ");
//                   brm.agregarRegla("XG YS  OL ");
//                   brm.agregarRegla("XG YT  OK ");
               /////////////////////////REGLAS H//////////////////////////////

//                   brm.agregarRegla("XH YA  OA ");
//                   brm.agregarRegla("XH YB  OB ");
//                   brm.agregarRegla("XH YC  OC ");
//                   brm.agregarRegla("XH YD  OD ");
//                   brm.agregarRegla("XH YE  OE ");
//                   brm.agregarRegla("XH YF  OF ");
//                   brm.agregarRegla("XH YG  OG ");
//                   brm.agregarRegla("XH YH  OH ");
//                   brm.agregarRegla("XH YI  OI ");
//                   brm.agregarRegla("XH YJ  OJ ");

                   brm.agregarRegla("XH YA  OJ ");
                   brm.agregarRegla("XH YB  OI ");
                   brm.agregarRegla("XH YC  OH ");
                   brm.agregarRegla("XH YD  OG ");
                   brm.agregarRegla("XH YE  OF ");
                   brm.agregarRegla("XH YF  OE ");
                   brm.agregarRegla("XH YG  OD ");
                   brm.agregarRegla("XH YH  OC ");
                   brm.agregarRegla("XH YI  OB ");
                   brm.agregarRegla("XH YJ  OA ");

//                   brm.agregarRegla("XH YK  OT ");
//                   brm.agregarRegla("XH YL  OS ");
//                   brm.agregarRegla("XH YM  OR ");
//                   brm.agregarRegla("XH YN  OQ ");
//                   brm.agregarRegla("XH YO  OP ");
//                   brm.agregarRegla("XH YP  OO ");
//                   brm.agregarRegla("XH YQ  ON ");
//                   brm.agregarRegla("XH YR  OM ");
//                   brm.agregarRegla("XH YS  OL ");
//                   brm.agregarRegla("XH YT  OK ");

               /////////////////////////REGLAS I//////////////////////////////

                   brm.agregarRegla("XI YA  OA ");
                   brm.agregarRegla("XI YB  OB ");
                   brm.agregarRegla("XI YC  OC ");
                   brm.agregarRegla("XI YD  OD ");
                   brm.agregarRegla("XI YE  OE ");
                   brm.agregarRegla("XI YF  OF ");
                   brm.agregarRegla("XI YG  OG ");
                   brm.agregarRegla("XI YH  OH ");
                   brm.agregarRegla("XI YI  OI ");
                   brm.agregarRegla("XI YJ  OJ ");

//                   brm.agregarRegla("XI YK  OT ");
//                   brm.agregarRegla("XI YL  OS ");
//                   brm.agregarRegla("XI YM  OR ");
//                   brm.agregarRegla("XI YN  OQ ");
//                   brm.agregarRegla("XI YO  OP ");
//                   brm.agregarRegla("XI YP  OO ");
//                   brm.agregarRegla("XI YQ  ON ");
//                   brm.agregarRegla("XI YR  OM ");
//                   brm.agregarRegla("XI YS  OL ");
//                   brm.agregarRegla("XI YT  OK ");
               ////////////////////////REGLAS J///////////////////////////////

//                   brm.agregarRegla("XJ YA  OA ");
//                   brm.agregarRegla("XJ YB  OB ");
//                   brm.agregarRegla("XJ YC  OC ");
//                   brm.agregarRegla("XJ YD  OD ");
//                   brm.agregarRegla("XJ YE  OE ");
//                   brm.agregarRegla("XJ YF  OF ");
//                   brm.agregarRegla("XJ YG  OG ");
//                   brm.agregarRegla("XJ YH  OH ");
//                   brm.agregarRegla("XJ YI  OI ");
//                   brm.agregarRegla("XJ YJ  OJ ");

                   brm.agregarRegla("XJ YA  OJ ");
                   brm.agregarRegla("XJ YB  OI ");
                   brm.agregarRegla("XJ YC  OH ");
                   brm.agregarRegla("XJ YD  OG ");
                   brm.agregarRegla("XJ YE  OF ");
                   brm.agregarRegla("XJ YF  OE ");
                   brm.agregarRegla("XJ YG  OD ");
                   brm.agregarRegla("XJ YH  OC ");
                   brm.agregarRegla("XJ YI  OB ");
                   brm.agregarRegla("XJ YJ  OA ");

                   brm.agregarRegla("XJ YK  OT ");
                   brm.agregarRegla("XJ YL  OS ");
                   brm.agregarRegla("XJ YM  OR ");
                   brm.agregarRegla("XJ YN  OQ ");
                   brm.agregarRegla("XJ YO  OP ");
                   brm.agregarRegla("XJ YP  OO ");
                   brm.agregarRegla("XJ YQ  ON ");
                   brm.agregarRegla("XJ YR  OM ");
                   brm.agregarRegla("XJ YS  OL ");
                   brm.agregarRegla("XJ YT  OK ");
               //////////////////////REGLAS K///////////////////////////////
                   brm.agregarRegla("XK YA  OA ");
                   brm.agregarRegla("XK YB  OB ");
                   brm.agregarRegla("XK YC  OC ");
                   brm.agregarRegla("XK YD  OD ");
                   brm.agregarRegla("XK YE  OE ");
                   brm.agregarRegla("XK YF  OF ");
                   brm.agregarRegla("XK YG  OG ");
                   brm.agregarRegla("XK YH  OH ");
                   brm.agregarRegla("XK YI  OI ");
                   brm.agregarRegla("XK YJ  OJ ");

                   brm.agregarRegla("XK YK  OT ");
                   brm.agregarRegla("XK YL  OS ");
                   brm.agregarRegla("XK YM  OR ");
                   brm.agregarRegla("XK YN  OQ ");
                   brm.agregarRegla("XK YO  OP ");
                   brm.agregarRegla("XK YP  OO ");
                   brm.agregarRegla("XK YQ  ON ");
                   brm.agregarRegla("XK YR  OM ");
                   brm.agregarRegla("XK YS  OL ");
                   brm.agregarRegla("XK YT  OK ");
               ///////////////////////REGLAS XL////////////////////////////////
                   brm.agregarRegla("XL YA  OA ");
                   brm.agregarRegla("XL YB  OB ");
                   brm.agregarRegla("XL YC  OC ");
                   brm.agregarRegla("XL YD  OD ");
                   brm.agregarRegla("XL YE  OE ");
                   brm.agregarRegla("XL YF  OF ");
                   brm.agregarRegla("XL YG  OG ");
                   brm.agregarRegla("XL YH  OH ");
                   brm.agregarRegla("XL YI  OI ");
                   brm.agregarRegla("XL YJ  OJ ");

                   brm.agregarRegla("XL YK  OT ");
                   brm.agregarRegla("XL YL  OS ");
                   brm.agregarRegla("XL YM  OR ");
                   brm.agregarRegla("XL YN  OQ ");
                   brm.agregarRegla("XL YO  OP ");
                   brm.agregarRegla("XL YP  OO ");
                   brm.agregarRegla("XL YQ  ON ");
                   brm.agregarRegla("XL YR  OM ");
                   brm.agregarRegla("XL YS  OL ");
                   brm.agregarRegla("XL YT  OK ");

               ////////////////////////REGLAS XM///////////////////////////////

                   brm.agregarRegla("XM YA  OA ");
                   brm.agregarRegla("XM YB  OB ");
                   brm.agregarRegla("XM YC  OC ");
                   brm.agregarRegla("XM YD  OD ");
                   brm.agregarRegla("XM YE  OE ");
                   brm.agregarRegla("XM YF  OF ");
                   brm.agregarRegla("XM YG  OG ");
                   brm.agregarRegla("XM YH  OH ");
                   brm.agregarRegla("XM YI  OI ");
                   brm.agregarRegla("XM YJ  OJ ");

                   brm.agregarRegla("XM YK  OT ");
                   brm.agregarRegla("XM YL  OS ");
                   brm.agregarRegla("XM YM  OR ");
                   brm.agregarRegla("XM YN  OQ ");
                   brm.agregarRegla("XM YO  OP ");
                   brm.agregarRegla("XM YP  OO ");
                   brm.agregarRegla("XM YQ  ON ");
                   brm.agregarRegla("XM YR  OM ");
                   brm.agregarRegla("XM YS  OL ");
                   brm.agregarRegla("XM YT  OK ");
               //////////////////////////REGLAS N/////////////////////////////

                   brm.agregarRegla("XN YA  OA ");
                   brm.agregarRegla("XN YB  OB ");
                   brm.agregarRegla("XN YC  OC ");
                   brm.agregarRegla("XN YD  OD ");
                   brm.agregarRegla("XN YE  OE ");
                   brm.agregarRegla("XN YF  OF ");
                   brm.agregarRegla("XN YG  OG ");
                   brm.agregarRegla("XN YH  OH ");
                   brm.agregarRegla("XN YI  OI ");
                   brm.agregarRegla("XN YJ  OJ ");

                   brm.agregarRegla("XN YK  OT ");
                   brm.agregarRegla("XN YL  OS ");
                   brm.agregarRegla("XN YM  OR ");
                   brm.agregarRegla("XN YN  OQ ");
                   brm.agregarRegla("XN YO  OP ");
                   brm.agregarRegla("XN YP  OO ");
                   brm.agregarRegla("XN YQ  ON ");
                   brm.agregarRegla("XN YR  OM ");
                   brm.agregarRegla("XN YS  OL ");
                   brm.agregarRegla("XN YT  OK ");
               ////////////////////////REGLAS XO///////////////////////////////

                   brm.agregarRegla("XO YA  OA ");
                   brm.agregarRegla("XO YB  OB ");
                   brm.agregarRegla("XO YC  OC ");
                   brm.agregarRegla("XO YD  OD ");
                   brm.agregarRegla("XO YE  OE ");
                   brm.agregarRegla("XO YF  OF ");
                   brm.agregarRegla("XO YG  OG ");
                   brm.agregarRegla("XO YH  OH ");
                   brm.agregarRegla("XO YI  OI ");
                   brm.agregarRegla("XO YJ  OJ ");

                   brm.agregarRegla("XO YK  OT ");
                   brm.agregarRegla("XO YL  OS ");
                   brm.agregarRegla("XO YM  OR ");
                   brm.agregarRegla("XO YN  OQ ");
                   brm.agregarRegla("XO YO  OP ");
                   brm.agregarRegla("XO YP  OO ");
                   brm.agregarRegla("XO YQ  ON ");
                   brm.agregarRegla("XO YR  OM ");
                   brm.agregarRegla("XO YS  OL ");
                   brm.agregarRegla("XO YT  OK ");
               /////////////////////////REGLAS XP//////////////////////////////

                   brm.agregarRegla("XP YA  OA ");
                   brm.agregarRegla("XP YB  OB ");
                   brm.agregarRegla("XP YC  OC ");
                   brm.agregarRegla("XP YD  OD ");
                   brm.agregarRegla("XP YE  OE ");
                   brm.agregarRegla("XP YF  OF ");
                   brm.agregarRegla("XP YG  OG ");
                   brm.agregarRegla("XP YH  OH ");
                   brm.agregarRegla("XP YI  OI ");
                   brm.agregarRegla("XP YJ  OJ ");

                   brm.agregarRegla("XP YK  OT ");
                   brm.agregarRegla("XP YL  OS ");
                   brm.agregarRegla("XP YM  OR ");
                   brm.agregarRegla("XP YN  OQ ");
                   brm.agregarRegla("XP YO  OP ");
                   brm.agregarRegla("XP YP  OO ");
                   brm.agregarRegla("XP YQ  ON ");
                   brm.agregarRegla("XP YR  OM ");
                   brm.agregarRegla("XP YS  OL ");
                   brm.agregarRegla("XP YT  OK ");
               /////////////////////////REGLAS Q//////////////////////////////

                   brm.agregarRegla("XQ YA  OA ");
                   brm.agregarRegla("XQ YB  OB ");
                   brm.agregarRegla("XQ YC  OC ");
                   brm.agregarRegla("XQ YD  OD ");
                   brm.agregarRegla("XQ YE  OE ");
                   brm.agregarRegla("XQ YF  OF ");
                   brm.agregarRegla("XQ YG  OG ");
                   brm.agregarRegla("XQ YH  OH ");
                   brm.agregarRegla("XQ YI  OI ");
                   brm.agregarRegla("XQ YJ  OJ ");

                   brm.agregarRegla("XQ YK  OT ");
                   brm.agregarRegla("XQ YL  OS ");
                   brm.agregarRegla("XQ YM  OR ");
                   brm.agregarRegla("XQ YN  OQ ");
                   brm.agregarRegla("XQ YO  OP ");
                   brm.agregarRegla("XQ YP  OO ");
                   brm.agregarRegla("XQ YQ  ON ");
                   brm.agregarRegla("XQ YR  OM ");
                   brm.agregarRegla("XQ YS  OL ");
                   brm.agregarRegla("XQ YT  OK ");
               /////////////////////////REGLAS R//////////////////////////////

                   brm.agregarRegla("XR YA  OA ");
                   brm.agregarRegla("XR YB  OB ");
                   brm.agregarRegla("XR YC  OC ");
                   brm.agregarRegla("XR YD  OD ");
                   brm.agregarRegla("XR YE  OE ");
                   brm.agregarRegla("XR YF  OF ");
                   brm.agregarRegla("XR YG  OG ");
                   brm.agregarRegla("XR YH  OH ");
                   brm.agregarRegla("XR YI  OI ");
                   brm.agregarRegla("XR YJ  OJ ");

                   brm.agregarRegla("XR YK  OT ");
                   brm.agregarRegla("XR YL  OS ");
                   brm.agregarRegla("XR YM  OR ");
                   brm.agregarRegla("XR YN  OQ ");
                   brm.agregarRegla("XR YO  OP ");
                   brm.agregarRegla("XR YP  OO ");
                   brm.agregarRegla("XR YQ  ON ");
                   brm.agregarRegla("XR YR  OM ");
                   brm.agregarRegla("XR YS  OL ");
                   brm.agregarRegla("XR YT  OK ");

               /////////////////////////REGLAS S//////////////////////////////

                   brm.agregarRegla("XS YA  OA ");
                   brm.agregarRegla("XS YB  OB ");
                   brm.agregarRegla("XS YC  OC ");
                   brm.agregarRegla("XS YD  OD ");
                   brm.agregarRegla("XS YE  OE ");
                   brm.agregarRegla("XS YF  OF ");
                   brm.agregarRegla("XS YG  OG ");
                   brm.agregarRegla("XS YH  OH ");
                   brm.agregarRegla("XS YI  OI ");
                   brm.agregarRegla("XS YJ  OJ ");

                   brm.agregarRegla("XS YK  OT ");
                   brm.agregarRegla("XS YL  OS ");
                   brm.agregarRegla("XS YM  OR ");
                   brm.agregarRegla("XS YN  OQ ");
                   brm.agregarRegla("XS YO  OP ");
                   brm.agregarRegla("XS YP  OO ");
                   brm.agregarRegla("XS YQ  ON ");
                   brm.agregarRegla("XS YR  OM ");
                   brm.agregarRegla("XS YS  OL ");
                   brm.agregarRegla("XS YT  OK ");
               ////////////////////////REGLAS T///////////////////////////////

                   brm.agregarRegla("XT YA  OA ");
                   brm.agregarRegla("XT YB  OB ");
                   brm.agregarRegla("XT YC  OC ");
                   brm.agregarRegla("XT YD  OD ");
                   brm.agregarRegla("XT YE  OE ");
                   brm.agregarRegla("XT YF  OF ");
                   brm.agregarRegla("XT YG  OG ");
                   brm.agregarRegla("XT YH  OH ");
                   brm.agregarRegla("XT YI  OI ");
                   brm.agregarRegla("XT YJ  OJ ");

                   brm.agregarRegla("XT YK  OT ");
                   brm.agregarRegla("XT YL  OS ");
                   brm.agregarRegla("XT YM  OR ");
                   brm.agregarRegla("XT YN  OQ ");
                   brm.agregarRegla("XT YO  OP ");
                   brm.agregarRegla("XT YP  OO ");
                   brm.agregarRegla("XT YQ  ON ");
                   brm.agregarRegla("XT YR  OM ");
                   brm.agregarRegla("XT YS  OL ");
                   brm.agregarRegla("XT YT  OK ");
//                /////////////FIN DE REGLAS//////////////////////            
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

