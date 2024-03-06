/*5 - Escreva um programa que leia um valor em metros e o exiba conver􀆟do 
em (Quilometro, Hectômetro,Decâmetro, Decímetro, Cen􀆡metro, Milímetro) 
sendo que
Km = 1000 /
Hec = 100 /
Deca = 10 /
Deci = 10 *
Cent = 100 *
Mili = 1000 * 
*/

//Variaveis
import java.util.Scanner;

public class E5_Conversao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um numero: ");
        double metro = sc.nextDouble();
        System.out.println("Voce digitou: "+metro+" Metros que e equivalente a: ");

        //Calculos
        double km, hec, deca, deci, cent, mili;
        km = metro / 1000;
        hec = metro / 100;
        deca = metro / 10;
        deci = metro * 10;
        cent = metro * 100;
        mili = metro * 1000;

        System.out.println(km+" Km Quilometros");
        System.out.println(hec+" Hectometros");
        System.out.println(deca+" Decametros");
        System.out.println(deci+" Decimetros");
        System.out.println(cent+" Centimetros");
        System.out.println(mili+" Milimetros");

        sc.close();
    }
}