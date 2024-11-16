package com.mycompany.calculadora;

import java.util.Scanner;

public class MenuCalculadora {


    public MenuCalculadora() {
    }

    //Métodos

    public void ejecutarMenuPrincipal(){

        Scanner sc = new Scanner(System.in);
        int indicador;

        do{
            System.out.println("\nMenu Principal");
            System.out.println("1. Aritmetica");
            System.out.println("2. Relacional");
            System.out.println("3. Logica");
            System.out.println("0. Salir");
            System.out.println("------------------------------");
            System.out.print("Ingresa una opcion: ");

            indicador = sc.nextInt();

            switch (indicador){
                case 1:
                    menuAritmetica();
                    break;
                case 2:
                    menuRelacional();
                    break;
                case 3:
                    menuLogica();
                    break;
            }

        }while(indicador != 0);

    }

    public void menuAritmetica(){

        Aritmetica aritmetica = new Aritmetica();

        Scanner sc = new Scanner(System.in);
        int indicador;

        do{
            System.out.println("\nMenu Aritmetica");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. División");
            System.out.println("5. Modulo");
            System.out.println("6. Tablas de multiplicar");
            System.out.println("0. Salir");
            System.out.println("------------------------------");

            indicador = sc.nextInt();

            switch (indicador){
                case 1:
                    aritmetica.suma();
                    break;
                case 2:
                    aritmetica.resta();
                    break;
                case 3:
                    aritmetica.producto();
                    break;
                case 4:
                    aritmetica.division();
                    break;
                case 5:
                    aritmetica.modulo();
                    break;
                case 6:
                    aritmetica.tablasMultiplicar();
                    break;
            }

        }while (indicador != 0);

    }

    public  void menuRelacional(){

        Scanner sc = new Scanner(System.in);
        int indicador;

        do{

            System.out.println("\nMenu Relacional");
            System.out.println("1. Igual que");
            System.out.println("2. Diferente que");
            System.out.println("3. Mayor que");
            System.out.println("4. Menor que");
            System.out.println("5. Mayor o igual que");
            System.out.println("6. Menor o igual que");
            System.out.println("0. Salir");
            System.out.println("------------------------------");
            indicador = sc.nextInt();

        }while(indicador != 0);

    }

    public void menuLogica(){

        Scanner sc = new Scanner(System.in);
        int indicador;
        do{
            System.out.println("\nMenu Logica");
            System.out.println("1. AND");
            System.out.println("2. OR");
            System.out.println("3. NOT");
            System.out.println("0. Salir");
            System.out.println("------------------------------");

            indicador = sc.nextInt();

        }while (indicador != 0);
    }

}
