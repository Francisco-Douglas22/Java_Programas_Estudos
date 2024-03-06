/*11 - Programa que leia 4 números, 2 Inteiros e 2 Flutuantes, faça a 
soma dos Inteiros e a mul􀆟plicação dos Flutuantes, depois faça a 
mul􀆟plicação dos Flutuantes ao quadrado e a Raiz quadrada dos inteiros.
Some o Resultado final dos Números e Divida por 3 */

import java.util.Locale;
import java.util.Scanner;

public class F11_Calculos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite todos os numeros Abaixo: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();

        //Soma Inteiros
        int soma = num1 + num2;

        //Multiplica float
        double mult = num3 * num4;

        //float ao quadrado
        double quadrado = mult * 2;

        //Inteiros Raiz
        int raiz = soma * (1/2);

        //Soma e divisao final
        double somafim = raiz + quadrado / 3;

        System.out.println("O Resultado final e: "+somafim);

        sc.close();


    }
    
}
