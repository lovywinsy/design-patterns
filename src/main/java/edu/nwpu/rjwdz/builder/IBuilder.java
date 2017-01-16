package edu.nwpu.rjwdz.builder;

/**
 * Created by lovywinsy on 1/16/17.
 */
public interface IBuilder {
    void buildBody();

    void insertWheels();

    void addHeadLights();

    Product getVehicle();
}
