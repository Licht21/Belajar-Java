package interfaces;

public interface Car extends Brand {
    void drive();

    int getTire();

    default boolean isBig() {
        return false;
    }

    default boolean isSecond() {
         return true;
    }
}
