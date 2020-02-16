import greenfoot.*; 
//CLASE Mounstro HEREDA DE enemigos
public class Mounstro extends enemigos
//ESTA CLASE REPRESENTA AL MOUNSTRO
{
    //ATRIBUTOS
    private int contRecarga=2; 
    //CONTADOR DE RECARGA PARA EL CAPARAZON
    private int direccion = 2;
    //DIRECCION A LA QUE VA EL MOUNSTRO
    private int TIEMPO_WAIT = 20;
    //TIEMPO DE ESPERA PARA DISPARAR

    public void act() 
    {
        //LLAMADA A LOS METODOS
        mover();
        disparar();
        if(super.impacto()==2)
        /**
        CONDICION:
        SI RECIBE DOS IMPACTOS
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
    //ESTE METODO ES PARA QUE EL MOUNSTRO SE MUEVA
    {           
        //CAMBIA LA POSICION DEL MOUNSTRO A LA DIRECCION DADA
        setLocation(getX(), getY()+direccion);
        if ( isTouching(obstaculos.class)|| isAtEdge() )
        /**
        CONDICION:
        SI TOCA LOS OBSTACULOS O ALGUN BORDE DEL MUNDO
         */
        { 
            /**
            ACCION:
            CAMBIA A LA DIRECCION CONTRARIA
             */
            direccion *= -1;        
        } 
    } 

    public  void morir()
    //ESTE METODO ES PARA MORIR
    {
        //INICIALIZA LA CONEXION CON EL MUNDO
        World mundo= getWorld();
        //REMUEVE EL MOUNSTRO DEL MUNDO
        mundo.removeObject(this);
    } 

    public void disparar()
    //ESTE METODO ES PARA LANZAR EL CAPARAZON
    {
        if(Greenfoot.getRandomNumber(100)< 30)
        /**
        CONDICION:
        EN UNA PROBABILIDAD DEL 30%
         */
        {
            /**
            ACCION:
            AUMENTA EL CONTADOR DE RECARGA
            VERIFICA SI PASO EL TIEMPO DE ESPERA
             */
            contRecarga++;
            if(contRecarga >= TIEMPO_WAIT)
            /**
            CONDICION:
            SI EL CONTADOR DE RECARGA ES MAYOR QUE EL TIEMPO DE ESPERA
             */
            {
                /**
                ACCION:
                LANZA UN CAPARAZON EN LA POSICION EN LA QUE ESTÁ EL
                MOUNSTRO.
                VUELVE EL CONTADOR DE RECARGA EN 0
                 */
                Caparazon ax = new Caparazon(this.getRotation());  
                getWorld().addObject(ax,getX(),getY()); 
                contRecarga = 0;
            }
        }       
    } 
}
