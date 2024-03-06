package Modificadores_Privados;

public class AlunoSuperior_Privado extends Aluno_Privado{
    public double getMedia(){
        return (getTeste() + getProva())/2;
    }
}
