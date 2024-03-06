import java.util.Scanner;
import java.util.Locale;

public class A5_Switch_case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escolha uma Opcao: ");
        System.out.println("""
                [1] Cadastra alunos
                [2] Cadastra notas
                [3] Lista de Alunos
                """);
        
        int numero = sc.nextInt();

        switch (numero) {
            case 1:{
                System.out.println("Cadastra aluno; ");
            break;
            }
            case 2:{
                System.out.println("Cadastra notas: ");
            break;
            }
            case 3:{
                System.out.println("Lista alunos: ");
            break;
            }        
            default:
            System.out.println("Opção invalida! Tente novamente.");
                break;

        }
        sc.close();

        
    }
    
}
