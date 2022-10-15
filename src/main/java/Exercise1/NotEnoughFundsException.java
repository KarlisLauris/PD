package Exercise1;

public class NotEnoughFundsException extends Exception {
    public NotEnoughFundsException() {
    }

    public NotEnoughFundsException(String message) {
        super(message);
    }
}
