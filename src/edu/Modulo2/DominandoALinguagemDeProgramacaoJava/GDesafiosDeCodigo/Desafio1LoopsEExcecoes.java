package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.GDesafiosDeCodigo;

import java.util.Scanner;

public class Desafio1LoopsEExcecoes {
    /**
     * <h1>Condições, Loops e Exceções na Prática com Java</h1>
     * Desafio de código 2 / 5  da DIO - Verificação de Número de Conta Bancária
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Rafael Cruz dos Santos
     * @version 1.0
     * @since   15/05/2024
     */
    //Descrição
    //Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas. A aplicação deve permitir ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.

    //Entrada
    //O programa exibirá um menu com as seguintes opções:

    //Depositar
    //Sacar
    //Consultar Saldo
    //Encerrar
    // O usuário escolherá uma dessas opções digitando o número correspondente.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        // ‘Loop’ infinito para manter o programa em execução até que o usuário decida sair
        while (true) {
            System.out.println("Opcões de Escolha : ");
            System.out.println(" 1 = Deposito :\n 2 = Sacar :\n 3 = Consultar Saldo :\n 4 = Encerrar :");
            int opcao = scanner.nextInt();

            // TODO: Implemente as condições necessárias para avaliar a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.


            switch (opcao) {
                case 1:
                    System.out.println("Valor para Deposito: ");
                    saldo += scanner.nextDouble();
                    System.out.println("Saldo Atual " + saldo);
                    break;

                case 2:
                    System.out.println("Valor Desejado para Saque: ");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Valor Insuficiente para Saque.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque efetuado com sucesso no valor de:   " + saque);
                    }
                    break;

                case 3:

                    System.out.println("Saldo Disponivel atual : " + saldo);
                    break;

                case 4:

                    System.out.println("Programa Encerrado ");
                    scanner.close();
                    return;

                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        }
    }
}


