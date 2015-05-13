package ObjeAux;

import java.util.ArrayList;

public class calculo_tempo {

    double tempo1[] = {60, 65, 70, 80, 95, 110, 120, 145, 180, 220};

    double total1[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    int iPosision = 0;
    // public static ArrayList contador; 

////////// CALCULAR DISTANCIA MINIMA /////////////    
    public ArrayList calcular(ArrayList arreglo) {
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
                        // System.out.println("La posicion del arreglo es: "+total1[i]);

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

        // double arreglo [arreglo1];
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
                        // System.out.println("La posicion del arreglo es: "+total1[i]);

                        resultado = total1[i];
                        iPosision = i;
                    }
                }

                if (iPosision == 0) {
                    cal.add("ADAGIO");

                }

                if (iPosision == 1) {

                    cal.add("ADAGGIETO");

                }

                if (iPosision == 2) {

                    cal.add("ANDANTE");

                }
                if (iPosision == 3) {

                    cal.add("ANDANTINO");

                }
                if (iPosision == 4) {

                    cal.add("MODERATO");

                }
                if (iPosision == 5) {

                    cal.add("ALEGRETO");

                }
                if (iPosision == 6) {

                    cal.add("ALLEGRO");

                }

                if (iPosision == 7) {

                    cal.add("VIVANCE");

                }

                if (iPosision == 8) {

                    cal.add("PRESTO");

                }

