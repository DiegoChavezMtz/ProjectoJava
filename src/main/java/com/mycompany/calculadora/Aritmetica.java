/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author diego
 */
public class Aritmetica {
     
    /*Atributos*/
    
    private float num1, num2,resultado;
    
    public Aritmetica() {
    }

    public Aritmetica(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return this.num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return this.num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    /*Metodos*/
        
    public float suma(){
        
         resultado = num1 + num2;
         
        System.out.println("Resultado suma: " +
                                                getNum1()+" + "+getNum2() + 
                                                " = "+resultado);
        
        return resultado;
        
    }
    
    public float resta(){
        
        resultado = num1 - num2;
         
        System.out.println("Resultado resta: " +
                                                getNum1()+" - "+getNum2() + 
                                                " = "+resultado);
        
        return resultado;
        
    }
    public float producto(){
        
        resultado = num1 * num2;
         
        System.out.println("Resultado producto: " +
                                                getNum1()+" * "+getNum2() + 
                                                " = "+resultado);
        
        return resultado;
        
    }
    public float division(){
        
        resultado = num1 / num2;
         
        System.out.println("Resultado division: " +
                                                getNum1()+" / "+getNum2() + 
                                                " = "+resultado);
        
        
        return resultado;
        
    }
    public float modulo(){
        
         resultado = num1 % num2;
         
        System.out.println("Resultado modulo: " +
                                                getNum1()+" % "+getNum2() + 
                                                " = "+resultado);
        
        
        return resultado;
        
    }
    
}
