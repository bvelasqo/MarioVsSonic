import greenfoot.*;  
//LA CLASE Mundo2Sonic HEREDA DE Nivel2
public class Mundo2Sonic extends Nivel2
//ESTA CLASE REPRESENTA EL NIVEL 1 SI ESCOGEN A SONIC Y PASAN EL NIVEL 1
{
    //ATRIBUTOS
    sonic Sonic= new sonic();
    //CONEXION CON LA CLASE sonic
    public Mundo2Sonic()
    //CONSTRUCTOR
    {
        //SE AGREGA A SONIC AL MUNDO
        addObject(Sonic, 20, 20);
    }
}
