package fundamentos.operadores;

/**
 *
 * @author Michael Coitim
 */
public class Atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a ;
        int c = a + b ;
        
        c += b; // c = c + b;
         System.out.println(c);
        c -= a; // c = c - a;
         System.out.println(c);
        c *= b; // c = c * b;
         System.out.println(c);
        c /= a; // c = c / a;
        System.out.println(c);
        c %= 2 ; // c = c % 2;
         System.out.println(c);
        c++; // c = c + 1; 
          System.out.println(c);
    }
}
