package ObjeAux;

import java.util.ArrayList;

public class calculo_octava {

    public ArrayList calculoPosision(ArrayList arreglo) {
        ArrayList cal = new ArrayList();
        try {
            double total = 0;
            double res = 0;
            double pot = 0;
            double minimo = 0;

            for (int i = 0; i < arreglo.size(); i++) {

                if ((Double.parseDouble((String) arreglo.get(i)) >= 0) && (Double.parseDouble((String) arreglo.get(i)) < 12)) {
                    cal.add("C0");
                }

                if ((Double.parseDouble((String) arreglo.get(i)) >= 12) && (Double.parseDouble((String) arreglo.get(i)) < 24)) {
                    cal.add("C1");
                }

                if ((Double.parseDouble((String) arreglo.get(i)) >= 24) && (Double.parseDouble((String) arreglo.get(i)) < 36)) {
                    cal.add("C2");
                }
                if ((Double.parseDouble((String) arreglo.get(i)) >= 36) && (Double.parseDouble((String) arreglo.get(i)) < 48)) {
                    cal.add("C3");
                }

                if ((Double.parseDouble((String) arreglo.get(i)) >= 48) && (Double.parseDouble((String) arreglo.get(i)) < 60)) {
                    cal.add("C4");
                }
                if ((Double.parseDouble((String) arreglo.get(i)) >= 60) && (Double.parseDouble((String) arreglo.get(i)) < 72)) {
                    cal.add("C5");
                }
                if ((Double.parseDouble((String) arreglo.get(i)) >= 72) && (Double.parseDouble((String) arreglo.get(i)) < 84)) {
                    cal.add("C6");
                }
                if ((Double.parseDouble((String) arreglo.get(i)) >= 84) && (Double.parseDouble((String) arreglo.get(i)) < 95)) {
                    cal.add("C7");
                }
                if ((Double.parseDouble((String) arreglo.get(i)) >= 95) && (Double.parseDouble((String) arreglo.get(i)) < 108)) {
                    cal.add("C8");
                }
                if ((Double.parseDouble((String) arreglo.get(i)) >= 108) && (Double.parseDouble((String) arreglo.get(i)) < 120)) {
                    cal.add("C9");
                }
                if ((Double.parseDouble((String) arreglo.get(i)) >= 120) && (Double.parseDouble((String) arreglo.get(i)) <= 127)) {
                    cal.add("G9");
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return cal;
    }

    public ArrayList fusionOctava(String[] referencia) {
        String sumaC0 = "";
        String sumaC1 = "";
        String sumaC2 = "";
        String sumaC3 = "";
        String sumaC4 = "";
        String sumaC5 = "";
        String sumaC6 = "";
        String sumaC7 = "";
        String sumaC8 = "";
        String sumaC9 = "";
        String sumaG9 = "";

        ArrayList fusion = new ArrayList();
        try {
            // for(int i=0;i<referencia.length;i++)
            for (int i = 0; i < referencia.length; i++) {
                if ("C0".equals(referencia[i])) {
                    sumaC0 = sumaC0 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
                if ("C1".equals(referencia[i])) {
                    sumaC1 = sumaC1 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
                if ("C2".equals(referencia[i])) {
                    sumaC2 = sumaC2 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
                if ("C3".equals(referencia[i])) {
                    sumaC3 = sumaC3 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
                if ("C4".equals(referencia[i])) {
                    sumaC4 = sumaC4 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
                if ("C5".equals(referencia[i])) {
                    sumaC5 = sumaC5 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
                if ("C6".equals(referencia[i])) {
                    sumaC6 = sumaC6 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
                if ("C7".equals(referencia[i])) {
                    sumaC7 = sumaC7 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
                if ("C8".equals(referencia[i])) {
                    sumaC8 = sumaC8 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
                if ("C9".equals(referencia[i])) {
                    sumaC9 = sumaC9 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
                if ("G9".equals(referencia[i])) {
                    sumaG9 = sumaG9 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
            }

            if (sumaC0 != "") {
                fusion.add(sumaC0);
            }
            if (sumaC1 != "") {
                fusion.add(sumaC1);
            }
            if (sumaC2 != "") {
                fusion.add(sumaC2);
            }
            if (sumaC3 != "") {
                fusion.add(sumaC3);
            }
            if (sumaC4 != "") {
                fusion.add(sumaC4);
            }
            if (sumaC5 != "") {
                fusion.add(sumaC5);
            }
            if (sumaC6 != "") {
                fusion.add(sumaC6);
            }
            if (sumaC7 != "") {
                fusion.add(sumaC7);
            }
            if (sumaC8 != "") {
                fusion.add(sumaC8);
            }
            if (sumaC9 != "") {
                fusion.add(sumaC9);
            }
            if (sumaG9 != "") {
                fusion.add(sumaG9);
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

//////////////////// ******   FUSIÓN DE CÚMULOS ******* //////////////////////
/////////////////// ****** /////////////////// ******* //////////////////////     
    public ArrayList fusionOctavaPMC(String[] referencia, ArrayList centroide) {
        String sumaC0 = "";
        String sumaC1 = "";
        String sumaC2 = "";
        String sumaC3 = "";
        String sumaC4 = "";
        String sumaC5 = "";
        String sumaC6 = "";
        String sumaC7 = "";
        String sumaC8 = "";
        String sumaC9 = "";
        String sumaG9 = "";

        double sumaCentroideC0 = 0;
        double sumaCentroideC1 = 0;
        double sumaCentroideC2 = 0;
        double sumaCentroideC3 = 0;
        double sumaCentroideC4 = 0;
        double sumaCentroideC5 = 0;
        double sumaCentroideC6 = 0;
        double sumaCentroideC7 = 0;
        double sumaCentroideC8 = 0;
        double sumaCentroideC9 = 0;
        double sumaCentroideG9 = 0;

        double banC0 = 0;
        double banC1 = 0;
        double banC2 = 0;
        double banC3 = 0;
        double banC4 = 0;
        double banC5 = 0;
        double banC6 = 0;
        double banC7 = 0;
        double banC8 = 0;
        double banC9 = 0;
        double banG9 = 0;

        ArrayList fusion = new ArrayList();
        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {

                    if ("C0".equals(referencia[i])) {
                        banC0 = banC0 + 1;
                        sumaCentroideC0 = sumaCentroideC0 + Double.parseDouble((String) centroide.get(i));
                        sumaC0 = sumaC0 + "[" + i + "]";
                    }

                    if ("C1".equals(referencia[i])) {
                        banC1 = banC1 + 1;
                        sumaCentroideC1 = sumaCentroideC1 + Double.parseDouble((String) centroide.get(i));
                        sumaC1 = sumaC1 + "[" + i + "]";
                    }

                    if ("C2".equals(referencia[i])) {
                        banC2 = banC2 + 1;
                        sumaCentroideC2 = sumaCentroideC2 + Double.parseDouble((String) centroide.get(i));
                        sumaC2 = sumaC2 + "[" + i + "]";
                    }
                    if ("C3".equals(referencia[i])) {
                        banC3 = banC3 + 1;
                        sumaCentroideC3 = sumaCentroideC3 + Double.parseDouble((String) centroide.get(i));
                        sumaC3 = sumaC3 + "[" + i + "]";
                    }
                    if ("C4".equals(referencia[i])) {
                        banC4 = banC4 + 1;
                        sumaCentroideC4 = sumaCentroideC4 + Double.parseDouble((String) centroide.get(i));
                        sumaC4 = sumaC4 + "[" + i + "]";
                    }
                    if ("C5".equals(referencia[i])) {
                        banC5 = banC5 + 1;
                        sumaCentroideC5 = sumaCentroideC5 + Double.parseDouble((String) centroide.get(i));
                        sumaC5 = sumaC5 + "[" + i + "]";
                    }

                    if ("C6".equals(referencia[i])) {
                        banC6 = banC6 + 1;
                        sumaCentroideC6 = sumaCentroideC6 + Double.parseDouble((String) centroide.get(i));
                        sumaC6 = sumaC6 + "[" + i + "]";
                    }
                    if ("C7".equals(referencia[i])) {
                        banC7 = banC7 + 1;
                        sumaCentroideC7 = sumaCentroideC7 + Double.parseDouble((String) centroide.get(i));
                        sumaC7 = sumaC7 + "[" + i + "]";
                    }
                    if ("C8".equals(referencia[i])) {
                        banC8 = banC8 + 1;
                        sumaCentroideC8 = sumaCentroideC8 + Double.parseDouble((String) centroide.get(i));
                        sumaC8 = sumaC8 + "[" + i + "]";
                    }
                    if ("C9".equals(referencia[i])) {
                        banC9 = banC9 + 1;
                        sumaCentroideC9 = sumaCentroideC9 + Double.parseDouble((String) centroide.get(i));
                        sumaC9 = sumaC9 + "[" + i + "]";
                    }
                    if ("G9".equals(referencia[i])) {
                        banG9 = banG9 + 1;
                        sumaCentroideG9 = sumaCentroideG9 + Double.parseDouble((String) centroide.get(i));
                        sumaG9 = sumaG9 + "[" + i + "]";
                    }

                } // fin else 
            }

            if (sumaC0 != "") {
                fusion.add(sumaC0 + " PA Centroide " + (sumaCentroideC0 / banC0));
            }

            if (sumaC1 != "") {
                fusion.add(sumaC1 + " PA Centroide " + (sumaCentroideC1 / banC1));
            }

            if (sumaC2 != "") {
                fusion.add(sumaC2 + " PA Centroide " + (sumaCentroideC2 / banC2));
            }

            if (sumaC3 != "") {
                fusion.add(sumaC3 + " PA Centroide " + (sumaCentroideC3 / banC3));
            }

            if (sumaC4 != "") {
                fusion.add(sumaC4 + " PA Centroide " + (sumaCentroideC4 / banC4));
            }

            if (sumaC5 != "") {
                fusion.add(sumaC5 + " PA Centroide " + (sumaCentroideC5 / banC5));
            }
            if (sumaC6 != "") {
                fusion.add(sumaC6 + " PA Centroide " + (sumaCentroideC6 / banC6));
            }
            if (sumaC7 != "") {
                fusion.add(sumaC7 + " PA Centroide " + (sumaCentroideC7 / banC7));
            }
            if (sumaC8 != "") {
                fusion.add(sumaC8 + " PA Centroide " + (sumaCentroideC8 / banC8));
            }
            if (sumaC9 != "") {
                fusion.add(sumaC9 + " PA Centroide " + (sumaCentroideC9 / banC9));
            }
            if (sumaG9 != "") {
                fusion.add(sumaG9 + " PA Centroide " + (sumaCentroideG9 / banG9));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

    public ArrayList fusionOctavaPMC1(String[] referencia, ArrayList centroide) {
        String sumaC0 = "";
        String sumaC1 = "";
        String sumaC2 = "";
        String sumaC3 = "";
        String sumaC4 = "";
        String sumaC5 = "";
        String sumaC6 = "";
        String sumaC7 = "";
        String sumaC8 = "";
        String sumaC9 = "";
        String sumaG9 = "";

        double paC0 = 0;
        double paC1 = 0;
        double paC2 = 0;
        double paC3 = 0;
        double paC4 = 0;
        double paC5 = 0;
        double paC6 = 0;
        double paC7 = 0;
        double paC8 = 0;
        double paC9 = 0;
        double paG9 = 0;

        double sumaCentroideC0 = 0;
        double sumaCentroideC1 = 0;
        double sumaCentroideC2 = 0;
        double sumaCentroideC3 = 0;
        double sumaCentroideC4 = 0;
        double sumaCentroideC5 = 0;
        double sumaCentroideC6 = 0;
        double sumaCentroideC7 = 0;
        double sumaCentroideC8 = 0;
        double sumaCentroideC9 = 0;
        double sumaCentroideG9 = 0;

        double banC0 = 0;
        double banC1 = 0;
        double banC2 = 0;
        double banC3 = 0;
        double banC4 = 0;
        double banC5 = 0;
        double banC6 = 0;
        double banC7 = 0;
        double banC8 = 0;
        double banC9 = 0;
        double banG9 = 0;

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {

                    if ("C0".equals(referencia[i])) {
                        banC0 = banC0 + 1;
                        sumaCentroideC0 = sumaCentroideC0 + Double.parseDouble((String) centroide.get(i));
                        sumaC0 = sumaC0 + "[" + i + "]";
                    }

                    if ("C1".equals(referencia[i])) {
                        banC1 = banC1 + 1;
                        sumaCentroideC1 = sumaCentroideC1 + Double.parseDouble((String) centroide.get(i));
                        sumaC1 = sumaC1 + "[" + i + "]";
                    }

                    if ("C2".equals(referencia[i])) {
                        banC2 = banC2 + 1;
                        sumaCentroideC2 = sumaCentroideC2 + Double.parseDouble((String) centroide.get(i));
                        sumaC2 = sumaC2 + "[" + i + "]";
                    }
                    if ("C3".equals(referencia[i])) {
                        banC3 = banC3 + 1;
                        sumaCentroideC3 = sumaCentroideC3 + Double.parseDouble((String) centroide.get(i));
                        sumaC3 = sumaC3 + "[" + i + "]";
                    }
                    if ("C4".equals(referencia[i])) {
                        banC4 = banC4 + 1;
                        sumaCentroideC4 = sumaCentroideC4 + Double.parseDouble((String) centroide.get(i));
                        sumaC4 = sumaC4 + "[" + i + "]";
                    }
                    if ("C5".equals(referencia[i])) {
                        banC5 = banC5 + 1;
                        sumaCentroideC5 = sumaCentroideC5 + Double.parseDouble((String) centroide.get(i));
                        sumaC5 = sumaC5 + "[" + i + "]";
                    }

                    if ("C6".equals(referencia[i])) {
                        banC6 = banC6 + 1;
                        sumaCentroideC6 = sumaCentroideC6 + Double.parseDouble((String) centroide.get(i));
                        sumaC6 = sumaC6 + "[" + i + "]";
                    }
                    if ("C7".equals(referencia[i])) {
                        banC7 = banC7 + 1;
                        sumaCentroideC7 = sumaCentroideC7 + Double.parseDouble((String) centroide.get(i));
                        sumaC7 = sumaC7 + "[" + i + "]";
                    }
                    if ("C8".equals(referencia[i])) {
                        banC8 = banC8 + 1;
                        sumaCentroideC8 = sumaCentroideC8 + Double.parseDouble((String) centroide.get(i));
                        sumaC8 = sumaC8 + "[" + i + "]";
                    }
                    if ("C9".equals(referencia[i])) {
                        banC9 = banC9 + 1;
                        sumaCentroideC9 = sumaCentroideC9 + Double.parseDouble((String) centroide.get(i));
                        sumaC9 = sumaC9 + "[" + i + "]";
                    }
                    if ("G9".equals(referencia[i])) {
                        banG9 = banG9 + 1;
                        sumaCentroideG9 = sumaCentroideG9 + Double.parseDouble((String) centroide.get(i));
                        sumaG9 = sumaG9 + "[" + i + "]";
                    }

                }
            }

            if (sumaC0 != "") {
                paC0 = sumaCentroideC0 / banC0;
                fusion.add(String.valueOf(paC0));
            }

            if (sumaC1 != "") {
                paC1 = sumaCentroideC1 / banC1;
                fusion.add(String.valueOf(paC1));
            }

            if (sumaC2 != "") {
                paC2 = sumaCentroideC2 / banC2;
                fusion.add(String.valueOf(paC2));
            }

            if (sumaC3 != "") {
                paC3 = sumaCentroideC3 / banC3;
                fusion.add(String.valueOf(paC3));
            }

            if (sumaC4 != "") {
                paC4 = sumaCentroideC4 / banC4;
                fusion.add(String.valueOf(paC4));
            }

            if (sumaC5 != "") {
                paC5 = sumaCentroideC5 / banC5;
                fusion.add(String.valueOf(paC5));
            }

            if (sumaC6 != "") {
                paC6 = sumaCentroideC6 / banC6;
                fusion.add(String.valueOf(paC6));
            }
            if (sumaC7 != "") {
                paC7 = sumaCentroideC7 / banC7;
                fusion.add(String.valueOf(paC7));
            }
            if (sumaC8 != "") {
                paC8 = sumaCentroideC8 / banC8;
                fusion.add(String.valueOf(paC8));
            }
            if (sumaC9 != "") {
                paC9 = sumaCentroideC9 / banC9;
                fusion.add(String.valueOf(paC9));
            }
            if (sumaG9 != "") {
                paG9 = sumaCentroideG9 / banG9;
                fusion.add(String.valueOf(paG9));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;

    }

    public ArrayList fusionOctavaPMC2(String[] referencia, ArrayList centroide) {
        String sumaC0 = "";
        String sumaC1 = "";
        String sumaC2 = "";
        String sumaC3 = "";
        String sumaC4 = "";
        String sumaC5 = "";
        String sumaC6 = "";
        String sumaC7 = "";
        String sumaC8 = "";
        String sumaC9 = "";
        String sumaG9 = "";

        double paC0 = 0;
        double paC1 = 0;
        double paC2 = 0;
        double paC3 = 0;
        double paC4 = 0;
        double paC5 = 0;
        double paC6 = 0;
        double paC7 = 0;
        double paC8 = 0;
        double paC9 = 0;
        double paG9 = 0;

        double sumaCentroideC0 = 0;
        double sumaCentroideC1 = 0;
        double sumaCentroideC2 = 0;
        double sumaCentroideC3 = 0;
        double sumaCentroideC4 = 0;
        double sumaCentroideC5 = 0;
        double sumaCentroideC6 = 0;
        double sumaCentroideC7 = 0;
        double sumaCentroideC8 = 0;
        double sumaCentroideC9 = 0;
        double sumaCentroideG9 = 0;

        double banC0 = 0;
        double banC1 = 0;
        double banC2 = 0;
        double banC3 = 0;
        double banC4 = 0;
        double banC5 = 0;
        double banC6 = 0;
        double banC7 = 0;
        double banC8 = 0;
        double banC9 = 0;
        double banG9 = 0;

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {
                    if ("C0".equals(referencia[i])) {
                        banC0 = banC0 + 1;
                        sumaCentroideC0 = sumaCentroideC0 + Double.parseDouble((String) centroide.get(i));
                        sumaC0 = sumaC0 + "[" + i + "]";
                    }

                    if ("C1".equals(referencia[i])) {
                        banC1 = banC1 + 1;
                        sumaCentroideC1 = sumaCentroideC1 + Double.parseDouble((String) centroide.get(i));
                        sumaC1 = sumaC1 + "[" + i + "]";
                    }

                    if ("C2".equals(referencia[i])) {
                        banC2 = banC2 + 1;
                        sumaCentroideC2 = sumaCentroideC2 + Double.parseDouble((String) centroide.get(i));
                        sumaC2 = sumaC2 + "[" + i + "]";
                    }
                    if ("C3".equals(referencia[i])) {
                        banC3 = banC3 + 1;
                        sumaCentroideC3 = sumaCentroideC3 + Double.parseDouble((String) centroide.get(i));
                        sumaC3 = sumaC3 + "[" + i + "]";
                    }
                    if ("C4".equals(referencia[i])) {
                        banC4 = banC4 + 1;
                        sumaCentroideC4 = sumaCentroideC4 + Double.parseDouble((String) centroide.get(i));
                        sumaC4 = sumaC4 + "[" + i + "]";
                    }
                    if ("C5".equals(referencia[i])) {
                        banC5 = banC5 + 1;
                        sumaCentroideC5 = sumaCentroideC5 + Double.parseDouble((String) centroide.get(i));
                        sumaC5 = sumaC5 + "[" + i + "]";
                    }

                    if ("C6".equals(referencia[i])) {
                        banC6 = banC6 + 1;
                        sumaCentroideC6 = sumaCentroideC6 + Double.parseDouble((String) centroide.get(i));
                        sumaC6 = sumaC6 + "[" + i + "]";
                    }
                    if ("C7".equals(referencia[i])) {
                        banC7 = banC7 + 1;
                        sumaCentroideC7 = sumaCentroideC7 + Double.parseDouble((String) centroide.get(i));
                        sumaC7 = sumaC7 + "[" + i + "]";
                    }
                    if ("C8".equals(referencia[i])) {
                        banC8 = banC8 + 1;
                        sumaCentroideC8 = sumaCentroideC8 + Double.parseDouble((String) centroide.get(i));
                        sumaC8 = sumaC8 + "[" + i + "]";
                    }
                    if ("C9".equals(referencia[i])) {
                        banC9 = banC9 + 1;
                        sumaCentroideC9 = sumaCentroideC9 + Double.parseDouble((String) centroide.get(i));
                        sumaC9 = sumaC9 + "[" + i + "]";
                    }
                    if ("G9".equals(referencia[i])) {
                        banG9 = banG9 + 1;
                        sumaCentroideG9 = sumaCentroideG9 + Double.parseDouble((String) centroide.get(i));
                        sumaG9 = sumaG9 + "[" + i + "]";
                    }

                }
            }

            if (banC0 > 1) {
                paC0 = sumaCentroideC0 / banC0;
                fusion.add(String.valueOf(paC0));
            }

            if (banC1 > 1) {
                paC1 = sumaCentroideC1 / banC1;
                fusion.add(String.valueOf(paC1));
            }

            if (banC2 > 1) {
                paC2 = sumaCentroideC2 / banC2;
                fusion.add(String.valueOf(paC2));
            }

            if (banC3 > 1) {
                paC3 = sumaCentroideC3 / banC3;
                fusion.add(String.valueOf(paC3));
            }

            if (banC4 > 1) {
                paC4 = sumaCentroideC4 / banC4;
                fusion.add(String.valueOf(paC4));
            }

            if (banC5 > 1) {
                paC5 = sumaCentroideC5 / banC5;
                fusion.add(String.valueOf(paC5));
            }

            if (banC6 > 1) {
                paC6 = sumaCentroideC6 / banC6;
                fusion.add(String.valueOf(paC6));
            }
            if (banC7 > 1) {
                paC7 = sumaCentroideC7 / banC7;
                fusion.add(String.valueOf(paC7));
            }
            if (banC8 > 1) {
                paC8 = sumaCentroideC8 / banC8;
                fusion.add(String.valueOf(paC8));
            }
            if (banC9 > 1) {
                paC9 = sumaCentroideC9 / banC9;
                fusion.add(String.valueOf(paC9));
            }
            if (banG9 > 1) {
                paG9 = sumaCentroideG9 / banG9;
                fusion.add(String.valueOf(paG9));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;

    }

    public ArrayList fusionOctavaSI(String[] referencia, ArrayList instancias, ArrayList centroide) {
        String sumaC0 = "";
        String sumaC1 = "";
        String sumaC2 = "";
        String sumaC3 = "";
        String sumaC4 = "";
        String sumaC5 = "";
        String sumaC6 = "";
        String sumaC7 = "";
        String sumaC8 = "";
        String sumaC9 = "";
        String sumaG9 = "";

        int sumaInstanciasC0 = 0;
        int sumaInstanciasC1 = 0;
        int sumaInstanciasC2 = 0;
        int sumaInstanciasC3 = 0;
        int sumaInstanciasC4 = 0;
        int sumaInstanciasC5 = 0;
        int sumaInstanciasC6 = 0;
        int sumaInstanciasC7 = 0;
        int sumaInstanciasC8 = 0;
        int sumaInstanciasC9 = 0;
        int sumaInstanciasG9 = 0;

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {
                    if ("C0".equals(referencia[i])) {
                        sumaInstanciasC0 = sumaInstanciasC0 + Integer.parseInt((String) instancias.get(i));
                        sumaC0 = sumaC0 + "[" + i + "]";
                    }

                    if ("C1".equals(referencia[i])) {
                        sumaInstanciasC1 = sumaInstanciasC1 + Integer.parseInt((String) instancias.get(i));
                        sumaC1 = sumaC1 + "[" + i + "]";
                    }

                    if ("C2".equals(referencia[i])) {
                        sumaInstanciasC2 = sumaInstanciasC2 + Integer.parseInt((String) instancias.get(i));
                        sumaC2 = sumaC2 + "[" + i + "]";
                    }
                    if ("C3".equals(referencia[i])) {
                        sumaInstanciasC3 = sumaInstanciasC3 + Integer.parseInt((String) instancias.get(i));
                        sumaC3 = sumaC3 + "[" + i + "]";
                    }
                    if ("C4".equals(referencia[i])) {
                        sumaInstanciasC4 = sumaInstanciasC4 + Integer.parseInt((String) instancias.get(i));
                        sumaC4 = sumaC4 + "[" + i + "]";
                    }
                    if ("C5".equals(referencia[i])) {
                        sumaInstanciasC5 = sumaInstanciasC5 + Integer.parseInt((String) instancias.get(i));
                        sumaC5 = sumaC5 + "[" + i + "]";
                    }
                    if ("C6".equals(referencia[i])) {
                        sumaInstanciasC6 = sumaInstanciasC6 + Integer.parseInt((String) instancias.get(i));
                        sumaC6 = sumaC6 + "[" + i + "]";
                    }
                    if ("C7".equals(referencia[i])) {
                        sumaInstanciasC7 = sumaInstanciasC7 + Integer.parseInt((String) instancias.get(i));
                        sumaC7 = sumaC7 + "[" + i + "]";
                    }
                    if ("C8".equals(referencia[i])) {
                        sumaInstanciasC8 = sumaInstanciasC8 + Integer.parseInt((String) instancias.get(i));
                        sumaC8 = sumaC8 + "[" + i + "]";
                    }
                    if ("C9".equals(referencia[i])) {
                        sumaInstanciasC9 = sumaInstanciasC9 + Integer.parseInt((String) instancias.get(i));
                        sumaC9 = sumaC9 + "[" + i + "]";
                    }
                    if ("G9".equals(referencia[i])) {
                        sumaInstanciasG9 = sumaInstanciasG9 + Integer.parseInt((String) instancias.get(i));
                        sumaG9 = sumaG9 + "[" + i + "]";
                    }
                }
            }

            if (sumaC0 != "") {
                fusion.add(sumaC0 + " Instancias " + sumaInstanciasC0);
            }

            if (sumaC1 != "") {
                fusion.add(sumaC1 + " Instancias " + sumaInstanciasC1);
            }

            if (sumaC2 != "") {
                fusion.add(sumaC2 + " Instancias " + sumaInstanciasC2);
            }

            if (sumaC3 != "") {
                fusion.add(sumaC3 + " Instancias " + sumaInstanciasC3);
            }

            if (sumaC4 != "") {
                fusion.add(sumaC4 + " Instancias " + sumaInstanciasC4);
            }
            if (sumaC5 != "") {
                fusion.add(sumaC5 + " Instancias " + sumaInstanciasC5);
            }
            if (sumaC6 != "") {
                fusion.add(sumaC6 + " Instancias " + sumaInstanciasC6);
            }
            if (sumaC7 != "") {
                fusion.add(sumaC7 + " Instancias " + sumaInstanciasC7);
            }
            if (sumaC8 != "") {
                fusion.add(sumaC8 + " Instancias " + sumaInstanciasC8);
            }
            if (sumaC9 != "") {
                fusion.add(sumaC9 + " Instancias " + sumaInstanciasC9);
            }
            if (sumaG9 != "") {
                fusion.add(sumaG9 + " Instancias " + sumaInstanciasG9);
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;

    }

    public ArrayList fusionOctavaSI1(String[] referencia, ArrayList instancias, ArrayList centroide) {
        String sumaC0 = "";
        String sumaC1 = "";
        String sumaC2 = "";
        String sumaC3 = "";
        String sumaC4 = "";
        String sumaC5 = "";
        String sumaC6 = "";
        String sumaC7 = "";
        String sumaC8 = "";
        String sumaC9 = "";
        String sumaG9 = "";

        int sumaInstanciasC0 = 0;
        int sumaInstanciasC1 = 0;
        int sumaInstanciasC2 = 0;
        int sumaInstanciasC3 = 0;
        int sumaInstanciasC4 = 0;
        int sumaInstanciasC5 = 0;
        int sumaInstanciasC6 = 0;
        int sumaInstanciasC7 = 0;
        int sumaInstanciasC8 = 0;
        int sumaInstanciasC9 = 0;
        int sumaInstanciasG9 = 0;

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {
                    if ("C0".equals(referencia[i])) {
                        sumaInstanciasC0 = sumaInstanciasC0 + Integer.parseInt((String) instancias.get(i));
                        sumaC0 = sumaC0 + "[" + i + "]";
                    }

                    if ("C1".equals(referencia[i])) {
                        sumaInstanciasC1 = sumaInstanciasC1 + Integer.parseInt((String) instancias.get(i));
                        sumaC1 = sumaC1 + "[" + i + "]";
                    }

                    if ("C2".equals(referencia[i])) {
                        sumaInstanciasC2 = sumaInstanciasC2 + Integer.parseInt((String) instancias.get(i));
                        sumaC2 = sumaC2 + "[" + i + "]";
                    }
                    if ("C3".equals(referencia[i])) {
                        sumaInstanciasC3 = sumaInstanciasC3 + Integer.parseInt((String) instancias.get(i));
                        sumaC3 = sumaC3 + "[" + i + "]";
                    }
                    if ("C4".equals(referencia[i])) {
                        sumaInstanciasC4 = sumaInstanciasC4 + Integer.parseInt((String) instancias.get(i));
                        sumaC4 = sumaC4 + "[" + i + "]";
                    }
                    if ("C5".equals(referencia[i])) {
                        sumaInstanciasC5 = sumaInstanciasC5 + Integer.parseInt((String) instancias.get(i));
                        sumaC5 = sumaC5 + "[" + i + "]";
                    }
                    if ("C6".equals(referencia[i])) {
                        sumaInstanciasC6 = sumaInstanciasC6 + Integer.parseInt((String) instancias.get(i));
                        sumaC6 = sumaC6 + "[" + i + "]";
                    }
                    if ("C7".equals(referencia[i])) {
                        sumaInstanciasC7 = sumaInstanciasC7 + Integer.parseInt((String) instancias.get(i));
                        sumaC7 = sumaC7 + "[" + i + "]";
                    }
                    if ("C8".equals(referencia[i])) {
                        sumaInstanciasC8 = sumaInstanciasC8 + Integer.parseInt((String) instancias.get(i));
                        sumaC8 = sumaC8 + "[" + i + "]";
                    }
                    if ("C9".equals(referencia[i])) {
                        sumaInstanciasC9 = sumaInstanciasC9 + Integer.parseInt((String) instancias.get(i));
                        sumaC9 = sumaC9 + "[" + i + "]";
                    }
                    if ("G9".equals(referencia[i])) {
                        sumaInstanciasG9 = sumaInstanciasG9 + Integer.parseInt((String) instancias.get(i));
                        sumaG9 = sumaG9 + "[" + i + "]";
                    }
                }
            }

            if (sumaC0 != "") {
                fusion.add(String.valueOf(sumaInstanciasC0));
            }

            if (sumaC1 != "") {
                fusion.add(String.valueOf(sumaInstanciasC1));
            }

            if (sumaC2 != "") {
                fusion.add(String.valueOf(sumaInstanciasC2));
            }

            if (sumaC3 != "") {
                fusion.add(String.valueOf(sumaInstanciasC3));
            }

            if (sumaC4 != "") {
                fusion.add(String.valueOf(sumaInstanciasC4));
            }

            if (sumaC5 != "") {
                fusion.add(String.valueOf(sumaInstanciasC5));
            }

            if (sumaC6 != "") {
                fusion.add(String.valueOf(sumaInstanciasC6));
            }
            if (sumaC7 != "") {
                fusion.add(String.valueOf(sumaInstanciasC7));
            }
            if (sumaC8 != "") {
                fusion.add(String.valueOf(sumaInstanciasC8));
            }
            if (sumaC9 != "") {
                fusion.add(String.valueOf(sumaInstanciasC9));
            }
            if (sumaG9 != "") {
                fusion.add(String.valueOf(sumaInstanciasG9));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

    public ArrayList fusionOctavaSI2(String[] referencia, ArrayList instancias, ArrayList centroide) {
        String sumaC0 = "";
        String sumaC1 = "";
        String sumaC2 = "";
        String sumaC3 = "";
        String sumaC4 = "";
        String sumaC5 = "";
        String sumaC6 = "";
        String sumaC7 = "";
        String sumaC8 = "";
        String sumaC9 = "";
        String sumaG9 = "";

        int sumaInstanciasC0 = 0;
        int sumaInstanciasC1 = 0;
        int sumaInstanciasC2 = 0;
        int sumaInstanciasC3 = 0;
        int sumaInstanciasC4 = 0;
        int sumaInstanciasC5 = 0;
        int sumaInstanciasC6 = 0;
        int sumaInstanciasC7 = 0;
        int sumaInstanciasC8 = 0;
        int sumaInstanciasC9 = 0;
        int sumaInstanciasG9 = 0;

        int countC0 = 0;
        int countC1 = 0;
        int countC2 = 0;
        int countC3 = 0;
        int countC4 = 0;
        int countC5 = 0;
        int countC6 = 0;
        int countC7 = 0;
        int countC8 = 0;
        int countC9 = 0;
        int countG9 = 0;

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {
                    if ("C0".equals(referencia[i])) {
                        countC0 = countC0 + 1;
                        sumaInstanciasC0 = sumaInstanciasC0 + Integer.parseInt((String) instancias.get(i));
                        sumaC0 = sumaC0 + "[" + i + "]";
                    }

                    if ("C1".equals(referencia[i])) {
                        countC1 = countC1 + 1;
                        sumaInstanciasC1 = sumaInstanciasC1 + Integer.parseInt((String) instancias.get(i));
                        sumaC1 = sumaC1 + "[" + i + "]";
                    }

                    if ("C2".equals(referencia[i])) {
                        countC2 = countC2 + 1;
                        sumaInstanciasC2 = sumaInstanciasC2 + Integer.parseInt((String) instancias.get(i));
                        sumaC2 = sumaC2 + "[" + i + "]";
                    }
                    if ("C3".equals(referencia[i])) {
                        countC3 = countC3 + 1;
                        sumaInstanciasC3 = sumaInstanciasC3 + Integer.parseInt((String) instancias.get(i));
                        sumaC3 = sumaC3 + "[" + i + "]";
                    }
                    if ("C4".equals(referencia[i])) {
                        countC4 = countC4 + 1;
                        sumaInstanciasC4 = sumaInstanciasC4 + Integer.parseInt((String) instancias.get(i));
                        sumaC4 = sumaC4 + "[" + i + "]";
                    }
                    if ("C5".equals(referencia[i])) {
                        countC5 = countC5 + 1;
                        sumaInstanciasC5 = sumaInstanciasC5 + Integer.parseInt((String) instancias.get(i));
                        sumaC5 = sumaC5 + "[" + i + "]";
                    }
                    if ("C6".equals(referencia[i])) {
                        countC6 = countC6 + 1;
                        sumaInstanciasC6 = sumaInstanciasC6 + Integer.parseInt((String) instancias.get(i));
                        sumaC6 = sumaC6 + "[" + i + "]";
                    }
                    if ("C7".equals(referencia[i])) {
                        countC7 = countC7 + 1;
                        sumaInstanciasC7 = sumaInstanciasC7 + Integer.parseInt((String) instancias.get(i));
                        sumaC7 = sumaC7 + "[" + i + "]";
                    }
                    if ("C8".equals(referencia[i])) {
                        countC8 = countC8 + 1;
                        sumaInstanciasC8 = sumaInstanciasC8 + Integer.parseInt((String) instancias.get(i));
                        sumaC8 = sumaC8 + "[" + i + "]";
                    }
                    if ("C9".equals(referencia[i])) {
                        countC9 = countC9 + 1;
                        sumaInstanciasC9 = sumaInstanciasC9 + Integer.parseInt((String) instancias.get(i));
                        sumaC9 = sumaC9 + "[" + i + "]";
                    }
                    if ("G9".equals(referencia[i])) {
                        countG9 = countG9 + 1;
                        sumaInstanciasG9 = sumaInstanciasG9 + Integer.parseInt((String) instancias.get(i));
                        sumaG9 = sumaG9 + "[" + i + "]";
                    }
                }
            }

            if (countC0 > 1) {
                fusion.add(String.valueOf(sumaInstanciasC0));
            }

            if (countC1 > 1) {
                fusion.add(String.valueOf(sumaInstanciasC1));
            }

            if (countC2 > 1) {
                fusion.add(String.valueOf(sumaInstanciasC2));
            }

            if (countC3 > 1) {
                fusion.add(String.valueOf(sumaInstanciasC3));
            }

            if (countC4 > 1) {
                fusion.add(String.valueOf(sumaInstanciasC4));
            }

            if (countC5 > 1) {
                fusion.add(String.valueOf(sumaInstanciasC5));
            }

            if (countC6 > 1) {
                fusion.add(String.valueOf(sumaInstanciasC6));
            }
            if (countC7 > 1) {
                fusion.add(String.valueOf(sumaInstanciasC7));
            }
            if (countC8 > 1) {
                fusion.add(String.valueOf(sumaInstanciasC8));
            }
            if (countC9 > 1) {
                fusion.add(String.valueOf(sumaInstanciasC9));
            }
            if (countG9 > 1) {
                fusion.add(String.valueOf(sumaInstanciasG9));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

    public ArrayList fusionOctavaPPC(String[] referencia, ArrayList centroide, ArrayList instancias) {
        String sumaC0 = "";
        String sumaC1 = "";
        String sumaC2 = "";
        String sumaC3 = "";
        String sumaC4 = "";
        String sumaC5 = "";
        String sumaC6 = "";
        String sumaC7 = "";
        String sumaC8 = "";
        String sumaC9 = "";
        String sumaG9 = "";

        double sumaInstanciasC0 = 0;
        double sumaInstanciasC1 = 0;
        double sumaInstanciasC2 = 0;
        double sumaInstanciasC3 = 0;
        double sumaInstanciasC4 = 0;
        double sumaInstanciasC5 = 0;
        double sumaInstanciasC6 = 0;
        double sumaInstanciasC7 = 0;
        double sumaInstanciasC8 = 0;
        double sumaInstanciasC9 = 0;
        double sumaInstanciasG9 = 0;

        double sumappC0 = 0;
        double sumappC1 = 0;
        double sumappC2 = 0;
        double sumappC3 = 0;
        double sumappC4 = 0;
        double sumappC5 = 0;
        double sumappC6 = 0;
        double sumappC7 = 0;
        double sumappC8 = 0;
        double sumappC9 = 0;
        double sumappG9 = 0;

        promp prom1 = new promp();
        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {

                if ("0.0".equals(centroide.get(i))) {

                } else {

                    if ("C0".equals(referencia[i])) {
                        double multiC0 = 0;
                        multiC0 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC0 = sumaInstanciasC0 + Double.parseDouble((String) instancias.get(i));
                        sumaC0 = sumaC0 + "[" + i + "]";
                        sumappC0 = sumappC0 + multiC0;

                    }

                    if ("C1".equals(referencia[i])) {
                        double multiC1 = 0;
                        multiC1 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC1 = sumaInstanciasC1 + Double.parseDouble((String) instancias.get(i));
                        sumaC1 = sumaC1 + "[" + i + "]";
                        sumappC1 = sumappC1 + multiC1;

                    }

                    if ("C2".equals(referencia[i])) {
                        double multiC2 = 0;
                        multiC2 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC2 = sumaInstanciasC2 + Double.parseDouble((String) instancias.get(i));
                        sumaC2 = sumaC2 + "[" + i + "]";
                        sumappC2 = sumappC2 + multiC2;

                    }
                    if ("C3".equals(referencia[i])) {
                        double multiC3 = 0;
                        multiC3 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC3 = sumaInstanciasC3 + Double.parseDouble((String) instancias.get(i));
                        sumaC3 = sumaC3 + "[" + i + "]";
                        sumappC3 = sumappC3 + multiC3;

                    }
                    if ("C4".equals(referencia[i])) {
                        double multiC4 = 0;
                        multiC4 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC4 = sumaInstanciasC4 + Double.parseDouble((String) instancias.get(i));
                        sumaC4 = sumaC4 + "[" + i + "]";
                        sumappC4 = sumappC4 + multiC4;

                    }
                    if ("C5".equals(referencia[i])) {
                        double multiC5 = 0;
                        multiC5 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC5 = sumaInstanciasC5 + Double.parseDouble((String) instancias.get(i));
                        sumaC5 = sumaC5 + "[" + i + "]";
                        sumappC5 = sumappC5 + multiC5;

                    }
                    if ("C6".equals(referencia[i])) {
                        double multiC6 = 0;
                        multiC6 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC6 = sumaInstanciasC6 + Double.parseDouble((String) instancias.get(i));
                        sumaC6 = sumaC6 + "[" + i + "]";
                        sumappC6 = sumappC6 + multiC6;

                    }
                    if ("C7".equals(referencia[i])) {
                        double multiC7 = 0;
                        multiC7 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC7 = sumaInstanciasC7 + Double.parseDouble((String) instancias.get(i));
                        sumaC7 = sumaC7 + "[" + i + "]";
                        sumappC7 = sumappC7 + multiC7;

                    }
                    if ("C8".equals(referencia[i])) {
                        double multiC8 = 0;
                        multiC8 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC8 = sumaInstanciasC8 + Double.parseDouble((String) instancias.get(i));
                        sumaC8 = sumaC8 + "[" + i + "]";
                        sumappC8 = sumappC8 + multiC8;

                    }
                    if ("C9".equals(referencia[i])) {
                        double multiC9 = 0;
                        multiC9 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC9 = sumaInstanciasC9 + Double.parseDouble((String) instancias.get(i));
                        sumaC9 = sumaC9 + "[" + i + "]";
                        sumappC9 = sumappC9 + multiC9;

                    }
                    if ("G9".equals(referencia[i])) {
                        double multiG9 = 0;
                        multiG9 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasG9 = sumaInstanciasG9 + Double.parseDouble((String) instancias.get(i));
                        sumaG9 = sumaG9 + "[" + i + "]";
                        sumappG9 = sumappG9 + multiG9;

                    }
                }
            }

            if (sumaC0 != "") {
                fusion.add(sumaC0 + " PP Centroide " + (sumappC0 / sumaInstanciasC0));
            }

            if (sumaC1 != "") {
                fusion.add(sumaC1 + " PP Centroide " + (sumappC1 / sumaInstanciasC1));
            }

            if (sumaC2 != "") {
                fusion.add(sumaC2 + " PP Centroide " + (sumappC2 / sumaInstanciasC2));
            }

            if (sumaC3 != "") {
                fusion.add(sumaC3 + " PP Centroide " + (sumappC3 / sumaInstanciasC3));
            }

            if (sumaC4 != "") {
                fusion.add(sumaC4 + " PP Centroide " + (sumappC4 / sumaInstanciasC4));
            }

            if (sumaC5 != "") {
                fusion.add(sumaC5 + " PP Centroide " + (sumappC5 / sumaInstanciasC5));
            }
            if (sumaC6 != "") {
                fusion.add(sumaC6 + " PP Centroide " + (sumappC6 / sumaInstanciasC6));
            }
            if (sumaC7 != "") {
                fusion.add(sumaC7 + " PP Centroide " + (sumappC7 / sumaInstanciasC7));
            }
            if (sumaC8 != "") {
                fusion.add(sumaC8 + " PP Centroide " + (sumappC8 / sumaInstanciasC8));
            }
            if (sumaC9 != "") {
                fusion.add(sumaC9 + " PP Centroide " + (sumappC9 / sumaInstanciasC9));
            }
            if (sumaG9 != "") {
                fusion.add(sumaG9 + " PP Centroide " + (sumappG9 / sumaInstanciasG9));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

    public ArrayList fusionOctavaPPC1(String[] referencia, ArrayList centroide, ArrayList instancias) {
        String sumaC0 = "";
        String sumaC1 = "";
        String sumaC2 = "";
        String sumaC3 = "";
        String sumaC4 = "";
        String sumaC5 = "";
        String sumaC6 = "";
        String sumaC7 = "";
        String sumaC8 = "";
        String sumaC9 = "";
        String sumaG9 = "";

        double ppC0 = 0;
        double ppC1 = 0;
        double ppC2 = 0;
        double ppC3 = 0;
        double ppC4 = 0;
        double ppC5 = 0;
        double ppC6 = 0;
        double ppC7 = 0;
        double ppC8 = 0;
        double ppC9 = 0;
        double ppG9 = 0;

        double sumaInstanciasC0 = 0;
        double sumaInstanciasC1 = 0;
        double sumaInstanciasC2 = 0;
        double sumaInstanciasC3 = 0;
        double sumaInstanciasC4 = 0;
        double sumaInstanciasC5 = 0;
        double sumaInstanciasC6 = 0;
        double sumaInstanciasC7 = 0;
        double sumaInstanciasC8 = 0;
        double sumaInstanciasC9 = 0;
        double sumaInstanciasG9 = 0;

        double sumappC0 = 0;
        double sumappC1 = 0;
        double sumappC2 = 0;
        double sumappC3 = 0;
        double sumappC4 = 0;
        double sumappC5 = 0;
        double sumappC6 = 0;
        double sumappC7 = 0;
        double sumappC8 = 0;
        double sumappC9 = 0;
        double sumappG9 = 0;

        promp prom1 = new promp();
        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {

                    if ("C0".equals(referencia[i])) {
                        double multiC0 = 0;
                        multiC0 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC0 = sumaInstanciasC0 + Double.parseDouble((String) instancias.get(i));
                        sumaC0 = sumaC0 + "[" + i + "]";
                        sumappC0 = sumappC0 + multiC0;

                    }

                    if ("C1".equals(referencia[i])) {
                        double multiC1 = 0;
                        multiC1 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC1 = sumaInstanciasC1 + Double.parseDouble((String) instancias.get(i));
                        sumaC1 = sumaC1 + "[" + i + "]";
                        sumappC1 = sumappC1 + multiC1;

                    }

                    if ("C2".equals(referencia[i])) {
                        double multiC2 = 0;
                        multiC2 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC2 = sumaInstanciasC2 + Double.parseDouble((String) instancias.get(i));
                        sumaC2 = sumaC2 + "[" + i + "]";
                        sumappC2 = sumappC2 + multiC2;

                    }
                    if ("C3".equals(referencia[i])) {
                        double multiC3 = 0;
                        multiC3 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC3 = sumaInstanciasC3 + Double.parseDouble((String) instancias.get(i));
                        sumaC3 = sumaC3 + "[" + i + "]";
                        sumappC3 = sumappC3 + multiC3;

                    }
                    if ("C4".equals(referencia[i])) {
                        double multiC4 = 0;
                        multiC4 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC4 = sumaInstanciasC4 + Double.parseDouble((String) instancias.get(i));
                        sumaC4 = sumaC4 + "[" + i + "]";
                        sumappC4 = sumappC4 + multiC4;

                    }
                    if ("C5".equals(referencia[i])) {
                        double multiC5 = 0;
                        multiC5 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC5 = sumaInstanciasC5 + Double.parseDouble((String) instancias.get(i));
                        sumaC5 = sumaC5 + "[" + i + "]";
                        sumappC5 = sumappC5 + multiC5;

                    }
                    if ("C6".equals(referencia[i])) {
                        double multiC6 = 0;
                        multiC6 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC6 = sumaInstanciasC6 + Double.parseDouble((String) instancias.get(i));
                        sumaC6 = sumaC6 + "[" + i + "]";
                        sumappC6 = sumappC6 + multiC6;

                    }
                    if ("C7".equals(referencia[i])) {
                        double multiC7 = 0;
                        multiC7 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC7 = sumaInstanciasC7 + Double.parseDouble((String) instancias.get(i));
                        sumaC7 = sumaC7 + "[" + i + "]";
                        sumappC7 = sumappC7 + multiC7;

                    }
                    if ("C8".equals(referencia[i])) {
                        double multiC8 = 0;
                        multiC8 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC8 = sumaInstanciasC8 + Double.parseDouble((String) instancias.get(i));
                        sumaC8 = sumaC8 + "[" + i + "]";
                        sumappC8 = sumappC8 + multiC8;

                    }
                    if ("C9".equals(referencia[i])) {
                        double multiC9 = 0;
                        multiC9 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC9 = sumaInstanciasC9 + Double.parseDouble((String) instancias.get(i));
                        sumaC9 = sumaC9 + "[" + i + "]";
                        sumappC9 = sumappC9 + multiC9;

                    }
                    if ("G9".equals(referencia[i])) {
                        double multiG9 = 0;
                        multiG9 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasG9 = sumaInstanciasG9 + Double.parseDouble((String) instancias.get(i));
                        sumaG9 = sumaG9 + "[" + i + "]";
                        sumappG9 = sumappG9 + multiG9;

                    }
                }

            }

            if (sumaC0 != "") {
                ppC0 = sumappC0 / sumaInstanciasC0;
                fusion.add(String.valueOf(ppC0));
            }

            if (sumaC1 != "") {
                ppC1 = sumappC1 / sumaInstanciasC1;
                fusion.add(String.valueOf(ppC1));
            }

            if (sumaC2 != "") {
                ppC2 = sumappC2 / sumaInstanciasC2;
                fusion.add(String.valueOf(ppC2));
            }

            if (sumaC3 != "") {
                ppC3 = sumappC3 / sumaInstanciasC3;
                fusion.add(String.valueOf(ppC3));
            }

            if (sumaC4 != "") {
                ppC4 = sumappC4 / sumaInstanciasC4;
                fusion.add(String.valueOf(ppC4));
            }
            if (sumaC5 != "") {
                ppC5 = sumappC5 / sumaInstanciasC5;
                fusion.add(String.valueOf(ppC5));
            }
            if (sumaC6 != "") {
                ppC6 = sumappC6 / sumaInstanciasC6;
                fusion.add(String.valueOf(ppC6));
            }
            if (sumaC7 != "") {
                ppC7 = sumappC7 / sumaInstanciasC7;
                fusion.add(String.valueOf(ppC7));
            }
            if (sumaC8 != "") {
                ppC8 = sumappC8 / sumaInstanciasC8;
                fusion.add(String.valueOf(ppC8));
            }
            if (sumaC9 != "") {
                ppC9 = sumappC9 / sumaInstanciasC9;
                fusion.add(String.valueOf(ppC9));
            }
            if (sumaG9 != "") {
                ppG9 = sumappG9 / sumaInstanciasG9;
                fusion.add(String.valueOf(ppG9));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

    public ArrayList fusionOctavaPPC2(String[] referencia, ArrayList centroide, ArrayList instancias) {
        String sumaC0 = "";
        String sumaC1 = "";
        String sumaC2 = "";
        String sumaC3 = "";
        String sumaC4 = "";
        String sumaC5 = "";
        String sumaC6 = "";
        String sumaC7 = "";
        String sumaC8 = "";
        String sumaC9 = "";
        String sumaG9 = "";

        double ppC0 = 0;
        double ppC1 = 0;
        double ppC2 = 0;
        double ppC3 = 0;
        double ppC4 = 0;
        double ppC5 = 0;
        double ppC6 = 0;
        double ppC7 = 0;
        double ppC8 = 0;
        double ppC9 = 0;
        double ppG9 = 0;

        double sumaInstanciasC0 = 0;
        double sumaInstanciasC1 = 0;
        double sumaInstanciasC2 = 0;
        double sumaInstanciasC3 = 0;
        double sumaInstanciasC4 = 0;
        double sumaInstanciasC5 = 0;
        double sumaInstanciasC6 = 0;
        double sumaInstanciasC7 = 0;
        double sumaInstanciasC8 = 0;
        double sumaInstanciasC9 = 0;
        double sumaInstanciasG9 = 0;

        double sumappC0 = 0;
        double sumappC1 = 0;
        double sumappC2 = 0;
        double sumappC3 = 0;
        double sumappC4 = 0;
        double sumappC5 = 0;
        double sumappC6 = 0;
        double sumappC7 = 0;
        double sumappC8 = 0;
        double sumappC9 = 0;
        double sumappG9 = 0;

        int countC0 = 0;
        int countC1 = 0;
        int countC2 = 0;
        int countC3 = 0;
        int countC4 = 0;
        int countC5 = 0;
        int countC6 = 0;
        int countC7 = 0;
        int countC8 = 0;
        int countC9 = 0;
        int countG9 = 0;

        promp prom1 = new promp();
        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {

                    if ("C0".equals(referencia[i])) {
                        countC0 = countC0 + 1;
                        double multiC0 = 0;
                        multiC0 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC0 = sumaInstanciasC0 + Double.parseDouble((String) instancias.get(i));
                        sumaC0 = sumaC0 + "[" + i + "]";
                        sumappC0 = sumappC0 + multiC0;

                    }

                    if ("C1".equals(referencia[i])) {
                        countC1 = countC1 + 1;
                        double multiC1 = 0;
                        multiC1 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC1 = sumaInstanciasC1 + Double.parseDouble((String) instancias.get(i));
                        sumaC1 = sumaC1 + "[" + i + "]";
                        sumappC1 = sumappC1 + multiC1;

                    }

                    if ("C2".equals(referencia[i])) {
                        countC2 = countC2 + 1;
                        double multiC2 = 0;
                        multiC2 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC2 = sumaInstanciasC2 + Double.parseDouble((String) instancias.get(i));
                        sumaC2 = sumaC2 + "[" + i + "]";
                        sumappC2 = sumappC2 + multiC2;

                    }
                    if ("C3".equals(referencia[i])) {
                        countC3 = countC3 + 1;
                        double multiC3 = 0;
                        multiC3 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC3 = sumaInstanciasC3 + Double.parseDouble((String) instancias.get(i));
                        sumaC3 = sumaC3 + "[" + i + "]";
                        sumappC3 = sumappC3 + multiC3;

                    }
                    if ("C4".equals(referencia[i])) {
                        countC4 = countC4 + 1;
                        double multiC4 = 0;
                        multiC4 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC4 = sumaInstanciasC4 + Double.parseDouble((String) instancias.get(i));
                        sumaC4 = sumaC4 + "[" + i + "]";
                        sumappC4 = sumappC4 + multiC4;

                    }
                    if ("C5".equals(referencia[i])) {
                        countC5 = countC5 + 1;
                        double multiC5 = 0;
                        multiC5 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC5 = sumaInstanciasC5 + Double.parseDouble((String) instancias.get(i));
                        sumaC5 = sumaC5 + "[" + i + "]";
                        sumappC5 = sumappC5 + multiC5;

                    }
                    if ("C6".equals(referencia[i])) {
                        countC6 = countC6 + 1;
                        double multiC6 = 0;
                        multiC6 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC6 = sumaInstanciasC6 + Double.parseDouble((String) instancias.get(i));
                        sumaC6 = sumaC6 + "[" + i + "]";
                        sumappC6 = sumappC6 + multiC6;

                    }
                    if ("C7".equals(referencia[i])) {
                        countC7 = countC7 + 1;
                        double multiC7 = 0;
                        multiC7 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC7 = sumaInstanciasC7 + Double.parseDouble((String) instancias.get(i));
                        sumaC7 = sumaC7 + "[" + i + "]";
                        sumappC7 = sumappC7 + multiC7;

                    }
                    if ("C8".equals(referencia[i])) {
                        countC8 = countC8 + 1;
                        double multiC8 = 0;
                        multiC8 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC8 = sumaInstanciasC8 + Double.parseDouble((String) instancias.get(i));
                        sumaC8 = sumaC8 + "[" + i + "]";
                        sumappC8 = sumappC8 + multiC8;

                    }
                    if ("C9".equals(referencia[i])) {
                        countC9 = countC9 + 1;
                        double multiC9 = 0;
                        multiC9 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasC9 = sumaInstanciasC9 + Double.parseDouble((String) instancias.get(i));
                        sumaC9 = sumaC9 + "[" + i + "]";
                        sumappC9 = sumappC9 + multiC9;

                    }
                    if ("G9".equals(referencia[i])) {
                        countG9 = countG9 + 1;
                        double multiG9 = 0;
                        multiG9 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstanciasG9 = sumaInstanciasG9 + Double.parseDouble((String) instancias.get(i));
                        sumaG9 = sumaG9 + "[" + i + "]";
                        sumappG9 = sumappG9 + multiG9;

                    }
                }

            }

            if (countC0 > 1) {
                ppC0 = sumappC0 / sumaInstanciasC0;
                fusion.add(String.valueOf(ppC0));
            }

            if (countC1 > 1) {
                ppC1 = sumappC1 / sumaInstanciasC1;
                fusion.add(String.valueOf(ppC1));
            }

            if (countC2 > 1) {
                ppC2 = sumappC2 / sumaInstanciasC2;
                fusion.add(String.valueOf(ppC2));
            }

            if (countC3 > 1) {
                ppC3 = sumappC3 / sumaInstanciasC3;
                fusion.add(String.valueOf(ppC3));
            }

            if (countC4 > 1) {
                ppC4 = sumappC4 / sumaInstanciasC4;
                fusion.add(String.valueOf(ppC4));
            }
            if (countC5 > 1) {
                ppC5 = sumappC5 / sumaInstanciasC5;
                fusion.add(String.valueOf(ppC5));
            }
            if (countC6 > 1) {
                ppC6 = sumappC6 / sumaInstanciasC6;
                fusion.add(String.valueOf(ppC6));
            }
            if (countC7 > 1) {
                ppC7 = sumappC7 / sumaInstanciasC7;
                fusion.add(String.valueOf(ppC7));
            }
            if (countC8 > 1) {
                ppC8 = sumappC8 / sumaInstanciasC8;
                fusion.add(String.valueOf(ppC8));
            }
            if (countC9 > 1) {
                ppC9 = sumappC9 / sumaInstanciasC9;
                fusion.add(String.valueOf(ppC9));
            }
            if (countG9 > 1) {
                ppG9 = sumappG9 / sumaInstanciasG9;
                fusion.add(String.valueOf(ppG9));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return fusion;
    }

    public ArrayList fusionOctavaInstancias(String[] referencia, ArrayList noCluster, ArrayList Instancia) {
        String sumaC0 = "";
        String sumaC1 = "";
        String sumaC2 = "";
        String sumaC3 = "";
        String sumaC4 = "";
        String sumaC5 = "";
        String sumaC6 = "";
        String sumaC7 = "";
        String sumaC8 = "";
        String sumaC9 = "";
        String sumaG9 = "";

        String sumaC01 = "";
        String sumaC11 = "";
        String sumaC21 = "";
        String sumaC31 = "";
        String sumaC41 = "";
        String sumaC51 = "";
        String sumaC61 = "";
        String sumaC71 = "";
        String sumaC81 = "";
        String sumaC91 = "";
        String sumaG91 = "";

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {

                if ("C0".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            sumaC0 = sumaC0 + Instancia.get(j).toString() + ",";
                        }
                    }

                    sumaC01 = sumaC01 + "[" + i + "]";
                }

                if ("C1".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            sumaC1 = sumaC1 + Instancia.get(j).toString() + ",";
                        }
                    }

                    sumaC11 = sumaC11 + "[" + i + "]";
                }

                if ("C2".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            sumaC2 = sumaC2 + Instancia.get(j).toString() + ",";
                        }
                    }

                    sumaC21 = sumaC21 + "[" + i + "]";
                }
                if ("C3".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            sumaC3 = sumaC3 + Instancia.get(j).toString() + ",";
                        }
                    }

                    sumaC31 = sumaC31 + "[" + i + "]";
                }
                if ("C4".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            sumaC4 = sumaC4 + Instancia.get(j).toString() + ",";
                        }
                    }

                    sumaC41 = sumaC41 + "[" + i + "]";
                }
                if ("C5".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            sumaC5 = sumaC5 + Instancia.get(j).toString() + ",";
                        }
                    }

                    sumaC51 = sumaC51 + "[" + i + "]";
                }
                if ("C6".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            sumaC6 = sumaC6 + Instancia.get(j).toString() + ",";
                        }
                    }

                    sumaC61 = sumaC61 + "[" + i + "]";
                }
                if ("C7".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            sumaC7 = sumaC7 + Instancia.get(j).toString() + ",";
                        }
                    }

                    sumaC71 = sumaC71 + "[" + i + "]";
                }
                if ("C8".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            sumaC8 = sumaC8 + Instancia.get(j).toString() + ",";
                        }
                    }

                    sumaC81 = sumaC81 + "[" + i + "]";
                }
                if ("C9".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            sumaC9 = sumaC9 + Instancia.get(j).toString() + ",";
                        }
                    }

                    sumaC91 = sumaC91 + "[" + i + "]";
                }
                if ("G9".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            sumaG9 = sumaG9 + Instancia.get(j).toString() + ",";
                        }
                    }

                    sumaG91 = sumaG91 + "[" + i + "]";
                }

            }

            if (sumaC01 != "") {
                fusion.add("Cluster " + sumaC01 + " " + sumaC0);
            }

            if (sumaC11 != "") {
                fusion.add("Cluster " + sumaC11 + " " + sumaC1);
            }

            if (sumaC21 != "") {
                fusion.add("Cluster " + sumaC21 + " " + sumaC2);
            }

            if (sumaC31 != "") {
                fusion.add("Cluster " + sumaC31 + " " + sumaC3);
            }

            if (sumaC41 != "") {
                fusion.add("Cluster " + sumaC41 + " " + sumaC4);
            }
            if (sumaC51 != "") {
                fusion.add("Cluster " + sumaC51 + " " + sumaC5);
            }
            if (sumaC61 != "") {
                fusion.add("Cluster " + sumaC61 + " " + sumaC6);
            }
            if (sumaC71 != "") {
                fusion.add("Cluster " + sumaC71 + " " + sumaC7);
            }
            if (sumaC81 != "") {
                fusion.add("Cluster " + sumaC81 + " " + sumaC8);
            }
            if (sumaC91 != "") {
                fusion.add("Cluster " + sumaC91 + " " + sumaC9);
            }
            if (sumaG91 != "") {
                fusion.add("Cluster " + sumaG91 + " " + sumaG9);
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return fusion;
    }

}
