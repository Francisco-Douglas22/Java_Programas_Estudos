public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada: "+smartTv.ligada);
        System.out.println("Canal Atual: "+smartTv.canal);
        System.out.println("Volume Atual: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv Esta Ligada: "+smartTv.ligada);

        //Diminuir o Volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Baixado: "+smartTv.volume);


    }
    
}
