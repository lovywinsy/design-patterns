package edu.nwpu.rjwdz.Intepreter;

import edu.nwpu.rjwdz.interpreter.Context;
import edu.nwpu.rjwdz.interpreter.IExpression;
import edu.nwpu.rjwdz.interpreter.IntToWords;
import edu.nwpu.rjwdz.interpreter.StringToBinaryExp;
import org.junit.Test;

/**
 * Created by lovywinsy on 2017/2/6.
 */
public class InterpreterTest {
    @Test
    public void interpreterEx() {
        System.out.println("This is a interpreter pattern demo");
        Context context = new Context("121");
        IExpression expression = new IntToWords("233");
        expression.interpret(context);

        System.out.println();
        expression = new StringToBinaryExp("233");
        expression.interpret(context);
    }
}
