import java.util.Scanner;

public class C3_Exemplo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int op;

        do{
            System.out.println("------------------");
            System.out.println("--Menu Principal--");
            System.out.println("Selecione uma das Opções abaixo");
            System.out.println("1 - Aluno");
            System.out.println("2 - Professor");
            System.out.println("3 - Coordenador");
            System.out.println("0 - Sair");

            System.out.println("Qual a Sua Opção: ");
            op = sc.nextInt();

            if(op == 0)
                break;

            switch (op){
                case 1:
                    System.out.println("Voce Selecionou Aluno: ");
                    break;
                case 2:
                    System.out.println("Voce Selecionou Professor: ");
                    break;
                case 3:
                    System.out.println("Voce Selecionou Coordenador: ");
                    break;
                default:
                    System.out.println("Voce Selecionou uma Opcao invalida");
            }

        }while(true);
        System.out.println("FIM");
    }
}
