package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.GDesafiosDeCodigo;
import java.util.Scanner;
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

// Aqui é definido uma classe chamada VerificadorElegibilidadeConta:
public class Desafio3VerificadorDeIdadeParaContaBancária {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

// TODO: Verifique se a idade é maior ou igual a 18 e imprima uma mensagem informando que o usuário é elegível para criar uma conta bancária:
        if(idade >= 18)
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        else
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");

// Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}


