import greenfoot.*;
//CLASE niveles HEREDA DE World
public class niveles extends World
//ESTA CLASE REPRENSENTA A LO QUE IRÁ EN TODOS LOS NIVELES DEL JUEGO
{
    //ATRIBUTO
    private vidas vida;
    //CONEXION CON LA CLASE vidas QUE SE CREARÁ EN ESTA CLASE
    public niveles()
    //CONSTRUCTOR
    {    
        //MEDIDA DEL MUNDO
        super(600, 400, 1); 
        //LLAMADA AL METODO mostrarVidas()
        mostrarVidas();
    }

    public void mostrarVidas()
    //ESTE METODO MOSTRARÁ CUANTAS VIDAS TIENE EL PERSONAJE EN CADA NIVEL
    {
        //SE INICIALIZA EL ATRIBUTO vida
        vida= new vidas();
        //SE CREA UNA IMAGEN QUE REPRESENTE LAS VIDAS DE LA CLASE vidas
        GreenfootImage vidas=new GreenfootImage("Vidas: "+vida.perdida,30,Color.RED,Color.BLACK);
        //SE CAMBIA LA IMAGEN DE vidas
        vida.setImage(vidas);
        //SE AGREGA AL MUNDO
        addObject(vida,555,385);
    }

    public void actualizarVidas()
    //ESTE METODO ACTUALIZA LAS VIDAS CADA VEZ QUE LO LLAMEN
    {
        //SE CREA LA IMAGEN QUE REPRESENTE LAS NUEVAS VIDAS
        GreenfootImage vidas=new GreenfootImage("Vidas: "+ vida.decrementarVida(),30,Color.RED,Color.BLACK);
        //SE CAMBIA LA IMAGEN DE vidas
        vida.setImage(vidas);
    }
}

