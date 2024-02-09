public class D3_Array {
    public static void main(String[] args){

        //Sempre devo cria um new int
        int[] nota = new int[3];

        //Outra forma
        int[] notas = {9, 10, 8};

        nota[0] = 9;
        nota[1] = 10;
        nota[2] = 8;

        System.out.println(nota[0]);
        System.out.println(nota[1]);
        System.out.println(nota[2]);

        System.out.println("");


        //Tambem posso utiliza o for
        for(int i=0; i<3; i++){
            System.out.println(nota[i]);
        }

        System.out.println("");
        //Outra forma de utiliza o for
        for(int valor: nota){
            System.out.println(valor);
        }

    }
}
