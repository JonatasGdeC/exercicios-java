// 1 ) Em época de pouco dinheiro, os comerciantes estão procurando aumentar suas 
// vendas oferecendo desconto.  Faça um programa que possa entrar com o nome 
// de um produto e seu  valor unitário e calcular e exibir  um novo valor com um 
// desconto de 9%. 

import java.util.Scanner;

public class ex1
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = scanner.nextDouble();
        
        double desconto = valorUnitario * 0.09;
        double novoValor = valorUnitario - desconto;
        
        System.out.println("Novo valor do produto '" + nomeProduto + "': R$" + novoValor);
        scanner.close();
	}
}