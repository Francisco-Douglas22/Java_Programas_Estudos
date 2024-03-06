/*2 - Faça um programa que leia algo pelo teclado e mostre na tela o seu 
tipo primitivo e todas as informações possíveis sobre ele. */
import java.util.Scanner;

public class E2_Lendo_algo_pelo_teclado {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite algo: ");
        String palavra = leitor.nextLine();
        System.out.println(palavra);
        leitor.close();

        System.out.println("O comprimento da string é: " + palavra.length());
        // Imprime o comprimento da string usando o método length()

        System.out.println("A string em maiúsculas é: " + palavra.toUpperCase());
        // Imprime a string em maiúsculas usando o método toUpperCase()

        System.out.println("A string em minúsculas é: " + palavra.toLowerCase());
        // Imprime a string em minúsculas usando o método toLowerCase()

        System.out.println("A string sem espaços é: " + palavra.trim());
        // Imprime a string sem espaços usando o método trim()
    }
    
}
