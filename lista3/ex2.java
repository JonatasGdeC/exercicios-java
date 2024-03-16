// 2) Um programa que imprima até o “n” termo a seqüência de Fibonacci. Série: 
// 1,1,2,3,5,8,13,21....... 
// Por exemplo, imprimir até o 6º termo:  1, 1, 2, 3, 5, 8 
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ex2 {

    public static void main(String[] args) {
        try{
            JOptionPane.showMessageDialog(null, "Este programa imprime a sequência de Fibonacci\nDe acordo com o termo fornecido...", "Olá! Seja bem vindo", 1);
            String msgTermo = JOptionPane.showInputDialog("Digite o termo desejado da sequência: ");
            int num = Integer.parseInt(msgTermo);
    
            int termo1 = 0;
            int termo2 = 1;
            int termoAtual;
            ArrayList<Integer> listaNumeros = new ArrayList<>();
    
            for(int i = 2; i <= (num+1); i++){
                if (i==3){
                    termoAtual = termo2;
                } else {
                    termoAtual = termo1 + termo2;
                }
                listaNumeros.add(termoAtual);
                termo1 = termo2;
                termo2 = termoAtual;
            }
    
            JOptionPane.showMessageDialog(null, "Imprimindo até o " + msgTermo + "º termo da sequêcia de Fibonacci: \n" + listaNumeros);
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Vish", 0);
            System.exit(0);
        }
    }
}