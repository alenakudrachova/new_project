public class Sun {
    static int count = 0;
    public static void sunrise() {
        count += 1;
    }
    public static void printSunriseCount () {
        System.out.println("Sunrise count is " + count);
    }
}
