package singletone;

/**
 * Created by lovywinsy on 2016/12/13.
 */
public class BillPughPresident {
    private static BillPughPresident thePresident;

    private BillPughPresident() {
    }

    private static class SingletonHelper {
        private static final BillPughPresident thePresident = new BillPughPresident();
    }

    public static BillPughPresident getPresident() {
        return SingletonHelper.thePresident;
    }
}
