/*1 - Crie um programa que receba o nome, idade, de uma pessoa, depois 
imprima com uma mensagem deboas-vindas ao mundo da programação */
import java.util.Scanner;

public class E1_mensagem {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.printf(nome);

        String mensagem = "Seja Bem vindo ao Mundo do JAVA";

        System.out.println(nome+" "+mensagem);

        scanner.close();

        
    }
    
}
