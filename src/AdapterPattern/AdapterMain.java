package AdapterPattern;

public class AdapterMain {
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        //220v
        Cleaner cleaner = new Cleaner();
        connect(hairDryer);
        //110v로 바꾸어줌
        Electronic110V adapter1 = new From220Vto110VAdapter(cleaner);
        connect(adapter1);

        Electronic220V adapter2 = new From110Vto220VAdapter(hairDryer);
        connect(adapter2);
    }
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
    public static void connect(Electronic220V electronic220V){
        electronic220V.connect();
    }
}
