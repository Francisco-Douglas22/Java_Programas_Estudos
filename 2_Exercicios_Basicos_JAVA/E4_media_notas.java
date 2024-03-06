/*4 - Desenvolva um programa que leia as 4 notas de 
um aluno, calcule e mostre a sua média. */
import java.util.Scanner;

public class E4_media_notas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Primeira nota
        System.out.printf("Insira a primeira nota: ");
        double nota1 = sc.nextDouble();

        //Segunda nota
        System.out.printf("Insira a segunda nota: ");
        double nota2 = sc.nextDouble();

        //Terceira nota
        System.out.printf("Insira a terceira nota: ");
        double nota3 = sc.nextDouble();

        //Quarta nota
        System.out.printf("Insira a quarta nota: ");
        double nota4 = sc.nextDouble();

        //Media
        double media =  (nota1+nota2+nota3+nota4)/4;
        System.out.println("\nA Media e de: "+media+" Pontos");

        sc.close();

    }
    
}
