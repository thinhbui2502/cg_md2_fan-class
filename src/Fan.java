public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getStatus() {
        return on;
    }

    public void setStatus(boolean status) {
        this.on = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (getStatus()) {
            return "Status: " + on + ", speed: " + speed + ", color: " + color + ", radius: " + radius + ", fan is on";
        } else {
            return "Status: " + on + ", speed: " + speed + ", color: " + color + ", radius: " + radius + ", fan is off";
        }
    }
}
