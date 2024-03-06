/*9 - Faça um algoritmo que leia o nome e o salário de um funcionário e 
mostre seu novo salário, com 15% de aumento */
import java.util.Scanner;

public class E9_AumentoSalario {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o salario do Funcionario: ");
        double salario = sc.nextDouble();
        System.out.printf("O Salario e de: "+salario+" R$");
        double aumento = salario += (salario * 0.15);
        System.out.println("Com 15% de aumento passara a ganha: "+aumento);

        sc.close();
    }
    
}
