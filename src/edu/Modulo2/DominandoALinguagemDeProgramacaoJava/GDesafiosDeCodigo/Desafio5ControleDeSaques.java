package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.GDesafiosDeCodigo;

import java.util.Scanner;

/**
 * <h1>Condições, Loops e Exceções na Prática com Java</h1>
 * Desafio de código 5 / 5  da DIO - Verificação de Número de Conta Bancária
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @author Rafael Cruz dos Santos
 * @version 1.0
 * @since 15/05/2024
 */

public class Desafio5ControleDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Limite Diario R$:");
        double limiteDiario = scanner.nextDouble();
        double saque = 0;

// TODO: Crie um loop 'for' para iterar sobre os saques:
        for (double i = saque; limiteDiario > i; limiteDiario -= i) {

// TODO: Solicite ao usuário o valor do saque:
            System.out.println("Digite valor de saque: R$:");
            saque = scanner.nextDouble();

// TODO: Verifique se o valor do saque é zero, encerrando as transações:
// Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;

            if (saque == 0) {
                System.out.println("Transacoes encerradas. ");
                return;
// TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
            } else if (saque <= limiteDiario) {
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiario));
            } else
// TODO: Informe que o saque foi realizado e mostre o limite restante:
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            return;
        }

// Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}








