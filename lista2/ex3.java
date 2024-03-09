//  3º) Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for menor que R$20,00;
//  caso contrário, o lucro será de 30%. Entrar com o valor do produto e imprimir o valor da venda.

import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        Double valorOriginal = scanner.nextDouble();

        if (valorOriginal.doubleValue() < 20) {
            Double valorPorcentagem = valorOriginal * 0.45;
            Double valorFinal = valorOriginal + valorPorcentagem;
            System.out.print("O valor final do produto é R$ " + valorFinal);
        } else {
            Double valorPorcentagem = valorOriginal * 0.3;
            Double valorFinal = valorOriginal + valorPorcentagem;
            System.out.print("O valor final do produto é R$ " + valorFinal);
        }

        scanner.close();
    }
}
