// 5º) Depois da liberação do governo para as mensalidades dos planos de saúde, 
//  as pessoas começaram a fazer pesquisas para descobrir um bom plano, não muito caro.
//  Um vendedor de um plano de saúde apresentou a tabela a seguir. Criar um programa que entre 
//  com o nome e a idade de uma pessoa e mostre o valor que ela deverá pagar.

// Até 10 anos – R$ 30,00
// Acima de 10 até 29 anos – R$ 60,00
// Acima de 29 até 45 anos – R$ 120,00
// Acima de 45 até 59 anos – R$ 150,00
// Acima de 59 até 65 anos – R$ 250,00
// Maior que 65 anos – R$ 400,00

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if(idade <= 10) {
            System.out.print("Segundo a idade de " + nome + " , o valor do plano é: R$30,00");
        } else if (idade > 10 && idade <= 29){
            System.out.print("Segundo a idade de " + nome + " , o valor do plano é: R$60,00");
        } else if (idade > 29 && idade <= 45){
            System.out.print("Segundo a idade de " + nome + " , o valor do plano é: R$120,00");
        } else if (idade > 45 && idade <= 59){
            System.out.print("Segundo a idade de " + nome + " , o valor do plano é: R$150,00");
        } else if (idade > 59 && idade <= 65){
            System.out.print("Segundo a idade de " + nome + " , o valor do plano é: R$250,00");
        } else if (idade > 65){
            System.out.print("Segundo a idade de " + nome + " , o valor do plano é: R$400,00");
        }

        scanner.close();
    }
}
