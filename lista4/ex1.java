// 1) Ler o nome de um produto, o preço e a quantidade comprada. Escreva o nome do 
// produto comprado e o valor total a ser pago, considerando que são oferecidos descontos 
// pelo número de unidades compradas, segundo a tabela abaixo: 
// a) Até 10 unidades: valor total 
// b) De 11 a 20 unidades: 10% de desconto 
// c) De 21 a 50 unidades: 20% de desconto 
// d) Acima de 50 unidades: 25% de desconto 
// Calcular o valor total a ser pago através de uma função que retorna valor.

import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String[] args){
        try{
            JOptionPane.showMessageDialog(null, "Irei te ajudar a descobrir o valor total da compra...", "Olá! Seja bem vindo", 1);
            String nameProduct = JOptionPane.showInputDialog("Primeiramente, escreva o nome do produto: ");
            
            String precoString = JOptionPane.showInputDialog("Digite o preço unitário: R$ ");
            Double preco = Double.parseDouble(precoString);
            while (preco <= 0) {
                JOptionPane.showMessageDialog(null, "O preço a ser pago não pode ser igual ou menor que 0...", "Inválido!", 0);
                precoString = JOptionPane.showInputDialog("Digite o preço unitário: R$ ");
                preco = Double.parseDouble(precoString);
            }
    
            String qtdString = JOptionPane.showInputDialog("Digite a quantidade comprada: ");
            int qtd = Integer.parseInt(qtdString);
            while (qtd <= 0) {
                JOptionPane.showMessageDialog(null, "Por favor, digite uma quantidade maior que 0", "Inválido!", 0);
                qtdString = JOptionPane.showInputDialog("Digite a quantidade comprada: ");
                qtd = Integer.parseInt(qtdString);
            }
    
            double precoFinal = PrecoFinal(preco, qtd);
    
            JOptionPane.showMessageDialog(null, "Ao comprar " + qtdString + " unidade(s) de " + nameProduct + ", \nO valor total a ser pago é de R$ " + precoFinal, "Resultado", 1);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite apenas número em 'Preço' e 'Quantidade'...", "Erro", 0);
        }
    }

    public static double PrecoFinal(double preco, int qtd){
        Double desconto;
        if (qtd <= 10){
            desconto =  0.0;
        } else if (qtd >= 11 && qtd<=20){
            desconto = 0.1;
        } else if (qtd >= 21 && qtd <= 50){
            desconto = 0.20;
        } else {
            desconto = 0.25;
        }

        Double precoTotal = preco * qtd;
        Double valorDesconto = precoTotal * desconto;
        Double precoFinal = precoTotal - valorDesconto;

        return precoFinal;
    }
}