package ObjeAux;

import java.util.ArrayList;

public class calculo_duracion {

    double tempo1[] = {1, 0.5, 0.25, 0.125, 0.0625};
    double total1[] = {0, 0, 0, 0, 0};
    int iPosision = 0;

    public ArrayList calcular(ArrayList arreglo) {
        ArrayList cal = new ArrayList();

        try {

            double total = 0;
            double res = 0;
            double pot = 0;
            double minimo = 0;

            for (int contador1 = 0; contador1 < arreglo.size(); contador1++) {

                for (int contador = 0; contador < tempo1.length; contador++) {

                    res = Double.parseDouble((String) arreglo.get(contador1)) - tempo1[contador];

                    pot = Math.pow(res, 2);

                    total = (double) Math.sqrt(pot);
                    total1[contador] = (double) Math.sqrt(pot);

                }

                double resultado = total1[0];
                iPosision = 0;

                for (int i = 0; i < total1.length; i++) {

                    if (total1[i] < resultado) {
                        resultado = total1[i];
                        iPosision = i;
                    }
                }

                cal.add("Distancia Minima: " + resultado);
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return cal;
    }

    public ArrayList calculoPosision(ArrayList arreglo) {
        ArrayList cal = new ArrayList();
        try {

            double total = 0;
            double res = 0;
            double pot = 0;
            double minimo = 0;

        // sumar el valor de cada elemento al total
            for (int contador1 = 0; contador1 < arreglo.size(); contador1++) {
                for (int contador = 0; contador < tempo1.length; contador++) {
                    res = Double.parseDouble((String) arreglo.get(contador1)) - tempo1[contador];
                    pot = Math.pow(res, 2);
                    total = (double) Math.sqrt(pot);
                    total1[contador] = (double) Math.sqrt(pot);
                }

                double resultado = total1[0];
                iPosision = 0;

                for (int i = 0; i < total1.length; i++) {
                    if (total1[i] < resultado) {
                        resultado = total1[i];
                        iPosision = i;
                    }
                }

                if (iPosision == 0) {
                    cal.add("1");
                }

                if (iPosision == 1) {
                    cal.add("1/2");
                }

                if (iPosision == 2) {
                    cal.add("1/4");
                }
                if (iPosision == 3) {
                    cal.add("1/8");
                }
                if (iPosision == 4) {
                    cal.add("1/16");
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return cal;
    }

    public ArrayList fusionDuracion(String[] referencia) {
        String suma1 = "";
        String suma12 = "";
        String suma14 = "";
        String suma18 = "";
        String suma116 = "";

        ArrayList fusion = new ArrayList();
        try {
            for (int i = 0; i < referencia.length; i++) {
                if ("1".equals(referencia[i])) {
                    suma1 = suma1 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
                if ("1/2".equals(referencia[i])) {
                    suma12 = suma12 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
                if ("1/4".equals(referencia[i])) {
                    suma14 = suma14 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
                if ("1/8".equals(referencia[i])) {
                    suma18 = suma18 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
                if ("1/16".equals(referencia[i])) {
                    suma116 = suma116 + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }
            }
            if (suma1 != "") {
                fusion.add(suma1);
            }
            if (suma12 != "") {
                fusion.add(suma12);
            }
            if (suma14 != "") {
                fusion.add(suma14);
            }
            if (suma18 != "") {
                fusion.add(suma18);
            }
            if (suma116 != "") {
                fusion.add(suma116);
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

      //////////////////// ******   FUSIÓN DE CÚMULOS ******* //////////////////////
/////////////////// ****** /////////////////// ******* //////////////////////     
    public ArrayList fusionDuracionPMC(String[] referencia, ArrayList centroide) {
        String suma1 = "";
        String suma12 = "";
        String suma14 = "";
        String suma18 = "";
        String suma116 = "";

        double sumaCentroide1 = 0;
        double sumaCentroide12 = 0;
        double sumaCentroide14 = 0;
        double sumaCentroide18 = 0;
        double sumaCentroide116 = 0;

        double ban1 = 0;
        double ban12 = 0;
        double ban14 = 0;
        double ban18 = 0;
        double ban116 = 0;

        ArrayList fusion = new ArrayList();
        try {
            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {
                    if ("1".equals(referencia[i])) {
                        ban1 = ban1 + 1;
                        sumaCentroide1 = sumaCentroide1 + Double.parseDouble((String) centroide.get(i));
                        suma1 = suma1 + "[" + i + "]";
                    }

                    if ("1/2".equals(referencia[i])) {
                        ban12 = ban12 + 1;
                        sumaCentroide12 = sumaCentroide12 + Double.parseDouble((String) centroide.get(i));
                        suma12 = suma12 + "[" + i + "]";
                    }

                    if ("1/4".equals(referencia[i])) {
                        ban14 = ban14 + 1;
                        sumaCentroide14 = sumaCentroide14 + Double.parseDouble((String) centroide.get(i));
                        suma14 = suma14 + "[" + i + "]";

                    }
                    if ("1/8".equals(referencia[i])) {
                        ban18 = ban18 + 1;
                        sumaCentroide18 = sumaCentroide18 + Double.parseDouble((String) centroide.get(i));
                        suma18 = suma18 + "[" + i + "]";
                    }
                    if ("1/16".equals(referencia[i])) {
                        ban116 = ban116 + 1;
                        sumaCentroide116 = sumaCentroide116 + Double.parseDouble((String) centroide.get(i));
                        suma116 = suma116 + "[" + i + "]";
                    }

                }
            }

            if (suma1 != "") {
                fusion.add(suma1 + " PA Centroide " + (sumaCentroide1 / ban1));
            }

            if (suma12 != "") {
                fusion.add(suma12 + " PA Centroide " + (sumaCentroide12 / ban12));
            }

            if (suma14 != "") {
                fusion.add(suma14 + " PA Centroide " + (sumaCentroide14 / ban14));
            }

            if (suma18 != "") {
                fusion.add(suma18 + " PA Centroide " + (sumaCentroide18 / ban18));
            }

            if (suma116 != "") {
                fusion.add(suma116 + " PA Centroide " + (sumaCentroide116 / ban116));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

    public ArrayList fusionDuracionPMC1(String[] referencia, ArrayList centroide) {
        String suma1 = "";
        String suma12 = "";
        String suma14 = "";
        String suma18 = "";
        String suma116 = "";

        double pa1 = 0;
        double pa12 = 0;
        double pa14 = 0;
        double pa18 = 0;
        double pa116 = 0;

        double sumaCentroide1 = 0;
        double sumaCentroide12 = 0;
        double sumaCentroide14 = 0;
        double sumaCentroide18 = 0;
        double sumaCentroide116 = 0;

        double ban1 = 0;
        double ban12 = 0;
        double ban14 = 0;
        double ban18 = 0;
        double ban116 = 0;

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {
                    if ("1".equals(referencia[i])) {
                        ban1 = ban1 + 1;
                        sumaCentroide1 = sumaCentroide1 + Double.parseDouble((String) centroide.get(i));
                        suma1 = suma1 + "[" + i + "]";
                    }

                    if ("1/2".equals(referencia[i])) {
                        ban12 = ban12 + 1;
                        sumaCentroide12 = sumaCentroide12 + Double.parseDouble((String) centroide.get(i));
                        suma12 = suma12 + "[" + i + "]";
                    }

                    if ("1/4".equals(referencia[i])) {
                        ban14 = ban14 + 1;
                        sumaCentroide14 = sumaCentroide14 + Double.parseDouble((String) centroide.get(i));
                        suma14 = suma14 + "[" + i + "]";

                    }
                    if ("1/8".equals(referencia[i])) {
                        ban18 = ban18 + 1;
                        sumaCentroide18 = sumaCentroide18 + Double.parseDouble((String) centroide.get(i));
                        suma18 = suma18 + "[" + i + "]";
                    }
                    if ("1/16".equals(referencia[i])) {
                        ban116 = ban116 + 1;
                        sumaCentroide116 = sumaCentroide116 + Double.parseDouble((String) centroide.get(i));
                        suma116 = suma116 + "[" + i + "]";
                    }
                }

            }

            if (suma1 != "") {
                pa1 = sumaCentroide1 / ban1;
                fusion.add(String.valueOf(pa1));
            }

            if (suma12 != "") {
                pa12 = sumaCentroide12 / ban12;
                fusion.add(String.valueOf(pa12));
            }

            if (suma14 != "") {
                pa14 = sumaCentroide14 / ban14;
                fusion.add(String.valueOf(pa14));
            }

            if (suma18 != "") {
                pa18 = sumaCentroide18 / ban18;
                fusion.add(String.valueOf(pa18));
            }

            if (suma116 != "") {
                pa116 = sumaCentroide116 / ban116;
                fusion.add(String.valueOf(pa116));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;

    }

    public ArrayList fusionDuracionPMC2(String[] referencia, ArrayList centroide) {
        String suma1 = "";
        String suma12 = "";
        String suma14 = "";
        String suma18 = "";
        String suma116 = "";

        double pa1 = 0;
        double pa12 = 0;
        double pa14 = 0;
        double pa18 = 0;
        double pa116 = 0;

        double sumaCentroide1 = 0;
        double sumaCentroide12 = 0;
        double sumaCentroide14 = 0;
        double sumaCentroide18 = 0;
        double sumaCentroide116 = 0;

        double ban1 = 0;
        double ban12 = 0;
        double ban14 = 0;
        double ban18 = 0;
        double ban116 = 0;

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {
                    if ("1".equals(referencia[i])) {
                        ban1 = ban1 + 1;
                        sumaCentroide1 = sumaCentroide1 + Double.parseDouble((String) centroide.get(i));
                        suma1 = suma1 + "[" + i + "]";
                    }

                    if ("1/2".equals(referencia[i])) {
                        ban12 = ban12 + 1;
                        sumaCentroide12 = sumaCentroide12 + Double.parseDouble((String) centroide.get(i));
                        suma12 = suma12 + "[" + i + "]";
                    }

                    if ("1/4".equals(referencia[i])) {
                        ban14 = ban14 + 1;
                        sumaCentroide14 = sumaCentroide14 + Double.parseDouble((String) centroide.get(i));
                        suma14 = suma14 + "[" + i + "]";

                    }
                    if ("1/8".equals(referencia[i])) {
                        ban18 = ban18 + 1;
                        sumaCentroide18 = sumaCentroide18 + Double.parseDouble((String) centroide.get(i));
                        suma18 = suma18 + "[" + i + "]";
                    }
                    if ("1/16".equals(referencia[i])) {
                        ban116 = ban116 + 1;
                        sumaCentroide116 = sumaCentroide116 + Double.parseDouble((String) centroide.get(i));
                        suma116 = suma116 + "[" + i + "]";
                    }
                }
            }
            if (ban1 > 1) {
                pa1 = sumaCentroide1 / ban1;
                fusion.add(String.valueOf(pa1));
            }

            if (ban12 > 1) {
                pa12 = sumaCentroide12 / ban12;
                fusion.add(String.valueOf(pa12));
            }

            if (ban14 > 1) {
                pa14 = sumaCentroide14 / ban14;
                fusion.add(String.valueOf(pa14));
            }

            if (ban18 > 1) {
                pa18 = sumaCentroide18 / ban18;
                fusion.add(String.valueOf(pa18));
            }

            if (ban116 > 1) {
                pa116 = sumaCentroide116 / ban116;
                fusion.add(String.valueOf(pa116));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

    public ArrayList fusionDuracionSI(String[] referencia, ArrayList instancias, ArrayList centroide) {
        String suma1 = "";
        String suma12 = "";
        String suma14 = "";
        String suma18 = "";
        String suma116 = "";

        int sumaInstancias1 = 0;
        int sumaInstancias12 = 0;
        int sumaInstancias14 = 0;
        int sumaInstancias18 = 0;
        int sumaInstancias116 = 0;

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {
                    if ("1".equals(referencia[i])) {
                        sumaInstancias1 = sumaInstancias1 + Integer.parseInt((String) instancias.get(i));
                        suma1 = suma1 + "[" + i + "]";
                    }

                    if ("1/2".equals(referencia[i])) {
                        sumaInstancias12 = sumaInstancias12 + Integer.parseInt((String) instancias.get(i));
                        suma12 = suma12 + "[" + i + "]";
                    }

                    if ("1/4".equals(referencia[i])) {
                        sumaInstancias14 = sumaInstancias14 + Integer.parseInt((String) instancias.get(i));
                        suma14 = suma14 + "[" + i + "]";

                    }
                    if ("1/8".equals(referencia[i])) {
                        sumaInstancias18 = sumaInstancias18 + Integer.parseInt((String) instancias.get(i));
                        suma18 = suma18 + "[" + i + "]";
                    }
                    if ("1/16".equals(referencia[i])) {
                        sumaInstancias116 = sumaInstancias116 + Integer.parseInt((String) instancias.get(i));
                        suma116 = suma116 + "[" + i + "]";
                    }
                }
            }

            if (suma1 != "") {
                fusion.add(suma1 + " Instancias " + sumaInstancias1);
            }

            if (suma12 != "") {
                fusion.add(suma12 + " Instancias " + sumaInstancias12);
            }

            if (suma14 != "") {
                fusion.add(suma14 + " Instancias " + sumaInstancias14);
            }

            if (suma18 != "") {
                fusion.add(suma18 + " Instancias " + sumaInstancias18);
            }

            if (suma116 != "") {
                fusion.add(suma116 + " Instancias" + sumaInstancias116);
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;

    }

    public ArrayList fusionDuracionSI1(String[] referencia, ArrayList instancias, ArrayList centroide) {
        String suma1 = "";
        String suma12 = "";
        String suma14 = "";
        String suma18 = "";
        String suma116 = "";

        int sumaInstancias1 = 0;
        int sumaInstancias12 = 0;
        int sumaInstancias14 = 0;
        int sumaInstancias18 = 0;
        int sumaInstancias116 = 0;

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {
                    if ("1".equals(referencia[i])) {
                        sumaInstancias1 = sumaInstancias1 + Integer.parseInt((String) instancias.get(i));
                        suma1 = suma1 + "[" + i + "]";
                    }

                    if ("1/2".equals(referencia[i])) {
                        sumaInstancias12 = sumaInstancias12 + Integer.parseInt((String) instancias.get(i));
                        suma12 = suma12 + "[" + i + "]";
                    }

                    if ("1/4".equals(referencia[i])) {
                        sumaInstancias14 = sumaInstancias14 + Integer.parseInt((String) instancias.get(i));
                        suma14 = suma14 + "[" + i + "]";

                    }
                    if ("1/8".equals(referencia[i])) {
                        sumaInstancias18 = sumaInstancias18 + Integer.parseInt((String) instancias.get(i));
                        suma18 = suma18 + "[" + i + "]";
                    }
                    if ("1/16".equals(referencia[i])) {
                        sumaInstancias116 = sumaInstancias116 + Integer.parseInt((String) instancias.get(i));
                        suma116 = suma116 + "[" + i + "]";
                    }
                }
            }

            if (suma1 != "") {
                fusion.add(String.valueOf(sumaInstancias1));
            }

            if (suma12 != "") {
                fusion.add(String.valueOf(sumaInstancias12));
            }

            if (suma14 != "") {
                fusion.add(String.valueOf(sumaInstancias14));
            }

            if (suma18 != "") {
                fusion.add(String.valueOf(sumaInstancias18));
            }

            if (suma116 != "") {
                fusion.add(String.valueOf(sumaInstancias116));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

    public ArrayList fusionDuracionSI2(String[] referencia, ArrayList instancias, ArrayList centroide) {
        String suma1 = "";
        String suma12 = "";
        String suma14 = "";
        String suma18 = "";
        String suma116 = "";

        int sumaInstancias1 = 0;
        int sumaInstancias12 = 0;
        int sumaInstancias14 = 0;
        int sumaInstancias18 = 0;
        int sumaInstancias116 = 0;

        int cont1 = 0;
        int cont12 = 0;
        int cont14 = 0;
        int cont18 = 0;
        int cont116 = 0;

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {
                    if ("1".equals(referencia[i])) {
                        cont1 = cont1 + 1;
                        sumaInstancias1 = sumaInstancias1 + Integer.parseInt((String) instancias.get(i));
                        suma1 = suma1 + "[" + i + "]";
                    }

                    if ("1/2".equals(referencia[i])) {
                        cont12 = cont12 + 1;
                        sumaInstancias12 = sumaInstancias12 + Integer.parseInt((String) instancias.get(i));
                        suma12 = suma12 + "[" + i + "]";
                    }

                    if ("1/4".equals(referencia[i])) {
                        cont14 = cont14 + 1;
                        sumaInstancias14 = sumaInstancias14 + Integer.parseInt((String) instancias.get(i));
                        suma14 = suma14 + "[" + i + "]";

                    }
                    if ("1/8".equals(referencia[i])) {
                        cont18 = cont18 + 1;
                        sumaInstancias18 = sumaInstancias18 + Integer.parseInt((String) instancias.get(i));
                        suma18 = suma18 + "[" + i + "]";
                    }
                    if ("1/16".equals(referencia[i])) {
                        cont116 = cont116 + 1;
                        sumaInstancias116 = sumaInstancias116 + Integer.parseInt((String) instancias.get(i));
                        suma116 = suma116 + "[" + i + "]";
                    }
                }
            }

            if (cont1 > 1) {
                fusion.add(String.valueOf(sumaInstancias1));
            }

            if (cont12 > 1) {
                fusion.add(String.valueOf(sumaInstancias12));
            }

            if (cont14 > 1) {
                fusion.add(String.valueOf(sumaInstancias14));
            }

            if (cont18 > 1) {
                fusion.add(String.valueOf(sumaInstancias18));
            }

            if (cont116 > 1) {
                fusion.add(String.valueOf(sumaInstancias116));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

    public ArrayList fusionDuracionPPC(String[] referencia, ArrayList centroide, ArrayList instancias) {
        String suma1 = "";
        String suma12 = "";
        String suma14 = "";
        String suma18 = "";
        String suma116 = "";

        double sumaInstancias1 = 0;
        double sumaInstancias12 = 0;
        double sumaInstancias14 = 0;
        double sumaInstancias18 = 0;
        double sumaInstancias116 = 0;

        double sumapp1 = 0;
        double sumapp12 = 0;
        double sumapp14 = 0;
        double sumapp18 = 0;
        double sumapp116 = 0;

        double producto1 = 0;
        double producto12 = 0;
        double producto14 = 0;
        double producto18 = 0;
        double producto116 = 0;

        promp prom1 = new promp();
        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {

                    if ("1".equals(referencia[i])) {
                        double multi1 = 0;
                        multi1 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstancias1 = sumaInstancias1 + Double.parseDouble((String) instancias.get(i));
                        suma1 = suma1 + "[" + i + "]";
                        sumapp1 = sumapp1 + multi1;

                    }

                    if ("1/2".equals(referencia[i])) {
                        double multi12 = 0;
                        multi12 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstancias12 = sumaInstancias12 + Double.parseDouble((String) instancias.get(i));
                        suma12 = suma12 + "[" + i + "]";
                        sumapp12 = sumapp12 + multi12;
                    }

                    if ("1/4".equals(referencia[i])) {
                        double multi14 = 0;
                        multi14 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstancias14 = sumaInstancias14 + Double.parseDouble((String) instancias.get(i));
                        suma14 = suma14 + "[" + i + "]";
                        sumapp14 = sumapp14 + multi14;
                    }
                    if ("1/8".equals(referencia[i])) {
                        double multi18 = 0;
                        multi18 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstancias18 = sumaInstancias18 + Double.parseDouble((String) instancias.get(i));
                        suma18 = suma18 + "[" + i + "]";
                        sumapp18 = sumapp18 + multi18;
                    }
                    if ("1/16".equals(referencia[i])) {
                        double multi116 = 0;
                        multi116 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstancias116 = sumaInstancias116 + Double.parseDouble((String) instancias.get(i));
                        suma116 = suma116 + "[" + i + "]";
                        sumapp116 = sumapp116 + multi116;
                    }
                }
            }

            if (suma1 != "") {
                fusion.add(suma1 + " PP Centroide " + (sumapp1 / sumaInstancias1));
            }

            if (suma12 != "") {
                fusion.add(suma12 + " PP Centroide " + (sumapp12 / sumaInstancias12));
            }

            if (suma14 != "") {
                fusion.add(suma14 + " PP Centroide " + (sumapp14 / sumaInstancias14));
            }

            if (suma18 != "") {
                fusion.add(suma18 + " PP Centroide " + (sumapp18 / sumaInstancias18));
            }

            if (suma116 != "") {
                fusion.add(suma116 + " PP Centroide " + (sumapp116 / sumaInstancias116));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

    public ArrayList fusionDuracionPPC1(String[] referencia, ArrayList centroide, ArrayList instancias) {
        String suma1 = "";
        String suma12 = "";
        String suma14 = "";
        String suma18 = "";
        String suma116 = "";

        double pp1 = 0;
        double pp12 = 0;
        double pp14 = 0;
        double pp18 = 0;
        double pp116 = 0;

        double sumaInstancias1 = 0;
        double sumaInstancias12 = 0;
        double sumaInstancias14 = 0;
        double sumaInstancias18 = 0;
        double sumaInstancias116 = 0;

        double sumapp1 = 0;
        double sumapp12 = 0;
        double sumapp14 = 0;
        double sumapp18 = 0;
        double sumapp116 = 0;

        double producto1 = 0;
        double producto12 = 0;
        double producto14 = 0;
        double producto18 = 0;
        double producto116 = 0;

        promp prom1 = new promp();
        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {

                    if ("1".equals(referencia[i])) {
                        double multi1 = 0;
                        multi1 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstancias1 = sumaInstancias1 + Double.parseDouble((String) instancias.get(i));
                        suma1 = suma1 + "[" + i + "]";
                        sumapp1 = sumapp1 + multi1;

                    }

                    if ("1/2".equals(referencia[i])) {
                        double multi12 = 0;
                        multi12 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstancias12 = sumaInstancias12 + Double.parseDouble((String) instancias.get(i));
                        suma12 = suma12 + "[" + i + "]";
                        sumapp12 = sumapp12 + multi12;
                    }

                    if ("1/4".equals(referencia[i])) {
                        double multi14 = 0;
                        multi14 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstancias14 = sumaInstancias14 + Double.parseDouble((String) instancias.get(i));
                        suma14 = suma14 + "[" + i + "]";
                        sumapp14 = sumapp14 + multi14;
                    }
                    if ("1/8".equals(referencia[i])) {
                        double multi18 = 0;
                        multi18 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstancias18 = sumaInstancias18 + Double.parseDouble((String) instancias.get(i));
                        suma18 = suma18 + "[" + i + "]";
                        sumapp18 = sumapp18 + multi18;
                    }
                    if ("1/16".equals(referencia[i])) {
                        double multi116 = 0;
                        multi116 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstancias116 = sumaInstancias116 + Double.parseDouble((String) instancias.get(i));
                        suma116 = suma116 + "[" + i + "]";
                        sumapp116 = sumapp116 + multi116;
                    }
                }
            }

            if (suma1 != "") {
                pp1 = sumapp1 / sumaInstancias1;
                fusion.add(String.valueOf(pp1));
            }

            if (suma12 != "") {
                pp12 = sumapp12 / sumaInstancias12;
                fusion.add(String.valueOf(pp12));
            }

            if (suma14 != "") {
                pp14 = sumapp14 / sumaInstancias14;
                fusion.add(String.valueOf(pp14));
            }

            if (suma18 != "") {
                pp18 = sumapp18 / sumaInstancias18;
                fusion.add(String.valueOf(pp18));
            }

            if (suma116 != "") {
                pp116 = sumapp116 / sumaInstancias116;
                fusion.add(String.valueOf(pp116));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

    public ArrayList fusionDuracionPPC2(String[] referencia, ArrayList centroide, ArrayList instancias) {
        String suma1 = "";
        String suma12 = "";
        String suma14 = "";
        String suma18 = "";
        String suma116 = "";

        double pp1 = 0;
        double pp12 = 0;
        double pp14 = 0;
        double pp18 = 0;
        double pp116 = 0;

        double sumaInstancias1 = 0;
        double sumaInstancias12 = 0;
        double sumaInstancias14 = 0;
        double sumaInstancias18 = 0;
        double sumaInstancias116 = 0;

        double sumapp1 = 0;
        double sumapp12 = 0;
        double sumapp14 = 0;
        double sumapp18 = 0;
        double sumapp116 = 0;

        int cont1 = 0;
        int cont12 = 0;
        int cont14 = 0;
        int cont18 = 0;
        int cont116 = 0;

        promp prom1 = new promp();
        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("0.0".equals(centroide.get(i))) {

                } else {
                    if ("1".equals(referencia[i])) {
                        cont1 = cont1 + 1;
                        double multi1 = 0;
                        multi1 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstancias1 = sumaInstancias1 + Double.parseDouble((String) instancias.get(i));
                        suma1 = suma1 + "[" + i + "]";
                        sumapp1 = sumapp1 + multi1;

                    }

                    if ("1/2".equals(referencia[i])) {
                        cont12 = cont12 + 1;
                        double multi12 = 0;
                        multi12 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstancias12 = sumaInstancias12 + Double.parseDouble((String) instancias.get(i));
                        suma12 = suma12 + "[" + i + "]";
                        sumapp12 = sumapp12 + multi12;
                    }

                    if ("1/4".equals(referencia[i])) {
                        cont14 = cont14 + 1;
                        double multi14 = 0;
                        multi14 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstancias14 = sumaInstancias14 + Double.parseDouble((String) instancias.get(i));
                        suma14 = suma14 + "[" + i + "]";
                        sumapp14 = sumapp14 + multi14;
                    }
                    if ("1/8".equals(referencia[i])) {
                        cont18 = cont18 + 1;
                        double multi18 = 0;
                        multi18 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstancias18 = sumaInstancias18 + Double.parseDouble((String) instancias.get(i));
                        suma18 = suma18 + "[" + i + "]";
                        sumapp18 = sumapp18 + multi18;
                    }
                    if ("1/16".equals(referencia[i])) {
                        cont116 = cont116 + 1;
                        double multi116 = 0;
                        multi116 = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                        sumaInstancias116 = sumaInstancias116 + Double.parseDouble((String) instancias.get(i));
                        suma116 = suma116 + "[" + i + "]";
                        sumapp116 = sumapp116 + multi116;
                    }
                }
            }

            if (cont1 > 1) {
                pp1 = sumapp1 / sumaInstancias1;
                fusion.add(String.valueOf(pp1));
            }

            if (cont12 > 1) {
                pp12 = sumapp12 / sumaInstancias12;
                fusion.add(String.valueOf(pp12));
            }

            if (cont14 > 1) {
                pp14 = sumapp14 / sumaInstancias14;
                fusion.add(String.valueOf(pp14));
            }

            if (cont18 > 1) {
                pp18 = sumapp18 / sumaInstancias18;
                fusion.add(String.valueOf(pp18));
            }

            if (cont116 > 1) {
                pp116 = sumapp116 / sumaInstancias116;
                fusion.add(String.valueOf(pp116));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

    public ArrayList fusionDuracionInstancias(String[] referencia, ArrayList noCluster, ArrayList Instancia) {
        String suma1 = "";
        String suma12 = "";
        String suma14 = "";
        String suma18 = "";
        String suma116 = "";

        String suma11 = "";
        String suma121 = "";
        String suma141 = "";
        String suma181 = "";
        String suma1161 = "";

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {

                if ("1".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            suma1 = suma1 + Instancia.get(j).toString() + ",";
                        }
                    }

                    suma11 = suma11 + "[" + i + "]";
                }

                if ("1/2".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            suma12 = suma12 + Instancia.get(j).toString() + ",";
                        }
                    }

                    suma121 = suma121 + "[" + i + "]";
                }

                if ("1/4".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            suma14 = suma14 + Instancia.get(j).toString() + ",";
                        }
                    }

                    suma141 = suma141 + "[" + i + "]";
                }
                if ("1/8".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            suma18 = suma18 + Instancia.get(j).toString() + ",";
                        }
                    }

                    suma181 = suma181 + "[" + i + "]";
                }
                if ("1/16".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {
                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            suma116 = suma116 + Instancia.get(j).toString() + ",";
                        }
                    }

                    suma1161 = suma1161 + "[" + i + "]";
                }

            }

            if (suma11 != "") {
                fusion.add("Cluster " + suma11 + " " + suma1);
            }

            if (suma121 != "") {
                fusion.add("Cluster " + suma121 + " " + suma12);
            }

            if (suma141 != "") {
                fusion.add("Cluster " + suma141 + " " + suma14);
            }

            if (suma181 != "") {
                fusion.add("Cluster " + suma181 + " " + suma18);
            }

            if (suma1161 != "") {
                fusion.add("Cluster " + suma1161 + " " + suma116);
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return fusion;
    }

}
