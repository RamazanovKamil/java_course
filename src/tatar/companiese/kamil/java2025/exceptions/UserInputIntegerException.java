package tatar.companiese.kamil.java2025.exceptions;

public class UserInputIntegerException extends RuntimeException {
    public UserInputIntegerException(String message, NumberFormatException e) {
        super(message, e);
    }
}
