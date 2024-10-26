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
        
        float num1 = 6;
        float num2 = 5;
        
        Aritmetica ari = new Aritmetica(num1, num2);
        
        System.out.println("Se realizaran operaciones con los numeros "
                            + ari.getNum1() +" y " + ari.getNum2());
        
        ari.suma();
        ari.resta();
        ari.producto();
        ari.division();
        ari.modulo();
        
        
    }
}
