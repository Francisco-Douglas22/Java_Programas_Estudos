/*10 - Escreva um programa que pergunte a quan􀆟dade de Km percorridos por um carro alugado e a quan􀆟dade
de dias pelos quais ele foi alugado. Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e
R$0,15 por Km rodado */

import java.util.Locale;
import java.util.Scanner;

public class E10_Aluguel_Carros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("Digite a distancia em KM: ");
        double distancia = sc.nextDouble();
        System.out.println("O Carro que andou: "+distancia+ "Km");

        System.out.printf("Quantidade de Dias Alugados: ");
        double dias = sc.nextInt();
        System.out.println("Que ficou alugado por: "+dias+" Dias");

        //Calculo total
        double total = (dias * 60) + (distancia * 0.15);
        System.out.println("Tera um custo de: "+total);

        sc.close();

    }
    
}
