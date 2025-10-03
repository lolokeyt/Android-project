import java.util.Random;

public class Human {
    private String eMD;
    private int age;
    private double currentSpeed;
    private double x, y; // координаты


    public Human(String eMD, int age, double currentSpeed) {
        this.eMD = eMD;
        this.age = age;
        this.currentSpeed = currentSpeed;
        this.x = 0.0;
        this.y = 0.0;
    }


    public String getEMD() { return eMD; }
    public void setEMD(String eMD) { this.eMD = eMD; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getCurrentSpeed() { return currentSpeed; }
    public void setCurrentSpeed(double currentSpeed) { this.currentSpeed = currentSpeed; }

    public double getX() { return x; }
    public double getY() { return y; }


    public void move() {
        Random rand = new Random();
        double angle = rand.nextDouble() * 2 * Math.PI;
        double distance = this.currentSpeed;

        this.x += distance * Math.cos(angle);
        this.y += distance * Math.sin(angle);
    }
}