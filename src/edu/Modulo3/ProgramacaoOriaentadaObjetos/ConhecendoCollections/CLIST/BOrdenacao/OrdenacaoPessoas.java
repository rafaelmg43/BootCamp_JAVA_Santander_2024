package src.edu.Modulo3.ProgramacaoOriaentadaObjetos.ConhecendoCollections.CLIST.BOrdenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAlt = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAlt, new ComparatorPorAltura());
        return pessoasPorAlt;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("nome 1",20,1.56);
        ordenacaoPessoas.adicionarPessoa("nome 2",30,1.80);
        ordenacaoPessoas.adicionarPessoa("nome 3",25,1.70);
        ordenacaoPessoas.adicionarPessoa("nome 4",17,1.56);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }

}
