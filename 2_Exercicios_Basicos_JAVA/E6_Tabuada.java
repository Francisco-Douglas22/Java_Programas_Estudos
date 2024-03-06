/*6 - Faça um programa que leia um número Inteiro qualquer e mostre na 
tela a sua tabuada. OBS sem utilizalaço de repe􀆟ção ou mesmo funções */

import java.util.Scanner;

public class E6_Tabuada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Numero
        System.out.printf("Digite um numero: ");
        int numero = sc.nextInt();
        System.out.println("O Numero digitado foi: "+ numero);

        //Tabuada
        System.out.println(numero + " + 1 = " + (numero + 1));
        System.out.println(numero + " + 2 = " + (numero + 2));
        System.out.println(numero + " + 3 = " + (numero + 3));
        System.out.println(numero + " + 4 = " + (numero + 4));
        System.out.println(numero + " + 5 = " + (numero + 5));
        System.out.println(numero + " + 6 = " + (numero + 6));
        System.out.println(numero + " + 7 = " + (numero + 7));
        System.out.println(numero + " + 8 = " + (numero + 8));
        System.out.println(numero + " + 9 = " + (numero + 9));
        System.out.println(numero + " + 10 = " + (numero + 10));

        sc.close();


    }
    
}
