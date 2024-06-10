package src.edu.Modulo3.ProgramacaoOriaentadaObjetos.ConhecendoCollections.DSET.AOperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    //Atributo

    private Set<Convidados> convidadoDoSet;

    public ConjuntoConvidados() {
        this.convidadoDoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoDoSet.add(new Convidados(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidados convidadoParaRemover = null;
        for (Convidados c : convidadoDoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoDoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoDoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoDoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidado(s) dentro do Set Convidados");

        conjuntoConvidados.adicionarConvidado("convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("convidado 4", 1236);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidado(s) dentro do Set Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1235);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidado(s) dentro do Set Convidados");
    }
}
