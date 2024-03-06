import java.util.ArrayList;
import java.util.List;

public class D9_List {

    public static void main(String[] args){

        List<String> listaNome = new ArrayList<String>();
        listaNome.add("QGG");
        listaNome.add("kkkk");
        listaNome.add("eeeee");

        for(String nome: listaNome){
            System.out.println(nome);
        }
    }
    
}
