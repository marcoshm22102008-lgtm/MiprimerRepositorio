package com.ercilla;

public record PersonaRegistro(String nombre, String apellido) {
    public String toString() {
        return "%s %s".formatted(nombre, apellido);
    }
}
