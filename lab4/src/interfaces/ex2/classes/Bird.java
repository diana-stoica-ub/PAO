package interfaces.ex2.classes;

public interface Bird extends BaseClass {

    default boolean hasFeathers() {
        return true;
    }
}
