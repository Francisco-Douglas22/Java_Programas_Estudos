package Classes_padrao;

import Modificadores_Privados.AlunoSuperior_Privado;
public class Principal_Privados {
    public static void main(String[] args){
        AlunoSuperior_Privado aluno = new AlunoSuperior_Privado();

        //aluno.nome = "Francisco";
        aluno.setNome("Francisco");
        //aluno.teste = 9;
        aluno.setTeste(9);
        //aluno.prova = 8;
        aluno.setProva(8);

        System.out.println("A Media do Aluno e: "+aluno.getMedia());


    }
}
