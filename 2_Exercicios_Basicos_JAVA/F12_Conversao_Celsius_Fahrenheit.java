/*12 - Programa que leia uma Temperatura em Graus Celsius e Apresente-a conver􀆟da em Graus
Fahrenheit. Depois faça o inverso do programa transformando Fahrenheit em Celsius
Formulas: F = celsius * (9.0/5.0) + 32
Formulas: C = (F – 32) * 5 / 9 */

import java.util.Scanner;
import java.util.Locale;

public class F12_Conversao_Celsius_Fahrenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("Digite os Graus Celsius: ");
        double graus_celsius = sc.nextDouble();

        System.out.printf("Digite os Graus Fahrenheit: ");
        double graus_F = sc.nextDouble();

        //COnvertendo os dados
        double c_Para_F, F_para_C;
        c_Para_F = graus_celsius * 9/5 + 32;
        F_para_C = (graus_F - 32) * 5/9;

        System.out.println(graus_celsius+ " Equivalem a "+c_Para_F+ " Graus F°");
        System.out.println(graus_F+" Equivalem a "+ F_para_C+ " Graus Celsius");
        sc.close();
    }
    
}
