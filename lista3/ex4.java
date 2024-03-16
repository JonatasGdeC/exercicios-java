// 4) Um programa que calcule a média de uma aluno nos moldes da Fatec MAUÁ. 

import javax.swing.JOptionPane;

public class ex4 {
    public static void main(String[] args){
        try{
            JOptionPane.showMessageDialog(null, "Este programa ajuda a calcular sua média na FATEC...", "Olá! Seja Bem vindo 😊", 1);
            String p1Digitado = JOptionPane.showInputDialog("Digite a sua nota na P1: ");
            Double notaP1 = Double.parseDouble(p1Digitado);
            while(notaP1 > 10 || notaP1 < 0){
                JOptionPane.showMessageDialog(null, "As notas são de 0 a 10!", "Animal! 😡", 2);
                p1Digitado = JOptionPane.showInputDialog("Digite a nota na P1: ");
                notaP1 = Double.parseDouble(p1Digitado);
            }

            String p2Digitado = JOptionPane.showInputDialog("Digite a sua nota na P2: ");
            Double notaP2 = Double.parseDouble(p2Digitado);
            while(notaP2 > 10 || notaP2 < 0){
                JOptionPane.showMessageDialog(null, "As notas são de 0 a 10!", "Animal! 😡", 2);
                p2Digitado = JOptionPane.showInputDialog("Digite a nota na P2: ");
                notaP2 = Double.parseDouble(p2Digitado);
            }
            
            String notaTrabalhoDigitado = JOptionPane.showInputDialog("Digite a nota de trabalho: ");
            Double notaTrabalho = Double.parseDouble(notaTrabalhoDigitado);
            while(notaTrabalho > 10 || notaTrabalho < 0){ 
                JOptionPane.showMessageDialog(null, "As notas são de 0 a 10!", "Animal! 😡", 2);
                notaTrabalhoDigitado = JOptionPane.showInputDialog("Digite a nota de trabalho: ");
                notaTrabalho = Double.parseDouble(notaTrabalhoDigitado);
            }

            Double somaNotas = notaP1 + notaP2 + notaTrabalho;
            double media = somaNotas / 3;

            if(media >= 7){
                JOptionPane.showMessageDialog(null, "Você foi aprovado nessa matéria!", "Parabéns 🎉", 1);
            } else {
                String p3Digitado = JOptionPane.showInputDialog("Você não conseguiu passar de primeira... \nDigite a sua nota na P3: ");
                Double notaP3 = Double.parseDouble(p3Digitado);

                Double somaTodasNotas = somaNotas + notaP3;
                Double mediaFinal = somaTodasNotas / 4;

                if(mediaFinal >=7){
                    JOptionPane.showMessageDialog(null, "Você conseguiu concluir essa matéria!", "Ufaa 😌", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Infelizmente você deverá refazer essa matéria\nno próximo semestre...", "Ih rapaz... 😞", 0);
                }
            }
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Vish 😬", 0);
            System.exit(0);
        }
    }
}
