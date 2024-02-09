public class B2_Condicional_Simples {
    public static void main(String[] args){
        double saldo = 25;
        double valorSolicitado = 27;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);

        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
