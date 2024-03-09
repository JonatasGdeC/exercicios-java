// Faça um programa que leia dois valores e informe a média entre eles. (use float 
// como tipo de dado). 

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o valor v1: ");
        float v1 = scanner.nextFloat();
        System.out.print("Digite o valor de v2: ");
        float v2 = scanner.nextFloat();

        float media = (v1+v2)/2;

        System.out.print("O valor da média é " + media);
        scanner.close();
    }
}
