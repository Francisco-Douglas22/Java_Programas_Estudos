public class B2_CondicionalSimples2 {

    public static void main(String[] args){

        double saldo = 25;
        double valorSolicitado = 21;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;

            System.out.println("Seu saldo agora e de R$ "+saldo);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
