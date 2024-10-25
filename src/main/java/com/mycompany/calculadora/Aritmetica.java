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
    
    private float num1, num2;
    
    public Aritmetica() {
    }

    public Aritmetica(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    /*Metodols*/
    
    public float suma(float num1 , float num2){
        
        return num1 + num2;
        
    }
    
    public float resta(float num1 , float num2){
        
        return num1 - num2;
        
    }
    public float mutiplicasion(float num1 , float num2){
        
        return num1 * num2;
        
    }
    public float division(float num1 , float num2){
        
        return num1/num2;
        
    }
    public float modulo(float num1 , float num2){
        
        return num1%num2;
        
    }
    
}
