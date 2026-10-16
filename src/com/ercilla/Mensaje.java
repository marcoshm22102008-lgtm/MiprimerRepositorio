package com.ercilla;

import java.util.Scanner;

public class Mensaje {
    public String solicitardatos(String mensaje){
    System.out.print(mensaje);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public void saludar(Persona persona){
        System.out.printf("Hola %s, bienvenido a Java\n",persona.getNombre()+" "+ persona.getApellido());
    }
}

