package src.edu.Modulo2.DominandoALinguagemDeProgramacaoJava.EjavaTratamentoDeExcecoes.Aula2ExceçõesCustomizadas;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepformatado = formatarCep("2376506");
            System.out.println(cepformatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep nao corresponde com as regras de Negocio");;
        }
    }



    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }
}
