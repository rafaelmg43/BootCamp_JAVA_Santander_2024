package src.edu.Modulo3.ProgramacaoOriaentadaObjetos.ConhecendoCollections.EMAP.AOperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributos

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Rafael", 995564996);
        agendaContatos.adicionarContato("Rafael", 9955);
        agendaContatos.adicionarContato("Rafael Cruz", 995564996);
        agendaContatos.adicionarContato("Rafael", 499778);
        agendaContatos.adicionarContato("Maria", 499778);
        agendaContatos.adicionarContato("Rafael", 499778);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        System.out.println("O numero é : " + agendaContatos.pesquisarPorNome("Rafael Cruz"));
    }
}
