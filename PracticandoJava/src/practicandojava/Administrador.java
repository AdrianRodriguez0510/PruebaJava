/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicandojava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adrir
 */
public class Administrador {
    
   public ArrayList<Gimnasio> listaGimnasios = new ArrayList<Gimnasio>();

    public ArrayList<Gimnasio> getListaGimnasios() {
        return listaGimnasios;
    }
   
   
   public boolean AgregarGimnasio(Gimnasio gimnasio){
     boolean retorno;
       if( gimnasio.getNombre()== "" || gimnasio.getDireccion() == ""){
           
           retorno = false;
       }
       else{

            listaGimnasios.add(gimnasio);
           retorno = true;
       }
       return retorno;
   }
}

