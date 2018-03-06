
package excepcion_tarea;

public class Imprimir 
{
Alumno x;
    
    public String informacion()
    {
        String nom=x.getNombre();
        int no_cta=x.getNo_cuenta();
        int edad=x.getEdad();
        return "Tu matricula es: " + no_cta + "  \nTu nombre es: " + nom + 
               "  \nTu edad es: " + edad;   
    }
        
}
