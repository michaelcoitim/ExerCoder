
package Fundamentos;

import java.util.Scanner;

/**
 *
 * @author Michael coitim
 */
public class Desafio1 {
    public static void main(String[] args) {
        
        int a = 6;
        int b = 2;
        int c = 1;
        int d = 5;
        int e = 7;
        int f = 10;
        int g = 3;
        
        double superA , superB, subA, subB, result,resultF;
        
        superA  = Math.pow(a * (g + b),2);
        superB  = (c - d) * (b - e) / 2;
        subA    = superA / (g * b );
        subB    = Math.pow(superB, 2);
        result  = Math.pow((subA - subB),3);
        resultF = result / Math.pow(f,3); 
        
        System.out.println(resultF);
    }
}
