// 2) Ler número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o 
// saldo atual (saldo atual = saldo - débito + crédito), através de uma função que retorne 
// valor, também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo 
// Positivo', senão escrever a mensagem 'Saldo Negativo'. 

import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args){
        try{
            int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de sua conta (apenas número): "));
            double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saldo em de sua conta: R$ "));
            double debito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do debito em de sua conta: R$ "));
            double credito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de credito em de sua conta: R$ "));
    
            double saldoAtualCliente = saldoAtual(saldo, debito, credito);
    
            if(saldoAtualCliente < 0){
                JOptionPane.showMessageDialog(null, "A conta " + numeroConta + " possui saldo NEGATIVO", "NEGATIVO", 2);
            } else {
                JOptionPane.showMessageDialog(null, "A conta " + numeroConta + " possui saldo POSITIVO", "POSITIVO", 1);
            }
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite apenas números...", "Erro", 0);
        }
    }

    public static double saldoAtual (double saldoCliente, double debitoCliente, double creditoCliente){
        double saldoAtual = saldoCliente - (debitoCliente+creditoCliente);
        return saldoAtual;
    }
}
