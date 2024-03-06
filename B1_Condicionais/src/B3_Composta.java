import java.util.Scanner;
import java.util.Locale;
public class B3_Composta {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.printf("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media;
        media = (nota1 + nota2) / 2;
        System.out.println("A media do aluno e de "+media+" Pontos");

        //Fechando o scanner
        sc.close();

        //Condicional

        if(media >=7){
            System.out.println("Voce Esta aprovado com a media de "+media);
        }else if(media < 6.9 && media > 5){
            System.out.println("Voce Esta de recuperacao com a media de "+media);
        }else{
            System.out.println("Voce esta reprovado com a media de "+media);
        }
    }
}
