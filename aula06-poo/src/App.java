public class App {
    public static void main(String[] args) throws Exception {
            Pessoa pessoa = new Pessoa();
            pessoa.setNome("Bob esponja");
            pessoa.setAltura(1.9);
            pessoa.setIdade(34);

            System.out.println(pessoa.getNome());
            System.out.println(pessoa.getIdade());
            System.out.println(pessoa.getAltura());

    }
}
