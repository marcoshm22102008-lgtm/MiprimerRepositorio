package com.ercilla;

public record PersonaRegistro(String nombre, String apellido) {
    @Override
    public String toString() {
        //Esta instruccion es inservivble.
      //  System.out.println("Esta instruccion es inservible");
        return "%s %s".formatted(nombre, apellido);
    }
}
