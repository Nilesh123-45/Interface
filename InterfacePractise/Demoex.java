package InterfacePractise;

interface Test {
//    private static void m() {
//        System.out.println("Hello");
//    }
private void m() {//Private instance methods inside interfaces can be used by default methods
    // because both operate on instance level
    System.out.println("Hello");
}

    public default void display(){
        m();
    }
}

class Demo implements Test {
    public void call() {
        //m();// we can not call this directly here
        display();
    }
}

public class Demoex {
    public static void main(String[] args) {
    Demo d=new Demo();
    d.call();
    //d.display();
    }
}
