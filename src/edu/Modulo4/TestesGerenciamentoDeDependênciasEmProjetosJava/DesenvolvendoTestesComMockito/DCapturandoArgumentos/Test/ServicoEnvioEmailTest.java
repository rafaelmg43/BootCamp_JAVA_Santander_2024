package src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.DCapturandoArgumentos.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.DCapturandoArgumentos.Email;
import src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.DCapturandoArgumentos.Formato;
import src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.DCapturandoArgumentos.PlataformaDeEnvio;
import src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.DCapturandoArgumentos.ServicoEnvioEmail;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTest {

    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks
    private ServicoEnvioEmail servico;

    @Captor
    private ArgumentCaptor<Email>captor;

    @Test
    void validarDadosEnviadosAPlataforma(){
        String enderecoDeEmail = "usuario@test.com.br ";
        String mensagem = "Ola mundo teste  mensagem ";
        boolean ehFormatoHtml = false;

        servico.enviaEmail(enderecoDeEmail, mensagem , ehFormatoHtml);
        Mockito.verify(plataforma).enviaEmail(captor.capture());

        Email emailCapturado = captor.getValue();

        Assertions.assertEquals(enderecoDeEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(Formato.TEXTO, emailCapturado.getEnderecoEmail());
    }
}
