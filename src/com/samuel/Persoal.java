package com.samuel;

public class Persoal {
    
    private String telefono;
    private String correo;
    
    // Constructor

    public Persoal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }
    
    // Set's y Get's

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    // To String

    @Override public String toString() {
        return "(Telefono: " + telefono + ", Correo: " + correo + ")";
    }
    
    
}
