package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.DEstruturasDeRepetiçãoJava.Aula1For;

public class Aula3Break {

    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break;

            System.out.println(numero);

        }
    }
}

