import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;
    String corDoPersonagem;

    // void -- significa que não está retornando nada
    void mostrarStatus() {
        System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
    }

    int calcularDano () {
        Random gerador = new Random();
        int dado20faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20faces;
        return dano;
    }

    void atacar(String alvo, String habilidade) {
        int danoCausado = calcularDano();

        if (habilidade.length()  == 0){
            System.out.format("%s atacou %s e casou %d de dano.\n", nome, alvo, danoCausado);
        } else {
            System.out.format("%s usou '%s' contra %s e casou %d de dano.\n", nome, habilidade, alvo, danoCausado);
        }
    }

    void informacoesDoPersonagem(char detelhada) {
        if (detelhada == 's') {
            System.out.format("As informações completas dele são: %s, %d, %d, %s \n", nome, forca, nivel, corDoPersonagem);
        }
        else if (detelhada == 'n') {
            System.out.format("As imcompletas dele são: %s \n", nome );
        } 
        else {
            System.err.println("Opção inválida \n");
        }
    }



}
