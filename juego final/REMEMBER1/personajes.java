import greenfoot.*;
//CLASE personajes HEREDA DE Actor
class personajes extends Actor
//ESTA CLASE CONTIENE LOS METODOS GENERALES DE CADA PERSONAJE
{
    //ATRIBUTOS
    protected byte velocidad=1;
    //VELOCIDAD DE LOS PERSONAJES
    protected int contadorAnimacion, contadorCorriendo=0;
    //CONTADORES DE LA ANIMACION DE LOS PERSONAJES
    protected int TIEMPO_WAIT = 20;
    //TIEMPO DE ESPERA PARA DISPARAR
    protected byte contRecarga;
    //CONTADOR DE RECARGA PARA DISPARAR
    protected byte img1 = 1;
    //CONTADOR DE IMAGENES
    protected byte contadorPikas=0;
    // CONTADOR DE PIKACHUS COMIDOS
    public void bordes()
    /**ESTE METODO VERIFICA SI TOCA LOS BORDES
    CONDICION GENERAL:
    SI ESTÁ TOCANDO ALGUN BORDE
    ACCION GENERAL:
    CAMBIA LA POSICION DEL PERSONAJE
     */
    {
        if(estaAlBordeDerecho()){
            setLocation(getX()-10, getY());
        }
        if(estaAlBordeIzquierdo()){
            setLocation(getX()+10, getY()); 
        }
        if(estaAlBordeInferior()){
            setLocation(getX(), getY()-10);
        }
        if(estaAlBordeSuperior()){
            setLocation(getX(), getY()+10);
        }
    }

    public boolean estaAlBordeDerecho()
    //ESTE METODO VERIFICA SI TOCA EL BORDE DERECHO
    {
        World mundo = getWorld();
        //INICIALIZACION DE CONEXION CON EL MUNDO
        return getX() >= mundo.getWidth() - 19;
        //RETORNA SI LA POSICION ES MAYOR O IGUAL QUE EL ANCHO DEL MUNDO
    }

    public boolean estaAlBordeIzquierdo() 
    //ESTE METODO VERIFICA SI ESTA EN EL BORDE IZQUIERDO
    {
        return getX() <= 19;
        //RETORNA SI LA POSICION EN X ES MENOR O IGUAL QUE 19
    }

    public boolean estaAlBordeSuperior()
    //ESTE METODO VERIFICA SI ESTA EN EL BORDE SUPERIOR
    {
        return getY() <= 19;
        //RETORNA SI LA POSICION EN Y ES MENOR O IGUAL QUE 19
    }

    public boolean estaAlBordeInferior() 
    //ESTE METODO VERIFICA SI ESTA EN EL BORDE INFERIOR
    {
        World mundo = getWorld();
        //INICIALIZACION DE LA CONEXION CON EL MUNDO
        return getY() >= mundo.getHeight() - 19;
        //RETORNA SI LA POSICION EN Y ES MAYOR QUE EL ALTO DEL MUNDO -19
    }

    public void contactoConBorde()
    /**
    ESTE METODO VERIFICA SI ESTÁ TOCANDO ALGUN BLOQUE
    CONDICION GENERAL:
    SI ESTA TOCANDO ALGUN OBJETO DE LA CLASE OBSTACULOS Y ESTÁ
    MIRANDO HACIA ÉL.
    ACCION GENERAL:
    DEVUELVALO Y NO LO DEJE PASAR
     */
    {
        if(isTouching(obstaculos.class)&&getRotation()==90){
            setLocation(getX(), getY()-30);
        }
        if(isTouching(obstaculos.class)&&getRotation()==180){
            setLocation(getX()+30, getY());
        }
        if(isTouching(obstaculos.class)&&getRotation()==0){
            setLocation(getX()-30, getY());
        }
        if(isTouching(obstaculos.class)&&getRotation()==270){
            setLocation(getX(), getY()+30);
        }
    }

    public void disparar()
    //ESTE METODO HACE QUE EL PERSONAJE DISPARE
    {
        if(Greenfoot.isKeyDown("Space"))
        /**
        CONDICION:
        SI SE PRESIONA LA TECLA ESPACIO
        ACCION:
        AUMENTE EL CONTADOR Y VERIFIQUE
         */
        {
            contRecarga++;
            if(contRecarga >= TIEMPO_WAIT)
            /**
            CONDICION:
            SI EL CONTADOR DE RECARGA ES MAYOR QUE EL TIEMPO DE ESPERA
            ACCION:
            LANCE UNA BOLA DE FUEGO Y VUELVA EL CONTADOR A 0
             */
            {
                BoladeFuego ax = new BoladeFuego(this.getRotation());  
                getWorld().addObject(ax,getX(),getY()); 
                contRecarga = 0;
            }
        }       
    } 

    public boolean morir ()
    //ESTE METODO ES PARA MORIR
    {
        //VERIFICA SI YA MURIO INICIALIZANDO murio EN false
        boolean murio=false;
        if(isTouching(enemigos.class)||isTouching(Caparazon.class))
        /**
        CONDICION:
        SI ESTA TOCANDO A ALGUN ENEMIGO O AL CAPARAZON
        ACCION:
        PASE murio A true, ACTUALICE LAS VIDAS, Y CAMBIE LA POSICION
        DEL PERSONAJE A SU LUGAR INICIAL
         */
        {
            murio=true;
            niveles nv = (niveles)getWorld();
            setRotation(0);
            nv.actualizarVidas();
            setLocation(20, 20);
        }
        return murio;
        //RETORNA EL VALOR DE murio
    }

    public void comerPika()
    //ESTE METODO HACE QUE SE COMA A PIKACHU
    {
        //INICIALIZACION DE CONEXION CON EL ACTOR PIKACHU
        Actor pika= getOneObjectAtOffset(0, 0, pikachu.class);
        //INICIALIZACION DE CONEXION CON EL MUNDO
        World mundo= getWorld();
        if(pika!=null)
        /**
        CONDICION:
        SI ESTA TOCANDO A PIKACHU
        ACCION:
        ACTUALICE EL PUNTAJE, SUME EL CONTADOR DE PIKACHUS Y ELIMINE
        A ESE PIKACHU
         */
        {
            Nivel1 nv = (Nivel1)getWorld();
            nv.actualizarPuntaje();
            getWorld().removeObject(pika);
            contadorPikas++;
        }
    }

    public int comidas()
    //ESTE METODO DEVUELVE CUANTOS PIKACHUS SE HA COMIDO EL PERSONAJE
    {
        return contadorPikas;
        //RETORNA EL CONTADOR DE PIKACHUS
    }

}
