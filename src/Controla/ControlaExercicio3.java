package Controla;

import java.text.DecimalFormat;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class ControlaExercicio3 {
    static DecimalFormat df = new DecimalFormat("0");
    public static void calculaFatorial(JSpinner spn, JTextField tfd){
        try {
            int fatorial = Integer.parseInt(spn.getValue().toString());
            double resultado = 1;
            for (int i = 1; i <= fatorial; i++) {
                resultado = resultado * i;
            }

            tfd.setText(df.format(resultado));
        } catch (Exception e) {
        }
    }
}