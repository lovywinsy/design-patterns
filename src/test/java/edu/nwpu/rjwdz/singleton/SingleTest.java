package edu.nwpu.rjwdz.singleton;

import org.junit.Test;

/**
 * Created by lovywinsy on 2016/12/25.
 */
public class SingleTest {
    @Test
    public void singletonEx() {
        System.out.println("This is a singleton pattern demo");

        LazyCaptain captain1 = LazyCaptain.getCaptain();
        LazyCaptain captain2 = LazyCaptain.getCaptain();
        System.out.println("whether captain1 and captain2 are equal? " + (captain1 == captain2));

        EagerCaptain captain3 = EagerCaptain.getCaptain();
        EagerCaptain captain4 = EagerCaptain.getCaptain();
        System.out.println("whether captain3 and captain4 are equal? " + (captain3 == captain4));

        BillPughCaptain captain5 = BillPughCaptain.getCaptain();
        BillPughCaptain captain6 = BillPughCaptain.getCaptain();
        System.out.println("whether captain5 and captain6 are equal? " + (captain5 == captain6));
    }
}
