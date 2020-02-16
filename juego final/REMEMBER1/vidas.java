import greenfoot.*; 
//CLASE vidas HEREDA DE Actor
public class vidas extends Actor
//ESTA CLASE REPRESENTA LAS VIDAS DEL PERSONAJE
{
    //ATRIBUTOS
    public int perdida;
    //perdida ES UN ENTERO QUE REPRESENTA LAS VIDAS DEL PERSONAJE
    public vidas()
    //CONSTRUCTOR
    {
        //INICIALIZA LAS VIDAS EN 3
        perdida=3;
    }

    public int decrementarVida()
    //ESTE METODO DISMINUYE LAS VIDAS
    {
        //DISMINUYE EN 1 LO QUE HAY EN perdida ES DECIR, LAS VIDAS
        perdida--;
        //INICIALIZACION DE LA CONEXION CON EL ACTOR personajes HAYANDO SU INTERCEPTO
        Actor actor = getOneIntersectingObject(personajes.class);
        if(perdida==0)
        /**
         * CONDICION: 
         *  SI perdida LLEGA A 0 ES DECIR, SE QUEDA SIN VIDAS
         * ACCION:
         *  VUELVE AL MENU DEL JUEGO
         */
        {
            Greenfoot.setWorld(new Menu());
        }
        //RETORNA LAS VIDAS
        return perdida;
    }
}
