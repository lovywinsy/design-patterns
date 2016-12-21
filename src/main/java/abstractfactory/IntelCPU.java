package abstractfactory;

/**
 * Created by lovywinsy on 12/21/16.
 */
public class IntelCPU implements CPU {
    @Override
    public void process() {
        System.out.println("Intel is processing...");
    }
}
