public class HW {
    public static void if_plus_for() {
        for (int a = 0; a <= 5; a++) {
            if (a == 1) {
                System.out.println("one");
            } else if (a == 2) {
                System.out.println("two");
            } else if (a == 3) {
                System.out.println("three");
            } else if (a == 4) {
                System.out.println("four");
            } else if (a == 5) {
                System.out.println("five");
            }
        }
    }

    public static void if_plus_switch() {
        for (int b = 0; b <= 5; b++) {
            switch (b) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
            }
        }
    }

    public static void just_while() {
        int d = 0;
        for (int c = 10; c <= 55; c++)
            while (c % 2 == 0) {
                d = d + c;
                c++;
            }
        System.out.println(d);
    }


    public static void main(String[] args) {
        if_plus_for();
        if_plus_switch();
        just_while();
    }
}
