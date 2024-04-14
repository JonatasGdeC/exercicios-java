// 2ª) Criar uma Classe chamada Equacao que contenha como atributos 3 valores inteiros, A, B e C. 
// Na classe definir um método para leitura dos valores, um método construtor e um método para calcular as raízes da equação.
// R1 = (-b+ (raiz de delta)) / (2*a)
// R2 = (-b-(raiz de delta)) / (2*a)
// Considerar que:
// - Se delta = 0, as raízes são iguais;
// - Se delta <0, não existem raízes reais;
// - Se delta >0, existem 2 raízes diferentes
// No método principal do programa (main) , criar um objeto a partir da classe criada, solicitar 
// e atribuir os valores e invocar o método que calcula as raízes a partir do objeto criado.

package Ex2;
import javax.swing.JOptionPane;

public class ex2 {
    public static void main (String[] args){
        try{
            float a, b, c;
    
            String valorA = JOptionPane.showInputDialog("Digite o valor de A: ");
            String valorB = JOptionPane.showInputDialog("Digite o valor de B: ");
            String valorC = JOptionPane.showInputDialog("Digite o valor de C: ");
    
            a = Float.parseFloat(valorA);
            b = Float.parseFloat(valorB);
            c = Float.parseFloat(valorC);
    
            Equacao fazerConta = new Equacao();
            fazerConta.SetRecebeValor(a, b, c);
    
            JOptionPane.showMessageDialog(null, "Resultado:\n" + fazerConta.GetRaiz());
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite apenas número!");
        }
    }
}
