/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesador;

import java.util.Scanner;

/**
 *
 * @author Ryzen 5
 */
public class Persona {
    int tamañio=5;
    String[] nombre = new String[tamañio];
    String[] apellido = new String[tamañio];
    String[] edad = new String[tamañio];
    String[] telefono = new String[tamañio];
    String[] direccion = new String[tamañio];

    public int opcion;
    Scanner sc = new Scanner(System.in);

    public Persona() {
        this.menu();
    }

    public void menu() {

        System.out.println("--------Bienvenido--------");
        System.out.println("Seleccion una de las siguientes opciones:\n"
                + "1. Escribir nuevo Arrays\n"
                + "2. Leer Arrays");
        System.out.println("---------------------------");

        opcion = sc.nextInt();
        this.eleccion(opcion);
    }
    public void eleccion(int op) {
        switch (op) {
            case 1:
                System.out.println("Escribe los arreglos");
                System.out.println("----------------------------------------");
                for (int i = 0; i < tamañio; i++) {
                    System.out.println((i + 1) + "# Arreglo:\n");
                    String empezar= sc.nextLine();
                    System.out.print("- Escribir nombre/s: ");
                    nombre[i] = sc.nextLine();
                    System.out.print("- Escribir apellido/s: ");
                    apellido[i] = sc.nextLine();
                    System.out.print("- digitar edad: ");
                    edad[i] = sc.nextLine();
                    System.out.print("- digite telefono: ");
                    telefono[i] = sc.nextLine();
                    System.out.print("- escribir direccion: ");
                    direccion[i] = sc.nextLine();
                    System.out.println("------------------------------------");
                }
                this.menu();
                break;
            case 2:
                for (int i = 0; i < tamañio; i++) {
                    System.out.println("------------------------------------");
                    System.out.println((i + 1) + "# Arreglo:\n");
                    System.out.println("NOMBRE/S: " + nombre[i]);
                    System.out.println("APELLIDO/S: " + apellido[i]);
                    System.out.println("EDAD: " + edad[i]);
                    System.out.println("TELEFONO: " + telefono[i]);
                    System.out.println("DIRECCION: " + direccion[i]);
                }
                this.menu();
                break;
        }
    }
}
