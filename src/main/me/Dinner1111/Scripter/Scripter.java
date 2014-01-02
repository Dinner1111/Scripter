package me.Dinner1111.Scripter;

import me.Dinner1111.Scripter.Commands.CommandResolver;
import me.Dinner1111.Scripter.Commands.Executors.FindExecutor;
import me.Dinner1111.Scripter.Exceptions.InvalidArgumentsException;
import me.Dinner1111.Scripter.Exceptions.InvalidCommandException;
import me.Dinner1111.Scripter.Exceptions.LocationNotFoundException;

public class Scripter {
    static FindExecutor findExecutor = new FindExecutor();
    static CommandResolver cmdResolver = new CommandResolver(findExecutor);
    public static void Main(String[] args) {
        System.out.print("Type a command.\n> ");
        args = System.in.toString().split(" ");
        try { execute(args); } catch (InvalidArgumentsException | InvalidCommandException | LocationNotFoundException e) {
            System.out.println("Error: " + e.getMessage() + "\n>");
        }
    }
    private static void execute(String[] commandContext) throws InvalidArgumentsException, InvalidCommandException, LocationNotFoundException {
        if (commandContext.length == 1) throw new InvalidArgumentsException("Length cannot be 1.");
        String command = commandContext[0];
        String[] args = new String[commandContext.length - 1];
        for (int index = 1; index < commandContext.length; index++)
            args[--index] = commandContext[index];
        cmdResolver.checkCommand(command, args);
    }
}