package edu.nwpu.rjwdz.strategy;

/**
 * Created by lovywinsy on 1/3/17.
 */
public class SecondChoice implements IChoice{
    public void myChoice(String s1, String s2) {
        System.out.println("You wanted to concatenate the numbers");
        System.out.println("The result of the addition is: " + s1 + s2);
    }
}
