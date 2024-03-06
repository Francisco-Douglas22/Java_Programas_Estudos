public class Utilizando_Equals {

    public static void main(String[] args){

        String nome = "Francisco Douglas";
        String nomeGuerra = "Francisco Douglas";

        String sobrenome = new String("Francisco Douglas");

        if(nome.equals(nomeGuerra)){
            System.out.println("Nomes iguais");
        }else{
            System.out.println("Nomes Diferentes");
        }

        if(nome.equals(sobrenome)){
            System.out.println("Nomes iguais");
        }else{
            System.out.println("Nomes Diferentes");
        }

        //Varios Outros Exemplos
        System.out.println(nome.length());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.charAt(2));
        System.out.println(nome.isEmpty());
        System.out.println(nome.indexOf("al"));
        System.out.println(nome.contains("al"));
        System.out.println(nome.concat("Peres"));
        System.out.println(nome.equals("francisco Douglas"));
        System.out.println(nome.equalsIgnoreCase("francisco douglas"));
    }
}
