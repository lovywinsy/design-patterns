package edu.nwpu.rjwdz.decorator;

/**
 * Created by lovywinsy on 2/19/17.
 */
public class Science extends GirlDecorator {
    private Girl girl;

    public Science(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return this.girl.getDescription() + "+ Like Science ";
    }

    public void caltulateStuff() {
        System.out.println("Scientific calculation!");
    }
}
