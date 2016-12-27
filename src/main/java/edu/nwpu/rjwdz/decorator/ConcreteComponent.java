package edu.nwpu.rjwdz.decorator;

/**
 * Created by lovywinsy on 12/27/16.
 */
public class ConcreteComponent extends Component {
    @Override
    public void doSomeWork() {
        System.out.println("I am from ConcreteComponent, I am closed for modification");
    }
}
