public class If_else {

    public static void main(String[] args ) {
        int i = 6;
        int f = 8;

        if(i==f && f>i) {
            System.out.println("a equals b");
        } else  {
            System.out.println("a and b aren't equal");
        }

        int j = 5;
        switch (j) {
            case 1:
                System.out.println("1");
                break;
            case 5:
                System.out.println("5");
                break;
            case 9:
                System.out.println("9");
                break;
            default:
                System.out.println("Number isn't 1,5 or 9");
        }

        for(int o = 1; o<9; o++) {
            if(o*o>30 && o*o<40)
                continue;
            System.out.println(o*o);
        }

        int k = 6;
        while (k>0) {
            System.out.println(k);
            k--;
        }




    }
}
