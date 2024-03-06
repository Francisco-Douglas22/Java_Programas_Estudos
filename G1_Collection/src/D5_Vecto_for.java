import java.util.Vector;

public class D5_Vecto_for {

    public static void main(String[] args) {
        Vector<String> vetor = new Vector<String>();
        vetor.add("Elemento 1");
        vetor.add("Elemento 2");
        vetor.add("Elemento 3");

        for (int i = 0; i < vetor.size(); i++) {
            System.out.println("Vector Elemento na posição " + i + ": " + vetor.get(i));
        }
    }
    
}
