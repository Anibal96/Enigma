
/**
 * Write a description of class Offset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoOffset extends Mecanismo
{
    /**
     * Constructor for objects of class Offset
     */
    public MecanismoOffset(int num)
    {
        super(num);
    }

    /**
     * Metodo que devuelve el numero encriptado
     */
    public int encriptar(int num)
    {
        String nume = "" + num;
        int numero = 0;
        for(int cont = 0; cont < nume.length(); cont++){
            int num1 = Integer.parseInt (nume.substring(cont, cont+1));
            if(cont!=0)
                num1 += getNum();
            if(num1>=10)
                num1 -= 10;
            numero += num1 * Math.pow(10, nume.length()-(cont+1));
        }   
        return numero;
    }
    
    /**
     * Metodo que devuelve el numero encriptado
     */
    public int desencriptar(int num)
    {
        String nume = "" + num;
        int numero = 0;
        for(int cont = 0; cont < nume.length(); cont++){
            int num1 = Integer.parseInt (nume.substring(cont, cont+1));
            if(cont!=0)
                num1 -= getNum();
            if(num1<0)
                num1 += 10;
            numero += num1 * Math.pow(10, nume.length()-(cont+1));
        }   
        return numero;
    }
}