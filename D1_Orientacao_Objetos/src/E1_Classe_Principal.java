public class E1_Classe_Principal {
    public static void main(String[] args){

        //Instanciando aluno
        E1_AlunoEnsinoMedio aluno = new E1_AlunoEnsinoMedio();

        aluno.setNome("Francisco Douglas");
        aluno.prova = 10;
        aluno.teste = 9;

        System.out.println(aluno.getNome());
        System.out.println(aluno.getMedia());

        System.out.println("\n");

        //Instanciando professor
        E1_Classe_Professor professor = new E1_Classe_Professor();

        professor.setNome("Francisco");
        professor.setSalario(2450);

        System.out.println(professor.getNome());
        System.out.println(professor.getInss());
        System.out.println(professor.getSalarioLiquido());


        System.out.println("\n");
        //Instanciando Ensino Medio e Ensino Superior
        E1_AlunoEnsinoSuperior alunoSuperior= new E1_AlunoEnsinoSuperior();
        E1_AlunoEnsinoMedio alunoMedio = new E1_AlunoEnsinoMedio();

        alunoMedio.nome = "Joao Lucas";
        alunoMedio.teste = 9;
        alunoMedio.prova = 9;

        System.out.println("Alundo Ensino Medio");

        System.out.println("Nome: " + alunoMedio.getNome());
        System.out.println("Media: " + alunoMedio.getMedia());

        System.out.println("\n");

        //Ensino Superior
        alunoSuperior.nome = "Joao Lucas";
        alunoSuperior.teste = 9;
        alunoSuperior.prova = 8;

        System.out.println("Alundo Ensino Superior");

        System.out.println("Nome: "+alunoSuperior.getNome());
        System.out.println("Media: "+alunoSuperior.getMedia());

    }
}
