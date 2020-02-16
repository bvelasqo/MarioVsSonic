import greenfoot.*;  
//CLASE enemigos HEREDA DE Actor
public class enemigos extends Actor
//ESTA CLASE CONTIENE LOS ENEMIGOS PARA LOS PERSONAJES
{
    //ATRIBUTOS
    protected byte velocidad=1;
    //VELOCIDAD DE TODOS LOS ENEMIGOS
    protected int contImpact=0;
    //CONTADOR DE IMPACTOS
    public int impacto()
    //ESTE METODO VERIFICA SI RECIBIÓ UN IMPACTO
    {
        if(isTouching(BoladeFuego.class))
        /**
        CONDICIÓN:
        SI ESTA TOCANDO UNA BOLA DE FUEGO
        */
        {
            /**
            ACCION:
            AUMENTE EL CONTADOR DE IMPACTOS
            */
             contImpact++;
        }
        //RETORNA LOS IMPACTOS
        return contImpact;
    }
}
