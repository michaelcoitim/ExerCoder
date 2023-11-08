/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fundamentos;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Michael Coitim 
 */
public class DesafioConversao {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner lerTeclado = new Scanner(System.in);
        double valor1 ,valor2 ,valor3, media;
        
        System.out.println("Informe primeiro salario ");
        String salario1 = lerTeclado.nextLine().replace(",", ".");
        
        valor1 = converterSalarios(salario1);
        
        System.out.println("Informe segundo  salario ");   
        String salario2 = lerTeclado.nextLine().replace(",", ".");
        
        valor2 = converterSalarios(salario2);
    
        System.out.println("Informe terceiro salario ");        
        String salario3 = lerTeclado.nextLine().replace(",", ".");
        valor3 = converterSalarios(salario3);
        
        media = (valor1 + valor2 + valor3) /3;
        
        System.out.println("A media salarial é "+ media);
        
        lerTeclado.close();
        
    }
    public static double converterSalarios (String a){
        double salarioConvertido = Double.parseDouble(a); 
                
        return salarioConvertido;
    }
}
