package SingletonPattern;

public class Main {
    public static void main(String[] args) {

        Aclass aClass = new Aclass();
        Bclass bClass = new Bclass();

        if(aClass.getSocketClient().equals(bClass.getSocketClient())){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
