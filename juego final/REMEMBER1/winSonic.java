import greenfoot.*;  
//CLASE winMario QUE HEREDA DE World

public class winSonic extends World
//ESTA CLASE APARECE CUANDO MARIO GANA
{
    public winSonic()
    //CONSTRUCTOR
    {    
        // MEDIDA DEL JUEGO
        super(600, 400, 1); 
    }

    public void act(){
        if(Greenfoot.isKeyDown("enter"))
        /**ESTA CONDICION REPRESENTA QUE EN EL MOMENTO DE DAR ENTER CREARÁ
        UNA NUEVA VERSION DE LA CLASE Menu Y SE VERÁ EN PANTALLA Menu*/
        {
            Greenfoot.setWorld(new Menu());
        }
    }
}
