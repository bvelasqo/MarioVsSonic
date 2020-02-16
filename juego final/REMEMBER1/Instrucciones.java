import greenfoot.*;  
//CLASE Instrucciones HEREDA DE World
public class Instrucciones extends World
//CLASE INSTRUCCIONES EN DONDE SE MOSTRARÁN LAS INSTRUCCIONES DEL JUEGO
{

    public Instrucciones()
    //CONSTRUCTOR
    {    
        super(600, 400, 1);
        //MEDIDA DEL MUNDO
    }

    public void act(){
        if(Greenfoot.isKeyDown("enter"))
        /**ESTA CONDICION REPRESENTA QUE EN EL MOMENTO DE DAR ENTER CREARÁ
        UNA NUEVA VERSION DE LA CLASE CHOOSE Y SE VERÁ EN PANTALLA CHOOSE*/
        {
            Greenfoot.setWorld(new CHOOSE());
        }
    }
}
