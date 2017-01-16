package edu.nwpu.rjwdz.builder;

/**
 * Created by lovywinsy on 1/16/17.
 */
public class Director {
    private IBuilder builder;

    public void construct(IBuilder builder) {
        this.builder = builder;
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadLights();
    }
}
