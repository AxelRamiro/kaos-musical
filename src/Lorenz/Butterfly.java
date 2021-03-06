/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Lorenz;

/**
 *
 * @author OMAR
 */
public class Butterfly {
 

    public static double dx(double x, double y, double z) {
        return -10*(x - y);
    }

    public static double dy(double x, double y, double z) {
        return -x*z + 28*x - y;
    }

    public static double dz(double x, double y, double z) {
        return x*y - 8*z/3;
    }


    public static void main(String[] args) {
        double x = 0.0, y = 20.0, z = 30.0;
        double dt = 0.001;

        //StdDraw.clear(StdDraw.LIGHT_GRAY);
        //StdDraw.setXscale(-25, 25);
        //StdDraw.setYscale(  0, 50);

        // Use Euler's method to numerically solve ODE
        for (int i = 0; i < 40; i++) {

            // original system
            double xnew = x + dx(x, y, z) * dt;
            double ynew = y + dy(x, y, z) * dt;
            double znew = z + dz(x, y, z) * dt;
            x = xnew;
            y = ynew;
            z = znew;
            
            System.out.println(i + " " + xnew + " " + ynew + " " + znew);
            //StdDraw.setPenColor(StdDraw.BLUE);
            //StdDraw.point(x, z);

            // wait 5 iterates to redraw
            //if (i % 5 == 0) StdDraw.show(10);
        }
    }



}
