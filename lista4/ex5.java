// 5) Num determinado Estado, para transferências de veículos, o DETRAN cobra uma taxa 
// de 1% para carros fabricados antes de 1990 e uma taxa de 1.5% para os fabricados de 
// 1990 em diante, taxa esta incidindo sobre o valor de tabela do carro. O projeto deve ler o 
// ano e o preço do carro e a seguir calcular e exibir o imposto a ser pago, através de uma 
// função que retorne valor. 

import java.util.Calendar;

import javax.swing.JOptionPane;

public class ex5 {
    public static void main(String[] args){
        try{
            int anoFabricado = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricação do veículo: "));
            int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
            while (anoFabricado < 1886){
                JOptionPane.showMessageDialog(null, "Se o primeiro carro a ser lançado foi em 1886, como é que você vem me falar que tem um carro do ano " + anoFabricado + "?\nDigite corretamente o ano de fabricação...", "Tá achando que me engana?!", 0);
                anoFabricado = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricação do veículo: "));
            }
            while (anoFabricado > anoAtual){
                JOptionPane.showMessageDialog(null, "Se estamos em " + anoAtual + ", como você vem falar que seu carro foi fabricado em " + anoFabricado + "? Viagem no futuro?\nDigite corretamente o ano de fabricação...", "Tá achando que me engana?!", 0);
                anoFabricado = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricação do veículo: "));
            }

            double valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da tabela fipe do veículo: R$"));
            while(valorCarro <= 0){
                JOptionPane.showMessageDialog(null, "O valor da tabela fipe do carro não pode ser menor ou igual a 0...", "Erro!", 0);
                valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da tabela fipe do veículo: R$"));
            }
    
            JOptionPane.showMessageDialog(null, "Para um carro do ano " + anoFabricado + ", com o valor da tabela fibe R$ " + valorCarro + "\nO valor da taxa a ser paga na Detran é R$ " + CalculaTaxa(anoFabricado, valorCarro), "Valor a pagar", 1);
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite apenas números...", "Erro", 0);
        }
    }

    public static double CalculaTaxa(int ano, double preco){
        double taxa;
        
        if(ano < 1990){
            taxa = 0.1;
        } else {
            taxa = 0.15;
        }

        double pagar = preco * taxa;

        return pagar;
    }
}
