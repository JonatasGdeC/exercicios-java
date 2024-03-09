// 2 ) Para vários tributos, a base de cálculo é o salário mínimo.  Fazer um programa 
// que leia o valor do salário mínimo e o valor do salário de uma pessoa.  Calcular 
// e mostrar quantos salários mínimos ela ganha. 

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        
        System.out.print("Digite o valor do seu salário: ");
        double salarioPessoa = scanner.nextDouble();

        double salarioMinimoRecebido = salarioPessoa / salarioMinimo;

        System.out.print("Você recebe cerca de " + salarioMinimoRecebido + " salário(s) mínimo.");
        scanner.close();
	}
}
