package com.ercilla;

public class Holamundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitarDatos("Escribe tu nombre: ");
        String apellido = msg.solicitarDatos("Escribe tu apellido: ");
        Persona persona = new Persona(nombre, apellido);
        msg.saludar(persona);
    }
}
