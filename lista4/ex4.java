// 4) Calcule o peso ideal de uma pessoa através de uma função que não retorne valor. Dados 
// de entrada: altura e sexo. Fórmulas para cálculo do peso: 
// peso ideal de homem = (72,7 x altura) - 58 
// peso ideal da mulher = (62,1 x altura) - 44,7 

import javax.swing.JOptionPane;

public class ex4 {
    public static void main(String[] args){
        try {
            JOptionPane.showMessageDialog(null, "Seja bem vindo!\nDescubra qual seria seu peso ideal conforme sua altura...", "Calculadora de Peso ideal", 1);
            int genero = Integer.parseInt(JOptionPane.showInputDialog("Homem (0) | Mulher (1)\nInforme seu gênero: "));
            while(genero > 1 || genero < 0){
                JOptionPane.showMessageDialog(null, "Digite 0 (Homem) ou 1 (Mulher)", "Preenchido incorretamente", 1);
                genero = Integer.parseInt(JOptionPane.showInputDialog("Homem (0) | Mulher (1)\nInforme seu gênero: "));
            }
    
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura em metros: "));
            while (altura <= 0) {
                JOptionPane.showMessageDialog(null, "Informe sua altura corretamente", "Erro!", 0);
                altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura em metros: "));
            }
            
            double idealPeso = pesoIdeal(genero, altura);
    
            JOptionPane.showMessageDialog(null, "O peso ideal para você é: " + idealPeso + " kg.", "Peso ideal", 1);
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite apenas números...", "Erro", 0);
        }
    }


    public static double pesoIdeal(int genero, double altura){
        double pesoIdeal;

        if(genero == 0){
            pesoIdeal = (72.7 * altura) - 58;
        } else{
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        return pesoIdeal;
    }
}
