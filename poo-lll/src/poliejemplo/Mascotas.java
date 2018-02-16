/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poliejemplo;

import java.util.*;


/**
 *
 * @author T-102
 */
public class Mascotas {
    
    public static void main(String[] args) 
    {
        Animal animales[]=new Animal[12];
        
        //PRIMERO GENERAMOS A LOS GATOS
        
        animales[0]=new Gato();
        animales[1]=new Gato();
        animales[2]=new Gato();
        
        // GENERAMOS LOS PERROS
        
        animales[3]=new Perro();
        animales[4]=new Perro();
        
        //GENERAMOS LOS POLLOS
        
        animales[5]=new Pollo();
        animales[6]=new Pollo();
        animales[7]=new Pollo();
        animales[8]=new Pollo();
        animales[9]=new Pollo();
        
         //GENERAMOS LOS RATONES
        
        animales[10]=new Raton();
        animales[11]=new Raton();
        
        ServicioAnimales s= new ServicioAnimales();
        
        //LA MAGIA DEL POLIMORFISMO
        
        for (Animal a:animales)
        {
            s.servicioHacerRuido((ComportamientoAnimal)a);
        }
        
        //VAMOS A GENERAR UN ArrayList Y PONER ALLI ALGUNOS ANIMALES
        //ARREGLO MUTABLE
        
        ArrayList<Animal> animalitos= new ArrayList<>(); //ARREGLO GENÉRICO
       
        animalitos.add(new Pollo()); // CREACION DE OBJETOS DE FORMA ANÓNIMA
        animalitos.add(new Raton());
        animalitos.add(new Perro());
        animalitos.add(new Pollo());
        animalitos.add(new Gato());
        
        for(Animal a:animalitos)
        {
            s.servicioHacerRuido((ComportamientoAnimal)a);
        }
        
        animalitos.get(0).setEdad(1);
        System.out.println(animalitos.get(0).getEdad());
    }
    
}
