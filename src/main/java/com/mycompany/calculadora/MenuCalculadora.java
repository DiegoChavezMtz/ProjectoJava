package com.mycompany.calculadora;

public class MenuCalculadora {
    int flag;

    public MenuCalculadora() {
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    //Métodos

    public void ejecutarMenuPrincipal(){

        do{
            System.out.println("\nMenu Principal");
            System.out.println("1. Aritmetica");
            System.out.println("2. Relacional");
            System.out.println("3. Logica");
            System.out.println("0. Salir");
            System.out.println("------------------------------");
            System.out.print("Ingresa una opcion: ");

        }while(flag != 0);

    }

    public void menuAritmetica(){

        do{
            System.out.println("\nMenu Aritmetica");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. División");
            System.out.println("5. Modulo");
            System.out.println("0. Salir");
            System.out.println("------------------------------");
        }while (flag != 0);

    }

    public  void menuRelacional(){
        System.out.println("\nMenu Relacional");
        System.out.println("1. Suma");
    }

}
