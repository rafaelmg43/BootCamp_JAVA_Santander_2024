package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.AprendendoASintaxeJava.Aula2Variaveis;

public class TiposDeVariaves {

    public static void main(String[] args) {
        //Variavel Tipo + nomevariavel = Atribuição
        //TIPO  nomeVariavel = Atribuição
        int idade = 12;
        byte idade2 = 123;
        short ano = 2021;
        int cep = 8745300;
        long cpf = 45654367878L;
        float pi = 3.14F;
        double salarioMinimo = 2500.43;

        //Exemplo de erros comuns usando cast
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;//deve ser escrito em caixa alta toda letras maiusculas

        System.out.println(VALOR_DE_PI);


    }
}
