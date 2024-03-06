/*7 - Crie um programa que leia quanto dinheiro uma pessoa
 tem na carteira e mostre quantos dólares ela pode comprar */

import java.util.Scanner;

public class E7_CompraDolares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //DInheiro
        System.out.printf("Quanto dinheiro voce tem: R$ ");
        double valorEmReais = sc.nextDouble();
        
        //Valor Dolar
        System.out.printf("Qual o valor do Dolar: U$ ");
        double valorDolar = sc.nextDouble();

        //Conversao de Dinheiro
        double total_Dolar = valorEmReais / valorDolar;
        System.out.println("Uma Pessoa com: " + valorEmReais + " R$");
        System.out.println("Com o Dolar a U$: "+valorDolar);
        System.out.println("Voce Podera compra: "+total_Dolar+ " Dolares");

        sc.close();
    }
    
}
