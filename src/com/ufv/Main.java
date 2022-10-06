package com.ufv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona per = new Persona();
        Scanner sc = new Scanner(System.in);
        Perritos perri = new Perritos();


        System.out.println("Escribe tu nombre: ");
        per.setNombre(sc.nextLine());

        System.out.println("Escribe tu apellido: ");
        per.setApellidos(sc.nextLine());

        System.out.println("Escribe la raza del perrito: ");
        perri.setRaza(sc.nextLine());



        System.out.println("Tu nombre es ----> "+ per.getNombre() + "\n");

        System.out.println("Tu apellido es ----> "+ per.getApellidos() + "\n");

        System.out.println("la raza de tu perro es ----> "+ perri.getRaza() + "\n");

        /**/



    }
}
