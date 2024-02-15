public class A4_Utilizacao_Metodos {
    public static void main(String[] args){
        System.out.println("Essa e a forma padrao: ");

        //Criando as variaveis para o metodo abaixo
        String p_nome = "Francisco";
        String s_nome = "Douglas";

        //Nome completo
        String nomeCompleto = p_nome + " " + s_nome;
        System.out.println(nomeCompleto);
    }

    //Criando outra forma
    public static String nomeCompleto(String p_nome, String s_nome){
        return "resultado do metodo: " + p_nome.concat(" ").concat(s_nome);
    }
}
