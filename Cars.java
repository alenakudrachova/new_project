public class Cars {

    int speed;
    float acceleration_time;
    float deceleration_time;
    String brand;

    public Cars(String brand, int speed,float acceleration_time, float deceleration_time) {
        this.brand = brand;
        this.speed = speed;
        this.acceleration_time = acceleration_time;
        this.deceleration_time = deceleration_time;
    }

    public void brand() {
        System.out.println("Car's brand: \n" + brand);
    }

    public void speed() {
        System.out.println("Car's speed: \n" + speed);
    }

    public void difference(float v) {
        System.out.println("Car's time difference: \n" + v);
    }

    public void result() {
        System.out.println("Are the acceleration and deceleration times equal to each other? \n" + (acceleration_time==deceleration_time));
    }
}
