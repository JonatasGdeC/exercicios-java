package Ex3;
import java.time.LocalDate;

public class Pessoa {
    int idade, diaNascimentoPessoa, mesNascimentoPessoa, anoNascimentoPessoa;
    String nome;

    public void SetRecebeDados(String nomePessoa, int diaNascimento, int mesNascimento, int anoNascimento){
        nome = nomePessoa;
        diaNascimentoPessoa = diaNascimento;
        mesNascimentoPessoa = mesNascimento;
        anoNascimentoPessoa = anoNascimento;
    }

    public int GetIdade(){
        LocalDate dataAtual = LocalDate.now();
        int diaAtual = dataAtual.getDayOfMonth();
        int mesAtual = dataAtual.getMonthValue();
        int anoAtual = dataAtual.getYear();

        idade = anoAtual - anoNascimentoPessoa;

        if (mesAtual < mesNascimentoPessoa || mesAtual == mesNascimentoPessoa && diaAtual < diaNascimentoPessoa) {
            idade -= 1;
        }
        
        return idade;
    }

    public String GetNome(){
        return nome;
    }

    Pessoa(){
        idade = 0;
        diaNascimentoPessoa = 0;
        mesNascimentoPessoa = 0;
        anoNascimentoPessoa = 0;
        nome = "";
    }
}
