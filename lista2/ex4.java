// 4º) Ler a idade de uma pessoa e informar a sua classe eleitoral:
// Não-eleitor (abaixo de 16 anos)
// Eleitor obrigatório (entre 18 e 65 anos)
// Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.print("Usuário não é eleitor!");
        } else if (idade >= 18 && idade <= 65){
            System.out.print("Usuário é eleitor obrigatório!");
        } else if (idade >= 16 && idade<18 || idade>65){
            System.out.print("Usuário é eleitor facultativo!");
        }

        scanner.close();
    }
}
