package Modificadores_Privados;

public class Aluno_Privado {
    private String nome;
    protected double teste, prova;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getProva(){
        return prova;
    }

    public void setProva(double prova){
        this.prova = prova;
    }

    public double getTeste(){
        return teste;
    }

    public void setTeste(double teste){
        this.teste = teste;
    }

}