                if (iPosision == 9) {

                    cal.add("PRESSTISIMO");

                }

            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return cal;
    }

    //////////// CALCULO CLUSTER MAYOR INSTANCIAS ///////////
    public ArrayList calculoPosisionpb(ArrayList arreglo) {

        ArrayList cal = new ArrayList();

        try {

            double total = 0;
            double res = 0;
            double pot = 0;
            double minimo = 0;

            double resultado = Double.parseDouble((String) arreglo.get(0));

            iPosision = 0;

            // sumar el valor de cada elemento al total
            for (int i = 0; i < arreglo.size(); i++) {

                if (Double.parseDouble((String) arreglo.get(i)) > resultado) {

                    resultado = Double.parseDouble((String) arreglo.get(i));
                    iPosision = i;
                    // System.out.println("El menor numero de instacias es: "+ resultado);

                    cal.add(resultado);
                }
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return cal;
    }

    //////////// CALCULO CLUSTER MAYOR INSTANCIAS ///////////
    public ArrayList calculoPosisionpb1(ArrayList arreglo) {
        ArrayList cal = new ArrayList();
        try {

            double total = 0;
            double res = 0;
            double pot = 0;
            double minimo = 0;

            double resultado = Double.parseDouble((String) arreglo.get(0));

            iPosision = 0;
            // sumar el valor de cada elemento al total

            for (int i = 0; i < arreglo.size(); i++) {
                if (Double.parseDouble((String) arreglo.get(i)) > resultado) {
                    resultado = Double.parseDouble((String) arreglo.get(i));
                    iPosision = i;
                    // System.out.println("El menor numero de instacias es: "+ resultado);
                    cal.add(resultado);
                }
            }

            cal.add(iPosision);
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return cal;
    }

    ///////////////////////  CALCULAR MENOR  /////////////////   
    public ArrayList calcularMenor() {
        ArrayList menor = new ArrayList();
        double resultado = total1[0];
        for (int i = 0; i < total1.length; i++) {
            if (total1[i] < resultado) {
                resultado = total1[i];
                iPosision = i;
            }
        }

        menor.add("La Distancia Minima es: " + resultado + "Corrsponde a la posision: " + iPosision);
        System.out.println("La Distancia Minima es: " + resultado);
        System.out.println("Se encuntra en la posicion: " + iPosision);
        return menor;

    }

    public ArrayList calcularMayor() {
        ArrayList menor = new ArrayList();
        double resultado = total1[0];
        for (int i = 0; i < total1.length; i++) {
            if (total1[i] > resultado) {
                resultado = total1[i];
            }
        }
        menor.add("La Distancia Maxima es: " + resultado + "");
        System.out.println("La Distancia Maxima es: " + resultado + "");
        return menor;

    }

    public ArrayList fusionTempo(String[] referencia) {
        String sumaAdagio = "";
        String sumaAdaggieto = "";
        String sumaAndante = "";
        String sumaAndantino = "";
        String sumaModerato = "";
        String sumaAlegreto = "";
        String sumaAllegro = "";
        String sumaVivance = "";
        String sumaPresto = "";
        String sumaPresstisimo = "";

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {

                if ("ADAGIO".equals(referencia[i])) {
                    sumaAdagio = sumaAdagio + "CLUSTER [" + i + "]" + referencia[i] + " ";
                }

                if ("ADAGGIETO".equals(referencia[i])) {

                    sumaAdaggieto = sumaAdaggieto + "CLUSTER [" + i + "]" + referencia[i] + " ";

                }

                if ("ANDANTE".equals(referencia[i])) {

                    sumaAndante = sumaAndante + "CLUSTER [" + i + "]" + referencia[i] + " ";

                }
                if ("ANDANTINO".equals(referencia[i])) {

                    sumaAndantino = sumaAndantino + "CLUSTER [" + i + "]" + referencia[i] + " ";

                }
                if ("MODERATO".equals(referencia[i])) {

                    sumaModerato = sumaModerato + "CLUSTER [" + i + "]" + referencia[i] + " ";

                }
                if ("ALEGRETO".equals(referencia[i])) {

                    sumaAlegreto = sumaAlegreto + "CLUSTER [" + i + "]" + referencia[i] + " ";

                }
                if ("ALLEGRO".equals(referencia[i])) {

                    sumaAllegro = sumaAllegro + "CLUSTER [" + i + "]" + referencia[i] + " ";

                }

                if ("VIVANCE".equals(referencia[i])) {

                    sumaVivance = sumaVivance + "CLUSTER [" + i + "]" + referencia[i] + " ";

                }

                if ("PRESTO".equals(referencia[i])) {

                    sumaPresto = sumaPresto + "CLUSTER [" + i + "]" + referencia[i] + " ";

                }

                if ("PRESSTISIMO".equals(referencia[i])) {

                    sumaPresstisimo = sumaPresstisimo + "CLUSTER [" + i + "]" + referencia[i] + " ";

                }

            }
            if (sumaAdagio != "") {
                fusion.add(sumaAdagio);
            }

            if (sumaAdaggieto != "") {
                fusion.add(sumaAdaggieto);
            }
            if (sumaAndante != "") {
                fusion.add(sumaAndante);
            }
            if (sumaAndantino != "") {
                fusion.add(sumaAndantino);
            }
            if (sumaModerato != "") {
                fusion.add(sumaModerato);
            }
            if (sumaAlegreto != "") {
                fusion.add(sumaAlegreto);
            }
            if (sumaAllegro != "") {
                fusion.add(sumaAllegro);
            }

            if (sumaVivance != "") {
                fusion.add(sumaVivance);
            }
            if (sumaPresto != "") {
                fusion.add(sumaPresto);
            }
            if (sumaPresstisimo != "") {
                fusion.add(sumaPresstisimo);
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

//////////////////// ******   FUSIÓN DE CÚMULOS ******* //////////////////////
/////////////////// ****** /////////////////// ******* //////////////////////     
    public ArrayList fusionTempoPMC(String[] referencia, ArrayList centroide) {
        String sumaAdagio = "";
        String sumaAdaggieto = "";
        String sumaAndante = "";
        String sumaAndantino = "";
        String sumaModerato = "";
        String sumaAlegreto = "";
        String sumaAllegro = "";
        String sumaVivance = "";
        String sumaPresto = "";
        String sumaPresstisimo = "";

        double sumaCentroideAdagio = 0;
        double sumaCentroideAdaggieto = 0;
        double sumaCentroideAndante = 0;
        double sumaCentroideAndantino = 0;
        double sumaCentroideModerato = 0;
        double sumaCentroideAlegreto = 0;
        double sumaCentroideAllegro = 0;
        double sumaCentroideVivance = 0;
        double sumaCentroidePresto = 0;
        double sumaCentroidePrestismo = 0;

        double banAdagio = 0;
        double banAdaggieto = 0;
        double banAndante = 0;
        double banAndantino = 0;
        double banModerato = 0;
        double banAlegreto = 0;
        double banAllegro = 0;
        double banVivance = 0;
        double banPresto = 0;
        double banPresstisimo = 0;

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {

                if ("ADAGIO".equals(referencia[i])) {

                    banAdagio = banAdagio + 1;

                    sumaCentroideAdagio = sumaCentroideAdagio + Double.parseDouble((String) centroide.get(i));

                    sumaAdagio = sumaAdagio + "[" + i + "]";

                }

                if ("ADAGGIETO".equals(referencia[i])) {

                    banAdaggieto = banAdaggieto + 1;

                    sumaCentroideAdaggieto = sumaCentroideAdaggieto + Double.parseDouble((String) centroide.get(i));

                    sumaAdaggieto = sumaAdaggieto + "[" + i + "]";

                }

                if ("ANDANTE".equals(referencia[i])) {

                    banAndante = banAndante + 1;

                    sumaCentroideAndante = sumaCentroideAndante + Double.parseDouble((String) centroide.get(i));

                    sumaAndante = sumaAndante + "[" + i + "]";

                }
                if ("ANDANTINO".equals(referencia[i])) {
                    banAndantino = banAndantino + 1;
                    sumaCentroideAndantino = sumaCentroideAndantino + Double.parseDouble((String) centroide.get(i));

                    sumaAndantino = sumaAndantino + "[" + i + "]";

                }
                if ("MODERATO".equals(referencia[i])) {

                    banModerato = banModerato + 1;
                    sumaCentroideModerato = sumaCentroideModerato + Double.parseDouble((String) centroide.get(i));

                    sumaModerato = sumaModerato + "[" + i + "]";
                }
                if ("ALEGRETO".equals(referencia[i])) {
                    banAlegreto = banAlegreto + 1;
                    sumaCentroideAlegreto = sumaCentroideAlegreto + Double.parseDouble((String) centroide.get(i));

                    sumaAlegreto = sumaAlegreto + "[" + i + "]";

                }
                if ("ALLEGRO".equals(referencia[i])) {
                    banAllegro = banAllegro + 1;
                    sumaCentroideAllegro = sumaCentroideAllegro + Double.parseDouble((String) centroide.get(i));
                    sumaAllegro = sumaAllegro + "[" + i + "]";

                }

                if ("VIVANCE".equals(referencia[i])) {

                    banVivance = banVivance + 1;
                    sumaCentroideVivance = sumaCentroideVivance + Double.parseDouble((String) centroide.get(i));
                    sumaVivance = sumaVivance + "[" + i + "]";

                }

                if ("PRESTO".equals(referencia[i])) {
                    banPresto = banPresto + 1;
                    sumaCentroidePresto = sumaCentroidePresto + Double.parseDouble((String) centroide.get(i));
                    sumaPresto = sumaPresto + "[" + i + "]";

                }

                if ("PRESSTISIMO".equals(referencia[i])) {
                    banPresstisimo = banPresstisimo + 1.0;
                    sumaCentroidePrestismo = sumaCentroidePrestismo + Double.parseDouble((String) centroide.get(i));
                    sumaPresstisimo = sumaPresstisimo + "[" + i + "]";

                }
            }

            if (sumaAdagio != "") {
                fusion.add(sumaAdagio + " PA Centroide " + (sumaCentroideAdagio / banAdagio));
            }

            if (sumaAdaggieto != "") {
                fusion.add(sumaAdaggieto + " PA Centroide " + (sumaCentroideAdaggieto / banAdaggieto));
            }

            if (sumaAndante != "") {
                fusion.add(sumaAndante + " PA Centroide " + (sumaCentroideAndante / banAndante));
            }

            if (sumaAndantino != "") {
                fusion.add(sumaAndantino + " PA Centroide " + (sumaCentroideAndantino / banAndantino));
            }

            if (sumaModerato != "") {
                fusion.add(sumaModerato + " PA Centroide " + (sumaCentroideModerato / banModerato));
            }

            if (sumaAlegreto != "") {
                fusion.add(sumaAlegreto + " PA Centroide " + (sumaCentroideAlegreto / banAlegreto));
            }
            if (sumaAllegro != "") {
                fusion.add(sumaAllegro + " PA Centroide " + (sumaCentroideAllegro / banAllegro));
            }

            if (sumaVivance != "") {
                fusion.add(sumaVivance + " PA Centroide: " + (sumaCentroideVivance / banVivance));
            }
            if (sumaPresto != "") {
                fusion.add(sumaPresto + " PA Centroide " + (sumaCentroidePresto / banPresto));
            }
            if (sumaPresstisimo != "") {
                fusion.add(sumaPresstisimo + " PA Centroide " + (sumaCentroidePrestismo / banPresstisimo));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;

    }

    public ArrayList fusionTempoSI(String[] referencia, ArrayList instancias, ArrayList centroide) {

        String sumaAdagio = "";
        String sumaAdaggieto = "";
        String sumaAndante = "";
        String sumaAndantino = "";
        String sumaModerato = "";
        String sumaAlegreto = "";
        String sumaAllegro = "";
        String sumaVivance = "";
        String sumaPresto = "";
        String sumaPresstisimo = "";

        int sumaInstanciasAdagio = 0;
        int sumaInstanciasAdaggieto = 0;
        int sumaInstanciasAndante = 0;
        int sumaInstanciasAndantino = 0;
        int sumaInstanciasModerato = 0;
        int sumaInstanciasAlegreto = 0;
        int sumaInstanciasAllegro = 0;
        int sumaInstanciasVivance = 0;
        int sumaInstanciasPresto = 0;
        int sumaInstanciasPrestismo = 0;

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {

                if ("ADAGIO".equals(referencia[i])) {
                    sumaInstanciasAdagio = sumaInstanciasAdagio + Integer.parseInt((String) instancias.get(i));
                    sumaAdagio = sumaAdagio + "[" + i + "]";

                }

                if ("ADAGGIETO".equals(referencia[i])) {
                    sumaInstanciasAdaggieto = sumaInstanciasAdaggieto + Integer.parseInt((String) instancias.get(i));
                    sumaAdaggieto = sumaAdaggieto + "[" + i + "]";

                }

                if ("ANDANTE".equals(referencia[i])) {
                    sumaInstanciasAndante = sumaInstanciasAndante + Integer.parseInt((String) instancias.get(i));
                    sumaAndante = sumaAndante + "[" + i + "]";

                }
                if ("ANDANTINO".equals(referencia[i])) {
                    sumaInstanciasAndantino = sumaInstanciasAndantino + Integer.parseInt((String) instancias.get(i));
                    sumaAndantino = sumaAndantino + "[" + i + "]";
                }
                if ("MODERATO".equals(referencia[i])) {
                    sumaInstanciasModerato = sumaInstanciasModerato + Integer.parseInt((String) instancias.get(i));
                    sumaModerato = sumaModerato + "[" + i + "]";
                }
                if ("ALEGRETO".equals(referencia[i])) {
                    sumaInstanciasAlegreto = sumaInstanciasAlegreto + Integer.parseInt((String) instancias.get(i));
                    sumaAlegreto = sumaAlegreto + "[" + i + "]";
                }
                if ("ALLEGRO".equals(referencia[i])) {
                    sumaInstanciasAllegro = sumaInstanciasAllegro + Integer.parseInt((String) instancias.get(i));
                    sumaAllegro = sumaAllegro + "[" + i + "]";
                }

                if ("VIVANCE".equals(referencia[i])) {
                    sumaInstanciasVivance = sumaInstanciasVivance + Integer.parseInt((String) instancias.get(i));
                    sumaVivance = sumaVivance + "[" + i + "]";
                }

                if ("PRESTO".equals(referencia[i])) {
                    sumaInstanciasPresto = sumaInstanciasPresto + Integer.parseInt((String) instancias.get(i));
                    sumaPresto = sumaPresto + "[" + i + "]";
                }

                if ("PRESSTISIMO".equals(referencia[i])) {
                    sumaInstanciasPrestismo = sumaInstanciasPrestismo + Integer.parseInt((String) instancias.get(i));
                    sumaPresstisimo = sumaPresstisimo + "[" + i + "]";
                }
            }

            ////////////////////////////////////////////////
            if (sumaAdagio != "") {
                fusion.add(sumaAdagio + " Instancias " + sumaInstanciasAdagio);
            }

            if (sumaAdaggieto != "") {
                fusion.add(sumaAdaggieto + " Instancias " + sumaInstanciasAdaggieto);
            }

            if (sumaAndante != "") {
                fusion.add(sumaAndante + " Instancias " + sumaInstanciasAndante);
            }

            if (sumaAndantino != "") {
                fusion.add(sumaAndantino + " Instancias " + sumaInstanciasAndantino);
            }

            if (sumaModerato != "") {
                fusion.add(sumaModerato + " Instancias" + sumaInstanciasModerato);
            }

            if (sumaAlegreto != "") {
                fusion.add(sumaAlegreto + " Instancias " + sumaInstanciasAlegreto);
            }
            if (sumaAllegro != "") {
                fusion.add(sumaAllegro + " Instancias " + sumaInstanciasAllegro);
            }

            if (sumaVivance != "") {
                fusion.add(sumaVivance + " Instancias " + sumaInstanciasVivance);
            }
            if (sumaPresto != "") {
                fusion.add(sumaPresto + " Instancias " + sumaInstanciasPresto);
            }
            if (sumaPresstisimo != "") {
                fusion.add(sumaPresstisimo + " Instancias " + sumaInstanciasPrestismo);
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;

    }

    public ArrayList fusionTempoSI1(String[] referencia, ArrayList instancias, ArrayList centroide) {
        String sumaAdagio = "";
        String sumaAdaggieto = "";
        String sumaAndante = "";
        String sumaAndantino = "";
        String sumaModerato = "";
        String sumaAlegreto = "";
        String sumaAllegro = "";
        String sumaVivance = "";
        String sumaPresto = "";
        String sumaPresstisimo = "";

        int sumaInstanciasAdagio = 0;
        int sumaInstanciasAdaggieto = 0;
        int sumaInstanciasAndante = 0;
        int sumaInstanciasAndantino = 0;
        int sumaInstanciasModerato = 0;
        int sumaInstanciasAlegreto = 0;
        int sumaInstanciasAllegro = 0;
        int sumaInstanciasVivance = 0;
        int sumaInstanciasPresto = 0;
        int sumaInstanciasPrestismo = 0;
        ArrayList fusion = new ArrayList();

        try {
            for (int i = 0; i < referencia.length; i++) {

                if ("ADAGIO".equals(referencia[i])) {
                    sumaInstanciasAdagio = sumaInstanciasAdagio + Integer.parseInt((String) instancias.get(i));
                    sumaAdagio = sumaAdagio + "[" + i + "]";
                }
                if ("ADAGGIETO".equals(referencia[i])) {
                    sumaInstanciasAdaggieto = sumaInstanciasAdaggieto + Integer.parseInt((String) instancias.get(i));
                    sumaAdaggieto = sumaAdaggieto + "[" + i + "]";
                }
                if ("ANDANTE".equals(referencia[i])) {
                    sumaInstanciasAndante = sumaInstanciasAndante + Integer.parseInt((String) instancias.get(i));
                    sumaAndante = sumaAndante + "[" + i + "]";
                }
                if ("ANDANTINO".equals(referencia[i])) {
                    sumaInstanciasAndantino = sumaInstanciasAndantino + Integer.parseInt((String) instancias.get(i));
                    sumaAndantino = sumaAndantino + "[" + i + "]";
                }
                if ("MODERATO".equals(referencia[i])) {
                    sumaInstanciasModerato = sumaInstanciasModerato + Integer.parseInt((String) instancias.get(i));
                    sumaModerato = sumaModerato + "[" + i + "]";
                }
                if ("ALEGRETO".equals(referencia[i])) {
                    sumaInstanciasAlegreto = sumaInstanciasAlegreto + Integer.parseInt((String) instancias.get(i));
                    sumaAlegreto = sumaAlegreto + "[" + i + "]";
                }
                if ("ALLEGRO".equals(referencia[i])) {
                    sumaInstanciasAllegro = sumaInstanciasAllegro + Integer.parseInt((String) instancias.get(i));
                    sumaAllegro = sumaAllegro + "[" + i + "]";
                }

                if ("VIVANCE".equals(referencia[i])) {
                    sumaInstanciasVivance = sumaInstanciasVivance + Integer.parseInt((String) instancias.get(i));
                    sumaVivance = sumaVivance + "[" + i + "]";
                }
                if ("PRESTO".equals(referencia[i])) {
                    sumaInstanciasPresto = sumaInstanciasPresto + Integer.parseInt((String) instancias.get(i));
                    sumaPresto = sumaPresto + "[" + i + "]";
                }
                if ("PRESSTISIMO".equals(referencia[i])) {
                    sumaInstanciasPrestismo = sumaInstanciasPrestismo + Integer.parseInt((String) instancias.get(i));
                    sumaPresstisimo = sumaPresstisimo + "[" + i + "]";
                }
            }

            if (sumaAdagio != "") {
                fusion.add(String.valueOf(sumaInstanciasAdagio));
            }
            if (sumaAdaggieto != "") {
                fusion.add(String.valueOf(sumaInstanciasAdaggieto));
            }
            if (sumaAndante != "") {
                fusion.add(String.valueOf(sumaInstanciasAndante));
            }
            if (sumaAndantino != "") {
                fusion.add(String.valueOf(sumaInstanciasAndantino));
            }
            if (sumaModerato != "") {
                fusion.add(String.valueOf(sumaInstanciasModerato));
            }
            if (sumaAlegreto != "") {
                fusion.add(String.valueOf(sumaInstanciasAlegreto));
            }
            if (sumaAllegro != "") {
                fusion.add(String.valueOf(sumaInstanciasAllegro));
            }
            if (sumaVivance != "") {
                fusion.add(String.valueOf(sumaInstanciasVivance));
            }
            if (sumaPresto != "") {
                fusion.add(String.valueOf(sumaInstanciasPresto));
            }
            if (sumaPresstisimo != "") {
                fusion.add(String.valueOf(sumaInstanciasPrestismo));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return fusion;
    }

    public ArrayList fusionTempoSI2(String[] referencia, ArrayList instancias, ArrayList centroide) {

        int contAdagio = 0;
        int contAdaggieto = 0;
        int contAndante = 0;
        int contAndantino = 0;
        int contModerato = 0;
        int contAlegreto = 0;
        int contAllegro = 0;
        int contVivance = 0;
        int contPresto = 0;
        int contPresstisimo = 0;

        String sumaAdagio = "";
        String sumaAdaggieto = "";
        String sumaAndante = "";
        String sumaAndantino = "";
        String sumaModerato = "";
        String sumaAlegreto = "";
        String sumaAllegro = "";
        String sumaVivance = "";
        String sumaPresto = "";
        String sumaPresstisimo = "";

        int sumaInstanciasAdagio = 0;
        int sumaInstanciasAdaggieto = 0;
        int sumaInstanciasAndante = 0;
        int sumaInstanciasAndantino = 0;
        int sumaInstanciasModerato = 0;
        int sumaInstanciasAlegreto = 0;
        int sumaInstanciasAllegro = 0;
        int sumaInstanciasVivance = 0;
        int sumaInstanciasPresto = 0;
        int sumaInstanciasPrestismo = 0;

        ArrayList contador = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {

                if ("ADAGIO".equals(referencia[i])) {
                    contAdagio = contAdagio + 1;
                    sumaInstanciasAdagio = sumaInstanciasAdagio + Integer.parseInt((String) instancias.get(i));
                    sumaAdagio = sumaAdagio + "[" + i + "]";

                }

                if ("ADAGGIETO".equals(referencia[i])) {
                    contAdaggieto = contAdaggieto + 1;
                    sumaInstanciasAdaggieto = sumaInstanciasAdaggieto + Integer.parseInt((String) instancias.get(i));
                    sumaAdaggieto = sumaAdaggieto + "[" + i + "]";

                }

                if ("ANDANTE".equals(referencia[i])) {
                    contAndante = contAndante + 1;
                    sumaInstanciasAndante = sumaInstanciasAndante + Integer.parseInt((String) instancias.get(i));
                    sumaAndante = sumaAndante + "[" + i + "]";

                }
                if ("ANDANTINO".equals(referencia[i])) {
                    contAndantino = contAndantino + 1;
                    sumaInstanciasAndantino = sumaInstanciasAndantino + Integer.parseInt((String) instancias.get(i));
                    sumaAndantino = sumaAndantino + "[" + i + "]";
                }
                if ("MODERATO".equals(referencia[i])) {
                    contModerato = contModerato + 1;
                    sumaInstanciasModerato = sumaInstanciasModerato + Integer.parseInt((String) instancias.get(i));
                    sumaModerato = sumaModerato + "[" + i + "]";
                }
                if ("ALEGRETO".equals(referencia[i])) {
                    contAlegreto = contAlegreto + 1;
                    sumaInstanciasAlegreto = sumaInstanciasAlegreto + Integer.parseInt((String) instancias.get(i));
                    sumaAlegreto = sumaAlegreto + "[" + i + "]";
                }
                if ("ALLEGRO".equals(referencia[i])) {
                    contAllegro = contAllegro + 1;
                    sumaInstanciasAllegro = sumaInstanciasAllegro + Integer.parseInt((String) instancias.get(i));
                    sumaAllegro = sumaAllegro + "[" + i + "]";
                }

                if ("VIVANCE".equals(referencia[i])) {
                    contVivance = contVivance + 1;
                    sumaInstanciasVivance = sumaInstanciasVivance + Integer.parseInt((String) instancias.get(i));
                    sumaVivance = sumaVivance + "[" + i + "]";
                }

                if ("PRESTO".equals(referencia[i])) {
                    contPresto = contPresto + 1;
                    sumaInstanciasPresto = sumaInstanciasPresto + Integer.parseInt((String) instancias.get(i));
                    sumaPresto = sumaPresto + "[" + i + "]";
                }

                if ("PRESSTISIMO".equals(referencia[i])) {
                    contPresstisimo = contPresstisimo + 1;
                    sumaInstanciasPrestismo = sumaInstanciasPrestismo + Integer.parseInt((String) instancias.get(i));
                    sumaPresstisimo = sumaPresstisimo + "[" + i + "]";
                }
            }

            /////////////// RECOMENDACION DE CLUSTER FUSIONADOS ///////////
            if (contAdagio > 1) {
                contador.add(String.valueOf(sumaInstanciasAdagio));
            }

            if (contAdaggieto > 1) {
                contador.add(String.valueOf(sumaInstanciasAdaggieto));
            }

            if (contAndante > 1) {
                contador.add(String.valueOf(sumaInstanciasAndante));
            }

            if (contAndantino > 1) {
                contador.add(String.valueOf(sumaInstanciasAndantino));
            }

            if (contModerato > 1) {
                contador.add(String.valueOf(sumaInstanciasModerato));
            }

            if (contAlegreto > 1) {
                contador.add(String.valueOf(sumaInstanciasAlegreto));
            }

            if (contAllegro > 1) {
                contador.add(String.valueOf(sumaInstanciasAllegro));
            }
            if (contVivance > 1) {
                contador.add(String.valueOf(sumaInstanciasVivance));
            }
            if (contPresto > 1) {
                contador.add(String.valueOf(sumaInstanciasPresto));
            }
            if (contPresstisimo > 1) {
                contador.add(String.valueOf(sumaInstanciasPrestismo));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return contador;

    }

    public ArrayList fusionTempoPPC(String[] referencia, ArrayList centroide, ArrayList instancias) {
        String sumaAdagio = "";
        String sumaAdaggieto = "";
        String sumaAndante = "";
        String sumaAndantino = ""; //
        String sumaModerato = "";
        String sumaAlegreto = "";
        String sumaAllegro = "";
        String sumaVivance = "";
        String sumaPresto = "";
        String sumaPresstisimo = "";

        double sumaInstanciasAdagio = 0;
        double sumaInstanciasAdaggieto = 0;
        double sumaInstanciasAndante = 0;
        double sumaInstanciasAndantino = 0;
        double sumaInstanciasModerato = 0;
        double sumaInstanciasAlegreto = 0;
        double sumaInstanciasAllegro = 0;
        double sumaInstanciasVivance = 0;
        double sumaInstanciasPresto = 0;
        double sumaInstanciasPrestismo = 0;

        double sumappAdagio = 0;
        double sumappAdaggieto = 0;
        double sumappAndante = 0;
        double sumappAndantino = 0;
        double sumappModerato = 0;
        double sumappAlegreto = 0;
        double sumappAllegro = 0;
        double sumappVivance = 0;
        double sumappPresto = 0;
        double sumappPrestismo = 0;

        double productoAdagio = 0;
        double productoAdaggieto = 0;
        double productoAndante = 0;
        double productoAndantino = 0;
        double productoModerato = 0;
        double productoAlegreto = 0;
        double productoAllegro = 0;
        double productoVivance = 0;
        double productoPresto = 0;
        double productoPrestismo = 0;

        promp prom1 = new promp();
        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {

                if ("ADAGIO".equals(referencia[i])) {

                    double multiAdagio = 0;

                    multiAdagio = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));

                    sumaInstanciasAdagio = sumaInstanciasAdagio + Double.parseDouble((String) instancias.get(i));

                    sumaAdagio = sumaAdagio + "[" + i + "]";

                    sumappAdagio = sumappAdagio + multiAdagio;

                }

                if ("ADAGGIETO".equals(referencia[i])) {

                    double multiAdaggieto = 0;

                    multiAdaggieto = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));

                    sumaInstanciasAdaggieto = sumaInstanciasAdaggieto + Double.parseDouble((String) instancias.get(i));

                    sumaAdaggieto = sumaAdaggieto + "[" + i + "]";

                    sumappAdaggieto = sumappAdaggieto + multiAdaggieto;
                }

                if ("ANDANTE".equals(referencia[i])) {

                    double multiAndante = 0;

                    multiAndante = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));

                    sumaInstanciasAndante = sumaInstanciasAndante + Double.parseDouble((String) instancias.get(i));

                    sumaAndante = sumaAndante + "[" + i + "]";

                    sumappAndante = sumappAndante + multiAndante;

                }
                if ("ANDANTINO".equals(referencia[i])) {
                    System.out.println("//////////////////////////////////////////////////////////////1111" + referencia[i]);
                    double multiAndantino = 0;

                    multiAndantino = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));

                    sumaAndantino = sumaAndantino + "[" + i + "]";
                    sumaInstanciasAndantino = sumaInstanciasAndantino + Double.parseDouble((String) instancias.get(i));

                    sumappAndantino = sumappAndantino + multiAndantino;

                }
                if ("MODERATO".equals(referencia[i])) {

                    double multiModerato = 0;

                    multiModerato = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));

                    sumaInstanciasModerato = sumaInstanciasModerato + Double.parseDouble((String) instancias.get(i));

                    sumaModerato = sumaModerato + "[" + i + "]";

                    sumappModerato = sumappModerato + multiModerato;
                }
                if ("ALEGRETO".equals(referencia[i])) {

                    double multiAlegreto = 0;

                    multiAlegreto = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));

                    sumaInstanciasAlegreto = sumaInstanciasAlegreto + Double.parseDouble((String) instancias.get(i));

                    sumaAlegreto = sumaAlegreto + "[" + i + "]";

                    sumappAlegreto = sumappAlegreto + multiAlegreto;

                }
                if ("ALLEGRO".equals(referencia[i])) {
                    System.out.println("//////////////////////////////////////////////////////////////111" + referencia[i]);
                    double multiAllegro = 0;

                    multiAllegro = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));

                    sumaInstanciasAllegro = sumaInstanciasAllegro + Double.parseDouble((String) instancias.get(i));
                    sumaAllegro = sumaAllegro + "[" + i + "]";

                    sumappAllegro = sumappAllegro + multiAllegro;

                }

                if ("VIVANCE".equals(referencia[i])) {
                    double multiVivance = 0;

                    multiVivance = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));

                    sumaInstanciasVivance = sumaInstanciasVivance + Double.parseDouble((String) instancias.get(i));
                    sumaVivance = sumaVivance + "[" + i + "]";

                    sumappVivance = sumappVivance + multiVivance;

                }

                if ("PRESTO".equals(referencia[i])) {
                    double multiPresto = 0;

                    multiPresto = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));

                    sumaInstanciasPresto = sumaInstanciasPresto + Double.parseDouble((String) instancias.get(i));
                    sumaPresto = sumaPresto + "[" + i + "]";

                    sumappPresto = sumappPresto + multiPresto;

                }

                if ("PRESSTISIMO".equals(referencia[i])) {
                    double multiPrestismo = 0;

                    multiPrestismo = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));

                    sumaInstanciasPrestismo = sumaInstanciasPrestismo + Double.parseDouble((String) instancias.get(i));

                    sumaPresstisimo = sumaPresstisimo + "[" + i + "]";

                    sumappPrestismo = sumappPrestismo + multiPrestismo;

                }
            }

            if (sumaAdagio != "") {
                fusion.add(sumaAdagio + " PP Centroide " + (sumappAdagio / sumaInstanciasAdagio));
            }

            if (sumaAdaggieto != "") {
                fusion.add(sumaAdaggieto + " PP Centroide " + (sumappAdaggieto / sumaInstanciasAdaggieto));
            }

            if (sumaAndante != "") {
                fusion.add(sumaAndante + " PP Centroide " + (sumappAndante / sumaInstanciasAndante));
            }

            if (sumaAndantino != "") {
                fusion.add(sumaAndantino + " PP Centroide " + (sumappAndantino / sumaInstanciasAndantino));
            }

            if (sumaModerato != "") {
                fusion.add(sumaModerato + " PP Centroide " + (sumappModerato / sumaInstanciasModerato));
            }

            if (sumaAlegreto != "") {
                fusion.add(sumaAlegreto + " PP Centroide " + (sumappAlegreto / sumaInstanciasAlegreto));
            }
            if (sumaAllegro != "") {
                fusion.add(sumaAllegro + " PP Centroide " + (sumappAllegro / sumaInstanciasAllegro));
            }

            if (sumaVivance != "") {
                fusion.add(sumaVivance + " PP Centroide " + (sumappVivance / sumaInstanciasVivance));
            }
            if (sumaPresto != "") {
                fusion.add(sumaPresto + " PP Centroide " + (sumappPresto / sumaInstanciasPresto));
            }
            if (sumaPresstisimo != "") {
                fusion.add(sumaPresstisimo + " PP Centroide " + (sumappPrestismo / sumaInstanciasPrestismo));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;

    }

    public ArrayList fusionTempoPPC1(String[] referencia, ArrayList centroide, ArrayList instancias) {
        String sumaAdagio = "";
        String sumaAdaggieto = "";
        String sumaAndante = "";
        String sumaAndantino = "";
        String sumaModerato = "";
        String sumaAlegreto = "";
        String sumaAllegro = "";
        String sumaVivance = "";
        String sumaPresto = "";
        String sumaPresstisimo = "";

        double ppAdagio = 0;
        double ppAdaggieto = 0;
        double ppAndante = 0;
        double ppAndantino = 0;
        double ppModerato = 0;
        double ppAlegreto = 0;
        double ppAllegro = 0;
        double ppVivance = 0;
        double ppPresto = 0;
        double ppPresstisimo = 0;

        double sumaInstanciasAdagio = 0;
        double sumaInstanciasAdaggieto = 0;
        double sumaInstanciasAndante = 0;
        double sumaInstanciasAndantino = 0;
        double sumaInstanciasModerato = 0;
        double sumaInstanciasAlegreto = 0;
        double sumaInstanciasAllegro = 0;
        double sumaInstanciasVivance = 0;
        double sumaInstanciasPresto = 0;
        double sumaInstanciasPrestismo = 0;

        double sumappAdagio = 0;
        double sumappAdaggieto = 0;
        double sumappAndante = 0;
        double sumappAndantino = 0;
        double sumappModerato = 0;
        double sumappAlegreto = 0;
        double sumappAllegro = 0;
        double sumappVivance = 0;
        double sumappPresto = 0;
        double sumappPrestismo = 0;

        promp prom1 = new promp();
        ArrayList fusion = new ArrayList();
        try {
            for (int i = 0; i < referencia.length; i++) {

                if ("ADAGIO".equals(referencia[i])) {
                    double multiAdagio = 0;
                    multiAdagio = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasAdagio = sumaInstanciasAdagio + Double.parseDouble((String) instancias.get(i));
                    sumaAdagio = sumaAdagio + "[" + i + "]";
                    sumappAdagio = sumappAdagio + multiAdagio;
                }
                if ("ADAGGIETO".equals(referencia[i])) {
                    double multiAdaggieto = 0;
                    multiAdaggieto = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasAdaggieto = sumaInstanciasAdaggieto + Double.parseDouble((String) instancias.get(i));
                    sumaAdaggieto = sumaAdaggieto + "[" + i + "]";
                    sumappAdaggieto = sumappAdaggieto + multiAdaggieto;
                }

                if ("ANDANTE".equals(referencia[i])) {
                    double multiAndante = 0;
                    multiAndante = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasAndante = sumaInstanciasAndante + Double.parseDouble((String) instancias.get(i));
                    sumaAndante = sumaAndante + "[" + i + "]";
                    sumappAndante = sumappAndante + multiAndante;
                }
                if ("ANDANTINO".equals(referencia[i])) {
                    double multiAndantino = 0;
                    multiAndantino = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaAndantino = sumaAndantino + "[" + i + "]";
                    sumaInstanciasAndantino = sumaInstanciasAndantino + Double.parseDouble((String) instancias.get(i));
                    sumappAndantino = sumappAndantino + multiAndantino;
                }
                if ("MODERATO".equals(referencia[i])) {
                    double multiModerato = 0;
                    multiModerato = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasModerato = sumaInstanciasModerato + Double.parseDouble((String) instancias.get(i));
                    sumaModerato = sumaModerato + "[" + i + "]";
                    sumappModerato = sumappModerato + multiModerato;
                }
                if ("ALEGRETO".equals(referencia[i])) {
                    double multiAlegreto = 0;
                    multiAlegreto = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasAlegreto = sumaInstanciasAlegreto + Double.parseDouble((String) instancias.get(i));
                    sumaAlegreto = sumaAlegreto + "[" + i + "]";
                    sumappAlegreto = sumappAlegreto + multiAlegreto;
                }
                if ("ALLEGRO".equals(referencia[i])) {
                    double multiAllegro = 0;
                    multiAllegro = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasAllegro = sumaInstanciasAllegro + Double.parseDouble((String) instancias.get(i));
                    sumaAllegro = sumaAllegro + "[" + i + "]";
                    sumappAllegro = sumappAllegro + multiAllegro;
                }

                if ("VIVANCE".equals(referencia[i])) {
                    double multiVivance = 0;
                    multiVivance = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasVivance = sumaInstanciasVivance + Double.parseDouble((String) instancias.get(i));
                    sumaVivance = sumaVivance + "[" + i + "]";
                    sumappVivance = sumappVivance + multiVivance;
                }

                if ("PRESTO".equals(referencia[i])) {
                    double multiPresto = 0;
                    multiPresto = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasPresto = sumaInstanciasPresto + Double.parseDouble((String) instancias.get(i));
                    sumaPresto = sumaPresto + "[" + i + "]";
                    sumappPresto = sumappPresto + multiPresto;

                }

                if ("PRESSTISIMO".equals(referencia[i])) {
                    double multiPrestismo = 0;
                    multiPrestismo = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasPrestismo = sumaInstanciasPrestismo + Double.parseDouble((String) instancias.get(i));
                    sumaPresstisimo = sumaPresstisimo + "[" + i + "]";
                    sumappPrestismo = sumappPrestismo + multiPrestismo;
                }
            }

            if (sumaAdagio != "") {
                ppAdagio = sumappAdagio / sumaInstanciasAdagio;
                fusion.add(String.valueOf(ppAdagio));
            }
            if (sumaAdaggieto != "") {
                ppAdaggieto = sumappAdaggieto / sumaInstanciasAdaggieto;
                fusion.add(String.valueOf(ppAdaggieto));
            }
            if (sumaAndante != "") {
                ppAndante = sumappAndante / sumaInstanciasAndante;
                fusion.add(String.valueOf(ppAndante));
            }
            if (sumaAndantino != "") {
                ppAndantino = sumappAndantino / sumaInstanciasAndantino;
                fusion.add(String.valueOf(ppAndantino));
            }

            if (sumaModerato != "") {
                ppModerato = sumappModerato / sumaInstanciasModerato;
                fusion.add(String.valueOf(ppModerato));
            }

            if (sumaAlegreto != "") {
                ppAlegreto = sumappAlegreto / sumaInstanciasAlegreto;
                fusion.add(String.valueOf(ppAlegreto));
            }
            if (sumaAllegro != "") {
                ppAllegro = sumappAllegro / sumaInstanciasAllegro;
                fusion.add(String.valueOf(ppAllegro));
            }

            if (sumaVivance != "") {
                ppVivance = sumappVivance / sumaInstanciasVivance;
                fusion.add(String.valueOf(ppVivance));
            }
            if (sumaPresto != "") {
                ppPresto = sumappPresto / sumaInstanciasPresto;
                fusion.add(String.valueOf(ppPresto));
            }
            if (sumaPresstisimo != "") {
                ppPresstisimo = sumappPrestismo / sumaInstanciasPrestismo;
                fusion.add(String.valueOf(ppPresstisimo));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;

    }

    public ArrayList fusionTempoPPC2(String[] referencia, ArrayList centroide, ArrayList instancias) {
        String sumaAdagio = "";
        String sumaAdaggieto = "";
        String sumaAndante = "";
        String sumaAndantino = "";
        String sumaModerato = "";
        String sumaAlegreto = "";
        String sumaAllegro = "";
        String sumaVivance = "";
        String sumaPresto = "";
        String sumaPresstisimo = "";

        double ppAdagio = 0;
        double ppAdaggieto = 0;
        double ppAndante = 0;
        double ppAndantino = 0;
        double ppModerato = 0;
        double ppAlegreto = 0;
        double ppAllegro = 0;
        double ppVivance = 0;
        double ppPresto = 0;
        double ppPresstisimo = 0;

        double sumaInstanciasAdagio = 0;
        double sumaInstanciasAdaggieto = 0;
        double sumaInstanciasAndante = 0;
        double sumaInstanciasAndantino = 0;
        double sumaInstanciasModerato = 0;
        double sumaInstanciasAlegreto = 0;
        double sumaInstanciasAllegro = 0;
        double sumaInstanciasVivance = 0;
        double sumaInstanciasPresto = 0;
        double sumaInstanciasPrestismo = 0;

        double sumappAdagio = 0;
        double sumappAdaggieto = 0;
        double sumappAndante = 0;
        double sumappAndantino = 0;
        double sumappModerato = 0;
        double sumappAlegreto = 0;
        double sumappAllegro = 0;
        double sumappVivance = 0;
        double sumappPresto = 0;
        double sumappPrestismo = 0;

        int contAdagio = 0;
        int contAdaggieto = 0;
        int contAndante = 0;
        int contAndantino = 0;
        int contModerato = 0;
        int contAlegreto = 0;
        int contAllegro = 0;
        int contVivance = 0;
        int contPresto = 0;
        int contPresstisimo = 0;
        promp prom1 = new promp();
        ArrayList fusion = new ArrayList();

        try {
            for (int i = 0; i < referencia.length; i++) {

                if ("ADAGIO".equals(referencia[i])) {
                    contAdagio = contAdagio + 1;
                    double multiAdagio = 0;
                    multiAdagio = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasAdagio = sumaInstanciasAdagio + Double.parseDouble((String) instancias.get(i));
                    sumaAdagio = sumaAdagio + "[" + i + "]";
                    sumappAdagio = sumappAdagio + multiAdagio;
                }
                if ("ADAGGIETO".equals(referencia[i])) {
                    contAdaggieto = contAdaggieto + 1;
                    double multiAdaggieto = 0;
                    multiAdaggieto = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasAdaggieto = sumaInstanciasAdaggieto + Double.parseDouble((String) instancias.get(i));
                    sumaAdaggieto = sumaAdaggieto + "[" + i + "]";
                    sumappAdaggieto = sumappAdaggieto + multiAdaggieto;
                }

                if ("ANDANTE".equals(referencia[i])) {
                    contAndante = contAndante + 1;
                    double multiAndante = 0;
                    multiAndante = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasAndante = sumaInstanciasAndante + Double.parseDouble((String) instancias.get(i));
                    sumaAndante = sumaAndante + "[" + i + "]";
                    sumappAndante = sumappAndante + multiAndante;
                }
                if ("ANDANTINO".equals(referencia[i])) {
                    contAndantino = contAndantino + 1;
                    double multiAndantino = 0;
                    multiAndantino = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaAndantino = sumaAndantino + "[" + i + "]";
                    sumaInstanciasAndantino = sumaInstanciasAndantino + Double.parseDouble((String) instancias.get(i));
                    sumappAndantino = sumappAndantino + multiAndantino;
                }
                if ("MODERATO".equals(referencia[i])) {
                    contModerato = contModerato + 1;
                    double multiModerato = 0;
                    multiModerato = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasModerato = sumaInstanciasModerato + Double.parseDouble((String) instancias.get(i));
                    sumaModerato = sumaModerato + "[" + i + "]";
                    sumappModerato = sumappModerato + multiModerato;
                }
                if ("ALEGRETO".equals(referencia[i])) {
                    contAlegreto = contAlegreto + 1;
                    double multiAlegreto = 0;
                    multiAlegreto = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasAlegreto = sumaInstanciasAlegreto + Double.parseDouble((String) instancias.get(i));
                    sumaAlegreto = sumaAlegreto + "[" + i + "]";
                    sumappAlegreto = sumappAlegreto + multiAlegreto;
                }
                if ("ALLEGRO".equals(referencia[i])) {
                    contAllegro = contAllegro + 1;
                    double multiAllegro = 0;
                    multiAllegro = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasAllegro = sumaInstanciasAllegro + Double.parseDouble((String) instancias.get(i));
                    sumaAllegro = sumaAllegro + "[" + i + "]";
                    sumappAllegro = sumappAllegro + multiAllegro;
                }

                if ("VIVANCE".equals(referencia[i])) {
                    contVivance = contVivance + 1;
                    double multiVivance = 0;
                    multiVivance = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasVivance = sumaInstanciasVivance + Double.parseDouble((String) instancias.get(i));
                    sumaVivance = sumaVivance + "[" + i + "]";
                    sumappVivance = sumappVivance + multiVivance;
                }

                if ("PRESTO".equals(referencia[i])) {
                    contPresto = contPresto + 1;
                    double multiPresto = 0;
                    multiPresto = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasPresto = sumaInstanciasPresto + Double.parseDouble((String) instancias.get(i));
                    sumaPresto = sumaPresto + "[" + i + "]";
                    sumappPresto = sumappPresto + multiPresto;
                }

                if ("PRESSTISIMO".equals(referencia[i])) {
                    contPresstisimo = contPresstisimo + 1;
                    double multiPrestismo = 0;
                    multiPrestismo = prom1.promp(Double.parseDouble((String) instancias.get(i)), Double.parseDouble((String) centroide.get(i)));
                    sumaInstanciasPrestismo = sumaInstanciasPrestismo + Double.parseDouble((String) instancias.get(i));
                    sumaPresstisimo = sumaPresstisimo + "[" + i + "]";
                    sumappPrestismo = sumappPrestismo + multiPrestismo;

                }
            }

            if (contAdagio > 1) {
                ppAdagio = sumappAdagio / sumaInstanciasAdagio;
                fusion.add(String.valueOf(ppAdagio));
            }

            if (contAdaggieto > 1) {

                ppAdaggieto = sumappAdaggieto / sumaInstanciasAdaggieto;
                fusion.add(String.valueOf(ppAdaggieto));
            }

            if (contAndante > 1) {
                ppAndante = sumappAndante / sumaInstanciasAndante;
                fusion.add(String.valueOf(ppAndante));
            }

            if (contAndantino > 1) {
                ppAndantino = sumappAndantino / sumaInstanciasAndantino;
                fusion.add(String.valueOf(ppAndantino));
            }

            if (contModerato > 1) {
                ppModerato = sumappModerato / sumaInstanciasModerato;
                fusion.add(String.valueOf(ppModerato));
            }

            if (contAlegreto > 1) {
                ppAlegreto = sumappAlegreto / sumaInstanciasAlegreto;
                fusion.add(String.valueOf(ppAlegreto));
            }
            if (contAllegro > 1) {
                ppAllegro = sumappAllegro / sumaInstanciasAllegro;
                fusion.add(String.valueOf(ppAllegro));
            }

            if (contVivance > 1) {
                ppVivance = sumappVivance / sumaInstanciasVivance;
                fusion.add(String.valueOf(ppVivance));
            }
            if (contPresto > 1) {
                ppPresto = sumappPresto / sumaInstanciasPresto;
                fusion.add(String.valueOf(ppPresto));
            }
            if (contPresstisimo > 1) {
                ppPresstisimo = sumappPrestismo / sumaInstanciasPrestismo;
                fusion.add(String.valueOf(ppPresstisimo));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;

    }

    public ArrayList fusionTempoPMC1(String[] referencia, ArrayList centroide) {
        String sumaAdagio = "";
        String sumaAdaggieto = "";
        String sumaAndante = "";
        String sumaAndantino = "";
        String sumaModerato = "";
        String sumaAlegreto = "";
        String sumaAllegro = "";
        String sumaVivance = "";
        String sumaPresto = "";
        String sumaPresstisimo = "";

        double paAdagio = 0;
        double paAdaggieto = 0;
        double paAndante = 0;
        double paAndantino = 0;
        double paModerato = 0;
        double paAlegreto = 0;
        double paAllegro = 0;
        double paVivance = 0;
        double paPresto = 0;
        double paPresstisimo = 0;

        double sumaCentroideAdagio = 0;
        double sumaCentroideAdaggieto = 0;
        double sumaCentroideAndante = 0;
        double sumaCentroideAndantino = 0;
        double sumaCentroideModerato = 0;
        double sumaCentroideAlegreto = 0;
        double sumaCentroideAllegro = 0;
        double sumaCentroideVivance = 0;
        double sumaCentroidePresto = 0;
        double sumaCentroidePrestismo = 0;

        double banAdagio = 0;
        double banAdaggieto = 0;
        double banAndante = 0;
        double banAndantino = 0;
        double banModerato = 0;
        double banAlegreto = 0;
        double banAllegro = 0;
        double banVivance = 0;
        double banPresto = 0;
        double banPresstisimo = 0;

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {

                if ("ADAGIO".equals(referencia[i])) {

                    banAdagio = banAdagio + 1;

                    sumaCentroideAdagio = sumaCentroideAdagio + Double.parseDouble((String) centroide.get(i));

                    sumaAdagio = sumaAdagio + "[" + i + "]";

                }

                if ("ADAGGIETO".equals(referencia[i])) {

                    banAdaggieto = banAdaggieto + 1;

                    sumaCentroideAdaggieto = sumaCentroideAdaggieto + Double.parseDouble((String) centroide.get(i));

                    sumaAdaggieto = sumaAdaggieto + "[" + i + "]";

                }

                if ("ANDANTE".equals(referencia[i])) {

                    banAndante = banAndante + 1;

                    sumaCentroideAndante = sumaCentroideAndante + Double.parseDouble((String) centroide.get(i));

                    sumaAndante = sumaAndante + "[" + i + "]";

                }
                if ("ANDANTINO".equals(referencia[i])) {
                    banAndantino = banAndantino + 1;
                    sumaCentroideAndantino = sumaCentroideAndantino + Double.parseDouble((String) centroide.get(i));

                    sumaAndantino = sumaAndantino + "[" + i + "]";

                }
                if ("MODERATO".equals(referencia[i])) {

                    banModerato = banModerato + 1;
                    sumaCentroideModerato = sumaCentroideModerato + Double.parseDouble((String) centroide.get(i));

                    sumaModerato = sumaModerato + "[" + i + "]";
                }
                if ("ALEGRETO".equals(referencia[i])) {
                    banAlegreto = banAlegreto + 1;
                    sumaCentroideAlegreto = sumaCentroideAlegreto + Double.parseDouble((String) centroide.get(i));

                    sumaAlegreto = sumaAlegreto + "[" + i + "]";

                }
                if ("ALLEGRO".equals(referencia[i])) {
                    banAllegro = banAllegro + 1;
                    sumaCentroideAllegro = sumaCentroideAllegro + Double.parseDouble((String) centroide.get(i));
                    sumaAllegro = sumaAllegro + "[" + i + "]";

                }

                if ("VIVANCE".equals(referencia[i])) {

                    banVivance = banVivance + 1;
                    sumaCentroideVivance = sumaCentroideVivance + Double.parseDouble((String) centroide.get(i));
                    sumaVivance = sumaVivance + "[" + i + "]";

                }

                if ("PRESTO".equals(referencia[i])) {
                    banPresto = banPresto + 1;
                    sumaCentroidePresto = sumaCentroidePresto + Double.parseDouble((String) centroide.get(i));
                    sumaPresto = sumaPresto + "[" + i + "]";

                }

                if ("PRESSTISIMO".equals(referencia[i])) {
                    banPresstisimo = banPresstisimo + 1.0;
                    sumaCentroidePrestismo = sumaCentroidePrestismo + Double.parseDouble((String) centroide.get(i));
                    sumaPresstisimo = sumaPresstisimo + "[" + i + "]";

                }

            }

            if (sumaAdagio != "") {
                paAdagio = sumaCentroideAdagio / banAdagio;
                fusion.add(String.valueOf(paAdagio));
            }

            if (sumaAdaggieto != "") {
                paAdaggieto = sumaCentroideAdaggieto / banAdaggieto;
                fusion.add(String.valueOf(paAdaggieto));
            }

            if (sumaAndante != "") {
                paAndante = sumaCentroideAndante / banAndante;
                fusion.add(String.valueOf(paAndante));
            }

            if (sumaAndantino != "") {
                paAndantino = sumaCentroideAndantino / banAndantino;
                fusion.add(String.valueOf(paAndantino));
            }

            if (sumaModerato != "") {
                paModerato = sumaCentroideModerato / banModerato;
                fusion.add(String.valueOf(paModerato));
            }

            if (sumaAlegreto != "") {
                paAlegreto = sumaCentroideAlegreto / banAlegreto;
                fusion.add(String.valueOf(paAlegreto));
            }
            if (sumaAllegro != "") {
                paAllegro = sumaCentroideAllegro / banAllegro;
                fusion.add(String.valueOf(paAllegro));
            }

            if (sumaVivance != "") {
                paVivance = sumaCentroideVivance / banVivance;
                fusion.add(String.valueOf(paVivance));
            }
            if (sumaPresto != "") {
                paPresto = sumaCentroidePresto / banPresto;
                fusion.add(String.valueOf(paPresto));
            }
            if (sumaPresstisimo != "") {
                paPresstisimo = sumaCentroidePrestismo / banPresstisimo;
                fusion.add(String.valueOf(paPresstisimo));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;

    }

    public ArrayList fusionTempoPMC2(String[] referencia, ArrayList centroide) {
        String sumaAdagio = "";
        String sumaAdaggieto = "";
        String sumaAndante = "";
        String sumaAndantino = "";
        String sumaModerato = "";
        String sumaAlegreto = "";
        String sumaAllegro = "";
        String sumaVivance = "";
        String sumaPresto = "";
        String sumaPresstisimo = "";

        double paAdagio = 0;
        double paAdaggieto = 0;
        double paAndante = 0;
        double paAndantino = 0;
        double paModerato = 0;
        double paAlegreto = 0;
        double paAllegro = 0;
        double paVivance = 0;
        double paPresto = 0;
        double paPresstisimo = 0;

        double sumaCentroideAdagio = 0;
        double sumaCentroideAdaggieto = 0;
        double sumaCentroideAndante = 0;
        double sumaCentroideAndantino = 0;
        double sumaCentroideModerato = 0;
        double sumaCentroideAlegreto = 0;
        double sumaCentroideAllegro = 0;
        double sumaCentroideVivance = 0;
        double sumaCentroidePresto = 0;
        double sumaCentroidePrestismo = 0;

        double banAdagio = 0;
        double banAdaggieto = 0;
        double banAndante = 0;
        double banAndantino = 0;
        double banModerato = 0;
        double banAlegreto = 0;
        double banAllegro = 0;
        double banVivance = 0;
        double banPresto = 0;
        double banPresstisimo = 0;

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {

                if ("ADAGIO".equals(referencia[i])) {

                    banAdagio = banAdagio + 1;

                    sumaCentroideAdagio = sumaCentroideAdagio + Double.parseDouble((String) centroide.get(i));

                    sumaAdagio = sumaAdagio + "[" + i + "]";

                }

                if ("ADAGGIETO".equals(referencia[i])) {

                    banAdaggieto = banAdaggieto + 1;

                    sumaCentroideAdaggieto = sumaCentroideAdaggieto + Double.parseDouble((String) centroide.get(i));

                    sumaAdaggieto = sumaAdaggieto + "[" + i + "]";

                }

                if ("ANDANTE".equals(referencia[i])) {

                    banAndante = banAndante + 1;

                    sumaCentroideAndante = sumaCentroideAndante + Double.parseDouble((String) centroide.get(i));

                    sumaAndante = sumaAndante + "[" + i + "]";

                }
                if ("ANDANTINO".equals(referencia[i])) {
                    banAndantino = banAndantino + 1;
                    sumaCentroideAndantino = sumaCentroideAndantino + Double.parseDouble((String) centroide.get(i));

                    sumaAndantino = sumaAndantino + "[" + i + "]";

                }
                if ("MODERATO".equals(referencia[i])) {

                    banModerato = banModerato + 1;
                    sumaCentroideModerato = sumaCentroideModerato + Double.parseDouble((String) centroide.get(i));

                    sumaModerato = sumaModerato + "[" + i + "]";
                }
                if ("ALEGRETO".equals(referencia[i])) {
                    banAlegreto = banAlegreto + 1;
                    sumaCentroideAlegreto = sumaCentroideAlegreto + Double.parseDouble((String) centroide.get(i));

                    sumaAlegreto = sumaAlegreto + "[" + i + "]";

                }
                if ("ALLEGRO".equals(referencia[i])) {
                    banAllegro = banAllegro + 1;
                    sumaCentroideAllegro = sumaCentroideAllegro + Double.parseDouble((String) centroide.get(i));
                    sumaAllegro = sumaAllegro + "[" + i + "]";

                }

                if ("VIVANCE".equals(referencia[i])) {

                    banVivance = banVivance + 1;
                    sumaCentroideVivance = sumaCentroideVivance + Double.parseDouble((String) centroide.get(i));
                    sumaVivance = sumaVivance + "[" + i + "]";

                }

                if ("PRESTO".equals(referencia[i])) {
                    banPresto = banPresto + 1;
                    sumaCentroidePresto = sumaCentroidePresto + Double.parseDouble((String) centroide.get(i));
                    sumaPresto = sumaPresto + "[" + i + "]";

                }

                if ("PRESSTISIMO".equals(referencia[i])) {
                    banPresstisimo = banPresstisimo + 1.0;
                    sumaCentroidePrestismo = sumaCentroidePrestismo + Double.parseDouble((String) centroide.get(i));
                    sumaPresstisimo = sumaPresstisimo + "[" + i + "]";

                }

            }

            if (banAdagio > 1) {
                paAdagio = sumaCentroideAdagio / banAdagio;
                fusion.add(String.valueOf(paAdagio));
            }

            if (banAdaggieto > 1) {
                paAdaggieto = sumaCentroideAdaggieto / banAdaggieto;
                fusion.add(String.valueOf(paAdaggieto));
            }

            if (banAndante > 1) {
                paAndante = sumaCentroideAndante / banAndante;
                fusion.add(String.valueOf(paAndante));
            }

            if (banAndantino > 1) {
                paAndantino = sumaCentroideAndantino / banAndantino;
                fusion.add(String.valueOf(paAndantino));
            }

            if (banModerato > 1) {
                paModerato = sumaCentroideModerato / banModerato;
                fusion.add(String.valueOf(paModerato));
            }

            if (banAlegreto > 1) {
                paAlegreto = sumaCentroideAlegreto / banAlegreto;
                fusion.add(String.valueOf(paAlegreto));
            }
            if (banAllegro > 1) {
                paAllegro = sumaCentroideAllegro / banAllegro;
                fusion.add(String.valueOf(paAllegro));
            }

            if (banVivance > 1) {
                paVivance = sumaCentroideVivance / banVivance;
                fusion.add(String.valueOf(paVivance));
            }
            if (banPresto > 1) {
                paPresto = sumaCentroidePresto / banPresto;
                fusion.add(String.valueOf(paPresto));
            }
            if (banPresstisimo > 1) {
                paPresstisimo = sumaCentroidePrestismo / banPresstisimo;
                fusion.add(String.valueOf(paPresstisimo));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;

    }

    public ArrayList fusionTempoInstancias(String[] referencia, ArrayList noCluster, ArrayList Instancia) {
        String sumaAdagio = "";
        String sumaAdagio1 = "";
        String sumaAdaggieto = "";
        String sumaAdaggieto1 = "";
        String sumaAndante = "";
        String sumaAndante1 = "";
        String sumaAndantino = "";
        String sumaAndantino1 = "";
        String sumaModerato = "";
        String sumaModerato1 = "";
        String sumaAlegreto = "";
        String sumaAlegreto1 = "";
        String sumaAllegro = "";
        String sumaAllegro1 = "";
        String sumaVivance = "";
        String sumaVivance1 = "";
        String sumaPresto = "";
        String sumaPresto1 = "";
        String sumaPresstisimo = "";
        String sumaPresstisimo1 = "";

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {

                if ("ADAGIO".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            // System.out.println("Cluster" + noCluster.get(j).toString()); 
                            // System.out.println("Posision" + j); 
                            // System.out.println("Valor" + Instancia.get(j).toString());

                            sumaAdagio = sumaAdagio + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaAdagio1 = sumaAdagio1 + "[" + i + "]";

                }

                if ("ADAGGIETO".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {

                            sumaAdaggieto = sumaAdaggieto + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaAdaggieto1 = sumaAdaggieto1 + "[" + i + "]";

                }

                if ("ANDANTE".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {

                            sumaAndante = sumaAndante + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaAndante1 = sumaAndante1 + "[" + i + "]";

                }
                if ("ANDANTINO".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {

                            sumaAndantino = sumaAndantino + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaAndantino1 = sumaAndantino1 + "[" + i + "]";

                }
                if ("MODERATO".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {

                            sumaModerato = sumaModerato + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaModerato1 = sumaModerato1 + "[" + i + "]";
                }
                if ("ALEGRETO".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {

                            sumaAlegreto = sumaAlegreto + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaAlegreto1 = sumaAlegreto1 + "[" + i + "]";

                }
                if ("ALLEGRO".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {

                            sumaAllegro = sumaAllegro + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaAllegro1 = sumaAllegro1 + "[" + i + "]";

                }

                if ("VIVANCE".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {

                            sumaVivance = sumaVivance + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaVivance1 = sumaVivance1 + "[" + i + "]";

                }

                if ("PRESTO".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {

                            sumaPresto = sumaPresto + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaPresto1 = sumaPresto1 + "[" + i + "]";

                }

                if ("PRESSTISIMO".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {

                            sumaPresstisimo = sumaPresstisimo + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaPresstisimo1 = sumaPresstisimo1 + "[" + i + "]";

                }

            }

            if (sumaAdagio1 != "") {
                fusion.add("Cluster " + sumaAdagio1 + " " + sumaAdagio);
            }

            if (sumaAdaggieto1 != "") {
                fusion.add("Cluster " + sumaAdaggieto1 + " " + sumaAdaggieto);
            }

            if (sumaAndante1 != "") {
                fusion.add("Cluster " + sumaAndante1 + " " + sumaAndante);
            }

            if (sumaAndantino1 != "") {
                fusion.add("Cluster " + sumaAndantino1 + " " + sumaAndantino);
            }

            if (sumaModerato1 != "") {
                fusion.add("Cluster " + sumaModerato1 + " " + sumaModerato);
            }

            if (sumaAlegreto1 != "") {
                fusion.add("Cluster " + sumaAlegreto1 + " " + sumaAlegreto);
            }
            if (sumaAllegro1 != "") {
                fusion.add("Cluster " + sumaAllegro1 + " " + sumaAllegro);
            }

            if (sumaVivance1 != "") {
                fusion.add("Cluster " + sumaVivance1 + " " + sumaVivance);
            }
            if (sumaPresto1 != "") {
                fusion.add("Cluster " + sumaPresto1 + " " + sumaPresto);
            }
            if (sumaPresstisimo1 != "") {
                fusion.add("Cluster " + sumaPresstisimo1 + " " + sumaPresstisimo);
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;

    }

    public ArrayList nuevosClusterNC(String[] referencia, ArrayList noCluster, ArrayList Instancia) {
        String sumaAdagio = "";
        String sumaAdagio1 = "";
        String sumaAdaggieto = "";
        String sumaAdaggieto1 = "";
        String sumaAndante = "";
        String sumaAndante1 = "";
        String sumaAndantino = "";
        String sumaAndantino1 = "";
        String sumaModerato = "";
        String sumaModerato1 = "";
        String sumaAlegreto = "";
        String sumaAlegreto1 = "";
        String sumaAllegro = "";
        String sumaAllegro1 = "";
        String sumaVivance = "";
        String sumaVivance1 = "";
        String sumaPresto = "";
        String sumaPresto1 = "";
        String sumaPresstisimo = "";
        String sumaPresstisimo1 = "";

        ArrayList fusion = new ArrayList();

        try {

            for (int i = 0; i < referencia.length; i++) {

                if ("ADAGIO".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            System.out.println("Cluster" + noCluster.get(j).toString());
                            sumaAdagio = sumaAdagio + Instancia.get(j).toString();
                        }

                    }

                    sumaAdagio1 = sumaAdagio1 + "[" + i + "]";

                    System.out.println(sumaAdagio1);
                }

                if ("ADAGGIETO".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            System.out.println("Cluster" + noCluster.get(j).toString());
                            sumaAdaggieto = sumaAdaggieto + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaAdaggieto1 = sumaAdaggieto1 + "[" + i + "]";
                    System.out.println(sumaAdaggieto1);
                }

                if ("ANDANTE".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            System.out.println("Cluster" + noCluster.get(j).toString());
                            sumaAndante = sumaAndante + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaAndante1 = sumaAndante1 + "[" + i + "]";
                    System.out.println(sumaAndante1);

                }
                if ("ANDANTINO".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            System.out.println("Cluster" + noCluster.get(j).toString());
                            sumaAndantino = sumaAndantino + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaAndantino1 = sumaAndantino1 + "[" + i + "]";
                    System.out.println(sumaAndantino1);

                }
                if ("MODERATO".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            System.out.println("Cluster" + noCluster.get(j).toString());
                            sumaModerato = sumaModerato + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaModerato1 = sumaModerato1 + "[" + i + "]";
                    System.out.println(sumaModerato1);
                }
                if ("ALEGRETO".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            System.out.println("Cluster" + noCluster.get(j).toString());
                            sumaAlegreto = sumaAlegreto + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaAlegreto1 = sumaAlegreto1 + "[" + i + "]";
                    System.out.println(sumaAlegreto1);

                }
                if ("ALLEGRO".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            System.out.println("Cluster" + noCluster.get(j).toString());
                            sumaAllegro = sumaAllegro + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaAllegro1 = sumaAllegro1 + "[" + i + "]";
                    System.out.println(sumaAllegro1);
                }

                if ("VIVANCE".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            System.out.println("Cluster" + noCluster.get(j).toString());
                            sumaVivance = sumaVivance + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaVivance1 = sumaVivance1 + "[" + i + "]";
                    System.out.println(sumaVivance1);
                }

                if ("PRESTO".equals(referencia[i])) {
                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            System.out.println("Cluster" + noCluster.get(j).toString());
                            sumaPresto = sumaPresto + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaPresto1 = sumaPresto1 + "[" + i + "]";
                    System.out.println(sumaPresto1);

                }

                if ("PRESSTISIMO".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            System.out.println("Cluster" + noCluster.get(j).toString());
                            sumaPresstisimo = sumaPresstisimo + Instancia.get(j).toString() + ",";
                        }

                    }

                    sumaPresstisimo1 = sumaPresstisimo1 + "[" + i + "]";
                    System.out.println(sumaPresstisimo1);

                }

            }

            if (sumaAdagio1 != "") {
                fusion.add("Cluster " + sumaAdagio1 + " " + sumaAdagio);
            }

            if (sumaAdaggieto1 != "") {
                fusion.add("Cluster " + sumaAdaggieto1 + " " + sumaAdaggieto);
            }

            if (sumaAndante1 != "") {
                fusion.add("Cluster " + sumaAndante1 + " " + sumaAndante);
            }

            if (sumaAndantino1 != "") {
                fusion.add("Cluster " + sumaAndantino1 + " " + sumaAndantino);
            }

            if (sumaModerato1 != "") {
                fusion.add("Cluster " + sumaModerato1 + " " + sumaModerato);
            }

            if (sumaAlegreto1 != "") {
                fusion.add("Cluster " + sumaAlegreto1 + " " + sumaAlegreto);
            }
            if (sumaAllegro1 != "") {
                fusion.add("Cluster " + sumaAllegro1 + " " + sumaAllegro);
            }

            if (sumaVivance1 != "") {
                fusion.add("Cluster " + sumaVivance1 + " " + sumaVivance);
            }
            if (sumaPresto1 != "") {
                fusion.add("Cluster " + sumaPresto1 + " " + sumaPresto);
            }
            if (sumaPresstisimo1 != "") {
                fusion.add("Cluster " + sumaPresstisimo1 + " " + sumaPresstisimo);
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;

    }

}
