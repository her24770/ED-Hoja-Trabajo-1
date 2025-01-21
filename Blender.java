
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
        speed++;
    }

    @Override
    public void Fill(){
        full = true;
    }

    @Override
    public void Empty(){
        full = false;
    }

    @Override
    public void SpeedDown(){
        speed--;
    }
}