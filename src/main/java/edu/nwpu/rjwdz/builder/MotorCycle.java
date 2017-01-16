package edu.nwpu.rjwdz.builder;

/**
 * Created by lovywinsy on 1/16/17.
 */
public class MotorCycle implements IBuilder {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a Motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("1 headLight are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
