public class D3_UtilizandoVetores {
    public static void main(String[] args){
        int[] passarosPorDia = {2, 5, 4, 8, 7, 9, 10, 3, 5, 6, 8, 10, 12, 5};

        int totalPassaros    = 0;
        int passarosPrimeira = 0;
        int passarosSegunda  = 0;

        //Lopp
        for (int i=0; i<passarosPorDia.length; i++){
            //Total de Passaros que vimos
            totalPassaros = totalPassaros + passarosPorDia[i];

        }
        System.out.println("Ao todo vimos: "+totalPassaros+" Passaros");

        //Loop
        for (int i=0; i < 7; i ++){
            //Total de Passaros que vimos na primeira semana
            passarosPrimeira = passarosPrimeira + passarosPorDia[i];
        }
        System.out.println("Na Primeira Semana vimos: "+passarosPrimeira+" Passaros");

        //Loop
        for (int i = 7; i < passarosPorDia.length; i++){
            //Total de passaros que vimos na segunda semana
            passarosSegunda = passarosSegunda + passarosPorDia[i];
        }
        System.out.println("Na Segunda Semana vimos: "+passarosSegunda+" Passaros");

    }
    
}
