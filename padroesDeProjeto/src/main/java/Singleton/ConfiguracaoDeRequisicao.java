package Singleton;

public class ConfiguracaoDeRequisicao {

    private ConfiguracaoDeRequisicao() {};
    private static ConfiguracaoDeRequisicao config = new ConfiguracaoDeRequisicao();
    public static ConfiguracaoDeRequisicao getConfig(){
        return config;
    }

    private String token;
    private String prefixo;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String nome) {
        this.prefixo = nome;
    }



}
