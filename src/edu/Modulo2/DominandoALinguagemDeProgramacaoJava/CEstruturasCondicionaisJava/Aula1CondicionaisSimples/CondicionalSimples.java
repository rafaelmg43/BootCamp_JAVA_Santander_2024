package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.CEstruturasCondicionaisJava.Aula1CondicionaisSimples;

public class CondicionalSimples {
    //simulando um caixa eletronico

    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 26;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }

    }
}
