// 3) Dados três valores X, Y e Z, verificar se eles podem ser os comprimentos dos lados de 
// um triângulo , através de uma função que retorne valor, e, se forem verificar se é um 
// triângulo equilátero, isósceles ou escalenos. Se eles não formarem um triângulo, escrever 
// a mensagem. Considere as seguintes propriedades: 
// • O comprimento de cada lado em um triângulo é menor que a soma dos outros dois lados; 
// • Equiláteros: tem os comprimentos dos três lados iguais; 
// • Isósceles: tem os comprimentos de dois lados iguais; 
// • escaleno: tem os comprimentos dos três lados diferentes.

import javax.swing.JOptionPane;

public class ex3 {
    public static void main (String[] args){
        try {
            double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um lado o triângulo: "));
            while(lado1 <= 0){
                JOptionPane.showMessageDialog(null, "Nenhum dos lados podem ser menor ou igual a 0", "Inválido", 0);
                lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um lado o triângulo: "));
            }
    
            double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro lado o triângulo: "));
            while(lado2 <= 0){
                JOptionPane.showMessageDialog(null, "Nenhum dos lados podem ser menor ou igual a 0", "Inválido", 0);
                lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um lado o triângulo: "));
            }
    
            double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o último lado o triângulo: "));
            while(lado3 <= 0){
                JOptionPane.showMessageDialog(null, "Nenhum dos lados podem ser menor ou igual a 0", "Inválido", 0);
                lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite um lado o triângulo: "));
            }
    
            boolean triangulo = ConfirmandoTriangulo(lado1, lado2, lado3);
    
            if (triangulo){
                String tipoDeTriangulo = TipoTriangulo(lado1, lado2, lado3);
                JOptionPane.showMessageDialog(null, "Segundo os números fornecidos, o componente é um triângulo do tipo " + tipoDeTriangulo, "É triângulo", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Segundo os números fornecidos, o componente não é um Triângulo", "Não é triângulo!", 0);
            }
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite apenas números...", "Erro", 0);
        }
    }

    public static boolean ConfirmandoTriangulo (double a, double b, double c){
        boolean confirma = true;
        double soma1 = a + b;
        double soma2 = a + c;
        double soma3 = b + c;

        if (a > soma3 || b > soma2 || c > soma1){
            confirma = false;
        }

        return confirma; 
    }

    public static String TipoTriangulo (double a, double b, double c){
        String tipo = "";

        if(a == b && a == c && b == c){
            tipo = "Equiláteros";
        } else if (a == b || a == c || b == c) {
            tipo = "Isósceles";
        } else {
            tipo = "Escaleno";
        }

        return tipo;
    }
}
