import greenfoot.*;  
//Clase CHOOSE hereda de World
public class CHOOSE extends World
//Esta clase representa un mundo en donde se escogerá al personaje
{
    //ATRIBUTOS
    txtMario TXTMARIO= new txtMario();
    //INICIALIZACION DEL TEXTO "MARIO" EN DONDE SE ESCOGERA AL PERSONAJE.
    txtSonic TXTSONIC= new txtSonic();
    //INICIALIZACION DEL TEXTO "SONIC" EN DONDE SE ESCOGERA AL PERSONAJE.
    BtnInstrucciones boton=new BtnInstrucciones();
    //INICIALIZACION DEL BOTON INSTRUCCIONES

    public CHOOSE()
    //CONSTRUCTOR
    {    
        super(600, 400, 1);
        //MEDIDA DEL MUNDO
        preparar();
        //LLAMADA AL METODO PREPARAR
    }

    private void preparar()
    //METODO PREPARAR SIRVE PARA PONER EN EL MUNDO LOS ELEMENTOS LLAMADOS
    {
        addObject(TXTMARIO, 180, 150);
        //AÑADE EL TEXTO "MARIO"
        addObject(TXTSONIC, 430, 250);
        //AÑADE EL TEXTO "SONIC"
        addObject(boton, 300, 340);
        //AÑADE EL BOTON INSTRUCCIONES
    }

}
