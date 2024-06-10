package src.edu.Modulo3.ProgramacaoOriaentadaObjetos.ConhecendoCollections.DSET.AOperacoesBasicas;

import java.util.Objects;

public class Convidados {
    //Atributos

    private String nome;

    private int codigoConvite;

    public Convidados(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidados that)) return false;
        return getCodigoConvite() == that.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidados{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
