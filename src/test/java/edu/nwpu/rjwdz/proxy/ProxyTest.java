package edu.nwpu.rjwdz.proxy;

import org.junit.Test;

/**
 * Created by lovywinsy on 12/27/16.
 */
public class ProxyTest {
    @Test
    public void proxyEx() {
        System.out.println("This is a proxy pattern demo");

        Proxy px = new Proxy();
        px.doSomeWork();
    }
}
