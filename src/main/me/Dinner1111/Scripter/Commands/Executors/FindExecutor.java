package me.Dinner1111.Scripter.Commands.Executors;

import java.io.File;

import me.Dinner1111.Scripter.Exceptions.InvalidArgumentsException;
import me.Dinner1111.Scripter.Exceptions.LocationNotFoundException;

public class FindExecutor {
    public void execute(String[] args) throws InvalidArgumentsException, LocationNotFoundException {
        if (args.length == 1) {
            String path = "C:\\Users\\" + System.getProperty("user.name") + args[0];
            if (!this.checkFile(new File(path)))
                throw new LocationNotFoundException("There is no directory or file at: " + path);
            else this.returner(path);
        } else if (args.length == 2) {
            if (args[1].equalsIgnoreCase("-d")) {
                String path = "D:\\" + System.getProperty("user.name") + args[0];
                if (this.checkFile(new File(path)))
                    throw new LocationNotFoundException("There is no directory or file at: " + path);
                else this.returner(path);
            } else if (args[1].equalsIgnoreCase("-u")) {
                String path = "C:\\Users\\" + args[0];
                if (this.checkFile(new File(path)))
                    throw new LocationNotFoundException("There is no directory or file at: " + path);
                else this.returner(path);
            } else if (args[1].equalsIgnoreCase("-a")) {
                String path = args[0];
                if (this.checkFile(new File(path)))
                    throw new LocationNotFoundException("There is no directory or file at:" + path);
                else this.returner(path);
            } else throw new InvalidArgumentsException("Invalid flag.");
        } else throw new InvalidArgumentsException("Too many arguments.");
    }
    private void returner(String path) {
        System.out.println("The file or directory at " + path + " was found successfully.\n>");
    }
    private boolean checkFile(File file) {
        if (!this.checkNotNull(file)) return false;
        return true;
    }
    private boolean checkNotNull(File file) {
        if (!file.exists())
            if (!file.isDirectory()) return false;
        return true;
    }
}