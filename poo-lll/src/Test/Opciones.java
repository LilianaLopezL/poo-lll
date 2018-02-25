
package Test;

public class Opciones 
{
    private String titulo;
    private boolean correcta;

    public Opciones(String titulo, boolean correcta) 
    {
        this.titulo = titulo;
        this.correcta = correcta;
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public boolean isCorrecta() 
    {
        return correcta;
    }

    public void setCorrecta(boolean correcta) 
    {
        this.correcta = correcta;
    }   
}
