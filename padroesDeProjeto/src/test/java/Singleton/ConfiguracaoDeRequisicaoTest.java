package Singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoDeRequisicaoTest {

    @Test
    public void deveRetornarToken() {
        ConfiguracaoDeRequisicao.getConfig().setToken("ABcD");
        assertEquals("ABcD", ConfiguracaoDeRequisicao.getConfig().getToken());
    }

    @Test
    public void deveRetornarPrefixo() {
        ConfiguracaoDeRequisicao.getConfig().setPrefixo("https://novaApi/");
        assertEquals("https://novaApi/", ConfiguracaoDeRequisicao.getConfig().getPrefixo());
    }

}