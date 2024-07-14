package src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.FMockandoMétodosEstáticos.Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.DesenvolvendoTestesComMockito.FMockandoMétodosEstáticos.GeradorDeNumeros;

@ExtendWith(MockitoExtension.class)
public class GeradorDeNumerosTest {

    @Test
    void testarGeracaoComTamanhoDefinido(){
        MockedStatic<GeradorDeNumeros> mockedStatic = Mockito.mockStatic(GeradorDeNumeros.class);
    }
}
