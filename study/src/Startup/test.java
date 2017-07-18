package Startup;

public class test {
    static{
        System.out.println("static");
    }
    {
        System.out.println("brecets");
    }
    public test() {
        System.out.println("Test Constructor");
    }
    public static void main(String[] args){

        System.out.println("Main");
        new test();
    }
}
