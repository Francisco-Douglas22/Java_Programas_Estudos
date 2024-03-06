public class A11_Tipos_Variaveis {

    public static void main(String[] args){
        double salarioMinimo = 2500;
        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        float numero_igual_double = 2400;
        System.out.println(numeroNormal+" "+numeroCurto2);
        System.out.println(numero_igual_double);

        final int numero = 34; //final evita que eu modifique o numero
        String nome = "Francisco"; //Textos e etc
        System.out.println(nome+" "+numero);

        System.out.println(nome+ " "+numero);

        System.out.println("Esses sao os tipos de dados em JAVA");
    }

}
