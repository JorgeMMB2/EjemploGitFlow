package com.ufv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona per = new Persona();
        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();

        System.out.println("Escribe tu nombre: ");
        per.setNombre(sc.nextLine());
        System.out.println("Escribe tu apellido: ");
        per.setApellidos(sc.nextLine());




        System.out.println("Tu nombre es ----> "+ cadena);


    }
}
