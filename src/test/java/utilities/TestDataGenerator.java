package utilities;

import com.github.javafaker.Faker;

public class TestDataGenerator {
    private static Faker faker = new Faker();

    public static String generateUsername() {
        return  faker.name().username();
    }

    public static String generatePassword() {
        return faker.internet().password();
    }

//    public static String generateNumberString() {
//        return faker.numerify("380");
//    }
//
//    public static String generateLiteral() {
//        return faker.bothify("???????", true);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(generateLiteral());
//        System.out.println(generateNumberString());
//    }
}
