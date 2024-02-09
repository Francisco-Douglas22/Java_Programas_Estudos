import java.util.Scanner;

public class D2_CalculoMedia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String matricula, nome, situacao, turma;
        double teste, prova, media;

        //Turma
        System.out.printf("Digite a turma: ");
        turma = sc.nextLine();

        for(int i=0; i<3; i++){
            System.out.printf("Digite a Matricula: ");
            matricula = sc.nextLine();

            System.out.printf("Digite o nome: ");
            nome = sc.nextLine();

            System.out.printf("Digite o teste: ");
            teste = sc.nextDouble();

            System.out.printf("Digite a prova: ");
            prova = sc.nextDouble();
            media = (teste + prova) / 2;

            System.out.println("Matricula: "+matricula);
            System.out.println("Nome: "+nome);
            System.out.println("Media: "+media);

        }
    }
}
