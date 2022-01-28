package AdapterPattern;

public class AdapterMain {
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        Cleaner cleaner = new Cleaner();
        connect(hairDryer);
        Electronic110V adapter = new SocketAdapter(cleaner);
        adapter.powerOn();
    }
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
