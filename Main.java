public class Main {

        public static void main(String[] args) {
            Engineer first = new Engineer("Ivan","Ivanov","QA engineer", 3000);
            first.name();
            first.surname();
            first.position();
            first.salary();


            Cars BMW = new Cars("BMW", 100, 6.1f, 5.9f);
            BMW.brand();
            BMW.speed();
            BMW.difference();
            BMW.result();
        }

}
