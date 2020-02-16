import greenfoot.*; 
//CLASE pikachu HEREDA DE Actor
public class pikachu extends Actor
//ESTA CLASE REPRESENTA APIKACHU QUE GENERA LOS PUNTOS
{
    //ATRIBUTOS
    public static final GreenfootImage pikachuquieto1=new GreenfootImage("Pikachu_1.png");
    public static final GreenfootImage pikachuquieto2=new GreenfootImage("Pikachu_2.png");
    public static final GreenfootImage pikachuquieto3=new GreenfootImage("Pikachu_3.png");
    public static final GreenfootImage pikachuquieto4=new GreenfootImage("Pikachu_4.png");
    public static final GreenfootImage pikachuquieto5=new GreenfootImage("Pikachu_5.png");
    //CONSTANTES E INICIALIZACION DE IMAGENES PARA LA CLASE
    private int contadorAnimacion;
    //CONTADOR PARA ANIMAR A PIKACHU
    public pikachu()
    //CONSTRUCTOR
    {
        //CAMBIA LA IMAGEN A LA PRIMERA
        setImage(pikachuquieto1);
        //INICIALIZA EL CONTADOR A 0
        contadorAnimacion=0;
    }

    void animar() 
    /**ESTE METODO ES PARA QUE PIKACHU SE ANIME
     * CONDICION GENERAL:
     *  VERIFICA SI EL CONTADOR DE ANIMACION LLEGA A RESPECTIVO NUMERO
     * ACCION GENERAL:
     *  CAMBIA LA IMAGEN HACIENDO QUE PIKACHU SE ANIME
     */
    {
        if(contadorAnimacion==15){
            setImage(pikachuquieto2);
        }
        if(contadorAnimacion==30){
            setImage(pikachuquieto3);
        }
        if(contadorAnimacion==45){
            setImage(pikachuquieto4);
        }
        if(contadorAnimacion==60){
            setImage(pikachuquieto5);
        }
        if(contadorAnimacion==75){
            setImage(pikachuquieto1);
            contadorAnimacion=0;
        }
        contadorAnimacion++;
        //AUMENTA EL CONTADOR EN CADA LLAMADA AL METODO
    }    

    public void act()
    {
        //LLAMADA AL METODO
        animar();
    }
}
