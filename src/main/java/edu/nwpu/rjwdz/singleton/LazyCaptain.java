package edu.nwpu.rjwdz.singleton;

/**
 * Created by lovywinsy on 2016/12/25.
 */
public class LazyCaptain {
    private static LazyCaptain captain;

    private LazyCaptain() {
    }

    // consider synchronized method.
    public static LazyCaptain getCaptain() {
        // Lazy initialization
        if (null == captain) {
            captain = new LazyCaptain();
        }
        return captain;
    }
}
