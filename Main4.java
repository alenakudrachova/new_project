
public class Main4 {
    public static void main(String[] args) {
        Animal [] animals = new Animal[4];
        animals [0] = new Dog("home1", "Royal", "Loki");
        animals [1] = new Cat("home2", "Thor", "Royal");
        animals [2] = new Horse("home3", "Royal", "Hela");
        animals [3] = new Parrot("home4", "Royal", "Jane");

        Veterinarian vet = new Veterinarian();

        for (Animal animal : animals) {
            vet.treatAnimals(animal);
            animal.eat();
        }
    }
}



