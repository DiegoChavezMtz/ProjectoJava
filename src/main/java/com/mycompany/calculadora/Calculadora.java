/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author diego
 */
public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Bienvenido calculadora");
        
        float num1 = 5;
        float num2 = 6;
        float resultadoSuma, 
              resultadoResta, 
              resultadoMultiplicasion,
              resultadoDivision,
              resultadoModulo;
        
        Aritmetica ari = new Aritmetica();
        
        resultadoSuma = ari.suma(num1, num2);
        resultadoResta = ari.resta(num1, num2);
        resultadoMultiplicasion = ari.mutiplicasion(num1, num2);
        resultadoDivision = ari.division(num1, num2);
        resultadoModulo = ari.modulo(num1, num2);
        
        System.out.println(resultadoSuma);
        System.out.println(resultadoResta);
        System.out.println(resultadoMultiplicasion);
        System.out.println(resultadoDivision);
        System.out.println(resultadoModulo);
        
        
    }
}
