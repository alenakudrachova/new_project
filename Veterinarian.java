
public class Veterinarian {
    public void treatAnimals (Animal animal) {
        System.out.println(animal.getLocation()+ ' ' + animal.getFood());               //вопрос
        animal.makeNoise();
    }
}
