package src.edu.Modulo3.ProgramacaoOriaentadaObjetos.ConhecendoCollections.EMAP.BPesquisa;

public class Produto {

    //Atributo

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Estoque { " +
                "nomeProduto = '" + nome + '\'' +
                ", preco = " + preco +
                ", quantidade = " + quantidade +
                '}';
    }


}
