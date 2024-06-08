package src.edu.Modulo3.ProgramacaoOriaentadaObjetos.ConhecendoCollections.CLIST.CPesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervaloAnos.add(l);
                }
            }
        }
        return livroPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("LivroUm","AutorUm",2020);
        catalogoLivros.adicionarLivro("LivroUm","Autor 2°",2021);
        catalogoLivros.adicionarLivro("LivroDois","Autor 2°",2022);
        catalogoLivros.adicionarLivro("Livrotrez","Autor 3°",2023);
        catalogoLivros.adicionarLivro("Livro 4°","Autor 4°",1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2°"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020,2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("LivroUm"));
    }

}
