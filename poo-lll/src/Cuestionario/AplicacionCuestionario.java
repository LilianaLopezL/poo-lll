/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionario;

/**
 *
 * @author T-102
 */
import java.util.*;

public class AplicacionCuestionario {
    
    public static void main(String[] args) 
    {
       Opcion op1=new Opcion("Grasa",false);
       Opcion op2=new Opcion("Contaminacion",false);
       Opcion op3=new Opcion("Sol",false);
       Opcion op4=new Opcion("Azucar",true);
       
       ArrayList<Opcion> opciones=new ArrayList<>();
       
       opciones.add(op1);
       opciones.add(op2);
       opciones.add(op3);
       opciones.add(op4);
       
       Pregunta p1=new Pregunta();
       p1.setTitulo("¿Cuál es el principal causante de cáncer?");
       p1.setOpciones(opciones);
       
       //GENERAR MODELO
       
       ModeloCuestionario modelo=new ModeloCuestionario();
       modelo.agregarPregunta(p1);
       ArrayList<Pregunta> c= modelo.obtenerCuestionario();
       
       for(Pregunta p:c)
       {
           System.out.println(p.getTitulo());
           
           for(Opcion o: p.getOpciones())
           {
               System.out.println(o.getTitulo()+" " + o.isCorrecta());
           }
       }
       
    }
}
