// 3) Um programa capaz de imprimir todos os números primos em um intervalo de 
// números informado pelo usuário; 

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ex3 {

    @SuppressWarnings("unused")
    public static void main (String[] args){
        try{
            JOptionPane.showMessageDialog(null, "Este programa imprime todos os números primos\nno intervalo digitado a seguir", "Olá! Seja Bem vindo", 1);
            String numString1 = JOptionPane.showInputDialog("Digite um número qualquer: ");
            int numDigitado1 = Integer.parseInt(numString1);
            String numString2 = JOptionPane.showInputDialog("Digite outro número: ");
            int numDigitado2 = Integer.parseInt(numString2);

            int num1, num2;
            ArrayList<Integer> listaNumeros = new ArrayList<>();

            if(numDigitado1 < numDigitado2){
                num1 = numDigitado1;
                num2 = numDigitado2;
            } else {
                num1 = numDigitado2;
                num2 = numDigitado1;
            }

            for(int i = num1; i <= num2; i++){
                if (isPrimo(i)){
                    listaNumeros.add(i);
                }
            }

            JOptionPane.showMessageDialog(null, "Os números primos de " + num1 + " a " + num2 + " são:\n " + listaNumeros);
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Vish", 0);
            System.exit(0);
        }        
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
