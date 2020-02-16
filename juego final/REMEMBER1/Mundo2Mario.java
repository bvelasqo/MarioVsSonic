import greenfoot.*;  
//LA CLASE Mundo2Mario HEREDA DE Nivel2
public class Mundo2Mario extends Nivel2
//ESTA CLASE REPRESENTA EL NIVEL 2 SI ESCOGEN A MARIO Y PASAN EL NIVEL 1
{
    //ATRIBUTOS
    mario Mario = new mario();
    //CONEXION CON LA CLASE mario
    public Mundo2Mario()
    //CONSTRUCTOR
    {
        //SE AGREGA A MARIO AL MUNDO
        addObject(Mario, 20, 20);
    }
}
