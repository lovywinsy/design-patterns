package edu.nwpu.rjwdz.strategy;

import org.junit.Test;

/**
 * Created by lovywinsy on 1/3/17.
 */
public class StrategyTest {
    @Test
    public void strategyEx() {
        System.out.println("This is a strategy pattern demo");
        Context context = new Context();
        IChoice ic1 = new FirstChoice();
        IChoice ic2 = new SecondChoice();

        context.setChoice(ic1);
        context.showChoice("1", "2");

        context.setChoice(ic2);
        context.showChoice("1", "2");
    }
}
