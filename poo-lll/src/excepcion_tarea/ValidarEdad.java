
package excepcion_tarea;

public class ValidarEdad 
{
     public static void validarEdad(int edad) throws EdadException
    {
        if(edad<18)throw new EdadException();
    }
}
