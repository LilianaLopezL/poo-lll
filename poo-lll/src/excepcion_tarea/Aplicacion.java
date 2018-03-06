
package excepcion_tarea;

public class Aplicacion 
{
    public static void main(String[] args) 
    {
        try
        {
        Alumno a=new Alumno();
        a.setNombre("Liliana");
        a.setNo_cuenta(16358739);
        a.setEdad(21);
        
        ValidarEdad.validarEdad(21); 
        
        Imprimir datos=new Imprimir();
        datos.x=a;

        System.out.println(datos.informacion());
        }
        catch (EdadException ex) 
        {
            System.out.println("No es posible asignar una edad menor que 18 !");
        }
    }
}

