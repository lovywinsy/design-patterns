package singletone;

/**
 * Created by lovywinsy on 2016/12/12.
 */
public class EagerPresident {
    private static final EagerPresident thePresident = new EagerPresident();

    private EagerPresident() {
    }

    public static EagerPresident getPresident() {
        return thePresident;
    }

}
