public class FestaVip {
    // <modificador> <tipo> <nome-atríbuto>
    private int quantidadeDeCafe = 30;
    private int quantidadeSalgados = 50;

    public void entrar () {
        beberCafe();
        comerSalgado();
        beberCafe();
    }

    // <modificador> <retorno-método> <nome-método>
    private void beberCafe() {
        quantidadeDeCafe--;
        System.out.println("Bebeu 1 xícara de café");
    }

    private void comerSalgado () {
        quantidadeSalgados--;
        System.out.println("Comeu 5 salgados");
    }
}
