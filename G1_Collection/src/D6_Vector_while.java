import java.util.Vector;

public class D6_Vector_while {

    public static void main(String[] args) {
        Vector<String> vetor = new Vector<String>();
        vetor.add("Elemento 1");
        vetor.add("Elemento 2");
        vetor.add("Elemento 3");

        int i = 0;
        while (i < vetor.size()) {
            System.out.println("Vector Elemento na posição " + i + ": " + vetor.get(i));
            i++;
        }
    }
    
}
