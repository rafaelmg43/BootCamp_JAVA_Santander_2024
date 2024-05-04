package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.AprendendoASintaxeJava.Aula3Operadores;

public class Operadores4relacionais {

    public static void main(String[] args) {
        String nomeUm = "Rafael";
        String nommedois = new String("Rafael");

        System.out.println(nomeUm.equals(nommedois));//para objetos devemos usar o equals para verificar se sao iguais

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 == numero2) {
            System.out.println("a nossa condição e verdadeira");
        } else {
            System.out.println("Condicao nao atendida");
        }

        simNao = numero1 == numero2;
        System.out.println("numero1 e igual a numero2 " + simNao);
        simNao = numero1 != numero2;
        System.out.println("numero1 e diferente a numero2 " + simNao);
        simNao = numero1 > numero2;
        System.out.println("numero1 e maior a numero2 " + simNao);
        simNao = numero1 < numero2;
        System.out.println("numero1 e menor a numero2 " + simNao);
    }

}
