package interfaces.ex2.classes;

public interface Mammal extends BaseClass {

    default boolean hasFur() {
        return true;
    }
}
