package src.edu.Modulo3.ProgramacaoOriaentadaObjetos.ConhecendoCollections.DSET.BPesquisa;

import java.util.Objects;

public class Contato {
    //Atributo

    private String nome;

    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return getNome().equals(contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return "Contato " +
                "nome = ' " + nome + '\'' +
                ", numero = " + numero;
    }
}
