import greenfoot.*; 
//CLASE mario HEREDA DE personajes
public class mario extends personajes
//ESTA CLASE REPRESENTA UNO DE LOS PERSONAJES LLAMADO mario
{
    //ATRIBUTOS
    public static final GreenfootImage Mariorespirando1=new GreenfootImage("Mario_1.png");
    public static final GreenfootImage Mariorespirando2=new GreenfootImage("Mario_2.png");
    public static final GreenfootImage Mariorespirando3=new GreenfootImage("Mario_3.png");
    public static final GreenfootImage Mariorespirando4=new GreenfootImage("Mario_4.png");
    public static final GreenfootImage MarioCorriendo1=new GreenfootImage("Mario_Caminar_1.png");
    public static final GreenfootImage MarioCorriendo2=new GreenfootImage("Mario_Caminar_2.png");
    public static final GreenfootImage MarioCorriendo3=new GreenfootImage("Mario_Caminar_3.png");
    public static final GreenfootImage MarioCorriendo4=new GreenfootImage("Mario_Caminar_4.png");
    public static final GreenfootImage MarioCorriendo5=new GreenfootImage("Mario_Caminar_5.png");
    public static final GreenfootImage MarioCorriendo6=new GreenfootImage("Mario_Caminar_6.png");
    public static final GreenfootImage MarioCorriendo7=new GreenfootImage("Mario_Caminar_7.png");
    public static final GreenfootImage MarioCorriendo8=new GreenfootImage("Mario_Caminar_8.png");
    //INICIALIZACION DE IMAGENES UTILIZADAS A LO LARGO DE LA CLASE
    public mario()
    //CONSTRUCTOR
    {   
        //SIEMPRE CAMBIA LA IMAGEN AL CREARSE EL OBJETO
        setImage(Mariorespirando1);
    }
    
    public void animar()
    /**ESTE METODO ANIMA A MARIO
     * CONDICION GENERAL:
     *  SI EL CONTADOR LLEGA A DETERMINADO NUMERO
     * ACCION GENERAL:
     *  CAMBIA LA IMAGEN
     */
    {
        if( contadorAnimacion==15) {
            setImage(Mariorespirando2);
        }
        if( contadorAnimacion==30) {
            setImage(Mariorespirando3);
        }
        if( contadorAnimacion==45) {
            setImage(Mariorespirando4);
        }
        if( contadorAnimacion==60) {
            setImage(Mariorespirando1);
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

            setLocation(getX(),getY());
            setRotation(270);
            setImage(MarioCorriendo1);
            move(velocidad);
            if(contadorCorriendo==2){
                setImage(MarioCorriendo2);
            }
            if(contadorCorriendo==4){
                setImage(MarioCorriendo3);
            }
            if(contadorCorriendo==6){
                setImage(MarioCorriendo4);
            }
            if(contadorCorriendo==8){
                setImage(MarioCorriendo5);
            }
            if(contadorCorriendo==10){
                setImage(MarioCorriendo6);
            }
            if(contadorCorriendo==12){
                setImage(MarioCorriendo7);
            }
            if(contadorCorriendo==14){
                setImage(MarioCorriendo8);
            }
            if(contadorCorriendo==16){
                setImage(MarioCorriendo1);
                contadorCorriendo=0;
            }
            contadorCorriendo++;
        }
        if(Greenfoot.isKeyDown("right")){

            setRotation(0);
            setImage(MarioCorriendo1);
            move(velocidad);
            if(contadorCorriendo==2){
                setImage(MarioCorriendo2);
            }
            if(contadorCorriendo==4){
                setImage(MarioCorriendo3);
            }
            if(contadorCorriendo==6){
                setImage(MarioCorriendo4);
            }
            if(contadorCorriendo==8){
                setImage(MarioCorriendo5);
            }
            if(contadorCorriendo==10){
                setImage(MarioCorriendo6);
            }
            if(contadorCorriendo==12){
                setImage(MarioCorriendo7);
            }
            if(contadorCorriendo==14){
                setImage(MarioCorriendo8);
            }
            if(contadorCorriendo==16){
                setImage(MarioCorriendo1);
                contadorCorriendo=0;
            }
            contadorCorriendo++;
        }
        if(Greenfoot.isKeyDown("left")){

            setRotation(180);
            setImage(MarioCorriendo1);
            move(velocidad);
            if(contadorCorriendo==2){
                setImage(MarioCorriendo2);
            }
            if(contadorCorriendo==4){
                setImage(MarioCorriendo3);
            }
            if(contadorCorriendo==6){
                setImage(MarioCorriendo4);
            }
            if(contadorCorriendo==8){
                setImage(MarioCorriendo5);
            }
            if(contadorCorriendo==10){
                setImage(MarioCorriendo6);
            }
            if(contadorCorriendo==12){
                setImage(MarioCorriendo7);
            }
            if(contadorCorriendo==14){
                setImage(MarioCorriendo8);
            }
            if(contadorCorriendo==16){
                setImage(MarioCorriendo1);
                contadorCorriendo=0;
            }
            contadorCorriendo++;
        }
        if(Greenfoot.isKeyDown("down")){

            setRotation(90);
            setLocation(getX(),getY());
            setImage(MarioCorriendo1);
            move(velocidad);
            if(contadorCorriendo==2){
                setImage(MarioCorriendo2);
            }
            if(contadorCorriendo==4){
                setImage(MarioCorriendo3);
            }
            if(contadorCorriendo==6){
                setImage(MarioCorriendo4);
            }
            if(contadorCorriendo==8){
                setImage(MarioCorriendo5);
            }
            if(contadorCorriendo==10){
                setImage(MarioCorriendo6);
            }
            if(contadorCorriendo==12){
                setImage(MarioCorriendo7);
            }
            if(contadorCorriendo==14){
                setImage(MarioCorriendo8);
            }
            if(contadorCorriendo==16){
                setImage(MarioCorriendo1);
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
            Greenfoot.setWorld(new Mundo2Mario());
            super.contadorPikas=0;
        }

        if(isTouching(PrincesaMario.class))
        /**
         * CONDICION:
         *  SI TOCA A LA PRINCESA
         * ACCION:
         *  CAMBIE EL MUNDO AL DE JUEGO GANADO
         */
        {
            Greenfoot.setWorld(new winMario());
        }
    }

    public void act() 
    {
        animar();
        mover();
        morir();
        super.disparar();
        ganarNivel();
        super.comerPika();
        // LLAMADA A LOS METODOS
    }    
}
