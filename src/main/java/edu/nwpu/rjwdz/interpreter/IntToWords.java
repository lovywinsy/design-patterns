package edu.nwpu.rjwdz.interpreter;

/**
 * Created by lovywinsy on 2017/2/6.
 */
public class IntToWords implements IExpression {
    private String s;

    public IntToWords(String s) {
        this.s = s;
    }

    @Override
    public void interpret(Context context) {
        context.printInWords(s);
    }
}
