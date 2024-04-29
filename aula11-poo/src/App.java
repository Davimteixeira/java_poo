import animais.Cachorro;
import animais.Dragrao;
import animais.Gato;
import animais.Pombo;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Caramelo");

        cachorro.comer();
        cachorro.latir();

        Gato gato = new Gato("Gato");
        gato.miar();

        Dragrao dragrao = new Dragrao("Dagrão");
        dragrao.voar();
        dragrao.soltarFogo();

        Pombo pombo = new Pombo("Pombo correio sedex");
        pombo.voar();
        pombo.enviarCarta();
        pombo.fazerPru();
    }
}
