package edu.nwpu.rjwdz.command;

/**
 * Created by lovywinsy on 2017/1/4.
 */
public class MyRedoCommand implements ICommand {
    private Receiver receiver;

    MyRedoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void make() {
        receiver.performRedo();
    }
}
