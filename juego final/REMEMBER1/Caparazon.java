import greenfoot.*;  
//CLASE Caparazon HEREDA DE Actor
public class Caparazon extends Actor
//ESTA CLASE REPRESENTA EL CAPARAZON QUE LANZA EL MOUNSTRO
{
    //ATRIBUTOS
    private byte velocidad = 5;
    //VELOCIDAD DEL CAPARAZON AL SER LANZADO
    public Caparazon (int rotation)
    //CONSTRUCTOR QUE RECIBE COMO PARAMETRO UN ENTERO LLAMADO rotation
    {
        setRotation(rotation);
        //CAMBIA LA ROTACION POR EL VALOR RECIBIDO EN EL PARAMETRO rotation
    }

    public void act() 
    {
        //LLAMADA A LOS METODOS
        mover();
        desaparecer();
    }    

    public void mover()
    //ESTE METODO ES PARA QUE EL CAPARAZON SE MUEVA
    { 
        //SE MOVERA EN LA PARTE DELANTERA DEL MOUNSTRO(PARA ESO EL MENOS)
        move(-velocidad);
    }

    public void desaparecer()
    //ESTE METODO ES PARA QUE DESAPAREZCA
    {
        World myWorld = getWorld();
        //INICIALIZACION DE LA CONEXION CON EL MUNDO
        if (isAtEdge() || isTouching(obstaculos.class))
        //CONDICION:
        //SI TOCA LOS OBSTACULOS O EL BORDE DEL MUNDO 
        {
            getWorld().removeObject(this);
            //ACCION:
            //EL CAPARAZON SE ELIMINA
        }
    }
}
