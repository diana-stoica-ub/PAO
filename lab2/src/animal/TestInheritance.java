package animal;

public class TestInheritance {

    public static void main(String[] args) {
        Animal animal = new Animal(AnimalType.OMNIVORE, 4); //instantiere
        animal.move();

        Bird bird = new Bird(AnimalType.HERBIVORE, 2, "white");
        bird.move();
    }

}
