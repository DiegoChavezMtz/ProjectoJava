/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author diego
 */
public class Relacional {

    //Atributos

    private int num1 , num2 , res;

    //Constructor

    public Relacional() {
    }

    public Relacional(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getters y Setters

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    //Metodos

    public boolean igual(){
        if(num1 == num2){

            System.out.println("Los numeros " + getNum1()+" y "+getNum2() +" son iguales.");

            return  true;
        }else {

            System.out.println("Los numeros " + getNum1()+" y "+getNum2() +" no son iguales.");

            return false;
        }
    }

    public boolean diferente(){
        if(num1 != num2){

            System.out.println("Los numeros " + getNum1()+" y "+getNum2() +" son diferentes.");

            return  true;
        }else {

            System.out.println("Los numeros " + getNum1()+" y "+getNum2() +" no son diferentes.");

            return false;
        }
    }

    public int mayor_que(){
        if(num1 > num2){

            System.out.println("El numero " + getNum1()+" es mayor que  "+getNum2());

            return  num1;

        }else if(num2 > num1) {

            System.out.println("El numero " + getNum2()+" es mayor que "+getNum1());

            return num2;

        }else {

            System.out.println("Los numeros son iguales");

            return 0;
        }

    }

    public int menor_que(){
        if(num1 < num2){

            System.out.println("El numero " + getNum1()+" es menor que  "+getNum2());

            return  num1;

        }else if(num2 < num1) {

            System.out.println("El numero " + getNum2()+" es menor que "+getNum1());

            return num2;

        }else {

            System.out.println("Los numeros son iguales");

            return 0;
        }
    }

    public int mayor_que_o_igual(){
        if(num1 >= num2){

            System.out.println("El numero " + getNum1()+" es mayor o igual que  "+getNum2());

            return  num1;

        }else{

            System.out.println("El numero " + getNum2()+" es mayor o igual que "+getNum1());

            return num2;

        }
    }

    public int menor_que_o_igual(){
        if(num1 <= num2){

            System.out.println("El numero " + getNum1()+" es menor o igual que  "+getNum2());

            return  num1;

        }else{

            System.out.println("El numero " + getNum2()+" es menor o igual que "+getNum1());

            return num2;

        }
    }
}
