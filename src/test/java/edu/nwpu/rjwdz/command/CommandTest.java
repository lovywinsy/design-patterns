package edu.nwpu.rjwdz.command;

import org.junit.Test;

/**
 * Created by lovywinsy on 2017/1/4.
 */
public class CommandTest {
    @Test
    public void commandEx() {
        System.out.println("This is a command pattern demo");

        Receiver receiver = new Receiver();
        Invoke invoke = new Invoke();

        MyUndoCommand undoCommand = new MyUndoCommand(receiver);
        MyRedoCommand redoCommand = new MyRedoCommand(receiver);

        invoke.executeCommand(undoCommand);
        invoke.executeCommand(redoCommand);
    }
}
