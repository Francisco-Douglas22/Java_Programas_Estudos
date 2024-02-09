public class D4_Array_Bidimensional {
    public static void main(String[] args){

        //Quero 2 Matriz com 3 coluna cada
        int[][] matriz = new int[2][3];

        matriz[0][0] = 5;
        matriz[0][1] = 4;
        matriz[0][2] = 3;

        matriz[1][0] = 9;
        matriz[1][1] = 2;
        matriz[1][2] = 6;

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.println(matriz[i][j]);
            }
        }
    }
}
