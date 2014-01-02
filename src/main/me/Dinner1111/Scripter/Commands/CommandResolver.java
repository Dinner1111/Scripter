package me.Dinner1111.Scripter.Commands;

import me.Dinner1111.Scripter.Commands.Executors.FindExecutor;
import me.Dinner1111.Scripter.Exceptions.InvalidArgumentsException;
import me.Dinner1111.Scripter.Exceptions.InvalidCommandException;
import me.Dinner1111.Scripter.Exceptions.LocationNotFoundException;

public class CommandResolver {
    FindExecutor find;
    public CommandResolver(FindExecutor find) {
        this.find = find;
    }
    public void checkCommand(String command, String[] args) throws InvalidCommandException, InvalidArgumentsException, LocationNotFoundException {
        if (command.equalsIgnoreCase("find")) find.execute(args);
        else throw new InvalidCommandException("Command not found.");
    }
}