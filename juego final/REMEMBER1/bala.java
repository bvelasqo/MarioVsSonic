import greenfoot.*;  
//CLASE bala HEREDA DE enemigos
public class bala extends enemigos
//ESTA CLASE REPRESENTA LA BALA INDESTRUCTIBLE
{
    //ATRIBUTOS
    private int velocidadBala=3;
    //VELOCIDAD DE LA BALA
    public void act() {
        //LLAMADA AL METODO
        mover();
    }    

    public void mover()
    //ESTE METODO ES PARA QUE LA BALA SE MUEVA
    {
        move(velocidadBala);
        //LA BALA SE MUEVE A LA VELOCIDAD DADA
        if(getX() <= 25 || getX() >= getWorld().getWidth() -35 || getY() <= 5 || getY() >= getWorld().getHeight() -25 )
        /**
        CONDICION:
        SI TOCA ALGUN BORDE DEL MUNDO
         */
        {
            /**
            ACCION:
            ROTA 90 GRADOS
             */
            turn(90);
        }
        if(isTouching(obstaculos.class))
        /**
        CONDICION:
        SI TOCA UN OBSTACULO
         */
        {
            /**
            ACCION:
            ROTA 180 GRADOS
             */
            turn(180);
        }
    }
}
