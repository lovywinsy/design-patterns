package edu.nwpu.rjwdz.command;

/**
 * Created by lovywinsy on 2017/1/4.
 */
public class Receiver {
    public void performUndo() {
        System.out.println("Executing -MyUndoCommand");
    }
    public void performRedo() {
        System.out.println("Executing -MyRedoCommand");
    }
}
