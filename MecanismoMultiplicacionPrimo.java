
/**
 * Write a description of class numeroPrimo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoMultiplicacionPrimo extends Mecanismo
{
    /**
     * Constructor for objects of class numeroPrimo
     */
    public MecanismoMultiplicacionPrimo(int num)
    {
        super(num);
    }

    /**
     * Metodo que devuelve el numero encriptado
     */
    public int encriptar(int num)
    {
        return getNum()*num;
    }

    /**
     * Metodo que desencripta el numero encriptado
     */
    public int desencriptar(int num)
    {
        return (num/getNum());
    }
}
