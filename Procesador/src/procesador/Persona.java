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

    String[] nombre = new String[2];
    String[] apellido = new String[2];
    String[] edad = new String[2];
    String[] telefono = new String[2];
    String[] direccion = new String[2];

    public int opcion;
    Scanner sc = new Scanner(System.in);

    public Persona() {
        this.menu();
    }

    public void menu() {

        System.out.println("--------Bienvenido--------");
        System.out.println("Seleccion una de las siguientes opciones:\n"
                + "1. Digitar tamaño de arrays\n"
                + "2. Escribir nuevo Arrays\n"
                + "3. Leer Arrays");
        System.out.println("---------------------------");

        opcion = sc.nextInt();
        this.eleccion(opcion);
    }

    public void tamaño() {

    }

    public void eleccion(int op) {
        switch (op) {
            case 1:
                System.out.println("Escribe los arreglos");
                for (int i = 0; i < 2; i++) {
                    System.out.println((i + 1) + "# Arreglo");
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
                }
                this.menu();
                break;
            case 2:
                for (int i = 0; i < 2; i++) {
                    System.out.println((i + 1) + "# Arreglo");
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
