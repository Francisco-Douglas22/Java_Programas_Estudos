import java.util.Scanner;

public class C5_ExercicioFor {
    public static void main(String[] args){

        double nota1, nota2, media;
        Scanner input = new Scanner(System.in);

        for(int aluno=1; aluno <=4; aluno++) {
            System.out.println("Aluno: "+aluno);

            System.out.printf("Digite a nota 1: ");
            nota1 = input.nextDouble();

            System.out.printf("Digite a nota 2: ");
            nota2 = input.nextDouble();

            media = (nota1 + nota2) / 2;

            System.out.println("Media: " + media);
        }
    }
}
