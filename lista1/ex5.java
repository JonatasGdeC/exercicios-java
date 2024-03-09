// 5) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a 
// fórmula: 
// VOLUME = 3.14159 * R2 * ALTURA

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio da lata: ");
        float raio = scanner.nextFloat();
        System.out.print("Digite o valor da altura: ");
        float altura = scanner.nextFloat();

        double volume = (3.14159 * raio * altura);
        System.out.print("O volume da lata é: " + volume);


        scanner.close();
    }
}
