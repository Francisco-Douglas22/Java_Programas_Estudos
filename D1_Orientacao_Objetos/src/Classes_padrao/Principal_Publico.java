package Classes_padrao;

import Modificadores_Publicos.AlunoPublicoSuperior;

public class Principal_Publico {
    public static void main(String[] args){
        AlunoPublicoSuperior aluno = new AlunoPublicoSuperior();

        aluno.nome = "Francisco";
        aluno.teste = 10;
        aluno.prova = 8;

        System.out.println("A Media do Aluno e: "+aluno.getMedia());


    }
}
