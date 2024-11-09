/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author diego
 */
public class Logica {
    /*Atributos*/
    
    private boolean param1, param2,res,res2;
    
    /*Constructores*/
    
    public Logica(){
        
    }

    public Logica(boolean param1, boolean param2) {
        this.param1 = param1;
        this.param2 = param2;
    }
    
    /*getters y setters*/

    public boolean getParam1() {
        return param1;
    }

    public void setParam1(boolean param1) {
        this.param1 = param1;
    }

    public boolean getParam2() {
        return param2;
    }

    public void setParam2(boolean param2) {
        this.param2 = param2;
    }
    
    /*Metodos*/
    
    public boolean and(){

        res = param1 & param2;

        System.out.println("Para la operacion AND si el booleano 1 es " + getParam1() + " y el booleano 2 es " + getParam2() +
                            " entonces el resultado es : " + res);

        return res;
        
    }
    
    public boolean or(){

        res = param1 | param2;

        System.out.println("Para la operacion OR  si el booleano 1 es " + getParam1() + " y el booleano 2 es " + getParam2() +
                " entonces el resultado es : " + res);

        return res;
        
    }
    
    public void not(){

        res = !getParam1();
        res2 = !getParam2();

        System.out.println("Para la operacion NOT  si el booleano 1 es " + getParam1() + " entonces negandolo seria  " + res);

        System.out.println("Para la operacion NOT  si el booleano 2 es " + getParam2() + " entonces negandolo seria  " + res2);

        
    }

}
