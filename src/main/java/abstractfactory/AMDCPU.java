package abstractfactory;

/**
 * Created by lovywinsy on 12/21/16.
 */
public class AMDCPU implements CPU {
    @Override
    public void process() {
        System.out.println("AMD is processing...");
    }
}
