public class App {
    public static void main(String[] args) throws Exception {
        // iphone 12, tela de 6.1, 256gb
        // Galaxy Note 20 ultro, tela de 6.9, 256gb
        // Xaoimi m11 pro, tela de 6.81. 1268gb


        // Declarando um objeto do tipo celular
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "ios";

        Celular celularB = new Celular();
        celularB.nome = "Galaxy 12";
        celularB.tamanhoTela = 6.9f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        System.out.format("Celular %s com tela de %f, com %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);

        System.out.format("Celular %s com tela de %f, com %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
    }
}