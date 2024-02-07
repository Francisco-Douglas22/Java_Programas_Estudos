import java.util.Scanner;

public class TesteJava {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Seu nome e: "+ nome);
    }
}
