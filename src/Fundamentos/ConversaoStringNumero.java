/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fundamentos;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael Coitim
 */
public class ConversaoStringNumero {
    public static void main(String[] args) {
        // classe visual janela 
        String valor1 = JOptionPane.showInputDialog(
                "Digitite o primeiro valor");
        
        String valor2 = JOptionPane.showInputDialog(
                "Digitite o segundo valor");
        
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        
        double soma = numero1 + numero2;
        
        System.out.println("a soma é = "+ soma);
        System.out.println("a media é = "+ soma/2);
       
    }
}
