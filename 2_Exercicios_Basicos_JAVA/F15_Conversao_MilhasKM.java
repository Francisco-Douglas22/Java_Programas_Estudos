/*15 - Leia 2 Distancia, Milha e Km quilômetros, transforme 
as Milhas em Km e Quilometro em Milhas.
Formulas: K = 1.61 * M
Formulas: M = K / 1.61 */

import java.util.Scanner;
import java.util.Locale;


public class F15_Conversao_MilhasKM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("Distancia em Km: ");
        double km = sc.nextDouble();

        System.out.printf("Distancia em Milhas: ");
        double milhas = sc.nextDouble();

        double km_milhas, milhas_km;

        km_milhas = km / 1.61;
        milhas_km = 1.61 * milhas;

        System.out.println(km+" Km equivalem a "+km_milhas+" Milhas");
        System.out.println(milhas+ " Milhas equivalem a "+milhas_km+" Km");

        sc.close();

    }
    
}
