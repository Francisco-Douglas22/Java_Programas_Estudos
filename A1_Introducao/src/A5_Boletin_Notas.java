public class A5_Boletin_Notas {
    public static void main(String[] args){
        double nota1, nota2, media;
        nota1 = 6.7;
        nota2 = 8.5;
        media = (nota1 + nota2) / 2;

        System.out.println("A Media do aluno e de "+media);

        if(media == 6){
            System.out.println("O Aluno esta de recuperação");
        }else if(media >= 7){
            System.out.println("O Aluno esta aprovado");
        }else{
            System.out.println("O Aluno esta reprovado");
        }
    }
}
