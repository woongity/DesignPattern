package Observer;

public class ObserverMain {
    public static void main(String[] args) {
        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });
        button.click("메세지 전달 : click");
        button.click("메세지 전달 : click");
        button.click("메세지 전달 : click");
        button.click("메세지 전달 : click");
        button.click("메세지 전달 : click");
    }
}
