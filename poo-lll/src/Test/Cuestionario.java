
package Test;

import java.util.*;

import Test.Modelo;
import Test.Opciones;
import Test.Preguntas;
import java.util.ArrayList;

public class Cuestionario 
{
 public static void main(String[] args) 
    {
       Opciones op1=new Opciones("8 minutos y 20 segundos",true);
       Opciones op2=new Opciones("Menos de 1 segundo",false);
       Opciones op3=new Opciones("Seis minutos y 15 segundos",false);
       
       Opciones op4=new Opciones("La luna Titán de Saturno",false);
       Opciones op5=new Opciones("La luna Ganímedes de Júpiter",true);
       Opciones op6=new Opciones("La luna de la Tierra",false);
       
       Opciones op7=new Opciones("Una tormenta activa desde hace mas de 3 siglos",true);
       Opciones op8=new Opciones("La huella del impacto que dejo un cometa",false);
       Opciones op9=new Opciones("La Gran Mancha Roja no está en Júpiter",false);
       
       Opciones op10=new Opciones("Venus",true);
       Opciones op11=new Opciones("Marte",false);
       Opciones op12=new Opciones("Júpiter",false);
       
       Opciones op13=new Opciones("Ceres",true);
       Opciones op14=new Opciones("Marte",false);
       Opciones op15=new Opciones("Plutón",false);
       
       Opciones op16=new Opciones("Nix",false);
       Opciones op17=new Opciones("Caronte",true);
       Opciones op18=new Opciones("Calisto",false);
       
       Opciones op19=new Opciones("El planeta Venus",false);
       Opciones op20=new Opciones("La luna Titán de Saturno",false);
       Opciones op21=new Opciones("La luna Europa de Júpiter",true);
       
       ArrayList<Opciones> opcion1=new ArrayList<>();
       opcion1.add(op1);
       opcion1.add(op2);
       opcion1.add(op3);
       
       ArrayList<Opciones> opcion2=new ArrayList<>();
       opcion2.add(op4);
       opcion2.add(op5);
       opcion2.add(op6);
       
       ArrayList<Opciones> opcion3=new ArrayList<>();
       opcion3.add(op7);
       opcion3.add(op8);
       opcion3.add(op9);
       
       ArrayList<Opciones> opcion4=new ArrayList<>();
       opcion4.add(op10);
       opcion4.add(op11);
       opcion4.add(op12);
       
       ArrayList<Opciones> opcion5=new ArrayList<>();
       opcion5.add(op13);
       opcion5.add(op14);
       opcion5.add(op15);
       
       ArrayList<Opciones> opcion6=new ArrayList<>();
       opcion6.add(op16);
       opcion6.add(op17);
       opcion6.add(op18);

       ArrayList<Opciones> opcion7=new ArrayList<>();
       opcion7.add(op19);
       opcion7.add(op20);
       opcion7.add(op21);
            
       Preguntas p1=new Preguntas();
       p1.setTitulo("¿Cuánto tarda la luz del Sol en llegar a la Tierra?");
       p1.setOpciones(opcion1);
       
       Preguntas p2=new Preguntas();
       p2.setTitulo("El mayor satélite del Sistema Solar es...");
       p2.setOpciones(opcion2);
       
       Preguntas p3=new Preguntas();
       p3.setTitulo("¿Qué es la Gran Mancha Roja de Júpiter?");
       p3.setOpciones(opcion3);
       
       Preguntas p4=new Preguntas();
       p4.setTitulo("¿Cuál es el planeta que pasa más cerca de la Tierra?");
       p4.setOpciones(opcion4);
       
       Preguntas p5=new Preguntas();
       p5.setTitulo("¿A qué astro ha llegado este año la misión Dawn de la NASA?");
       p5.setOpciones(opcion5);
       
       Preguntas p6=new Preguntas();
       p6.setTitulo("¿Cuál es la mayor luna de Plutón?");
       p6.setOpciones(opcion6);
       
       Preguntas p7=new Preguntas();
       p7.setTitulo("¿En cuál de estos astros puede haber agua líquida y vida bajo la superficie?");
       p7.setOpciones(opcion7);
       
       Modelo modelo=new Modelo();
       modelo.agregarPregunta(p1);
       modelo.agregarPregunta(p2);
       modelo.agregarPregunta(p3);
       modelo.agregarPregunta(p4);
       modelo.agregarPregunta(p5);
       modelo.agregarPregunta(p6);
       modelo.agregarPregunta(p7);
            
       ArrayList<Preguntas> c= modelo.obtenerCuestionario();
       
       for(Preguntas p:c)
       {
           System.out.println(p.getTitulo());
           for(Opciones o: p.getOpciones())
           {
               System.out.println(o.getTitulo()+" " + o.isCorrecta());
           }
       }       
    }      
}
