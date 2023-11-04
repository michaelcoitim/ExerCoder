package Fundamentos;

/**
 *
 * @author Michael Coitim
 */
public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer num1 = 10000;
        System.out.println(num1.toString().length()); // utilizando os recursos da string
        
        int num2 = 100000;
        System.out.println(Integer.toString(num2).length()); // utilizando os recursos Integer
        
        // outra maneira de convesão não muito utilizada, porem aceita na linguagem 
        System.out.println(("" + num2).length());
        
        
    }
    
}
