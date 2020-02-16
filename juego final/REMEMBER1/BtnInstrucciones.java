import greenfoot.*;  
//CLASE BtnInstrucciones HEREDA DE Actor
public class BtnInstrucciones extends Actor
//ESTA CLASE REPRESENTA EL BOTON DE INSTRUCCIONES EN CHOOSE
{
    public void act() 
    {
        //LLAMADA AL METODO
        click();
    }

    public void click()
    /**ESTE METODO ES PARA QUE CUANDO LE DE CLICK AL BOTON VAYA A 
    LA CLASE Instrucciones*/
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Instrucciones());
        }
    }
}
