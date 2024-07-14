package src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.EManipulandoRetornos;

import org.junit.jupiter.api.Assertions;
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
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {
    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void lancarExceptionQuandoChamarApiDosCorreios(){

        doThrow(IllegalArgumentException.class)
                .when(apiDosCorreios)
                    .buscaDadosComBaseNoCep(anyString());



        Assertions.assertThrows(IllegalArgumentException.class,() -> cadastrarPessoa.cadastrarPessoa("Rafael","487391238", LocalDate.now(),"08754200"));
    }
}
