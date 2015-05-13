/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MamdaniLopez;

/**
 *
 * @author Omar
 */
public class Sigmoide
{
    public static double calculaSigmoide(double x)
    {
        double resp = 0;
        resp = 1/(1+Math.exp(-(x)));
        return resp;
    }
}
