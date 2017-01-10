package edu.nwpu.rjwdz.factory;

import org.junit.Test;

/**
 * Created by lovywinsy on 2017/1/10.
 */
public class FactoryTest {
    @Test
    public void factoryEx() throws Exception {
        System.out.println("This is a factory pattern demo");
        IAnimalFactory factory = new ConcreteFactory();

        IAnimal duck = factory.getAnimalType("Duck");
        duck.speak();

        IAnimal tiger = factory.getAnimalType("Tiger");
        tiger.speak();

        IAnimal lion = factory.getAnimalType("Lion");
        lion.speak();
    }
}
