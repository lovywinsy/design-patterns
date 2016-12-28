package edu.nwpu.rjwdz.template;

import org.junit.Test;

/**
 * Created by lovywinsy on 12/28/16.
 */
public class TemplateTest {
    @Test
    public void templateEx() {
        System.out.println("This is a template pattern demo");

        BasicEngineering bs1 = new ComputerScience();
        System.out.println("Computer Papers:");
        bs1.paper();

        BasicEngineering bs2 = new Electronics();
        System.out.println("Electronics Papers:");
        bs2.paper();
    }
}
