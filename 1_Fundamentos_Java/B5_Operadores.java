public class B5_Operadores {
    public static void main(String[] args){
        int numero1, numero2;

        numero1 = 1;
        numero2 = 4;

        boolean simNao = numero1 == numero2;
        System.out.println(simNao);

        boolean diferente = numero1 != numero2;
        System.out.println(diferente);

        //Comparando Strings
        String nome1, nome2;
        nome1 = "João";
        nome2 = "Guincho";

        boolean nome_iguais = nome1 == nome2;
        System.out.println(nome_iguais);

        //Melhor forma e utiliza o equals
        System.out.println(nome1.equals(nome2));

    }
    
}
