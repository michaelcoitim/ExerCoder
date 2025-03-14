
package fundamentos.operadores;

/**
 *
 * @author Michael Coitim
 */
public class Logicos {
    
    public static void main(String[] args) {
            boolean condicao1 = true;
    boolean condicao2 = 2 >6 ;
    
    System.out.println(condicao1 && !condicao2);
    System.out.println(condicao1 || condicao2);
    System.out.println(condicao1 ^ condicao2);
    System.out.println(!!condicao1);
    System.out.println(!condicao2);
    
    //tabela verdade and/E &&
    System.out.println("Tabla verdade E");
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false && false); //codigo morto 
    
    //tabela verdade or /OU ||
    System.out.println("\nTabla verdade OU");
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false); 
    
     //tabela verdade xor / ou Exclusivo  ^
    System.out.println("\nTabla verdade OU Exclusivo");
    System.out.println(true  ^ true);
    System.out.println(true  ^ false);
    System.out.println(false  ^ true);
    System.out.println(false  ^ false); 
    
     //tabela verdade xor / ou Exclusivo  ^
    System.out.println("\nTabla verdade Not");
    System.out.println(! true);
    System.out.println(! false);
   
    
    
    }

    
  
}
