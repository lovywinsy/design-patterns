package edu.nwpu.rjwdz.decorator;

/**
 * Created by lovywinsy on 12/27/16.
 */
public abstract class AbstractDecorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void doSomeWork() {
        if (null != component) {
            component.doSomeWork();
        }
    }
}
