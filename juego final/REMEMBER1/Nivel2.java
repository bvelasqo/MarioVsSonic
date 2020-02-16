import greenfoot.*;  
//LA CLASE Nivel2 HEREDA DE niveles
public class Nivel2 extends niveles
//ESTA CLASE CREARA LO QUE HAY EN EL SEGUNDO NIVEL DE JUEGO
{
    //ATRIBUTOS
    BloqueOro bloque1 = new BloqueOro();
    BloqueOro bloque2 = new BloqueOro();
    BloqueOro bloque3 = new BloqueOro();
    BloqueOro bloque4 = new BloqueOro();
    BloqueOro bloque5 = new BloqueOro();
    BloqueOro bloque6 = new BloqueOro();
    BloqueOro bloque7 = new BloqueOro();
    BloqueOro bloque8 = new BloqueOro();
    BloqueOro bloque9 = new BloqueOro();
    BloqueOro bloque10 = new BloqueOro(); 
    //INICIALIZACION DE LOS BLOQUES
    PrincesaMario prince= new PrincesaMario();
    //INICIALIZACION DE LA PRINCESA
    bala Bala1 = new bala();
    bala Bala2 = new bala();
    bala Bala3 = new bala();
    //INICIALIZACION DE LA BALA
    Mounstro mounstro = new Mounstro();
    Mounstro mounstro1 = new Mounstro();
    //INICIALIZACION DE LOS MOUNSTROS
    Fantasma1 fantasmaA = new Fantasma1();
    Fantasma1 fantasmaB = new Fantasma1();
    Fantasma2 fantasmaC = new Fantasma2();
    //INICIALIZACION DE LOS FANTASMAS
    public Nivel2()
    //CONSTRUCTOR
    {
        //LLAMADA AL METODO PREPARAR
        preparar();
    }
    
    public void preparar()
    //ESTE METODO PONE EN EL MUNDO LO QUE HAY EN EL SEGUNDO NIVEL
    {
        addObject(bloque1, 30, 90);
        addObject(bloque2, 90, 90);
        addObject(bloque3, 150, 90);
        addObject(bloque4, 210, 90);
        addObject(bloque5, 270, 90);
        addObject(bloque6, 330, 90);
        addObject(bloque7, 390, 90);
        addObject(bloque8, 390, 151);
        addObject(bloque9, 390, 212);
        addObject(bloque10, 390, 273);
        //AGREGAR BLOQUES
        addObject(prince, 30, 150);
        //AGREGAR PRINCESA
        addObject(mounstro1, 300, 180);
        //AGREGAR MOUNSTRO
        addObject(Bala1, 555, 350);
        addObject(Bala2, 555, 320);
        addObject(Bala3, 300, 300);
        //AGREGAR BALA
        addObject(fantasmaA, 30, 200);
        addObject(fantasmaB, 300, 200);
        addObject(fantasmaC, 500, 200);
        //AGREGAR FANTASMA
        addObject(mounstro, 500, 250);
        //AGREGAR MOUNSTRO
        mounstro.setRotation(90);
        //CAMBIAR ROTACION DE mounstro
    }
}
