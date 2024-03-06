import java.util.ArrayList;
import java.util.Iterator;

public class D7_Array_Iterator {

    public static void main(String[] args){

        ArrayList<String> listaNome = new ArrayList<String>();
        listaNome.add("Ana");
        listaNome.add("Maria");
        listaNome.add("Marcos");
        listaNome.add("Raul");

        Iterator<String> iterator = listaNome.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
}
