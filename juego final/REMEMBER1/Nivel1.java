import greenfoot.*;  
//LA CLASE Nivel1 HEREDA DE niveles
public class Nivel1 extends niveles
//ESTA CLASE CREARA LO QUE HAY EN EL PRIMER NIVEL DE JUEGO
{
    //ATRIBUTOS
    private puntos puntaje;
    //CONEXION CON LA CLASE puntos
    Bloques bloque1=new Bloques();
    Bloques bloque3=new Bloques();
    Bloques bloque4=new Bloques();
    Bloques bloque5=new Bloques();
    BloquesH bloqueH2=new BloquesH();
    BloquesH bloqueH3=new BloquesH();
    BloquesH bloqueH4=new BloquesH();
    //INICIALIZACION DE LOS BLOQUES
    pikachu Pika1=new pikachu();
    pikachu Pika2=new pikachu();
    pikachu Pika3=new pikachu();
    pikachu Pika4=new pikachu();
    //INICIALIZACION DE LOS PIKACHUS
    Fantasma1 fantasma1= new Fantasma1();
    Fantasma2 fantasma2= new Fantasma2();
    //INICIALIZACION DE LOS FANTASMAS
    Mounstro bowser=new Mounstro();
    //INICIALIZACION DEL MOUNSTRO
    bala Bala= new bala();
    //INICIALIZACION DE LA BALA
    public Nivel1()
    //CONSTRUCTOR
    {    
        preparar();
        //LLAMADA AL METODO PREPARAR()
        mostrarPuntaje();
        //LLAMADA AL METODO mostrarPuntaje()
    }

    public void preparar()
    //ESTE METODO PONE EN EL MUNDO LO QUE HAY EN EL PRIMER NIVEL
    {
        addObject(bloque1, 110, 135);
        addObject(bloque3, 400, 115);
        addObject(bloque4, 400, 200);
        addObject(bloqueH2, 210, 270);
        addObject(bloqueH3, 295, 270);
        addObject(bloqueH4, 380, 270);
        //AGREGAR BLOQUES
        addObject(Pika1, 250, 30);
        addObject(Pika2, 570, 30);
        addObject(Pika3, 280, 370);
        addObject(Pika4, 30, 330);
        //AGREGAR PIKACHUS
        addObject(fantasma1, 100, 350);
        addObject(fantasma2, 550, 90);
        //AGREGAR FANTASMAS
        addObject(bowser, 340, 155);
        //AGREGAR MOUNSTRO
        addObject(Bala, 540, 370);
        //AGREGAR BALA
    }

    public void mostrarPuntaje()
    //ESTE METODO MUESTRA LOS PIKACHUS QUE SE HA COMIDO
    {
        //INICIALIZACION DE puntaje
        puntaje= new puntos();
        //SE CREA UNA IMAGEN QUE REPRESENTE LOS PIKACHUS COMIDOS
        GreenfootImage Puntos=new GreenfootImage("Pikachus:0",30,Color.WHITE,Color.BLACK);
        //SE ASIGNA ESA IMAGEN EN puntos
        puntaje.setImage(Puntos);
        //SE AGREGAN LOS PUNTOS AL MUNDO
        addObject(puntaje,60,385);
    }

    public void actualizarPuntaje()
    //ESTE METODO ACTUALIZA EL NUMERO DE PIKACHUS COMIDOS
    {
        //SE CREA UNA IMAGEN QUE REPRESENTE EL NUEVO NUMERO DE PIKACHUS COMIDOS
        GreenfootImage Puntos=new GreenfootImage("Pikachus: "+ puntaje.incrementarPuntos(),30,Color.WHITE,Color.BLACK);
        //SE ASIGNA ESA IMAGEN A Puntos
        puntaje.setImage(Puntos);
    }
}
