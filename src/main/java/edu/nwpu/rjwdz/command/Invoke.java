package edu.nwpu.rjwdz.command;

/**
 * Created by lovywinsy on 2017/1/4.
 */
public class Invoke {
    ICommand command;

    public void executeCommand(ICommand command) {
        this.command = command;
        command.make();
    }
}
