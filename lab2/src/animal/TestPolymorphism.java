package animal;

public class TestPolymorphism {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Bird(AnimalType.OMNIVORE, 2, "red");
        Animal a3 = new Cat(AnimalType.CARNIVORE, 4, false);

        a1.move();
        a2.move();
        a3.move();
    }
}
