package ObjeAux;

import java.util.ArrayList;

public class calculoIndiceValidezDB {

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

    double pp1 = 0;
    double pp12 = 0;
    double pp14 = 0;
    double pp18 = 0;
    double pp116 = 0;

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

    public double distanciaCluster(ArrayList noCluster, ArrayList instancias, ArrayList centroide) {
        double minimo = 0;
        double sumad = 0;
        double disC = 0;
        double sck = 0;
        double cont = 0;
        try {
            for (int i = 0; i < noCluster.size(); i++) {
                String cadena;
                System.out.println("Cluster [" + noCluster.get(i).toString() + "]  " + " Centroide [" + centroide.get(i).toString() + "]");

                for (int j = 0; j < instancias.size(); j++) {
                    cont = cont + 1;
                    double total = 0;
                    double res = 0;
                    double res1 = 0;
                    double resta = 0;
                    res = Double.parseDouble((String) instancias.get(j));
                    res1 = Double.parseDouble((String) centroide.get(i));

                    resta = Math.abs(res - res1);
                    total = resta;
                    sumad = sumad + total;
                    System.out.println("Instancias [" + instancias.get(j).toString() + "]  " + " Distancia Centroide  [" + total + "]");

                }
                System.out.println("La suma de distancias es: " + sumad);
                cadena = String.valueOf(sumad);
                disC = (1 / cont) * sumad;
                System.out.println("SCK: " + disC);
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return disC;

    }

    public double distanciaSeparacionCluster(ArrayList centroide) {
        double minimo = 0;
        double sumad = 0;
        double disSC = 0;
        double cero = 0.0;
        double cen = 0;
        try {
            for (int i = 0; i < centroide.size(); i++) {

                cen = Double.parseDouble((String) centroide.get(i));

                if (Double.isNaN(cen) == true) {

                } else {

                    System.out.println("Cluster " + i);

                    for (int j = 0; j < centroide.size(); j++) {

                        if (centroide.get(i).toString() == centroide.get(j).toString()) {
                            //System.out.println("no se puede realizar esta operacion");
                        } else {
                            if (Double.parseDouble((String) centroide.get(i)) == cero) {
                                System.out.println("Cluster [" + i + "]" + "Centroide [" + centroide.get(i).toString());
                                System.out.println("no se puede realizar esta operacion");
                            } else {
                                double total = 0;
                                double res = 0;
                                double res1 = 0;
                                double resta = 0;
                                double cenj = 0;

                                res = Double.parseDouble((String) centroide.get(i));
                                res1 = Double.parseDouble((String) centroide.get(j));

                                cenj = Double.parseDouble((String) centroide.get(j));

                                if (Double.isNaN(cenj) == true) {

                                } else {

                                    resta = Math.abs(res - res1);
                                    total = resta;
                                    sumad = sumad + total;
                                    System.out.println("Cluster [" + i + "]" + "Centroide [" + centroide.get(i).toString() + "] " + "-- " + "Cluster [" + j + "]" + "Centroide [" + centroide.get(j).toString() + "] " + " Distancia Centroide  [" + total + "]");
                                    System.out.println("Cluster " + i + "Cluster " + j);
                                }
                            }

                        }

                    }
                }
            }
            System.out.println("La suma de distancias es: " + sumad);
            disSC = sumad;
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return disSC;
    }

    public ArrayList distanciaSeparacionCluster1(ArrayList centroide, ArrayList sck) {
        double minimo = 0;
        double sumad = 0;
        double sumad1 = 0;

        ArrayList disSC = new ArrayList();
        try {
            for (int i = 0; i < centroide.size(); i++) {

                double max[] = new double[11];
                System.out.println("///////// Cluster ///////////// " + i);
                for (int j = 0; j < centroide.size(); j++) {
                    if (centroide.get(i).toString() == centroide.get(j).toString()) {
                        //System.out.println("no se puede realizar esta operacion");
                    } else {
                        double resmax = 0;
                        double total = 0;
                        double res = 0;
                        double res1 = 0;
                        double resta = 0;

                        res = Double.parseDouble((String) centroide.get(i));
                        res1 = Double.parseDouble((String) centroide.get(j));
                        resta = Math.abs(res - res1);
                        total = resta;  //// Distancia ente entroides
                        sumad = total;
                        System.out.println("Cluster [" + i + "]" + "Centroide [" + centroide.get(i).toString() + "] " + "-- " + "Cluster [" + j + "]" + "Centroide [" + centroide.get(j).toString() + "] " + " Distancia Centroide  [" + total + "]");

                        double totali = 0;
                        double resi = 0;
                        double res1i = 0;
                        double restai = 0;

                        resi = Double.parseDouble((String) sck.get(i));
                        res1i = Double.parseDouble((String) sck.get(j));
                        restai = Math.abs(resi + res1i);

                        totali = restai;  //// Distancia ente entroides

                        sumad1 = totali;
                        System.out.println("Cluster [" + i + "]" + "SCK [" + sck.get(i).toString() + "] " + "-- " + "Cluster [" + j + "]" + "SCK [" + sck.get(j).toString() + "] " + " Distancia Centroide  [" + total + "]");
                        System.out.println("SCK + SCL " + sumad1 + "+" + "d(CK, CL)" + sumad);

                        System.out.println("Cluster " + i + "Cluster " + j);

                        resmax = sumad1 / sumad;
                        System.out.println("Resultado :" + resmax);

                        max[j] = resmax;
                    }

                }

                /////// Calcular el Maximo /////////
                double mayor = 0;
                double resultado = max[0];

                for (int k = 0; k < max.length; k++) {
                    if (max[k] > resultado) {
                        resultado = max[k];
                    }

                }

                mayor = resultado;
                System.out.println("La Distancia Maxima es: " + resultado + "");
                disSC.add(String.valueOf(mayor));
                //  System.out.println("//////////////////////////////////////////////");
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return disSC;

    }

    public ArrayList distanciaClusterFusionados(String[] referencia, ArrayList noCluster, ArrayList Instancia) {
        ArrayList fusion = new ArrayList();
        String sumaAdagio = "";
        double sumAdagio = 0;
        String sumaAdaggieto = "";
        double sumAdaggieto = 0;
        String sumaAndante = "";
        double sumAndante = 0;
        String sumaAndantino = "";
        double sumAndantino = 0;
        String sumaModerato = "";
        double sumModerato = 0;
        String sumaAlegreto = "";
        double sumAlegreto = 0;
        String sumaAllegro = "";
        double sumAllegro = 0;
        String sumaVivance = "";
        double sumVivance = 0;
        String sumaPresto = "";
        double sumPresto = 0;
        String sumaPresstisimo = "";
        double sumPresstisimo = 0;
        double sumadAdagio = 0;
        double sumadAdaggieto = 0;
        double sumadAndante = 0;
        double sumadAndantino = 0;
        double sumadAllegro = 0;
        double sumadModerato = 0;
        double sumadAlegreto = 0;
        double sumadVivance = 0;
        double sumadPresto = 0;
        double sumadPresstisimo = 0;

        double denominador = 0;

        double contAdagio = 0;
        double contAdaggieto = 0;
        double contAndante = 0;
        double contAndantino = 0;
        double contModerato = 0;
        double contAlegreto = 0;
        double contAllegro = 0;
        double contVivance = 0;
        double contPresto = 0;
        double contPresstisimo = 0;

        try {
            ////////////////////////////////////////
            for (int i = 0; i < referencia.length; i++) {
                if ("ADAGIO".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {

                            // System.out.println("HOLA" + noCluster.get(j).toString());
                            contAdagio = contAdagio + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;

                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppAdagio;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadAdagio = sumadAdagio + total;
                            System.out.println("Instancias [" + Instancia.get(j).toString() + "]  " + "Centroide " + ppAdagio + " Distancia Centroide  [" + total + "]");
                            sumAdagio = sumadAdagio;
                            sumaAdagio = sumaAdagio + "[" + i + "]";
                        }
                        /*else
                         {
                         sumaAdagio = "1";
                         sumAdagio = 0;
                         // sumaAdagio = ;
                         contAdagio = 0;
                               
                               
                               
                         }*/
                    }

                }

                if ("ADAGGIETO".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contAdaggieto = contAdaggieto + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppAdaggieto;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadAdaggieto = sumadAdaggieto + total;
                            System.out.println("Instancias [" + Instancia.get(j).toString() + "]  " + "Centroide " + ppAdaggieto + " Distancia Centroide  [" + total + "]");
                            sumAdaggieto = sumadAdaggieto;
                            sumaAdaggieto = sumaAdaggieto + "[" + i + "]";
                        }
                    }

                }

                if ("ANDANTE".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contAndante = contAndante + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppAndante;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadAndante = sumadAndante + total;
                            //  System.out.println("Instancias [" + Instancia.get(j).toString()+"]  "  + "Centroide " + ppAndante +" Distancia Centroide  [" + total+"]");
                            sumAndante = sumadAndante;
                            sumaAndante = sumaAndante + "[" + i + "]";
                        }
                    }
                }
                if ("ANDANTINO".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contAndantino = contAndantino + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppAndantino;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadAndantino = sumadAndantino + total;
                            //  System.out.println("Instancias [" + Instancia.get(j).toString()+"]  "+ "Centroide " + ppAndantino +" Distancia Centroide  [" + total+"]");
                            sumAndantino = sumadAndantino;
                            sumaAndantino = sumaAndantino + "[" + i + "]";
                        }

                    }

                }
                if ("MODERATO".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contModerato = contModerato + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppModerato;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadModerato = sumadModerato + total;
                            //  System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + ppModerato +" Distancia Centroide  [" + total+"]"); 
                            sumModerato = sumadModerato;
                            sumaModerato = sumaModerato + "[" + i + "]";
                        }

                    }

                }
                if ("ALEGRETO".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contAlegreto = contAlegreto + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppAlegreto;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadAlegreto = sumadAlegreto + total;
                            //   System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + ppAlegreto +" Distancia Centroide  [" + total+"]");
                            sumAlegreto = sumadAlegreto;
                            sumaAlegreto = sumaAlegreto + "[" + i + "]";
                        }

                    }
                }
                if ("ALLEGRO".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contAllegro = contAllegro + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppAllegro;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadAllegro = sumadAllegro + total;
                            //  System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + ppAllegro +" Distancia Centroide  [" + total+"]");
                            sumAllegro = sumadAllegro;
                            sumaAllegro = sumaAllegro + "[" + i + "]";
                        }

                    }
                    System.out.println("Suma de Instancias es:" + sumAllegro);
                }

                if ("VIVANCE".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contVivance = contVivance + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppVivance;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadVivance = sumadVivance + total;
                            //   System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + ppVivance +" Distancia Centroide  [" + total+"]");
                            sumVivance = sumadVivance;
                            sumaVivance = sumaVivance + "[" + i + "]";

                        }

                    }
                    System.out.println("Suma de Instancias es:" + sumVivance);
                }

                if ("PRESTO".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contPresto = contPresto + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppPresto;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadPresto = sumadPresto + total;
                            //   System.out.println("Instancias [" + Instancia.get(j).toString()+"]  "+ "Centroide " + ppPresto +" Distancia Centroide  [" + total+"]");
                            sumPresto = sumadPresto;
                            sumaPresto = sumaPresto + "[" + i + "]";
                        }

                    }
                }

                if ("PRESSTISIMO".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contPresstisimo = contPresstisimo + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppPresstisimo;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadPresstisimo = sumadPresstisimo + total;
                            //   System.out.println("Instancias [" + Instancia.get(j).toString()+"]  "+ "Centroide " + ppPresstisimo+" Distancia Centroide  [" + total+"]");
                            sumPresstisimo = sumadPresstisimo;
                            sumaPresstisimo = sumaPresstisimo + "[" + i + "]";

                        }

                    }
                    //     System.out.println("Suma de Instancias es:" + sumPresstisimo );
                }

            }

            sumAdagio = Math.abs((1 / contAdagio) * sumAdagio);
            sumAdaggieto = Math.abs((1 / contAdaggieto) * sumAdaggieto);
            sumAndante = Math.abs((1 / contAndante) * sumAndante);
            sumAndantino = Math.abs((1 / contAndantino) * sumAndantino);
            sumModerato = Math.abs((1 / contModerato) * sumModerato);
            sumAlegreto = Math.abs((1 / contAlegreto) * sumAlegreto);
            sumAllegro = Math.abs((1 / contAllegro) * sumAllegro);
            sumVivance = Math.abs((1 / contVivance) * sumVivance);
            sumPresto = Math.abs(1 / contPresto) * sumPresto;
            sumPresstisimo = Math.abs((1 / contPresstisimo) * sumPresstisimo);

            if (sumaAdagio != "") {
                fusion.add(String.valueOf(sumAdagio));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }

            if (sumaAdaggieto != "") {
                fusion.add(String.valueOf(sumAdaggieto));
                // ppAdaggieto = (sumappAdaggieto/sumaInstanciasAdaggieto);
            }

            if (sumaAndante != "") {
                fusion.add(String.valueOf(sumAndante));
                //ppAndante = (sumappAndante/sumaInstanciasAndante);
            }

            if (sumaAndantino != "") {
                fusion.add(String.valueOf(sumAndantino));
                //ppAndantino =  (sumappAndantino/sumaInstanciasAndantino);
            }

            if (sumaModerato != "") {
                fusion.add(String.valueOf(sumModerato));
                //ppModerato = (sumappModerato/sumaInstanciasModerato);
            }

            if (sumaAlegreto != "") {
                fusion.add(String.valueOf(sumAlegreto));
                //ppAlegreto = (sumappAlegreto/sumaInstanciasAlegreto);
            }
            if (sumaAllegro != "") {
                fusion.add(String.valueOf(sumAllegro));
                // ppAllegro = (sumappAllegro/sumaInstanciasAllegro);
            }

            if (sumaVivance != "") {
                fusion.add(String.valueOf(sumVivance));
                // ppVivance = (sumappVivance/sumaInstanciasVivance);
            }
            if (sumaPresto != "") {
                fusion.add(String.valueOf(sumPresto));
                //ppPresto = (sumappPresto/sumaInstanciasPresto);
            }
            if (sumaPresstisimo != "") {
                fusion.add(String.valueOf(sumPresstisimo));
                //ppPresstisimo = (sumappPrestismo/sumaInstanciasPrestismo);
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

    public ArrayList distanciaClusterFusionadosDuracion(String[] referencia, ArrayList noCluster, ArrayList Instancia) {
        ArrayList fusion = new ArrayList();

        String suma1 = "";
        double sum1 = 0;
        String suma12 = "";
        double sum12 = 0;
        String suma14 = "";
        double sum14 = 0;
        String suma18 = "";
        double sum18 = 0;
        String suma116 = "";
        double sum116 = 0;

        double sumad1 = 0;
        double sumad12 = 0;
        double sumad14 = 0;
        double sumad18 = 0;
        double sumad116 = 0;

        double denominador = 0;

        double cont1 = 0;
        double cont12 = 0;
        double cont14 = 0;
        double cont18 = 0;
        double cont116 = 0;

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("1".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            cont1 = cont1 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = pp1;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumad1 = sumad1 + total;
                            // System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + pp1 +" Distancia Centroide  [" + total+"]");
                            sum1 = sumad1;
                            suma1 = suma1 + "[" + i + "]";

                        }

                    }

                }

                if ("1/2".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            cont12 = cont12 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = pp12;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumad12 = sumad12 + total;
                            //  System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + pp12 +" Distancia Centroide  [" + total+"]");
                            sum12 = sumad12;
                            suma12 = suma12 + "[" + i + "]";

                        }

                    }

                }

                if ("1/4".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            cont14 = cont14 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = pp14;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumad14 = sumad14 + total;
                            //  System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + pp14 +" Distancia Centroide  [" + total+"]");
                            sum14 = sumad14;
                            suma14 = suma14 + "[" + i + "]";

                        }

                    }

                }
                if ("1/8".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            cont18 = cont18 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = pp18;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumad18 = sumad18 + total;
                            //  System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + pp18 +" Distancia Centroide  [" + total+"]");
                            sum18 = sumad18;
                            suma18 = suma18 + "[" + i + "]";

                        }

                    }

                }
                if ("1/16".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            cont116 = cont116 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = pp116;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumad116 = sumad116 + total;
                            //  System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + pp116 +" Distancia Centroide  [" + total+"]");
                            sum116 = sumad116;
                            suma116 = suma116 + "[" + i + "]";

                        }

                    }

                }

            }

            sum1 = Math.abs((1 / cont1) * sum1);
            sum12 = Math.abs((1 / cont12) * sum12);
            sum14 = Math.abs((1 / cont14) * sum14);
            sum18 = Math.abs((1 / cont18) * sum18);
            sum116 = Math.abs((1 / cont116) * sum116);

            if (suma1 != "") {
                fusion.add(String.valueOf(sum1));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }

            if (suma12 != "") {
                fusion.add(String.valueOf(sum12));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }

            if (suma14 != "") {
                fusion.add(String.valueOf(sum14));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }

            if (suma18 != "") {
                fusion.add(String.valueOf(sum18));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }

            if (suma116 != "") {
                fusion.add(String.valueOf(sum116));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

    public ArrayList distanciaClusterFusionadosOctava(String[] referencia, ArrayList noCluster, ArrayList Instancia) {
        ArrayList fusion = new ArrayList();

        String sumaC0 = "";
        double sumC0 = 0;
        String sumaC1 = "";
        double sumC1 = 0;
        String sumaC2 = "";
        double sumC2 = 0;
        String sumaC3 = "";
        double sumC3 = 0;
        String sumaC4 = "";
        double sumC4 = 0;
        String sumaC5 = "";
        double sumC5 = 0;
        String sumaC6 = "";
        double sumC6 = 0;
        String sumaC7 = "";
        double sumC7 = 0;
        String sumaC8 = "";
        double sumC8 = 0;
        String sumaC9 = "";
        double sumC9 = 0;
        String sumaG9 = "";
        double sumG9 = 0;

        double sumadC0 = 0;
        double sumadC1 = 0;
        double sumadC2 = 0;
        double sumadC3 = 0;
        double sumadC4 = 0;
        double sumadC5 = 0;
        double sumadC6 = 0;
        double sumadC7 = 0;
        double sumadC8 = 0;
        double sumadC9 = 0;
        double sumadG9 = 0;

        double denominador = 0;

        double contC0 = 0;
        double contC1 = 0;
        double contC2 = 0;
        double contC3 = 0;
        double contC4 = 0;
        double contC5 = 0;
        double contC6 = 0;
        double contC7 = 0;
        double contC8 = 0;
        double contC9 = 0;
        double contG9 = 0;

        try {

            for (int i = 0; i < referencia.length; i++) {
                if ("C0".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contC0 = contC0 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppC0;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadC0 = sumadC0 + total;
                            //  System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + ppC0 +" Distancia Centroide  [" + total+"]");
                            sumC0 = sumadC0;
                            sumaC0 = sumaC0 + "[" + i + "]";

                        }

                    }

                }

                if ("C1".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contC1 = contC1 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppC1;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadC1 = sumadC1 + total;
                            //  System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + ppC1 +" Distancia Centroide  [" + total+"]");
                            sumC1 = sumadC1;
                            sumaC1 = sumaC1 + "[" + i + "]";

                        }

                    }

                }

                if ("C2".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contC2 = contC2 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppC2;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadC2 = sumadC2 + total;
                            //   System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + ppC2 +" Distancia Centroide  [" + total+"]");
                            sumC2 = sumadC2;
                            sumaC2 = sumaC2 + "[" + i + "]";

                        }

                    }

                }
                if ("C3".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contC3 = contC3 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppC3;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadC3 = sumadC3 + total;
                            //  System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + ppC3 +" Distancia Centroide  [" + total+"]");
                            sumC3 = sumadC3;
                            sumaC3 = sumaC3 + "[" + i + "]";

                        }

                    }

                }
                if ("C4".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contC4 = contC4 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppC4;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadC4 = sumadC4 + total;
                            //  System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + ppC4 +" Distancia Centroide  [" + total+"]");
                            sumC4 = sumadC4;
                            sumaC4 = sumaC4 + "[" + i + "]";

                        }

                    }

                }

                if ("C5".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contC5 = contC5 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppC5;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadC5 = sumadC5 + total;
                            //   System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + ppC5 +" Distancia Centroide  [" + total+"]");
                            sumC5 = sumadC5;
                            sumaC5 = sumaC5 + "[" + i + "]";

                        }

                    }

                }
                if ("C6".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contC6 = contC6 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppC6;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadC6 = sumadC6 + total;
                            //   System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + ppC6 +" Distancia Centroide  [" + total+"]");
                            sumC6 = sumadC6;
                            sumaC6 = sumaC6 + "[" + i + "]";

                        }

                    }

                }
                if ("C7".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contC7 = contC7 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppC7;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadC7 = sumadC7 + total;
                            //  System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + ppC7 +" Distancia Centroide  [" + total+"]");
                            sumC7 = sumadC7;
                            sumaC7 = sumaC7 + "[" + i + "]";

                        }

                    }

                }
                if ("C8".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contC8 = contC8 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppC8;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadC8 = sumadC8 + total;
                            //   System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + ppC8 +" Distancia Centroide  [" + total+"]");
                            sumC8 = sumadC8;
                            sumaC8 = sumaC8 + "[" + i + "]";

                        }

                    }

                }
                if ("C9".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contC9 = contC9 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppC9;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadC9 = sumadC9 + total;
                            //    System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + ppC9 +" Distancia Centroide  [" + total+"]");
                            sumC9 = sumadC9;
                            sumaC9 = sumaC9 + "[" + i + "]";

                        }

                    }

                }
                if ("G9".equals(referencia[i])) {

                    for (int j = 0; j < noCluster.size(); j++) {

                        if (i == Integer.parseInt((String) noCluster.get(j))) {
                            contG9 = contG9 + 1;
                            double total = 0;
                            double res = 0;
                            double res1 = 0;
                            double resta = 0;
                            res = Double.parseDouble((String) Instancia.get(j));
                            res1 = ppG9;
                            resta = Math.abs(res - res1);
                            total = resta;
                            sumadG9 = sumadG9 + total;
                            //    System.out.println("Instancias [" + Instancia.get(j).toString()+"]  " + "Centroide " + ppG9 +" Distancia Centroide  [" + total+"]");
                            sumG9 = sumadG9;
                            sumaG9 = sumaG9 + "[" + i + "]";

                        }

                    }

                }

            }

            sumC0 = Math.abs((1 / contC0) * sumC0);
            sumC1 = Math.abs((1 / contC1) * sumC1);
            sumC2 = Math.abs((1 / contC2) * sumC2);
            sumC3 = Math.abs((1 / contC3) * sumC3);
            sumC4 = Math.abs((1 / contC4) * sumC4);
            sumC5 = Math.abs((1 / contC5) * sumC5);
            sumC6 = Math.abs((1 / contC6) * sumC6);
            sumC7 = Math.abs((1 / contC7) * sumC7);
            sumC8 = Math.abs((1 / contC8) * sumC8);
            sumC9 = Math.abs((1 / contC9) * sumC9);
            sumG9 = Math.abs((1 / contG9) * sumG9);

            if (sumaC0 != "") {
                fusion.add(String.valueOf(sumC0));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }

            if (sumaC1 != "") {
                fusion.add(String.valueOf(sumC1));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }

            if (sumaC2 != "") {
                fusion.add(String.valueOf(sumC2));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }

            if (sumaC3 != "") {
                fusion.add(String.valueOf(sumC3));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }

            if (sumaC4 != "") {
                fusion.add(String.valueOf(sumC4));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }
            if (sumaC5 != "") {
                fusion.add(String.valueOf(sumC5));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }
            if (sumaC6 != "") {
                fusion.add(String.valueOf(sumC6));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }
            if (sumaC7 != "") {
                fusion.add(String.valueOf(sumC7));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }
            if (sumaC8 != "") {
                fusion.add(String.valueOf(sumC8));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }
            if (sumaC9 != "") {
                fusion.add(String.valueOf(sumC9));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }
            if (sumaG9 != "") {
                fusion.add(String.valueOf(sumG9));
                // ppAdagio = (sumappAdagio/sumaInstanciasAdagio);
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

    public ArrayList fusionTempoPPC(String[] referencia, ArrayList centroide, ArrayList instancias) {
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
                if ("0.0".equals(centroide.get(i))) {

                } else {

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
                        sumaInstanciasAndantino = sumaInstanciasAndantino + Double.parseDouble((String) instancias.get(i));
                        sumaAndantino = sumaAndantino + "[" + i + "]";
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
            }

            if (sumaAdagio != "") {
                fusion.add(sumaAdagio + " PP Centroide " + (sumappAdagio / sumaInstanciasAdagio));
                ppAdagio = (sumappAdagio / sumaInstanciasAdagio);
            }

            if (sumaAdaggieto != "") {
                fusion.add(sumaAdaggieto + " PP Centroide " + (sumappAdaggieto / sumaInstanciasAdaggieto));
                ppAdaggieto = (sumappAdaggieto / sumaInstanciasAdaggieto);
            }

            if (sumaAndante != "") {
                fusion.add(sumaAndante + " PP Centroide " + (sumappAndante / sumaInstanciasAndante));
                ppAndante = (sumappAndante / sumaInstanciasAndante);
            }

            if (sumaAndantino != "") {
                fusion.add(sumaAndantino + " PP Centroide " + (sumappAndantino / sumaInstanciasAndantino));
                ppAndantino = (sumappAndantino / sumaInstanciasAndantino);
            }

            if (sumaModerato != "") {
                fusion.add(sumaModerato + " PP Centroide " + (sumappModerato / sumaInstanciasModerato));
                ppModerato = (sumappModerato / sumaInstanciasModerato);
            }

            if (sumaAlegreto != "") {
                fusion.add(sumaAlegreto + " PP Centroide " + (sumappAlegreto / sumaInstanciasAlegreto));
                ppAlegreto = (sumappAlegreto / sumaInstanciasAlegreto);
            }
            if (sumaAllegro != "") {
                fusion.add(sumaAllegro + " PP Centroide " + (sumappAllegro / sumaInstanciasAllegro));
                ppAllegro = (sumappAllegro / sumaInstanciasAllegro);
            }

            if (sumaVivance != "") {
                fusion.add(sumaVivance + " PP Centroide " + (sumappVivance / sumaInstanciasVivance));
                ppVivance = (sumappVivance / sumaInstanciasVivance);
            }
            if (sumaPresto != "") {
                fusion.add(sumaPresto + " PP Centroide " + (sumappPresto / sumaInstanciasPresto));
                ppPresto = (sumappPresto / sumaInstanciasPresto);
            }
            if (sumaPresstisimo != "") {
                fusion.add(sumaPresstisimo + " PP Centroide " + (sumappPrestismo / sumaInstanciasPrestismo));
                ppPresstisimo = (sumappPrestismo / sumaInstanciasPrestismo);
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
                pp1 = (sumapp1 / sumaInstancias1);
            }

            if (suma12 != "") {
                fusion.add(suma12 + " PP Centroide " + (sumapp12 / sumaInstancias12));
                pp12 = (sumapp12 / sumaInstancias12);
            }

            if (suma14 != "") {
                fusion.add(suma14 + " PP Centroide " + (sumapp14 / sumaInstancias14));
                pp14 = (sumapp14 / sumaInstancias14);
            }

            if (suma18 != "") {
                fusion.add(suma18 + " PP Centroide " + (sumapp18 / sumaInstancias18));
                pp18 = (sumapp18 / sumaInstancias18);
            }

            if (suma116 != "") {
                fusion.add(suma116 + " PP Centroide " + (sumapp116 / sumaInstancias116));
                pp116 = (sumapp116 / sumaInstancias116);
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

        double productoC0 = 0;
        double productoC1 = 0;
        double productoC2 = 0;
        double productoC3 = 0;
        double productoC4 = 0;
        double productoC5 = 0;
        double productoC6 = 0;
        double productoC7 = 0;
        double productoC8 = 0;
        double productoC9 = 0;
        double productoG9 = 0;

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
                ppC0 = (sumappC0 / sumaInstanciasC0);
            }

            if (sumaC1 != "") {
                fusion.add(sumaC1 + " PP Centroide " + (sumappC1 / sumaInstanciasC1));
                ppC1 = (sumappC1 / sumaInstanciasC1);
            }

            if (sumaC2 != "") {
                fusion.add(sumaC2 + " PP Centroide " + (sumappC2 / sumaInstanciasC2));
                ppC2 = (sumappC2 / sumaInstanciasC2);
            }

            if (sumaC3 != "") {
                fusion.add(sumaC3 + " PP Centroide " + (sumappC3 / sumaInstanciasC3));
                ppC3 = (sumappC3 / sumaInstanciasC3);
            }

            if (sumaC4 != "") {
                fusion.add(sumaC4 + " PP Centroide " + (sumappC4 / sumaInstanciasC4));
                ppC4 = (sumappC4 / sumaInstanciasC4);
            }

            if (sumaC5 != "") {
                fusion.add(sumaC5 + " PP Centroide " + (sumappC5 / sumaInstanciasC5));
                ppC5 = (sumappC5 / sumaInstanciasC5);
            }
            if (sumaC6 != "") {
                fusion.add(sumaC6 + " PP Centroide " + (sumappC6 / sumaInstanciasC6));
                ppC6 = (sumappC6 / sumaInstanciasC6);
            }
            if (sumaC7 != "") {
                fusion.add(sumaC7 + " PP Centroide " + (sumappC7 / sumaInstanciasC7));
                ppC7 = (sumappC7 / sumaInstanciasC7);
            }
            if (sumaC8 != "") {
                fusion.add(sumaC8 + " PP Centroide " + (sumappC8 / sumaInstanciasC8));
                ppC8 = (sumappC8 / sumaInstanciasC8);
            }
            if (sumaC9 != "") {
                fusion.add(sumaC9 + " PP Centroide " + (sumappC9 / sumaInstanciasC9));
                ppC9 = (sumappC9 / sumaInstanciasC9);
            }
            if (sumaG9 != "") {
                fusion.add(sumaG9 + " PP Centroide " + (sumappG9 / sumaInstanciasG9));
                ppG9 = (sumappG9 / sumaInstanciasG9);
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

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
                if ("0.0".equals(centroide.get(i))) {

                } else {

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
            }

            if (sumaAdagio != "") {
                fusion.add(sumaAdagio + " PA Centroide " + (sumaCentroideAdagio / banAdagio));
                ppAdagio = sumaCentroideAdagio / banAdagio;
            }

            if (sumaAdaggieto != "") {
                fusion.add(sumaAdaggieto + " PA Centroide " + (sumaCentroideAdaggieto / banAdaggieto));
                ppAdaggieto = sumaCentroideAdaggieto / banAdaggieto;
            }

            if (sumaAndante != "") {
                fusion.add(sumaAndante + " PA Centroide " + (sumaCentroideAndante / banAndante));
                ppAndante = sumaCentroideAndante / banAndante;
            }

            if (sumaAndantino != "") {
                fusion.add(sumaAndantino + " PA Centroide " + (sumaCentroideAndantino / banAndantino));
                ppAndantino = sumaCentroideAndantino / banAndantino;
            }

            if (sumaModerato != "") {
                fusion.add(sumaModerato + " PA Centroide " + (sumaCentroideModerato / banModerato));
                ppModerato = sumaCentroideModerato / banModerato;
            }

            if (sumaAlegreto != "") {
                fusion.add(sumaAlegreto + " PA Centroide " + (sumaCentroideAlegreto / banAlegreto));
                ppAlegreto = sumaCentroideAlegreto / banAlegreto;
            }
            if (sumaAllegro != "") {
                fusion.add(sumaAllegro + " PA Centroide " + (sumaCentroideAllegro / banAllegro));
                ppAllegro = sumaCentroideAllegro / banAllegro;
            }

            if (sumaVivance != "") {
                fusion.add(sumaVivance + " PA Centroide: " + (sumaCentroideVivance / banVivance));
                ppVivance = sumaCentroideVivance / banVivance;
            }
            if (sumaPresto != "") {
                fusion.add(sumaPresto + " PA Centroide " + (sumaCentroidePresto / banPresto));
                ppPresto = sumaCentroidePresto / banPresto;
            }
            if (sumaPresstisimo != "") {
                fusion.add(sumaPresstisimo + " PA Centroide " + (sumaCentroidePrestismo / banPresstisimo));
                ppPresstisimo = sumaCentroidePrestismo / banPresstisimo;
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

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
                pp1 = (sumaCentroide1 / ban1);
            }

            if (suma12 != "") {
                fusion.add(suma12 + " PA Centroide " + (sumaCentroide12 / ban12));
                pp12 = (sumaCentroide12 / ban12);
            }

            if (suma14 != "") {
                fusion.add(suma14 + " PA Centroide " + (sumaCentroide14 / ban14));
                pp14 = (sumaCentroide14 / ban14);
            }

            if (suma18 != "") {
                fusion.add(suma18 + " PA Centroide " + (sumaCentroide18 / ban18));
                pp18 = (sumaCentroide18 / ban18);
            }

            if (suma116 != "") {
                fusion.add(suma116 + " PA Centroide " + (sumaCentroide116 / ban116));
                pp116 = (sumaCentroide116 / ban116);
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

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
                }

            }

            if (sumaC0 != "") {
                fusion.add(sumaC0 + " PA Centroide " + (sumaCentroideC0 / banC0));
                ppC0 = (sumaCentroideC0 / banC0);
            }

            if (sumaC1 != "") {
                fusion.add(sumaC1 + " PA Centroide " + (sumaCentroideC1 / banC1));
                ppC1 = (sumaCentroideC1 / banC1);
            }

            if (sumaC2 != "") {
                fusion.add(sumaC2 + " PA Centroide " + (sumaCentroideC2 / banC2));
                ppC2 = (sumaCentroideC2 / banC2);
            }

            if (sumaC3 != "") {
                fusion.add(sumaC3 + " PA Centroide " + (sumaCentroideC3 / banC3));
                ppC3 = (sumaCentroideC3 / banC3);
            }

            if (sumaC4 != "") {
                fusion.add(sumaC4 + " PA Centroide " + (sumaCentroideC4 / banC4));
                ppC4 = (sumaCentroideC4 / banC4);
            }

            if (sumaC5 != "") {
                fusion.add(sumaC5 + " PA Centroide " + (sumaCentroideC5 / banC5));
                ppC5 = (sumaCentroideC5 / banC5);
            }
            if (sumaC6 != "") {
                fusion.add(sumaC6 + " PA Centroide " + (sumaCentroideC6 / banC6));
                ppC6 = (sumaCentroideC6 / banC6);
            }
            if (sumaC7 != "") {
                fusion.add(sumaC7 + " PA Centroide " + (sumaCentroideC7 / banC7));
                ppC7 = (sumaCentroideC7 / banC7);
            }
            if (sumaC8 != "") {
                fusion.add(sumaC8 + " PA Centroide " + (sumaCentroideC8 / banC8));
                ppC8 = (sumaCentroideC8 / banC8);
            }
            if (sumaC9 != "") {
                fusion.add(sumaC9 + " PA Centroide " + (sumaCentroideC9 / banC9));
                ppC9 = (sumaCentroideC9 / banC9);
            }
            if (sumaG9 != "") {
                fusion.add(sumaG9 + " PA Centroide " + (sumaCentroideG9 / banG9));
                ppG9 = (sumaCentroideG9 / banG9);
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return fusion;
    }

}
