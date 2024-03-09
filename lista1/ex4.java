//4) Faça um programa que leia  uma temperatura em graus Centígrados e 
// apresente-a convertida em graus Fahrenheit.  A fórmula de conversão é:  
// F = (9 * C + 160) / 5, onde F é a temperatura em Fahrenheit e C em graus 
// Centígrados.

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor em ºC: ");
        float grausCelsius = scanner.nextFloat();

        float grausFahrenheit = ( 9 * grausCelsius + 160)/5;

        System.out.print("O valor de " + grausCelsius + "ºC em Fahrenheit é " + grausFahrenheit + "ºF");

        scanner.close();
    }
}
