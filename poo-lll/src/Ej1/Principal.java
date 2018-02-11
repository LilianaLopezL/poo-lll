/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

/**
 *
 * @author hp
 */
public class Principal {
    
    public static void main(String[] args) {

        System.out.println(" ..:: B I E N V E N I D O  ::..");

        Alumno x=new Alumno();
        x.setMatricula(16358739);
        x.setNombre("Liliana");
        x.setPaterno("López");
        x.setMaterno("López");
        
        Imprimir datos=new Imprimir();
        datos.a=x;

        System.out.println(datos.informacion());
        
    }
    
}
