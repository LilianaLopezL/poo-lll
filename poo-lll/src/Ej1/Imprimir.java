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
public class Imprimir {
    
    Alumno a;
    
    public String informacion()
    {
        
        int cta=a.getMatricula();
        String nom=a.getNombre();
        String ap=a.getPaterno();
        String am=a.getMaterno();
        return "Tu matricula es: " + cta + "  \nTu nombre es: " + nom + 
               "  \nTu apellido paterno es:  " + ap + "  \nTu apelido materno es: " + am;
        
    }
    
}
