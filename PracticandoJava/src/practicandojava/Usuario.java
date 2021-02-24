/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicandojava;

import java.util.List;

/**
 *
 * @author adrir
 */
public class Usuario {
    
    public String Nombre;
    public int edad;

    public Usuario(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
