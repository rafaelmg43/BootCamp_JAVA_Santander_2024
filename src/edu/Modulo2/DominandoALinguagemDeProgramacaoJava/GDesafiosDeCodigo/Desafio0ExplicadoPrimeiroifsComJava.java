package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.GDesafiosDeCodigo;

import java.util.Scanner;

public class Desafio0ExplicadoPrimeiroifsComJava {
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
    //Desafio:
    //Faça um programa que calcule e imprima o salário a ser transferido
    //para um funcionario. Para realizar o cálculo receba o valor bruto do salário e o adicional
    //do benefício.

    public static void main(String[] args) {
        //lê os valores de Entrada:
        Scanner leitorDeEntrada = new Scanner(System.in);
        System.out.println("Digite o Salario: ");
        float valorSalario = leitorDeEntrada.nextFloat();
        System.out.println("Digite o valor do beneficio: ");
        float valorBeneficio = leitorDeEntrada.nextFloat();


        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            //Atribuiu a aliquota de 5% mediante p salário:
            valorImposto = 0.05F * valorSalario;
            System.out.println("Aliquota de 5% " + " valor pago R$:" + valorImposto);
        } else if (valorSalario >= 1100.01 && valorSalario<= 2500.00){
            //Atribuiu a aliquota de 10% mediante p salário:
            valorImposto = 0.10F * valorSalario;
            System.out.println("Aliquota de 10% " + " valor pago R$:" + valorImposto);
        }else {
            //Atribuiu a aliquota de 15% mediante p salário 2500+:
            valorImposto = 0.15F * valorSalario;
            System.out.println("Aliquota de 15% " + " valor pago R$:" + valorImposto);
        }
        //Todo: Criar as demais condições para a aliquota de 10.00% e 15.00%.

        //Calcula e imprime a Saida(com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficio;
        System.out.println(String.format("Valor Liquido R$:" + "%.2f", saida));
    }
}
