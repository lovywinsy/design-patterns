package edu.nwpu.rjwdz.interpreter;

/**
 * Created by lovywinsy on 2017/2/6.
 */
public class Context {
    public String input;

    public Context(String input) {
        this.input = input;
    }

    public void getBinaryForm(String input) {
        int i = Integer.parseInt(input);
        String binaryString = Integer.toBinaryString(i);
        System.out.print("Binary equivalent of " + input + " is " + binaryString);
    }

    public void printInWords(String input) {
        this.input = input;
        System.out.print("Printing the input in words:");
        char[] c = input.toCharArray();
        for (int i = 0; i < c.length; ++i) {
            switch (c[i]) {
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                case '0':
                    System.out.print("Ten");
                    break;
                default:
                    System.out.print("# ");
                    break;
            }
        }
    }
}
