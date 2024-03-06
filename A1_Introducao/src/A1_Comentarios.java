import java.util.Scanner;

public class A1_Comentarios {
    public static void main(String[] args){

        /*Isso e um comentario em Java*/
        //Isso tambem e um comentario em JAva

        System.out.println("Ola mundo do JAVA"); //Imprimi mundo do java

        /*Estou documentando um programa abaixo que pede
        para o usuario digita o seu nome e imprime na tela
         */

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("O seu nome e: "+nome.toUpperCase());

        sc.close();
    }
}
