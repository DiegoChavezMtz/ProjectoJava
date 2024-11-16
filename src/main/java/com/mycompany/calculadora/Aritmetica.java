/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Aritmetica {
     
    /*Atributos*/

    
    public Aritmetica() {

    }


    /*Metodos*/
        
    public float suma(){

        Scanner sc = new Scanner(System.in);

        float num1, num2,resultado;

        System.out.println("Digite el primer numero a sumar: ");
        num1 = sc.nextFloat();
        System.out.println("Digite el segundo numero a sumar: ");
        num2 = sc.nextFloat();

        resultado = num1 + num2;

        System.out.println("El resultado de la suma: " +  num1 + " + "+num2 + " = " + resultado);
        
        return resultado;
        
    }
    
    public float resta(){

        Scanner sc = new Scanner(System.in);

        float num1, num2,resultado;

        System.out.println("Digite el primer numero a restar: ");
        num1 = sc.nextFloat();
        System.out.println("Digite el segundo numero a restar: ");
        num2 = sc.nextFloat();

        resultado = num1 - num2;

        System.out.println("Resultado resta: " + num1 + " - " +num2 + " = "+resultado);
        
        return resultado;
        
    }
    public float producto(){

        Scanner sc = new Scanner(System.in);

        float num1, num2,resultado;

        System.out.println("Digite el primer numero a multiplicar: ");
        num1 = sc.nextFloat();
        System.out.println("Digite el segundo numero a multiplicar: ");
        num2 = sc.nextFloat();

        resultado = num1 * num2;
         
        System.out.println("Resultado producto: " + num1 + " * " + num2 +  " = " +resultado);
        
        return resultado;
        
    }
    public float division(){

        Scanner sc = new Scanner(System.in);

        float num1, num2,resultado;
        int flag = 0;

        System.out.println("Digite el primer numero a dividir: ");
        num1 = sc.nextFloat();

        do{

            System.out.println("Digite el segundo numero a dividir: ");
            num2 = sc.nextFloat();

            if(num2 != 0){
                flag = 1;
            }else {
                System.out.println("El número 0 no es valido para una division ");
            }

        }while(flag == 0);

        resultado = num1 / num2;

        System.out.println("Resultado division: " + num1 +" / "+ num2 + " = "+resultado);
        
        
        return resultado;
        
    }

    public float modulo(){

        Scanner sc = new Scanner(System.in);

        float num1, num2,resultado;
        int flag = 0;

        System.out.println("Digite el primer numero a dividir: ");
        num1 = sc.nextFloat();

        do{

            System.out.println("Digite el segundo numero a dividir: ");
            num2 = sc.nextFloat();

            if(num2 != 0){
                flag = 1;
            }else {
                System.out.println("El número 0 no es valido para una division ");
            }

        }while(flag == 0);

        resultado = num1 % num2;
         
        System.out.println("Resultado modulo: " + num1 +" % "+ num2 + " = " + resultado);
        
        
        return resultado;
        
    }

    public int[][] tablasMultiplicar(){

        int[][] resultadosTablas = new int[10][10];

        for (int i = 0; i < 10; i++) {

            if(i == 0){

                System.out.print("        ");

                for (int j = 0; j < 10; j++) {

                    System.out.print(" " + (j+1) + "  ");
                }
                System.out.println(" ");

                System.out.print("        ");

                for (int j = 0; j < 10; j++) {

                    System.out.print(" " + "^" + "  ");
                }
                System.out.println(" ");
            }

            if(i<9){
                System.out.print(i+1 + " ->   |");
            }else {
                System.out.print(i+1 + "->   |");
            }

            for (int j = 0; j < 10; j++) {

                resultadosTablas[i][j] = (i+1) * (j+1);

                if(resultadosTablas[i][j] < 10){
                    System.out.print(" " + resultadosTablas[i][j] + " |");
                } else if (resultadosTablas[i][j] < 100) {
                    System.out.print(resultadosTablas[i][j] + " |");
                }else {
                    System.out.print(resultadosTablas[i][j] + "|");
                }

            }
            System.out.println(" ");
        }

        return resultadosTablas;

    }
    
}
