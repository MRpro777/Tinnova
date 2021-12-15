package Controla;

import java.text.DecimalFormat;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class ControlaExercicio4 {
    static DecimalFormat df = new DecimalFormat("0");
    public static void calculaSomaMultiplos(JSpinner spn, JTextField tfd){
        try {
            int numero = Integer.parseInt(spn.getValue().toString());
            double resultado = 0;
            for (int i = 0; i < numero; i++) {
                if(i % 3 == 0 || i % 5 == 0){
                    resultado = resultado + i;
                }
            }

            tfd.setText(df.format(resultado));
        } catch (Exception e) {
        }
    }
}