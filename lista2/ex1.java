// 1º) Ler um valor e informar se ele é ou não múltiplo de 3.

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        Number num = scanner.nextDouble();


        if (num.doubleValue() % 3 == 0){
            System.out.print("O número é múltiplo de 3");
        } else {
            System.out.print("O número não é múltiplo");
        }


        scanner.close();
    }
}