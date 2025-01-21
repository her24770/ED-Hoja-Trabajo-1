
public class Blender {
    private boolean isOn;
    private int speed;

    public Blender() {
        isOn = false;
        speed = 0;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}