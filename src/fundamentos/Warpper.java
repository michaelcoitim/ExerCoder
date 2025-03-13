package fundamentos;

/**
 *
 * @author Michael Coitim
 */
public class Warpper {
    public static void main(String[] args) {
        Byte b =100;
        Short s = 1000;
        
        //Integer.parseInt(entrada.next)) --> tranformando string em inteiros
        Integer i = 10000;
        Long l = 100000L;
        
        Float f =123.1f;
        Double d =12354.123;
        Boolean bo = Boolean.parseBoolean("true") ;
        Character c = '#';
        
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);
        System.out.println(f);
        System.out.println(d.shortValue());
        System.out.println(bo.toString().toUpperCase());
        System.out.println( c +" concatenando ");
        System.out.println("");
    }
}
