package Controla;

import java.text.DecimalFormat;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class ControlaExercicio1 {
    static DecimalFormat df = new DecimalFormat("00.00");
    public static void calculaPorcentagem(JSpinner spnTotal, JSpinner spn, JTextField tfd){
        try {
            double totalEleitores = Double.parseDouble(spnTotal.getValue().toString());
            double validos = Double.parseDouble(spn.getValue().toString());
            double porcentagem = (validos / totalEleitores) * 100;
            if (porcentagem > 0) {
                tfd.setText(df.format(porcentagem));
            }else{
                tfd.setText("0");
            }
        } catch (Exception e) {
        }
    }
    
    public static void somaTotalEleitores(JSpinner spnValidos, JSpinner spnBrancos, JSpinner spnNulos, JSpinner spnTotalEleitores){
        int validos = Integer.parseInt(spnValidos.getValue().toString());
        int brancos = Integer.parseInt(spnBrancos.getValue().toString());
        int nulos = Integer.parseInt(spnNulos.getValue().toString());
        spnTotalEleitores.setValue(validos + brancos + nulos);
    }
}
