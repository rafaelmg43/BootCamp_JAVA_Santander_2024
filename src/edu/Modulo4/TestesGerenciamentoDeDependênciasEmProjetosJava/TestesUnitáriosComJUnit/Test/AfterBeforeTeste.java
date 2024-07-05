package src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.TestesUnitáriosComJUnit.Test;

import org.junit.jupiter.api.*;
import src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.TestesUnitáriosComJUnit.Main.GerenciadorDeConexaoComBancoDeDados;
import src.edu.Modulo4.TestesGerenciamentoDeDependênciasEmProjetosJava.TestesUnitáriosComJUnit.Main.Pessoa;

import java.time.LocalDateTime;

public class AfterBeforeTeste {

    @BeforeAll
    static void configuraConexao() {
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        GerenciadorDeConexaoComBancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        GerenciadorDeConexaoComBancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        GerenciadorDeConexaoComBancoDeDados.finalizarConexao();
    }
}
