package edu.nwpu.rjwdz.mediator;

import org.junit.Test;

/**
 * Created by lovywinsy on 1/17/17.
 */
public class MediatorTest {
    @Test
    public void mediatorEx() {
        System.out.println("This is a mediator pattern demo");
        ConcreteMediator m = new ConcreteMediator();

        FriendOne Amit = new FriendOne(m, "Amit");
        FriendTwo Sohel = new FriendTwo(m, "Sohel");
        Boss Raghu = new Boss(m, "Raghu");

        m.setFriendOne(Amit);
        m.setFriendTwo(Sohel);
        m.setBoss(Raghu);

        Amit.send("[Amit here]Good Morning. Can we discuss the mediator pattern");
        Sohel.send("[Sohel here]Good Morning. Yes, we can discuss now");
        Raghu.send("\n[Raghu here]Please go back to work quickly");
    }
}
