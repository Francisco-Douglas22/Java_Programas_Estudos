import java.util.Scanner;

public class D1_Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o seu nome: ");

        String nome = sc.nextLine();

        System.out.println("Aluno: "+nome.toUpperCase());
    }
}
