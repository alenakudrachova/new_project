public class Main {

        public static void main(String[] args) {
            Engineer first = new Engineer("Ivan","Ivanov","QA engineer", 3000);
            first.name();
            first.surname();
            first.position();
            first.salary();


            Cars BMW = new Cars("BMW");
            BMW.displayInto("BMW");

            Cars speed = new Cars(100);
            speed.displayInto(100);

            Cars difference = new Cars(6.1f, 5.9f);
            difference.displayInto(6.1f-5.9f);

            Cars result = new Cars(6.1f, 5.9f);
            result.result();
        }

}
