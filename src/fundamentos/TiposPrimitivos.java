package fundamentos;

/**
 *
 * @author Michael Coitim 
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        //informaçoes funcionario.
        
        // tipos numericos 
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 500;
        int id = 555848;
        long pontosAcumulado = 2_134_489_665L; // quando o numero literal passa do range de inteiro temos que colocar o 'L'
        
        // reais ponto flutuantes numericos
        float salario  = 3_540.56F; // podemos utilizar o "_" para faciliatar a visialização do
        //numero, e o 'f' pada dizer que o numero é float 
        
        double vendasAcumulados = 2_991_787_103.5;
        
        // Tipo booleano
        boolean estaDeFerias =  false;  // pode ser utilizado true 
        
        // tipo caractere
        char status  = 'A'; // ativo
        
        // dias de empresa 
        System.out.println(anosDeEmpresa * 365);
        
        // Número de viagens 
        System.out.println(numeroDeVoos/ 2);
        
        // pontos por real 
        System.out.println(pontosAcumulado / vendasAcumulados);
        System.out.println(id + "ganha " + salario);
        System.out.println("Ferias?" +estaDeFerias);
        System.out.println("Status "+ status);
        
        
    }
    
}
