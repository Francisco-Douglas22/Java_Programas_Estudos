public class E1_AlunoEnsinoSuperior extends E1_Classe_Pessoa{
    String nome;
    double teste, prova;

    public void setNome(String nome){
        this.nome = nome;

    }

    public String getNome(){
        return this.nome;

    }

    double getMedia(){

        return (teste + prova * 2) /3;
    }
}
