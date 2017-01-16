package edu.nwpu.rjwdz.builder;

/**
 * Created by lovywinsy on 1/16/17.
 */
public class Car implements IBuilder {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a Car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("2 headLights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
