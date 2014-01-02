package me.Dinner1111.Scripter.Exceptions;

public class InvalidCommandException extends Exception {
    private static final long serialVersionUID = 298437822L;
    public InvalidCommandException(String message) {
        super(message);
    }
    public long getSerialVersionUID() {
        return serialVersionUID;
    }
}