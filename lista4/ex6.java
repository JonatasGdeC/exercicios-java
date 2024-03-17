// 6) Escreva um programa para ler um valor e escrever a soma da sua tabuada de 1 até 10 
// Ex: 
// Digite Numero 
// 5 
// Soma da Tabuada = 275

import javax.swing.JOptionPane;

public class ex6 {
    public static void main (String[]  args){
        try{
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro maior que 0: "));
            while (num <= 0){
                JOptionPane.showMessageDialog(null, "Digite apenas números maior que 0: ", "Inválido", 0);
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro maior que 0: "));
            }
    
            JOptionPane.showMessageDialog(null, "O resultado da soma da tabuada de 1 a 10, do número " + num + " é:\n" + SomaTabuada(num), null, 1);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite apenas números...", "Erro", 0);
        }
    }

    public static Integer SomaTabuada (int num){
        int soma = 0;

        for(int i = 0; i <= 10; i++){
            int multiplica = num*i;
            soma += multiplica;
        }

        return soma;
    }
}
