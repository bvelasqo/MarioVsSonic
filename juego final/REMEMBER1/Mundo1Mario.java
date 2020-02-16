import greenfoot.*;  
//LA CLASE Mundo1Mario HEREDA DE Nivel1
public class Mundo1Mario extends Nivel1
//ESTA CLASE REPRESENTA EL NIVEL 1 SI ESCOGEN A MARIO
{
    //ATRIBUTOS
    mario Mario = new mario();
    //CONEXION CON LA CLASE mario
    public Mundo1Mario()
    //CONSTRUCTOR
    {     
        //SE AGREGA A MARIO AL MUNDO
        addObject(Mario, 20, 20);
    }

}
