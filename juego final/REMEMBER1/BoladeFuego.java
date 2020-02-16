import greenfoot.*;  
//CLASE BoladeFuego QUE HEREDA DE Actor
public class BoladeFuego extends Actor
//ESTA CLASE REPRESENTA LA BOLA DE FUEGO QUE LANZA EL PERSONAJE
{
    //ATRIBUTO
    private byte velocidad = 5;
    //VELOCIDAD QUE SE MOVERÁ LA BOLA DE FUEGO
    public BoladeFuego(int rotation)
    //CONSTRUCTOR QUE RECIBE COMO PARAMETRO UN ENTERO LLAMADO rotation
    {
        //CAMBIA LA ROTACION POR EL VALOR DEL PARAMETRO
        setRotation(rotation);
    }

    public void eliminarBola()
    //ESTE METODO ELIMINA LA BOLA DE FUEGO
    {
        World myWorld = getWorld();
        //INICIALIZACION DE LA CONEXION CON EL MUNDO
        if(isAtEdge() || isTouching(obstaculos.class)||isTouching(enemigos.class))
        //CONDICION:
        //SI TOCA LOS OBSTACULOS O EL BORDE DEL MUNDO 
        {
            getWorld().removeObject(this);
            //ACCION:
            //LA BOLA SE ELIMINA
        }
    }

    public void mover()
    //ESTE METODO HACE QUE LA BOLA DE FUEGO SE MUEVA
    {
        //SE MOVERA A LA VELOCIDAD DADA EN LOS ATRIBUTOS
        move(velocidad);
    }

    public void act() 
    {
        //LLAMADA DE METODOS
        mover();
        eliminarBola();
    }    
}
