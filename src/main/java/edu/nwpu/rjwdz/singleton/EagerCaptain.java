package edu.nwpu.rjwdz.singleton;

/**
 * Created by lovywinsy on 2016/12/25.
 */
public class EagerCaptain {
    // Eager initialization.
    private static EagerCaptain captain = new EagerCaptain();

    private EagerCaptain() {
    }

    public static EagerCaptain getCaptain() {
        return captain;
    }
}
