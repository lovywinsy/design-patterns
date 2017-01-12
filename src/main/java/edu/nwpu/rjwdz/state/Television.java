package edu.nwpu.rjwdz.state;

/**
 * Created by lovywinsy on 1/12/17.
 */
public class Television {
    private RemoteControl state;

    public Television(RemoteControl state) {
        this.state = state;
    }

    public void pressButton() {
        state.pressSwitch(this);
    }

    public RemoteControl getState() {
        return state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }
}
