package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.CEstruturasCondicionaisJava.Aula4Ternaria;

public class CondicionaisTernaria {
    public static void main(String[] args) {
        int nota = 6;

       String resultado = nota >= 7 ? "Aprovado" : nota>=5 && nota<7 ? "recuperação" : "Reporvado";

        System.out.println(resultado);
    }
}
