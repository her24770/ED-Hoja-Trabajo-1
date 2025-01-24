/**
 * Representacion de la licuadora con todas las funciones que puede realizar
 */
public class Blender implements IBlender{

    private boolean full;
    private int speed;

    /**
     * Constructor
     */
    public Blender() {
        full = false;
        speed = 0;
    }

    /**
     * muestra si la licuadora está llena o no
     * @return estado de capacidad
     */
    @Override
    public boolean IsFull(){
        return full;
    }
    
    /**
     * muestra la velocidad actual de la licuadora
     * @return numero del set de velocidad
     */
    @Override
    public int GetSpeed(){
        return speed;
    }

    /**
     * aumenta la velocidad de la licuadora
     */
    @Override
    public void SpeedUp(){
        if (speed != 9){
            speed++;
        }
    }

    /**
     * determina que la licuadora está llena
     */
    @Override
    public void Fill(){
        full = true;
    }

    /**
     * determina que la licuadora está vacía
     */
    @Override
    public void Empty(){
        if (speed == 0){
            full = false;
        }
         
    }

    /**
     * reduce la velocidad de la licuadora
     */
    @Override
    public void SpeedDown(){
        if (speed >= 0){
            speed--;
        }
    }
}