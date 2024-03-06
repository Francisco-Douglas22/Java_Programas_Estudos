public class Operadores2 {
    public static void main(String[] args){
        int numero = 5;

        //Repeticao
        numero *= 2;
        System.out.println(numero);

        numero += 2;
        System.out.println(numero);

        numero -= 4;
        System.out.println(numero);

        //Booleano
        int numero1 = 2;
        int numero2 = 3;

        boolean simNao = numero1 == numero2;
        System.out.println("O numero 1 e igual ao numero 2: "+simNao);

        if(numero < numero2){
            System.out.println("Numero1 e Maior que o Numero2");
        }else{
            System.out.println("Numero2 e maior que o Numero 1");
        }
    }
    
}
