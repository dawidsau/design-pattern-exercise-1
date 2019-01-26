package pizza;

public class IllegalPizzaTypeException extends RuntimeException {

    public IllegalPizzaTypeException(String message) {
        super(message);
    }
}
