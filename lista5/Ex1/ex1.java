// 1ª) Criar uma Classe chamada Triangulo que contenha como atributos a base e altura de um triângulo.
// Na classe definir um método para leitura da base e altura, um método construtor e um método para Calcular a área do triângulo (Area=Base * Altura)/2.
// No método principal do programa (main) , criar um objeto a partir da classe criada, solicitar e atribuir os
// valores da base e altura e invocar o método que calcula a área a partir do objeto criado.

package Ex1;
import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String [] args){
        try{
            float base, altura;
        
            String baseString = JOptionPane.showInputDialog("Digite o valor da base: ");
            String altuString = JOptionPane.showInputDialog("Digite o valor da altura: ");
        
            base = Float.parseFloat(baseString);
            altura = Float.parseFloat(altuString);
        
            Triangulo areaTriangulo = new Triangulo();
            areaTriangulo.SetDimensao(base, altura);
        
            JOptionPane.showMessageDialog(null, "A área do triângulo é " + areaTriangulo.GetArea());
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
        }
    }
}
