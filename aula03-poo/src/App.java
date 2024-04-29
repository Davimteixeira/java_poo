public class App {
    public static void main(String[] args) throws Exception {
        Personagem heroi = new Personagem();
        heroi.nome = "Hercules";
        heroi.nivel = 2;
        heroi.forca = 16;
        heroi.corDoPersonagem = "Amarelo";

        heroi.mostrarStatus();
        heroi.atacar("Hydra", "");
        heroi.informacoesDoPersonagem('s');
    }
}
