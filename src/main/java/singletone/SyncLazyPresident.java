package singletone;

/**
 * Created by lovywinsy on 2016/12/13.
 */
public class SyncLazyPresident {
    private static SyncLazyPresident thePresident;

    private SyncLazyPresident() {
    }

    public synchronized static SyncLazyPresident getPresident() {
        if (null == thePresident) {
            thePresident = new SyncLazyPresident();
        }
        return thePresident;
    }
}
