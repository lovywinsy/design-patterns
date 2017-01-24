package edu.nwpu.rjwdz.composite;

import org.junit.Test;

/**
 * Created by lovywinsy on 2017/1/22.
 */
public class compositeTest {
    @Test
    public void compositeEx() {
        System.out.println("This is a composite pattern demo");
        Teacher principle = new Teacher("1", "Principal");
        Teacher hodMaths = new Teacher("2", "Hod-Math");
        Teacher hodCompSc = new Teacher("3", "Hod-ComputerSc");

        Teacher math1 = new Teacher("4", "MathsTeacher");
        Teacher math2 = new Teacher("5", "MathsTeacher");

        Teacher cse1 = new Teacher("6", "CSETeacher");
        Teacher cse2 = new Teacher("7", "CSETeacher");
        Teacher cse3 = new Teacher("8", "CSETeacher");
    }
}
