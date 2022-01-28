package Observer;

public class Button {
    private String name;
    private IButtonListener iButtonListener;
    public Button(String name){
        this.name = name;
    }
    public void click(String message){
        iButtonListener.clickEvent(message);
    }
    public void addListener(IButtonListener buttonListener){
        this.iButtonListener = buttonListener;
    }
}
