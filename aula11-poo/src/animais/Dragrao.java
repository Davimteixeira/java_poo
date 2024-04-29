package animais;
public class Dragrao extends Ave{
    public Dragrao(String nome) {
        super(nome);
    }

    public void soltarFogo() {
        System.out.printf("%s soltou uma bola de fogo \n ", getNome());
    }

}
