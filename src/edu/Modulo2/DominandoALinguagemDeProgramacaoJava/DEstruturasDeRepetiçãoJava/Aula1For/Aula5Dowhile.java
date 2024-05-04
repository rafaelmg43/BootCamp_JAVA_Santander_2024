package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.DEstruturasDeRepetiçãoJava.Aula1For;

import java.util.Random;

public class Aula5Dowhile {

    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            //excutando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

        } while (tocando());

        System.out.println("Alô !!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return !atendeu;
    }
}
