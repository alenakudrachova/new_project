import java.util.Arrays;
import java.util.Random;

public class ArrayHw {
    public static void array_avr() {
        int[] arrays = new int[55];
        int m = 0;
        int s = 0;
        Random random = new Random();

        for (int n = 0; n < arrays.length; n++) {
            arrays[n] = random.nextInt();
            m += arrays[n];
        }
        s = m / arrays.length;
        System.out.println(s);
    }
    public static void max_num() {
        int[] arrays2 = new int[5];
        Random random = new Random();

        for (int m = 0; m < arrays2.length; m++) {
            arrays2[m] = random.nextInt();
        }
            int maxNum = arrays2[0];
            for (int a : arrays2) {
            if (a > maxNum)
                maxNum = a;
        }
        System.out.println(maxNum);
    }

        public static void main (String[] args) {
            array_avr();
            max_num();
        }
}