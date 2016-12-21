package abstractfactory;

/**
 * Created by lovywinsy on 12/21/16.
 */
public class AMDFactory implements CPUFactory {
    public CPU produceCPU() {
        return new AMDCPU();
    }
}
