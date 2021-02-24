package animal;

public class TestPolymorphism {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Bird(AnimalType.OMNIVORE, 2, "red");
        Animal a3 = new Cat(AnimalType.CARNIVORE, 4, false);

        moveAndEat(a1);
        moveAndEat(a2);
        moveAndEat(a3);
    }

    public static void moveAndEat(Animal animal) {
        animal.move();
        animal.eat();
    }
}
