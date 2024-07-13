package src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.BMockandoObjetos.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.BMockandoObjetos.ApiDosCorreios;
import src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.BMockandoObjetos.CadastrarPessoa;
import src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.BMockandoObjetos.DadosLocalizacao;
import src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.BMockandoObjetos.Pessoa;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {
    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SP","Mogi das Cruzes","Avenida 2", "Apto", "Bras Cubas");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("08754200")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Rafael","487391238", LocalDate.now(),"08754200");


        assertEquals("Rafael", pessoa.getNome());
        assertEquals("487391238", pessoa.getNome());
        assertEquals("SP", pessoa.getEndereco().getUf());
        assertEquals("Apto", pessoa.getEndereco().getComplemento());
    }
}
