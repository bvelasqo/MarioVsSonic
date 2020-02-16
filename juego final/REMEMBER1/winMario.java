import greenfoot.*;  
//CLASE winMario QUE HEREDA DE World
public class winMario extends World
//ESTA CLASE APARECE CUANDO MARIO GANA
{
    public winMario()
    //CONSTRUCTOR
    {    
        // MEDIDA DEL MUNDO
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
