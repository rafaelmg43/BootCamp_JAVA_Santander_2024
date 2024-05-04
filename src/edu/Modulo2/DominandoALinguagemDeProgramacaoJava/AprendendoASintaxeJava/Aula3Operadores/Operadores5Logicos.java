package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.AprendendoASintaxeJava.Aula3Operadores;

public class Operadores5Logicos {

    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && (7 > 4)) {
            System.out.println(" as duas condiCoes sao verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println(" uma das condicoes sao verdadeiras");
        }
    }
}