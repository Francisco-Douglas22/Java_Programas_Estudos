import java.util.Scanner;

public class A6_Recebendo_Dados {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Digite o seu nome
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        //Idade
        System.out.println("Digite a sua Idade: ");
        int idade = sc.nextInt();

        System.out.println("Seu nome e "+nome+ " voce tem "+idade+ " anos");

        //Para um melhor desempenho e evita complicações no codigo, toda vez encerro o scanner
        sc.close();
    }
}
