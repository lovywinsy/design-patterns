package factory;

/**
 * Created by lovywinsy on 12/21/16.
 */
public class Girl implements Human {
    @Override
    public void talk() {
        System.out.println("Girl is talking...");
    }

    @Override
    public void walk() {
        System.out.println("Girl is walking...");
    }
}
