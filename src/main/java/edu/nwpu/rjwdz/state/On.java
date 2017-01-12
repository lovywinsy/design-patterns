package edu.nwpu.rjwdz.state;

/**
 * Created by lovywinsy on 1/12/17.
 */
public class On extends RemoteControl {
    @Override
    public void pressSwitch(Television context) {
        System.out.println("I am on");
        context.setState(new Off());
    }
}
