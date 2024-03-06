/*14 - Programa que ler a velocidade em KM/H (quilômetros por hora) 
e M/S (Metros por segundo). Converta KM/H em M/S e M/S em KM/H.
Formulas: M = K / 3.6
Formulas: K = M * 3.6 */

import java.util.Scanner;
import java.util.Locale;

public class F14_km_MS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("Digite a velocidade de Km/h: ");
        double km_hora = sc.nextDouble();

        System.out.printf("Digite a velocidade em Metros/Segundo: ");
        double metrosSegundo = sc.nextDouble();

        double km_segundo, segundo_km;
        km_segundo = km_hora / 3.6;
        segundo_km = metrosSegundo * 3.6;

        System.out.println(km_hora+" Equivalem a: "+km_segundo+ " Metros por Segundo");
        System.out.println(metrosSegundo+" Equivalem a: "+segundo_km+" Km por Hora");

        sc.close();

    }
    
}
