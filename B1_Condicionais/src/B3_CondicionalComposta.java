//Import das bibliotecas
import java.util.Scanner;
import java.util.Locale;

public class B3_CondicionalComposta {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.printf("Digite a Segunda nota: ");
        double nota2 = sc.nextDouble();

        double media;
        media = (nota1 + nota2) / 2;
        System.out.println("A Media do Aludo e De: "+media+" Pontos");

        //Fechando o scanner
        sc.close();

        //Condicional Composta
        if(media >= 7){
            System.out.println("Aprovado");
        }else if(media > 5 && media <= 6.9){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }



    }
}
