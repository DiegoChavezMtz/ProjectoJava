package com.mycompany.calculadora;
import java.util.Scanner;

public class Mensajes {

    String  operacion;
    Scanner sc = new Scanner(System.in);
    int flag;

    public Mensajes() {
    }

    public Mensajes(String operacion) {
        this.operacion = operacion;
    }

    public int repeticion() {

        System.out.println("-----------------------------");
        System.out.println("Quiere hacer otra operación");
        System.out.println("1_.Si, continuar");
        System.out.println("0_.No, salir");

        flag = sc.nextInt();

        return flag;

    }
}
