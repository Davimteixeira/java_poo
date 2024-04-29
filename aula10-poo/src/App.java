import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        String[] arrayEstaticos = new String[5];
        arrayEstaticos[0] = "Davi";
        arrayEstaticos[1] = "Jose";
        arrayEstaticos[2] = "Chico";
        arrayEstaticos[3] = "Teo";
        arrayEstaticos[4] = "Pedro";

        // ArrayList<tipi> nome = new ArreyList<tipo>();

        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Gpku");
        arrayDinamico.add("Alô");
        arrayDinamico.add("Pedro");

        System.out.println("Imprimindo array estaticos");
        for (int indice = 0; indice < arrayEstaticos.length; indice ++) {
            System.out.println(arrayEstaticos[indice]);
        }  
        
        System.out.println("Remover pedro");
        arrayDinamico.remove(2);

        
        System.out.println("Imprimindo array Dinâmico");
        for (int indice = 0; indice < arrayDinamico.size(); indice ++) {
            System.out.println(arrayDinamico.get(indice));
        }
        
        
        for (String nome : arrayDinamico) {
            System.out.println(nome);;
        }

        
    }
}
