package InterfacePractise;

interface Logger{
    default void logInfo(String msg){
//        format(msg);
//        System.out.println("Info : "+msg);
        System.out.println(format("Info : "+msg));
    }

     public static void logError(String msg){
//        format(msg);
//         System.out.println("Error : "+msg);
         System.out.println(format("Error : "+msg));
     }

//     private static void format(String msg){
//         System.out.println("[LOG]"+msg);
//     }

    private static String format(String name){
        return "[LOG]: "+name;
    }

}

class App implements Logger{
    public void display(){
        logInfo("hello");
        Logger.logError("LOG ERROR");
    }
}

public class Driver {
    public static void main(String[] args) {
    App e=new App();
    e.display();
    }
}
