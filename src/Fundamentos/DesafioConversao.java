/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fundamentos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael Coitim 
 */
public class DesafioConversao {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        double valor1 ,valor2 ,valor3, media;
        
        System.out.println("Informe primeiro salario ");
        String salario1 = lerTeclado.nextLine();
        valor1 = converterSalarios(salario1);
        
        System.out.println("Informe segundo  salario ");   
        String salario2 = lerTeclado.nextLine();
        valor2 = converterSalarios(salario2);
        
        System.out.println("Informe terceiro salario ");        
        String salario3 = lerTeclado.nextLine();
        valor3 = converterSalarios(salario3);
        
        media = (valor1 + valor2 + valor3) /3;
        
        System.out.println("A media salarial é "+ media);
        
    }
    public static double converterSalarios (String a){
        double salarioConvertido = Double.parseDouble(a); 
                
        return salarioConvertido;
    }
}
