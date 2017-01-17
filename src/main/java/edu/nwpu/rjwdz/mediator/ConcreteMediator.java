package edu.nwpu.rjwdz.mediator;

/**
 * Created by lovywinsy on 1/17/17.
 */
public class ConcreteMediator extends Mediator {
    private FriendOne one;
    private FriendTwo two;
    private Boss boss;

    public void setFriendOne(FriendOne one) {
        this.one = one;
    }

    public void setFriendTwo(FriendTwo two) {
        this.two = two;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    @Override
    public void send(Friend friend, String msg) {
        if (friend == one) {
            two.notify(msg);
            boss.notify(one.name + " sends message to " + two.name);
        }

        if (friend == two) {
            one.notify(msg);
            boss.notify(two.name + " sends message to " + one.name);
        }

        if (friend == boss) {
            one.notify(msg);
            two.notify(msg);
        }
    }
}
