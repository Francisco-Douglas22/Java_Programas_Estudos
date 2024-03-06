/* 3 - Faça um programa que leia 2 números Inteiro some os e 
mostre na tela o seu sucessor e seu antecessor.*/

public class E3_Soma_Numeros {
    public static void main(String[] args) throws Exception{
        int num1, num2, soma;

        //Ler os 2 numeros inteiros
        num1 = 4;
        num2 = 7;
        soma = num1 + num2;

        System.out.println("A soma dos numeros e: "+ soma);

        //Sucessor e Antecessor
        int sucessor, antecessor;

        sucessor = soma + 1;
        antecessor = soma - 1;
        System.out.println("O Sucessor de: "+soma+" e "+sucessor);
        System.out.println("O Antecessor de: "+soma+" e "+antecessor);
    }
    
}
