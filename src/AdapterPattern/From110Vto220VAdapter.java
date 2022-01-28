package AdapterPattern;

public class From110Vto220VAdapter implements Electronic220V{
    private Electronic110V electronic110V;
    public From110Vto220VAdapter(Electronic110V electronic110V){
        this.electronic110V = electronic110V;
    }
    @Override
    public void connect() {
        electronic110V.powerOn();
    }

}
