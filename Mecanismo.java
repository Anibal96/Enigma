
/**
 * Write a description of class Mecanismo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Mecanismo
{
    // instance variables - replace the example below with your own
    private int num;

    /**
     * Constructor for objects of class Mecanismo
     */
    public Mecanismo(int num)
    {
        this.num = num;
    }

    /**
     * Metodo que devuelve el numero
     */
    public int getNum()
    {
        return num;
    }
    
    /**
     * Metodo que fija el valor de num al dado por parametro
     */
    public void setNum(int num)
    {
        this.num = num;
    }
    
    public abstract int encriptar(int numero);
    
    public abstract int desencriptar(int numero);
}
