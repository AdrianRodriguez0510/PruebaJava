/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicandojava;

/**
 *
 * @author adrir
 */
public class Disciplina {
    
    public String Nombre;
    public int Duracion;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public Disciplina(String Nombre, int Duracion) {
        this.Nombre = Nombre;
        this.Duracion = Duracion;
    }
    
    
}
