package edu.nwpu.rjwdz.singleton;

/**
 * Created by lovywinsy on 2016/12/25.
 */
public class BillPughCaptain {
    private static BillPughCaptain captain;

    private BillPughCaptain() {
    }

    private static class SingletonHelper {
        //Nested class is referenced after getCaptain() is called.
        private static final BillPughCaptain captain = new BillPughCaptain();
    }

    public static BillPughCaptain getCaptain() {
        return SingletonHelper.captain;
    }
}
