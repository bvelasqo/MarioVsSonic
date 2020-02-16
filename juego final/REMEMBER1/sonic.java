import greenfoot.*;  
//CLASE sonic HEREDA DE personajes
public class sonic  extends personajes
//ESTA CLASE REPRESENTA UNO DE LOS PERSONAJES LLAMADO sonic
{
    public static final GreenfootImage Sonicrespirando1=new GreenfootImage("Sonic_1.png");
    public static final GreenfootImage Sonicrespirando2=new GreenfootImage("Sonic_2.png");
    public static final GreenfootImage Sonicrespirando3=new GreenfootImage("Sonic_3.png");
    public static final GreenfootImage Sonicrespirando4=new GreenfootImage("Sonic_4.png");
    public static final GreenfootImage Sonicrespirando5=new GreenfootImage("Sonic_5.png");
    public static final GreenfootImage Sonicrespirando6=new GreenfootImage("Sonic_6.png");
    public static final GreenfootImage Sonicrespirando7=new GreenfootImage("Sonic_7.png");
    public static final GreenfootImage Sonicmove1=new GreenfootImage("Correr1.png");
    public static final GreenfootImage Sonicmove2=new GreenfootImage("Correr2.png");
    public static final GreenfootImage Sonicmove3=new GreenfootImage("Correr3.png");
    public static final GreenfootImage Sonicmove4=new GreenfootImage("Correr4.png");
    public static final GreenfootImage Sonicmove5=new GreenfootImage("Correr5.png");
    public static final GreenfootImage Sonicmove6=new GreenfootImage("Correr6.png");
    public static final GreenfootImage Sonicmove7=new GreenfootImage("Correr7.png");
    public static final GreenfootImage Sonicmove8=new GreenfootImage("Correr8.png");
    //INICIALIZACION DE IMAGENES UTILIZADAS A LO LARGO DE LA CLASE
    public sonic()
    //CONSTRUCTOR
    {   
        //SIEMPRE CAMBIA LA IMAGEN AL CREARSE EL OBJETO
        setImage(Sonicrespirando1);
    }

    public void animar()
    /**ESTE METODO ANIMA A SONIC
     * CONDICION GENERAL:
     *  SI EL CONTADOR LLEGA A DETERMINADO NUMERO
     * ACCION GENERAL:
     *  CAMBIA LA IMAGEN
     */
    {
        if( contadorAnimacion==15) {
            setImage(Sonicrespirando2);
        }
        if( contadorAnimacion==30) {
            setImage(Sonicrespirando3);
        }
        if( contadorAnimacion==45) {
            setImage(Sonicrespirando4);
        }
        if( contadorAnimacion==60) {
            setImage(Sonicrespirando5);
        }
        if( contadorAnimacion==75) {
            setImage(Sonicrespirando6);
        }
        if( contadorAnimacion==90) {
            setImage(Sonicrespirando7);
        }
        if( contadorAnimacion==105) {
            setImage(Sonicrespirando1);
            contadorAnimacion=0;
        }
        contadorAnimacion++;
        //CADA VEZ QUE VERIFICA AUMENTA EL CONTADOR
    }

    public void mover()
    /**ESTE METODO HACE QUE AMRIO SE MUEVA
     * CONDICION GENERAL:
     *  SI PRESIONA TECLA CORRESPONDIENTE
     * ACCION GENERAL:
     *  CAMBIA LA POSCION DEL PERSONAJE Y SU ROTACION HACIENDO QUE SE MUEVA 
     *  A LA VELOCIDAD PUESTA EN LA CLASE PADRE, LUEGO SE ANIMA A MARIO
     *  MEDIANTE CONDICIONALES
     */
    {
        if(Greenfoot.isKeyDown("up")){

            setRotation(270);
            setImage(Sonicmove1);
            move(velocidad);
            if(contadorCorriendo==2){
                setImage(Sonicmove2);
            }
            if(contadorCorriendo==4){
                setImage(Sonicmove3);
            }
            if(contadorCorriendo==6){
                setImage(Sonicmove4);
            }
            if(contadorCorriendo==8){
                setImage(Sonicmove5);
            }
            if(contadorCorriendo==10){
                setImage(Sonicmove6);
            }
            if(contadorCorriendo==12){
                setImage(Sonicmove7);
            }
            if(contadorCorriendo==14){
                setImage(Sonicmove8);
            }
            if(contadorCorriendo==16){
                setImage(Sonicmove1);
                contadorCorriendo=0;
            }
            contadorCorriendo++;
        }
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
            setImage(Sonicmove1);
            move(velocidad);
            if(contadorCorriendo==2){
                setImage(Sonicmove2);
            }
            if(contadorCorriendo==4){
                setImage(Sonicmove3);
            }
            if(contadorCorriendo==6){
                setImage(Sonicmove4);
            }
            if(contadorCorriendo==8){
                setImage(Sonicmove5);
            }
            if(contadorCorriendo==10){
                setImage(Sonicmove6);
            }
            if(contadorCorriendo==12){
                setImage(Sonicmove7);
            }
            if(contadorCorriendo==14){
                setImage(Sonicmove8);
            }
            if(contadorCorriendo==16){
                setImage(Sonicmove1);
                contadorCorriendo=0;
            }
            contadorCorriendo++;
        }
        if(Greenfoot.isKeyDown("left")){
            setRotation(180);
            setImage(Sonicmove1);
            move(velocidad);
            if(contadorCorriendo==2){
                setImage(Sonicmove2);
            }
            if(contadorCorriendo==4){
                setImage(Sonicmove3);
            }
            if(contadorCorriendo==6){
                setImage(Sonicmove4);
            }
            if(contadorCorriendo==8){
                setImage(Sonicmove5);
            }
            if(contadorCorriendo==10){
                setImage(Sonicmove6);
            }
            if(contadorCorriendo==12){
                setImage(Sonicmove7);
            }
            if(contadorCorriendo==14){
                setImage(Sonicmove8);
            }
            if(contadorCorriendo==16){
                setImage(Sonicmove1);
                contadorCorriendo=0;
            }
            contadorCorriendo++;
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
            setImage(Sonicmove1);
            move(velocidad);
            if(contadorCorriendo==2){
                setImage(Sonicmove2);
            }
            if(contadorCorriendo==4){
                setImage(Sonicmove3);
            }
            if(contadorCorriendo==6){
                setImage(Sonicmove4);
            }
            if(contadorCorriendo==8){
                setImage(Sonicmove5);
            }
            if(contadorCorriendo==10){
                setImage(Sonicmove6);
            }
            if(contadorCorriendo==12){
                setImage(Sonicmove7);
            }
            if(contadorCorriendo==14){
                setImage(Sonicmove8);
            }
            if(contadorCorriendo==16){
                setImage(Sonicmove1);
                contadorCorriendo=0;
            }
            contadorCorriendo++;
        }
        super.contactoConBorde();
        //LLAMADA AL METODO DE LA CLASE PADRE PARA VERIFICAR SI TOCA LOS BLOQUES
        super.bordes();
        //LLAMADA AL METODO DE LA CLASE PADRE PARA VERIFICAR SI TOCA LOS BORDES
    }

    public void ganarNivel()
    //ESTE METODO HACE QUE GANE EL NIVEL    
    {
        if(super.comidas()==4)
        /**
         * CONDICION:
         *  SI SE HA COMIDO 4 PIKACHUS
         * ACCION:
         *  PASE AL SIGUIENTE NIVEL
         */        
        {
            Greenfoot.setWorld(new Mundo2Sonic());
        }
        if(isTouching(PrincesaMario.class))
        /**
         * CONDICION:
         *  SI TOCA A LA PRINCESA
         * ACCION:
         *  CAMBIE EL MUNDO AL DE JUEGO GANADO
         */        
        {
            Greenfoot.setWorld(new winSonic());
        }
    }

    public void act() 
    {
        animar();
        mover();
        super.morir();
        super.disparar();
        ganarNivel();
        super.comerPika();
        // LLAMADA A LOS METODOS
    }    
}