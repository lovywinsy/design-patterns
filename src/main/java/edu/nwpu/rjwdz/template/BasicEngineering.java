package edu.nwpu.rjwdz.template;

/**
 * Created by lovywinsy on 12/28/16.
 */
public abstract class BasicEngineering {
    public void paper() {
        math();
        specialPaper();
    }

    private void math() {
        System.out.println("Mathematics");
    }

    public abstract void specialPaper();
}
