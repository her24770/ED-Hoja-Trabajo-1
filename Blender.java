
public class Blender {

    private boolean full;
    private int speed;

    public Blender() {
        full = false;
        speed = 0;
    }

    public boolean isFull() {
        return full;
    }

    public void setIsFull(boolean full) {
        this.full = full;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



}