public class ContaNetflix {
    private String idiomaPreferencial;
    private String resolucaoTela;

    public void entrar() {
        buscarPreferenciaisDoUsuario();
        identificarResolucao();
    }

    private void buscarPreferenciaisDoUsuario() {
        idiomaPreferencial = "PT_BR";
    }

    private void identificarResolucao() {
        resolucaoTela = "Full hd";
    }

    public void assistirFilme(String nomeFilme) {
        System.out.println("Iniciando o filme " + nomeFilme);
        System.out.println("Carregando o filme na resolução" + resolucaoTela );
        carregarAudioFilme();
    }

    private void carregarAudioFilme () {
        if (idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US") {
            System.out.println("Carregando o aúdio em " + idiomaPreferencial);
        } else {
            System.out.println("Carregando o aúdio em EN-US");
        }
    }
}

