import greenfoot.*;  
//CLASE txtSonic HEREDA DE Actor
public class txtSonic extends Actor
//ESTA CLASE REPRESENTA EL TEXTO QUE DENOMINA A SONIC EN EL MUNDO CHOOSE
{
    public void act() 
    {
        //LLAMADA AL METODO
        click();
    }    

    public void click()
    //ESTE METODO VERIFICA SI ESCOGIERON A SONIC
    {
        if(Greenfoot.mouseClicked(this))
        /**
         * CONDICION:
         *  SI HACEN CLICK EN ESTE OBJETO
         * ACCION:
         *  CAMBIA EL MUNDO A EL PRIMER NIVEL DE SONIC
         */
        {
            Greenfoot.setWorld(new Mundo1Sonic());
        }
    }
}
