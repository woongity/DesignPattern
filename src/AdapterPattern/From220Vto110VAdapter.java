package AdapterPattern;

public class From220Vto110VAdapter implements Electronic110V{
    private Electronic220V electronic220V;
    public From220Vto110VAdapter(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }
    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
