import java.util.Scanner;

public class C1_Metodos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite um numero inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("O Numero digitado foi: "+numero);
        scanner.close();
    }

    //Criando o primeiro metodo
    public static int dobro (int x) {
        x = 4;
        return x * 2;
    }
}
