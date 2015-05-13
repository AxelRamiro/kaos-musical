/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebasKaosMusikal;
import org.jfugue.*;

/**
 *
 * @author Omar López Ortega
 */
public class pruebaOctavas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Player tocador = new Player();
        Pattern oct1 = new Pattern("I[Piano] [0] [1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11]");
        Pattern oct2 = new Pattern("I[Piano] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23]");
        Pattern oct3 = new Pattern("I[Piano] [24] [25] [26] [27] [28] [29] [30] [31] [32] [33] [34] [35]");
        Pattern oct4 = new Pattern("I[Piano] [36] [37] [38] [39] [40] [41] [42] [43] [44] [45] [46] [47]");
        Pattern oct5 = new Pattern("I[Piano] [48] [49] [50] [51] [52] [53] [54] [55] [56] [57] [58] [59]");
        Pattern oct6 = new Pattern("I[Piano] [60] [61] [62] [63] [64] [65] [66] [67] [68] [69] [70] [71]");
        Pattern oct7 = new Pattern("I[Piano] [72] [73] [74] [75] [76] [77] [78] [79] [80] [81] [82] [83]");
        Pattern oct8 = new Pattern("I[Piano] [84] [85] [86] [87] [88] [89] [90] [91] [92] [93] [94] [95]");
        Pattern oct9 = new Pattern("I[Piano] [96] [97] [98] [99] [100] [101] [102] [103] [104] [105] [106] [107]");
        Pattern oct10 = new Pattern("I[Piano] [108] [109] [110] [111] [112] [113] [114] [115] [116] [117] [118] [119]");
        Pattern oct11 = new Pattern("I[Piano] [120] [121] [122] [123] [124] [125] [126] [127]");

        Pattern cancion = new Pattern();
        cancion.add(oct1);
        cancion.add("Rh");
        cancion.add(oct2);
        cancion.add("Rh");
        cancion.add(oct3);
        cancion.add("Rh");
        cancion.add(oct4);
        cancion.add("Rh");
        cancion.add(oct5);
        cancion.add("Rh");
        cancion.add(oct6);
        cancion.add("Rh");
        cancion.add(oct7);
        cancion.add("Rh");
        cancion.add(oct8);
        cancion.add("Rh");
        cancion.add(oct9);
        cancion.add("Rh");
        cancion.add(oct10);
        cancion.add("Rh");
        cancion.add(oct11);

        tocador.play(cancion);
    }

}
