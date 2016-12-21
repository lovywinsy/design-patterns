package abstractfactory;

/**
 * Created by lovywinsy on 12/21/16.
 */
public class Computer {
    CPU cpu;

    public Computer(CPUFactory factory) {
        cpu = factory.produceCPU();
        cpu.process();
    }
}
