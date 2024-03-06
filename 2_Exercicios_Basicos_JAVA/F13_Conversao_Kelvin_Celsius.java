/*13 - Programa que receba 2 inputs, um Para transforma Graus Kelvin 
em Graus Celsius e o outro Para Transforma Graus Celsius em Graus Kelvin
Formulas: C = K – 273.15
Formulas: K = C + 273.15 */

import java.util.Scanner;
import java.util.Locale;

public class F13_Conversao_Kelvin_Celsius {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("Digite os Graus Kelvin: K ");
        double kelvin = sc.nextDouble();

        System.out.printf("Digite os Graus Celsius: C ");
        double celsius = sc.nextDouble();

        double c_para_k, k_para_c;
        k_para_c = kelvin - 273.15;
        c_para_k = celsius + 273.15;

        System.out.println(celsius+ "Graus Celsius equivalem a: "+c_para_k+ " Graus Kelvim");
        System.out.println(kelvin+" Graus Kelvim equivalem a: "+k_para_c+ " Graus Celsius");

        sc.close();
    }
    
}
