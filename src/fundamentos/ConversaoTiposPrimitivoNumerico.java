package fundamentos;

/**
 *
 * @author Michael
 */
public class ConversaoTiposPrimitivoNumerico {
    public static void main(String[] args) {
        double d = 1 ; // impíscita 
        System.out.println(d);
        
        // exemplo de cast (conversão explícita) 
        float f = (float)1.12345;
        System.out.println(f);
        
        // exemplo de perca de dados (onde o float não suporta o valor)
        f= 1.123456789101112F;
        System.out.println("informação truncada "+ f);
        
        // o java valida os tipos e não os valores 
        int i = 4;
        byte b = (byte) i ;
        System.out.println(b); // se o valor passar da capacidade do tipo primitivo, ele vai para o proximo valor 
        
    }
}
