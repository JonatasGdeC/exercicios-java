// 3ª) Criar uma classe Pessoa com as seguintes características:
// • atributos: idade e dia, mês e ano de nascimento, nome da pessoa
// • métodos:
// o calculaIdade(), que recebe a data atual em dias, mês e anos e calcula e armazena no atributo idade a idade atual da pessoa;
// o informaIdade(), que retorna o valor da idade
// o informaNome(), que retorna o nome da pessoa
// o ajustaDataDeNascimento(), que recebe dia, mês e ano de nascimento como parâmetros e preenche nos atributos correspondentes do objeto.
// • Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em 14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643)
// • Fazer uma classe principal que instancie os objetos, inicialize e mostre quais seriam as idades de Einstein e Newton caso estivessem vivos.

package Ex3;
import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args){
        Pessoa AlbertEinstein = new Pessoa();
        AlbertEinstein.SetRecebeDados("Albert Einstein", 14, 3, 1879);
        JOptionPane.showMessageDialog(null, "A idade de "+ AlbertEinstein.GetNome() + " é de "+AlbertEinstein.GetIdade()+ " ano(s).");
        
        Pessoa IsaacNewton = new Pessoa();
        IsaacNewton.SetRecebeDados("Isaac Newton", 4, 1, 1643);
        JOptionPane.showMessageDialog(null, "A idade de "+ IsaacNewton.GetNome() + " é de "+IsaacNewton.GetIdade()+ " ano(s).");
    }
}
