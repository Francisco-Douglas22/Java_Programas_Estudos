public class Instrucao_Switch {
    public static void main(String[] args){

        int numero = 6;
        switch (numero){
            case 1:
                System.out.println("Voce Digitou 1");
                break;
                //Sempre utilize o break

            case 2:
                System.out.println("Voce Digitou 2");
                break;

            case 3:
                System.out.println("Voce Digitou 3");
                break;

            //Sempre utilize o default no final
            default:
                System.out.println("Não foi encontrado o valor");
        }
    }
}
