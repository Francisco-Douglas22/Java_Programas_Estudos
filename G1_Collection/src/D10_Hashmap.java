import java.util.HashMap;
import java.util.Map;

public class D10_Hashmap {
    public static void main(String[] args) {
        // Criando um HashMap que mapeia nomes para idades
        Map<String, Integer> mapaDeIdades = new HashMap<>();

        // Adicionando pares chave-valor ao HashMap
        mapaDeIdades.put("Alice", 25);
        mapaDeIdades.put("Bob", 30);
        mapaDeIdades.put("Carol", 22);

        // Acessando um valor com base na chave
        int idadeDoBob = mapaDeIdades.get("Bob");
        System.out.println("A idade do Bob é: " + idadeDoBob);

        // Verificando se uma chave existe no HashMap
        boolean temChaveAlice = mapaDeIdades.containsKey("Alice");
        System.out.println("Existe uma chave 'Alice'? " + temChaveAlice);
    }
}
