package model;

public class StaticTest {
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }

    public static void setNumInstances(int numInstances) {
        StaticTest.numInstances = numInstances;
    }

    public void setName(String name) {
        this.name = name;
    }
}
