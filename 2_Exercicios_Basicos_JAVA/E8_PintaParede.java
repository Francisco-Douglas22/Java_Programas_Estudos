/*8 - Faça um programa que leia a largura e a altura de uma parede em metros, 
calcule a sua área e a quan􀆟dade de 􀆟nta necessária para pintá-la, 
sabendo que cada litro de 􀆟nta pinta uma área de 2 metros quadrados */

import java.util.Scanner;

public class E8_PintaParede {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.printf("Digite a altura: ");
        int altura = sc.nextInt();

        System.out.printf("Digite a Largura: ");
        int largura = sc.nextInt();

        int metros_q = (altura * largura) / 2;

        int total_tinta = metros_q / 2;
        System.out.println("Uma parede de: "+altura+" e "+largura+" Mede cerca de "+metros_q+" Metros²");
        System.out.println("Ao todo a parede levara: "+total_tinta+" Para ser pintada");

        sc.close();

    
    }
    
}

