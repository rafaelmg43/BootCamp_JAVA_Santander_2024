package src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.CEspiandoObjetos.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.CEspiandoObjetos.EnviarMensagem;
import src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.CEspiandoObjetos.Mensagem;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTest {

    @Spy
    private EnviarMensagem enviarMensagem;

    @Test
    void verificarComportamentoDaClass() {
        Mockito.verifyNoInteractions(enviarMensagem);

        enviarMensagem.adicionarMensagem(new Mensagem("Hello World"));
       // Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);

        Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());

    }
}
