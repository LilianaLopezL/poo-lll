
package Test;

import Test.Preguntas;
import java.util.*;

public class Modelo 
{
    ArrayList<Preguntas> pregunta;
    
    public Modelo()
    {
        pregunta=new ArrayList<>();  
    }
    
    public void agregarPregunta(Preguntas p)
    {
        pregunta.add(p);   
    }
    
    public ArrayList<Preguntas> obtenerCuestionario()
    {
        return pregunta;
    }   
}
