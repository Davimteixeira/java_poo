public class App {
    public static void main(String[] args) throws Exception {
        // private
        // public
        // protected
        // default --- packge-private --- pacote privado

        // FestaVip festa = new FestaVip();
        // festa.entrar();

        ContaNetflix conta = new ContaNetflix();
        conta.entrar();
        conta.assistirFilme("Venom 2");
    }
}
