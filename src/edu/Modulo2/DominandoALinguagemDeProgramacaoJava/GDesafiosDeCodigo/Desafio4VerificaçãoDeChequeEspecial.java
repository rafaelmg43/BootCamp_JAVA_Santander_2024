package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.GDesafiosDeCodigo;
import java.util.Scanner;
/**
 * <h1>Condições, Loops e Exceções na Prática com Java</h1>
 * Desafio de código 4 / 5  da DIO - Verificação de Número de Conta Bancária
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @author  Rafael Cruz dos Santos
 * @version 1.0
 * @since   15/05/2024
 */

public class Desafio4VerificaçãoDeChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
        if(saque <= saldo){
            System.out.println("Transacao realizada com sucesso.");

            // TODO: Verifique se o saque ultrapassa o limite do cheque especial, mas não o saldo total disponível:
        }else{
            double saldoTotal = saldo + limiteChequeEspecial;
            if (saque <= saldoTotal)
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            else
                // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");

        }

// Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}
