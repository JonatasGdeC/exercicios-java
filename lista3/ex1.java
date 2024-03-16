// 1) Um programa capaz de imprimir todos os números pares em um 
// intervalo de números informador pelo usuário;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ex1 {

    public static void main(String[] args) {
        try{
            JOptionPane.showMessageDialog(null, "Este programa é capaz de imprimir todos os\nnúmeros pares em um intervalo de números" ,"Seja Bem-vindo!", 1);
            String msgNum1 = JOptionPane.showInputDialog("Digite um número:");
            String msgNum2 = JOptionPane.showInputDialog("Digite outro número:");
            int num1 = Integer.parseInt(msgNum1);
            int num2 = Integer.parseInt(msgNum2);
            ArrayList<Integer> listaNumeros = new ArrayList<>();

            if (num1 == num2) {
                JOptionPane.showMessageDialog(null, "Não há intervalo de números inteiros entre " + msgNum1 + " e " + msgNum2);
            } else {
                while(num1 < num2){
                    if (num1 % 2 != 0){
                        num1 -= 1;
                    }
                    
                    num1 += 2;
                    listaNumeros.add(num1);
                }

                JOptionPane.showMessageDialog(null, "Entre os números " + msgNum1 + " e " + msgNum2 + "\nO intervalo de números pares é: \n" + listaNumeros);
            }
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Somente números!");
            System.exit(0);
        }
    }
}
