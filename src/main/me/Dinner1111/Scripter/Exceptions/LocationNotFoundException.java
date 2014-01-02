package me.Dinner1111.Scripter.Exceptions;

public class LocationNotFoundException extends Exception {
    private static final long serialVersionUID = 298437821L;
    public LocationNotFoundException(String message) {
        super(message);
    }
    public long getSerialVersionUID() {
        return serialVersionUID;
    }
}