package abstract_classes;

import interfaces.ex2.movement.Runner;

public class Dog extends Animal implements Runner {

    public Dog(int noOfLegs) {
        super(noOfLegs);
    }

    @Override
    public void makeNoise() {
        System.out.println("Ham!");
    }
}
