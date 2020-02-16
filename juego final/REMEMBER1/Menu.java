import greenfoot.*;  
//CLASE Menu QUE HEREDA DE World
public class Menu extends World
//ESTA CLASE LE DA INICIO AL JUEGO 
{
    public Menu()
    //CONSTRUCTOR
    {    
        //MEDIDA DEL MUNDO
        super(600, 400, 1);
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
