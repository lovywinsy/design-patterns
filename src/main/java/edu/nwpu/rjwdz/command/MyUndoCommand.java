package edu.nwpu.rjwdz.command;

/**
 * Created by lovywinsy on 2017/1/4.
 */
public class MyUndoCommand implements ICommand {
    private Receiver receiver;

    MyUndoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void make() {
        receiver.performUndo();
    }
}
