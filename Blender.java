/**
 * Representacion de la licuadora con todas las funciones que puede realizar
 */
public class Blender implements IBlender{

    private boolean full;
    private int speed;

    public Blender() {
        full = false;
        speed = 0;
    }

    @Override
    public boolean IsFull(){
        return full;
    }
    
    @Override
    public int GetSpeed(){
        return speed;
    }

    @Override
    public void SpeedUp(){
        if (speed != 9){
            speed++;
        }
    }

    @Override
    public void Fill(){
        full = true;
    }

    @Override
    public void Empty(){
        if (speed == 0){
            full = false;
        }
         
    }

    @Override
    public void SpeedDown(){
        if (speed >= 0){
            speed--;
        }
    }
}