package module.three;

import module.one.Utility;
import module.one.Status;
import module.two.ActionHandler;
import module.two.MyInterface;

public class Demo {
    public static void main(String[] args) {
        // Using Utility class from module.one
        System.out.println(Utility.getInfo());

        // Using enum from module.one
        Status status = Status.ACTIVE;
        System.out.println("Status: " + status);

        // Using ActionHandler from module.two
        MyInterface handler = new ActionHandler();
        System.out.println(handler.performAction());
    }
}