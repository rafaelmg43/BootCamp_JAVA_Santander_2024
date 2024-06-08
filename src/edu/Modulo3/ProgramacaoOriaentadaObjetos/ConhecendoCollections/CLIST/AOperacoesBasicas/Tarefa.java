package src.edu.Modulo3.ProgramacaoOriaentadaObjetos.ConhecendoCollections.CLIST.AOperacoesBasicas;

public class Tarefa {
    //Atributo

    private String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;

    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao ;
    }
}
