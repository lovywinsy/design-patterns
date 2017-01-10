package edu.nwpu.rjwdz.factory;

/**
 * Created by lovywinsy on 2017/1/10.
 */
public class ConcreteFactory extends IAnimalFactory {
    @Override
    public IAnimal getAnimalType(String type) throws Exception {
        switch (type) {
            case "Duck":
                return new Duck();
            case "Tiger":
                return new Tiger();
            default:
                throw new Exception("Animal Type : " + type + "cannot be instantiated");
        }
    }
}
