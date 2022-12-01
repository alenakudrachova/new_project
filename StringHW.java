public class StringHW {

    public static void phrase() {
        String phrase = "I like Java!!!";
        System.out.println(phrase.length());
        System.out.println(phrase.substring(13));

        System.out.println(phrase.contains("Java"));

        System.out.println(phrase.replace("a", "o"));

        System.out.println(phrase.toLowerCase());

        System.out.println(phrase.toUpperCase());

        System.out.println(phrase.substring(0, 7));
    }
        public static void cake() {
        String cake = "shortcake %s shortcake";
        System.out.println(String.format(cake, "cream"));
        }

        public static void main (String[] args) {
        phrase();
        cake();
    }
}

