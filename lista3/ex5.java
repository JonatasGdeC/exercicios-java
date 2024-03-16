// 5) Criar um programa que leia um número que será o limite superior de um intervalo e 
// o incremento. Exibir todos os números naturais no intervalo de 0 até esse número.  
// Suponha que os dois números lidos são maiores que zero. Exemplo: 
// Limite superior: 20 
// Incremento: 5 
// Saída: 0  5  10  15  20

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ex5 {
    public static void main(String[] args){
        try{
            JOptionPane.showMessageDialog(null, "Este programa irá fornecer uma lista de número\nno intervalo declarado e conforme o número de incremento...", "Olá, seja bem vindo!", 1);
            String incrementoMsg = JOptionPane.showInputDialog("Digite o valor do incremento: ");
            int incremento = Integer.parseInt(incrementoMsg);
            while(incremento == 0){
                JOptionPane.showMessageDialog(null, "O incremento não pode ser igual a 0", "Vish...", 2);
                incrementoMsg = JOptionPane.showInputDialog("Digite o valor do incremento: ");
                incremento = Integer.parseInt(incrementoMsg);
            }
            if(incremento < 0){
                incremento *= -1;
            }
    
            String limiteMsg = JOptionPane.showInputDialog("Digite o limite superior: ");
            int limite = Integer.parseInt(limiteMsg);
            while(limite == 0){
                JOptionPane.showMessageDialog(null, "O limite não pode ser igual a 0", "Vish...", 2);
                limiteMsg = JOptionPane.showInputDialog("Digite o valor do incremento: ");
                limite = Integer.parseInt(incrementoMsg);
            }
            if(limite < 0){
                limite *= -1;
            }
    
            ArrayList<Integer> listaNumeros = new ArrayList<>();
            for(int i = 0; i <= limite; i+=incremento){
                listaNumeros.add(i);
            }
    
            JOptionPane.showMessageDialog(null, "A lista de número no intervalo de 0 a "+limite+ "\n com incremento de " + incremento + " é:\n"+listaNumeros);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Vish", 0);
            System.exit(0);
        }
    }
}
