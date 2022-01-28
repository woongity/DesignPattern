package AdapterPattern;

public class AdapterMain {
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        Cleaner cleaner = new Cleaner();
        connect(hairDryer);
        Electronic110V adapter1 = new From220Vto110VAdapter(cleaner);
        adapter1.powerOn();
        AirConditioner airConditioner = new AirConditioner();

        Electronic220V adapter2 = new From110Vto220VAdapter(hairDryer);
        adapter2.connect();
    }
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
    public static void connect(Electronic220V electronic220V){
        electronic220V.connect();
    }
}
