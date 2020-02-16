import greenfoot.*; 
//LA CLASE Mundo1Sonic HEREDA DE Nivel1

public class Mundo1Sonic extends Nivel1
//ESTA CLASE REPRESENTA EL NIVEL 1 SI ESCOGEN A SONIC
{
    //ATRIBUTOS
    sonic Sonic= new sonic();
    //CONEXION CON LA CLASE sonic
    public Mundo1Sonic()
    //CONSTRUCTOR
    {    
        //SE AGREGA A SONIC AL MUNDO
        addObject(Sonic, 20, 20);
    }

}

