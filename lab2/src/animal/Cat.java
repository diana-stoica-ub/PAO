package animal;

import java.util.Objects;

public class Cat extends Animal {

    private boolean isLongHaired;

    @Override
    public void move() {
        System.out.println("I can jump!");
    }

    public Cat(AnimalType type, int noOfLegs, boolean isLongHaired) {
        super(type, noOfLegs);
        this.isLongHaired = isLongHaired;
    }

    @Override
    public boolean equals(Object o) {   //overridden from Object class
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cat cat = (Cat) o;
        return this.isLongHaired == cat.isLongHaired
                && this.getType() == cat.getType()
                && this.getNoOfLegs() == cat.getNoOfLegs();
    }

    @Override
    public int hashCode() {
        return Objects.hash(isLongHaired, getNoOfLegs(), getType());
    }
}
