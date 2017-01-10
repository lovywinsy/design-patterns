package edu.nwpu.rjwdz.factory;

/**
 * Created by lovywinsy on 2017/1/10.
 */
public abstract class IAnimalFactory {
    public abstract IAnimal getAnimalType(String type) throws Exception;
}
