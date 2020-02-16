import greenfoot.*;  
//CLASE Fantasma1 HEREDA DE enemigos
public class Fantasma1 extends enemigos
//LA CLASE FANTASMA1 SE ENCARGA DE LAS ACCIONES RELACIONADAS CON EL PRIMER FANTASMA
{
    public void act() 
    {
        //LLAMADA A LOS METODOS
        mover();
        if(super.impacto()==1)
        /**
        CONDICION:
        SI RECIBE UN IMPACTO
         */
        {
            /**
            ACCION:
            MUERE
             */
            morir();
        }
    }    

    public void mover()
    //ESTE METODO ES PARA QUE EL FANTASMA SE MUEVA
    {
        //SE MUEVE A LA VELOCIDAD DADA EN LA CLASE PADRE
        move(velocidad);
        if(Greenfoot.getRandomNumber(100)< 3)
        /**
        CONDICION:
        EN UNA PROBABILIDAD DEL 3%
         */
        {
            /**
            ACCION:
            ROTA UN NUMERO ALEATORIO Y LE RESTA 45
             */
            turn(Greenfoot.getRandomNumber(90)-45);  
        }
        if(getX() <= 5 || getX() >= getWorld().getWidth() -25|| isTouching(obstaculos.class))
        /**
        CONDICION:
        SI LLEGA AL BORDE DEL ANCHO DEL MUNDO O TOCA OBSTACULOS
         */
        {
            /**
            ACCION: 
            ROTA 90 GRADOS
             */
            turn(90);
        }
        if(getY() <= 5 || getY() >= getWorld().getHeight() -25 || isTouching(obstaculos.class))        
        /**
        CONDICION:
        SI LLEGA AL BORDE DEL ALTO DEL MUNDO O TOCA OBSTACULOS
         */        
        {
            /**
            ACCION: 
            ROTA 90 GRADOS
             */
            turn(90);

        } 
    }

    public  void morir()
    //ESTE METODO ES PARA MORIR
    {
        //INICILIZA LA CONEXION CON EL MUNDO
        World mundo= getWorld();
        //REMUEVE EL FANTASMA DEL MUNDO
        mundo.removeObject(this);
    }
}
