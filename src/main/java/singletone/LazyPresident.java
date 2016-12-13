package singletone;

/**
 * Created by lovywinsy on 2016/12/12.
 */
public class LazyPresident {
    private static LazyPresident thePresident;

    private LazyPresident() {
    }

    public static LazyPresident getPresident() {
        if (null == thePresident) {
            thePresident = new LazyPresident();
        }
        return thePresident;
    }
}
