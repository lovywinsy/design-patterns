package singletone;

/**
 * Created by lovywinsy on 2016/12/13.
 */
public class SynchronizationLazyPresident {
    private static SynchronizationLazyPresident thePresident;

    private SynchronizationLazyPresident() {
    }

    public synchronized static SynchronizationLazyPresident getPresident() {
        if (null == thePresident) {
            thePresident = new SynchronizationLazyPresident();
        }
        return thePresident;
    }
}
