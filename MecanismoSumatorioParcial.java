
/**
 * Write a description of class MecanismoSumatorioParcial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoSumatorioParcial extends Mecanismo
{
    
    /**
     * Constructor for objects of class Offset
     */
    public MecanismoSumatorioParcial(int num)
    {
        super(num);
    }

    /**
     * Metodo que devuelve el numero encriptado
     */
    public int encriptar(int num)
    {
        int numero = num;
        int cont = 0;
        while(num-(cont+1)>=getNum()){
            numero += num - (cont+1);
            cont++;
        }
        return numero;
    }
    
    /**
     * Metodo que devuelve el numero encriptado
     */
    public int desencriptar(int num)
    {
        int numero = num;
        boolean positivo = true;
        int cont = getNum();
        while(positivo){
            numero -= cont;
            if(numero <= 0){
                positivo = false;
                numero += cont;
            }
            cont++;
        }
        return numero;
    }
}
