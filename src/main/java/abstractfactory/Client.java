package abstractfactory;

/**
 * Created by lovywinsy on 12/21/16.
 */
public class Client {
    public static void main(String[] args) {
        new Computer(createSpecialFactory());
    }

    public static CPUFactory createSpecialFactory() {
        // based on specific requirement
        int sys = 0;
        if (sys == 0) {
            return new AMDFactory();
        }
        return new IntelFactory();
    }
}
