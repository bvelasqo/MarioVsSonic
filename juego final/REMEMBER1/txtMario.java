import greenfoot.*; 
//CLASE txtMario HEREDA DE Actor
public class txtMario extends Actor
//ESTA CLASE REPRESENTA EL TEXTO QUE DENOMINA A MARIO EN EL MUNDO CHOOSE
{
    public void act() 
    {
        //LLAMADA AL METODO
        click();
    }    

    public void click()
    //ESTE METODO VERIFICA SI ESCOGIERON A MARIO
    {
        if(Greenfoot.mouseClicked(this))
        /**
         * CONDICION:
         *  SI HACEN CLICK EN ESTE OBJETO
         * ACCION:
         *  CAMBIA EL MUNDO A EL PRIMER NIVEL DE MARIO
         */
        {
            Greenfoot.setWorld(new Mundo1Mario());
        }
    }
}
