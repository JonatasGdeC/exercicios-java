// 2º) Ler três números e mostrá-los em ordem crescente.

import java.util.Scanner;
public class ex2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite um número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite um número: ");
        int num3 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        System.out.println(num1 + ", " + num2 + ", " + num3);
        scanner.close();
    }
}
