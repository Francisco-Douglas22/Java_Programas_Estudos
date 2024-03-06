public class A3_CondicaoTernaria {
    public static void main(String[] args){
        int nota = 7;

        String resultado = nota >= 7 ? "Aprovado":"Reprovado";
        System.out.println(resultado);

        int outra = 5;
        String result  = outra >= 7 ? "Aprovado": outra >= 5 && outra < 7 ? "Recuperacao":"Reprovado";
        System.out.println(result); 
    }
    
}
