
package Fundamentos;

import java.util.Scanner;

/**
 *
 * @author Michael Coitim
 * transformar temperatura fahrenheit em celsius 
 */
public class Temperatura {
    public static void main(String[] args) {
        //(Fº -32) x 5/9 = Cº
        final double DIFERENCA = 32;
        final double FATOR = 5.0 /9.0;
        double temperaturaFA =0 ;
        double temperaturaCE = 0;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe valor da temperatura em fahrenheit Fº");
      
        
        temperaturaFA = ler.nextDouble();
        
        temperaturaCE = (temperaturaFA -DIFERENCA)* FATOR;
        System.out.println("A temperatura "+temperaturaFA+" Fº"
        +"é "+ temperaturaCE +" Cº");
        
        
    }
}
