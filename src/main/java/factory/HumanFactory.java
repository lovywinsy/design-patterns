package factory;

/**
 * Created by lovywinsy on 12/21/16.
 */
public class HumanFactory {
    public static Human createHuman(String m) {
        Human p = null;
        if (m.equals("boy")) {
            p = new Boy();
        } else if (m.equals("girl")) {
            p = new Girl();
        }
        return p;
    }
}
