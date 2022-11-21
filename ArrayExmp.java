import java.util.Arrays;
import java.util.Random;

public class ArrayExmp {

    public static void main(String[] args) {
        // объявление массива и выделение памяти (создан целочисленный массив с памятью в 56 целых чисел),
        // по умолчанию все числа в массиве 0
        int[] nums = new int[56];

        // получние длинны массивa
        System.out.println(nums.length);

        String args2[] = new String[20];
        boolean bools[] = new boolean[5];

        int sum = 0;

        //заполнение массива и вывод суммы чисел из массива
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int value :
                values) {
            sum += value;
        }
        System.out.println(sum);

        //заполнение массива рандомными данными
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt();
        }
        for (int num :
                nums) {
            System.out.println(num);
        }

        Arrays.fill(args2, "Value");
    }

    public static void max_num() {
        int[] arrays2 = new int[5];
        Random random = new Random();

        for (int m = 0; m < arrays2.length; m++) {
            arrays2[m] = random.nextInt();
        }
        Arrays.sort(arrays2, 0, 4);
        System.out.println(Arrays.toString(arrays2));
        int key = Arrays.binarySearch(arrays2, 5);
        System.out.println(key);
    }
}

