public class B2_For_em_array {
    public static void main(String[] args){
        String alunos[] = {"Felipe","Jonas","Miguel","Joao","Lucas"};

        for (int indice=1; indice<alunos.length; indice++){
            System.out.println("O Aluno: "+indice+" e "+alunos[indice]);

        }

        //Utilizando For mais simples
        for (String aluno: alunos){
            System.out.println("Nome do Aluno e: "+aluno);
        }

    }
    
}
