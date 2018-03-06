
package excepcion_tarea;


public class EdadException  extends Exception 
{
    public EdadException()
    {
        super("No es posible asignar una edad menor que 18 !");
    }
    
}