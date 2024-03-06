import java.util.Scanner;

public class A12_Calculo_Media {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a Primeira Nota: ");
        double nota1 = sc.nextDouble();

        System.out.printf("Digite a Segunda Nota: ");
        double nota2 = sc.nextDouble();

        System.out.printf("Digite a Terceira Nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A media do Aluno e de: "+media);

        if(media >= 7){
            System.out.println("O Aluno esta aprovado: "+media);
        }else if(media <= 6.9 && media >= 5){
            System.out.println("O Aluno esta de Recuperação: "+media);
        }else{
            System.out.println("O Aluno esta reprovado: "+media);
        }

    }

}
