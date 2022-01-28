package SingletonPattern;

public class Bclass {
    private SocketClient socketClient;
    public Bclass(){
        this.socketClient = SocketClient.getInstance();
    }
    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
