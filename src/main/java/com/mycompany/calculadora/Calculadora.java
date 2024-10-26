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
        boolean param1 = false;
        boolean param2 = true;
        int numA = 85;
        int numB = 6;
        
        Aritmetica ari = new Aritmetica(num1, num2);
        
        System.out.println("Se realizaran operaciones con los numeros "
                            + ari.getNum1() +" y " + ari.getNum2());
        
        ari.suma();
        ari.resta();
        ari.producto();
        ari.division();
        ari.modulo();

        Logica logi = new Logica(param1 , param2);
        System.out.println("-----------------------------------------------");
        System.out.println("Se realizaran operaciones con los booleanos "
                + logi.getParam1() +" y " + logi.getParam2());

        logi.and();
        logi.or();
        logi.not();

        Relacional rel = new Relacional(numA , numB);
        System.out.println("-----------------------------------------------");
        System.out.println("Se realizaran operaciones con los numeros "
                + rel.getNum1() +" y " + rel.getNum2());

        rel.igual();
        rel.diferente();
        rel.mayor_que();
        rel.menor_que();
        rel.mayor_que_o_igual();
        rel.menor_que_o_igual();
        
    }
}
