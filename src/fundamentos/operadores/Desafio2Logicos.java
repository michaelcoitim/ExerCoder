
package Fundamentos.operadores;

/**
 *
 * @author Michael Coitim
 */
public class Desafio2Logicos {
    public static void main(String[] args) {
        
        boolean trabalho1 = true;
        boolean trabalho2 = false;
        
        boolean tv50 = (trabalho1 && trabalho2);
        boolean tv32 = trabalho1 ^ trabalho2;
        
        boolean sorvete = tv50 || tv32;
        
        boolean saudavel = ! sorvete;
        
        System.out.println("vamos comprar tv? " + (trabalho1 || trabalho2) );
        System.out.println("Tv de 50 ? " + tv50);
        System.out.println("Tv de 32 ? "+tv32);
        System.out.println("teve soverte "+ sorvete);
        System.out.println("Saldauvel ? "+ saudavel);
    }
    
}
