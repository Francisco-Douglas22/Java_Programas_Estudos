import java.util.ArrayList;

public class D3_Array_For {

    public static void main(String[] args){

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("A1");
        lista.add("A2");
        lista.add("A3");

        for(int i=0; i < lista.size(); i++){
            System.out.println("Arraylist Elemento na Posicao: "+i+" : "+lista.get(i));
        }
    }
    
}
