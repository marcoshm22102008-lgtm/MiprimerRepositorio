package com.ercilla;

public class Holamundo {
    public static void main(String[] args) {
         Mensaje msg = new Mensaje();
         String nombre = msg.solicitardatos("Escribe tu nombre: ");

         String apellido = msg.solicitardatos("Escribe tu apellido");
         Persona p1 = new Persona(nombre,apellido);
         msg.saludar(p1);


    }
}
