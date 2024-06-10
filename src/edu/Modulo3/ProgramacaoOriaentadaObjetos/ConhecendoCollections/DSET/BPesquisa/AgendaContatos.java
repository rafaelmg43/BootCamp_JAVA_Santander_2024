package src.edu.Modulo3.ProgramacaoOriaentadaObjetos.ConhecendoCollections.DSET.BPesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributo

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));

    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Rafael", 21);
        agendaContatos.adicionarContato("Rafael", 212);
        agendaContatos.adicionarContato("Rafael Cruz", 21);
        agendaContatos.adicionarContato("Michele", 18);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Rafael"));

        agendaContatos.atualizarNumeroContato("Michele", 123456);

        agendaContatos.exibirContatos();
    }

}
