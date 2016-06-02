
/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{
    /**
     * Metodo que devuelve el numero encriptado
     */
    public int encripta(Mecanismo mecanismo, int num)
    {
        int numero = -1;
        if(num>10)
            numero = mecanismo.encriptar(num);
        return numero;
    }
    
    /**
     * Metodo que desencripta el numero encriptado
     */
    public int desencripta(Mecanismo mecanismo, int num)
    {
        int numero = mecanismo.desencriptar(num);
        if(numero <= 10)
            numero = -1;
        return numero;
    }
}
