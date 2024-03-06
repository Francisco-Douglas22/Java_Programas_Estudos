import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class D8_Array_Comparator {

    public static void main(String[] args){

        ArrayList<String> listaNome  = new ArrayList<String>();

        listaNome.add("Osvaldo");
        listaNome.add("Martins");
        listaNome.add("Miguel");
        listaNome.add("Caju");
        listaNome.add("Manga");

        System.out.println("Elementos antes da Ordenacao: ");
        for(int i = 0; i < listaNome.size(); i++){
            System.out.println(listaNome.get(i));


        //Ordenando os elementos
        System.out.print("\n");

        Comparator<String> comparator = Collections.reverseOrder();
        Collections.sort(listaNome, comparator);

        System.out.println("Elementos depois da Ordenação");
        for(String nom: listaNome){
            System.out.println(nom);
        }

        }
    }
    
}
