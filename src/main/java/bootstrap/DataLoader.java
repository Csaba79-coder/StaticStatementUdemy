package bootstrap;

import controller.MultiplierStatic;
import model.StaticTest;

public class DataLoader {

    public void load() {
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        int answer = MultiplierStatic.multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + MultiplierStatic.multiplier);
    }
}
