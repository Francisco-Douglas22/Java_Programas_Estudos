public class A2_Classe_Com_Metodo {

    //Declarando o metodo dentro da classe
    public static void main(String[] args){
        System.out.println("JAVA");

        String Brasil = "Brasil";

        //Alterando o valor
        Brasil = "JAPAO";
        System.out.println("O pais e: "+Brasil);

        //Se eu utiliza o final ele nao podera ser alterada
        final String Rio = "Rio de Janeiro";

        //Rio = "Bahia" // Apresentara um erro
        System.out.println(Rio);
    }
}
