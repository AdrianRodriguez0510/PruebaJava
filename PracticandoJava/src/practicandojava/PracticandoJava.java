/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicandojava;

import java.util.ArrayList;

/**
 *
 * @author adrir
 */
public class PracticandoJava {


    public static void main(String[] args) {
        
         Administrador admin = new Administrador();

        Gimnasio gimnasio = new Gimnasio();
        System.out.println("Agregar gimnasio");
        gimnasio.setNombre(Consola.leer("Ingrese nombre: "));
        gimnasio.setDireccion(Consola.leer("Ingrese direccion"));
        if(admin.AgregarGimnasio(gimnasio)){
           System.out.println("GIMNASIOS: ");
            ArrayList<Gimnasio> gimnasios = admin.getListaGimnasios();
            for(Gimnasio g:gimnasios){
                System.out.println("Gimnasio " + g.getNombre() + ", Direccion: " + g.getDireccion());
            }
        }
        else{
            System.out.print("El gimnasio no fue ingresado");
        }
        
        

    }
       
            
}
