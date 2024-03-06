import java.util.Scanner;

public class A2_Laco_While {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while(opcao != 99){
            System.out.println("Digite um valor [99] Stop: ");
            opcao = sc.nextInt();


        }
        sc.close();

    }
    
}
