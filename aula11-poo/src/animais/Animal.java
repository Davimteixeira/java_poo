package animais;
public class Animal {
    public Animal(String nome) {
        this.nome = nome;
    }

    private String nome;
    
    public void comer() {
        System.out.printf("%s comeu \n", nome);
    }

    public void beber() {
        System.out.printf("%s bebeu \n", nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
