package me.Dinner1111.Scripter.Exceptions;

public class InvalidArgumentsException extends Exception {
    private static final long serialVersionUID = 298437820L;
    public InvalidArgumentsException(String message) {
        super(message);
    }
    public long getSerialVersionUID() {
        return serialVersionUID;
    }
}