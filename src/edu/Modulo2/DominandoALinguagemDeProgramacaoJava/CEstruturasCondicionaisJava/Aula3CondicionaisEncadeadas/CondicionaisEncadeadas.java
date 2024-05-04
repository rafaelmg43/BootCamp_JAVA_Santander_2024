package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.CEstruturasCondicionaisJava.Aula3CondicionaisEncadeadas;

public class CondicionaisEncadeadas {

    public static void main(String[] args) {
        int nota = 8;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Prova de Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
