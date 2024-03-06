public class A4_Swithc_Case {
    public static void main(String[] args){
        String sigla = "P";

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
            }
            case "G":{
                System.out.println("GRANDE");
            }
        
            default:
                break;
        }
    }
    
}
