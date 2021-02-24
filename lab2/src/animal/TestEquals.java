package animal;

public class TestEquals {

    public static void main(String[] args) {

        //.equals() not overridden
        Bird bird1 = new Bird(AnimalType.OMNIVORE, 2, "blue");
        Bird bird2 = new Bird(AnimalType.OMNIVORE, 2, "blue");
        if (bird1.equals(bird2)) {
            System.out.println("Bird1 == Bird2");
        } else {
            System.out.println("Bird1 != Bird2");
        }

        //.equals() overridden
        Cat cat1 = new Cat(AnimalType.CARNIVORE, 4, true);
        Cat cat2 = new Cat(AnimalType.CARNIVORE, 4, true);
        if (cat1.equals(cat2)) {
            System.out.println("Cat1 == Cat2");
        } else {
            System.out.println("Cat1 != Cat2");
        }

        Bird bird3 = bird1;
        if (bird1.equals(bird3)) {
            System.out.println("Bird1 == Bird3");
        } else {
            System.out.println("Bird1 != Bird3");
        }

        if (bird1 == bird3) {
            System.out.println("Bird1 == Bird3");
        } else {
            System.out.println("Bird1 != Bird3");
        }
        //if we don't override .equals(), it compares the reference (same as "==")
    }
}
