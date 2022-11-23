public class Cars {

    int speed;
    float acceleration_time;
    float deceleration_time;
    String brand;

    public Cars(String brand) {
        this.brand = brand;
    }
    public Cars(int speed) {
        this.speed = speed;
    }
    public Cars(float acceleration_time, float deceleration_time) {
        this.acceleration_time = acceleration_time;
        this.deceleration_time = deceleration_time;
    }

    public void displayInto(String brand) {
        System.out.println("Car's brand: \n" + brand);
    }

    public void displayInto(int speed) {
        System.out.println("Car's speed: \n" + speed);
    }

    public void displayInto(float v) {
        System.out.println("Car's time difference: \n" + v);
    }

    public void result() {
        System.out.println("Are the acceleration and deceleration times equal to each other? \n" + (acceleration_time==deceleration_time));
    }
}
