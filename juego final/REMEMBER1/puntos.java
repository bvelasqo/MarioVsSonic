import greenfoot.*; 
//CLASE puntos HEREDA DE Actor
public class puntos extends Actor
//ESTA CLASE REPRESENTA LOS PUNTOS O LOS PIKACHUS COMIDOS
{
    //ATRIBUTOS
    private int punticos;
    //ATRIBUTO ENTERO LLAMADO punticos    
    public puntos()
    //CONTRUCTOR
    {
        //INCIALIZA EL ATRIBUTO EN 0 QUE REPRESENTA LOS PIKACHUS COMIDOS
        punticos=0;
    } 

    public int incrementarPuntos()
    // ESTE METODO INCREMENTA LOS PUNTOS , ES DECIR LOS PIKACHUS COMIDOS
    {
        punticos++;
        return punticos;
        //RETORNA EL NUMERO DE PIKACHUS COMIDOS
    }
}
