package src.edu.Modulo3.ProgramacaoOriaentadaObjetos.ConhecendoCollections.DSET.COrdenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    //Atributo

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNomes = new TreeSet<>(produtoSet);
        return produtosPorNomes;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1l, "produto 5 ", 15d, 5);
        cadastroProdutos.adicionarProduto(2l, "produto 0 ", 10d, 10);
        cadastroProdutos.adicionarProduto(1l, "produto 3 ", 10d, 2);
        cadastroProdutos.adicionarProduto(9l, "produto 9 ", 2d, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
