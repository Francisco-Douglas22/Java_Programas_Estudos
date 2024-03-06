import java.util.ArrayList;

public class D4_Arrsy_while {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        int i = 0;
        while (i < lista.size()) {
            System.out.println("ArrayList Elemento na posição " + i + ": " + lista.get(i));
            i++;
        }
    }
    
}
