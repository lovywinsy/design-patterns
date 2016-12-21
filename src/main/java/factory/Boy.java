package factory;

/**
 * Created by lovywinsy on 12/21/16.
 */
public class Boy implements Human {
    @Override
    public void talk() {
        System.out.println("Boy is talking...");
    }

    @Override
    public void walk() {
        System.out.println("Boy is walking...");
    }
}
